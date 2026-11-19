package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m30787constructorimpl(0);
    private static final int Src = m30787constructorimpl(1);
    private static final int Dst = m30787constructorimpl(2);
    private static final int SrcOver = m30787constructorimpl(3);
    private static final int DstOver = m30787constructorimpl(4);
    private static final int SrcIn = m30787constructorimpl(5);
    private static final int DstIn = m30787constructorimpl(6);
    private static final int SrcOut = m30787constructorimpl(7);
    private static final int DstOut = m30787constructorimpl(8);
    private static final int SrcAtop = m30787constructorimpl(9);
    private static final int DstAtop = m30787constructorimpl(10);
    private static final int Xor = m30787constructorimpl(11);
    private static final int Plus = m30787constructorimpl(12);
    private static final int Modulate = m30787constructorimpl(13);
    private static final int Screen = m30787constructorimpl(14);
    private static final int Overlay = m30787constructorimpl(15);
    private static final int Darken = m30787constructorimpl(16);
    private static final int Lighten = m30787constructorimpl(17);
    private static final int ColorDodge = m30787constructorimpl(18);
    private static final int ColorBurn = m30787constructorimpl(19);
    private static final int Hardlight = m30787constructorimpl(20);
    private static final int Softlight = m30787constructorimpl(21);
    private static final int Difference = m30787constructorimpl(22);
    private static final int Exclusion = m30787constructorimpl(23);
    private static final int Multiply = m30787constructorimpl(24);
    private static final int Hue = m30787constructorimpl(25);
    private static final int Saturation = m30787constructorimpl(26);
    private static final int Color = m30787constructorimpl(27);
    private static final int Luminosity = m30787constructorimpl(28);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m30793getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m30794getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m30795getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m30796getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m30797getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m30798getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m30799getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m30800getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m30801getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m30802getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m30803getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m30804getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m30805getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m30806getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m30807getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m30808getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m30809getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m30810getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m30811getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m30812getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m30813getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m30814getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m30815getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m30816getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m30817getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m30818getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m30819getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m30820getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m30821getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlendMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m30786boximpl(int i10) {
        return new BlendMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30787constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30788equalsimpl(int i10, Object obj) {
        return (obj instanceof BlendMode) && i10 == ((BlendMode) obj).m30792unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30789equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30790hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30791toStringimpl(int i10) {
        return m30789equalsimpl0(i10, Clear) ? "Clear" : m30789equalsimpl0(i10, Src) ? "Src" : m30789equalsimpl0(i10, Dst) ? "Dst" : m30789equalsimpl0(i10, SrcOver) ? "SrcOver" : m30789equalsimpl0(i10, DstOver) ? "DstOver" : m30789equalsimpl0(i10, SrcIn) ? "SrcIn" : m30789equalsimpl0(i10, DstIn) ? "DstIn" : m30789equalsimpl0(i10, SrcOut) ? "SrcOut" : m30789equalsimpl0(i10, DstOut) ? "DstOut" : m30789equalsimpl0(i10, SrcAtop) ? "SrcAtop" : m30789equalsimpl0(i10, DstAtop) ? "DstAtop" : m30789equalsimpl0(i10, Xor) ? "Xor" : m30789equalsimpl0(i10, Plus) ? "Plus" : m30789equalsimpl0(i10, Modulate) ? "Modulate" : m30789equalsimpl0(i10, Screen) ? "Screen" : m30789equalsimpl0(i10, Overlay) ? "Overlay" : m30789equalsimpl0(i10, Darken) ? "Darken" : m30789equalsimpl0(i10, Lighten) ? "Lighten" : m30789equalsimpl0(i10, ColorDodge) ? "ColorDodge" : m30789equalsimpl0(i10, ColorBurn) ? "ColorBurn" : m30789equalsimpl0(i10, Hardlight) ? "HardLight" : m30789equalsimpl0(i10, Softlight) ? "Softlight" : m30789equalsimpl0(i10, Difference) ? "Difference" : m30789equalsimpl0(i10, Exclusion) ? "Exclusion" : m30789equalsimpl0(i10, Multiply) ? "Multiply" : m30789equalsimpl0(i10, Hue) ? "Hue" : m30789equalsimpl0(i10, Saturation) ? ExifInterface.TAG_SATURATION : m30789equalsimpl0(i10, Color) ? "Color" : m30789equalsimpl0(i10, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m30788equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m30790hashCodeimpl(this.value);
    }

    public String toString() {
        return m30791toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30792unboximpl() {
        return this.value;
    }
}
