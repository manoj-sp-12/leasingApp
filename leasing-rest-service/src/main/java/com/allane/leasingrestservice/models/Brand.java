/**
 * 
 */
package com.allane.leasingrestservice.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author msakthi
 *
 */

public enum Brand {

	// @formatter:off
	
	BMW("X2", "X3", "X4"), 
	BENZ("C-Klasse", "D-Klasse", "E-Klasse"), 
	VOLVO("V69", "S60", "XC60"),
	VOLKSWAGEN("Atlas", "Tiguan", "Jetta");
	
	// @formatter:on

	private final List<String> models;

	public List<String> getModels() {
		return new ArrayList<String>(models);
	}

	private Brand(String... models) {
		this.models = Arrays.asList(models);
	}
}
