package kakao.action;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kakao.bean.ProductBean;
import kakao.control.ActionForWard;
import kakao.dao.ProductDao;

public class CartListAction implements Action{
	private String path;
	private boolean redirect;
	private ProductDao dao = new ProductDao();
	
	public CartListAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	@Override
	public ActionForWard execute(HttpServletRequest request) {
		String prono = (String) request.getParameter("prono");
		ArrayList<ProductBean> list = null;
		ProductBean bean = null;
		HttpSession session = request.getSession();
		boolean state = false;
		
		try {
			bean = (ProductBean) dao.selectOne(prono);
			list = (ArrayList)session.getAttribute("cartList");
			
			if(list==null){
				list = new ArrayList<ProductBean>();
			}
			
			for(int i =0; i<list.size();i++){
				if(list.get(i).getProno().equals(prono)){
					state=true;
				}
			}
			if(!state){
				list.add(bean);
				session.setAttribute("cartList", list);
				session.setAttribute("totalcount", list.size());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ActionForWard(path, redirect);
	}

}
