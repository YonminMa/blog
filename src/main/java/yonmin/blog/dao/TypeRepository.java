package yonmin.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yonmin.blog.domain.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {


}
