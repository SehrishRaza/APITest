package vehicleRQ;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="VehicleInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleInfo {
    @XmlAttribute
    private String pricingCarId;
    @XmlElement(name="Car")
    private Car car;

    @XmlElement(name = "Supplier")
    private Supplier supplier;


    public VehicleInfo() {

    }

    public String getPricingCarId() {
        return pricingCarId;
    }

    public void setPricingCarId(String pricingCarId) {
        this.pricingCarId = pricingCarId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


}
