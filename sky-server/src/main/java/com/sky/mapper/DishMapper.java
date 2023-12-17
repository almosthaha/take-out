package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author almost
 * @date 2023/12/12 21:03
 */

@Mapper
public interface DishMapper {

    @AutoFill(value = OperationType.INSERT)
    void save(Dish dish);

    Page<DishVO> getDishPage(DishPageQueryDTO dishPageQueryDTO);

    void deleteByid(long id);

    Dish getById(long id);

    List<DishFlavor> getDIshById(Long id);

    @AutoFill(value=OperationType.UPDATE)
    void updateDish(Dish dish);
}
