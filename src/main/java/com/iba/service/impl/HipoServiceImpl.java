package com.iba.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iba.dao.HipoEntityDAO;
import com.iba.model.Hipo;
import com.iba.persistance.HipoEntity;
import com.iba.service.HipoSerice;

@Service
public class HipoServiceImpl implements HipoSerice {

	private static final Logger LOGGER = LoggerFactory.getLogger(HipoServiceImpl.class);

	@Autowired
	@Qualifier("hipoEntityDao")
	private HipoEntityDAO hipoEntityDAO;

	@Override
	public List<Hipo> getAllHipo() {

		List<Hipo> hipoList = new ArrayList<>();

		try {
			Iterable<HipoEntity> list = hipoEntityDAO.findAll();
			Iterator<HipoEntity> iterator = list.iterator();
			while (iterator.hasNext()) {
				Hipo hipo = new Hipo();
				adaptToHipo(iterator.next(), hipo);
				hipoList.add(hipo);
			}
		} catch (Exception e) {
			LOGGER.error("Error in fetching all Hipo from db", e);
		}

		return hipoList;
	}

	private void adaptToHipo(HipoEntity hipoEntity, Hipo hipo) {
		hipo.setIncidentNumber(hipoEntity.getIncidentNumber());
		hipo.setSite(hipoEntity.getSite());
		hipo.setDepartment(hipoEntity.getDepartment());
		hipo.setDiscipline(hipoEntity.getDiscipline());
		hipo.setDate(hipoEntity.getDate());
		hipo.setTime(hipoEntity.getTime());
		hipo.setIncidentDescription(hipoEntity.getIncidentDescription());
		hipo.setIncidentData(hipoEntity.getIncidentData());
		hipo.setDaysInMonth(hipoEntity.getDaysInMonth());
		hipo.setCoreStaffHours(hipoEntity.getCoreStaffHours());
		hipo.setOverTimeHours(hipoEntity.getOverTimeHours());
		hipo.setActionPlan(hipoEntity.getActionPlan());
		hipo.setHipo(hipoEntity.getHipo());
		hipo.setBodyInjured(hipoEntity.getBodyInjured());
		hipo.setEnvironmental(hipoEntity.getEnvironmental());
		hipo.setOccupational(hipoEntity.getOccupational());
	}

}
