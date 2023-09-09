interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements ChildSampleInterface{


    @Override
    public void meth3() {
        System.out.println("I am Method 3");
    }

    @Override
    public void meth4() {
        System.out.println("I am Method 4");
    }

    @Override
    public void meth1() {
        System.out.println("I am Method 1");
    }

    @Override
    public void meth2() {
        System.out.println("I am Method 2");
    }
}

public class InheritanceInInterfaces{
    public static void main(String[] args) {
        mySampleClass msc = new mySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();

    }
}
