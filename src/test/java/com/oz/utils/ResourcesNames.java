package com.oz.utils;

/**
 * Created by Orbital Zero.
 * Date: 13/09/12
 * Time: 10:04 AM
 * Author: Lic. José Alberto Sánchez González
 * Twitter: @jaehoox
 * mail: <a href="mailto:jaehoo@gmail.com">jaehoo@gmail.com</a>
 */
public enum ResourcesNames {

      JR_HELLO("test_hello_world.jasper")
    , JR_IMAGE("test_image_report.jasper")
    , JR_BEAN("test_bean_report.jasper")
    , JR_BEAN2("test_bean_report2.jasper")
    , IMG_LOGO("logo_oz.png")
    ;

    private String name;

    private ResourcesNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
