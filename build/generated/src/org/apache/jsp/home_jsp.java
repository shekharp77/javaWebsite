package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"build/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"profile.js\"></script>\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .good{\n");
      out.write("                background-color: #18e025;\n");
      out.write("            }\n");
      out.write("            .bad{\n");
      out.write("                background-color: #fb1100;\n");
      out.write("            }\n");
      out.write("            .wrapper {\n");
      out.write("                text-align: center;\n");
      out.write("                top: 20%;\n");
      out.write("                right: 25%;\n");
      out.write("            }\n");
      out.write("            .jumbotron {\n");
      out.write("                padding-top: 30px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("                padding-right: 30px;\n");
      out.write("                color: inherit;\n");
      out.write("                background-color: rgba(92, 243, 95, 0.27);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images//mainmenu3.jpg\">\n");
      out.write("        <div class=\"wrapper\">       \n");
      out.write("    <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" id=\"active\">Active users</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" id=\"mypro\">My Profile</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" id=\"myacc\">Home</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" id=\"logout\">Log Out</button>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            \n");
      out.write("            <hr class=\"my-4\">\n");
      out.write("                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>\n");
      out.write("            <p class=\"lead\">\n");
      out.write("                <button class=\"btn good\" id=\"good\">GOOD <span class=\"badge badge-secondary\">9</span></button>\n");
      out.write("                <button class=\"btn bad\" id=\"bad\">BAD <span class=\"badge badge-secondary\">9</span></button>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
