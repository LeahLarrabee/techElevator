package com.techelevator;

import java.util.Map;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path="/actorList",method = RequestMethod.GET)
	public String showSearchActorForm() {

		return "actorList";
	}

	/* What about here? */
	@RequestMapping(path="/actorList",method = RequestMethod.POST)
	public String searchActors(@RequestParam String lastName, ModelMap modelMap /*need to put the text from jsp for input name value*/) {
		/* Call the model and pass values to the jsp */
		modelMap.put("actors",actorDao.getMatchingActors(lastName)); //key will tie to the jsp
		return "actorList";
	}
}
