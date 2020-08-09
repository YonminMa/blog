package yonmin.blog.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import yonmin.blog.domain.Blog;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

    @Query("select b from Blog b where b.recommend = true")
    List<Blog> findTop(Pageable pageable);

    @Query("select function('date_format', b.createTime, '%Y') as year from Blog b group by function('date_format', b.createTime, '%Y') order by year desc ")
    List<String> findGroupYear();

    @Query("select b from Blog b where function('date_format', b.createTime, '%Y') = ?1")
    List<Blog> findByYear(String year);
}
