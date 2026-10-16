package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.exam.entity.Print;

public interface PrintRepository extends JpaRepository<Print, Long> {

}
