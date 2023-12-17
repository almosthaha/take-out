package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

/**
 * @author almost
 * @date 2023/12/10 13:27
 */
public interface CategoryService {

    void save(CategoryDTO categoryDTO);

    PageResult getPageQueryByCate(CategoryPageQueryDTO categoryPageQueryDTO);

    void deleteById(Long id);

    void update(CategoryDTO categoryDTO);

    void updateStatus(Long id,Integer status);

    List<Category> getList();
}
