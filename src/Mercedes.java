public class Mercedes extends Price implements CarWorks {

    Price price = new Price();
    @Override
    public int TO() {
       return price.priceForTo=120;
    }

    @Override
    public int Diagnostic() {
        return price.priceForDiagnostic=50;
    }

    @Override
    public int Stage() {
        return price.priceForStage=700;
    }
}
