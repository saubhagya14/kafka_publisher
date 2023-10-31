package ed.api_config_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ed.api_config_server.constants.AppConstant;
import ed.api_config_server.model.Order;

@RestController
public class OrderRestController {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	@PostMapping("/order")
	public String placeorder(@RequestBody Order order) {
		kafkaTemplate.send(AppConstant.TOPIC, order);
		return "Order Placed!!";
	}
	
}
