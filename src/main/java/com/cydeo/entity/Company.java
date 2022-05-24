package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause ="is_deleted=false")
public class Company extends BaseEntity{

    private String title;
    private String address1;
    private String address2;
    @Column(name = "zip")
    private String zipCode;
    private String representative;
    @Column(name = "email")
    private String emailAddress;
    @Column(columnDefinition = "DATE")
    private LocalDateTime establishmentDate;
    private Boolean enabled;
    private String phone;


}
