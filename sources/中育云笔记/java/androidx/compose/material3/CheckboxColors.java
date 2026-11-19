package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f1281On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m28415copy2qZNXz8$default(CheckboxColors checkboxColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long j22;
        long j23;
        long j24 = (i10 & 1) != 0 ? checkboxColors.checkedCheckmarkColor : j10;
        long j25 = (i10 & 2) != 0 ? checkboxColors.uncheckedCheckmarkColor : j11;
        long j26 = (i10 & 4) != 0 ? checkboxColors.checkedBoxColor : j12;
        long j27 = (i10 & 8) != 0 ? checkboxColors.uncheckedBoxColor : j13;
        long j28 = (i10 & 16) != 0 ? checkboxColors.disabledCheckedBoxColor : j14;
        long j29 = (i10 & 32) != 0 ? checkboxColors.disabledUncheckedBoxColor : j15;
        long j30 = (i10 & 64) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j16;
        long j31 = j24;
        long j32 = (i10 & 128) != 0 ? checkboxColors.checkedBorderColor : j17;
        long j33 = (i10 & 256) != 0 ? checkboxColors.uncheckedBorderColor : j18;
        long j34 = (i10 & 512) != 0 ? checkboxColors.disabledBorderColor : j19;
        long j35 = (i10 & 1024) != 0 ? checkboxColors.disabledUncheckedBorderColor : j20;
        if ((i10 & 2048) != 0) {
            j23 = j35;
            j22 = checkboxColors.disabledIndeterminateBorderColor;
        } else {
            j22 = j21;
            j23 = j35;
        }
        return checkboxColors.m28416copy2qZNXz8(j31, j25, j26, j27, j28, j29, j30, j32, j33, j34, j23, j22);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z10, ToggleableState toggleableState, Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i10, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.checkedBorderColor;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.uncheckedBorderColor;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i12 == 1) {
                j10 = this.disabledBorderColor;
            } else if (i12 == 2) {
                j10 = this.disabledIndeterminateBorderColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.disabledUncheckedBorderColor;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceGroup(-1725816497);
            stateRememberUpdatedState = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1725635953);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(j11), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> boxColor$material3_release(boolean z10, ToggleableState toggleableState, Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i10, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.checkedBoxColor;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.uncheckedBoxColor;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i12 == 1) {
                j10 = this.disabledCheckedBoxColor;
            } else if (i12 == 2) {
                j10 = this.disabledIndeterminateBoxColor;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.disabledUncheckedBoxColor;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceGroup(-392211906);
            stateRememberUpdatedState = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-392031362);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(j11), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i10, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State<Color> stateM26823animateColorAsStateeuL9pac = SingleValueAnimationKt.m26823animateColorAsStateeuL9pac(toggleableState == toggleableState2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM26823animateColorAsStateeuL9pac;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final CheckboxColors m28416copy2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new CheckboxColors(j10 != 16 ? j10 : this.checkedCheckmarkColor, j11 != 16 ? j11 : this.uncheckedCheckmarkColor, j12 != 16 ? j12 : this.checkedBoxColor, j13 != 16 ? j13 : this.uncheckedBoxColor, j14 != 16 ? j14 : this.disabledCheckedBoxColor, j15 != 16 ? j15 : this.disabledUncheckedBoxColor, j16 != 16 ? j16 : this.disabledIndeterminateBoxColor, j17 != 16 ? j17 : this.checkedBorderColor, j18 != 16 ? j18 : this.uncheckedBorderColor, j19 != 16 ? j19 : this.disabledBorderColor, j20 != 16 ? j20 : this.disabledUncheckedBorderColor, j21 != 16 ? j21 : this.disabledIndeterminateBorderColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.m30879equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m30879equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m30879equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m30879equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m30879equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m30879equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m30879equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m30879equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m30879equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m30879equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m30879equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m30879equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28417getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m28418getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m28419getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28420getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m28421getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28422getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name */
    public final long m28423getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28424getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m28425getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m28426getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name */
    public final long m28427getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name */
    public final long m28428getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m30885hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m30885hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m30885hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m30885hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m30885hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m30885hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m30885hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m30885hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m30885hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m30885hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m30885hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m30885hashCodeimpl(this.disabledIndeterminateBorderColor);
    }

    private CheckboxColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.checkedCheckmarkColor = j10;
        this.uncheckedCheckmarkColor = j11;
        this.checkedBoxColor = j12;
        this.uncheckedBoxColor = j13;
        this.disabledCheckedBoxColor = j14;
        this.disabledUncheckedBoxColor = j15;
        this.disabledIndeterminateBoxColor = j16;
        this.checkedBorderColor = j17;
        this.uncheckedBorderColor = j18;
        this.disabledBorderColor = j19;
        this.disabledUncheckedBorderColor = j20;
        this.disabledIndeterminateBorderColor = j21;
    }
}
