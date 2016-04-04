import converters.ObjectToXMLConverter;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import vehicleRQ.VehicleRQ;
import vehicleRQ.VehicleRQBuilder;
import vehicleRQ.VehicleRS;


public class TestClass {

    @Test
    public void apiTest() throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        VehicleRS vehicleRS = restTemplate.getForObject("http://www.mocky.io/v2/5702ce96270000f50506aec7", VehicleRS.class);
        vehicleRS.getQueryCount();
        vehicleRS.getVehicleInfo().getPricingCarId();
        vehicleRS.getVehicleInfo().getCar().getId();
        vehicleRS.getVehicleInfo().getSupplier().getLocId();
        vehicleRS.getVehicleInfo().getSupplier().getSupplierName();
    }

    @Test
    public void readRQ() throws Exception {

        VehicleRQBuilder builder = new VehicleRQBuilder();
        VehicleRQ rq = builder.cor("gb").lang("361").pickTime("2016-4-15 12:00").build();
        ObjectToXMLConverter.INSTANCE.converter(rq);
    }
}