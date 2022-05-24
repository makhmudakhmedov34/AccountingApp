package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "invoice_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause ="is_deleted=false")
public class InvoiceProduct extends BaseEntity{

   private String name;
   private BigDecimal qty;
   private BigDecimal price;
   private BigDecimal tax;
   private BigDecimal profit;

}
