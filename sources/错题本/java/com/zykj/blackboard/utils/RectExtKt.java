package com.zykj.blackboard.utils;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m5110d2 = {"toRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "toRectF", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RectExtKt {
    @NotNull
    public static final Rect toRect(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "<this>");
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @NotNull
    public static final RectF toRectF(@NotNull Rect rect) {
        AbstractC5830k.m5330g(rect, "<this>");
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }
}
