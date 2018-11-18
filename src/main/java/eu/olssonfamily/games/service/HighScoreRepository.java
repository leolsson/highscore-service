package eu.olssonfamily.games.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface HighScoreRepository extends CrudRepository<HighScore, Long> {
public interface HighScoreRepository extends JpaRepository<HighScore, Long> {	
	
	List<HighScore>  findByName(String name);

}
