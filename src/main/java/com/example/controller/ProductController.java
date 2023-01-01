package com.example.controller;

import com.example.model.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

  @GetMapping(value = "/{productId}")
  public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") long productId) {
    ProductDto productDto = new ProductDto();
    productDto.setProductId(productId);
    productDto.setProductName("Mouse");
    return ResponseEntity.ok(productDto);
  }
}
