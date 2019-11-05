package net.socialNetwork;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	private ArticleService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Article> listArticles = service.listAll();
		model.addAttribute("listArticles", listArticles);
		return "index";
	}
}
