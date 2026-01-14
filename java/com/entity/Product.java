package com.entity;

import lombok.Data;

@Data
public class Product {
	private Long id;
    private String title;
    private String description;
    private String category;
    private Double price;
    private String[] tags;
    private String brand;
    private String thumbnail;
}

