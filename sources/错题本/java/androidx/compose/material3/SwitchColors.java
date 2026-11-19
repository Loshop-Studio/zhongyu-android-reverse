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
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J°\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ%\u0010#\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b.\u0010,R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b/\u0010,R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b0\u0010,R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b1\u0010,R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b2\u0010,R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b3\u0010,R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b4\u0010,R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b5\u0010,R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b6\u0010,R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b7\u0010,R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b8\u0010,R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b9\u0010,R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b:\u0010,R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b;\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5110d2 = {"Landroidx/compose/material3/SwitchColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "<init>", "(JJJJJJJJJJJJJJJJLkotlin/jvm/internal/e;)V", "copy-Q_H9qLU", "(JJJJJJJJJJJJJJJJ)Landroidx/compose/material3/SwitchColors;", "copy", "", "enabled", "checked", "thumbColor-WaAFU9c$material3_release", "(ZZ)J", "thumbColor", "trackColor-WaAFU9c$material3_release", "trackColor", "borderColor-WaAFU9c$material3_release", "borderColor", "iconColor-WaAFU9c$material3_release", "iconColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedThumbColor-0d7_KjU", "()J", "getCheckedTrackColor-0d7_KjU", "getCheckedBorderColor-0d7_KjU", "getCheckedIconColor-0d7_KjU", "getUncheckedThumbColor-0d7_KjU", "getUncheckedTrackColor-0d7_KjU", "getUncheckedBorderColor-0d7_KjU", "getUncheckedIconColor-0d7_KjU", "getDisabledCheckedThumbColor-0d7_KjU", "getDisabledCheckedTrackColor-0d7_KjU", "getDisabledCheckedBorderColor-0d7_KjU", "getDisabledCheckedIconColor-0d7_KjU", "getDisabledUncheckedThumbColor-0d7_KjU", "getDisabledUncheckedTrackColor-0d7_KjU", "getDisabledUncheckedBorderColor-0d7_KjU", "getDisabledUncheckedIconColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,625:1\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n708#2:632\n696#2:633\n708#2:634\n696#2:635\n708#2:636\n696#2:637\n708#2:638\n696#2:639\n708#2:640\n696#2:641\n708#2:642\n696#2:643\n708#2:644\n696#2:645\n708#2:646\n696#2:647\n708#2:648\n696#2:649\n708#2:650\n696#2:651\n708#2:652\n696#2:653\n708#2:654\n696#2:655\n708#2:656\n696#2:657\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n497#1:626\n497#1:627\n498#1:628\n498#1:629\n499#1:630\n499#1:631\n500#1:632\n500#1:633\n501#1:634\n501#1:635\n502#1:636\n502#1:637\n503#1:638\n503#1:639\n504#1:640\n504#1:641\n505#1:642\n505#1:643\n506#1:644\n506#1:645\n507#1:646\n507#1:647\n508#1:648\n508#1:649\n509#1:650\n509#1:651\n510#1:652\n510#1:653\n511#1:654\n511#1:655\n512#1:656\n512#1:657\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ SwitchColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    /* renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m8965copyQ_H9qLU$default(SwitchColors switchColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i, Object obj) {
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        SwitchColors switchColors2;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38 = (i & 1) != 0 ? switchColors.checkedThumbColor : j7;
        long j39 = (i & 2) != 0 ? switchColors.checkedTrackColor : j8;
        long j40 = (i & 4) != 0 ? switchColors.checkedBorderColor : j9;
        long j41 = (i & 8) != 0 ? switchColors.checkedIconColor : j10;
        long j42 = (i & 16) != 0 ? switchColors.uncheckedThumbColor : j11;
        long j43 = (i & 32) != 0 ? switchColors.uncheckedTrackColor : j12;
        long j44 = (i & 64) != 0 ? switchColors.uncheckedBorderColor : j13;
        long j45 = j38;
        long j46 = (i & 128) != 0 ? switchColors.uncheckedIconColor : j14;
        long j47 = (i & 256) != 0 ? switchColors.disabledCheckedThumbColor : j15;
        long j48 = (i & 512) != 0 ? switchColors.disabledCheckedTrackColor : j16;
        long j49 = (i & 1024) != 0 ? switchColors.disabledCheckedBorderColor : j17;
        long j50 = (i & 2048) != 0 ? switchColors.disabledCheckedIconColor : j18;
        long j51 = (i & 4096) != 0 ? switchColors.disabledUncheckedThumbColor : j19;
        long j52 = (i & 8192) != 0 ? switchColors.disabledUncheckedTrackColor : j20;
        long j53 = (i & 16384) != 0 ? switchColors.disabledUncheckedBorderColor : j21;
        if ((i & 32768) != 0) {
            j24 = j53;
            j23 = switchColors.disabledUncheckedIconColor;
            j26 = j47;
            j27 = j48;
            j28 = j49;
            j29 = j50;
            j30 = j51;
            j31 = j52;
            j32 = j39;
            j33 = j40;
            j34 = j41;
            j35 = j42;
            j36 = j43;
            j37 = j44;
            j25 = j46;
            switchColors2 = switchColors;
        } else {
            j23 = j22;
            j24 = j53;
            j25 = j46;
            j26 = j47;
            j27 = j48;
            j28 = j49;
            j29 = j50;
            j30 = j51;
            j31 = j52;
            switchColors2 = switchColors;
            j32 = j39;
            j33 = j40;
            j34 = j41;
            j35 = j42;
            j36 = j43;
            j37 = j44;
        }
        return switchColors2.m8967copyQ_H9qLU(j45, j32, j33, j34, j35, j36, j37, j25, j26, j27, j28, j29, j30, j31, j24, j23);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8966borderColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedBorderColor : this.uncheckedBorderColor : checked ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    @NotNull
    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m8967copyQ_H9qLU(long checkedThumbColor, long checkedTrackColor, long checkedBorderColor, long checkedIconColor, long uncheckedThumbColor, long uncheckedTrackColor, long uncheckedBorderColor, long uncheckedIconColor, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledCheckedBorderColor, long disabledCheckedIconColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, long disabledUncheckedBorderColor, long disabledUncheckedIconColor) {
        return new SwitchColors(checkedThumbColor != 16 ? checkedThumbColor : this.checkedThumbColor, checkedTrackColor != 16 ? checkedTrackColor : this.checkedTrackColor, checkedBorderColor != 16 ? checkedBorderColor : this.checkedBorderColor, checkedIconColor != 16 ? checkedIconColor : this.checkedIconColor, uncheckedThumbColor != 16 ? uncheckedThumbColor : this.uncheckedThumbColor, uncheckedTrackColor != 16 ? uncheckedTrackColor : this.uncheckedTrackColor, uncheckedBorderColor != 16 ? uncheckedBorderColor : this.uncheckedBorderColor, uncheckedIconColor != 16 ? uncheckedIconColor : this.uncheckedIconColor, disabledCheckedThumbColor != 16 ? disabledCheckedThumbColor : this.disabledCheckedThumbColor, disabledCheckedTrackColor != 16 ? disabledCheckedTrackColor : this.disabledCheckedTrackColor, disabledCheckedBorderColor != 16 ? disabledCheckedBorderColor : this.disabledCheckedBorderColor, disabledCheckedIconColor != 16 ? disabledCheckedIconColor : this.disabledCheckedIconColor, disabledUncheckedThumbColor != 16 ? disabledUncheckedThumbColor : this.disabledUncheckedThumbColor, disabledUncheckedTrackColor != 16 ? disabledUncheckedTrackColor : this.disabledUncheckedTrackColor, disabledUncheckedBorderColor != 16 ? disabledUncheckedBorderColor : this.disabledUncheckedBorderColor, disabledUncheckedIconColor != 16 ? disabledUncheckedIconColor : this.disabledUncheckedIconColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) other;
        return Color.m10683equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m10683equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m10683equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m10683equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m10683equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m10683equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m10683equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m10683equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m10683equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m10683equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m10683equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m10683equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m10683equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m10683equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m10683equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m10683equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
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
        return Color.m10689hashCodeimpl(this.disabledUncheckedIconColor) + AbstractC0584a.m904e(this.disabledUncheckedBorderColor, AbstractC0584a.m904e(this.disabledUncheckedTrackColor, AbstractC0584a.m904e(this.disabledUncheckedThumbColor, AbstractC0584a.m904e(this.disabledCheckedIconColor, AbstractC0584a.m904e(this.disabledCheckedBorderColor, AbstractC0584a.m904e(this.disabledCheckedTrackColor, AbstractC0584a.m904e(this.disabledCheckedThumbColor, AbstractC0584a.m904e(this.uncheckedIconColor, AbstractC0584a.m904e(this.uncheckedBorderColor, AbstractC0584a.m904e(this.uncheckedTrackColor, AbstractC0584a.m904e(this.uncheckedThumbColor, AbstractC0584a.m904e(this.checkedIconColor, AbstractC0584a.m904e(this.checkedBorderColor, AbstractC0584a.m904e(this.checkedTrackColor, Color.m10689hashCodeimpl(this.checkedThumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Stable
    /* renamed from: iconColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8984iconColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedIconColor : this.uncheckedIconColor : checked ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    @Stable
    /* renamed from: thumbColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8985thumbColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedThumbColor : this.uncheckedThumbColor : checked ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    @Stable
    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m8986trackColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return enabled ? checked ? this.checkedTrackColor : this.uncheckedTrackColor : checked ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private SwitchColors(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.checkedThumbColor = j7;
        this.checkedTrackColor = j8;
        this.checkedBorderColor = j9;
        this.checkedIconColor = j10;
        this.uncheckedThumbColor = j11;
        this.uncheckedTrackColor = j12;
        this.uncheckedBorderColor = j13;
        this.uncheckedIconColor = j14;
        this.disabledCheckedThumbColor = j15;
        this.disabledCheckedTrackColor = j16;
        this.disabledCheckedBorderColor = j17;
        this.disabledCheckedIconColor = j18;
        this.disabledUncheckedThumbColor = j19;
        this.disabledUncheckedTrackColor = j20;
        this.disabledUncheckedBorderColor = j21;
        this.disabledUncheckedIconColor = j22;
    }
}
