package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profilejsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"build/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"profile.js\"></script>\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                               background-image: url(\"images//profile.gif\");\n");
      out.write("                               background-size: 100% auto ;\n");
      out.write("                               \n");
      out.write("                    }\n");
      out.write("            .wrapper {\n");
      out.write("                text-align: center;\n");
      out.write("                top: 20%;\n");
      out.write("                right: 25%;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 100%;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                background-color: #39bc35;\n");
      out.write("                color: #fff5f5;\n");
      out.write("                position: unset;\n");
      out.write("            }\n");
      out.write("            .button{\n");
      out.write("                    background-color:#000000;\n");
      out.write("                    border:1px solid #660000;\n");
      out.write("                    border-radius:5px;\n");
      out.write("                    color:#fff;\n");
      out.write("                    margin-right:10px;\n");
      out.write("                    padding:10px 10px 10px 10px;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    font-family: cursive;\n");
      out.write("                    }\n");
      out.write("                        \n");
      out.write("                    .container {\n");
      out.write("                        position: absolute;\n");
      out.write("                        top: 20%;\n");
      out.write("                        left: 7%;\n");
      out.write("                        box-shadow: 0 0 18px 19px black;\n");
      out.write("                        padding-right: 0px;\n");
      out.write("                        padding-left: 450px;\n");
      out.write("                        margin-right: auto; \n");
      out.write("                        margin-left: inherit; \n");
      out.write("                        align-items: center; \n");
      out.write("                        padding-top: 10px;\n");
      out.write("                        padding-bottom: 10px;\n");
      out.write("                    }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <div class=\"wrapper\">       \n");
      out.write("  <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\n");
      out.write("      <button type=\"button\" class=\"btn btn-secondary\" id=\"mypro\">My Profile</button>\n");
      out.write("  <button type=\"button\" class=\"btn btn-secondary\" id=\"myacc\">My Account</button>\n");
      out.write("  <button type=\"button\" class=\"btn btn-secondary\" id=\"logout\">Log Out</button>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("<div class=\"input-group\">\n");
      out.write("  <input type=\"text\" class=\"form-control\" placeholder=\"Username\" id='una'>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<div class=\"input-group\">\n");
      out.write("  <input type=\"password\" class=\"form-control\" id=\"pww\" placeholder=\"enter password\">\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" id=\"login\">LOG IN</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" id=\"signup\">SIGN UP</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
