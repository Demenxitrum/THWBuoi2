package controller;

import Repo.LoginRepo;
import entities.NguoiDung;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet({
        "/login/index",
        "/login/check",
})
public class LoginServlet extends HttpServlet {
    private LoginRepo loginRepo = new LoginRepo();
    private List<NguoiDung> listNguoiDung = loginRepo.findAll();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")) {
            this.index(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("check")) {
            this.check(req, resp);
        }
    }

    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/views/DangNhap.jsp").forward(request, response);
    }


    public void check(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("ten");
        String pass = request.getParameter("pass");
        System.out.println(userName);
        System.out.println(pass);

        // Kiểm tra nếu userName hoặc pass là null, thì gán giá trị rỗng
        userName = (userName != null) ? userName.trim() : "";
        pass = (pass != null) ? pass.trim() : "";

        NguoiDung nguoiDungViews = new NguoiDung(null, userName, pass);
        boolean isLoggedIn = false;
        for (NguoiDung nd : listNguoiDung) {
            if (nd.getUserName() != null && nd.getUserName().equals(nguoiDungViews.getUserName()) &&
                    nd.getPass() != null && nd.getPass().equals(nguoiDungViews.getPass())) {
                isLoggedIn = true;
                request.setAttribute("nv", nd);
                break;
            }
        }
        if (isLoggedIn) {
            request.setAttribute("message", "Bạn đã đăng nhập thành công!");
            request.getRequestDispatcher("/views/result.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "Tên đăng nhập hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("/views/DangNhap.jsp").forward(request, response);
        }
    }




}
