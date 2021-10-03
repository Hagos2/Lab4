package Assignment4;

public class WeightConvertor {
    public double weight;
    public static final double MOON_WEIGH_CONVERTER=0.167;
    public static void main(String[]args){
   WeightConvertor wc = new WeightConvertor();
double myMoonWeight=wc.computeMoonWeight(160);
System.out.println(myMoonWeight);
    }

    public double computeMoonWeight(double weight) {
        this. weight= weight;
       return weight*MOON_WEIGH_CONVERTER;

    }
}
