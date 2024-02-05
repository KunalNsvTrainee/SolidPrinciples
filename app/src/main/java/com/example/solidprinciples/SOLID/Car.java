package com.example.solidprinciples.SOLID;

public class Car implements Brand {

    @Override
    public void brandname() {

    }

    @Override
    public void brandvalue() {

    }
}

interface Engine{
    void enginetype();

    void enginename();
}

interface Brand{
    void brandname();
    void brandvalue();
}

class newcar{
    public void carinfo(Engine engine,Brand brand){
        engine.enginename();
        engine.enginetype();
        brand.brandvalue();
    }
}
