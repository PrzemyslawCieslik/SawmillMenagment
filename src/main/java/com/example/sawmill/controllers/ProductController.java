package com.example.sawmill.controllers;

import com.example.sawmill.model.Product;
import com.example.sawmill.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //Create

    @GetMapping("/products/new")
    public String formCreateProduct(@Valid Product product, BindingResult result){
        if (result.hasErrors()){
            return null; // TODO: 22/12/2019
        } else {
            productService.save(product);
            return "/products/{productId}"; // TODO: 22/12/2019
        }
    }

    //Read

    @RequestMapping("/products/find")
    public String findProducts (Model model){
        model.addAttribute("product", new Product());
        return "products/findProducts"; // TODO: 25/12/2019
    }

    @GetMapping("/products/{productId}")
    public ModelAndView showProduct (@PathVariable("productId") Long productId){
        ModelAndView modelAndView = new ModelAndView("product/productDetails");
        modelAndView.addObject(productService.findById(productId));
        return modelAndView;
    }

    @GetMapping("/products")
    public String processFindForm(Product product, BindingResult result, Model model){
        if (product.getLength() == 0){
            product.setLength(0);
        }
        List<Product> results = productService.findAllByLength(product.getLength());
        return null;// TODO: 25/12/2019
    }

}
