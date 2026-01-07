package kz.lab.module1.advanced;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public record Order(long id, double price, LocalDateTime orderDate, Set<String> items ) {
    public Order {
        if(id < 0){throw new IllegalArgumentException("Id can't be negative");}
        if(price <= 0){throw new IllegalArgumentException("Price should be greater than 0");}
        if(orderDate.isAfter(LocalDateTime.now())){throw new IllegalArgumentException("Wrong date");}
        items = Set.copyOf(items);
    }
}
