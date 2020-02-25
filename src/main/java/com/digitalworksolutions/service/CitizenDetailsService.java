package com.digitalworksolutions.service;


import java.util.List;

import com.digitalworksolutions.model.CitizenDetails;
import com.digitalworksolutions.model.CitizenRequest;

public interface CitizenDetailsService {
	
	CitizenDetails findById(long id);
	
	CitizenDetails findByNameEmailMoble(CitizenRequest	citizenRequest);
	
	void saveCitizenDetails(CitizenDetails user);
	
	void updateCitizenDetails(CitizenDetails user);
	
	void deleteUserById(long id);

	List<CitizenDetails> findAllCitizenDetails();
	
	
	boolean isCitizenDetailsExist(CitizenDetails user);
	
}
