package com.ict.edu.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ict.edu.guestbook.repository.GuestBookMapper;
import com.ict.edu.guestbook.vo.GuestBookVO;

public class GuestBookServiceImpl implements GuestBookService{

    @Autowired
    private GuestBookMapper guestbookmapper;

    @Override
    public List<GuestBookVO> getGuestBookList() {
        
        return guestbookmapper getGuestBookList();
        throw new UnsupportedOperationException("Unimplemented method 'getGuestBookList'");
    }

    @Override
    public GuestBookVO getGuestBookDetail(String gb_idx) {
        throw new UnsupportedOperationException("Unimplemented method 'getGuestBookDetail'");
    }

}
