package androidx.compose.p009ui.graphics;

import androidx.compose.p009ui.graphics.colorspace.ColorSpace;
import androidx.compose.p009ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p009ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p009ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b&\u0010\u0013J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J=\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m7880d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,659:1\n360#2:660\n578#3,12:661\n590#3,17:674\n578#3,12:691\n590#3,17:704\n578#3,12:721\n590#3,17:734\n22#4:673\n22#4:703\n22#4:733\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n156#1:661,12\n156#1:674,17\n177#1:691,12\n177#1:704,17\n198#1:721,12\n198#1:734,17\n156#1:673\n177#1:703\n198#1:733\n*E\n"})
/* loaded from: classes2.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    @Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J?\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R$\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R$\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R$\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R$\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m7880d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,659:1\n33#2,5:660\n33#2,5:665\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n310#1:660,5\n343#1:665,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13910getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13911getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13912getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13913getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13914getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13915getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13916getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13917getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13918getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13919getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13920getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13921getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m13922getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m13923hslJlNiLsg$default(Companion companion, float f6, float f7, float f8, float f9, Rgb rgb, int i6, Object obj) {
            if ((i6 & 8) != 0) {
                f9 = 1.0f;
            }
            float f10 = f9;
            if ((i6 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m13938hslJlNiLsg(f6, f7, f8, f10, rgb);
        }

        private final float hslToRgbComponent(int n6, float h6, float s6, float l6) {
            float f6 = (n6 + (h6 / 30.0f)) % 12.0f;
            return l6 - ((s6 * Math.min(l6, 1.0f - l6)) * Math.max(-1.0f, Math.min(f6 - 3, Math.min(9 - f6, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m13924hsvJlNiLsg$default(Companion companion, float f6, float f7, float f8, float f9, Rgb rgb, int i6, Object obj) {
            if ((i6 & 8) != 0) {
                f9 = 1.0f;
            }
            float f10 = f9;
            if ((i6 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m13939hsvJlNiLsg(f6, f7, f8, f10, rgb);
        }

        private final float hsvToRgbComponent(int n6, float h6, float s6, float v6) {
            float f6 = (n6 + (h6 / 60.0f)) % 6.0f;
            return v6 - ((s6 * v6) * Math.max(0.0f, Math.min(f6, Math.min(4 - f6, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m13925getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m13926getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m13927getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m13928getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m13929getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m13930getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m13931getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m13932getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m13933getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m13934getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m13935getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m13936getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m13937getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m13938hslJlNiLsg(float hue, float saturation, float lightness, float alpha, Rgb colorSpace) {
            if (!(0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= lightness && lightness <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, hue, saturation, lightness), hslToRgbComponent(8, hue, saturation, lightness), hslToRgbComponent(4, hue, saturation, lightness), alpha, colorSpace);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m13939hsvJlNiLsg(float hue, float saturation, float value, float alpha, Rgb colorSpace) {
            if (!(0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= value && value <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, hue, saturation, value), hsvToRgbComponent(3, hue, saturation, value), hsvToRgbComponent(1, hue, saturation, value), alpha, colorSpace);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(long j6) {
        this.value = j6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m13889boximpl(long j6) {
        return new Color(j6);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m13890component1impl(long j6) {
        return m13905getRedimpl(j6);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m13891component2impl(long j6) {
        return m13904getGreenimpl(j6);
    }

    @Stable
    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m13892component3impl(long j6) {
        return m13902getBlueimpl(j6);
    }

    @Stable
    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m13893component4impl(long j6) {
        return m13901getAlphaimpl(j6);
    }

    @Stable
    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m13894component5impl(long j6) {
        return m13903getColorSpaceimpl(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13895constructorimpl(long j6) {
        return j6;
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m13896convertvNxB06k(long j6, ColorSpace colorSpace) {
        return ColorSpaceKt.m14318connectYBCOT_4$default(m13903getColorSpaceimpl(j6), colorSpace, 0, 2, null).mo14321transformToColorl2rxGTc$ui_graphics_release(j6);
    }

    @Stable
    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m13897copywmQWz5c(long j6, float f6, float f7, float f8, float f9) {
        return ColorKt.Color(f7, f8, f9, f6, m13903getColorSpaceimpl(j6));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m13898copywmQWz5c$default(long j6, float f6, float f7, float f8, float f9, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = m13901getAlphaimpl(j6);
        }
        float f10 = f6;
        if ((i6 & 2) != 0) {
            f7 = m13905getRedimpl(j6);
        }
        float f11 = f7;
        if ((i6 & 4) != 0) {
            f8 = m13904getGreenimpl(j6);
        }
        float f12 = f8;
        if ((i6 & 8) != 0) {
            f9 = m13902getBlueimpl(j6);
        }
        return m13897copywmQWz5c(j6, f10, f11, f12, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13899equalsimpl(long j6, Object obj) {
        return (obj instanceof Color) && j6 == ((Color) obj).m13909unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13900equalsimpl0(long j6, long j7) {
        return ULong.m17364equalsimpl0(j6, j7);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m13901getAlphaimpl(long j6) {
        float fUlongToDouble;
        float f6;
        if (ULong.m17357constructorimpl(63 & j6) == 0) {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 56) & 255));
            f6 = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedKt.ulongToDouble(ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 6) & 1023));
            f6 = 1023.0f;
        }
        return fUlongToDouble / f6;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m13902getBlueimpl(long j6) {
        int i6;
        int i7;
        int i8;
        if (ULong.m17357constructorimpl(63 & j6) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 32) & 255))) / 255.0f;
        }
        short sM17357constructorimpl = (short) ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 16) & 65535);
        int i9 = Short.MIN_VALUE & sM17357constructorimpl;
        int i10 = ((65535 & sM17357constructorimpl) >>> 10) & 31;
        int i11 = sM17357constructorimpl & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m13903getColorSpaceimpl(long j6) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m17357constructorimpl(j6 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m13904getGreenimpl(long j6) {
        int i6;
        int i7;
        int i8;
        if (ULong.m17357constructorimpl(63 & j6) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 40) & 255))) / 255.0f;
        }
        short sM17357constructorimpl = (short) ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 32) & 65535);
        int i9 = Short.MIN_VALUE & sM17357constructorimpl;
        int i10 = ((65535 & sM17357constructorimpl) >>> 10) & 31;
        int i11 = sM17357constructorimpl & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m13905getRedimpl(long j6) {
        int i6;
        int i7;
        int i8;
        if (ULong.m17357constructorimpl(63 & j6) == 0) {
            return ((float) UnsignedKt.ulongToDouble(ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 48) & 255))) / 255.0f;
        }
        short sM17357constructorimpl = (short) ULong.m17357constructorimpl(ULong.m17357constructorimpl(j6 >>> 48) & 65535);
        int i9 = Short.MIN_VALUE & sM17357constructorimpl;
        int i10 = ((65535 & sM17357constructorimpl) >>> 10) & 31;
        int i11 = sM17357constructorimpl & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i9 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13906hashCodeimpl(long j6) {
        return ULong.m17369hashCodeimpl(j6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13907toStringimpl(long j6) {
        return "Color(" + m13905getRedimpl(j6) + ", " + m13904getGreenimpl(j6) + ", " + m13902getBlueimpl(j6) + ", " + m13901getAlphaimpl(j6) + ", " + m13903getColorSpaceimpl(j6).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m13899equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m13906hashCodeimpl(this.value);
    }

    public String toString() {
        return m13907toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m13909unboximpl() {
        return this.value;
    }
}
