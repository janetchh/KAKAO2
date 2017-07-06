package kakao.action;

import javax.servlet.http.HttpServletRequest;

import kakao.control.ActionForWard;
import kakao.dao.MemberDao;

public class LoginAction implements Action{
	private String path;
	private boolean redirect;
	private MemberDao dao = new MemberDao();
	
	public LoginAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	@Override
	public ActionForWard execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		try {
			if(dao.idCheck(id, pw)){
				request.getSession().setAttribute("id", id);
				request.getSession().setMaxInactiveInterval(10000);
				path="main.jsp";
			}else{
				path="login.jsp";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ActionForWard(path, redirect);
	}
	
	
}
