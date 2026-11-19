package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    public /* synthetic */ SwitchColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
    }

    /* renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m22559copyQ_H9qLU$default(SwitchColors switchColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, int i10, Object obj) {
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        SwitchColors switchColors2;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41 = (i10 & 1) != 0 ? switchColors.checkedThumbColor : j10;
        long j42 = (i10 & 2) != 0 ? switchColors.checkedTrackColor : j11;
        long j43 = (i10 & 4) != 0 ? switchColors.checkedBorderColor : j12;
        long j44 = (i10 & 8) != 0 ? switchColors.checkedIconColor : j13;
        long j45 = (i10 & 16) != 0 ? switchColors.uncheckedThumbColor : j14;
        long j46 = (i10 & 32) != 0 ? switchColors.uncheckedTrackColor : j15;
        long j47 = (i10 & 64) != 0 ? switchColors.uncheckedBorderColor : j16;
        long j48 = j41;
        long j49 = (i10 & 128) != 0 ? switchColors.uncheckedIconColor : j17;
        long j50 = (i10 & 256) != 0 ? switchColors.disabledCheckedThumbColor : j18;
        long j51 = (i10 & 512) != 0 ? switchColors.disabledCheckedTrackColor : j19;
        long j52 = (i10 & 1024) != 0 ? switchColors.disabledCheckedBorderColor : j20;
        long j53 = (i10 & 2048) != 0 ? switchColors.disabledCheckedIconColor : j21;
        long j54 = (i10 & 4096) != 0 ? switchColors.disabledUncheckedThumbColor : j22;
        long j55 = (i10 & 8192) != 0 ? switchColors.disabledUncheckedTrackColor : j23;
        long j56 = (i10 & 16384) != 0 ? switchColors.disabledUncheckedBorderColor : j24;
        if ((i10 & 32768) != 0) {
            j27 = j56;
            j26 = switchColors.disabledUncheckedIconColor;
            j29 = j50;
            j30 = j51;
            j31 = j52;
            j32 = j53;
            j33 = j54;
            j34 = j55;
            j35 = j42;
            j36 = j43;
            j37 = j44;
            j38 = j45;
            j39 = j46;
            j40 = j47;
            j28 = j49;
            switchColors2 = switchColors;
        } else {
            j26 = j25;
            j27 = j56;
            j28 = j49;
            j29 = j50;
            j30 = j51;
            j31 = j52;
            j32 = j53;
            j33 = j54;
            j34 = j55;
            switchColors2 = switchColors;
            j35 = j42;
            j36 = j43;
            j37 = j44;
            j38 = j45;
            j39 = j46;
            j40 = j47;
        }
        return switchColors2.m22561copyQ_H9qLU(j48, j35, j36, j37, j38, j39, j40, j28, j29, j30, j31, j32, j33, j34, j27, j26);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22560borderColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.checkedBorderColor : this.uncheckedBorderColor : z11 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m22561copyQ_H9qLU(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        return new SwitchColors(j10 != 16 ? j10 : this.checkedThumbColor, j11 != 16 ? j11 : this.checkedTrackColor, j12 != 16 ? j12 : this.checkedBorderColor, j13 != 16 ? j13 : this.checkedIconColor, j14 != 16 ? j14 : this.uncheckedThumbColor, j15 != 16 ? j15 : this.uncheckedTrackColor, j16 != 16 ? j16 : this.uncheckedBorderColor, j17 != 16 ? j17 : this.uncheckedIconColor, j18 != 16 ? j18 : this.disabledCheckedThumbColor, j19 != 16 ? j19 : this.disabledCheckedTrackColor, j20 != 16 ? j20 : this.disabledCheckedBorderColor, j21 != 16 ? j21 : this.disabledCheckedIconColor, j22 != 16 ? j22 : this.disabledUncheckedThumbColor, j23 != 16 ? j23 : this.disabledUncheckedTrackColor, j24 != 16 ? j24 : this.disabledUncheckedBorderColor, j25 != 16 ? j25 : this.disabledUncheckedIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return Color.m24277equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m24277equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m24277equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m24277equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m24277equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m24277equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m24277equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m24277equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m24277equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m24277equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m24277equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m24277equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m24277equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m24277equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m24277equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m24277equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22562getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m22563getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m22564getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m22565getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22566getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m22567getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m22568getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m22569getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22570getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m22571getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m22572getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m22573getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22574getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m22575getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m22576getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m22577getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m24283hashCodeimpl(this.checkedThumbColor) * 31) + Color.m24283hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m24283hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m24283hashCodeimpl(this.checkedIconColor)) * 31) + Color.m24283hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m24283hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m24283hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m24283hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m24283hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m24283hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m24283hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m24283hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m24283hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m24283hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m24283hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m24283hashCodeimpl(this.disabledUncheckedIconColor);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22578iconColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.checkedIconColor : this.uncheckedIconColor : z11 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    @Stable
    /* renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22579thumbColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.checkedThumbColor : this.uncheckedThumbColor : z11 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22580trackColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.checkedTrackColor : this.uncheckedTrackColor : z11 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private SwitchColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.checkedThumbColor = j10;
        this.checkedTrackColor = j11;
        this.checkedBorderColor = j12;
        this.checkedIconColor = j13;
        this.uncheckedThumbColor = j14;
        this.uncheckedTrackColor = j15;
        this.uncheckedBorderColor = j16;
        this.uncheckedIconColor = j17;
        this.disabledCheckedThumbColor = j18;
        this.disabledCheckedTrackColor = j19;
        this.disabledCheckedBorderColor = j20;
        this.disabledCheckedIconColor = j21;
        this.disabledUncheckedThumbColor = j22;
        this.disabledUncheckedTrackColor = j23;
        this.disabledUncheckedBorderColor = j24;
        this.disabledUncheckedIconColor = j25;
    }
}
