package com.example.demo;

import com.example.demo.model.ChildA;
import com.example.demo.model.Parent;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Import({MyAdvice.class})
public class MyController {

    @GetMapping(value = "api")
    public String my(@RequestParam(value = "val") String parameter) {
        ChildA childA = new ChildA();
        childA.setA("a");
        childA.setB("b");
        childA.setC("c");
        System.out.println(childA.hashCode());

        ChildA childB = new ChildA();
        childB.setA("a");
        childB.setB("b");
//        childB.setC("c");
        System.out.println(childB.hashCode());

        Parent parent = new Parent();
        parent.setA("a");
        parent.setB("b");
        System.out.println(parent.hashCode());
        return "Hello " + parameter;
    }

}
