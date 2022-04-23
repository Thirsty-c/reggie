package com.itheima.reggie.controller;

import com.itheima.reggie.service.DishFlavorService;
import com.itheima.reggie.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜品管理
 */
@RestController
@RequestMapping("/dish")
public class DishFlavor {

    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;
}
