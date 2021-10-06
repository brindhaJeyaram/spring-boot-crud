package com.brindha.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.brindha.model.Laptops;
import com.brindha.service.LaptopsService;

@RestController
public class LaptopsController {

    @Autowired
    LaptopsService laptopsService;

    @GetMapping("/laptop")
    private List<Laptops> getAllLaptops()
    {
        return laptopsService.getAllLaptops();
    }

    @GetMapping("/laptop/{laptopassetid}")
    private Laptops getLaptops(@PathVariable("laptopassetid") int laptopassetid)
    {
        return laptopsService.getLaptopsByAssetId(laptopassetid);
    }

    @DeleteMapping("/laptop/{laptopassetid}")
    private void deleteLaptop(@PathVariable("laptopassetid") int laptopassetid)
    {
        laptopsService.delete(laptopassetid);
    }

    @PostMapping("/laptops")
    private int saveLaptop(@RequestBody Laptops laptops)
    {
        laptopsService.saveOrUpdate(laptops);
        return laptops.getAssetID();
    }

    @PutMapping("/laptops")
    private Laptops update(@RequestBody Laptops laptops)
    {
        laptopsService.saveOrUpdate(laptops);
        return laptops;
    }

}
