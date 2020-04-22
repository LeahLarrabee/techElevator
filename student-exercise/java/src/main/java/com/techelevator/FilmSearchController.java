package com.techelevator;

import com.techelevator.dao.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    @RequestMapping(path="/filmList", method = RequestMethod.GET)
    public String showFilmSearchForm() {

        return "filmList";
    }

    @RequestMapping (path="/filmList", method = RequestMethod.POST)
    public String searchFilms(@RequestParam(value="minLength", defaultValue = "0") Integer minLength,
                              @RequestParam(value ="maxLength",defaultValue = "10000") Integer maxLength,
                              @RequestParam String genre, ModelMap modelMap) {


        modelMap.put("films", filmDao.getFilmsBetween(genre,minLength,maxLength));

        return "filmList";
    }

}