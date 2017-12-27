package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.AdminProductDao;
import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.vo.Condition;

public class AdminProductService {

	public List<Product> findAllProduct() throws SQLException {
		//因为没有复杂业务 直接传递请求到dao层
		AdminProductDao dao = new AdminProductDao();
		return dao.findAllProduct();
	}

	public List<Category> findAllCategory() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		 return dao.findAllCategory();
	}

	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);
	}

	public void delProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProductByPid(pid);
	}

	public Product findProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductByPid(pid);
	}

	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);
	}

	public List<Product> findProductListByCondition(Condition condition) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductListByCondition(condition);
	}

}
