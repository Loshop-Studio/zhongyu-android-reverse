package com.zykj.sketch.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/sketch/exception/HighVersionException;", "Ljava/lang/Exception;", "message", "", "(Ljava/lang/String;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class HighVersionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighVersionException(@NotNull String message) {
        super(message);
        AbstractC5830k.m5330g(message, "message");
    }
}
