package yonmin.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import yonmin.blog.domain.Blog;
import yonmin.blog.vo.BlogQuery;

public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
