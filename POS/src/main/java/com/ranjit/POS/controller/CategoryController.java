package com.ranjit.POS.controller;

import com.ranjit.POS.dto.CategoryDto;
import com.ranjit.POS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @PostMapping(path = "/save")
    public String save(@RequestBody CategoryDto categoryDto){
        categoryService.addCategory(categoryDto);

    }



}
