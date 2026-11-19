package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i10, AbstractC9972n abstractC9972n) {
        this(windowInsets, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return AbstractC9979u.m20289b(this.insets, limitInsets.insets) && WindowInsetsSides.m27540equalsimpl0(this.sides, limitInsets.sides);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m27541hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m27551getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m27541hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m27547getAllowLeftInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.Companion.m27548getAllowLeftInRtlJoeWqyM$foundation_layout_release())) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m27541hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m27549getAllowRightInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.Companion.m27550getAllowRightInRtlJoeWqyM$foundation_layout_release())) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m27412getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m27541hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m27557getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m27542hashCodeimpl(this.sides);
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m27544toStringimpl(this.sides)) + ')';
    }

    private LimitInsets(WindowInsets windowInsets, int i10) {
        this.insets = windowInsets;
        this.sides = i10;
    }
}
