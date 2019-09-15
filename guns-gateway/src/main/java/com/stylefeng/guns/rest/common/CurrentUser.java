package com.stylefeng.guns.rest.common;

public class CurrentUser {

    /**
     * 1 线程绑定的存储空间
     */
    private static final InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    /**
     * 2 存储信息
     */
    public static void saveUserId(String userId) {
        threadLocal.set(userId);
    }

    /**
     * 3 取出信息
     */
    public static String getCurrentUser() {
        return threadLocal.get();
    }
    /**clear方法用处不大，手动清除还是自动的清除，把threadlocal当成session使用！存储id最多8位，轻量级*/

    // 下面的太重量级
    // 将用户信息放入存储空间
//    public static void saveUserInfo(UserInfoModel userInfoModel){
//        threadLocal.set(userInfoModel);
//    }
//
//    // 将用户信息取出
//    public static UserInfoModel getCurrentUser(){
//        return threadLocal.get();
//    }

}
