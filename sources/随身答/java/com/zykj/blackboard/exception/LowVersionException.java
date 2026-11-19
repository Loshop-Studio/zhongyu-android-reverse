package com.zykj.blackboard.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/blackboard/exception/LowVersionException;", "Ljava/lang/Exception;", "message", "", "(Ljava/lang/String;)V", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class LowVersionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowVersionException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
