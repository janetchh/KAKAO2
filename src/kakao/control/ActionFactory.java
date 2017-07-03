package kakao.control;

import kakao.action.Action;
import kakao.action.ProductInfoAction;
import kakao.action.ProductListAction;

public class ActionFactory {

	public static Action getAction(String cmd) {
		Action action = null;
		if (cmd.equals("productList")) {
			action = new ProductListAction("doll.jsp", false);
		} else if(cmd.equals("productInfo")){
			action = new ProductInfoAction("productInfo.jsp", false);
		}
		return action;

	}// method

}
