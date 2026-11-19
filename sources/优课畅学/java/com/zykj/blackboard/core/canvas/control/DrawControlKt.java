package com.zykj.blackboard.core.canvas.control;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class DrawControlKt {
    public static final void clear(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "<this>");
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }
}
