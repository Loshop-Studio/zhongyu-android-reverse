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
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001a\u0010'\u001a\u00020\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m5110d2 = {"Landroidx/compose/material3/NavigationRailItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/e;)V", "copy-4JmcsL4", "(JJJJJJJ)Landroidx/compose/material3/NavigationRailItemColors;", "copy", "", "selected", "enabled", "iconColor-WaAFU9c$material3_release", "(ZZ)J", "iconColor", "textColor-WaAFU9c$material3_release", "textColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedIconColor-0d7_KjU", "()J", "getSelectedTextColor-0d7_KjU", "getSelectedIndicatorColor-0d7_KjU", "getUnselectedIconColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "getDisabledIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getIndicatorColor-0d7_KjU$material3_release", "indicatorColor", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,749:1\n708#2:750\n696#2:751\n708#2:752\n696#2:753\n708#2:754\n696#2:755\n708#2:756\n696#2:757\n708#2:758\n696#2:759\n708#2:760\n696#2:761\n708#2:762\n696#2:763\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n*L\n425#1:750\n425#1:751\n426#1:752\n426#1:753\n427#1:754\n427#1:755\n428#1:756\n428#1:757\n429#1:758\n429#1:759\n430#1:760\n430#1:761\n431#1:762\n431#1:763\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationRailItemColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13);
    }

    @NotNull
    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationRailItemColors m8728copy4JmcsL4(long selectedIconColor, long selectedTextColor, long selectedIndicatorColor, long unselectedIconColor, long unselectedTextColor, long disabledIconColor, long disabledTextColor) {
        return new NavigationRailItemColors(selectedIconColor != 16 ? selectedIconColor : this.selectedIconColor, selectedTextColor != 16 ? selectedTextColor : this.selectedTextColor, selectedIndicatorColor != 16 ? selectedIndicatorColor : this.selectedIndicatorColor, unselectedIconColor != 16 ? unselectedIconColor : this.unselectedIconColor, unselectedTextColor != 16 ? unselectedTextColor : this.unselectedTextColor, disabledIconColor != 16 ? disabledIconColor : this.disabledIconColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) other;
        return Color.m10683equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m10683equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m10683equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m10683equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m10683equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor) && Color.m10683equalsimpl0(this.disabledIconColor, navigationRailItemColors.disabledIconColor) && Color.m10683equalsimpl0(this.disabledTextColor, navigationRailItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getSelectedIndicatorColor() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedIconColor() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m8733getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedTextColor() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedIconColor() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedTextColor() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.disabledTextColor) + AbstractC0584a.m904e(this.disabledIconColor, AbstractC0584a.m904e(this.selectedIndicatorColor, AbstractC0584a.m904e(this.unselectedTextColor, AbstractC0584a.m904e(this.selectedTextColor, AbstractC0584a.m904e(this.unselectedIconColor, Color.m10689hashCodeimpl(this.selectedIconColor) * 31, 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8737iconColorWaAFU9c$material3_release(boolean selected, boolean enabled) {
        return !enabled ? this.disabledIconColor : selected ? this.selectedIconColor : this.unselectedIconColor;
    }

    @Stable
    /* renamed from: textColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8738textColorWaAFU9c$material3_release(boolean selected, boolean enabled) {
        return !enabled ? this.disabledTextColor : selected ? this.selectedTextColor : this.unselectedTextColor;
    }

    private NavigationRailItemColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.selectedIconColor = j7;
        this.selectedTextColor = j8;
        this.selectedIndicatorColor = j9;
        this.unselectedIconColor = j10;
        this.unselectedTextColor = j11;
        this.disabledIconColor = j12;
        this.disabledTextColor = j13;
    }
}
