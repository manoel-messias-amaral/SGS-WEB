package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <title>::: SGS :::</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"body\">\r\n");
      out.write("        <div id=\"cabecalho\">\r\n");
      out.write("            <div id=\"logo\">\r\n");
      out.write("                <h1>SGS</h1>\r\n");
      out.write("                <p id=\"subtitulo\">Sistema de Gerenciamento de Suprimentos</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"menu\">\r\n");
      out.write("                <a href=\"index.jsp\" id=\"selected\">Home</a>\r\n");
      out.write("                <a href=\"marca.jsp\">Marca</a>\r\n");
      out.write("                <a href=\"departamento.jsp\">Departamento</a>\r\n");
      out.write("                <a href=\"produto.jsp\">Produto</a>\r\n");
      out.write("                <a href=\"compra.jsp\">Compra</a>\r\n");
      out.write("                <a href=\"saida.jsp\">Saida</a>\r\n");
      out.write("                <a href=\"estoque.jsp\">Estoque</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div id=\"container\">\r\n");
      out.write("                <h1>Home</h1>\r\n");
      out.write("                <p>Sistema de Gerenciamento de Suprimentos</p>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"footer\">\r\n");
      out.write("                    <small>SGS - Sistema de Gerenciamento de Suprimentos</small>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
