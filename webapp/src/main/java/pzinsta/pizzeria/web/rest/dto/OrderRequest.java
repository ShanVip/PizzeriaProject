package pzinsta.pizzeria.web.rest.dto;

import pzinsta.pizzeria.model.order.Order;
import pzinsta.pizzeria.service.dto.PizzaOrderDTO;

public class OrderRequest {
    private Order order;
    private PizzaOrderDTO pizzaOrderDTO;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PizzaOrderDTO getPizzaOrderDTO() {
        return pizzaOrderDTO;
    }

    public void setPizzaOrderDTO(PizzaOrderDTO pizzaOrderDTO) {
        this.pizzaOrderDTO = pizzaOrderDTO;
    }
}