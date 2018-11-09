package com.gj.dao;

import com.gj.entity.Book;
import org.apache.ibatis.annotations.Param;

public interface BookDao {

    Book getBook(int id);

    /**
     * 此处@Param 必填
     * @param sql
     * @return
     */
    Book getBook1(@Param(value="sql")String sql);

}
