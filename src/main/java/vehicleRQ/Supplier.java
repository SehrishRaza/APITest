package vehicleRQ;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Supplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier {
    @XmlAttribute
    private String locId;

    @XmlValue
    private String supplierName;

    public Supplier() {
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
