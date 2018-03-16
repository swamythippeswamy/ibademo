package com.iba.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.iba.dao.LLIndicatorEntityDAO;
import com.iba.model.LLIndicator;
import com.iba.persistance.LLIndicatorEntity;
import com.iba.service.LLIndicatorService;

@Service
public class LLIndicatorServiceImpl implements LLIndicatorService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LLIndicatorServiceImpl.class);

	@Autowired
	private LLIndicatorEntityDAO llIndicatorEntityDAO;

	@Override
	public List<LLIndicator> getAllLLIndicators() {

		List<LLIndicator> llIndicatorList = new ArrayList<>();

		try {
			List<LLIndicatorEntity> list = llIndicatorEntityDAO.findAll();
			if (!CollectionUtils.isEmpty(list)) {
				for (LLIndicatorEntity entity : list) {
					LLIndicator llIndicator = new LLIndicator();
					adaptToLLIndicator(entity, llIndicator);
					llIndicatorList.add(llIndicator);
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error in fetching all LLIndicatos from db", e);
		}

		return llIndicatorList;
	}

	private void adaptToLLIndicator(LLIndicatorEntity entity, LLIndicator llIndicator) {
		llIndicator.setLlNumber(entity.getLlNumber());
		llIndicator.setLlName(entity.getLlName());
		llIndicator.setNumOneq(entity.getNumOneq());
		llIndicator.setNumTwoq(entity.getNumTwoq());
		llIndicator.setNumThreeq(entity.getNumThreeq());
		llIndicator.setNumFourq(entity.getNumFourq());
		llIndicator.setTotalOneq(entity.getTotalOneq());
		llIndicator.setTotalTwoq(entity.getTotalTwoq());
		llIndicator.setTotalThreeq(entity.getTotalThreeq());
		llIndicator.setTotalFourq(entity.getTotalFourq());
		llIndicator.setPerOneq(entity.getPerOneq());
		llIndicator.setPerTwoq(entity.getPerTwoq());
		llIndicator.setPerThreeq(entity.getPerThreeq());
		llIndicator.setPerFourq(entity.getPerFourq());
	}

}
