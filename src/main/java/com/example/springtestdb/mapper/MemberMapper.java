package com.example.springtestdb.mapper;

import com.example.springtestdb.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    //annotation방식
    @Select("select * from member")
    List<Member> getList();

    //xml방식
//    @Select("getList2")
    List<Member> getList2();
}
