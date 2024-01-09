package com.example.Portfolio;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.SequenceGenerator;
// import jakarta.persistence.Table;

// @Entity
// @Table
public class Portfolio {
   // @Id
   // @SequenceGenerator(
   //    name="port",
   //    sequenceName="port",
   //    allocationSize=1
   // )
   // GeneratedValue(
   //    stategy=GeneratedId 
   // )
    private Integer id;
    private String name;
    private String description;
    private Integer datestart;
    private Integer dateend;
    private String tools;
    private String link;

    public Portfolio( Integer id, String name, String description, Integer datestart, Integer dateend, String tools, String link){
        this.id=id;
        this.name=name;
        this.description=description;
        this.datestart=datestart;
        this.dateend=dateend;
        this.tools=tools;
        this.link=link;
     }

     public void setId(Integer id){
        this.id=id;
     }

     public Integer getId(){
        return id;
     }

     public void setName(String name){
        this.name=name;
     }

     public String getName(){
        return name;
     }

     public void setDescription(String description){
        this.description=description;
     }

     public String getDescription(){
        return description;
     }

     public void setDatestart(Integer datestart){
        this.datestart=datestart;
     }

     public Integer getDatestart(){
        return datestart;
     }

    public void setDateend(Integer dateend){
        this.dateend=dateend;
     }

     public Integer getDateend(){
        return dateend;
     }

    public void setLink(String link){
        this.link=link;
     }

     public String getLink(){
        return link;
     }


     public void setTool(String tools){
        this.tools=tools;
     }

     public String getTools(){
        return tools;
     }

   
  
}
