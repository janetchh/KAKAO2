package kakao.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kakao.bean.ProductBean;
import kakao.control.ActionForWard;
import kakao.dao.ProductDao;

public class ProductListAction implements Action {
	private String path;
	private boolean redirect;
	private ProductDao dao = new ProductDao();

	public ProductListAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	@Override
	public ActionForWard execute(HttpServletRequest request) {
		try {
			List<ProductBean> list = dao.selectList();
			request.setAttribute("productList", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ActionForWard(path, redirect);
	}

}
