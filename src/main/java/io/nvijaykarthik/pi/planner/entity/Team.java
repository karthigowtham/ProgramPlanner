package io.nvijaykarthik.pi.planner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue
	Long id;
	@Column
	String name;
	@Column
	Long portfolioId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	
}