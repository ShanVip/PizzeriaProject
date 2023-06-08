package pzinsta.pizzeria.service.dto;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class OrderDTO {

    public List<PizzaOrderDTO> getPizzaOrderList() {
        return pizzaOrderList;
    }

    public void setPizzaOrderList(List<PizzaOrderDTO> pizzaOrderList) {

        this.pizzaOrderList = pizzaOrderList;
    }

    private List<PizzaOrderDTO> pizzaOrderList;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
