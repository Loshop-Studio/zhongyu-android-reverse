package com.zykj.blackboard.exception;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class FileVerificationException extends Exception {
    private final String filePath;
    private final String validate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileVerificationException(String filePath, String validate) {
        super(filePath);
        AbstractC9133u.m16133g(filePath, "filePath");
        AbstractC9133u.m16133g(validate, "validate");
        this.filePath = filePath;
        this.validate = validate;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.filePath + " 校验值:" + this.validate;
    }
}
