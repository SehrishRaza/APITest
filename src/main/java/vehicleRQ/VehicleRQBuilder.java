package vehicleRQ;

public class VehicleRQBuilder {

    private String cor;
    private String lang;
    private String pickTime;

    public VehicleRQBuilder cor(String cor){
        this.cor = cor;
        return this;
    }

    public VehicleRQBuilder lang(String lang){
        this.lang = lang;
        return this;
    }

    public VehicleRQBuilder pickTime(String pickTime){
        this.pickTime = pickTime;
        return this;
    }

    public VehicleRQ build(){
        VehicleRQ vehicleRQ = new VehicleRQ();
        vehicleRQ.setCor(this.cor);
        vehicleRQ.setLang(this.lang);
        PickTime pickTime = new PickTime();
        pickTime.setPickTime(this.pickTime);
        vehicleRQ.setPickTime(pickTime);
        return vehicleRQ;
    }
}
