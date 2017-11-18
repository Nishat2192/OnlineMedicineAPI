package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.MedicineDao;
import com.model.Category;
import com.model.Product;

public class MedicineService {
	
		MedicineDao dao;
		
		public MedicineService(){
			super();
			dao = new MedicineDao();
		}
		
		public List<Product> getAllProducts() throws SQLException 
		{
			List<Product> productList = new ArrayList<>();
			productList = dao.getAllProducts();
			
			return productList;
		}
		
		public List<Category> getAllCategories() throws SQLException
		{
				List<Category> categoryList = new ArrayList<>();
				categoryList = dao.getAllCategories();
				
				return categoryList;
		}

		public Product getProduct(int id) throws SQLException 
		{
				Product product = new Product();
				product = dao.getProduct(id);
				
				return product;
		}
		
		public Category getCategory(int id) throws SQLException
		{
			Category category = new Category();
			category = dao.getCategory(id);
				
			return category;
		}
}
