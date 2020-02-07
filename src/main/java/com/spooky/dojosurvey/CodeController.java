package com.spooky.dojosurvey;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("code", "Bushido");
		return "index.jsp";
	}
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code2, HttpSession session) {
		if(code2 != "Bushido") {
			return "code.jsp";
		}
		return "boo.jsp";
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        return "redirect:/";
	}
	
	}
