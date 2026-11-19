package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.graphics.colorspace.ColorSpace;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p014ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.AbstractC10787r;
import p309qc.C10781l;

@Immutable
/* loaded from: classes2.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30889getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30890getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30891getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30892getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30893getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30894getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30895getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30896getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30897getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30898getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30899getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30900getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m30901getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m30902hslJlNiLsg$default(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m30917hslJlNiLsg(f10, f11, f12, f14, rgb);
        }

        private final float hslToRgbComponent(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 30.0f)) % 12.0f;
            return f12 - ((f11 * Math.min(f12, 1.0f - f12)) * Math.max(-1.0f, Math.min(f13 - 3, Math.min(9 - f13, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m30903hsvJlNiLsg$default(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m30918hsvJlNiLsg(f10, f11, f12, f14, rgb);
        }

        private final float hsvToRgbComponent(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 60.0f)) % 6.0f;
            return f12 - ((f11 * f12) * Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m30904getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m30905getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m30906getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m30907getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m30908getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m30909getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m30910getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m30911getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m30912getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m30913getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m30914getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m30915getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m30916getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m30917hslJlNiLsg(float f10, float f11, float f12, float f13, Rgb rgb) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f10, f11, f12), hslToRgbComponent(8, f10, f11, f12), hslToRgbComponent(4, f10, f11, f12), f13, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m30918hsvJlNiLsg(float f10, float f11, float f12, float f13, Rgb rgb) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, f10, f11, f12), hsvToRgbComponent(3, f10, f11, f12), hsvToRgbComponent(1, f10, f11, f12), f13, rgb);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m30868boximpl(long j10) {
        return new Color(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m30869component1impl(long j10) {
        return m30884getRedimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m30870component2impl(long j10) {
        return m30883getGreenimpl(j10);
    }

    @Stable
    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m30871component3impl(long j10) {
        return m30881getBlueimpl(j10);
    }

    @Stable
    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m30872component4impl(long j10) {
        return m30880getAlphaimpl(j10);
    }

    @Stable
    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m30873component5impl(long j10) {
        return m30882getColorSpaceimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m30874constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m30875convertvNxB06k(long j10, ColorSpace colorSpace) {
        return ColorSpaceKt.m31297connectYBCOT_4$default(m30882getColorSpaceimpl(j10), colorSpace, 0, 2, null).mo31300transformToColorl2rxGTc$ui_graphics_release(j10);
    }

    @Stable
    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m30876copywmQWz5c(long j10, float f10, float f11, float f12, float f13) {
        return ColorKt.Color(f11, f12, f13, f10, m30882getColorSpaceimpl(j10));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m30877copywmQWz5c$default(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m30880getAlphaimpl(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = m30884getRedimpl(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = m30883getGreenimpl(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = m30881getBlueimpl(j10);
        }
        return m30876copywmQWz5c(j10, f14, f15, f16, f13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30878equalsimpl(long j10, Object obj) {
        return (obj instanceof Color) && j10 == ((Color) obj).m30888unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30879equalsimpl0(long j10, long j11) {
        return C10781l.m23025d(j10, j11);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m30880getAlphaimpl(long j10) {
        float fM23071c;
        float f10;
        if (C10781l.m23023b(63 & j10) == 0) {
            fM23071c = (float) AbstractC10787r.m23071c(C10781l.m23023b(C10781l.m23023b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fM23071c = (float) AbstractC10787r.m23071c(C10781l.m23023b(C10781l.m23023b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fM23071c / f10;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m30881getBlueimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C10781l.m23023b(63 & j10) == 0) {
            return ((float) AbstractC10787r.m23071c(C10781l.m23023b(C10781l.m23023b(j10 >>> 32) & 255))) / 255.0f;
        }
        short sM23023b = (short) C10781l.m23023b(C10781l.m23023b(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sM23023b;
        int i14 = ((65535 & sM23023b) >>> 10) & 31;
        int i15 = sM23023b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m30882getColorSpaceimpl(long j10) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) C10781l.m23023b(j10 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m30883getGreenimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C10781l.m23023b(63 & j10) == 0) {
            return ((float) AbstractC10787r.m23071c(C10781l.m23023b(C10781l.m23023b(j10 >>> 40) & 255))) / 255.0f;
        }
        short sM23023b = (short) C10781l.m23023b(C10781l.m23023b(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sM23023b;
        int i14 = ((65535 & sM23023b) >>> 10) & 31;
        int i15 = sM23023b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m30884getRedimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C10781l.m23023b(63 & j10) == 0) {
            return ((float) AbstractC10787r.m23071c(C10781l.m23023b(C10781l.m23023b(j10 >>> 48) & 255))) / 255.0f;
        }
        short sM23023b = (short) C10781l.m23023b(C10781l.m23023b(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sM23023b;
        int i14 = ((65535 & sM23023b) >>> 10) & 31;
        int i15 = sM23023b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30885hashCodeimpl(long j10) {
        return C10781l.m23026e(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30886toStringimpl(long j10) {
        return "Color(" + m30884getRedimpl(j10) + ", " + m30883getGreenimpl(j10) + ", " + m30881getBlueimpl(j10) + ", " + m30880getAlphaimpl(j10) + ", " + m30882getColorSpaceimpl(j10).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m30878equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m30887getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m30885hashCodeimpl(this.value);
    }

    public String toString() {
        return m30886toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m30888unboximpl() {
        return this.value;
    }
}
