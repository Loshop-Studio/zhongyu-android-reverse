package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@Immutable
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    public /* synthetic */ ChipBorder(long j10, long j11, float f10, AbstractC9972n abstractC9972n) {
        this(j10, j11, f10);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i10, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2733)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m26979BorderStrokecXLIe8U(this.borderWidth, z10 ? this.borderColor : this.disabledBorderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.m30879equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m30879equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && C3186Dp.m33506equalsimpl0(this.borderWidth, chipBorder.borderWidth);
    }

    public int hashCode() {
        return (((Color.m30885hashCodeimpl(this.borderColor) * 31) + Color.m30885hashCodeimpl(this.disabledBorderColor)) * 31) + C3186Dp.m33507hashCodeimpl(this.borderWidth);
    }

    private ChipBorder(long j10, long j11, float f10) {
        this.borderColor = j10;
        this.disabledBorderColor = j11;
        this.borderWidth = f10;
    }
}
