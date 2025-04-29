public class P2 {
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String fname)
    {
        this.name=fname;
    }
    public static void main(String args[]){
            P2 ob=new P2();
            ob.setName("Justin");
        System.out.println(ob.getName());
    }
}
