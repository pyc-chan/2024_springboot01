package com.ict.edu.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ict.edu.guestbook.service.GuestBookService;
import com.ict.edu.guestbook.vo.GuestBookVO;

@Controller
public class GuestBookController {

    @Autowired
    private GuestBookService guestbookservice;
    
    @GetMapping("/")
    public String getIndex() {
        return "index";     // WEB-INF/views/index.jsp
    }

    @GetMapping("/hello")
    public String getHello(Model model) {
        System.out.println("getHello 메서드에 들어옴");

        model.addAttribute("name", "고길동");
        return "hello";     // WEB-INF/views/hello.jsp
    }

    @GetMapping("/g_list")
    public String getTestBookList(Model model) {
        List<GuestBookVO> g_list = guestbookservice.getGuestBookList();
        model.getAttribute(attributeName:"g_list", g_list);
        return null;
    }

    @GetMapping("/g_detail")
    public String getTuestBookList(Model model, String gb_idx) {
        GuestBookVO gvo = guestbookservice.getGuestBookDetail(gb_idx);

        return null;
    }

}
