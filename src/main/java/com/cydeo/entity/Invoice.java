package com.cydeo.entity;

import com.cydeo.enums.InvoiceStatus;
import com.cydeo.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "invoice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause ="is_deleted=false")
public class Invoice extends BaseEntity{
   private String InvoiceNumber;
    @Enumerated(EnumType.STRING)
   private InvoiceType invoiceType;
    @Enumerated(EnumType.STRING)
   private InvoiceStatus invoiceStatus;
    @Column(columnDefinition = "DATE")
   private LocalDateTime invoiceDate;

    private Boolean enabled;




}
