package com.spooky.dojosurvey;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String code(@RequestParam(value="name") String name,@RequestParam(value="location") String location,@RequestParam(value="language") String language,@RequestParam(value="comments") String comments, HttpSession session, Model model) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comments", comments);
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comments", comments);
		
		return "redirect:/info";
	}
	@RequestMapping("/info")
	public String info(HttpSession session, Model model) {
		model.getAttribute("name");
		model.getAttribute("location");
		model.getAttribute("language");
		model.getAttribute("comments");
		return "code.jsp";
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        return "redirect:/";
	}
	
	}
