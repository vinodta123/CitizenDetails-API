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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
	
@RestController
@RequestMapping("/citizendetailapi")
@Api(value="citisen Details Store")
public class CitizenDetailsController {

	// public static final Logger logger =
	// LoggerFactory.getLogger(CitizenDetailsController.class);

	@Autowired
	CitizenDetailsService citizenDetailsService; // Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All
	// Users---------------------------------------------
	//@RequestMapping("/")
	//public String welcome() {// Welcome page, non-rest
	//return "Welcome to Citizen Details Controller.";
	//}

	@ApiOperation(value = "View a list of Citizen Details", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CitizenDetails>> listAllCitizenDetails() {
		List<CitizenDetails> citizenDetailsList = citizenDetailsService.findAllCitizenDetails();
		if (citizenDetailsList.isEmpty()) {
			return new ResponseEntity<List<CitizenDetails>>(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<CitizenDetails>>(citizenDetailsList, HttpStatus.OK);
	}

	// -------------------Retrieve Single citizen
	// Details------------------------------------------
	
	@ApiOperation(value = "Search a citisen by ID",response = ResponseEntity.class)
	@RequestMapping(value = "/detail/{id}", method= RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getCitizenDetails(@PathVariable("id") long id) {
		// logger.info("Fetching User with id {}", id);
		CitizenDetails citizenDetails = null;

		citizenDetails = citizenDetailsService.findById(id);
		if (citizenDetails == null) {
			// logger.error("citizenDetails with id {} not found.", id);
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("404", "citizen Details with id " + id),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CitizenDetails>(citizenDetails, HttpStatus.OK);
	}

	// -------------------Retrieve Single citizen
	// Details------------------------------------------

	@ApiOperation(value = "find citizen by mobile nuber")
    @RequestMapping(value = "/finder", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> getCitizenFinder(@Valid @RequestBody CitizenRequest citizenRequest) {
		CitizenDetails citizenDetails = null;

		if (citizenRequest != null) {
			citizenDetails = citizenDetailsService.findByNameEmailMoble(citizenRequest);
			if (citizenDetails == null) {
				return new ResponseEntity<CustomErrorType>(
						new CustomErrorType("404", "citizen through Name Email Mobile " + citizenRequest.getEmail()
								+ citizenRequest.getMobile() + " not found"),
						HttpStatus.NOT_FOUND);
			}
		} else {
			// logger.error("citizenDetails with id {} not found.", id);
			return new ResponseEntity<CustomErrorType>(
					new CustomErrorType("404", "citizen through Name Email Mobile" + " not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CitizenDetails>(citizenDetails, HttpStatus.OK);
	}

}