package rubikteam.kanban.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rubikteam.kanban.model.User;
import rubikteam.kanban.reponsitory.UserRepo;
import rubikteam.kanban.service.LoginService;
import rubikteam.kanban.service.Userimpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView model = new ModelAndView();
        User login = new User();
        model.addObject("loginForm", login);
        model.setViewName("login");
        return model;
    }

    @Autowired
    UserRepo loginRepository;
    @Autowired
    Userimpl userimpl;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("loginForm") User logins, HttpServletRequest request) {
        ModelAndView model = new ModelAndView();
        User login = new User();
        logins.setUsername(request.getParameter("username"));
        logins.setPass(request.getParameter("password"));
        //      List<User> login = loginService.getAccount2(logins.getUser(), logins.getPass());
        if ( userimpl.findUser(logins.getUsername(),logins.getPass())==1) {
            HttpSession session = request.getSession();
            session.setAttribute("user", logins.getUsername());
            //setting session to expiry in 30 mins
            model.addObject("hihi",logins.getUsername());

            return new ModelAndView("redirect:/home");
        } else {

            model.setViewName("login");
            return model;
        }
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home()
    {
        ModelAndView model = new ModelAndView();
        model.setViewName("Home");
        return model;
    }


}
