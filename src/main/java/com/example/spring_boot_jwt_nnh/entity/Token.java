package com.example.spring_boot_jwt_nnh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity {
	@Column(length = 1000)
	private String token;

	private Date tokenExpDate;
}
