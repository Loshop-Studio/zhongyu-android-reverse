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
@ExperimentalMaterial3Api
@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Br\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0010J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0017J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0017J(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0017R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m5175d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "Landroidx/compose/runtime/State;", "enabled", "", "selected", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "labelColor$material3_release", "leadingIconContentColor", "leadingIconContentColor$material3_release", "trailingIconContentColor", "trailingIconContentColor$material3_release", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectableChipColors {
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    public /* synthetic */ SelectableChipColors(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i4, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1884)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? z4 ? this.disabledSelectedContainerColor : this.disabledContainerColor : !z4 ? this.containerColor : this.selectedContainerColor), composer, 0);
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
        if (other == null || !(other instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) other;
        return Color.m9179equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m9179equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m9179equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m9179equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m9179equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m9179equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m9179equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m9179equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m9179equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m9179equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m9179equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m9179equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m9179equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m9185hashCodeimpl(this.containerColor) * 31) + Color.m9185hashCodeimpl(this.labelColor)) * 31) + Color.m9185hashCodeimpl(this.leadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.trailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m9185hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m9185hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m9185hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m9185hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m9185hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.selectedTrailingIconColor);
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(-829231549);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829231549, i4, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1900)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledLabelColor : !z4 ? this.labelColor : this.selectedLabelColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconContentColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(-1112029563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112029563, i4, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1916)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledLeadingIconColor : !z4 ? this.leadingIconColor : this.selectedLeadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconContentColor$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(963620819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(963620819, i4, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1932)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledTrailingIconColor : !z4 ? this.trailingIconColor : this.selectedTrailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    private SelectableChipColors(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.containerColor = j4;
        this.labelColor = j5;
        this.leadingIconColor = j6;
        this.trailingIconColor = j7;
        this.disabledContainerColor = j8;
        this.disabledLabelColor = j9;
        this.disabledLeadingIconColor = j10;
        this.disabledTrailingIconColor = j11;
        this.selectedContainerColor = j12;
        this.disabledSelectedContainerColor = j13;
        this.selectedLabelColor = j14;
        this.selectedLeadingIconColor = j15;
        this.selectedTrailingIconColor = j16;
    }
}
