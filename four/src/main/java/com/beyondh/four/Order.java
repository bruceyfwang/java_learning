package com.beyondh.four;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Order {
    String OrderId;
    int RoomCount;
}


