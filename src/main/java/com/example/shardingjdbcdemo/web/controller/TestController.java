package com.example.shardingjdbcdemo.web.controller;

import com.example.shardingjdbcdemo.domain.entity.OrgInfoEntity;
import com.example.shardingjdbcdemo.domain.entity.UsersEntity;
import com.example.shardingjdbcdemo.domain.repo.OrgInfoEntityRepo;
import com.example.shardingjdbcdemo.domain.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: dsy
 * @date: 2022/6/23 18:28
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    UsersRepo usersRepo;


    @GetMapping("/add")
    public String addUser(@RequestParam String username){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName(username);
        usersRepo.save(usersEntity);
        return "success";
    }

    @GetMapping("/search")
    public UsersEntity searchUser(@RequestParam String username){
        UsersEntity usersEntity = usersRepo.findByName(username);
        return usersEntity;
    }



}