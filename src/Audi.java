public class Audi extends  Price implements CarWorks {

    Price price = new Price();
    @Override
    public int TO() {
        return price.priceForTo=110;
    }

    @Override
    public int Diagnostic() {
        return price.priceForDiagnostic=50;
    }

    @Override
    public int Stage() {
        return price.priceForStage=600;
    }

}
