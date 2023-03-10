/**
 * 
 */
package com.allane.leasingrestservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.leasingrestservice.contract.Contract;
import com.allane.leasingrestservice.contract.ContractHardcodedService;

/**
 * @author msakthi
 *
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ContractResource {
	
	@Autowired
	private ContractHardcodedService contractService;
	
	@GetMapping("/leasing/contracts")
	public List<Contract> getAllContracts(){
		return contractService.findAll();
		
	}

}
