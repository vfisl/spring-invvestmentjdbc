package com.investmentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investmentapp.exceptions.PlanNotFoundException;
import com.investmentapp.model.Investment;
import com.investmentapp.repository.IInvestmentRepository;
@Service
public class InvestmentServiceImpl implements IInvestmentService {

	private IInvestmentRepository investmentRepository;
	
	@Autowired
	public InvestmentServiceImpl(IInvestmentRepository investmentRepository) {
		super();
		this.investmentRepository = investmentRepository;
	}

	@Override
	public void addInvestment(Investment investment) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateInvestment(Investment investment) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteInvestment(int planId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Investment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Investment getById(int planId) throws PlanNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Investment> getByRiskAndTerm(String risk, int term) {

		return investmentRepository.findByRiskAndTerm(risk, term);
	}

	@Override
	public List<Investment> getByType(String type) {
		return investmentRepository.findByType(type);
	}

	@Override
	public List<Investment> getByPurpose(String purpose) {
		return investmentRepository.findByPurpose(purpose);
	}

	

	@Override
	public double calculateMaturity(Investment investment) {
		// TODO Auto-generated method stub
		return 0;
	}



	

	
}
