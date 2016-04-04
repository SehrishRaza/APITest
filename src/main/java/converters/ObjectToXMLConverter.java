package converters;


import vehicleRQ.VehicleRQ;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public enum ObjectToXMLConverter  {

      INSTANCE;

    ObjectToXMLConverter() {
    }


    public void converter(VehicleRQ vehicleRQ) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(VehicleRQ.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(vehicleRQ, System.out);
    }
}
