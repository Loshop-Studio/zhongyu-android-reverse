package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j10, long j11, long j12, long j13, long j14, long j15, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m28826copytNS2XkQ$default(MenuItemColors menuItemColors, long j10, long j11, long j12, long j13, long j14, long j15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = menuItemColors.textColor;
        }
        return menuItemColors.m28827copytNS2XkQ(j10, (i10 & 2) != 0 ? menuItemColors.leadingIconColor : j11, (i10 & 4) != 0 ? menuItemColors.trailingIconColor : j12, (i10 & 8) != 0 ? menuItemColors.disabledTextColor : j13, (i10 & 16) != 0 ? menuItemColors.disabledLeadingIconColor : j14, (i10 & 32) != 0 ? menuItemColors.disabledTrailingIconColor : j15);
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m28827copytNS2XkQ(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new MenuItemColors(j10 != 16 ? j10 : this.textColor, j11 != 16 ? j11 : this.leadingIconColor, j12 != 16 ? j12 : this.trailingIconColor, j13 != 16 ? j13 : this.disabledTextColor, j14 != 16 ? j14 : this.disabledLeadingIconColor, j15 != 16 ? j15 : this.disabledTrailingIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.m30879equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m30879equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m30879equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m30879equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m30879equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m30879equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m28828getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m28829getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m28830getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m28831getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m28832getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m28833getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        return (((((((((Color.m30885hashCodeimpl(this.textColor) * 31) + Color.m30885hashCodeimpl(this.leadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.trailingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTextColor)) * 31) + Color.m30885hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTrailingIconColor);
    }

    @Stable
    /* renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m28834leadingIconColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @Stable
    /* renamed from: textColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m28835textColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.textColor : this.disabledTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m28836trailingIconColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    private MenuItemColors(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.textColor = j10;
        this.leadingIconColor = j11;
        this.trailingIconColor = j12;
        this.disabledTextColor = j13;
        this.disabledLeadingIconColor = j14;
        this.disabledTrailingIconColor = j15;
    }
}
