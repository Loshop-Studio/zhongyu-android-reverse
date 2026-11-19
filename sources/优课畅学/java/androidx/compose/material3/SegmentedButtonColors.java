package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    public /* synthetic */ SegmentedButtonColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m22434copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long j22;
        long j23;
        long j24 = (i10 & 1) != 0 ? segmentedButtonColors.activeContainerColor : j10;
        long j25 = (i10 & 2) != 0 ? segmentedButtonColors.activeContentColor : j11;
        long j26 = (i10 & 4) != 0 ? segmentedButtonColors.activeBorderColor : j12;
        long j27 = (i10 & 8) != 0 ? segmentedButtonColors.inactiveContainerColor : j13;
        long j28 = (i10 & 16) != 0 ? segmentedButtonColors.inactiveContentColor : j14;
        long j29 = (i10 & 32) != 0 ? segmentedButtonColors.inactiveBorderColor : j15;
        long j30 = (i10 & 64) != 0 ? segmentedButtonColors.disabledActiveContainerColor : j16;
        long j31 = j24;
        long j32 = (i10 & 128) != 0 ? segmentedButtonColors.disabledActiveContentColor : j17;
        long j33 = (i10 & 256) != 0 ? segmentedButtonColors.disabledActiveBorderColor : j18;
        long j34 = (i10 & 512) != 0 ? segmentedButtonColors.disabledInactiveContainerColor : j19;
        long j35 = (i10 & 1024) != 0 ? segmentedButtonColors.disabledInactiveContentColor : j20;
        if ((i10 & 2048) != 0) {
            j23 = j35;
            j22 = segmentedButtonColors.disabledInactiveBorderColor;
        } else {
            j22 = j21;
            j23 = j35;
        }
        return segmentedButtonColors.m22438copy2qZNXz8(j31, j25, j26, j27, j28, j29, j30, j32, j33, j34, j23, j22);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22435borderColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return (z10 && z11) ? this.activeBorderColor : (!z10 || z11) ? (z10 || !z11) ? this.disabledInactiveBorderColor : this.disabledActiveBorderColor : this.inactiveBorderColor;
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22436containerColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return (z10 && z11) ? this.activeContainerColor : (!z10 || z11) ? (z10 || !z11) ? this.disabledInactiveContainerColor : this.disabledActiveContainerColor : this.inactiveContainerColor;
    }

    @Stable
    /* renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m22437contentColorWaAFU9c$material3_release(boolean z10, boolean z11) {
        return (z10 && z11) ? this.activeContentColor : (!z10 || z11) ? (z10 || !z11) ? this.disabledInactiveContentColor : this.disabledActiveContentColor : this.inactiveContentColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m22438copy2qZNXz8(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new SegmentedButtonColors(j10 != 16 ? j10 : this.activeContainerColor, j11 != 16 ? j11 : this.activeContentColor, j12 != 16 ? j12 : this.activeBorderColor, j13 != 16 ? j13 : this.inactiveContainerColor, j14 != 16 ? j14 : this.inactiveContentColor, j15 != 16 ? j15 : this.inactiveBorderColor, j16 != 16 ? j16 : this.disabledActiveContainerColor, j17 != 16 ? j17 : this.disabledActiveContentColor, j18 != 16 ? j18 : this.disabledActiveBorderColor, j19 != 16 ? j19 : this.disabledInactiveContainerColor, j20 != 16 ? j20 : this.disabledInactiveContentColor, j21 != 16 ? j21 : this.disabledInactiveBorderColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.m24277equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m24277equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m24277equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m24277equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m24277equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m24277equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m24277equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m24277equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m24277equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m24277equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m24277equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m24277equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22439getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22440getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m22441getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22442getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22443getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m22444getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22445getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22446getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m22447getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m22448getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22449getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m22450getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m24283hashCodeimpl(this.activeBorderColor) * 31) + Color.m24283hashCodeimpl(this.activeContentColor)) * 31) + Color.m24283hashCodeimpl(this.activeContainerColor)) * 31) + Color.m24283hashCodeimpl(this.inactiveBorderColor)) * 31) + Color.m24283hashCodeimpl(this.inactiveContentColor)) * 31) + Color.m24283hashCodeimpl(this.inactiveContainerColor)) * 31) + Color.m24283hashCodeimpl(this.disabledActiveBorderColor)) * 31) + Color.m24283hashCodeimpl(this.disabledActiveContentColor)) * 31) + Color.m24283hashCodeimpl(this.disabledActiveContainerColor)) * 31) + Color.m24283hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + Color.m24283hashCodeimpl(this.disabledInactiveContentColor)) * 31) + Color.m24283hashCodeimpl(this.disabledInactiveContainerColor);
    }

    private SegmentedButtonColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.activeContainerColor = j10;
        this.activeContentColor = j11;
        this.activeBorderColor = j12;
        this.inactiveContainerColor = j13;
        this.inactiveContentColor = j14;
        this.inactiveBorderColor = j15;
        this.disabledActiveContainerColor = j16;
        this.disabledActiveContentColor = j17;
        this.disabledActiveBorderColor = j18;
        this.disabledInactiveContainerColor = j19;
        this.disabledInactiveContentColor = j20;
        this.disabledInactiveBorderColor = j21;
    }
}
