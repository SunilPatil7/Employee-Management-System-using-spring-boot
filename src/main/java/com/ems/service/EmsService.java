package com.ems.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.dao.EmsRepository;
import com.ems.models.empDetail;


@Service
public class EmsService {

	@Autowired
	private EmsRepository emsRepository;
	
	public Collection<empDetail> findAllEmpDetails(){
		List<empDetail> empdetails = new ArrayList<empDetail>();
		
		for (empDetail empdetail : emsRepository.findAll()) {
			
			empdetails.add(empdetail);
		}
		return empdetails;
	}
	
	public empDetail findOne(long e_id) {
		return emsRepository.findById(e_id).get();
	}
	
	public void delete(long e_id) {
		emsRepository.deleteById(e_id);
	}
	
	public void save(empDetail empdetail) {
		emsRepository.save(empdetail);
	}

}
