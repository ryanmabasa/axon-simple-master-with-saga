package com.github.axonsimple.command;

import com.github.axonsimple.core.CreateRoomCommand;
import com.github.axonsimple.core.RoomCreatedEvent;
import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.Id;

@Aggregate
@Entity
@Data
public class Shipment {
    private static Logger logger = LoggerFactory.getLogger(ChatRoom.class);

    @AggregateIdentifier
    @Id
    private String shipmentId;

    @CommandHandler
    public Shipment(ShipmentCommand command) {
        logger.debug("[Aggregate][Command] Handle command: {}", command);
        this.shipmentId=command.getShipmentId();
        AggregateLifecycle.apply(new ShipmentCreatedEvent(shipmentId));
    }



}
