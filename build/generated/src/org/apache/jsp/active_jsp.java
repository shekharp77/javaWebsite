package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.MyProfile;
import java.util.List;
import com.Alldata;

public final class active_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"script.js\"></script>\n");
      out.write("        <script src=\"bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .wrapper {\n");
      out.write("                text-align: center;\n");
      out.write("                top: 20%;\n");
      out.write("                right: 25%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">       \n");
      out.write("  <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" id=\"active\">Active users</button>\n");
      out.write("      <button type=\"button\" class=\"btn btn-secondary\" id=\"mypro\">My Profile</button>\n");
      out.write("  <button type=\"button\" class=\"btn btn-secondary\" id=\"myacc\">Edit My Account</button>\n");
      out.write("  <button type=\"button\" class=\"btn btn-secondary\" id=\"logout\">Log Out</button>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <h2 class=\"text-center\">CURRENT ACTIVE USERS</h2><br>\n");
      out.write("  <p></p>                                                                                      \n");
      out.write("  <div class=\"table-responsive\">          \n");
      out.write("  <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>USERNAME</th>\n");
      out.write("        <th>FULL NAME</th>\n");
      out.write("        <th>GENDER</th>\n");
      out.write("        <th>AGE</th>\n");
      out.write("        <th>EMAIL</th>\n");
      out.write("        <th>ADDRESS</th>\n");
      out.write("      </tr>\n");
      out.write("      ");

            MyProfile mp=new MyProfile();
            Alldata ad=new Alldata();
            List li=Alldata.allActivePtofile();
            System.out.print("----------------------"+li.size());
            for(int i=0;i<li.size();i++){
                Object un=li.get(i);
                String user=un.toString();
                mp=MyProfile.showProfile(user);
      
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(mp.username);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(mp.fullname);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(mp.gender);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(mp.age);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(mp.email);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(mp.address);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("                \n");
      out.write("                ");

            }
        
      out.write("\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      `\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
