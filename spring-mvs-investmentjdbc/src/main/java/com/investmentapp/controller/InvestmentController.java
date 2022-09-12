package com.investmentapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.investmentapp.model.Investment;
import com.investmentapp.service.IInvestmentService;

@Controller
public class InvestmentController {

	@Autowired
	IInvestmentService investmentService;
	

   void addInvestment(Investment investment) {
		
    }
    void updateInvestment(Investment investment) {
	
    }
	
	void deleteInvestment(int planId) {
		
	}
	
	@GetMapping("/investments/risk/{risk}/term/{term}")
	List<Investment> getByRiskAndTerm(@PathVariable("risk") String risk,@PathVariable("term") int term){
		return investmentService.getByRiskAndTerm(risk, term);
		
	}
	@GetMapping("/investments/type/{type}")
	List<Investment> getByType(@PathVariable("type")String type){
		return investmentService.getByType(type);
		
	}
	@GetMapping("/investments/purpose/{purpose}")
	List<Investment> getByPurpose(@PathVariable("purpose")String purpose){
		return investmentService.getByType(purpose);
		
	}
	@GetMapping("/investments")
	List<Investment> getAll(){
		return investmentService.getAll();
		
	}
	@GetMapping("/investments/planId/{id}")
	Investment getById(@PathVariable("id")int planId){
		return investmentService.getById(planId);
		
	}
	
}
