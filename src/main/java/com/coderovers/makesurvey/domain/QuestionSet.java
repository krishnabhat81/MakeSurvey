package com.coderovers.makesurvey.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Krishna Bhat
 *
 */

/*
 * This is QuestionSet for composite design pattern (QuestionSet, Question,
 * QuestionComposite)
 */

@Entity
public class QuestionSet implements Serializable {
	
	private static final long serialVersionUID = 4919794149950624062L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title; // Survey title

	public QuestionSet() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
