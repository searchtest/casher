/*
 * JSP generated by Resin-3.0.22 (built Mon, 13 Nov 2006 09:32:38 PST)
 */

package _jsp._web_22dinf._v2;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _redirect__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=utf-8");
    request.setCharacterEncoding("UTF-8");
    com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_0 = null;
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.requestSetOrRemove("base", "");
      out.write(_jsp_string1, 0, _jsp_string1.length);
      pageContext.sessionSetOrRemove("lang", "i18n/Page");
      out.write(_jsp_string1, 0, _jsp_string1.length);
      pageContext.sessionSetOrRemove("bundle", "i18n/Credit_card");
      out.write(_jsp_string2, 0, _jsp_string2.length);
      _caucho_expr_0.print(out, pageContext, false);
      out.write(_jsp_string3, 0, _jsp_string3.length);
      if (_jsp_loop_0 == null)
        _jsp_loop_0 = new com.caucho.jsp.IteratorLoopSupportTag();
      java.util.Iterator _jsp_iter_1 = com.caucho.jstl.el.ForEachTag.getIterator(_caucho_expr_1.evalObject(pageContext));
      _jsp_loop_0.init(0, Integer.MAX_VALUE, 1);
      Object _jsp_oldVar_1 = pageContext.getAttribute("map");
      while (_jsp_iter_1.hasNext()) {
        Object _jsp_i_1 = _jsp_iter_1.next();
        pageContext.setAttribute("map", _jsp_i_1);
        _jsp_loop_0.setCurrent(_jsp_i_1, _jsp_iter_1.hasNext());
        out.write(_jsp_string4, 0, _jsp_string4.length);
        _caucho_expr_2.print(out, pageContext, false);
        out.write(_jsp_string5, 0, _jsp_string5.length);
        _caucho_expr_3.print(out, pageContext, false);
        out.write(_jsp_string6, 0, _jsp_string6.length);
      }
      pageContext.pageSetOrRemove("map", _jsp_oldVar_1);
      out.write(_jsp_string7, 0, _jsp_string7.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -3988812337524854005L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/v2/redirect.jsp"), -446087418700706031L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/tags.jsp"), -3608291857756734149L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }
  private final static com.caucho.el.Expr _caucho_expr_0 =
    new com.caucho.el.PathExpr(new com.caucho.el.ArrayExpr(new com.caucho.el.IdExpr("PaRes"), new com.caucho.el.StringLiteral("action")), "PaRes.action");
  private final static com.caucho.el.Expr _caucho_expr_1 =
    new com.caucho.el.IdExpr("PaRes");
  private final static com.caucho.el.Expr _caucho_expr_2 =
    new com.caucho.el.PathExpr(new com.caucho.el.ArrayExpr(new com.caucho.el.IdExpr("map"), new com.caucho.el.StringLiteral("key")), "map.key");
  private final static com.caucho.el.Expr _caucho_expr_3 =
    new com.caucho.el.PathExpr(new com.caucho.el.ArrayExpr(new com.caucho.el.IdExpr("map"), new com.caucho.el.StringLiteral("value")), "map.value");

  private final static char []_jsp_string3;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  private final static char []_jsp_string7;
  private final static char []_jsp_string4;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  static {
    _jsp_string3 = "\"\n      method=\"post\">\n\n    ".toCharArray();
    _jsp_string6 = "\"/>\n    ".toCharArray();
    _jsp_string0 = "\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string7 = "\n  </form>\n  <script language=\"javascript\">\n    window.status=\"redirect to secure https site...\";\n    window.focus();\n  </script>\n</body>\n".toCharArray();
    _jsp_string4 = "\n      <input type=hidden name=\"".toCharArray();
    _jsp_string2 = "\n<body onload=\"PAForm.submit();\" oncontextmenu=\"return false\">\n  <form \n      name=\"PAForm\"\n      action=\"".toCharArray();
    _jsp_string5 = "\" value=\"".toCharArray();
  }
}