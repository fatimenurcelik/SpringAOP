package com.celik.springAOP.business.abstracts;

import java.util.List;

import com.celik.springAOP.business.responses.GetAllProductResponse;

public interface ProductService {
	List<GetAllProductResponse> getAll();
}
