package net.socialNetwork;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value ="UPDATE articledatabase.article a SET a.Likes = a.Likes+1 WHERE (a.id = :id)", nativeQuery=true)
	public void likeArticle(@Param("id") int id);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value ="UPDATE articledatabase.article a SET a.Likes = a.Likes-1 WHERE (a.id = :id)", nativeQuery=true)
	public void dislikeArticle(@Param("id") int id);
}
