package com.javaguides.entity;

import com.opencsv.bean.CsvBindByName;
import jakarta.persistence.*;

@Entity
@Table(name = "DeveloperTutorial")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @CsvBindByName
    private int id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private String issue;
    @CsvBindByName
    private int issueId;
    @CsvBindByName
    private int age;

   

    public Tutorial(int id,String name,String issue,String issueId,int age) {
    }

    public Tutorial(String id, String name, String issue, String issueId, String age) {
    }

    public int getId()
    {
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getIssue(){
        return issue;
    }
    public void setIssue(){
        this.issue = issue;
    }

    public int getIssueId(){
        return issueId;
    }
    public void setIssueId(){
        this.issueId = issueId;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge()
    {
        this.age = age;
    }


}
