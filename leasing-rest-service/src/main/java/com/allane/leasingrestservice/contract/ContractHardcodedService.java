/**
 * 
 */
package com.allane.leasingrestservice.contract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author msakthi
 *
 */

@Service
public class ContractHardcodedService {
	
	private static List<Contract> contracts = new ArrayList<>();
	private static int idCounter = 123566;
	
	static {
		contracts.add(new Contract(++idCounter, "Max Mustermann", "BMW X3 (2022)", "X123456", "350,00E", "45.350,00E" ));
		contracts.add(new Contract(++idCounter, "Maria Musterfrau", "BMW 330i (2022)", "-", "365,00E", "47.350,00E" ));
	}
	
	public List<Contract> findAll() {
		return contracts;
	}

}


