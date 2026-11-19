package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m5110d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJLkotlin/jvm/internal/e;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "copy", "", "enabled", "textColor-vNxB06k$material3_release", "(Z)J", "leadingIconColor-vNxB06k$material3_release", "trailingIconColor-vNxB06k$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getTextColor-0d7_KjU", "()J", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,560:1\n708#2:561\n696#2:562\n708#2:563\n696#2:564\n708#2:565\n696#2:566\n708#2:567\n696#2:568\n708#2:569\n696#2:570\n708#2:571\n696#2:572\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n*L\n304#1:561\n304#1:562\n305#1:563\n305#1:564\n306#1:565\n306#1:566\n307#1:567\n307#1:568\n308#1:569\n308#1:570\n309#1:571\n309#1:572\n*E\n"})
/* loaded from: classes.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j7, long j8, long j9, long j10, long j11, long j12, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m8630copytNS2XkQ$default(MenuItemColors menuItemColors, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = menuItemColors.textColor;
        }
        return menuItemColors.m8631copytNS2XkQ(j7, (i & 2) != 0 ? menuItemColors.leadingIconColor : j8, (i & 4) != 0 ? menuItemColors.trailingIconColor : j9, (i & 8) != 0 ? menuItemColors.disabledTextColor : j10, (i & 16) != 0 ? menuItemColors.disabledLeadingIconColor : j11, (i & 32) != 0 ? menuItemColors.disabledTrailingIconColor : j12);
    }

    @NotNull
    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m8631copytNS2XkQ(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor) {
        return new MenuItemColors(textColor != 16 ? textColor : this.textColor, leadingIconColor != 16 ? leadingIconColor : this.leadingIconColor, trailingIconColor != 16 ? trailingIconColor : this.trailingIconColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) other;
        return Color.m10683equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m10683equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m10683equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m10683equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m10683equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m10683equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor);
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
        return Color.m10689hashCodeimpl(this.disabledTrailingIconColor) + AbstractC0584a.m904e(this.disabledLeadingIconColor, AbstractC0584a.m904e(this.disabledTextColor, AbstractC0584a.m904e(this.trailingIconColor, AbstractC0584a.m904e(this.leadingIconColor, Color.m10689hashCodeimpl(this.textColor) * 31, 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8638leadingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @Stable
    /* renamed from: textColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8639textColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.textColor : this.disabledTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8640trailingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    private MenuItemColors(long j7, long j8, long j9, long j10, long j11, long j12) {
        this.textColor = j7;
        this.leadingIconColor = j8;
        this.trailingIconColor = j9;
        this.disabledTextColor = j10;
        this.disabledLeadingIconColor = j11;
        this.disabledTrailingIconColor = j12;
    }
}
