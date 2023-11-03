package com.pinsoft.budgettracker.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "incomes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "incomeName")
    private String incomeName;

    @Column(name = "amount")
    private long amount;

    @Column(name = "date")
    private Date date;

}
