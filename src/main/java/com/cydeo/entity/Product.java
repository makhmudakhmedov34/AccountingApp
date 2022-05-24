package com.cydeo.entity;

import com.cydeo.enums.ProductStatus;
import com.cydeo.enums.Unit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause ="is_deleted=false")

public class Product extends BaseEntity{

   private String name;
   private String description;
   private BigDecimal qty;
   @Enumerated(EnumType.STRING)
   private Unit unit;
   private BigDecimal lowLimitAlert;
   private BigDecimal tax;
   private Boolean enabled;
   private BigDecimal newColumn;

}
