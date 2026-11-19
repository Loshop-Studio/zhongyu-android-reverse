package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.unit.C1700Dp;
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
@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B:\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\nJ'\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\fR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0019\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m5175d2 = {"Landroidx/compose/material3/SelectableChipBorder;", "", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "selectedBorderWidth", "(JJJJFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "F", "borderStroke", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderStroke$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectableChipBorder {
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;
    private final long disabledSelectedBorderColor;
    private final long selectedBorderColor;
    private final float selectedBorderWidth;

    public /* synthetic */ SelectableChipBorder(long j4, long j5, long j6, long j7, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6, j7, f4, f5);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z3, boolean z4, Composer composer, int i4) {
        composer.startReplaceableGroup(670222826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670222826, i4, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:2002)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m7087BorderStrokecXLIe8U(z4 ? this.selectedBorderWidth : this.borderWidth, z3 ? z4 ? this.selectedBorderColor : this.borderColor : z4 ? this.disabledSelectedBorderColor : this.disabledBorderColor), composer, 0);
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
        if (other == null || !(other instanceof SelectableChipBorder)) {
            return false;
        }
        SelectableChipBorder selectableChipBorder = (SelectableChipBorder) other;
        return Color.m9179equalsimpl0(this.borderColor, selectableChipBorder.borderColor) && Color.m9179equalsimpl0(this.selectedBorderColor, selectableChipBorder.selectedBorderColor) && Color.m9179equalsimpl0(this.disabledBorderColor, selectableChipBorder.disabledBorderColor) && Color.m9179equalsimpl0(this.disabledSelectedBorderColor, selectableChipBorder.disabledSelectedBorderColor) && C1700Dp.m11530equalsimpl0(this.borderWidth, selectableChipBorder.borderWidth) && C1700Dp.m11530equalsimpl0(this.selectedBorderWidth, selectableChipBorder.selectedBorderWidth);
    }

    public int hashCode() {
        return (((((((((Color.m9185hashCodeimpl(this.borderColor) * 31) + Color.m9185hashCodeimpl(this.selectedBorderColor)) * 31) + Color.m9185hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m9185hashCodeimpl(this.disabledSelectedBorderColor)) * 31) + C1700Dp.m11531hashCodeimpl(this.borderWidth)) * 31) + C1700Dp.m11531hashCodeimpl(this.selectedBorderWidth);
    }

    private SelectableChipBorder(long j4, long j5, long j6, long j7, float f4, float f5) {
        this.borderColor = j4;
        this.selectedBorderColor = j5;
        this.disabledBorderColor = j6;
        this.disabledSelectedBorderColor = j7;
        this.borderWidth = f4;
        this.selectedBorderWidth = f5;
    }
}
