/**
 * 
 */
package com.allane.leasingrestservice.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * @author msakthi
 *
 */

@Getter
@Setter
@Entity
public class LeasingContract extends BaseModel {

	private Long contractNumber;

	private BigDecimal monthlyRate;

	@OneToOne
	private Vehicle vehicle;

	@ManyToOne
	private Customer customer;

}
