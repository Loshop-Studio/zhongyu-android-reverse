package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.InterfaceC8721a;

@Immutable
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    public /* synthetic */ ChipBorder(long j10, long j11, float f10, AbstractC9126n abstractC9126n) {
        this(j10, j11, f10);
    }

    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i10, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2733)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m20377BorderStrokecXLIe8U(this.borderWidth, z10 ? this.borderColor : this.disabledBorderColor), composer, 0);
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
        return Color.m24277equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m24277equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && C3156Dp.m26904equalsimpl0(this.borderWidth, chipBorder.borderWidth);
    }

    public int hashCode() {
        return (((Color.m24283hashCodeimpl(this.borderColor) * 31) + Color.m24283hashCodeimpl(this.disabledBorderColor)) * 31) + C3156Dp.m26905hashCodeimpl(this.borderWidth);
    }

    private ChipBorder(long j10, long j11, float f10) {
        this.borderColor = j10;
        this.disabledBorderColor = j11;
        this.borderWidth = f10;
    }
}
