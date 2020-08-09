package yonmin.blog.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import yonmin.blog.domain.Tag;
import yonmin.blog.service.TagService;
import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/tags")
    public String tags(@PageableDefault(size = 10,sort = {"id"},direction = Sort.Direction.DESC)
                        Pageable pageable, Model model){

        model.addAttribute("page", tagService.listTag(pageable));
        return "/admin/tags";
    }

    @GetMapping("/tags/input")
    public String input(){
        return "/admin/tags-input";
    }

    // 打开修改页
    @GetMapping("/tags/{id}/edit")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("tag", tagService.getTag(id));
        return "/admin/tags-input";
    }

    // 删除
    @GetMapping("tags/{id}/delete")
    public String delete(@PathVariable Long id){
        try {
            tagService.deleteTag(id);
        } catch (Exception e){

        }
        return "redirect:/admin/tags";
    }

    @PostMapping("/tags")
    public String post(@Valid Tag tag, BindingResult result){
        if (result.hasErrors()){
            return "/admin/tags";
        }
        Tag t = tagService.saveTag(tag);

        return "redirect:/admin/tags";
    }

}
