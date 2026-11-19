package androidx.compose.foundation;

import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f10, Brush brush, AbstractC9972n abstractC9972n) {
        this(f10, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m26976copyD5KLDUw$default(BorderStroke borderStroke, float f10, Brush brush, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStroke.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m26977copyD5KLDUw(f10, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m26977copyD5KLDUw(float f10, Brush brush) {
        return new BorderStroke(f10, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return C3186Dp.m33506equalsimpl0(this.width, borderStroke.width) && AbstractC9979u.m20289b(this.brush, borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m26978getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C3186Dp.m33507hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) C3186Dp.m33512toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f10, Brush brush) {
        this.width = f10;
        this.brush = brush;
    }
}
