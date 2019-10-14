package com.digitalworksolutions.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.digitalworksolutions.model.CitizenAddress;
import com.digitalworksolutions.model.CitizenDetails;
import com.digitalworksolutions.model.CitizenRequest;



@Service("citizenDetailsService")
public class CitizenDetailsServiceImpl implements CitizenDetailsService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<CitizenDetails> citizenDetailsLists;
	
	static{
		citizenDetailsLists= populateDummyUsers();
	}

	public List<CitizenDetails> findAllCitizenDetails() {
		return citizenDetailsLists;
	}
	
	public CitizenDetails findById(long id) {
		for(CitizenDetails citizenDetailsL : citizenDetailsLists){
			if(citizenDetailsL.getId() == id){
				return citizenDetailsL;
			}
		}
		return null;
	}
	
	public CitizenDetails findByNameEmailMoble(CitizenRequest	citizenRequest) {
		for(CitizenDetails citizenDetailsL : citizenDetailsLists){
			if(citizenDetailsL.getEmail().equalsIgnoreCase(citizenRequest.getEmail()) && citizenDetailsL.getMobile().equalsIgnoreCase(citizenRequest.getMobile())){
				return citizenDetailsL;
			}
		}
		return null;
	}
	
	public void saveCitizenDetails(CitizenDetails citizenDetailsL) {
		citizenDetailsL.setId(counter.incrementAndGet());
		citizenDetailsLists.add(citizenDetailsL);
	}

	/***
	 * 
	 */
	public void updateCitizenDetails(CitizenDetails citizenDetailsL) {
		int index = citizenDetailsLists.indexOf(citizenDetailsL);
		citizenDetailsLists.set(index, citizenDetailsL);
	}

	/***
	 * 
	 */
	public void deleteUserById(long id) {
		
		for (Iterator<CitizenDetails> iterator = citizenDetailsLists.iterator(); iterator.hasNext(); ) {
			CitizenDetails citizenDetailsL = iterator.next();
		    if (citizenDetailsL.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	/***
	 * 
	 */
	public boolean isCitizenDetailsExist(CitizenDetails user) {
		return findById(user.getId())!=null;
	}
	
	
	/**
	 * 
	 * @return
	 */
	private static List<CitizenDetails> populateDummyUsers(){
		List<CitizenDetails> citizenDetailsList = new ArrayList<CitizenDetails>();

		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Vinod", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Vinod@yahoo.com", "09877768851","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Tanvi", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Tanvi@yahoo.com", "09877768852","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Aayushi", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Aayushi@yahoo.com", "09877768853","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Aarav", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Aarav@yahoo.com", "09877768854","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Dinesh", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Dinesh@yahoo.com", "09877768855","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Varsha", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Varsha@yahoo.com", "09877768856","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Dhruv", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Dhruv@yahoo.com", "09877768857","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Mohan", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Mohan@yahoo.com", "09877768858","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Bhagwati", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Bhagwati@yahoo.com", "09877768859","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Anita", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Anita@yahoo.com", "09877768860","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Anitauii", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Anitauii@yahoo.com", "09877768862","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		citizenDetailsList.add(new CitizenDetails(counter.incrementAndGet(), "Raj", "Sharma", "30-04-1980", "NA", "No photo", 
				"Male", "5011", "Active","Single", "Raj@yahoo.com", "09877768863","", 40, new CitizenAddress("123/90,springfiled","Faridabd", "Haryan", "India", "40")));
		
		return citizenDetailsList;
	}

}
