package androidx.compose.material3;

import androidx.compose.p006ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B:\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m5175d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "checked", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "equals", "other", "hashCode", "", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6, j7, j8, j9);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i4, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:886)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledContainerColor : !z4 ? this.containerColor : this.checkedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> contentColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i4, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:902)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledContentColor : !z4 ? this.contentColor : this.checkedContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) other;
        return Color.m9179equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m9179equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m9179equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m9179equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m9179equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m9179equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    public int hashCode() {
        return (((((((((Color.m9185hashCodeimpl(this.containerColor) * 31) + Color.m9185hashCodeimpl(this.contentColor)) * 31) + Color.m9185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m9185hashCodeimpl(this.disabledContentColor)) * 31) + Color.m9185hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m9185hashCodeimpl(this.checkedContentColor);
    }

    private IconToggleButtonColors(long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j4;
        this.contentColor = j5;
        this.disabledContainerColor = j6;
        this.disabledContentColor = j7;
        this.checkedContainerColor = j8;
        this.checkedContentColor = j9;
    }
}
