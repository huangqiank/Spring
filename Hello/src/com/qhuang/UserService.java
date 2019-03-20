package com.qhuang;

public class UserService {
    private String name;
    private ByeService byeService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ByeService getByeService() {
        return byeService;
    }

    public void setByeService(ByeService byeService) {
        this.byeService = byeService;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
        byeService.sayBye();
    }
}