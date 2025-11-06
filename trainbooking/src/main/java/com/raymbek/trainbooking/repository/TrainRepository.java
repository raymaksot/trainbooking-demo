package com.raymbek.trainbooking.repository;

import com.raymbek.trainbooking.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}
