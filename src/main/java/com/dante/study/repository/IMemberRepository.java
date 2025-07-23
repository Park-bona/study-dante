package com.dante.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dante.study.entity.Member;

@Repository
public interface IMemberRepository extends JpaRepository <Member, Integer>{

}
