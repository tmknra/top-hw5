package com.example.tophw5.controller;

import com.example.tophw5.entity.Restaurant;
import com.example.tophw5.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Resource
    private RestaurantService restaurantService;

    @GetMapping("/all")
    public List<Restaurant> getAll(){
        return restaurantService.getAll();
    }

    @GetMapping("/{name}")
    public String getDescription(@PathVariable String name){
        return restaurantService.getDescription(name);
    }

    @PutMapping("/new")
    public void addNewRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/change_description")
    public void changeDescription(@RequestBody Restaurant restaurant){
        restaurantService.changeRestaurantDescription(restaurant.getName(), restaurant.getDescription());
    }
}
