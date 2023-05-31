package com.ebrain.springboot.parent_child_springboot.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebrain.springboot.parent_child_springboot.Entity.CustomerEntity;
import com.ebrain.springboot.parent_child_springboot.Repository.ParentChildRepository;



@Service
public class ParentChildService {
		@Autowired
		public ParentChildRepository parentChildRepository;
		 
		
		
	   public void save( CustomerEntity customerEntity) {
		 
			
		   parentChildRepository.save(customerEntity);
		  
		
		   }
		
		public CustomerEntity findByName(String name) {
			
			return parentChildRepository.findByName(name);
		}

		public  CustomerEntity update(CustomerEntity customerEntity) {
		
	        	return parentChildRepository.save(customerEntity);
	       
			
			
		}
		

		public void Deletebyid(UUID id) {
			
			parentChildRepository.deleteById(id);
		}

		public boolean findBy(boolean b) {
		
			return false;
		}
		
		   
		
	}








	//public CustomerEntity findByName(String name, UUID id) {
	//	
//		return customerRepository.findByNameAndId(name,id);
	//}
	//

