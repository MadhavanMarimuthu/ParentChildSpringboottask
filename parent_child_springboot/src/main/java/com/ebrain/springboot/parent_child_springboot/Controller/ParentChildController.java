package com.ebrain.springboot.parent_child_springboot.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebrain.springboot.parent_child_springboot.Entity.CustomerEntity;
import com.ebrain.springboot.parent_child_springboot.Service.ParentChildService;

@RestController
@RequestMapping("/CustomerController")
public class ParentChildController {

	@Autowired
	public ParentChildService parentChildService;

	@GetMapping(value = "/get")
	private String get() {
		return "madhavan";
	}

	@PostMapping(value = "/post")
	private String Customer(@RequestBody CustomerEntity customerEntity) {
//
//		if (parentChildService.findByName(customerEntity.getName()) != null) {
//			return "this name already exits...";
//		}
		parentChildService.save(customerEntity);
		return null;

	}

	
	@PutMapping(value = "/update")
		
		public String updateCustomer(@RequestBody CustomerEntity customerEntity) {
		    String name = customerEntity.getName();
		    UUID id = customerEntity.getId();
		    CustomerEntity existingCustomer = parentChildService.findByName(name);
		    if (existingCustomer != null && !existingCustomer.getId().equals(id)) {
		        return "This name already exists.";
		    }
		    
		    if (name.equals(id.toString())) {
		        return "Update successfully";
		    }
		    
		    parentChildService.update(customerEntity);
		    return "Customer updated successfully.";
		}
		    
		  
		@DeleteMapping(value = "/Delete/{id}")
		private UUID Deletebyid(@PathVariable UUID id)
		{
			parentChildService.Deletebyid(id);

			return id;	 
		}	

}

//
// @PostMapping(value = "/post")
// private String Customer(@RequestBody CustomerEntity customerEntity) throws
// Exception
// {
//
//		if(customerService.findByName(customerEntity.getName(),customerEntity.getId()) !=null) {
//			return "this name already exits..." ;
//		}
//
// customerService.save(customerEntity);
// return null;
//
// }
