/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-12 23:11:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bakery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agreement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>회원약관페이지(agreement.html)</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n");
      out.write("    <style>\r\n");
      out.write("    .div_main{\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  border:1px solid #aaaaaa; \r\n");
      out.write("	width:1200px; \r\n");
      out.write("	height:592px; \r\n");
      out.write("	margin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("            .ft1{\r\n");
      out.write("  clear: both;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  width:1200px; \r\n");
      out.write("	height:auto; \r\n");
      out.write("  border:1px solid #aaaaaa; \r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  right: 1px;\r\n");
      out.write("  z-index: 8;\r\n");
      out.write("  top: 94px;\r\n");
      out.write("}\r\n");
      out.write(".nv3 > ul{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  list-style: none;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  top: 20px;\r\n");
      out.write("  height: 20px;\r\n");
      out.write("  width: 300px;\r\n");
      out.write("}\r\n");
      out.write(".nv3 > ul >li{\r\n");
      out.write("  float: left;\r\n");
      out.write("  margin-left: 4.3%;\r\n");
      out.write("  font-family: fantasy;\r\n");
      out.write("}\r\n");
      out.write(".nv3 ul li a{\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".nv4 ul{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  height: 100px;\r\n");
      out.write("  top: 50px;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".nv4 > ul >li{\r\n");
      out.write("  position: relative;\r\n");
      out.write("  list-style: none;\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 20%;\r\n");
      out.write("  font-family: fantasy;\r\n");
      out.write("  font-size: 10px;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align: center;\">\r\n");
      out.write("<div class=\"div_main\">\r\n");
      out.write("    <a href=\"main.jsp\"><img src=\"../imgs/logo.png\" width=\"300px\" style=\"left: 00px;\"></a>\r\n");
      out.write("    <h2>회원 동의 약관</h2>\r\n");
      out.write("    <textarea name=\"agreement\" cols=\"80\" rows=\"20\"><!--행이 20줄 폭 80-->\r\n");
      out.write("        제 1 조 (약관의 적용)\r\n");
      out.write("        인터넷 서비스(이하\"서비스\"라 합니다)의 이용에는 기본 이용약관(이하\"기본약관\"이라 합니다)과 이 약관을 함께 적용합니다\r\n");
      out.write("        \r\n");
      out.write("         제 2 조 (용어의 정의)\r\n");
      out.write("         이 약관에서 사용하는 용어의 정의는 다음과 같습니다. \r\n");
      out.write("         ① 운영자 : 서비스의 전반적인 관리와 원활한 운영을 위하여 회사에서 선정한 사람 \r\n");
      out.write("         ② 해지 : 회원이 서비스 사용 후 이용계약을 해약하는 것 \r\n");
      out.write("         ③ 회원 : 회사와 서비스 이용계약을 체결하고 이용자 ID를 부여받은 자\r\n");
      out.write("         ④ 회사: 서비스의 제공자\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("        제 2 장 서비스 이용계약\r\n");
      out.write("        \r\n");
      out.write("         제 3 조 (이용계약의 성립)\r\n");
      out.write("         ① 서비스 가입 신청시 본 약관을 읽고 \"동의함\" 버튼을 누르면 이 약관에 동의하는 것으로 간주됩니다. \r\n");
      out.write("         ② 이용계약은 서비스 이용희망자의 이용약관 동의 후 이용신청에 대하여 회사가 승낙함으로써 성립합니다. \r\n");
      out.write("                    \r\n");
      out.write("         제 4 조 (계약사항의 변경) \r\n");
      out.write("         회원은 개인정보관리를 통해 언제든지 개인정보를 열람하고 수정할 수 있습니다. \r\n");
      out.write("         회원은 이용신청시 기재한 사항이 변경되었을 경우에는 온라인으로 수정을 해야 하고 미변경으로 인하여 발생되는 문제의 책임은 회원에게 있습니다.\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        제 3 장  서비스의 이용\r\n");
      out.write("        \r\n");
      out.write("         제 5조 (정보의 제공)\r\n");
      out.write("         회사는 회원이 서비스 이용 중 필요가 있다고 인정되는 다양한 정보를 공지사항이나 전자우편, SMS 등의 방법으로 회원에게 제공할 수 있습니다.  \r\n");
      out.write("        \r\n");
      out.write("         제 6조 (요금 및 유료정보 등)\r\n");
      out.write("         회사가 제공하는 서비스는 기본적으로 무료입니다. 단, 별도의 유료정보에 대해서는 해당 정보에 명시된 요금에 대한 지불을 동의하여야 사용이 가능합니다.\r\n");
      out.write("        \r\n");
      out.write("         제 7조 (광고게재 및 광고주와의 거래)\r\n");
      out.write("         ① 회사가 회원에게 서비스를 제공할 수 있는 서비스 투자기반의 일부는 광고게재를 통한 수익으로부터 나옵니다. 서비스를 이용하고자 하는 자는 서비스 이용시 노출되는 광고게재에 대해 동의하는 것으로 간주됩니다.\r\n");
      out.write("         ② 회사는 본 서비스상에 게재되어 있거나 본 서비스를 통한 광고주의 판촉활동에 회원이 참여하거나 교신 또는 거래의 결과로서 발생하는 모든 손실 또는 손해에 대해 책임을 지지 않습니다. \r\n");
      out.write("        \r\n");
      out.write("         제 8조 (서비스 이용시간) \r\n");
      out.write("         ① 서비스의 이용은 회사의 업무상 또는 기술상 특별한 지장이 없는 한 연중무휴 1일 24시간을 원칙으로 합니다. 다만 정기 점검 등의 필요로 회사가 정한 날이나 시간은 그러하지 않습니다.\r\n");
      out.write("         ② 회사는 서비스를 일정범위로 분할하여 각 범위별로 이용가능 시간을 별도로 정할 수 있습니다. 이 경우 그 내용을 사전에 공지합니다. \r\n");
      out.write("        \r\n");
      out.write("         제 9조 (서비스 이용 책임) \r\n");
      out.write("         회원은 회사에서 권한 있는 사원이 서명한 명시적인 서면에 구체적으로 허용한 경우를 제외하고는 서비스를 이용하여 상품을 판매하는 영업활동을 할 수 없으며 특히 해킹, 돈벌이 광고, 음란사이트를 통한 상업행위, 상용S/W 및 저작권 자료의 불법배포 등을 할 수 없습니다. 이를 어기고 발생한 영업활동의 결과 및 손실, 관계기관에 의한 구속 등 법적 조치등에 관해서는 회사가 책임을 지지 않습니다. \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        제 4 장 계약해지 및 이용제한\r\n");
      out.write("        \r\n");
      out.write("         제 10 조 (계약해지 및 이용제한)\r\n");
      out.write("         ① 회원이 이용계약을 해지하고자 하는 때에는 회원 본인이 온라인, 우편, 방문 및 전화를 통해 회사에 해지 신청을 하여야 합니다. \r\n");
      out.write("         ② 회원이 다음 각 호의 1에 해당하는 행위를 하였을 경우 사전통지 없이 이용계약을 해지하거나 또는 기간을 정하여 서비스 이용을 중지할 수 있습니다. \r\n");
      out.write("         다만, 이용계약을 해지하는 경우에는 회원에게 이를 통지하고, 이용계약 해지 전에 소명할 기회를 부여합니다.\r\n");
      out.write("         가. 타인의 서비스 ID 및 비밀번호를 도용한 경우 \r\n");
      out.write("         나. 서비스 운영을 고의로 방해한 경우 \r\n");
      out.write("         다. 가입한 이름이 실명이 아닌 경우 \r\n");
      out.write("         라. 같은 사용자가 다른 ID로 이중등록을 한 경우 \r\n");
      out.write("         마. 공공질서 및 미풍양속에 저해되는 내용을 고의로 유포시킨 경우 \r\n");
      out.write("         바. 회원이 국익 또는 사회적 공익을 저해할 목적으로 서비스이용을 계획 또는 실행하는 경우 \r\n");
      out.write("         사. 타인의 명예를 손상시키거나 불이익을 주는 행위를 한 경우 \r\n");
      out.write("         아. 서비스의 안정적 운영을 방해할 목적으로 다량의 정보를 전송하거나 광고성 정보를 전송하는 경우 \r\n");
      out.write("         자. 정보통신설비의 오작동이나 정보 등의 파괴를 유발시키는 컴퓨터 바이러스 프로그램 등을 유포하는 경우 \r\n");
      out.write("         차. 회사, 다른 회원 또는 제3자의 지적재산권을 침해하는 경우 \r\n");
      out.write("         카. 정보통신윤리위원회 등 외부기관의 시정요구가 있거나 불법선거운동과 관련하여 선거관리위원회의 유권해석을 받은 경우 \r\n");
      out.write("         타. 타인의 개인정보, 이용자ID 및 비빌번호를 부정하게 사용하는 경우 \r\n");
      out.write("         파. 회사의 서비스 정보를 이용하여 얻은 정보를 회사의 사전 승낙없이 복제 또는 유통시키거나 상업적으로 이용하는 경우 \r\n");
      out.write("         하. 회원이 자신의 홈페이지와 게시판에 음란물을 게재하거나 음란사이트 링크하는 경우 \r\n");
      out.write("         거. 본 약관 제9조 또는 제10조를 위반한 경우\r\n");
      out.write("         너. 기타 서비스 이용계약상의 의무를 위반한 경우\r\n");
      out.write("         \r\n");
      out.write("        제 5 장  손해배상\r\n");
      out.write("        \r\n");
      out.write("         제11조 (손해배상의 범위)\r\n");
      out.write("         ① 회사가 제공하는 서비스중 무료 서비스의 경우에는 손해배상에 해당되지 않습니다.\r\n");
      out.write("         ③ 회사는 그 손해가 천재지변 등 불가항력이거나 이용자의 고의 또는 과실로 인하여 발생한 때에는 손해배상을 하지 아니합니다.\r\n");
      out.write("        \r\n");
      out.write("         제12조 (손해배상의 청구)\r\n");
      out.write("         ① 손해배상 청구는 회사에 청구사유, 청구금액 및 산출근거를 기재하여 전화 및 서면으로하여야 하며 그 사유가 발생한 날로부터 6개월이 경과한 경우에는 소멸합니다.\r\n");
      out.write("         ② 제10조의 서비스 이용정지 사유중 회사 및 타인에게 피해를 주어 피해자의 고발 또는 소송제기로 인하여 손해배상을 청구할 경우 그 사유를 제공한 자는 이에 응하여야 합니다.\r\n");
      out.write("        \r\n");
      out.write("         제13조 (면책)\r\n");
      out.write("         ① 회사는 천재지변 또는 이에 준하는 불가항력으로 서비스를 제공할 수 없는 경우와 서비스의 효율적 제공을 위한 시스템 개선 공사, 장비 증설 및 상향공사 등 계획공사의 사유로 고객에게 사전 통보한 경우에는 책임을 면합니다.\r\n");
      out.write("         ② 자유게시판 서비스의 경우 각 게시판에 게재된 데이터의 보존 책임이 없습니다.\r\n");
      out.write("         ③ 회사는 이용자의 귀책사유로 인한 서비스 이용의 장애에 대하여는 책임을 면합니다.\r\n");
      out.write("         ④ 회사는 이용자가 서비스를 통해 얻은 정보 또는 자료 등으로 인해 발생한 손익,서비스를 이용하거나 할 것으로부터 발생하거나 기대하는 손익 등에 대하여 책임을 면합니다.\r\n");
      out.write("         ⑤ 회사는 이용자가 게시 또는 전송한 자료의 내용에 관하여는 책임을 면합니다.\r\n");
      out.write("         ⑥ 약관의 적용은 이용자에 한하며, 제3자로 부터의 어떠한 배상, 클레임 등에 대하여 회사는 책임을 면합니다.\r\n");
      out.write("         ⑦ 회사는 자유게시판 서비스를 무료로 사용하는 이용자들에게 회사의 귀책 사유로 서비스를 제공하지 못하는 경우 책임을 면합니다.\r\n");
      out.write("         ⑧ 자유게시판 서비스와 같이 이용자 자신이 서비스를 개설하고 회원을 모집하여 관리하는 경우 개설한 이용자와 해당 서비스에 회원으로 가입한 이용자간의 각종 법규위반 및 금지 행위로 인한 문제에 대한 책임은 이용자간에 있으며 회사는 책임을 면합니다.\r\n");
      out.write("        \r\n");
      out.write("         제34조 (관할법원)\r\n");
      out.write("         요금 등 서비스 이용으로 발생한 분쟁에 대해 소송이 제기될 경우 회사의 본사 소재지 법원을 관할법원으로 합니다.\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("    </textarea><p></p>\r\n");
      out.write("    <!--<a href=\"register.html\">동의</a>-->\r\n");
      out.write("    <!--document.location='이동할 페이지명'-->\r\n");
      out.write("    <!--history.back() 이전 페이지로 이동 -->\r\n");
      out.write("    <input type=\"button\" value=\"동의함\" onclick=\"document.location='Register.html'\">\r\n");
      out.write("    <input type=\"button\" value=\"동의안함\" onclick=\"history.back()\"><!--뒤로 이동-->\r\n");
      out.write("              <footer class=\"ft1\">\r\n");
      out.write("            <nav class=\"nv3\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">HOME</a></li>\r\n");
      out.write("                    <li><a href=\"|1\">|</a></li>\r\n");
      out.write("                    <li><a href=\"\">TERMS</a></li>\r\n");
      out.write("                    <li><a href=\"|1\">|</a></li>\r\n");
      out.write("                    <li><a href=\"\">BAKERY</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <nav class=\"nv4\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>OWNER: Sweet Devils Baking</li>\r\n");
      out.write("                    <li>E-mail:happyhome@sweet.kr</li>\r\n");
      out.write("                    <li>TELL:032-345-6789</li>\r\n");
      out.write("                    <li>ADDRESS:인천광역시 00구 00동</li>\r\n");
      out.write("                    <li>BUSINESS LICENSE:2719619328</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
