package pzinsta.pizzeria.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pzinsta.pizzeria.model.order.Order;
import pzinsta.pizzeria.service.OrderService;
import pzinsta.pizzeria.service.dto.OrderDTO;
import pzinsta.pizzeria.service.dto.PizzaOrderDTO;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/asdf")
public class OrdersRestController {

    private OrderService orderService;

    @Autowired
    public OrdersRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order/{orderId}")
    public PizzaOrderDTO getPizzaOrderItem(@PathVariable("orderId") Long orderItemId) {
        return orderService.getPizzaOrderDTOByOrderItemId(orderItemId).get();
    }

    @GetMapping("/track/{trackingNumber}")
    public OrderDTO showOrderTracker(@PathVariable("trackingNumber") String trackingNumber) {
        return orderService.getOrderDTOByTrackingNumber(trackingNumber);
    }


    @PutMapping("/order/{orderItemId}")
    public PizzaOrderDTO updatePizzaOrderDTOByOrderItemId(
            @PathVariable Long orderItemId,
            @RequestBody PizzaOrderDTO updatedOrderDTO) {
        return orderService.updatePizzaOrderDTOByOrderItemId(orderItemId, updatedOrderDTO).get();
    }


    @Transactional
    @DeleteMapping("/track/{trackingNumber}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(
            @PathVariable("trackingNumber") String trackingNumber
    ) {
      orderService.deleteOrder(trackingNumber);
    }

    @PostMapping("/order/createorder")
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order order) {
        System.out.println("СМОТРИ ТУТ ВНИМАТЕЛЬНО " + order.getOrderItems());
        return orderService.postOrder(order);

    }

    @PostMapping("/order/createorder2")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder2(@RequestBody Order order, PizzaOrderDTO pizzaOrderDTO) {
        orderService.postOrderCreate(order, pizzaOrderDTO);
    }

    @GetMapping("/{id}")
    public List<OrderDTO> getAllOrdersForUser(@PathVariable Long id) {
        return orderService.getAllOrdersForUser(id);
    }

}
