package com.brindha.respository;

import org.springframework.data.repository.CrudRepository;
import com.brindha.model.Laptops;

public interface LaptopsRepository extends CrudRepository<Laptops, Integer>
{
}
