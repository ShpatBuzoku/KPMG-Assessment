package net.socialNetwork;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository repo;
	
	public List<Article> listAll(){
		
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
}
