package com.example.membertest.rent;

import com.example.membertest.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Integer>{
}
