package com.ebrain.springboot.parent_child_springboot.Entity;


import java.util.UUID;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_customer_address_task")
public class CustomerAddressEntity {
		
			@Id
			@GeneratedValue(generator = "UUID")
			@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
			@Type(type = "uuid-char")
			@Column(name = "id", updatable = false, nullable = false)
			private UUID id;
			
			@Type(type = "uuid-char")
			@Column(name = "customer_id")
			private UUID customer_id;
			
			@Column(name = "addresstype")
			private String addresstype;
			
			@Column(name = "city")
			private String city;
			
		@JsonBackReference
		@ManyToOne
		@JoinColumn(name = "customer_id", nullable = false ,insertable = false ,updatable = false)
		private CustomerEntity customer;

	


}
