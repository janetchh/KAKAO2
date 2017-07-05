package kakao.control;

import kakao.action.Action;
import kakao.action.CartDeleteAction;
import kakao.action.CartListAction;
import kakao.action.LoginAction;
import kakao.action.ProductInfoAction;
import kakao.action.ProductListAction;

public class ActionFactory {

	public static Action getAction(String cmd) {
		Action action = null;
		
		if (cmd.equals("productList")) {
			action = new ProductListAction("doll.jsp", false);
		} else if(cmd.equals("productInfo")){
			action = new ProductInfoAction("productInfo.jsp", false);
		} else if(cmd.equals("cartList")){
			action = new CartListAction("cartList.jsp", false);
		} else if(cmd.equals("deleteCart")){
			action = new CartDeleteAction("cartList.do?cmd=cartList", true);
		} else if(cmd.equals("login")){
			action = new LoginAction("main.jsp", true);
		}
		return action;

	}// method

}
