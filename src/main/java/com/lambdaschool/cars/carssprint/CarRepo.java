package com.lambdaschool.cars.carssprint;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
    Car findAllByYear(int year);
    Car findAllByBrand(String brand);
}
