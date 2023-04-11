package com.github.axonsimple.command;

import lombok.Value;

@Value
public class ShipmentCreatedEvent {

    private final String shipmentId;
}
