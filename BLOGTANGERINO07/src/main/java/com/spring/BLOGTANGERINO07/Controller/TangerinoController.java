package com.spring.BLOGTANGERINO07.Controller;

import com.spring.BLOGTANGERINO07.model.Post;
import com.spring.BLOGTANGERINO07.service.BlogtangerinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TangerinoController {

    final
    BlogtangerinoService blogtangerinoService;

    public TangerinoController(BlogtangerinoService blogtangerinoService) {
        this.blogtangerinoService = blogtangerinoService;
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){

        ModelAndView mv = new ModelAndView("post");

        return mv;



    }
}
