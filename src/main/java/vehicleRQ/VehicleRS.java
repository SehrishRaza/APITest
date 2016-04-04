package vehicleRQ;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "VehicleRS")
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleRS {
    @XmlAttribute
    private String queryCount;
    @XmlElement(name="VehicleInfo")
    private VehicleInfo vehicleInfo;


    public VehicleRS() {
    }

    public String getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(String queryCount) {
        this.queryCount = queryCount;
    }


    public VehicleInfo getVehicleInfo() {
        return vehicleInfo;
    }


    public void setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }


}
