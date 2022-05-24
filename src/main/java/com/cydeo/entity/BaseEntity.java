package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(nullable = false,updatable = false)
    Long createdBy;
    @Column(nullable = false,updatable = false)
    LocalDateTime createTime;
    @Column(nullable = false)
    Long updatedBy;
    @Column(nullable = false)
    LocalDateTime updatedTime;

    private Boolean isDeleted=false;

    @PrePersist
    public void onPrePersist() {
        this.updatedTime = LocalDateTime.now();
        this.createTime = LocalDateTime.now();
        this.updatedBy = 1L;
        this.createdBy = 1L;
    }

    @PreUpdate
    public void onPreUpdate(){
        this.updatedTime = LocalDateTime.now();
        this.updatedBy = 1L;
    }
}
