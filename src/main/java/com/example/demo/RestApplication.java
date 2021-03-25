package com.example.demo;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

//@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//		SpringApplication.run(RestApplication.class, args);
        com.example.demo.model.ModelName src = new com.example.demo.model.ModelName();
        src.setModel1("model1");
        src.setModel("model2");

        com.example.demo.model.SubModelName srcSubModel = new com.example.demo.model.SubModelName();
        srcSubModel.setModel3("model3");
        srcSubModel.setModel4(4);

//        src.setSubModel(srcSubModel);

        com.example.demo.mymodel.Model dest = new com.example.demo.mymodel.Model();
        PropertyUtils.copyProperties(dest, src);
        com.example.demo.mymodel.SubModel destSubModel = new com.example.demo.mymodel.SubModel();
        PropertyUtils.copyProperties(destSubModel, srcSubModel);
        dest.setSubModel(destSubModel);

        System.out.println(dest);
        System.out.println(src);
    }

}
