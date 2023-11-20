package com.example.springboottrain.AccountController;


//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


@RestController
public class FileUploadController {

    @PostMapping("/postUpload")
    public String up(MultipartFile photo, String user_real_name, HttpServletRequest request) throws IOException {
        System.out.println(user_real_name);
        //文件对应用户
        System.out.println(photo.getOriginalFilename());
        //文件类型

        String path = request.getServletContext().getRealPath("/postUpload/");
        //服务器路径
        System.out.println(path);

        SaveFile(path,photo);

        return "上传成功";
    }

    public void SaveFile(String path,MultipartFile photo) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }

        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }

}
