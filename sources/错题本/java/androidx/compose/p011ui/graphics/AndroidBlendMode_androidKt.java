package androidx.compose.p011ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m5110d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                BlendMode unused = BlendMode.CLEAR;
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BlendMode unused3 = BlendMode.SRC;
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BlendMode unused5 = BlendMode.DST;
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BlendMode unused7 = BlendMode.SRC_OVER;
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BlendMode unused9 = BlendMode.DST_OVER;
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                BlendMode unused11 = BlendMode.SRC_IN;
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                BlendMode unused13 = BlendMode.DST_IN;
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                BlendMode unused15 = BlendMode.SRC_OUT;
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                BlendMode unused17 = BlendMode.DST_OUT;
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                BlendMode unused19 = BlendMode.SRC_ATOP;
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                BlendMode unused21 = BlendMode.DST_ATOP;
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                BlendMode unused23 = BlendMode.XOR;
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                BlendMode unused25 = BlendMode.PLUS;
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                BlendMode unused27 = BlendMode.MODULATE;
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                BlendMode unused29 = BlendMode.SCREEN;
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                BlendMode unused31 = BlendMode.OVERLAY;
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                BlendMode unused33 = BlendMode.DARKEN;
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                BlendMode unused35 = BlendMode.LIGHTEN;
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                BlendMode unused37 = BlendMode.COLOR_DODGE;
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                BlendMode unused39 = BlendMode.COLOR_BURN;
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                BlendMode unused41 = BlendMode.HARD_LIGHT;
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                BlendMode unused43 = BlendMode.SOFT_LIGHT;
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                BlendMode unused45 = BlendMode.DIFFERENCE;
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                BlendMode unused47 = BlendMode.EXCLUSION;
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                BlendMode unused49 = BlendMode.MULTIPLY;
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                BlendMode unused51 = BlendMode.HUE;
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                BlendMode unused53 = BlendMode.SATURATION;
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                BlendMode unused55 = BlendMode.COLOR;
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                BlendMode unused57 = BlendMode.LUMINOSITY;
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused58) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m10532isSupporteds9anfk8(int i) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m10593equalsimpl0(i, BlendMode.INSTANCE.m10624getSrcOver0nO6VwU()) || m10534toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    @NotNull
    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m10533toAndroidBlendModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m10593equalsimpl0(i, companion.m10597getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m10593equalsimpl0(i, companion.m10620getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m10593equalsimpl0(i, companion.m10603getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m10593equalsimpl0(i, companion.m10624getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m10593equalsimpl0(i, companion.m10607getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m10593equalsimpl0(i, companion.m10622getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m10593equalsimpl0(i, companion.m10605getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m10593equalsimpl0(i, companion.m10623getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m10593equalsimpl0(i, companion.m10606getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m10593equalsimpl0(i, companion.m10621getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m10593equalsimpl0(i, companion.m10604getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m10593equalsimpl0(i, companion.m10625getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m10593equalsimpl0(i, companion.m10616getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m10593equalsimpl0(i, companion.m10613getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m10593equalsimpl0(i, companion.m10618getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m10593equalsimpl0(i, companion.m10615getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m10593equalsimpl0(i, companion.m10601getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m10593equalsimpl0(i, companion.m10611getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m10593equalsimpl0(i, companion.m10600getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m10593equalsimpl0(i, companion.m10599getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m10593equalsimpl0(i, companion.m10609getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m10593equalsimpl0(i, companion.m10619getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m10593equalsimpl0(i, companion.m10602getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m10593equalsimpl0(i, companion.m10608getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m10593equalsimpl0(i, companion.m10614getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m10593equalsimpl0(i, companion.m10610getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m10593equalsimpl0(i, companion.m10617getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m10593equalsimpl0(i, companion.m10598getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m10593equalsimpl0(i, companion.m10612getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    public static final int toComposeBlendMode(@NotNull android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.INSTANCE.m10597getClear0nO6VwU();
            case 2:
                return BlendMode.INSTANCE.m10620getSrc0nO6VwU();
            case 3:
                return BlendMode.INSTANCE.m10603getDst0nO6VwU();
            case 4:
                return BlendMode.INSTANCE.m10624getSrcOver0nO6VwU();
            case 5:
                return BlendMode.INSTANCE.m10607getDstOver0nO6VwU();
            case 6:
                return BlendMode.INSTANCE.m10622getSrcIn0nO6VwU();
            case 7:
                return BlendMode.INSTANCE.m10605getDstIn0nO6VwU();
            case 8:
                return BlendMode.INSTANCE.m10623getSrcOut0nO6VwU();
            case 9:
                return BlendMode.INSTANCE.m10606getDstOut0nO6VwU();
            case 10:
                return BlendMode.INSTANCE.m10621getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.INSTANCE.m10604getDstAtop0nO6VwU();
            case 12:
                return BlendMode.INSTANCE.m10625getXor0nO6VwU();
            case 13:
                return BlendMode.INSTANCE.m10616getPlus0nO6VwU();
            case 14:
                return BlendMode.INSTANCE.m10613getModulate0nO6VwU();
            case 15:
                return BlendMode.INSTANCE.m10618getScreen0nO6VwU();
            case 16:
                return BlendMode.INSTANCE.m10615getOverlay0nO6VwU();
            case 17:
                return BlendMode.INSTANCE.m10601getDarken0nO6VwU();
            case 18:
                return BlendMode.INSTANCE.m10611getLighten0nO6VwU();
            case 19:
                return BlendMode.INSTANCE.m10600getColorDodge0nO6VwU();
            case 20:
                return BlendMode.INSTANCE.m10599getColorBurn0nO6VwU();
            case 21:
                return BlendMode.INSTANCE.m10609getHardlight0nO6VwU();
            case 22:
                return BlendMode.INSTANCE.m10619getSoftlight0nO6VwU();
            case 23:
                return BlendMode.INSTANCE.m10602getDifference0nO6VwU();
            case 24:
                return BlendMode.INSTANCE.m10608getExclusion0nO6VwU();
            case 25:
                return BlendMode.INSTANCE.m10614getMultiply0nO6VwU();
            case 26:
                return BlendMode.INSTANCE.m10610getHue0nO6VwU();
            case 27:
                return BlendMode.INSTANCE.m10617getSaturation0nO6VwU();
            case 28:
                return BlendMode.INSTANCE.m10598getColor0nO6VwU();
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                return BlendMode.INSTANCE.m10612getLuminosity0nO6VwU();
            default:
                return BlendMode.INSTANCE.m10624getSrcOver0nO6VwU();
        }
    }

    @NotNull
    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m10534toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m10593equalsimpl0(i, companion.m10597getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m10593equalsimpl0(i, companion.m10620getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m10593equalsimpl0(i, companion.m10603getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m10593equalsimpl0(i, companion.m10624getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m10593equalsimpl0(i, companion.m10607getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m10593equalsimpl0(i, companion.m10622getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m10593equalsimpl0(i, companion.m10605getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m10593equalsimpl0(i, companion.m10623getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m10593equalsimpl0(i, companion.m10606getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m10593equalsimpl0(i, companion.m10621getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m10593equalsimpl0(i, companion.m10604getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m10593equalsimpl0(i, companion.m10625getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m10593equalsimpl0(i, companion.m10616getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m10593equalsimpl0(i, companion.m10618getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m10593equalsimpl0(i, companion.m10615getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m10593equalsimpl0(i, companion.m10601getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m10593equalsimpl0(i, companion.m10611getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m10593equalsimpl0(i, companion.m10613getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
