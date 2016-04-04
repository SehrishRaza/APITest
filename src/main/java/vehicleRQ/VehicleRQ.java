package vehicleRQ;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "vehicleRQ")
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleRQ {

    @XmlAttribute
    private String cor;
    @XmlAttribute
    private String lang;

    @XmlElement
    private PickTime pickTime;

    public VehicleRQ() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public PickTime getPickTime() {
        return pickTime;
    }

    public void setPickTime(PickTime pickTime) {
        this.pickTime = pickTime;
    }
}
