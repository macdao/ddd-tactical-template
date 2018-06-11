package com.macdao.ecommerce.service.common.domain.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
public class AbstractIdentity implements Identity {
    @JsonValue
    private final String value;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + value + ')';
    }
}
