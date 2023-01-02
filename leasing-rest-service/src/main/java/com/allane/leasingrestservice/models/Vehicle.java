/**
 * 
 */
package com.allane.leasingrestservice.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

/**
 * @author msakthi
 *
 */

@Getter
@Setter
@Entity
public class Vehicle extends BaseModel {
	
	@Enumerated(EnumType.STRING)
	private Brand brand;
	
	private String model;
	
	private String modelYear;
	
	private Long vin;
	
	private BigDecimal price;

}
