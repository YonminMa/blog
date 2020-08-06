package yonmin.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import yonmin.blog.domain.Tag;

public interface TagService {

    Tag saveTag(Tag Tag);

    Tag getTag(Long id);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag Tag);

    void deleteTag(Long id);
}
