package com.yata.backend.global.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
    PAYMENT_NOT_FOUND(404, "PAYMENT_NOT_FOUND"),
    PAYMENT_AMOUNT_EXP(400, "PAYMENT_AMOUNT_NOT_EQUAL"),

    TITLE_NONE(400, "TITLE_NONE"),
    MEMBER_NONE(404, "MEMBER_NONE"),

    MEMBER_DUPLICATE(409, "MEMBER_DUPLICATE"),
    TOKEN_INVALID(401, "TOKEN_INVALID"),
    EMAIL_NONE(400, "EMAIL_NEEDED"),
    TOKEN_NOT_EXPIRED(400, "TOKEN_NOT_EXPIRED"),
    REFRESH_TOKEN_NOT_FOUND(400, "REFRESH_TOKEN_NOT_FOUND"),
    REFRESH_TOKEN_INVALID(400, "REFRESH_TOKEN_INVALID"),
    REFRESH_TOKEN_NOT_MATCH(400, "REFRESH_TOKEN_NOT_MATCH"),
    ALREADY_APPLIED(409, "ALREADY_APPLIED"),
    ALREADY_INVITED(409, "ALREADY_INVITED"),
    //   ALREADY_APPROVED(409,"ALREADY_APPROVED"),
    CANNOT_DELETE(403, "CANNOT_DELETE"),
    POST_NONE(404, "POST_NONE"),
    YATA_NONE(404, "YATA_NONE"),
    YATAREQUEST_NONE(404, "YATAREQUEST_NONE"),
    YATA_IS_NOT_MODIFIABLE_STATUS(400, "YATA_IS_NOT_MODIFIABLE_STATUS"),
    PAYMENT_NOT_ENOUGH_POINT(400, "PAYMENT_NOT_ENOUGH_POINT"),
    YATA_STATUS_NONE(400, "YATA_STATUS_NONE"),
    EMAIL_VERIFY_NONE(401, "EMAIL_NOT_VERIFIED"),
    UNAUTHORIZED(403, "UNAUTHORIZED"),
    INVALID_ELEMENT(400, "INVALID_ELEMENT"),

    POST_STATUS_IS_NOT_SUITABLE(400, "POST_STATUS_IS_NOT_SUITABLE"),
    CHECKLIST_NONE(404,"CHECKLIST_NONE"),
    MEMBER_NOT_DRIVER(403, "MEMBER_NOT_DRIVER");

    @Getter
    private final int code;

    @Getter
    private final String message;

    ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
