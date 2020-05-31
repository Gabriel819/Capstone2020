package com.example.membertest.category;

import java.util.List;

import com.example.membertest.category.Category;
import com.example.membertest.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/category")
    public List CategoryList(){
        System.out.println("Category Connect Succeed.");
        List<Category> list = categoryRepository.findAll();

        for (int i=0 ; i < list.size();i++) {
            System.out.println(i);
            System.out.println("category_idx : " + list.get(i).getCategory_idx()
                    +"\ncategory_name : " + list.get(i).getCategory_name());
        }

        return list;
    }

}