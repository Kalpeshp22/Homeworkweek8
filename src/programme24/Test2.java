package programme24;

class Test2 {
    public static void main(String args[]) {
        SBIExtendsBank s = new SBIExtendsBank();
        ICICIExtendsBank i = new ICICIExtendsBank();
        AXISExtendsBank a = new AXISExtendsBank();
        System.out.println("SBI Rate Of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate Of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest: " + a.getRateOfInterest());


    }
}