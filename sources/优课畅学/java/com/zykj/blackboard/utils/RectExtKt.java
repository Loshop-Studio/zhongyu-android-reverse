package com.zykj.blackboard.utils;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class RectExtKt {
    public static final Rect toRect(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "<this>");
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static final RectF toRectF(Rect rect) {
        AbstractC9133u.m16133g(rect, "<this>");
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }
}
