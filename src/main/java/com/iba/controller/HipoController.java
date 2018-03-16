package com.iba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.model.Hipo;
import com.iba.service.HipoSerice;

@RestController
public class HipoController {

	@Autowired
	private HipoSerice hipoSerice;

	@RequestMapping("/getHipo")
	public List<Hipo> getHipo() {
		return hipoSerice.getAllHipo();
	}
}
