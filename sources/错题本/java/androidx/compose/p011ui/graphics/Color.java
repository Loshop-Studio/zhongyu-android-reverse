package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p011ui.graphics.colorspace.Rgb;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010&\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010+\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\rR\u001a\u0010\u001a\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\rR\u001a\u0010\u001b\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\rR\u001a\u0010\u0018\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006;"}, m5110d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Ld6/n;", "value", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,659:1\n360#2:660\n578#3,12:661\n590#3,17:674\n578#3,12:691\n590#3,17:704\n578#3,12:721\n590#3,17:734\n22#4:673\n22#4:703\n22#4:733\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n156#1:661,12\n156#1:674,17\n177#1:691,12\n177#1:704,17\n198#1:721,12\n198#1:734,17\n156#1:673\n177#1:703\n198#1:733\n*E\n"})
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
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

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J?\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R$\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R$\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R$\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R$\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m5110d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,659:1\n33#2,5:660\n33#2,5:665\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n310#1:660,5\n343#1:665,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10693getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10694getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10695getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10696getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10697getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10698getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10699getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10700getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10701getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10702getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10703getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10704getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m10705getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m10706hslJlNiLsg$default(Companion companion, float f, float f7, float f8, float f9, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f9 = 1.0f;
            }
            float f10 = f9;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m10721hslJlNiLsg(f, f7, f8, f10, rgb);
        }

        private final float hslToRgbComponent(int n4, float h, float s8, float l) {
            float f = ((h / 30.0f) + n4) % 12.0f;
            return l - (Math.max(-1.0f, Math.min(f - 3, Math.min(9 - f, 1.0f))) * (Math.min(l, 1.0f - l) * s8));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m10707hsvJlNiLsg$default(Companion companion, float f, float f7, float f8, float f9, Rgb rgb, int i, Object obj) {
            if ((i & 8) != 0) {
                f9 = 1.0f;
            }
            float f10 = f9;
            if ((i & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m10722hsvJlNiLsg(f, f7, f8, f10, rgb);
        }

        private final float hsvToRgbComponent(int n4, float h, float s8, float v2) {
            float f = ((h / 60.0f) + n4) % 6.0f;
            return v2 - (Math.max(0.0f, Math.min(f, Math.min(4 - f, 1.0f))) * (s8 * v2));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m10708getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m10709getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m10710getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m10711getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m10712getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m10713getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m10714getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m10715getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m10716getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m10717getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m10718getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m10719getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m10720getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m10721hslJlNiLsg(float hue, float saturation, float lightness, float alpha, @NotNull Rgb colorSpace) {
            if (!(0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= lightness && lightness <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, hue, saturation, lightness), hslToRgbComponent(8, hue, saturation, lightness), hslToRgbComponent(4, hue, saturation, lightness), alpha, colorSpace);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m10722hsvJlNiLsg(float hue, float saturation, float value, float alpha, @NotNull Rgb colorSpace) {
            if (!(0.0f <= hue && hue <= 360.0f && 0.0f <= saturation && saturation <= 1.0f && 0.0f <= value && value <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, hue, saturation, value), hsvToRgbComponent(3, hue, saturation, value), hsvToRgbComponent(1, hue, saturation, value), alpha, colorSpace);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(long j7) {
        this.value = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m10672boximpl(long j7) {
        return new Color(j7);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m10673component1impl(long j7) {
        return m10688getRedimpl(j7);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m10674component2impl(long j7) {
        return m10687getGreenimpl(j7);
    }

    @Stable
    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m10675component3impl(long j7) {
        return m10685getBlueimpl(j7);
    }

    @Stable
    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m10676component4impl(long j7) {
        return m10684getAlphaimpl(j7);
    }

    @Stable
    @NotNull
    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m10677component5impl(long j7) {
        return m10686getColorSpaceimpl(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10678constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m10679convertvNxB06k(long j7, @NotNull ColorSpace colorSpace) {
        return ColorSpaceKt.m11101connectYBCOT_4$default(m10686getColorSpaceimpl(j7), colorSpace, 0, 2, null).mo11104transformToColorl2rxGTc$ui_graphics_release(j7);
    }

    @Stable
    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m10680copywmQWz5c(long j7, float f, float f7, float f8, float f9) {
        return ColorKt.Color(f7, f8, f9, f, m10686getColorSpaceimpl(j7));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m10681copywmQWz5c$default(long j7, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m10684getAlphaimpl(j7);
        }
        float f10 = f;
        if ((i & 2) != 0) {
            f7 = m10688getRedimpl(j7);
        }
        float f11 = f7;
        if ((i & 4) != 0) {
            f8 = m10687getGreenimpl(j7);
        }
        float f12 = f8;
        if ((i & 8) != 0) {
            f9 = m10685getBlueimpl(j7);
        }
        return m10680copywmQWz5c(j7, f10, f11, f12, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10682equalsimpl(long j7, Object obj) {
        return (obj instanceof Color) && j7 == ((Color) obj).m10692unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10683equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m10684getAlphaimpl(long j7) {
        float fM6247y;
        float f;
        if ((63 & j7) == 0) {
            fM6247y = (float) AbstractC6600a.m6247y((j7 >>> 56) & 255);
            f = 255.0f;
        } else {
            fM6247y = (float) AbstractC6600a.m6247y((j7 >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM6247y / f;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m10685getBlueimpl(long j7) {
        int i;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) AbstractC6600a.m6247y((j7 >>> 32) & 255)) / 255.0f;
        }
        short s8 = (short) ((j7 >>> 16) & 65535);
        int i10 = Short.MIN_VALUE & s8;
        int i11 = ((65535 & s8) >>> 10) & 31;
        int i12 = s8 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i = i11 + 112;
            }
            int i14 = i;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @NotNull
    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m10686getColorSpaceimpl(long j7) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[(int) (j7 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m10687getGreenimpl(long j7) {
        int i;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) AbstractC6600a.m6247y((j7 >>> 40) & 255)) / 255.0f;
        }
        short s8 = (short) ((j7 >>> 32) & 65535);
        int i10 = Short.MIN_VALUE & s8;
        int i11 = ((65535 & s8) >>> 10) & 31;
        int i12 = s8 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i = i11 + 112;
            }
            int i14 = i;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m10688getRedimpl(long j7) {
        int i;
        int i8;
        int i9;
        if ((63 & j7) == 0) {
            return ((float) AbstractC6600a.m6247y((j7 >>> 48) & 255)) / 255.0f;
        }
        short s8 = (short) ((j7 >>> 48) & 65535);
        int i10 = Short.MIN_VALUE & s8;
        int i11 = ((65535 & s8) >>> 10) & 31;
        int i12 = s8 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i = i11 + 112;
            }
            int i14 = i;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i10 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10689hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10690toStringimpl(long j7) {
        return "Color(" + m10688getRedimpl(j7) + ", " + m10687getGreenimpl(j7) + ", " + m10685getBlueimpl(j7) + ", " + m10684getAlphaimpl(j7) + ", " + m10686getColorSpaceimpl(j7).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m10682equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m10689hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m10690toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10692unboximpl() {
        return this.value;
    }
}
