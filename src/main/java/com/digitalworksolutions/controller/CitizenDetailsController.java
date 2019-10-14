package com.digitalworksolutions.controller;

import java.util.List;

import javax.validation.Valid;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digitalworksolutions.model.CitizenDetails;
import com.digitalworksolutions.model.CitizenRequest;
import com.digitalworksolutions.service.CitizenDetailsService;
import com.digitalworksolutions.util.CustomErrorType;

@RestController
public class CitizenDetailsController {

	//public static final Logger logger = LoggerFactory.getLogger(CitizenDetailsController.class);

	@Autowired
	CitizenDetailsService citizenDetailsService; //Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All Users---------------------------------------------
	@RequestMapping("/")
	public String welcome() {//Welcome page, non-rest
		return "Welcome to CitizenDetailsController RestTemplate Example.";
	}

	
	@RequestMapping(value = "/citizenList", method = RequestMethod.GET)
		public ResponseEntity<List<CitizenDetails>> listAllCitizenDetails() {
		List<CitizenDetails> citizenDetailsList = citizenDetailsService.findAllCitizenDetails();
		if (citizenDetailsList.isEmpty()) {
			return new ResponseEntity<List<CitizenDetails>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<CitizenDetails>>(citizenDetailsList, HttpStatus.OK);
	}

	
	
	// -------------------Retrieve Single citizen Details------------------------------------------

		@RequestMapping(value = "/citizendetails/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> getCitizenDetails(@PathVariable("id") long id ) {
			//logger.info("Fetching User with id {}", id);
			CitizenDetails  citizenDetails=null;
			
		
			  citizenDetails = citizenDetailsService.findById(id);
				if (citizenDetails== null) {
				//logger.error("citizenDetails with id {} not found.", id);
				return new ResponseEntity<CustomErrorType>(new CustomErrorType("404","citizen Details with id " + id), HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<CitizenDetails>(citizenDetails, HttpStatus.OK);
		}

	
	// -------------------Retrieve Single citizen Details------------------------------------------

	@RequestMapping(value = "/citizenfinder", method = RequestMethod.POST)
	public ResponseEntity<?> getCitizenFinder(@Valid @RequestBody CitizenRequest	citizenRequest) {
		System.out.println("endter in getCitizenFinder");
		//logger.info("Fetching User with id {}", id);
		CitizenDetails  citizenDetails=null;
		
		if (citizenRequest!= null) {
			System.out.println("endter in getCitizenFinder 1111");
		  citizenDetails = citizenDetailsService.findByNameEmailMoble(citizenRequest);
		  if(citizenDetails==null) {
			  return new ResponseEntity<CustomErrorType>(new CustomErrorType("404","citizen through Name Email Mobile "+ citizenRequest.getEmail()+citizenRequest.getMobile() 
				+ " not found"), HttpStatus.NOT_FOUND);
		  }
		  System.out.println("endter in getCitizenFinder 22222");
		}else{
			
			  System.out.println("endter in getCitizenFinder 333333");
			//logger.error("citizenDetails with id {} not found.", id);
			  return new ResponseEntity<CustomErrorType>(new CustomErrorType("404","citizen through Name Email Mobile" + " not found"), HttpStatus.NOT_FOUND);
		}
		  System.out.println("endter in getCitizenFinder 4444444");
		return new ResponseEntity<CitizenDetails>(citizenDetails, HttpStatus.OK);
	}

	

}