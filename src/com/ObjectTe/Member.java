package com.ObjectTe;

public class Member {
    //用户类
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 构造方法
    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return
                "用户名：" + username + "\n"+
                "密  码：" + password ;
    }


}
