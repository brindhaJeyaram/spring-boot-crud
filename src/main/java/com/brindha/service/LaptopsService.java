package com.brindha.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brindha.model.Laptops;
import com.brindha.respository.LaptopsRepository;

@Service
public class LaptopsService {
    @Autowired
    LaptopsRepository laptopsRepository;

    public List<Laptops> getAllLaptops() {
        List<Laptops> laptops = new ArrayList<Laptops>();
        laptopsRepository.findAll().forEach(laptops1 -> laptops.add(laptops1));
        return laptops;
    }

    public Laptops getLaptopsByAssetId(int id) {
        return laptopsRepository.findById(id).get();

    }

    public void saveOrUpdate(Laptops laptops)
    {
        laptopsRepository.save(laptops);
    }

    public void delete(int id)
    {
        laptopsRepository.deleteById(id);
    }
    
    public void update(Laptops laptops,int laptopid)
    {
        laptopsRepository.save(laptops);
    }


}
