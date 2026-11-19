package androidx.compose.p009ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p009ui.graphics.BlendMode;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, m7880d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class AndroidBlendMode_androidKt {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
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
    public static final boolean m13749isSupporteds9anfk8(int i6) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m13810equalsimpl0(i6, BlendMode.INSTANCE.m13841getSrcOver0nO6VwU()) || m13751toPorterDuffModes9anfk8(i6) != PorterDuff.Mode.SRC_OVER;
    }

    @RequiresApi(29)
    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final BlendMode m13750toAndroidBlendModes9anfk8(int i6) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m13810equalsimpl0(i6, companion.m13814getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m13810equalsimpl0(i6, companion.m13837getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m13810equalsimpl0(i6, companion.m13820getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m13810equalsimpl0(i6, companion.m13841getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m13810equalsimpl0(i6, companion.m13824getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m13810equalsimpl0(i6, companion.m13839getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m13810equalsimpl0(i6, companion.m13822getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m13810equalsimpl0(i6, companion.m13840getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m13810equalsimpl0(i6, companion.m13823getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m13810equalsimpl0(i6, companion.m13838getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m13810equalsimpl0(i6, companion.m13821getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m13810equalsimpl0(i6, companion.m13842getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m13810equalsimpl0(i6, companion.m13833getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m13810equalsimpl0(i6, companion.m13830getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m13810equalsimpl0(i6, companion.m13835getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m13810equalsimpl0(i6, companion.m13832getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m13810equalsimpl0(i6, companion.m13818getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m13810equalsimpl0(i6, companion.m13828getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m13810equalsimpl0(i6, companion.m13817getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m13810equalsimpl0(i6, companion.m13816getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m13810equalsimpl0(i6, companion.m13826getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m13810equalsimpl0(i6, companion.m13836getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m13810equalsimpl0(i6, companion.m13819getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m13810equalsimpl0(i6, companion.m13825getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m13810equalsimpl0(i6, companion.m13831getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m13810equalsimpl0(i6, companion.m13827getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m13810equalsimpl0(i6, companion.m13834getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m13810equalsimpl0(i6, companion.m13815getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m13810equalsimpl0(i6, companion.m13829getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @RequiresApi(29)
    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.INSTANCE.m13814getClear0nO6VwU();
            case 2:
                return BlendMode.INSTANCE.m13837getSrc0nO6VwU();
            case 3:
                return BlendMode.INSTANCE.m13820getDst0nO6VwU();
            case 4:
                return BlendMode.INSTANCE.m13841getSrcOver0nO6VwU();
            case 5:
                return BlendMode.INSTANCE.m13824getDstOver0nO6VwU();
            case 6:
                return BlendMode.INSTANCE.m13839getSrcIn0nO6VwU();
            case 7:
                return BlendMode.INSTANCE.m13822getDstIn0nO6VwU();
            case 8:
                return BlendMode.INSTANCE.m13840getSrcOut0nO6VwU();
            case 9:
                return BlendMode.INSTANCE.m13823getDstOut0nO6VwU();
            case 10:
                return BlendMode.INSTANCE.m13838getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.INSTANCE.m13821getDstAtop0nO6VwU();
            case 12:
                return BlendMode.INSTANCE.m13842getXor0nO6VwU();
            case 13:
                return BlendMode.INSTANCE.m13833getPlus0nO6VwU();
            case 14:
                return BlendMode.INSTANCE.m13830getModulate0nO6VwU();
            case 15:
                return BlendMode.INSTANCE.m13835getScreen0nO6VwU();
            case 16:
                return BlendMode.INSTANCE.m13832getOverlay0nO6VwU();
            case 17:
                return BlendMode.INSTANCE.m13818getDarken0nO6VwU();
            case 18:
                return BlendMode.INSTANCE.m13828getLighten0nO6VwU();
            case 19:
                return BlendMode.INSTANCE.m13817getColorDodge0nO6VwU();
            case 20:
                return BlendMode.INSTANCE.m13816getColorBurn0nO6VwU();
            case 21:
                return BlendMode.INSTANCE.m13826getHardlight0nO6VwU();
            case 22:
                return BlendMode.INSTANCE.m13836getSoftlight0nO6VwU();
            case 23:
                return BlendMode.INSTANCE.m13819getDifference0nO6VwU();
            case 24:
                return BlendMode.INSTANCE.m13825getExclusion0nO6VwU();
            case 25:
                return BlendMode.INSTANCE.m13831getMultiply0nO6VwU();
            case 26:
                return BlendMode.INSTANCE.m13827getHue0nO6VwU();
            case 27:
                return BlendMode.INSTANCE.m13834getSaturation0nO6VwU();
            case 28:
                return BlendMode.INSTANCE.m13815getColor0nO6VwU();
            case 29:
                return BlendMode.INSTANCE.m13829getLuminosity0nO6VwU();
            default:
                return BlendMode.INSTANCE.m13841getSrcOver0nO6VwU();
        }
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m13751toPorterDuffModes9anfk8(int i6) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.m13810equalsimpl0(i6, companion.m13814getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m13810equalsimpl0(i6, companion.m13837getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m13810equalsimpl0(i6, companion.m13820getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m13810equalsimpl0(i6, companion.m13841getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m13810equalsimpl0(i6, companion.m13824getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m13810equalsimpl0(i6, companion.m13839getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m13810equalsimpl0(i6, companion.m13822getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m13810equalsimpl0(i6, companion.m13840getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m13810equalsimpl0(i6, companion.m13823getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m13810equalsimpl0(i6, companion.m13838getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m13810equalsimpl0(i6, companion.m13821getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m13810equalsimpl0(i6, companion.m13842getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m13810equalsimpl0(i6, companion.m13833getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m13810equalsimpl0(i6, companion.m13835getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m13810equalsimpl0(i6, companion.m13832getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m13810equalsimpl0(i6, companion.m13818getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m13810equalsimpl0(i6, companion.m13828getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m13810equalsimpl0(i6, companion.m13830getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
