package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "VOTE_ID")
	private int id;
	@ManyToOne
	@JoinColumn(name = "OPTION_ID")
	private Option option;
// Getters and Setters omitted for brevity
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected Option getOption() {
		return option;
	}
	protected void setOption(Option option) {
		this.option = option;
	}
}