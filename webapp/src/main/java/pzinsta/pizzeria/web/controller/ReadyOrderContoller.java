//package pzinsta.pizzeria.web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import pzinsta.pizzeria.model.order.Order;
//import pzinsta.pizzeria.service.OrderService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/readyOrder")
//public class ReadyOrderContoller {
//    private final OrderService orderService;
//
//    @Autowired
//    public ReadyOrderContoller(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping("/orders")
//    public String showPizzaOrders(Model model) {
//        List<Order> orders = orderService.getAllOrders();
//        model.addAttribute("orders", orders);
//        return "pizzaOrders";
//    }
//
//}
