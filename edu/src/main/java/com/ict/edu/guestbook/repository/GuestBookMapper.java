package com.ict.edu.guestbook.repository;

import org.apache.ibatis.annotations.Mapper;

public class GuestBookMapper {

    @Mapper
    public interface GuestBookMapper {
        @Select("select * from guestbook order by gb_idx")
        public List<GuestBookVO> getGuestBookList();
            
        @Select("select * from guestbook where gb_idx = #{gb_idx}")
        // MyBatis mapper를 사용해보자
        // application.properties에서 mapper와 
        public GuestBookVO getGuestBookDetail(String gb_idx);
    }
}
