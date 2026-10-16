package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.Print;


public interface PrintService
{
	Print addPrint(Print p);
	List<Print> displayAll();
	void deleteById(Long id);
	

	
}
