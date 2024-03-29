package pzinsta.pizzeria.service;

import pzinsta.pizzeria.model.order.Order;
import pzinsta.pizzeria.model.order.OrderItem;
import pzinsta.pizzeria.model.pizza.BakeStyle;
import pzinsta.pizzeria.model.pizza.Crust;
import pzinsta.pizzeria.model.pizza.CutStyle;
import pzinsta.pizzeria.model.pizza.Ingredient;
import pzinsta.pizzeria.model.pizza.IngredientType;
import pzinsta.pizzeria.model.pizza.PizzaSize;
import pzinsta.pizzeria.service.dto.OrderDTO;
import pzinsta.pizzeria.service.dto.PizzaOrderDTO;
import pzinsta.pizzeria.service.dto.ReviewDTO;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OrderService {

    Collection<Crust> getCrusts();

    Collection<PizzaSize> getPizzaSizes();

    Collection<BakeStyle> getBakeStyles();

    Collection<CutStyle> getCutStyles();

    Collection<Ingredient> getIngredients();

    Collection<Integer> getQuantities();

    void addOrderItemToCart(PizzaOrderDTO pizzaOrderDTO);

    void removeOrderItem(int orderItemIndex);

    void emptyCart();

    void replaceOrderItem(int orderItemIndex, PizzaOrderDTO pizzaOrderDTO);

    PizzaOrderDTO getPizzaOrderDTOByOrderItemId(int orderItemIndex);

    IngredientType getIngredientTypeByIngredientId(Long ingredientId);

    Ingredient getIngredientById(Long ingredientId);

    Order postOrder(Order order);



    Order getOrderByTrackingNumber(String trackingNumber);

    void addReviewToOrderByTrackingNumber(String trackingNumber, ReviewDTO reviewDTO);

    OrderDTO getOrderDTOByTrackingNumber(String trackingNumber);

    Optional<PizzaOrderDTO> getPizzaOrderDTOByOrderItemId(Long orderItemId);

    Optional<PizzaOrderDTO> updatePizzaOrderDTOByOrderItemId(Long orderItemId, PizzaOrderDTO updatedOrderDTO);

    void deleteOrder(String trackingNumber);

    @Transactional
    void postOrderCreate(Order order, PizzaOrderDTO pizzaOrderDTO);

    List<OrderDTO> getAllOrdersForUser(Long id);
}
