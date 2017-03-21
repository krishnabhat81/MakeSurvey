package com.coderovers.makesurvey.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

/**
 * @author Krishna Bhat
 *
 */

/*
 * This is QuestionComposite for composite design pattern (QuestionSet,
 * Question, QuestionComposite)
 */

@Entity
public class QuestionComposite extends QuestionSet {

	private static final long serialVersionUID = -787037490777771569L;
	
	List<QuestionSet> questionSet = new ArrayList<QuestionSet>();
	
}
