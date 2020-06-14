package com.khelomore.jwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khelomore.jwt.models.User;
import com.khelomore.jwt.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String mobilenumber) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(mobilenumber)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + mobilenumber));

		return UserDetailsImpl.build(user);
	}

}
