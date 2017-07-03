package kakao.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import kakao.bean.ProductBean;
import kakao.util.SqlSessionFactoryManager;

public class ProductDao {
	private SqlSessionFactory sqlSessionFactory;

	public ProductDao() {
		sqlSessionFactory = SqlSessionFactoryManager.getSqlSessionFactory();
	}

	public List<ProductBean> productListAll() {
		return sqlSessionFactory.openSession().selectList("productListAll");
	}

}
