package com.company.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

	RefreshToken findByUserId(Long userId);
	
}
