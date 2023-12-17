package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import com.sky.service.UploadService;
import com.sky.vo.DishVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author almost
 * @date 2023/12/12 20:56
 */

@RestController
@RequestMapping("/admin/dish")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private UploadService uploadService;

    @PostMapping
    @ApiOperation("添加菜品")
    public Result save(@RequestBody DishDTO dishDTO){
        dishService.save(dishDTO);
        return Result.success();
    }

    @GetMapping("/page")
    @ApiOperation("查询分页列表")
    public Result getPage(DishPageQueryDTO dishPageQueryDTO){
        PageResult dishPage = dishService.getDishPage(dishPageQueryDTO);
        return Result.success(dishPage);
    }

    @DeleteMapping
    @ApiOperation("删除菜品")
    public Result deleteByid(@RequestParam List<Long> ids){
        dishService.deleteById(ids);
        return Result.success();
    }

    @GetMapping("/{id}")
    @ApiOperation("查询用户详情")
    public Result<DishVO> getDishById( @PathVariable Long id){
        DishVO dishVO = dishService.getDishById(id);
        return Result.success(dishVO);
    }

    @PutMapping
    @ApiOperation("修改菜品")
    public Result update(@RequestBody DishDTO dishDTO){
        dishService.update(dishDTO);
        return Result.success();
    }

    @PostMapping("/status/{status}")
    @ApiOperation("菜品起售停售")
    public Result updateStatus(@PathVariable Integer status,long id){
        dishService.updateStatus(status,id);
        return Result.success();
    }
}
