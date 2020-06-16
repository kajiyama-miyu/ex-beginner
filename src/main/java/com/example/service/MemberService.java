package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Service
public class MemberService {

	
	@Autowired
	private MemberRepository repository;
	
	
	List<Member> findByName(String name){
		return repository.findByName(name);
	}
}
