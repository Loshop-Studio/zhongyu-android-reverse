package androidx.compose.material3;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f10, float f11, float f12, AbstractC9972n abstractC9972n) {
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
        return C3186Dp.m33506equalsimpl0(this.left, tabPosition.left) && C3186Dp.m33506equalsimpl0(this.width, tabPosition.width) && C3186Dp.m33506equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m29190getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m29191getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m29192getRightD9Ej5fM() {
        return C3186Dp.m33501constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m29193getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (((C3186Dp.m33507hashCodeimpl(this.left) * 31) + C3186Dp.m33507hashCodeimpl(this.width)) * 31) + C3186Dp.m33507hashCodeimpl(this.contentWidth);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) C3186Dp.m33512toStringimpl(this.left)) + ", right=" + ((Object) C3186Dp.m33512toStringimpl(m29192getRightD9Ej5fM())) + ", width=" + ((Object) C3186Dp.m33512toStringimpl(this.width)) + ", contentWidth=" + ((Object) C3186Dp.m33512toStringimpl(this.contentWidth)) + ')';
    }

    private TabPosition(float f10, float f11, float f12) {
        this.left = f10;
        this.width = f11;
        this.contentWidth = f12;
    }
}
