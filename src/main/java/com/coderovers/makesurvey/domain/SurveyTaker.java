package com.coderovers.makesurvey.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Manish Karki
 * 
 */
@Entity
@DiscriminatorValue("Survey_Taker")
public class SurveyTaker extends User {


	private static final long serialVersionUID = 1L;

}
