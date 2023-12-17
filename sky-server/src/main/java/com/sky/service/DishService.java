package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * @author almost
 * @date 2023/12/12 21:01
 */
public interface DishService {

    void save(DishDTO dishDTO);

    PageResult getDishPage(DishPageQueryDTO dishPageQueryDTO);

    void deleteById(List<Long> ids);

    DishVO getDishById(Long id);

    void update(DishDTO dishDTO);

    void updateStatus(Integer status, long id);
}
