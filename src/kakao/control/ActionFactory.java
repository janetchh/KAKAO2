package kakao.control;

import kakao.action.Action;
import kakao.action.ProductListAction;

public class ActionFactory {

	public static Action getAction(String cmd) {
		Action action = null;
		if (cmd.equals("productList")) {
			action = new ProductListAction("productList.jsp", false);
		}
		return action;

	}// method

}
