package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC10559a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // p300x7.InterfaceC10559a
        public final ColorScheme invoke() {
            return ColorSchemeKt.m21916lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC10559a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // p300x7.InterfaceC10559a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m21908applyTonalElevationRFCenO8(ColorScheme colorScheme, long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m24277equalsimpl0(j10, colorScheme.m21896getSurface0d7_KjU()) && zBooleanValue) {
            j10 = m21919surfaceColorAtElevation3ABfNKs(colorScheme, f10);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j10;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m21909contentColorFor4WTKRHQ(ColorScheme colorScheme, long j10) {
        return Color.m24277equalsimpl0(j10, colorScheme.m21891getPrimary0d7_KjU()) ? colorScheme.m21881getOnPrimary0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21894getSecondary0d7_KjU()) ? colorScheme.m21883getOnSecondary0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21906getTertiary0d7_KjU()) ? colorScheme.m21887getOnTertiary0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21872getBackground0d7_KjU()) ? colorScheme.m21878getOnBackground0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21873getError0d7_KjU()) ? colorScheme.m21879getOnError0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21892getPrimaryContainer0d7_KjU()) ? colorScheme.m21882getOnPrimaryContainer0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21895getSecondaryContainer0d7_KjU()) ? colorScheme.m21884getOnSecondaryContainer0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21907getTertiaryContainer0d7_KjU()) ? colorScheme.m21888getOnTertiaryContainer0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21874getErrorContainer0d7_KjU()) ? colorScheme.m21880getOnErrorContainer0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21877getInverseSurface0d7_KjU()) ? colorScheme.m21875getInverseOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21896getSurface0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21905getSurfaceVariant0d7_KjU()) ? colorScheme.m21886getOnSurfaceVariant0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21897getSurfaceBright0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21898getSurfaceContainer0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21899getSurfaceContainerHigh0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21900getSurfaceContainerHighest0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21901getSurfaceContainerLow0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.m24277equalsimpl0(j10, colorScheme.m21902getSurfaceContainerLowest0d7_KjU()) ? colorScheme.m21885getOnSurface0d7_KjU() : Color.Companion.m24312getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m21910contentColorForek8zF_U(long j10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM21909contentColorFor4WTKRHQ = m21909contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10);
        if (jM21909contentColorFor4WTKRHQ == 16) {
            jM21909contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m24286unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21909contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m21911darkColorSchemeCXl9yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21912darkColorSchemeCXl9yA$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jM23075getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m23075getPrimary0d7_KjU() : j10;
        long jM23059getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m23059getOnPrimary0d7_KjU() : j11;
        long jM23076getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m23076getPrimaryContainer0d7_KjU() : j12;
        long jM23060getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorDarkTokens.INSTANCE.m23060getOnPrimaryContainer0d7_KjU() : j13;
        long jM23054getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorDarkTokens.INSTANCE.m23054getInversePrimary0d7_KjU() : j14;
        long jM23080getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorDarkTokens.INSTANCE.m23080getSecondary0d7_KjU() : j15;
        long jM23063getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorDarkTokens.INSTANCE.m23063getOnSecondary0d7_KjU() : j16;
        long jM23081getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorDarkTokens.INSTANCE.m23081getSecondaryContainer0d7_KjU() : j17;
        long j46 = jM23075getPrimary0d7_KjU;
        long jM23064getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorDarkTokens.INSTANCE.m23064getOnSecondaryContainer0d7_KjU() : j18;
        long jM23094getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorDarkTokens.INSTANCE.m23094getTertiary0d7_KjU() : j19;
        long jM23069getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m23069getOnTertiary0d7_KjU() : j20;
        long jM23095getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m23095getTertiaryContainer0d7_KjU() : j21;
        long jM23070getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m23070getOnTertiaryContainer0d7_KjU() : j22;
        long jM23050getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m23050getBackground0d7_KjU() : j23;
        long jM23056getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m23056getOnBackground0d7_KjU() : j24;
        long jM23084getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m23084getSurface0d7_KjU() : j25;
        long jM23067getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m23067getOnSurface0d7_KjU() : j26;
        long jM23093getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m23093getSurfaceVariant0d7_KjU() : j27;
        long jM23068getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m23068getOnSurfaceVariant0d7_KjU() : j28;
        long j47 = (i10 & 524288) != 0 ? j46 : j29;
        long jM23055getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m23055getInverseSurface0d7_KjU() : j30;
        long jM23053getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m23053getInverseOnSurface0d7_KjU() : j31;
        long jM23051getError0d7_KjU = (i10 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m23051getError0d7_KjU() : j32;
        long jM23057getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m23057getOnError0d7_KjU() : j33;
        long jM23052getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m23052getErrorContainer0d7_KjU() : j34;
        long jM23058getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m23058getOnErrorContainer0d7_KjU() : j35;
        long jM23073getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m23073getOutline0d7_KjU() : j36;
        long jM23074getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m23074getOutlineVariant0d7_KjU() : j37;
        long jM23079getScrim0d7_KjU = (i10 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m23079getScrim0d7_KjU() : j38;
        long jM23085getSurfaceBright0d7_KjU = (i10 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m23085getSurfaceBright0d7_KjU() : j39;
        long jM23086getSurfaceContainer0d7_KjU = (i10 & BasicMeasure.EXACTLY) != 0 ? ColorDarkTokens.INSTANCE.m23086getSurfaceContainer0d7_KjU() : j40;
        long jM23087getSurfaceContainerHigh0d7_KjU = (i10 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m23087getSurfaceContainerHigh0d7_KjU() : j41;
        long jM23088getSurfaceContainerHighest0d7_KjU = (i11 & 1) != 0 ? ColorDarkTokens.INSTANCE.m23088getSurfaceContainerHighest0d7_KjU() : j42;
        long jM23089getSurfaceContainerLow0d7_KjU = (i11 & 2) != 0 ? ColorDarkTokens.INSTANCE.m23089getSurfaceContainerLow0d7_KjU() : j43;
        long jM23090getSurfaceContainerLowest0d7_KjU = (i11 & 4) != 0 ? ColorDarkTokens.INSTANCE.m23090getSurfaceContainerLowest0d7_KjU() : j44;
        if ((i11 & 8) != 0) {
            j45 = ColorDarkTokens.INSTANCE.m23091getSurfaceDim0d7_KjU();
        }
        return m21911darkColorSchemeCXl9yA(j46, jM23059getOnPrimary0d7_KjU, jM23076getPrimaryContainer0d7_KjU, jM23060getOnPrimaryContainer0d7_KjU, jM23054getInversePrimary0d7_KjU, jM23080getSecondary0d7_KjU, jM23063getOnSecondary0d7_KjU, jM23081getSecondaryContainer0d7_KjU, jM23064getOnSecondaryContainer0d7_KjU, jM23094getTertiary0d7_KjU, jM23069getOnTertiary0d7_KjU, jM23095getTertiaryContainer0d7_KjU, jM23070getOnTertiaryContainer0d7_KjU, jM23050getBackground0d7_KjU, jM23056getOnBackground0d7_KjU, jM23084getSurface0d7_KjU, jM23067getOnSurface0d7_KjU, jM23093getSurfaceVariant0d7_KjU, jM23068getOnSurfaceVariant0d7_KjU, j47, jM23055getInverseSurface0d7_KjU, jM23053getInverseOnSurface0d7_KjU, jM23051getError0d7_KjU, jM23057getOnError0d7_KjU, jM23052getErrorContainer0d7_KjU, jM23058getOnErrorContainer0d7_KjU, jM23073getOutline0d7_KjU, jM23074getOutlineVariant0d7_KjU, jM23079getScrim0d7_KjU, jM23085getSurfaceBright0d7_KjU, jM23086getSurfaceContainer0d7_KjU, jM23087getSurfaceContainerHigh0d7_KjU, jM23088getSurfaceContainerHighest0d7_KjU, jM23089getSurfaceContainerLow0d7_KjU, jM23090getSurfaceContainerLowest0d7_KjU, j45);
    }

    @InterfaceC8721a
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m21913darkColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m21912darkColorSchemeCXl9yA$default(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21914darkColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM23075getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m23075getPrimary0d7_KjU() : j10;
        long jM23059getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m23059getOnPrimary0d7_KjU() : j11;
        long jM23076getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m23076getPrimaryContainer0d7_KjU() : j12;
        long jM23060getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorDarkTokens.INSTANCE.m23060getOnPrimaryContainer0d7_KjU() : j13;
        long jM23054getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorDarkTokens.INSTANCE.m23054getInversePrimary0d7_KjU() : j14;
        long jM23080getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorDarkTokens.INSTANCE.m23080getSecondary0d7_KjU() : j15;
        long jM23063getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorDarkTokens.INSTANCE.m23063getOnSecondary0d7_KjU() : j16;
        long jM23081getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorDarkTokens.INSTANCE.m23081getSecondaryContainer0d7_KjU() : j17;
        long j39 = jM23075getPrimary0d7_KjU;
        long jM23064getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorDarkTokens.INSTANCE.m23064getOnSecondaryContainer0d7_KjU() : j18;
        long jM23094getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorDarkTokens.INSTANCE.m23094getTertiary0d7_KjU() : j19;
        long jM23069getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m23069getOnTertiary0d7_KjU() : j20;
        long jM23095getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m23095getTertiaryContainer0d7_KjU() : j21;
        long jM23070getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m23070getOnTertiaryContainer0d7_KjU() : j22;
        long jM23050getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m23050getBackground0d7_KjU() : j23;
        long jM23056getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m23056getOnBackground0d7_KjU() : j24;
        long jM23084getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m23084getSurface0d7_KjU() : j25;
        long jM23067getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m23067getOnSurface0d7_KjU() : j26;
        long jM23093getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m23093getSurfaceVariant0d7_KjU() : j27;
        long jM23068getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m23068getOnSurfaceVariant0d7_KjU() : j28;
        long j40 = (i10 & 524288) != 0 ? j39 : j29;
        long jM23055getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m23055getInverseSurface0d7_KjU() : j30;
        long jM23053getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m23053getInverseOnSurface0d7_KjU() : j31;
        long jM23051getError0d7_KjU = (i10 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m23051getError0d7_KjU() : j32;
        long jM23057getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m23057getOnError0d7_KjU() : j33;
        long jM23052getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m23052getErrorContainer0d7_KjU() : j34;
        long jM23058getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m23058getOnErrorContainer0d7_KjU() : j35;
        long jM23073getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m23073getOutline0d7_KjU() : j36;
        long jM23074getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m23074getOutlineVariant0d7_KjU() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = ColorDarkTokens.INSTANCE.m23079getScrim0d7_KjU();
        }
        return m21913darkColorSchemeG1PFcw(j39, jM23059getOnPrimary0d7_KjU, jM23076getPrimaryContainer0d7_KjU, jM23060getOnPrimaryContainer0d7_KjU, jM23054getInversePrimary0d7_KjU, jM23080getSecondary0d7_KjU, jM23063getOnSecondary0d7_KjU, jM23081getSecondaryContainer0d7_KjU, jM23064getOnSecondaryContainer0d7_KjU, jM23094getTertiary0d7_KjU, jM23069getOnTertiary0d7_KjU, jM23095getTertiaryContainer0d7_KjU, jM23070getOnTertiaryContainer0d7_KjU, jM23050getBackground0d7_KjU, jM23056getOnBackground0d7_KjU, jM23084getSurface0d7_KjU, jM23067getOnSurface0d7_KjU, jM23093getSurfaceVariant0d7_KjU, jM23068getOnSurfaceVariant0d7_KjU, j40, jM23055getInverseSurface0d7_KjU, jM23053getInverseOnSurface0d7_KjU, jM23051getError0d7_KjU, jM23057getOnError0d7_KjU, jM23052getErrorContainer0d7_KjU, jM23058getOnErrorContainer0d7_KjU, jM23073getOutline0d7_KjU, jM23074getOutlineVariant0d7_KjU, j38);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m21916lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m23434getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m23447getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m23447getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    @Stable
    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m21872getBackground0d7_KjU();
            case 2:
                return colorScheme.m21873getError0d7_KjU();
            case 3:
                return colorScheme.m21874getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m21875getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m21876getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m21877getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m21878getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m21879getOnError0d7_KjU();
            case 9:
                return colorScheme.m21880getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m21881getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m21882getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m21883getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m21884getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m21885getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m21886getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m21904getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m21887getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m21888getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m21889getOutline0d7_KjU();
            case 20:
                return colorScheme.m21890getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m21891getPrimary0d7_KjU();
            case 22:
                return colorScheme.m21892getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m21893getScrim0d7_KjU();
            case 24:
                return colorScheme.m21894getSecondary0d7_KjU();
            case 25:
                return colorScheme.m21895getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m21896getSurface0d7_KjU();
            case 27:
                return colorScheme.m21905getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m21897getSurfaceBright0d7_KjU();
            case 29:
                return colorScheme.m21898getSurfaceContainer0d7_KjU();
            case 30:
                return colorScheme.m21899getSurfaceContainerHigh0d7_KjU();
            case 31:
                return colorScheme.m21900getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m21901getSurfaceContainerLow0d7_KjU();
            case 33:
                return colorScheme.m21902getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m21903getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m21906getTertiary0d7_KjU();
            case 36:
                return colorScheme.m21907getTertiaryContainer0d7_KjU();
            default:
                return Color.Companion.m24312getUnspecified0d7_KjU();
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    @Composable
    @ReadOnlyComposable
    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m21915lightColorSchemeCXl9yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21916lightColorSchemeCXl9yA$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jM23123getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m23123getPrimary0d7_KjU() : j10;
        long jM23107getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m23107getOnPrimary0d7_KjU() : j11;
        long jM23124getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m23124getPrimaryContainer0d7_KjU() : j12;
        long jM23108getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorLightTokens.INSTANCE.m23108getOnPrimaryContainer0d7_KjU() : j13;
        long jM23102getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorLightTokens.INSTANCE.m23102getInversePrimary0d7_KjU() : j14;
        long jM23128getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorLightTokens.INSTANCE.m23128getSecondary0d7_KjU() : j15;
        long jM23111getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorLightTokens.INSTANCE.m23111getOnSecondary0d7_KjU() : j16;
        long jM23129getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorLightTokens.INSTANCE.m23129getSecondaryContainer0d7_KjU() : j17;
        long j46 = jM23123getPrimary0d7_KjU;
        long jM23112getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorLightTokens.INSTANCE.m23112getOnSecondaryContainer0d7_KjU() : j18;
        long jM23142getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorLightTokens.INSTANCE.m23142getTertiary0d7_KjU() : j19;
        long jM23117getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorLightTokens.INSTANCE.m23117getOnTertiary0d7_KjU() : j20;
        long jM23143getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorLightTokens.INSTANCE.m23143getTertiaryContainer0d7_KjU() : j21;
        long jM23118getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorLightTokens.INSTANCE.m23118getOnTertiaryContainer0d7_KjU() : j22;
        long jM23098getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorLightTokens.INSTANCE.m23098getBackground0d7_KjU() : j23;
        long jM23104getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorLightTokens.INSTANCE.m23104getOnBackground0d7_KjU() : j24;
        long jM23132getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorLightTokens.INSTANCE.m23132getSurface0d7_KjU() : j25;
        long jM23115getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorLightTokens.INSTANCE.m23115getOnSurface0d7_KjU() : j26;
        long jM23141getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorLightTokens.INSTANCE.m23141getSurfaceVariant0d7_KjU() : j27;
        long jM23116getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorLightTokens.INSTANCE.m23116getOnSurfaceVariant0d7_KjU() : j28;
        long j47 = (i10 & 524288) != 0 ? j46 : j29;
        long jM23103getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m23103getInverseSurface0d7_KjU() : j30;
        long jM23101getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m23101getInverseOnSurface0d7_KjU() : j31;
        long jM23099getError0d7_KjU = (i10 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m23099getError0d7_KjU() : j32;
        long jM23105getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m23105getOnError0d7_KjU() : j33;
        long jM23100getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m23100getErrorContainer0d7_KjU() : j34;
        long jM23106getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m23106getOnErrorContainer0d7_KjU() : j35;
        long jM23121getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m23121getOutline0d7_KjU() : j36;
        long jM23122getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m23122getOutlineVariant0d7_KjU() : j37;
        long jM23127getScrim0d7_KjU = (i10 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m23127getScrim0d7_KjU() : j38;
        long jM23133getSurfaceBright0d7_KjU = (i10 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m23133getSurfaceBright0d7_KjU() : j39;
        long jM23134getSurfaceContainer0d7_KjU = (i10 & BasicMeasure.EXACTLY) != 0 ? ColorLightTokens.INSTANCE.m23134getSurfaceContainer0d7_KjU() : j40;
        long jM23135getSurfaceContainerHigh0d7_KjU = (i10 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m23135getSurfaceContainerHigh0d7_KjU() : j41;
        long jM23136getSurfaceContainerHighest0d7_KjU = (i11 & 1) != 0 ? ColorLightTokens.INSTANCE.m23136getSurfaceContainerHighest0d7_KjU() : j42;
        long jM23137getSurfaceContainerLow0d7_KjU = (i11 & 2) != 0 ? ColorLightTokens.INSTANCE.m23137getSurfaceContainerLow0d7_KjU() : j43;
        long jM23138getSurfaceContainerLowest0d7_KjU = (i11 & 4) != 0 ? ColorLightTokens.INSTANCE.m23138getSurfaceContainerLowest0d7_KjU() : j44;
        if ((i11 & 8) != 0) {
            j45 = ColorLightTokens.INSTANCE.m23139getSurfaceDim0d7_KjU();
        }
        return m21915lightColorSchemeCXl9yA(j46, jM23107getOnPrimary0d7_KjU, jM23124getPrimaryContainer0d7_KjU, jM23108getOnPrimaryContainer0d7_KjU, jM23102getInversePrimary0d7_KjU, jM23128getSecondary0d7_KjU, jM23111getOnSecondary0d7_KjU, jM23129getSecondaryContainer0d7_KjU, jM23112getOnSecondaryContainer0d7_KjU, jM23142getTertiary0d7_KjU, jM23117getOnTertiary0d7_KjU, jM23143getTertiaryContainer0d7_KjU, jM23118getOnTertiaryContainer0d7_KjU, jM23098getBackground0d7_KjU, jM23104getOnBackground0d7_KjU, jM23132getSurface0d7_KjU, jM23115getOnSurface0d7_KjU, jM23141getSurfaceVariant0d7_KjU, jM23116getOnSurfaceVariant0d7_KjU, j47, jM23103getInverseSurface0d7_KjU, jM23101getInverseOnSurface0d7_KjU, jM23099getError0d7_KjU, jM23105getOnError0d7_KjU, jM23100getErrorContainer0d7_KjU, jM23106getOnErrorContainer0d7_KjU, jM23121getOutline0d7_KjU, jM23122getOutlineVariant0d7_KjU, jM23127getScrim0d7_KjU, jM23133getSurfaceBright0d7_KjU, jM23134getSurfaceContainer0d7_KjU, jM23135getSurfaceContainerHigh0d7_KjU, jM23136getSurfaceContainerHighest0d7_KjU, jM23137getSurfaceContainerLow0d7_KjU, jM23138getSurfaceContainerLowest0d7_KjU, j45);
    }

    @InterfaceC8721a
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m21917lightColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m21916lightColorSchemeCXl9yA$default(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m21918lightColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM23123getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m23123getPrimary0d7_KjU() : j10;
        long jM23107getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m23107getOnPrimary0d7_KjU() : j11;
        long jM23124getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m23124getPrimaryContainer0d7_KjU() : j12;
        long jM23108getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorLightTokens.INSTANCE.m23108getOnPrimaryContainer0d7_KjU() : j13;
        long jM23102getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorLightTokens.INSTANCE.m23102getInversePrimary0d7_KjU() : j14;
        long jM23128getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorLightTokens.INSTANCE.m23128getSecondary0d7_KjU() : j15;
        long jM23111getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorLightTokens.INSTANCE.m23111getOnSecondary0d7_KjU() : j16;
        long jM23129getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorLightTokens.INSTANCE.m23129getSecondaryContainer0d7_KjU() : j17;
        long j39 = jM23123getPrimary0d7_KjU;
        long jM23112getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorLightTokens.INSTANCE.m23112getOnSecondaryContainer0d7_KjU() : j18;
        long jM23142getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorLightTokens.INSTANCE.m23142getTertiary0d7_KjU() : j19;
        long jM23117getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorLightTokens.INSTANCE.m23117getOnTertiary0d7_KjU() : j20;
        long jM23143getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorLightTokens.INSTANCE.m23143getTertiaryContainer0d7_KjU() : j21;
        long jM23118getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorLightTokens.INSTANCE.m23118getOnTertiaryContainer0d7_KjU() : j22;
        long jM23098getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorLightTokens.INSTANCE.m23098getBackground0d7_KjU() : j23;
        long jM23104getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorLightTokens.INSTANCE.m23104getOnBackground0d7_KjU() : j24;
        long jM23132getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorLightTokens.INSTANCE.m23132getSurface0d7_KjU() : j25;
        long jM23115getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorLightTokens.INSTANCE.m23115getOnSurface0d7_KjU() : j26;
        long jM23141getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorLightTokens.INSTANCE.m23141getSurfaceVariant0d7_KjU() : j27;
        long jM23116getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorLightTokens.INSTANCE.m23116getOnSurfaceVariant0d7_KjU() : j28;
        long j40 = (i10 & 524288) != 0 ? j39 : j29;
        long jM23103getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m23103getInverseSurface0d7_KjU() : j30;
        long jM23101getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m23101getInverseOnSurface0d7_KjU() : j31;
        long jM23099getError0d7_KjU = (i10 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m23099getError0d7_KjU() : j32;
        long jM23105getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m23105getOnError0d7_KjU() : j33;
        long jM23100getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m23100getErrorContainer0d7_KjU() : j34;
        long jM23106getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m23106getOnErrorContainer0d7_KjU() : j35;
        long jM23121getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m23121getOutline0d7_KjU() : j36;
        long jM23122getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m23122getOutlineVariant0d7_KjU() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = ColorLightTokens.INSTANCE.m23127getScrim0d7_KjU();
        }
        return m21917lightColorSchemeG1PFcw(j39, jM23107getOnPrimary0d7_KjU, jM23124getPrimaryContainer0d7_KjU, jM23108getOnPrimaryContainer0d7_KjU, jM23102getInversePrimary0d7_KjU, jM23128getSecondary0d7_KjU, jM23111getOnSecondary0d7_KjU, jM23129getSecondaryContainer0d7_KjU, jM23112getOnSecondaryContainer0d7_KjU, jM23142getTertiary0d7_KjU, jM23117getOnTertiary0d7_KjU, jM23143getTertiaryContainer0d7_KjU, jM23118getOnTertiaryContainer0d7_KjU, jM23098getBackground0d7_KjU, jM23104getOnBackground0d7_KjU, jM23132getSurface0d7_KjU, jM23115getOnSurface0d7_KjU, jM23141getSurfaceVariant0d7_KjU, jM23116getOnSurfaceVariant0d7_KjU, j40, jM23103getInverseSurface0d7_KjU, jM23101getInverseOnSurface0d7_KjU, jM23099getError0d7_KjU, jM23105getOnError0d7_KjU, jM23100getErrorContainer0d7_KjU, jM23106getOnErrorContainer0d7_KjU, jM23121getOutline0d7_KjU, jM23122getOutlineVariant0d7_KjU, j38);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m21919surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f10) {
        if (C3156Dp.m26904equalsimpl0(f10, C3156Dp.m26899constructorimpl(0))) {
            return colorScheme.m21896getSurface0d7_KjU();
        }
        return ColorKt.m24321compositeOverOWjLjI(Color.m24275copywmQWz5c$default(colorScheme.m21904getSurfaceTint0d7_KjU(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m21896getSurface0d7_KjU());
    }
}
