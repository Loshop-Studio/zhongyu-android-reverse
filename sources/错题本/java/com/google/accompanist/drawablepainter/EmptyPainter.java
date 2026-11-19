package com.google.accompanist.drawablepainter;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/google/accompanist/drawablepainter/EmptyPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "()V", "drawablepainter_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class EmptyPainter extends Painter {
    static {
        new EmptyPainter();
    }

    private EmptyPainter() {
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo11353getIntrinsicSizeNHjbRc() {
        return Size.INSTANCE.m10518getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        AbstractC5830k.m5330g(drawScope, "<this>");
    }
}
