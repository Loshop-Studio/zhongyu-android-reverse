package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.ColorKt;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aµ\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aµ\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a)\u0010.\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\b*\u00020\u00042\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0001¢\u0006\u0002\u00108\u001a\u001f\u00109\u001a\u00020\b*\u00020\u00042\u0006\u0010/\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\b*\u000207H\u0001ø\u0001\u0001¢\u0006\u0002\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m5175d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "contentColorFor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", C3380c.f1962O, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "lightColorScheme-G1PFc-w", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "value", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "updateColorSchemeFrom", "", "other", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m7919lightColorSchemeG1PFcw$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 536870911, null);
        }
    });

    @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-Hht5A8o, reason: not valid java name */
    public static final long m7913applyTonalElevationHht5A8o(ColorScheme applyTonalElevation, long j4, float f4) {
        Intrinsics.checkNotNullParameter(applyTonalElevation, "$this$applyTonalElevation");
        return Color.m9179equalsimpl0(j4, applyTonalElevation.m7879getSurface0d7_KjU()) ? m7920surfaceColorAtElevation3ABfNKs(applyTonalElevation, f4) : j4;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m7914contentColorFor4WTKRHQ(ColorScheme contentColorFor, long j4) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return Color.m9179equalsimpl0(j4, contentColorFor.m7874getPrimary0d7_KjU()) ? contentColorFor.m7864getOnPrimary0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7877getSecondary0d7_KjU()) ? contentColorFor.m7866getOnSecondary0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7882getTertiary0d7_KjU()) ? contentColorFor.m7870getOnTertiary0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7855getBackground0d7_KjU()) ? contentColorFor.m7861getOnBackground0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7856getError0d7_KjU()) ? contentColorFor.m7862getOnError0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7879getSurface0d7_KjU()) ? contentColorFor.m7868getOnSurface0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7881getSurfaceVariant0d7_KjU()) ? contentColorFor.m7869getOnSurfaceVariant0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7875getPrimaryContainer0d7_KjU()) ? contentColorFor.m7865getOnPrimaryContainer0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7878getSecondaryContainer0d7_KjU()) ? contentColorFor.m7867getOnSecondaryContainer0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7883getTertiaryContainer0d7_KjU()) ? contentColorFor.m7871getOnTertiaryContainer0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7857getErrorContainer0d7_KjU()) ? contentColorFor.m7863getOnErrorContainer0d7_KjU() : Color.m9179equalsimpl0(j4, contentColorFor.m7860getInverseSurface0d7_KjU()) ? contentColorFor.m7858getInverseOnSurface0d7_KjU() : Color.INSTANCE.m9214getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m7915contentColorForek8zF_U(long j4, Composer composer, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i4, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long jM7914contentColorFor4WTKRHQ = m7914contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j4);
        if (!(jM7914contentColorFor4WTKRHQ != Color.INSTANCE.m9214getUnspecified0d7_KjU())) {
            jM7914contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m9188unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM7914contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m7916darkColorSchemeG1PFcw(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        return new ColorScheme(j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m7917darkColorSchemeG1PFcw$default(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i4, Object obj) {
        long jM8353getPrimary0d7_KjU = (i4 & 1) != 0 ? ColorDarkTokens.INSTANCE.m8353getPrimary0d7_KjU() : j4;
        return m7916darkColorSchemeG1PFcw(jM8353getPrimary0d7_KjU, (i4 & 2) != 0 ? ColorDarkTokens.INSTANCE.m8343getOnPrimary0d7_KjU() : j5, (i4 & 4) != 0 ? ColorDarkTokens.INSTANCE.m8354getPrimaryContainer0d7_KjU() : j6, (i4 & 8) != 0 ? ColorDarkTokens.INSTANCE.m8344getOnPrimaryContainer0d7_KjU() : j7, (i4 & 16) != 0 ? ColorDarkTokens.INSTANCE.m8338getInversePrimary0d7_KjU() : j8, (i4 & 32) != 0 ? ColorDarkTokens.INSTANCE.m8356getSecondary0d7_KjU() : j9, (i4 & 64) != 0 ? ColorDarkTokens.INSTANCE.m8345getOnSecondary0d7_KjU() : j10, (i4 & 128) != 0 ? ColorDarkTokens.INSTANCE.m8357getSecondaryContainer0d7_KjU() : j11, (i4 & 256) != 0 ? ColorDarkTokens.INSTANCE.m8346getOnSecondaryContainer0d7_KjU() : j12, (i4 & 512) != 0 ? ColorDarkTokens.INSTANCE.m8361getTertiary0d7_KjU() : j13, (i4 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m8349getOnTertiary0d7_KjU() : j14, (i4 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m8362getTertiaryContainer0d7_KjU() : j15, (i4 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m8350getOnTertiaryContainer0d7_KjU() : j16, (i4 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m8334getBackground0d7_KjU() : j17, (i4 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m8340getOnBackground0d7_KjU() : j18, (i4 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m8358getSurface0d7_KjU() : j19, (i4 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m8347getOnSurface0d7_KjU() : j20, (i4 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m8360getSurfaceVariant0d7_KjU() : j21, (i4 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m8348getOnSurfaceVariant0d7_KjU() : j22, (i4 & 524288) != 0 ? jM8353getPrimary0d7_KjU : j23, (i4 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m8339getInverseSurface0d7_KjU() : j24, (i4 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m8337getInverseOnSurface0d7_KjU() : j25, (i4 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m8335getError0d7_KjU() : j26, (i4 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m8341getOnError0d7_KjU() : j27, (i4 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m8336getErrorContainer0d7_KjU() : j28, (i4 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m8342getOnErrorContainer0d7_KjU() : j29, (i4 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m8351getOutline0d7_KjU() : j30, (i4 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m8352getOutlineVariant0d7_KjU() : j31, (i4 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m8355getScrim0d7_KjU() : j32);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens value) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m7855getBackground0d7_KjU();
            case 2:
                return colorScheme.m7856getError0d7_KjU();
            case 3:
                return colorScheme.m7857getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m7858getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m7859getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m7860getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m7861getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m7862getOnError0d7_KjU();
            case 9:
                return colorScheme.m7863getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m7864getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m7865getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m7866getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m7867getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m7868getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m7869getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m7880getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m7870getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m7871getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m7872getOutline0d7_KjU();
            case 20:
                return colorScheme.m7873getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m7874getPrimary0d7_KjU();
            case 22:
                return colorScheme.m7875getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m7876getScrim0d7_KjU();
            case 24:
                return colorScheme.m7877getSecondary0d7_KjU();
            case 25:
                return colorScheme.m7878getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m7879getSurface0d7_KjU();
            case 27:
                return colorScheme.m7881getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m7882getTertiary0d7_KjU();
            case 29:
                return colorScheme.m7883getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final ColorScheme m7918lightColorSchemeG1PFcw(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32) {
        return new ColorScheme(j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m7919lightColorSchemeG1PFcw$default(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, int i4, Object obj) {
        long jM8382getPrimary0d7_KjU = (i4 & 1) != 0 ? ColorLightTokens.INSTANCE.m8382getPrimary0d7_KjU() : j4;
        return m7918lightColorSchemeG1PFcw(jM8382getPrimary0d7_KjU, (i4 & 2) != 0 ? ColorLightTokens.INSTANCE.m8372getOnPrimary0d7_KjU() : j5, (i4 & 4) != 0 ? ColorLightTokens.INSTANCE.m8383getPrimaryContainer0d7_KjU() : j6, (i4 & 8) != 0 ? ColorLightTokens.INSTANCE.m8373getOnPrimaryContainer0d7_KjU() : j7, (i4 & 16) != 0 ? ColorLightTokens.INSTANCE.m8367getInversePrimary0d7_KjU() : j8, (i4 & 32) != 0 ? ColorLightTokens.INSTANCE.m8385getSecondary0d7_KjU() : j9, (i4 & 64) != 0 ? ColorLightTokens.INSTANCE.m8374getOnSecondary0d7_KjU() : j10, (i4 & 128) != 0 ? ColorLightTokens.INSTANCE.m8386getSecondaryContainer0d7_KjU() : j11, (i4 & 256) != 0 ? ColorLightTokens.INSTANCE.m8375getOnSecondaryContainer0d7_KjU() : j12, (i4 & 512) != 0 ? ColorLightTokens.INSTANCE.m8390getTertiary0d7_KjU() : j13, (i4 & 1024) != 0 ? ColorLightTokens.INSTANCE.m8378getOnTertiary0d7_KjU() : j14, (i4 & 2048) != 0 ? ColorLightTokens.INSTANCE.m8391getTertiaryContainer0d7_KjU() : j15, (i4 & 4096) != 0 ? ColorLightTokens.INSTANCE.m8379getOnTertiaryContainer0d7_KjU() : j16, (i4 & 8192) != 0 ? ColorLightTokens.INSTANCE.m8363getBackground0d7_KjU() : j17, (i4 & 16384) != 0 ? ColorLightTokens.INSTANCE.m8369getOnBackground0d7_KjU() : j18, (i4 & 32768) != 0 ? ColorLightTokens.INSTANCE.m8387getSurface0d7_KjU() : j19, (i4 & 65536) != 0 ? ColorLightTokens.INSTANCE.m8376getOnSurface0d7_KjU() : j20, (i4 & 131072) != 0 ? ColorLightTokens.INSTANCE.m8389getSurfaceVariant0d7_KjU() : j21, (i4 & 262144) != 0 ? ColorLightTokens.INSTANCE.m8377getOnSurfaceVariant0d7_KjU() : j22, (i4 & 524288) != 0 ? jM8382getPrimary0d7_KjU : j23, (i4 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m8368getInverseSurface0d7_KjU() : j24, (i4 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m8366getInverseOnSurface0d7_KjU() : j25, (i4 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m8364getError0d7_KjU() : j26, (i4 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m8370getOnError0d7_KjU() : j27, (i4 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m8365getErrorContainer0d7_KjU() : j28, (i4 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m8371getOnErrorContainer0d7_KjU() : j29, (i4 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m8380getOutline0d7_KjU() : j30, (i4 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m8381getOutlineVariant0d7_KjU() : j31, (i4 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m8384getScrim0d7_KjU() : j32);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m7920surfaceColorAtElevation3ABfNKs(ColorScheme surfaceColorAtElevation, float f4) {
        Intrinsics.checkNotNullParameter(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (C1700Dp.m11530equalsimpl0(f4, C1700Dp.m11525constructorimpl(0))) {
            return surfaceColorAtElevation.m7879getSurface0d7_KjU();
        }
        return ColorKt.m9223compositeOverOWjLjI(Color.m9177copywmQWz5c$default(surfaceColorAtElevation.m7880getSurfaceTint0d7_KjU(), ((((float) Math.log(f4 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m7879getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i4, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme other) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colorScheme.m7903setPrimary8_81llA$material3_release(other.m7874getPrimary0d7_KjU());
        colorScheme.m7893setOnPrimary8_81llA$material3_release(other.m7864getOnPrimary0d7_KjU());
        colorScheme.m7904setPrimaryContainer8_81llA$material3_release(other.m7875getPrimaryContainer0d7_KjU());
        colorScheme.m7894setOnPrimaryContainer8_81llA$material3_release(other.m7865getOnPrimaryContainer0d7_KjU());
        colorScheme.m7888setInversePrimary8_81llA$material3_release(other.m7859getInversePrimary0d7_KjU());
        colorScheme.m7906setSecondary8_81llA$material3_release(other.m7877getSecondary0d7_KjU());
        colorScheme.m7895setOnSecondary8_81llA$material3_release(other.m7866getOnSecondary0d7_KjU());
        colorScheme.m7907setSecondaryContainer8_81llA$material3_release(other.m7878getSecondaryContainer0d7_KjU());
        colorScheme.m7896setOnSecondaryContainer8_81llA$material3_release(other.m7867getOnSecondaryContainer0d7_KjU());
        colorScheme.m7911setTertiary8_81llA$material3_release(other.m7882getTertiary0d7_KjU());
        colorScheme.m7899setOnTertiary8_81llA$material3_release(other.m7870getOnTertiary0d7_KjU());
        colorScheme.m7912setTertiaryContainer8_81llA$material3_release(other.m7883getTertiaryContainer0d7_KjU());
        colorScheme.m7900setOnTertiaryContainer8_81llA$material3_release(other.m7871getOnTertiaryContainer0d7_KjU());
        colorScheme.m7884setBackground8_81llA$material3_release(other.m7855getBackground0d7_KjU());
        colorScheme.m7890setOnBackground8_81llA$material3_release(other.m7861getOnBackground0d7_KjU());
        colorScheme.m7908setSurface8_81llA$material3_release(other.m7879getSurface0d7_KjU());
        colorScheme.m7897setOnSurface8_81llA$material3_release(other.m7868getOnSurface0d7_KjU());
        colorScheme.m7910setSurfaceVariant8_81llA$material3_release(other.m7881getSurfaceVariant0d7_KjU());
        colorScheme.m7898setOnSurfaceVariant8_81llA$material3_release(other.m7869getOnSurfaceVariant0d7_KjU());
        colorScheme.m7909setSurfaceTint8_81llA$material3_release(other.m7880getSurfaceTint0d7_KjU());
        colorScheme.m7889setInverseSurface8_81llA$material3_release(other.m7860getInverseSurface0d7_KjU());
        colorScheme.m7887setInverseOnSurface8_81llA$material3_release(other.m7858getInverseOnSurface0d7_KjU());
        colorScheme.m7885setError8_81llA$material3_release(other.m7856getError0d7_KjU());
        colorScheme.m7891setOnError8_81llA$material3_release(other.m7862getOnError0d7_KjU());
        colorScheme.m7886setErrorContainer8_81llA$material3_release(other.m7857getErrorContainer0d7_KjU());
        colorScheme.m7892setOnErrorContainer8_81llA$material3_release(other.m7863getOnErrorContainer0d7_KjU());
        colorScheme.m7901setOutline8_81llA$material3_release(other.m7872getOutline0d7_KjU());
        colorScheme.m7902setOutlineVariant8_81llA$material3_release(other.m7873getOutlineVariant0d7_KjU());
        colorScheme.m7905setScrim8_81llA$material3_release(other.m7876getScrim0d7_KjU());
    }
}
