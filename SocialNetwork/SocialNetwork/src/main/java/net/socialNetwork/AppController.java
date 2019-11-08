package net.socialNetwork;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private ArticleService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {

		EmployeePageModel pageModel = new EmployeePageModel();

		pageModel.listArticles = service.listAll();
		pageModel.mostLiked = service.mostLiked();

		model.addAttribute("pageModel", pageModel);
		return "index";
	}

	@RequestMapping("/employee")
	public String viewEmployeeHomePage(Model model) {

		EmployeePageModel pageModel = new EmployeePageModel();

		pageModel.listArticles = service.listAll();
		pageModel.mostLiked = service.mostLiked();

		model.addAttribute("pageModel", pageModel);
		return "employee";
	}

	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Article article = new Article();
		model.addAttribute("article", article);
		return "new_article";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveArticle(@ModelAttribute("article") Article article) {
		service.save(article);

		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditArticleForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_article");

		Article article = service.get(id);
		mav.addObject("article", article);
		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteArticle(@PathVariable(name = "id") int id) {
		service.delete(id);

		return "redirect:/";
	}

	@RequestMapping("/like/{id}")
	public String likeArticle(@PathVariable(name = "id") int id) {
		service.like(id);
		return "redirect:/employee";
	}

	@RequestMapping("/dislike/{id}")
	public String dislikeArticle(@PathVariable(name = "id") int id) {
		service.dislike(id);
		return "redirect:/employee";
	}

	@RequestMapping("/log")
	public String showLogForm(Model model) {

		return "login";
	}

	@RequestMapping("/dummy")
	public String showDummyPage(Model model) {

		return "dummy_page";
	}

}
