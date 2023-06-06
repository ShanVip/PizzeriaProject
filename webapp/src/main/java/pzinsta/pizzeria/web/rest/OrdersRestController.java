package pzinsta.pizzeria.web.rest;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pzinsta.pizzeria.service.OrderService;
import pzinsta.pizzeria.service.dto.PizzaOrderDTO;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/asdf")
public class OrdersRestController {

    private OrderService orderService;

    @Autowired
    public OrdersRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order/{orderId}")
    public PizzaOrderDTO getUsers(@PathVariable("orderId") Integer orderId) {
        return orderService.getPizzaOrderDTOByOrderItemId(orderId);
    }

    @GetMapping("/track/{trackingNumber}")
    public PizzaOrderDTO showOrderTracker(@PathVariable("trackingNumber") String trackingNumber) {
        return orderService.getOrderDTOByTrackingNumber(trackingNumber);
    }

//    @GetMapping(params = {"offset", "limit"})
//    public Map<String, Object> getUsers(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
//        return ImmutableMap.of(
//                "totalCount", userService.getTotalCount(),
//                "users", userService.getUsers(offset, limit));
//    }
//
//    @GetMapping("/{userId}")
//    public UserDTO getUserById(@PathVariable("userId") Long userId) {
//        return userService.getUserById(userId);
//    }
//
//    @PutMapping
//    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
//        return userService.updateUser(userDTO);
//    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public UserDTO addUser(@RequestBody UserAndAccountDTO userAndAccountDTO) {
//        Optional.ofNullable(userAndAccountDTO.getAccountDTO())
//                .ifPresent(accountDTO -> accountDTO.setPassword(passwordEncoder.encode(accountDTO.getPassword())));
//        return userService.addUser(userAndAccountDTO.getUserDTO(), userAndAccountDTO.getAccountDTO());
//    }

//    @ExceptionHandler(UserNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String handleUserNotFoundException(Exception e) {
//        return e.getMessage();
//    }

//    TODO: public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
}
