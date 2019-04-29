package com.mjie.xml.beans.classes;

public class HomeServiceFactory {
    private static HomeService homeService = new HomeService();

    private HomeServiceFactory() {}

    public static HomeService homeService() {
        return homeService;
    }
}
