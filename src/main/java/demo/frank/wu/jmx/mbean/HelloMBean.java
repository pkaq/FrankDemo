package demo.frank.wu.jmx.mbean;

public interface HelloMBean {

    public abstract String getName();

    public abstract void setName(String name);

    public abstract void printHello();

    public abstract void printHello(String wn);

}