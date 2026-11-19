package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.state.ToggleableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b'\u0010%J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0004\b)\u0010*J\u0088\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00100\u001a\u000201H\u0016R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m7880d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "checkedCheckmarkColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedBorderColor-0d7_KjU", "()J", "J", "getCheckedBoxColor-0d7_KjU", "getCheckedCheckmarkColor-0d7_KjU", "getDisabledBorderColor-0d7_KjU", "getDisabledCheckedBoxColor-0d7_KjU", "getDisabledIndeterminateBorderColor-0d7_KjU", "getDisabledIndeterminateBoxColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedBoxColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedBoxColor-0d7_KjU", "getUncheckedCheckmarkColor-0d7_KjU", "borderColor", "Landroidx/compose/runtime/State;", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "borderColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "boxColor$material3_release", "checkmarkColor", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "copy", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/CheckboxColors;", "equals", "other", "hashCode", "", "material3_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,607:1\n708#2:608\n696#2:609\n708#2:610\n696#2:611\n708#2:612\n696#2:613\n708#2:614\n696#2:615\n708#2:616\n696#2:617\n708#2:618\n696#2:619\n708#2:620\n696#2:621\n708#2:622\n696#2:623\n708#2:624\n696#2:625\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n462#1:608\n462#1:609\n463#1:610\n463#1:611\n464#1:612\n464#1:613\n465#1:614\n465#1:615\n466#1:616\n466#1:617\n467#1:618\n467#1:619\n468#1:620\n468#1:621\n469#1:622\n469#1:623\n470#1:624\n470#1:625\n471#1:626\n471#1:627\n472#1:628\n472#1:629\n473#1:630\n473#1:631\n*E\n"})
/* loaded from: classes.dex */
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

    @Metadata(m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f315On.ordinal()] = 1;
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

    public /* synthetic */ CheckboxColors(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ CheckboxColors m11494copy2qZNXz8$default(CheckboxColors checkboxColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i6, Object obj) {
        long j18;
        long j19;
        long j20 = (i6 & 1) != 0 ? checkboxColors.checkedCheckmarkColor : j6;
        long j21 = (i6 & 2) != 0 ? checkboxColors.uncheckedCheckmarkColor : j7;
        long j22 = (i6 & 4) != 0 ? checkboxColors.checkedBoxColor : j8;
        long j23 = (i6 & 8) != 0 ? checkboxColors.uncheckedBoxColor : j9;
        long j24 = (i6 & 16) != 0 ? checkboxColors.disabledCheckedBoxColor : j10;
        long j25 = (i6 & 32) != 0 ? checkboxColors.disabledUncheckedBoxColor : j11;
        long j26 = (i6 & 64) != 0 ? checkboxColors.disabledIndeterminateBoxColor : j12;
        long j27 = j20;
        long j28 = (i6 & 128) != 0 ? checkboxColors.checkedBorderColor : j13;
        long j29 = (i6 & 256) != 0 ? checkboxColors.uncheckedBorderColor : j14;
        long j30 = (i6 & 512) != 0 ? checkboxColors.disabledBorderColor : j15;
        long j31 = (i6 & 1024) != 0 ? checkboxColors.disabledUncheckedBorderColor : j16;
        if ((i6 & 2048) != 0) {
            j19 = j31;
            j18 = checkboxColors.disabledIndeterminateBorderColor;
        } else {
            j18 = j17;
            j19 = j31;
        }
        return checkboxColors.m11495copy2qZNXz8(j27, j21, j22, j23, j24, j25, j26, j28, j29, j30, j19, j18);
    }

    @Composable
    public final State<Color> borderColor$material3_release(boolean z6, ToggleableState toggleableState, Composer composer, int i6) {
        long j6;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i6, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        if (z6) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 == 1 || i7 == 2) {
                j6 = this.checkedBorderColor;
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j6 = this.uncheckedBorderColor;
            }
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i8 == 1) {
                j6 = this.disabledBorderColor;
            } else if (i8 == 2) {
                j6 = this.disabledIndeterminateBorderColor;
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j6 = this.disabledUncheckedBorderColor;
            }
        }
        long j7 = j6;
        if (z6) {
            composer.startReplaceGroup(-1725816497);
            stateRememberUpdatedState = SingleValueAnimationKt.m9991animateColorAsStateeuL9pac(j7, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1725635953);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m13889boximpl(j7), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> boxColor$material3_release(boolean z6, ToggleableState toggleableState, Composer composer, int i6) {
        long j6;
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i6, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        if (z6) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 == 1 || i7 == 2) {
                j6 = this.checkedBoxColor;
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j6 = this.uncheckedBoxColor;
            }
        } else {
            int i8 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i8 == 1) {
                j6 = this.disabledCheckedBoxColor;
            } else if (i8 == 2) {
                j6 = this.disabledIndeterminateBoxColor;
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j6 = this.disabledUncheckedBoxColor;
            }
        }
        long j7 = j6;
        if (z6) {
            composer.startReplaceGroup(-392211906);
            stateRememberUpdatedState = SingleValueAnimationKt.m9991animateColorAsStateeuL9pac(j7, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-392031362);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m13889boximpl(j7), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i6, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        ToggleableState toggleableState2 = ToggleableState.Off;
        State<Color> stateM9991animateColorAsStateeuL9pac = SingleValueAnimationKt.m9991animateColorAsStateeuL9pac(toggleableState == toggleableState2 ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM9991animateColorAsStateeuL9pac;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final CheckboxColors m11495copy2qZNXz8(long checkedCheckmarkColor, long uncheckedCheckmarkColor, long checkedBoxColor, long uncheckedBoxColor, long disabledCheckedBoxColor, long disabledUncheckedBoxColor, long disabledIndeterminateBoxColor, long checkedBorderColor, long uncheckedBorderColor, long disabledBorderColor, long disabledUncheckedBorderColor, long disabledIndeterminateBorderColor) {
        return new CheckboxColors(checkedCheckmarkColor != 16 ? checkedCheckmarkColor : this.checkedCheckmarkColor, uncheckedCheckmarkColor != 16 ? uncheckedCheckmarkColor : this.uncheckedCheckmarkColor, checkedBoxColor != 16 ? checkedBoxColor : this.checkedBoxColor, uncheckedBoxColor != 16 ? uncheckedBoxColor : this.uncheckedBoxColor, disabledCheckedBoxColor != 16 ? disabledCheckedBoxColor : this.disabledCheckedBoxColor, disabledUncheckedBoxColor != 16 ? disabledUncheckedBoxColor : this.disabledUncheckedBoxColor, disabledIndeterminateBoxColor != 16 ? disabledIndeterminateBoxColor : this.disabledIndeterminateBoxColor, checkedBorderColor != 16 ? checkedBorderColor : this.checkedBorderColor, uncheckedBorderColor != 16 ? uncheckedBorderColor : this.uncheckedBorderColor, disabledBorderColor != 16 ? disabledBorderColor : this.disabledBorderColor, disabledUncheckedBorderColor != 16 ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor, disabledIndeterminateBorderColor != 16 ? disabledIndeterminateBorderColor : this.disabledIndeterminateBorderColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) other;
        return Color.m13900equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m13900equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m13900equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m13900equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m13900equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m13900equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m13900equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m13900equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m13900equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m13900equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m13900equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m13900equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedBoxColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBoxColor() {
        return this.checkedBoxColor;
    }

    /* renamed from: getCheckedCheckmarkColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedCheckmarkColor() {
        return this.checkedCheckmarkColor;
    }

    /* renamed from: getDisabledBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    /* renamed from: getDisabledCheckedBoxColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBoxColor() {
        return this.disabledCheckedBoxColor;
    }

    /* renamed from: getDisabledIndeterminateBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndeterminateBorderColor() {
        return this.disabledIndeterminateBorderColor;
    }

    /* renamed from: getDisabledIndeterminateBoxColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIndeterminateBoxColor() {
        return this.disabledIndeterminateBoxColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedBoxColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBoxColor() {
        return this.disabledUncheckedBoxColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedBoxColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBoxColor() {
        return this.uncheckedBoxColor;
    }

    /* renamed from: getUncheckedCheckmarkColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedCheckmarkColor() {
        return this.uncheckedCheckmarkColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m13906hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m13906hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m13906hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m13906hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m13906hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m13906hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m13906hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m13906hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m13906hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m13906hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m13906hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m13906hashCodeimpl(this.disabledIndeterminateBorderColor);
    }

    private CheckboxColors(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.checkedCheckmarkColor = j6;
        this.uncheckedCheckmarkColor = j7;
        this.checkedBoxColor = j8;
        this.uncheckedBoxColor = j9;
        this.disabledCheckedBoxColor = j10;
        this.disabledUncheckedBoxColor = j11;
        this.disabledIndeterminateBoxColor = j12;
        this.checkedBorderColor = j13;
        this.uncheckedBorderColor = j14;
        this.disabledBorderColor = j15;
        this.disabledUncheckedBorderColor = j16;
        this.disabledIndeterminateBorderColor = j17;
    }
}
