package com.czx.myownstumanager.mapper;

import com.czx.myownstumanager.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    //Admin findByAdmin(Admin admin);

    int editPswByAdmin(Admin admin);
}
