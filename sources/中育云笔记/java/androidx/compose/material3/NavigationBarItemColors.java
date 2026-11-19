package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class NavigationBarItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationBarItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16);
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationBarItemColors m28859copy4JmcsL4(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new NavigationBarItemColors(j10 != 16 ? j10 : this.selectedIconColor, j11 != 16 ? j11 : this.selectedTextColor, j12 != 16 ? j12 : this.selectedIndicatorColor, j13 != 16 ? j13 : this.unselectedIconColor, j14 != 16 ? j14 : this.unselectedTextColor, j15 != 16 ? j15 : this.disabledIconColor, j16 != 16 ? j16 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        return Color.m30879equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m30879equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m30879equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m30879equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m30879equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor) && Color.m30879equalsimpl0(this.disabledIconColor, navigationBarItemColors.disabledIconColor) && Color.m30879equalsimpl0(this.disabledTextColor, navigationBarItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m28860getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m28861getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m28862getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m28863getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m28864getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m28865getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m28866getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m28867getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return (((((((((((Color.m30885hashCodeimpl(this.selectedIconColor) * 31) + Color.m30885hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m30885hashCodeimpl(this.selectedTextColor)) * 31) + Color.m30885hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m30885hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m30885hashCodeimpl(this.disabledIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTextColor);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m28868iconColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z11 ? this.disabledIconColor : z10 ? this.selectedIconColor : this.unselectedIconColor;
    }

    @Stable
    /* renamed from: textColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m28869textColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return !z11 ? this.disabledTextColor : z10 ? this.selectedTextColor : this.unselectedTextColor;
    }

    private NavigationBarItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.selectedIconColor = j10;
        this.selectedTextColor = j11;
        this.selectedIndicatorColor = j12;
        this.unselectedIconColor = j13;
        this.unselectedTextColor = j14;
        this.disabledIconColor = j15;
        this.disabledTextColor = j16;
    }
}
