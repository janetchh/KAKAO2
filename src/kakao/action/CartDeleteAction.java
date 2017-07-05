package kakao.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kakao.bean.ProductBean;
import kakao.control.ActionForWard;


public class CartDeleteAction implements Action{
	private String path;
	private boolean redirect;
	
	public CartDeleteAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	@Override
	public ActionForWard execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		String prono=request.getParameter("prono");
		HttpSession session = request.getSession();
		ArrayList<ProductBean> cart = (ArrayList<ProductBean>)session.getAttribute("cartList"); 
		
		for(int i =0;i<cart.size();i++){
			ProductBean bean = cart.get(i);
			if(bean.getProno().equals(prono)){
				cart.remove(i);
			}
		}
		session.setAttribute("cartList", cart);
		session.setAttribute("totalcount",cart.size());
		if(cart.size()==0){
			path="doll.do?cmd=productList";
		}
		
		return new ActionForWard(path, redirect);
	}
	
	
}
