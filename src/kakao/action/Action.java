package kakao.action;

import javax.servlet.http.HttpServletRequest;

import kakao.control.ActionForWard;

public interface Action{
	public ActionForWard execute(HttpServletRequest request);

}
