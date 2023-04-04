package Day3;

public class Employee {
    private int eid;
    private String name;
    private double sallary;

    public void setSallary(double sallary){   //setter
        this.sallary = sallary;
    }
    public void setName(String name){        //setter
        this.name = name;
    }
    public double getSallary(){             //getter
        return this.sallary;
    }
    public void setEid(int eid){   //setter
        this.eid = eid;
    }
    public String getName(){             //getter
        return this.name;
    }
    public int getEid(){        //getter
        return this.eid;
    }

           public boolean equals(Object obj){
           return this.eid == ((Employee)obj).eid && this.name.equals(((Employee)obj).name);

    }

}