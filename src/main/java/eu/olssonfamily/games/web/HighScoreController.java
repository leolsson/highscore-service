package eu.olssonfamily.games.web;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.olssonfamily.games.service.HighScore;
import eu.olssonfamily.games.service.HighScoreRepository;

@RestController
public class HighScoreController {

	@Autowired
	HighScoreRepository repository;

	@RequestMapping("/highscore")
	public List<Map.Entry<String,Long>> highscore() {
		List<Map.Entry<String,Long>> scoreList = new ArrayList<>();
		
		for (HighScore playerScore : repository.findAll().stream().sorted( (a,b) -> b.getScore().compareTo(a.getScore())).collect(Collectors.toList())) {
			 scoreList.add(new AbstractMap.SimpleEntry<String,Long>(playerScore.getName(), playerScore.getScore()));
		}

		return scoreList;
	}

}
