package com.example.ia.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ia.restapi.entity.Palindrome;

public interface PalindromeRepository extends JpaRepository<Palindrome, Long> {

}
