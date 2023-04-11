package com.github.axonsimple.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class ShipmentCommand {
    @TargetAggregateIdentifier
    private final String shipmentId;
}
