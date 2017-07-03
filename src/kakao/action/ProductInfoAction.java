package kakao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kakao.bean.ProductBean;
import kakao.control.ActionForWard;
import kakao.dao.ProductDao;

public class ProductInfoAction implements Action{
	private String path;
	private boolean redirect;
	private ProductDao dao = new ProductDao();
	
	public ProductInfoAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	@Override
	public ActionForWard execute(HttpServletRequest request) {
		try {
			String prono = (String) request.getParameter("prono");
			List<ProductBean> info = dao.selectOne(prono);
			request.setAttribute("producInfo", info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ActionForWard(path, redirect);
	}

}
