package controller;

import Repo.SachRepo;
import entities.Sach;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import java.io.IOException;
import java.util.Date;

@WebServlet({
        "/Sach/create",
        "/Sach/add",
        "/Sach/index",
})
public class SachServlet extends HttpServlet {
    private SachRepo sachRepo = new SachRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("create")) {
            this.create(req, resp);
        } else if (uri.contains("index")) {
            this.index(req, resp);
        } else {
            this.index(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            this.add(req, resp);
        } else {
            this.add(req, resp);
        }
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/views/create.jsp").forward(request, response);
    }

    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("ds", sachRepo.findAll());
        request.getRequestDispatcher("/views/index.jsp")
                .forward(request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String ten = request.getParameter("TenSach");
        String tg = request.getParameter("TacGia");
        String nam = request.getParameter("NamSX");
        // Định dạng của chuỗi năm
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date namSX = dateFormat.parse(nam);
            // Sử dụng đối tượng Date trong việc tạo đối tượng Sach
            Sach sach = new Sach(null, ten, tg, namSX);
            sachRepo.create(sach);
            // Tiếp tục xử lý dữ liệu sach...
        } catch (Exception e) {
            // Xử lý nếu có lỗi xảy ra trong quá trình chuyển đổi
            e.printStackTrace();
        }
        response.sendRedirect("/FormLogin_war_exploded/Sach/index");
    }
}
