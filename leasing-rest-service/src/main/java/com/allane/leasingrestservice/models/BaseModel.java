/**
 * 
 */
package com.allane.leasingrestservice.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * @author msakthi
 *
 */

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long Id;

	@CreatedDate
	protected Date createdDate;

	@LastModifiedDate
	protected Date lastModifiedDate;

}
