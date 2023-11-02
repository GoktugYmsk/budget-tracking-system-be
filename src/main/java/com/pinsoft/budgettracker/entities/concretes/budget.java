package com.pinsoft.budgettracker.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "budget")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class budget {

    @Column(name = "totalMoney")
    private long totalMoney;
}
