package builder;


public class Display implements displays{
    private String name;


    public Display(String name) {
        setName(name);
    }

    @Override
    public void update(int min, int sec) {
        System.out.println("Czas w " + name + ""+ min+" : "+ sec);
    }

    public void setName(String name){
        this.name = name;
    }
}
