package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J%\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J°\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J%\u00103\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u0010+J%\u00105\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010+J%\u00107\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u0010+R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b!\u0010\u0015R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b%\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m13558d2 = {"Landroidx/compose/material3/SwitchColors;", "", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckedBorderColor-0d7_KjU", "()J", "J", "getCheckedIconColor-0d7_KjU", "getCheckedThumbColor-0d7_KjU", "getCheckedTrackColor-0d7_KjU", "getDisabledCheckedBorderColor-0d7_KjU", "getDisabledCheckedIconColor-0d7_KjU", "getDisabledCheckedThumbColor-0d7_KjU", "getDisabledCheckedTrackColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedIconColor-0d7_KjU", "getDisabledUncheckedThumbColor-0d7_KjU", "getDisabledUncheckedTrackColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedIconColor-0d7_KjU", "getUncheckedThumbColor-0d7_KjU", "getUncheckedTrackColor-0d7_KjU", "borderColor", "enabled", "", "checked", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "copy", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "equals", "other", "hashCode", "", "iconColor", "iconColor-WaAFU9c$material3_release", "thumbColor", "thumbColor-WaAFU9c$material3_release", "trackColor", "trackColor-WaAFU9c$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,625:1\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n708#2:632\n696#2:633\n708#2:634\n696#2:635\n708#2:636\n696#2:637\n708#2:638\n696#2:639\n708#2:640\n696#2:641\n708#2:642\n696#2:643\n708#2:644\n696#2:645\n708#2:646\n696#2:647\n708#2:648\n696#2:649\n708#2:650\n696#2:651\n708#2:652\n696#2:653\n708#2:654\n696#2:655\n708#2:656\n696#2:657\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n497#1:626\n497#1:627\n498#1:628\n498#1:629\n499#1:630\n499#1:631\n500#1:632\n500#1:633\n501#1:634\n501#1:635\n502#1:636\n502#1:637\n503#1:638\n503#1:639\n504#1:640\n504#1:641\n505#1:642\n505#1:643\n506#1:644\n506#1:645\n507#1:646\n507#1:647\n508#1:648\n508#1:649\n509#1:650\n509#1:651\n510#1:652\n510#1:653\n511#1:654\n511#1:655\n512#1:656\n512#1:657\n*E\n"})
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

    public /* synthetic */ SwitchColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
    }

    /* renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m19290copyQ_H9qLU$default(SwitchColors switchColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, int i10, Object obj) {
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
        return switchColors2.m19292copyQ_H9qLU(j48, j35, j36, j37, j38, j39, j40, j28, j29, j30, j31, j32, j33, j34, j27, j26);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19291borderColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedBorderColor : this.uncheckedBorderColor : checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m19292copyQ_H9qLU(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        return new SwitchColors(checkedThumbColor != 16 ? checkedThumbColor : this.checkedThumbColor, checkedTrackColor != 16 ? checkedTrackColor : this.checkedTrackColor, checkedBorderColor != 16 ? checkedBorderColor : this.checkedBorderColor, checkedIconColor != 16 ? checkedIconColor : this.checkedIconColor, uncheckedThumbColor != 16 ? uncheckedThumbColor : this.uncheckedThumbColor, uncheckedTrackColor != 16 ? uncheckedTrackColor : this.uncheckedTrackColor, uncheckedBorderColor != 16 ? uncheckedBorderColor : this.uncheckedBorderColor, uncheckedIconColor != 16 ? uncheckedIconColor : this.uncheckedIconColor, disabledCheckedThumbColor != 16 ? disabledCheckedThumbColor : this.disabledCheckedThumbColor, disabledCheckedTrackColor != 16 ? disabledCheckedTrackColor : this.disabledCheckedTrackColor, disabledCheckedBorderColor != 16 ? disabledCheckedBorderColor : this.disabledCheckedBorderColor, disabledCheckedIconColor != 16 ? disabledCheckedIconColor : this.disabledCheckedIconColor, disabledUncheckedThumbColor != 16 ? disabledUncheckedThumbColor : this.disabledUncheckedThumbColor, disabledUncheckedTrackColor != 16 ? disabledUncheckedTrackColor : this.disabledUncheckedTrackColor, disabledUncheckedBorderColor != 16 ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor, disabledUncheckedIconColor != 16 ? disabledUncheckedIconColor : this.disabledUncheckedIconColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) other;
        return Color.m20977equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m20977equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m20977equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m20977equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m20977equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m20977equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m20977equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m20977equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m20977equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m20977equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m20977equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m20977equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m20977equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m20977equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m20977equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m20977equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedBorderColor() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedIconColor() {
        return this.checkedIconColor;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedThumbColor() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedTrackColor() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedBorderColor() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedIconColor() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedThumbColor() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledCheckedTrackColor() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedBorderColor() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedIconColor() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedThumbColor() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUncheckedTrackColor() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedBorderColor() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedIconColor() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedThumbColor() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUncheckedTrackColor() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Color.m20983hashCodeimpl(this.checkedThumbColor) * 31) + Color.m20983hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m20983hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m20983hashCodeimpl(this.checkedIconColor)) * 31) + Color.m20983hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m20983hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m20983hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m20983hashCodeimpl(this.uncheckedIconColor)) * 31) + Color.m20983hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m20983hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m20983hashCodeimpl(this.disabledCheckedBorderColor)) * 31) + Color.m20983hashCodeimpl(this.disabledCheckedIconColor)) * 31) + Color.m20983hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m20983hashCodeimpl(this.disabledUncheckedTrackColor)) * 31) + Color.m20983hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m20983hashCodeimpl(this.disabledUncheckedIconColor);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19309iconColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedIconColor : this.uncheckedIconColor : checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    @Stable
    /* renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19310thumbColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedThumbColor : this.uncheckedThumbColor : checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m19311trackColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedTrackColor : this.uncheckedTrackColor : checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
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
