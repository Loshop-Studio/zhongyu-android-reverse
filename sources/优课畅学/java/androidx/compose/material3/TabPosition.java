package androidx.compose.material3;

import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f10, float f11, float f12, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return C3156Dp.m26904equalsimpl0(this.left, tabPosition.left) && C3156Dp.m26904equalsimpl0(this.width, tabPosition.width) && C3156Dp.m26904equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m22588getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m22589getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m22590getRightD9Ej5fM() {
        return C3156Dp.m26899constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m22591getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (((C3156Dp.m26905hashCodeimpl(this.left) * 31) + C3156Dp.m26905hashCodeimpl(this.width)) * 31) + C3156Dp.m26905hashCodeimpl(this.contentWidth);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) C3156Dp.m26910toStringimpl(this.left)) + ", right=" + ((Object) C3156Dp.m26910toStringimpl(m22590getRightD9Ej5fM())) + ", width=" + ((Object) C3156Dp.m26910toStringimpl(this.width)) + ", contentWidth=" + ((Object) C3156Dp.m26910toStringimpl(this.contentWidth)) + ')';
    }

    private TabPosition(float f10, float f11, float f12) {
        this.left = f10;
        this.width = f11;
        this.contentWidth = f12;
    }
}
