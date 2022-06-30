package com.example.shardingjdbcdemo.domain.repo;

import com.example.shardingjdbcdemo.domain.entity.OrgInfoEntity;
import com.example.shardingjdbcdemo.domain.entity.UsersEntity;


/**
 * Author: chenshouchang@hyperchain.cn
 * Date: 2019-10-15
 * Time: 11:23
 * Description:
 */
public interface UsersRepo extends BaseRepo<UsersEntity, Integer> {
    UsersEntity findByName(String name);
}
