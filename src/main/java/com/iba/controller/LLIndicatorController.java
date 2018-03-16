package com.iba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.model.LLIndicator;
import com.iba.service.LLIndicatorService;

@RestController
public class LLIndicatorController {

	@Autowired
	private LLIndicatorService llIndicatorService;

	@RequestMapping("/getllIndicators")
	public List<LLIndicator> getLLIndicators() {
		return llIndicatorService.getAllLLIndicators();
	}
}
