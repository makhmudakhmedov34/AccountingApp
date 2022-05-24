package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause ="is_deleted=false")
public class Category extends BaseEntity{
    private String description;
    private Boolean enabled;

}
