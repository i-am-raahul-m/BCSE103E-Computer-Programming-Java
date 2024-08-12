public class MultipleParamConst {
    int modelYear;
    String modelName;
    long regNo;
    boolean available;
    double price;
    public MultipleParamConst(int mY, String mN, long rN, boolean a, double p)
    {
        modelYear = mY;
        modelName = mN;
        regNo = rN;
        available = a;
        price = p;
    }
    public static void main(String[] args)
    {
        MultipleParamConst myObj = new MultipleParamConst(2005, "Chevvy", 267347772414L, true, 86.54);
        System.out.println(myObj.modelYear + " " + myObj.modelName + " " + myObj.regNo + " " + myObj.available + " " + myObj.price);
    }
}
