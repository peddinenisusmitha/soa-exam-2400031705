package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.Print;
import com.klef.soa.exam.service.PrintService;

@RestController
@RequestMapping("/printing")
public class PrintingController 
{
	@Autowired
	private PrintService service;
	@GetMapping("/")
	public String home() {
		return "Print Service Project";
	}
	@PostMapping("/add")
	public ResponseEntity<Print> addPrint(@RequestBody Print p)
	{
		return new ResponseEntity<>(service.addPrint(p),HttpStatus.CREATED);
	}
	@GetMapping("/displayall")
	public ResponseEntity<List<Print>> displayAll()
	{
		return  ResponseEntity.ok(service.displayAll());
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePrintById(@PathVariable Long id)
	{
		service.deleteById(id);

        return ResponseEntity.ok("Print deleted successfully.");
	}
	
	

}
