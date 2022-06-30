package com.example.shardingjdbcdemo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;

/**
 * @author: mwq
 * DateTime: 2020/5/19 11:10
 * Description:
 */
@Table(name = "users")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@MappedSuperclass
//@OptimisticLocking
public class UsersEntity{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
