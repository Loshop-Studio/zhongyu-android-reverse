package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJt\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b'\u0010$R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b(\u0010$R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b*\u0010$R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b+\u0010$R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b,\u0010$R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b-\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m5110d2 = {"Landroidx/compose/material3/SliderColors;", "", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy--K518z4", "(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;", "copy", "", "enabled", "thumbColor-vNxB06k$material3_release", "(Z)J", "active", "trackColor-WaAFU9c$material3_release", "(ZZ)J", "trackColor", "tickColor-WaAFU9c$material3_release", "tickColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getThumbColor-0d7_KjU", "()J", "getActiveTrackColor-0d7_KjU", "getActiveTickColor-0d7_KjU", "getInactiveTrackColor-0d7_KjU", "getInactiveTickColor-0d7_KjU", "getDisabledThumbColor-0d7_KjU", "getDisabledActiveTrackColor-0d7_KjU", "getDisabledActiveTickColor-0d7_KjU", "getDisabledInactiveTrackColor-0d7_KjU", "getDisabledInactiveTickColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2263:1\n708#2:2264\n696#2:2265\n708#2:2266\n696#2:2267\n708#2:2268\n696#2:2269\n708#2:2270\n696#2:2271\n708#2:2272\n696#2:2273\n708#2:2274\n696#2:2275\n708#2:2276\n696#2:2277\n708#2:2278\n696#2:2279\n708#2:2280\n696#2:2281\n708#2:2282\n696#2:2283\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n*L\n1798#1:2264\n1798#1:2265\n1799#1:2266\n1799#1:2267\n1800#1:2268\n1800#1:2269\n1801#1:2270\n1801#1:2271\n1802#1:2272\n1802#1:2273\n1803#1:2274\n1803#1:2275\n1804#1:2276\n1804#1:2277\n1805#1:2278\n1805#1:2279\n1806#1:2280\n1806#1:2281\n1807#1:2282\n1807#1:2283\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ SliderColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m8879copyK518z4$default(SliderColors sliderColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i, Object obj) {
        long j17;
        long j18;
        long j19 = (i & 1) != 0 ? sliderColors.thumbColor : j7;
        long j20 = (i & 2) != 0 ? sliderColors.activeTrackColor : j8;
        long j21 = (i & 4) != 0 ? sliderColors.activeTickColor : j9;
        long j22 = (i & 8) != 0 ? sliderColors.inactiveTrackColor : j10;
        long j23 = (i & 16) != 0 ? sliderColors.inactiveTickColor : j11;
        long j24 = (i & 32) != 0 ? sliderColors.disabledThumbColor : j12;
        long j25 = (i & 64) != 0 ? sliderColors.disabledActiveTrackColor : j13;
        long j26 = j19;
        long j27 = (i & 128) != 0 ? sliderColors.disabledActiveTickColor : j14;
        long j28 = (i & 256) != 0 ? sliderColors.disabledInactiveTrackColor : j15;
        if ((i & 512) != 0) {
            j18 = j28;
            j17 = sliderColors.disabledInactiveTickColor;
        } else {
            j17 = j16;
            j18 = j28;
        }
        return sliderColors.m8880copyK518z4(j26, j20, j21, j22, j23, j24, j25, j27, j18, j17);
    }

    @NotNull
    /* renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m8880copyK518z4(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        return new SliderColors(thumbColor != 16 ? thumbColor : this.thumbColor, activeTrackColor != 16 ? activeTrackColor : this.activeTrackColor, activeTickColor != 16 ? activeTickColor : this.activeTickColor, inactiveTrackColor != 16 ? inactiveTrackColor : this.inactiveTrackColor, inactiveTickColor != 16 ? inactiveTickColor : this.inactiveTickColor, disabledThumbColor != 16 ? disabledThumbColor : this.disabledThumbColor, disabledActiveTrackColor != 16 ? disabledActiveTrackColor : this.disabledActiveTrackColor, disabledActiveTickColor != 16 ? disabledActiveTickColor : this.disabledActiveTickColor, disabledInactiveTrackColor != 16 ? disabledInactiveTrackColor : this.disabledInactiveTrackColor, disabledInactiveTickColor != 16 ? disabledInactiveTickColor : this.disabledInactiveTickColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) other;
        return Color.m10683equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m10683equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m10683equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m10683equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m10683equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m10683equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m10683equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m10683equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m10683equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m10683equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    /* renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTickColor() {
        return this.activeTickColor;
    }

    /* renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTrackColor() {
        return this.activeTrackColor;
    }

    /* renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTickColor() {
        return this.disabledActiveTickColor;
    }

    /* renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTrackColor() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTickColor() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTrackColor() {
        return this.disabledInactiveTrackColor;
    }

    /* renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledThumbColor() {
        return this.disabledThumbColor;
    }

    /* renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTickColor() {
        return this.inactiveTickColor;
    }

    /* renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTrackColor() {
        return this.inactiveTrackColor;
    }

    /* renamed from: getThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getThumbColor() {
        return this.thumbColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.disabledInactiveTickColor) + AbstractC0584a.m904e(this.disabledInactiveTrackColor, AbstractC0584a.m904e(this.disabledActiveTickColor, AbstractC0584a.m904e(this.disabledActiveTrackColor, AbstractC0584a.m904e(this.disabledThumbColor, AbstractC0584a.m904e(this.inactiveTickColor, AbstractC0584a.m904e(this.inactiveTrackColor, AbstractC0584a.m904e(this.activeTickColor, AbstractC0584a.m904e(this.activeTrackColor, Color.m10689hashCodeimpl(this.thumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m8891thumbColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.thumbColor : this.disabledThumbColor;
    }

    @Stable
    /* renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8892tickColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTickColor : this.inactiveTickColor : active ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8893trackColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTrackColor : this.inactiveTrackColor : active ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    private SliderColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.thumbColor = j7;
        this.activeTrackColor = j8;
        this.activeTickColor = j9;
        this.inactiveTrackColor = j10;
        this.inactiveTickColor = j11;
        this.disabledThumbColor = j12;
        this.disabledActiveTrackColor = j13;
        this.disabledActiveTickColor = j14;
        this.disabledInactiveTrackColor = j15;
        this.disabledInactiveTickColor = j16;
    }
}
