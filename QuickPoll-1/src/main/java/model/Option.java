package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "option_hoang")
public class Option {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OPTION_ID")
	private int id;
	@Column(name = "OPTION_VALUE")
	private String value;
// Getters and Setters omitted for brevity
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getValue() {
		return value;
	}
	void setValue(String value) {
		this.value = value;
	}
}