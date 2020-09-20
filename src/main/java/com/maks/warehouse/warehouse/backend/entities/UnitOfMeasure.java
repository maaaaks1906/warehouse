package com.maks.warehouse.warehouse.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "units_of_measure")
public class UnitOfMeasure extends AbstractEntity{
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
