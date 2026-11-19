package androidx.compose.material3;

import androidx.compose.p012ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m13413d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledLeadingIconColor-0d7_KjU", "()J", "J", "getDisabledTextColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getLeadingIconColor-0d7_KjU", "getTextColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "copy", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "equals", "", "other", "hashCode", "", "enabled", "leadingIconColor-vNxB06k$material3_release", "(Z)J", "textColor-vNxB06k$material3_release", "trailingIconColor-vNxB06k$material3_release", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,560:1\n708#2:561\n696#2:562\n708#2:563\n696#2:564\n708#2:565\n696#2:566\n708#2:567\n696#2:568\n708#2:569\n696#2:570\n708#2:571\n696#2:572\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n*L\n304#1:561\n304#1:562\n305#1:563\n305#1:564\n306#1:565\n306#1:566\n307#1:567\n307#1:568\n308#1:569\n308#1:570\n309#1:571\n309#1:572\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, j10, j11, j12, j13, j14);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m19400copytNS2XkQ$default(MenuItemColors menuItemColors, long j9, long j10, long j11, long j12, long j13, long j14, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = menuItemColors.textColor;
        }
        return menuItemColors.m19401copytNS2XkQ(j9, (i9 & 2) != 0 ? menuItemColors.leadingIconColor : j10, (i9 & 4) != 0 ? menuItemColors.trailingIconColor : j11, (i9 & 8) != 0 ? menuItemColors.disabledTextColor : j12, (i9 & 16) != 0 ? menuItemColors.disabledLeadingIconColor : j13, (i9 & 32) != 0 ? menuItemColors.disabledTrailingIconColor : j14);
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m19401copytNS2XkQ(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        return new MenuItemColors(textColor != 16 ? textColor : this.textColor, leadingIconColor != 16 ? leadingIconColor : this.leadingIconColor, trailingIconColor != 16 ? trailingIconColor : this.trailingIconColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) other;
        return Color.m21410equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m21410equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m21410equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m21410equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m21410equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m21410equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconColor() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        return (((((((((Color.m21416hashCodeimpl(this.textColor) * 31) + Color.m21416hashCodeimpl(this.leadingIconColor)) * 31) + Color.m21416hashCodeimpl(this.trailingIconColor)) * 31) + Color.m21416hashCodeimpl(this.disabledTextColor)) * 31) + Color.m21416hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m21416hashCodeimpl(this.disabledTrailingIconColor);
    }

    @Stable
    /* renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19408leadingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @Stable
    /* renamed from: textColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19409textColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.textColor : this.disabledTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m19410trailingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    private MenuItemColors(long j9, long j10, long j11, long j12, long j13, long j14) {
        this.textColor = j9;
        this.leadingIconColor = j10;
        this.trailingIconColor = j11;
        this.disabledTextColor = j12;
        this.disabledLeadingIconColor = j13;
        this.disabledTrailingIconColor = j14;
    }
}
