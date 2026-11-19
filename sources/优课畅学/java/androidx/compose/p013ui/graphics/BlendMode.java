package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m24185constructorimpl(0);
    private static final int Src = m24185constructorimpl(1);
    private static final int Dst = m24185constructorimpl(2);
    private static final int SrcOver = m24185constructorimpl(3);
    private static final int DstOver = m24185constructorimpl(4);
    private static final int SrcIn = m24185constructorimpl(5);
    private static final int DstIn = m24185constructorimpl(6);
    private static final int SrcOut = m24185constructorimpl(7);
    private static final int DstOut = m24185constructorimpl(8);
    private static final int SrcAtop = m24185constructorimpl(9);
    private static final int DstAtop = m24185constructorimpl(10);
    private static final int Xor = m24185constructorimpl(11);
    private static final int Plus = m24185constructorimpl(12);
    private static final int Modulate = m24185constructorimpl(13);
    private static final int Screen = m24185constructorimpl(14);
    private static final int Overlay = m24185constructorimpl(15);
    private static final int Darken = m24185constructorimpl(16);
    private static final int Lighten = m24185constructorimpl(17);
    private static final int ColorDodge = m24185constructorimpl(18);
    private static final int ColorBurn = m24185constructorimpl(19);
    private static final int Hardlight = m24185constructorimpl(20);
    private static final int Softlight = m24185constructorimpl(21);
    private static final int Difference = m24185constructorimpl(22);
    private static final int Exclusion = m24185constructorimpl(23);
    private static final int Multiply = m24185constructorimpl(24);
    private static final int Hue = m24185constructorimpl(25);
    private static final int Saturation = m24185constructorimpl(26);
    private static final int Color = m24185constructorimpl(27);
    private static final int Luminosity = m24185constructorimpl(28);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m24191getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m24192getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m24193getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m24194getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m24195getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m24196getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m24197getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m24198getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m24199getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m24200getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m24201getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m24202getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m24203getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m24204getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m24205getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m24206getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m24207getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m24208getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m24209getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m24210getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m24211getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m24212getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m24213getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m24214getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m24215getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m24216getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m24217getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m24218getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m24219getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlendMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m24184boximpl(int i10) {
        return new BlendMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24185constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24186equalsimpl(int i10, Object obj) {
        return (obj instanceof BlendMode) && i10 == ((BlendMode) obj).m24190unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24187equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24188hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24189toStringimpl(int i10) {
        return m24187equalsimpl0(i10, Clear) ? "Clear" : m24187equalsimpl0(i10, Src) ? "Src" : m24187equalsimpl0(i10, Dst) ? "Dst" : m24187equalsimpl0(i10, SrcOver) ? "SrcOver" : m24187equalsimpl0(i10, DstOver) ? "DstOver" : m24187equalsimpl0(i10, SrcIn) ? "SrcIn" : m24187equalsimpl0(i10, DstIn) ? "DstIn" : m24187equalsimpl0(i10, SrcOut) ? "SrcOut" : m24187equalsimpl0(i10, DstOut) ? "DstOut" : m24187equalsimpl0(i10, SrcAtop) ? "SrcAtop" : m24187equalsimpl0(i10, DstAtop) ? "DstAtop" : m24187equalsimpl0(i10, Xor) ? "Xor" : m24187equalsimpl0(i10, Plus) ? "Plus" : m24187equalsimpl0(i10, Modulate) ? "Modulate" : m24187equalsimpl0(i10, Screen) ? "Screen" : m24187equalsimpl0(i10, Overlay) ? "Overlay" : m24187equalsimpl0(i10, Darken) ? "Darken" : m24187equalsimpl0(i10, Lighten) ? "Lighten" : m24187equalsimpl0(i10, ColorDodge) ? "ColorDodge" : m24187equalsimpl0(i10, ColorBurn) ? "ColorBurn" : m24187equalsimpl0(i10, Hardlight) ? "HardLight" : m24187equalsimpl0(i10, Softlight) ? "Softlight" : m24187equalsimpl0(i10, Difference) ? "Difference" : m24187equalsimpl0(i10, Exclusion) ? "Exclusion" : m24187equalsimpl0(i10, Multiply) ? "Multiply" : m24187equalsimpl0(i10, Hue) ? "Hue" : m24187equalsimpl0(i10, Saturation) ? ExifInterface.TAG_SATURATION : m24187equalsimpl0(i10, Color) ? "Color" : m24187equalsimpl0(i10, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24186equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24188hashCodeimpl(this.value);
    }

    public String toString() {
        return m24189toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24190unboximpl() {
        return this.value;
    }
}
