package com.coderovers.makesurvey.domain;

import java.util.List;

import javax.persistence.Entity;

/**
* @author Krishna Bhat
*
*/

@Entity
public class Choice extends Question {

	private static final long serialVersionUID = 5466423746357378325L;
	
	List<Option> options;
}
