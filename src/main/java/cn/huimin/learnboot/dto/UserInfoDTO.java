package cn.huimin.learnboot.dto;

public class UserInfoDTO{

    private int id;
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    private String username;
    public String getUname()
    {
        return this.username;
    }
    public void setUname(String name)
    {
        this.username = name;
    }

    private int userage;
    public int getUage()
    {
        return this.userage;
    }
    public void setUage(int age)
    {
        this.userage=age;
    }

    public String toString()
    {
        return this.username+","+this.userage;
    }


}