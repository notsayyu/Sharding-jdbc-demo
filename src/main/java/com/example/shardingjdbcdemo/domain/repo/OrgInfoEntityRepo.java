package com.example.shardingjdbcdemo.domain.repo;

import com.example.shardingjdbcdemo.domain.entity.OrgInfoEntity;


/**
 * Author: chenshouchang@hyperchain.cn
 * Date: 2019-10-15
 * Time: 11:23
 * Description:
 */
public interface OrgInfoEntityRepo extends BaseRepo<OrgInfoEntity, Integer> {

    OrgInfoEntity findByOrgName(String orgName);
}
