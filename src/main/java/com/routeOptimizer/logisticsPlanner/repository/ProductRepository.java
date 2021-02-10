package com.routeOptimizer.logisticsPlanner.repository;

import com.routeOptimizer.logisticsPlanner.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
