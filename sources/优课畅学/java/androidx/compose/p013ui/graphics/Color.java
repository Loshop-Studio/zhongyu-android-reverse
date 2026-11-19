package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.AbstractC8737q;
import p123h7.C8731k;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24287getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24288getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24289getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24290getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24291getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24292getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24293getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24294getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24295getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24296getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24297getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24298getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m24299getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m24300hslJlNiLsg$default(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m24315hslJlNiLsg(f10, f11, f12, f14, rgb);
        }

        private final float hslToRgbComponent(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 30.0f)) % 12.0f;
            return f12 - ((f11 * Math.min(f12, 1.0f - f12)) * Math.max(-1.0f, Math.min(f13 - 3, Math.min(9 - f13, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m24301hsvJlNiLsg$default(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m24316hsvJlNiLsg(f10, f11, f12, f14, rgb);
        }

        private final float hsvToRgbComponent(int i10, float f10, float f11, float f12) {
            float f13 = (i10 + (f10 / 60.0f)) % 6.0f;
            return f12 - ((f11 * f12) * Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m24302getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m24303getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m24304getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m24305getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m24306getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m24307getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m24308getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m24309getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m24310getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m24311getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m24312getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m24313getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m24314getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m24315hslJlNiLsg(float f10, float f11, float f12, float f13, Rgb rgb) {
            if (!(0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f10, f11, f12), hslToRgbComponent(8, f10, f11, f12), hslToRgbComponent(4, f10, f11, f12), f13, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m24316hsvJlNiLsg(float f10, float f11, float f12, float f13, Rgb rgb) {
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
    public static final /* synthetic */ Color m24266boximpl(long j10) {
        return new Color(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m24267component1impl(long j10) {
        return m24282getRedimpl(j10);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m24268component2impl(long j10) {
        return m24281getGreenimpl(j10);
    }

    @Stable
    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m24269component3impl(long j10) {
        return m24279getBlueimpl(j10);
    }

    @Stable
    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m24270component4impl(long j10) {
        return m24278getAlphaimpl(j10);
    }

    @Stable
    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m24271component5impl(long j10) {
        return m24280getColorSpaceimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m24272constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m24273convertvNxB06k(long j10, ColorSpace colorSpace) {
        return ColorSpaceKt.m24695connectYBCOT_4$default(m24280getColorSpaceimpl(j10), colorSpace, 0, 2, null).mo24698transformToColorl2rxGTc$ui_graphics_release(j10);
    }

    @Stable
    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m24274copywmQWz5c(long j10, float f10, float f11, float f12, float f13) {
        return ColorKt.Color(f11, f12, f13, f10, m24280getColorSpaceimpl(j10));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m24275copywmQWz5c$default(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m24278getAlphaimpl(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = m24282getRedimpl(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = m24281getGreenimpl(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = m24279getBlueimpl(j10);
        }
        return m24274copywmQWz5c(j10, f14, f15, f16, f13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24276equalsimpl(long j10, Object obj) {
        return (obj instanceof Color) && j10 == ((Color) obj).m24286unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24277equalsimpl0(long j10, long j11) {
        return C8731k.m14280d(j10, j11);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m24278getAlphaimpl(long j10) {
        float fM14326c;
        float f10;
        if (C8731k.m14278b(63 & j10) == 0) {
            fM14326c = (float) AbstractC8737q.m14326c(C8731k.m14278b(C8731k.m14278b(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fM14326c = (float) AbstractC8737q.m14326c(C8731k.m14278b(C8731k.m14278b(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fM14326c / f10;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m24279getBlueimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C8731k.m14278b(63 & j10) == 0) {
            return ((float) AbstractC8737q.m14326c(C8731k.m14278b(C8731k.m14278b(j10 >>> 32) & 255))) / 255.0f;
        }
        short sM14278b = (short) C8731k.m14278b(C8731k.m14278b(j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sM14278b;
        int i14 = ((65535 & sM14278b) >>> 10) & 31;
        int i15 = sM14278b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
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
    public static final ColorSpace m24280getColorSpaceimpl(long j10) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) C8731k.m14278b(j10 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m24281getGreenimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C8731k.m14278b(63 & j10) == 0) {
            return ((float) AbstractC8737q.m14326c(C8731k.m14278b(C8731k.m14278b(j10 >>> 40) & 255))) / 255.0f;
        }
        short sM14278b = (short) C8731k.m14278b(C8731k.m14278b(j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sM14278b;
        int i14 = ((65535 & sM14278b) >>> 10) & 31;
        int i15 = sM14278b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
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
    public static final float m24282getRedimpl(long j10) {
        int i10;
        int i11;
        int i12;
        if (C8731k.m14278b(63 & j10) == 0) {
            return ((float) AbstractC8737q.m14326c(C8731k.m14278b(C8731k.m14278b(j10 >>> 48) & 255))) / 255.0f;
        }
        short sM14278b = (short) C8731k.m14278b(C8731k.m14278b(j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sM14278b;
        int i14 = ((65535 & sM14278b) >>> 10) & 31;
        int i15 = sM14278b & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
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
    public static int m24283hashCodeimpl(long j10) {
        return C8731k.m14281e(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24284toStringimpl(long j10) {
        return "Color(" + m24282getRedimpl(j10) + ", " + m24281getGreenimpl(j10) + ", " + m24279getBlueimpl(j10) + ", " + m24278getAlphaimpl(j10) + ", " + m24280getColorSpaceimpl(j10).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m24276equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m24285getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m24283hashCodeimpl(this.value);
    }

    public String toString() {
        return m24284toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m24286unboximpl() {
        return this.value;
    }
}
