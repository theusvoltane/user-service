package com.matheusvoltane;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.wildfly.common.annotation.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name= "\"User\"")
public class User extends PanacheEntity{
	
	@NotNull
	@Column
	public String name;
	
}
