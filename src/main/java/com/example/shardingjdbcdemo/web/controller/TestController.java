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
    OrgInfoEntityRepo orgInfoEntityRepo;
    @Autowired
    UsersRepo usersRepo;


    @GetMapping("/add")
    public String addOrg(@RequestParam String orgName){
        OrgInfoEntity orgInfoEntity = new OrgInfoEntity();
        orgInfoEntity.setOrgName(orgName);
        orgInfoEntityRepo.save(orgInfoEntity);

        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setName(orgName);
        usersRepo.save(usersEntity);
        return "success";
    }

    @GetMapping("/search")
    public OrgInfoEntity searchOrg(@RequestParam String orgName){
        OrgInfoEntity orgInfoEntity = orgInfoEntityRepo.findByOrgName(orgName);
        return orgInfoEntity;
    }



}