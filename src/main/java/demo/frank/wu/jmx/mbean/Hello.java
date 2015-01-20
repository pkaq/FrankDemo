package demo.frank.wu.jmx.mbean;

public class Hello implements HelloMBean {
    
    private String name;

    /* (non-Javadoc)
     * @see jmx.HelloMBeanA#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see jmx.HelloMBeanA#setName(java.lang.String)
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    /* (non-Javadoc)
     * @see jmx.HelloMBeanA#printHello()
     */
    @Override
    public void printHello(){
        System.err.println("name:"+this.name);
    }
    
    /* (non-Javadoc)
     * @see jmx.HelloMBeanA#printHello(java.lang.String)
     */
    @Override
    public void printHello(String wn){
        System.err.println("name:"+wn);
    }
}
