package eu.olssonfamily.games.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.core.style.ToStringCreator;

@Entity
public class HighScore {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long score;

	protected HighScore() {
	};

	public HighScore(Long id, String name, Long score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public Long getScore() {
		return score;
	}

	public String toString() {
		return "Id : " + id + " Name: " + name + " Score: " + score;
	}
}
