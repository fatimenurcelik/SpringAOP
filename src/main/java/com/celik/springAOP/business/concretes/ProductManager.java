package com.celik.springAOP.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.celik.springAOP.business.abstracts.ProductService;
import com.celik.springAOP.business.responses.GetAllProductResponse;
import com.celik.springAOP.core.mapping.ModelMapperService;
import com.celik.springAOP.dataAccess.abstracts.ProductRepository;
import com.celik.springAOP.entities.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

	private ProductRepository productRepository;
	private ModelMapperService mapperService;

	@Override
	public List<GetAllProductResponse> getAll() {
		List<Product> products = this.productRepository.findAll();
		List<GetAllProductResponse> responses = products.stream()
				.map(product->this.mapperService.forResponse().map(product, GetAllProductResponse.class))
				.collect(Collectors.toList());
		return responses;
	}
}
