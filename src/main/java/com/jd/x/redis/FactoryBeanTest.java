package com.jd.x.redis;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by kongpeiling on 2019/3/20 16:53.
 */
public class FactoryBeanTest implements FactoryBean<TestClass> {

    @Override
    public TestClass getObject() throws Exception {
        return new TestClass("kpl");
    }
    @Override
    public Class<?> getObjectType() {
        return TestClass.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
}
class TestClass{
    private String name;
    public TestClass(String name) {
        this.name = name;
    }
    public void out(){
        System.out.println(name);
    }
}