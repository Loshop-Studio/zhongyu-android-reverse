package androidx.compose.foundation;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    public /* synthetic */ BorderStroke(float f10, Brush brush, AbstractC9126n abstractC9126n) {
        this(f10, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m20374copyD5KLDUw$default(BorderStroke borderStroke, float f10, Brush brush, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStroke.width;
        }
        if ((i10 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m20375copyD5KLDUw(f10, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m20375copyD5KLDUw(float f10, Brush brush) {
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
        return C3156Dp.m26904equalsimpl0(this.width, borderStroke.width) && AbstractC9133u.m16128b(this.brush, borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m20376getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (C3156Dp.m26905hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) C3156Dp.m26910toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    private BorderStroke(float f10, Brush brush) {
        this.width = f10;
        this.brush = brush;
    }
}
