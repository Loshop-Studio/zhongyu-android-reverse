package androidx.compose.p014ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.BlendMode;

/* loaded from: classes2.dex */
public final class AndroidBlendMode_androidKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m30728isSupporteds9anfk8(int i10) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m30789equalsimpl0(i10, BlendMode.Companion.m30820getSrcOver0nO6VwU()) || m30730toPorterDuffModes9anfk8(i10) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m30729toAndroidBlendModes9anfk8(int i10) {
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m30789equalsimpl0(i10, companion.m30793getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m30789equalsimpl0(i10, companion.m30816getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m30789equalsimpl0(i10, companion.m30799getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m30789equalsimpl0(i10, companion.m30820getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m30789equalsimpl0(i10, companion.m30803getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m30789equalsimpl0(i10, companion.m30818getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m30789equalsimpl0(i10, companion.m30801getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m30789equalsimpl0(i10, companion.m30819getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m30789equalsimpl0(i10, companion.m30802getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m30789equalsimpl0(i10, companion.m30817getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m30789equalsimpl0(i10, companion.m30800getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m30789equalsimpl0(i10, companion.m30821getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m30789equalsimpl0(i10, companion.m30812getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m30789equalsimpl0(i10, companion.m30809getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m30789equalsimpl0(i10, companion.m30814getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m30789equalsimpl0(i10, companion.m30811getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m30789equalsimpl0(i10, companion.m30797getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m30789equalsimpl0(i10, companion.m30807getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m30789equalsimpl0(i10, companion.m30796getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m30789equalsimpl0(i10, companion.m30795getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m30789equalsimpl0(i10, companion.m30805getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m30789equalsimpl0(i10, companion.m30815getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m30789equalsimpl0(i10, companion.m30798getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m30789equalsimpl0(i10, companion.m30804getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m30789equalsimpl0(i10, companion.m30810getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m30789equalsimpl0(i10, companion.m30806getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m30789equalsimpl0(i10, companion.m30813getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m30789equalsimpl0(i10, companion.m30794getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m30789equalsimpl0(i10, companion.m30808getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @RequiresApi(29)
    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.Companion.m30793getClear0nO6VwU();
            case 2:
                return BlendMode.Companion.m30816getSrc0nO6VwU();
            case 3:
                return BlendMode.Companion.m30799getDst0nO6VwU();
            case 4:
                return BlendMode.Companion.m30820getSrcOver0nO6VwU();
            case 5:
                return BlendMode.Companion.m30803getDstOver0nO6VwU();
            case 6:
                return BlendMode.Companion.m30818getSrcIn0nO6VwU();
            case 7:
                return BlendMode.Companion.m30801getDstIn0nO6VwU();
            case 8:
                return BlendMode.Companion.m30819getSrcOut0nO6VwU();
            case 9:
                return BlendMode.Companion.m30802getDstOut0nO6VwU();
            case 10:
                return BlendMode.Companion.m30817getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.Companion.m30800getDstAtop0nO6VwU();
            case 12:
                return BlendMode.Companion.m30821getXor0nO6VwU();
            case 13:
                return BlendMode.Companion.m30812getPlus0nO6VwU();
            case 14:
                return BlendMode.Companion.m30809getModulate0nO6VwU();
            case 15:
                return BlendMode.Companion.m30814getScreen0nO6VwU();
            case 16:
                return BlendMode.Companion.m30811getOverlay0nO6VwU();
            case 17:
                return BlendMode.Companion.m30797getDarken0nO6VwU();
            case 18:
                return BlendMode.Companion.m30807getLighten0nO6VwU();
            case 19:
                return BlendMode.Companion.m30796getColorDodge0nO6VwU();
            case 20:
                return BlendMode.Companion.m30795getColorBurn0nO6VwU();
            case 21:
                return BlendMode.Companion.m30805getHardlight0nO6VwU();
            case 22:
                return BlendMode.Companion.m30815getSoftlight0nO6VwU();
            case 23:
                return BlendMode.Companion.m30798getDifference0nO6VwU();
            case 24:
                return BlendMode.Companion.m30804getExclusion0nO6VwU();
            case 25:
                return BlendMode.Companion.m30810getMultiply0nO6VwU();
            case 26:
                return BlendMode.Companion.m30806getHue0nO6VwU();
            case 27:
                return BlendMode.Companion.m30813getSaturation0nO6VwU();
            case 28:
                return BlendMode.Companion.m30794getColor0nO6VwU();
            case 29:
                return BlendMode.Companion.m30808getLuminosity0nO6VwU();
            default:
                return BlendMode.Companion.m30820getSrcOver0nO6VwU();
        }
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m30730toPorterDuffModes9anfk8(int i10) {
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m30789equalsimpl0(i10, companion.m30793getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m30789equalsimpl0(i10, companion.m30816getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m30789equalsimpl0(i10, companion.m30799getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m30789equalsimpl0(i10, companion.m30820getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m30789equalsimpl0(i10, companion.m30803getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m30789equalsimpl0(i10, companion.m30818getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m30789equalsimpl0(i10, companion.m30801getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m30789equalsimpl0(i10, companion.m30819getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m30789equalsimpl0(i10, companion.m30802getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m30789equalsimpl0(i10, companion.m30817getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m30789equalsimpl0(i10, companion.m30800getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m30789equalsimpl0(i10, companion.m30821getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m30789equalsimpl0(i10, companion.m30812getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m30789equalsimpl0(i10, companion.m30814getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m30789equalsimpl0(i10, companion.m30811getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m30789equalsimpl0(i10, companion.m30797getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m30789equalsimpl0(i10, companion.m30807getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m30789equalsimpl0(i10, companion.m30809getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
