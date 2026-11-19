package com.zykj.blackboard.core.canvas.control;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Landroid/graphics/Canvas;", "Ld6/s;", "clear", "(Landroid/graphics/Canvas;)V", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DrawControlKt {
    public static final void clear(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "<this>");
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }
}
