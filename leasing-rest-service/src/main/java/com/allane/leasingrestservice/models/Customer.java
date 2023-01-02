/**
 * 
 */
package com.allane.leasingrestservice.models;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author msakthi
 *
 */

@Getter
@Setter
@Entity
public class Customer extends BaseModel {

	private String firstName;
	
	private String lastName;
	
	private Date birthDate;
}
