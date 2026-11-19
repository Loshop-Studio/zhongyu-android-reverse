package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ SliderColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m29075copyK518z4$default(SliderColors sliderColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i10, Object obj) {
        long j20;
        long j21;
        long j22 = (i10 & 1) != 0 ? sliderColors.thumbColor : j10;
        long j23 = (i10 & 2) != 0 ? sliderColors.activeTrackColor : j11;
        long j24 = (i10 & 4) != 0 ? sliderColors.activeTickColor : j12;
        long j25 = (i10 & 8) != 0 ? sliderColors.inactiveTrackColor : j13;
        long j26 = (i10 & 16) != 0 ? sliderColors.inactiveTickColor : j14;
        long j27 = (i10 & 32) != 0 ? sliderColors.disabledThumbColor : j15;
        long j28 = (i10 & 64) != 0 ? sliderColors.disabledActiveTrackColor : j16;
        long j29 = j22;
        long j30 = (i10 & 128) != 0 ? sliderColors.disabledActiveTickColor : j17;
        long j31 = (i10 & 256) != 0 ? sliderColors.disabledInactiveTrackColor : j18;
        if ((i10 & 512) != 0) {
            j21 = j31;
            j20 = sliderColors.disabledInactiveTickColor;
        } else {
            j20 = j19;
            j21 = j31;
        }
        return sliderColors.m29076copyK518z4(j29, j23, j24, j25, j26, j27, j28, j30, j21, j20);
    }

    /* renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m29076copyK518z4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new SliderColors(j10 != 16 ? j10 : this.thumbColor, j11 != 16 ? j11 : this.activeTrackColor, j12 != 16 ? j12 : this.activeTickColor, j13 != 16 ? j13 : this.inactiveTrackColor, j14 != 16 ? j14 : this.inactiveTickColor, j15 != 16 ? j15 : this.disabledThumbColor, j16 != 16 ? j16 : this.disabledActiveTrackColor, j17 != 16 ? j17 : this.disabledActiveTickColor, j18 != 16 ? j18 : this.disabledInactiveTrackColor, j19 != 16 ? j19 : this.disabledInactiveTickColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.m30879equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m30879equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m30879equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m30879equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m30879equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m30879equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m30879equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m30879equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m30879equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m30879equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    /* renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m29077getActiveTickColor0d7_KjU() {
        return this.activeTickColor;
    }

    /* renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m29078getActiveTrackColor0d7_KjU() {
        return this.activeTrackColor;
    }

    /* renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m29079getDisabledActiveTickColor0d7_KjU() {
        return this.disabledActiveTickColor;
    }

    /* renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m29080getDisabledActiveTrackColor0d7_KjU() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m29081getDisabledInactiveTickColor0d7_KjU() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m29082getDisabledInactiveTrackColor0d7_KjU() {
        return this.disabledInactiveTrackColor;
    }

    /* renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name */
    public final long m29083getDisabledThumbColor0d7_KjU() {
        return this.disabledThumbColor;
    }

    /* renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m29084getInactiveTickColor0d7_KjU() {
        return this.inactiveTickColor;
    }

    /* renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m29085getInactiveTrackColor0d7_KjU() {
        return this.inactiveTrackColor;
    }

    /* renamed from: getThumbColor-0d7_KjU, reason: not valid java name */
    public final long m29086getThumbColor0d7_KjU() {
        return this.thumbColor;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m30885hashCodeimpl(this.thumbColor) * 31) + Color.m30885hashCodeimpl(this.activeTrackColor)) * 31) + Color.m30885hashCodeimpl(this.activeTickColor)) * 31) + Color.m30885hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m30885hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m30885hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m30885hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m30885hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m30885hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m30885hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Stable
    /* renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m29087thumbColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.thumbColor : this.disabledThumbColor;
    }

    @Stable
    /* renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29088tickColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.activeTickColor : this.inactiveTickColor : z11 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m29089trackColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return z10 ? z11 ? this.activeTrackColor : this.inactiveTrackColor : z11 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    private SliderColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.thumbColor = j10;
        this.activeTrackColor = j11;
        this.activeTickColor = j12;
        this.inactiveTrackColor = j13;
        this.inactiveTickColor = j14;
        this.disabledThumbColor = j15;
        this.disabledActiveTrackColor = j16;
        this.disabledActiveTickColor = j17;
        this.disabledInactiveTrackColor = j18;
        this.disabledInactiveTickColor = j19;
    }
}
