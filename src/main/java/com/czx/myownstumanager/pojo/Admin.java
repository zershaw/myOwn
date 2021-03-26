package com.czx.myownstumanager.pojo;

import lombok.Data;

/**
 * 管理员
 */
@Data
public class Admin {
    private Long id;
    private String username;
    private String password;
    private static Admin instance;

    private Admin(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public static Admin getInstance(){ // 随便试试单例模式
        if(instance == null){
            instance = new Admin((long) 2,"admin2","12346");
        }
        return instance;
    }
}
