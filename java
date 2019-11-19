
  abstract class  CShape
   {
     protected String color;
       public void setColor(String str){
     color=str;
    }
    public abstract void show();
   }
   class CTriangle extends CShape
   {
     protected double a,b,c;
     public CTriangle(double x,double y,double z)
     {
      a=h;
      b=w;
      c=z;
     }
     public void show(){
       System.out.print("color"+color+",");
       System.out.print("area"+0.5*a*b);
     }
   }
   
  public class main{
    public static void main(String[] args){
      CTriangle tri=new CTriangle(3, 4, 5);
      tri.setColor("red");
      tri.show();
    }
  }
  
