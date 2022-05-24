package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "stock_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StockDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(columnDefinition = "DATE")
    LocalDateTime iDate;
    BigDecimal quantity;
    BigDecimal price;
    BigDecimal remainingQuantity;


}
