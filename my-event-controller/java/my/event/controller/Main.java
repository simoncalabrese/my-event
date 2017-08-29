package my.event.controller;

import org.springframework.boot.SpringApplication;
import my.event.config.properties.BaseApplication;

/**
 * Created by simon.calabrese on 28/08/2017.
 */

public class Main extends BaseApplication{
    public static void main(String[] rgs) {
        SpringApplication.run(Main.class, rgs);
    }
}
