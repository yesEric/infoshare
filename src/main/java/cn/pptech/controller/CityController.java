package cn.pptech.controller;

import cn.pptech.domain.City;
import cn.pptech.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/city")
public class CityController {
    private static Logger logger=LoggerFactory.getLogger(CityController.class);
    @Autowired
    CityService cityService;

    @RequestMapping("/index")
    public ModelAndView index(){
        City city=cityService.findOne(1l);
        System.out.println(city.getName());
        return new ModelAndView("city/index");
    }
}
