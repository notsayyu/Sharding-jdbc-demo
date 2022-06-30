package com.example.shardingjdbcdemo.domain.entity;

import lombok.Data;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
@OptimisticLocking
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 7101893300488295059L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 数据库版本信息，Hibernate自动维护
     */
    @Version
    @Column(name = "version", columnDefinition = "INT(11) DEFAULT 0 COMMENT '版本号'")
    protected Integer version;

    @Column(name = "created_at", columnDefinition = "BIGINT COMMENT '创建时间'")
    protected long createdAt;

    @Column(name = "updated_at", columnDefinition = "BIGINT COMMENT '更新时间'")
    protected long updatedAt;

    @Column(name = "deleted", columnDefinition = "BOOLEAN DEFAULT false COMMENT '是否逻辑删除'")
    private boolean deleted;

    @PrePersist
    public void beforeInsert() {
        createdAt = Instant.now().toEpochMilli();
        updatedAt = Instant.now().toEpochMilli();
        version = 0;
        deleted = false;
    }

    @PreUpdate
    public void beforeUpdate() {
        updatedAt = Instant.now().toEpochMilli();
    }
}
