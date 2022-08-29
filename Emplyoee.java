package com.employee
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
    private Integer id;
    private String name;
    private String department;
    private  Date date;
 
    public Product() {
    }
 
    public Product(Integer id, String name, String department,Date date) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.date=date;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
 
   public Integer setId(Integer id)
   {
     this.id=id;
   }
   public String getName()
    {
        return name;
    }
    public String setName(String name)
    {
        this.name = name;
    }
  public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
  public Date getDate()
  {
    return date;
  }
  public Date setDate(Date date)
  {
  this.date=dtae;
  }
}
