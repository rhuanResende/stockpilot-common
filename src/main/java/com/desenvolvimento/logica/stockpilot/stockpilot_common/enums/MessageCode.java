package com.desenvolvimento.logica.stockpilot.stockpilot_common.enums;

import lombok.Getter;

@Getter
public enum MessageCode {

    //ERRORS
    ERROR_ACCESS_DENIED("ERR001"),
    ERROR_UNAUTHENTICATED("ERR002")

    ;

    private final String code;

    MessageCode(String code) {
        this.code = code;
    }
}
