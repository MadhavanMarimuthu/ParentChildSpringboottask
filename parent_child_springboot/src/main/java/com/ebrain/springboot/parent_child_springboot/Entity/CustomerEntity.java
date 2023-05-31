package com.ebrain.springboot.parent_child_springboot.Entity;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_customer_task")
public class CustomerEntity {
		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
		@Type(type = "uuid-char")
		@Column(name = "id", updatable = false, nullable = false)
		private UUID id;

		@Column(name = "name")
		private String name;

		@Column(name = "phoneno")
		private String phoneno;

		@Column(name = "customercode")
		private String customercode;
		
		
		
		@JsonManagedReference
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
		List<CustomerAddressEntity> obj; 
		

	}



