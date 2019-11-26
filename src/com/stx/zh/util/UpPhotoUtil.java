package com.stx.zh.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UpPhotoUtil {
	public static String filename = null; 
	public static String UpPhoto(HttpServletRequest request,File f) throws IOException{
		DiskFileItemFactory factory = new DiskFileItemFactory();
		  ServletFileUpload upload = new ServletFileUpload(factory);
		  factory.setSizeThreshold(1024 * 1024);
		  List items = null;
		  try {
		   items = upload.parseRequest(request);
		  } catch (FileUploadException e) {
		   e.printStackTrace();
		  }
		  Iterator iter = items.iterator();
		  while(iter.hasNext()){
		   FileItem item = (FileItem) iter.next();
		   if(!item.isFormField()){
		    // 根据时间戳创建头像文件
		    filename = System.currentTimeMillis() + ".jpg";
		    //System.out.println(request.getContextPath());
//		    File f = new File(getServletContext().getRealPath("/uploadFile"));
		   // File f = new File("D://image");
		    if (!f.exists()) { 
		     f.mkdir(); 
		    } 
		    String imgsrc = f + "/" + filename;
		    // 复制文件
		    InputStream is = item.getInputStream();    
		    FileOutputStream fos = new FileOutputStream(imgsrc);
		    byte b[] = new byte[1024 * 1024];
		    int length = 0;
		    while (-1 != (length = is.read(b))) {
		        fos.write(b, 0, length);     
		       }
		       fos.flush();
		       fos.close(); 
		      }else {
		       System.out.println(item.getFieldName());
		       String value = item.getString();
		       value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
		       System.out.println(value);
		      }
		   }
		return filename; 
	}
}
