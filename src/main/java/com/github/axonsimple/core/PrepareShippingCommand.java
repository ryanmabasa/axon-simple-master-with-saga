package com.github.axonsimple.core;

import lombok.Value;

@Value
public class PrepareShippingCommand {
    private final String shipmentId;
}
