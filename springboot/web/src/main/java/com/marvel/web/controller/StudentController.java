package com.marvel.web.controller;

import com.marvel.web.domain.Student;
import com.marvel.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by dell on 2017/7/2.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/{id}")
    public String find(@PathVariable int id, Model model, HttpServletRequest request){

        Student student=studentService.findById(id);
        model.addAttribute("student",student);

        System.out.println(student);

        //--------
        String path=request.getServletContext().getRealPath("/");
        System.out.println(path);
        System.out.println(this.getClass().getResource("/").getPath());


        /**
         * 不指定work dir 默认是springboot, 而不是springboot/web  只是由于工程创建子模块的原因 。
         * spring-boot框架会在工作目录下的"src/main/webapp"中 查找document root 详见getValidDocumentRoot (全局搜索找到它)
         * 所以才找不到WEB-INF目录，找不到嵌入式的tomcat会自己指认jsp路径 ，所以就会出现404错误
         * 详细请看 prepareContext 源码
         *
         * http://www.th7.cn/Program/java/201706/1182366.shtml
         */

        System.out.println(System.getProperty("user.dir"));


        return "student";
    }


    @RequestMapping("/student/{page}/{row}")
    public String findAll(@PathVariable int page, @PathVariable int row,Model model){

        List<Student> list=studentService.getAll(page,row);

        model.addAttribute("list",list);

        System.out.println(list);

        return "list";
    }



    private String outpath(File file,String blank) {
        String buff = "";

        for (File f : file.listFiles()) {

            if(f.isDirectory()){

                buff=buff+blank+"|--"+f.getName()+"\n"+outpath(f,"|   "+blank);

            }
            if(f.isFile()){


                buff=buff+blank+"|--"+f.getName()+"\n";

            }

        }


        return buff;

    }


}
