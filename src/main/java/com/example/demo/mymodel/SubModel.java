package com.example.demo.mymodel;

public class SubModel {
    private String model3;
    private int model4;

    public String getModel3() {
        return model3;
    }

    public void setModel3(String model3) {
        this.model3 = model3;
    }

    public int getModel4() {
        return model4;
    }

    public void setModel4(int model4) {
        this.model4 = model4;
    }

    @Override
    public String toString() {
        return "mymodel.SubModelName{" +
                "model3='" + model3 + '\'' +
                ", model4=" + model4 +
                '}';
    }
}
