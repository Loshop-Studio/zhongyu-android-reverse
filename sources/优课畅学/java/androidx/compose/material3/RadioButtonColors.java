package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ RadioButtonColors(long j10, long j11, long j12, long j13, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m22388copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = radioButtonColors.selectedColor;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = radioButtonColors.unselectedColor;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = radioButtonColors.disabledSelectedColor;
        }
        return radioButtonColors.m22389copyjRlVdoo(j14, j15, j12, (i10 & 8) != 0 ? radioButtonColors.disabledUnselectedColor : j13);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m22389copyjRlVdoo(long j10, long j11, long j12, long j13) {
        return new RadioButtonColors(j10 != 16 ? j10 : this.selectedColor, j11 != 16 ? j11 : this.unselectedColor, j12 != 16 ? j12 : this.disabledSelectedColor, j13 != 16 ? j13 : this.disabledUnselectedColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.m24277equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m24277equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m24277equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m24277equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m22390getDisabledSelectedColor0d7_KjU() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m22391getDisabledUnselectedColor0d7_KjU() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name */
    public final long m22392getSelectedColor0d7_KjU() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name */
    public final long m22393getUnselectedColor0d7_KjU() {
        return this.unselectedColor;
    }

    public int hashCode() {
        return (((((Color.m24283hashCodeimpl(this.selectedColor) * 31) + Color.m24283hashCodeimpl(this.unselectedColor)) * 31) + Color.m24283hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m24283hashCodeimpl(this.disabledUnselectedColor);
    }

    @Composable
    public final State<Color> radioColor$material3_release(boolean z10, boolean z11, Composer composer, int i10) {
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i10, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        long j10 = (z10 && z11) ? this.selectedColor : (!z10 || z11) ? (z10 || !z11) ? this.disabledUnselectedColor : this.disabledSelectedColor : this.unselectedColor;
        if (z10) {
            composer.startReplaceGroup(350067971);
            stateRememberUpdatedState = SingleValueAnimationKt.m20221animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(350170674);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m24266boximpl(j10), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    private RadioButtonColors(long j10, long j11, long j12, long j13) {
        this.selectedColor = j10;
        this.unselectedColor = j11;
        this.disabledSelectedColor = j12;
        this.disabledUnselectedColor = j13;
    }
}
