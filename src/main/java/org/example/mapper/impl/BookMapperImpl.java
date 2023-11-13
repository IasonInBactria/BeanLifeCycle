package org.example.mapper.impl;

import org.example.mapper.BookMapper;
import org.springframework.stereotype.Service;

@Service
public class BookMapperImpl implements BookMapper {
    public void save(){
        System.out.println("book mapper save");
    }

    //表示bean初始化对应操作
    public void init(){
        System.out.println("init");
    }

    //bean销毁前操作
    public void destroy(){
        System.out.println("destroy");
    }
}
