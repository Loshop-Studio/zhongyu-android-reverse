package com.zykj.blackboard.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"Lcom/zykj/blackboard/exception/EmptyDataException;", "Ljava/lang/Exception;", "message", "", "(Ljava/lang/String;)V", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class EmptyDataException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyDataException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
