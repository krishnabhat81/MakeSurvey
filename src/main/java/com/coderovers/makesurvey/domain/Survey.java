package com.coderovers.makesurvey.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;

/**
 * @author Manish Karki cmd + shift + o
 */
@Entity
public class Survey implements Serializable {
	
	private static final long serialVersionUID = -4937866292277419840L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date added_date;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date expiry_date;
	private boolean visibility;

	Survey() {}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((added_date == null) ? 0 : added_date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((expiry_date == null) ? 0 : expiry_date.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + (visibility ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		if (added_date == null) {
			if (other.added_date != null)
				return false;
		} else if (!added_date.equals(other.added_date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (expiry_date == null) {
			if (other.expiry_date != null)
				return false;
		} else if (!expiry_date.equals(other.expiry_date))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (visibility != other.visibility)
			return false;
		return true;
	}
	
}
