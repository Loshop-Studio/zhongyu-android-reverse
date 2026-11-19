package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m13558d2 = {"Landroidx/compose/material3/DefaultDrawerItemsColor;", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedContainerColor", "unselectedContainerColor", "selectedBadgeColor", "unselectedBadgeColor", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSelectedBadgeColor-0d7_KjU", "()J", "J", "getSelectedContainerColor-0d7_KjU", "getSelectedIconColor-0d7_KjU", "getSelectedTextColor-0d7_KjU", "getUnselectedBadgeColor-0d7_KjU", "getUnselectedContainerColor-0d7_KjU", "getUnselectedIconColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "badgeColor", "Landroidx/compose/runtime/State;", "selected", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "equals", "other", "", "hashCode", "", "iconColor", "textColor", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> badgeColor(boolean z9, Composer composer, int i10) {
        composer.startReplaceGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1106)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m20966boximpl(z9 ? this.selectedBadgeColor : this.unselectedBadgeColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> containerColor(boolean z9, Composer composer, int i10) {
        composer.startReplaceGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1099)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m20966boximpl(z9 ? this.selectedContainerColor : this.unselectedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) other;
        if (Color.m20977equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.m20977equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.m20977equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.m20977equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.m20977equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.m20977equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.m20977equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor)) {
            return Color.m20977equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor);
        }
        return false;
    }

    /* renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedBadgeColor() {
        return this.selectedBadgeColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedContainerColor() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedIconColor() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedTextColor() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedBadgeColor() {
        return this.unselectedBadgeColor;
    }

    /* renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedContainerColor() {
        return this.unselectedContainerColor;
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
        return (((((((((((((Color.m20983hashCodeimpl(this.selectedIconColor) * 31) + Color.m20983hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m20983hashCodeimpl(this.selectedTextColor)) * 31) + Color.m20983hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m20983hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m20983hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m20983hashCodeimpl(this.unselectedBadgeColor);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> iconColor(boolean z9, Composer composer, int i10) {
        composer.startReplaceGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1089)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m20966boximpl(z9 ? this.selectedIconColor : this.unselectedIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> textColor(boolean z9, Composer composer, int i10) {
        composer.startReplaceGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i10, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1094)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m20966boximpl(z9 ? this.selectedTextColor : this.unselectedTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stateRememberUpdatedState;
    }

    private DefaultDrawerItemsColor(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.selectedIconColor = j10;
        this.unselectedIconColor = j11;
        this.selectedTextColor = j12;
        this.unselectedTextColor = j13;
        this.selectedContainerColor = j14;
        this.unselectedContainerColor = j15;
        this.selectedBadgeColor = j16;
        this.unselectedBadgeColor = j17;
    }
}
