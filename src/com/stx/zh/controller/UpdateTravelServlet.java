package com.stx.zh.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.stx.zh.dao.ArticleDao;
import com.stx.zh.dao.TravelDao;
import com.stx.zh.model.Article;
import com.stx.zh.model.Travel;

/**
 * Servlet implementation class UpdateTravelServlet
 */
@WebServlet("/UpdateTravelServlet")
public class UpdateTravelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTravelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //文件上传
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建servlet解析
        ServletFileUpload upload = new ServletFileUpload(factory);
        request.setCharacterEncoding("utf-8");
        try {
            List<FileItem> items = upload.parseRequest(request);//获取请求所有的模块
            System.out.println(items.size());
            //创建user对象
            Travel travel=new Travel();
            //遍历items
            for (FileItem item : items) {
                if (item.isFormField()){
                    //普通表单
                    if ("t_no".equals(item.getFieldName())){
                    	travel.setT_no(Integer.parseInt(item.getString("utf-8")));
                    }
                    if ("t_label".equals(item.getFieldName())){
                    	travel.setT_label(item.getString("utf-8"));
                    }
                    if ("t_title".equals(item.getFieldName())){
                    	travel.setT_title(item.getString("utf-8"));
                    }
                    if ("t_content".equals(item.getFieldName())){
                    	travel.setT_content(item.getString("utf-8"));
                    }
                    
                }else {
                    //文件项
                    //文件名
                    String name = UUID.randomUUID().toString().replaceAll("-","")+"_"+item.getName();
                    //获取存储文件的路径
                    String location = getServletContext().getRealPath("/img");
                    //创建输出流
                    FileOutputStream os = new FileOutputStream(location+"/"+name);
                    //将输入流写出
                    IOUtils.copy(item.getInputStream(),os);
                    //关闭输出流
                    os.close();
                    //虚拟路径
                    String vpath = "img/"+name;
                    System.out.println(vpath);
                    travel.setT_picture1(vpath);
                    travel.setT_comnum(0);
                }
            }
           TravelDao td=new TravelDao();
            td.up_Travel(travel);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("AllTravelServlet").forward(request,response);
	}

}
