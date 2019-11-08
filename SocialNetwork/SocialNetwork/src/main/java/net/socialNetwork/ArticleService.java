package net.socialNetwork;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository repo;

	public List<Article> listAll() {

		return repo.findAll();
	}

	public void save(Article article) {
		repo.save(article);
	}

	public Article get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public void like(int id) {
		repo.likeArticle(id);
	}

	public void dislike(int id) {
		repo.dislikeArticle(id);
	}

	public Article mostLiked() {

		Article article = new Article();

		for (Article a : repo.findAll()) {
			if (article.getLikes() < a.getLikes())
				article = a;
		}

		return article;
	}
}
