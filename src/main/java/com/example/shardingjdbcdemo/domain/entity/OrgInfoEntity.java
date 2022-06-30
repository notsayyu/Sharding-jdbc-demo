package com.example.shardingjdbcdemo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: mwq
 * DateTime: 2020/5/19 11:10
 * Description:
 */
@Table(name = "org_info")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrgInfoEntity extends BaseEntity {

    @Column(name = "org_name")
    private String orgName;
}
