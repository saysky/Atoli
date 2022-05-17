package com.example.hotel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hotel.entity.Clean;
import com.example.hotel.entity.Comment;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author liuyanzhao
 * @date: 2022/04/30
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}

