package yonmin.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import yonmin.blog.domain.Tag;

import java.util.List;

public interface TagService {

    Tag saveTag(Tag Tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    Tag updateTag(Long id, Tag Tag);

    void deleteTag(Long id);
}
