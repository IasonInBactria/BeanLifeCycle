package org.example.mapper;

public interface BookMapper {
    public void save();
    //表示bean初始化对应操作
    public void init();
    //bean销毁前操作
    public void destroy();
}
