package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Print;
import com.klef.soa.exam.repository.PrintRepository;

@Service
public class PrintServiceImpl implements PrintService 
{
	@Autowired
	private PrintRepository repo;

	@Override
	public Print addPrint(Print p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Print> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		
	}
	
	

}
