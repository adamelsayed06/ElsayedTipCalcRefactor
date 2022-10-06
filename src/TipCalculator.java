public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercent;
    private double totalBeforeTip;

    public TipCalculator(int num, int percent){
        numPeople = num;
        tipPercent = percent;
        totalBeforeTip = 0.0;
    }

    public double getTotalBeforeTip(){
        return totalBeforeTip;
    }

    public int getTipPercent(){
        return tipPercent;
    }

    public void addMeal(double cost){
        totalBeforeTip += cost;
    }

    public double tipAmount(){
        return (totalBeforeTip * (tipPercent / 100.0));
    }

    public double totalBill(){
        return (totalBeforeTip + tipAmount());
    }

    public double perPersonCostBeforeTip(){
        return (totalBeforeTip / numPeople);
    }

    public double perPersonTipAmount(){
        return (tipAmount() / numPeople);
    }

    public double perPersonTotalCost(){
        return ((totalBill() / numPeople));
    }

}
