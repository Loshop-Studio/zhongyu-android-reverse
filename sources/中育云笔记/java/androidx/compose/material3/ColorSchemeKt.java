package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // p181hd.InterfaceC9529a
        public final ColorScheme invoke() {
            return ColorSchemeKt.m28518lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // p181hd.InterfaceC9529a
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
    public static final long m28510applyTonalElevationRFCenO8(ColorScheme colorScheme, long j10, float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m30879equalsimpl0(j10, colorScheme.m28498getSurface0d7_KjU()) && zBooleanValue) {
            j10 = m28521surfaceColorAtElevation3ABfNKs(colorScheme, f10);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j10;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m28511contentColorFor4WTKRHQ(ColorScheme colorScheme, long j10) {
        return Color.m30879equalsimpl0(j10, colorScheme.m28493getPrimary0d7_KjU()) ? colorScheme.m28483getOnPrimary0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28496getSecondary0d7_KjU()) ? colorScheme.m28485getOnSecondary0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28508getTertiary0d7_KjU()) ? colorScheme.m28489getOnTertiary0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28474getBackground0d7_KjU()) ? colorScheme.m28480getOnBackground0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28475getError0d7_KjU()) ? colorScheme.m28481getOnError0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28494getPrimaryContainer0d7_KjU()) ? colorScheme.m28484getOnPrimaryContainer0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28497getSecondaryContainer0d7_KjU()) ? colorScheme.m28486getOnSecondaryContainer0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28509getTertiaryContainer0d7_KjU()) ? colorScheme.m28490getOnTertiaryContainer0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28476getErrorContainer0d7_KjU()) ? colorScheme.m28482getOnErrorContainer0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28479getInverseSurface0d7_KjU()) ? colorScheme.m28477getInverseOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28498getSurface0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28507getSurfaceVariant0d7_KjU()) ? colorScheme.m28488getOnSurfaceVariant0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28499getSurfaceBright0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28500getSurfaceContainer0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28501getSurfaceContainerHigh0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28502getSurfaceContainerHighest0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28503getSurfaceContainerLow0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.m30879equalsimpl0(j10, colorScheme.m28504getSurfaceContainerLowest0d7_KjU()) ? colorScheme.m28487getOnSurface0d7_KjU() : Color.Companion.m30914getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m28512contentColorForek8zF_U(long j10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM28511contentColorFor4WTKRHQ = m28511contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10);
        if (jM28511contentColorFor4WTKRHQ == 16) {
            jM28511contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM28511contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m28513darkColorSchemeCXl9yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m28514darkColorSchemeCXl9yA$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jM29677getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m29677getPrimary0d7_KjU() : j10;
        long jM29661getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m29661getOnPrimary0d7_KjU() : j11;
        long jM29678getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m29678getPrimaryContainer0d7_KjU() : j12;
        long jM29662getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorDarkTokens.INSTANCE.m29662getOnPrimaryContainer0d7_KjU() : j13;
        long jM29656getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorDarkTokens.INSTANCE.m29656getInversePrimary0d7_KjU() : j14;
        long jM29682getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorDarkTokens.INSTANCE.m29682getSecondary0d7_KjU() : j15;
        long jM29665getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorDarkTokens.INSTANCE.m29665getOnSecondary0d7_KjU() : j16;
        long jM29683getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorDarkTokens.INSTANCE.m29683getSecondaryContainer0d7_KjU() : j17;
        long j46 = jM29677getPrimary0d7_KjU;
        long jM29666getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorDarkTokens.INSTANCE.m29666getOnSecondaryContainer0d7_KjU() : j18;
        long jM29696getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorDarkTokens.INSTANCE.m29696getTertiary0d7_KjU() : j19;
        long jM29671getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m29671getOnTertiary0d7_KjU() : j20;
        long jM29697getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m29697getTertiaryContainer0d7_KjU() : j21;
        long jM29672getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m29672getOnTertiaryContainer0d7_KjU() : j22;
        long jM29652getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m29652getBackground0d7_KjU() : j23;
        long jM29658getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m29658getOnBackground0d7_KjU() : j24;
        long jM29686getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m29686getSurface0d7_KjU() : j25;
        long jM29669getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m29669getOnSurface0d7_KjU() : j26;
        long jM29695getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m29695getSurfaceVariant0d7_KjU() : j27;
        long jM29670getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m29670getOnSurfaceVariant0d7_KjU() : j28;
        long j47 = (i10 & 524288) != 0 ? j46 : j29;
        long jM29657getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m29657getInverseSurface0d7_KjU() : j30;
        long jM29655getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m29655getInverseOnSurface0d7_KjU() : j31;
        long jM29653getError0d7_KjU = (i10 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m29653getError0d7_KjU() : j32;
        long jM29659getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m29659getOnError0d7_KjU() : j33;
        long jM29654getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m29654getErrorContainer0d7_KjU() : j34;
        long jM29660getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m29660getOnErrorContainer0d7_KjU() : j35;
        long jM29675getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m29675getOutline0d7_KjU() : j36;
        long jM29676getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m29676getOutlineVariant0d7_KjU() : j37;
        long jM29681getScrim0d7_KjU = (i10 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m29681getScrim0d7_KjU() : j38;
        long jM29687getSurfaceBright0d7_KjU = (i10 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m29687getSurfaceBright0d7_KjU() : j39;
        long jM29688getSurfaceContainer0d7_KjU = (i10 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m29688getSurfaceContainer0d7_KjU() : j40;
        long jM29689getSurfaceContainerHigh0d7_KjU = (i10 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m29689getSurfaceContainerHigh0d7_KjU() : j41;
        long jM29690getSurfaceContainerHighest0d7_KjU = (i11 & 1) != 0 ? ColorDarkTokens.INSTANCE.m29690getSurfaceContainerHighest0d7_KjU() : j42;
        long jM29691getSurfaceContainerLow0d7_KjU = (i11 & 2) != 0 ? ColorDarkTokens.INSTANCE.m29691getSurfaceContainerLow0d7_KjU() : j43;
        long jM29692getSurfaceContainerLowest0d7_KjU = (i11 & 4) != 0 ? ColorDarkTokens.INSTANCE.m29692getSurfaceContainerLowest0d7_KjU() : j44;
        if ((i11 & 8) != 0) {
            j45 = ColorDarkTokens.INSTANCE.m29693getSurfaceDim0d7_KjU();
        }
        return m28513darkColorSchemeCXl9yA(j46, jM29661getOnPrimary0d7_KjU, jM29678getPrimaryContainer0d7_KjU, jM29662getOnPrimaryContainer0d7_KjU, jM29656getInversePrimary0d7_KjU, jM29682getSecondary0d7_KjU, jM29665getOnSecondary0d7_KjU, jM29683getSecondaryContainer0d7_KjU, jM29666getOnSecondaryContainer0d7_KjU, jM29696getTertiary0d7_KjU, jM29671getOnTertiary0d7_KjU, jM29697getTertiaryContainer0d7_KjU, jM29672getOnTertiaryContainer0d7_KjU, jM29652getBackground0d7_KjU, jM29658getOnBackground0d7_KjU, jM29686getSurface0d7_KjU, jM29669getOnSurface0d7_KjU, jM29695getSurfaceVariant0d7_KjU, jM29670getOnSurfaceVariant0d7_KjU, j47, jM29657getInverseSurface0d7_KjU, jM29655getInverseOnSurface0d7_KjU, jM29653getError0d7_KjU, jM29659getOnError0d7_KjU, jM29654getErrorContainer0d7_KjU, jM29660getOnErrorContainer0d7_KjU, jM29675getOutline0d7_KjU, jM29676getOutlineVariant0d7_KjU, jM29681getScrim0d7_KjU, jM29687getSurfaceBright0d7_KjU, jM29688getSurfaceContainer0d7_KjU, jM29689getSurfaceContainerHigh0d7_KjU, jM29690getSurfaceContainerHighest0d7_KjU, jM29691getSurfaceContainerLow0d7_KjU, jM29692getSurfaceContainerLowest0d7_KjU, j45);
    }

    @InterfaceC10770a
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m28515darkColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m28514darkColorSchemeCXl9yA$default(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m28516darkColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM29677getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m29677getPrimary0d7_KjU() : j10;
        long jM29661getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m29661getOnPrimary0d7_KjU() : j11;
        long jM29678getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m29678getPrimaryContainer0d7_KjU() : j12;
        long jM29662getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorDarkTokens.INSTANCE.m29662getOnPrimaryContainer0d7_KjU() : j13;
        long jM29656getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorDarkTokens.INSTANCE.m29656getInversePrimary0d7_KjU() : j14;
        long jM29682getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorDarkTokens.INSTANCE.m29682getSecondary0d7_KjU() : j15;
        long jM29665getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorDarkTokens.INSTANCE.m29665getOnSecondary0d7_KjU() : j16;
        long jM29683getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorDarkTokens.INSTANCE.m29683getSecondaryContainer0d7_KjU() : j17;
        long j39 = jM29677getPrimary0d7_KjU;
        long jM29666getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorDarkTokens.INSTANCE.m29666getOnSecondaryContainer0d7_KjU() : j18;
        long jM29696getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorDarkTokens.INSTANCE.m29696getTertiary0d7_KjU() : j19;
        long jM29671getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m29671getOnTertiary0d7_KjU() : j20;
        long jM29697getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m29697getTertiaryContainer0d7_KjU() : j21;
        long jM29672getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m29672getOnTertiaryContainer0d7_KjU() : j22;
        long jM29652getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m29652getBackground0d7_KjU() : j23;
        long jM29658getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m29658getOnBackground0d7_KjU() : j24;
        long jM29686getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m29686getSurface0d7_KjU() : j25;
        long jM29669getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m29669getOnSurface0d7_KjU() : j26;
        long jM29695getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m29695getSurfaceVariant0d7_KjU() : j27;
        long jM29670getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m29670getOnSurfaceVariant0d7_KjU() : j28;
        long j40 = (i10 & 524288) != 0 ? j39 : j29;
        long jM29657getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m29657getInverseSurface0d7_KjU() : j30;
        long jM29655getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m29655getInverseOnSurface0d7_KjU() : j31;
        long jM29653getError0d7_KjU = (i10 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m29653getError0d7_KjU() : j32;
        long jM29659getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m29659getOnError0d7_KjU() : j33;
        long jM29654getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m29654getErrorContainer0d7_KjU() : j34;
        long jM29660getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m29660getOnErrorContainer0d7_KjU() : j35;
        long jM29675getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m29675getOutline0d7_KjU() : j36;
        long jM29676getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m29676getOutlineVariant0d7_KjU() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = ColorDarkTokens.INSTANCE.m29681getScrim0d7_KjU();
        }
        return m28515darkColorSchemeG1PFcw(j39, jM29661getOnPrimary0d7_KjU, jM29678getPrimaryContainer0d7_KjU, jM29662getOnPrimaryContainer0d7_KjU, jM29656getInversePrimary0d7_KjU, jM29682getSecondary0d7_KjU, jM29665getOnSecondary0d7_KjU, jM29683getSecondaryContainer0d7_KjU, jM29666getOnSecondaryContainer0d7_KjU, jM29696getTertiary0d7_KjU, jM29671getOnTertiary0d7_KjU, jM29697getTertiaryContainer0d7_KjU, jM29672getOnTertiaryContainer0d7_KjU, jM29652getBackground0d7_KjU, jM29658getOnBackground0d7_KjU, jM29686getSurface0d7_KjU, jM29669getOnSurface0d7_KjU, jM29695getSurfaceVariant0d7_KjU, jM29670getOnSurfaceVariant0d7_KjU, j40, jM29657getInverseSurface0d7_KjU, jM29655getInverseOnSurface0d7_KjU, jM29653getError0d7_KjU, jM29659getOnError0d7_KjU, jM29654getErrorContainer0d7_KjU, jM29660getOnErrorContainer0d7_KjU, jM29675getOutline0d7_KjU, jM29676getOutlineVariant0d7_KjU, j38);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m28518lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m30036getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m30049getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m30049getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    @Stable
    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m28474getBackground0d7_KjU();
            case 2:
                return colorScheme.m28475getError0d7_KjU();
            case 3:
                return colorScheme.m28476getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m28477getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m28478getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m28479getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m28480getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m28481getOnError0d7_KjU();
            case 9:
                return colorScheme.m28482getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m28483getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m28484getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m28485getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m28486getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m28487getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m28488getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m28506getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m28489getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m28490getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m28491getOutline0d7_KjU();
            case 20:
                return colorScheme.m28492getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m28493getPrimary0d7_KjU();
            case 22:
                return colorScheme.m28494getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m28495getScrim0d7_KjU();
            case 24:
                return colorScheme.m28496getSecondary0d7_KjU();
            case 25:
                return colorScheme.m28497getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m28498getSurface0d7_KjU();
            case 27:
                return colorScheme.m28507getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m28499getSurfaceBright0d7_KjU();
            case 29:
                return colorScheme.m28500getSurfaceContainer0d7_KjU();
            case 30:
                return colorScheme.m28501getSurfaceContainerHigh0d7_KjU();
            case 31:
                return colorScheme.m28502getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m28503getSurfaceContainerLow0d7_KjU();
            case 33:
                return colorScheme.m28504getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m28505getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m28508getTertiary0d7_KjU();
            case 36:
                return colorScheme.m28509getTertiaryContainer0d7_KjU();
            default:
                return Color.Companion.m30914getUnspecified0d7_KjU();
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
    public static final ColorScheme m28517lightColorSchemeCXl9yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new ColorScheme(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m28518lightColorSchemeCXl9yA$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        long jM29725getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m29725getPrimary0d7_KjU() : j10;
        long jM29709getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m29709getOnPrimary0d7_KjU() : j11;
        long jM29726getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m29726getPrimaryContainer0d7_KjU() : j12;
        long jM29710getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorLightTokens.INSTANCE.m29710getOnPrimaryContainer0d7_KjU() : j13;
        long jM29704getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorLightTokens.INSTANCE.m29704getInversePrimary0d7_KjU() : j14;
        long jM29730getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorLightTokens.INSTANCE.m29730getSecondary0d7_KjU() : j15;
        long jM29713getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorLightTokens.INSTANCE.m29713getOnSecondary0d7_KjU() : j16;
        long jM29731getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorLightTokens.INSTANCE.m29731getSecondaryContainer0d7_KjU() : j17;
        long j46 = jM29725getPrimary0d7_KjU;
        long jM29714getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorLightTokens.INSTANCE.m29714getOnSecondaryContainer0d7_KjU() : j18;
        long jM29744getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorLightTokens.INSTANCE.m29744getTertiary0d7_KjU() : j19;
        long jM29719getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorLightTokens.INSTANCE.m29719getOnTertiary0d7_KjU() : j20;
        long jM29745getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorLightTokens.INSTANCE.m29745getTertiaryContainer0d7_KjU() : j21;
        long jM29720getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorLightTokens.INSTANCE.m29720getOnTertiaryContainer0d7_KjU() : j22;
        long jM29700getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorLightTokens.INSTANCE.m29700getBackground0d7_KjU() : j23;
        long jM29706getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorLightTokens.INSTANCE.m29706getOnBackground0d7_KjU() : j24;
        long jM29734getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorLightTokens.INSTANCE.m29734getSurface0d7_KjU() : j25;
        long jM29717getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorLightTokens.INSTANCE.m29717getOnSurface0d7_KjU() : j26;
        long jM29743getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorLightTokens.INSTANCE.m29743getSurfaceVariant0d7_KjU() : j27;
        long jM29718getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorLightTokens.INSTANCE.m29718getOnSurfaceVariant0d7_KjU() : j28;
        long j47 = (i10 & 524288) != 0 ? j46 : j29;
        long jM29705getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m29705getInverseSurface0d7_KjU() : j30;
        long jM29703getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m29703getInverseOnSurface0d7_KjU() : j31;
        long jM29701getError0d7_KjU = (i10 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m29701getError0d7_KjU() : j32;
        long jM29707getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m29707getOnError0d7_KjU() : j33;
        long jM29702getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m29702getErrorContainer0d7_KjU() : j34;
        long jM29708getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m29708getOnErrorContainer0d7_KjU() : j35;
        long jM29723getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m29723getOutline0d7_KjU() : j36;
        long jM29724getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m29724getOutlineVariant0d7_KjU() : j37;
        long jM29729getScrim0d7_KjU = (i10 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m29729getScrim0d7_KjU() : j38;
        long jM29735getSurfaceBright0d7_KjU = (i10 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m29735getSurfaceBright0d7_KjU() : j39;
        long jM29736getSurfaceContainer0d7_KjU = (i10 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m29736getSurfaceContainer0d7_KjU() : j40;
        long jM29737getSurfaceContainerHigh0d7_KjU = (i10 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m29737getSurfaceContainerHigh0d7_KjU() : j41;
        long jM29738getSurfaceContainerHighest0d7_KjU = (i11 & 1) != 0 ? ColorLightTokens.INSTANCE.m29738getSurfaceContainerHighest0d7_KjU() : j42;
        long jM29739getSurfaceContainerLow0d7_KjU = (i11 & 2) != 0 ? ColorLightTokens.INSTANCE.m29739getSurfaceContainerLow0d7_KjU() : j43;
        long jM29740getSurfaceContainerLowest0d7_KjU = (i11 & 4) != 0 ? ColorLightTokens.INSTANCE.m29740getSurfaceContainerLowest0d7_KjU() : j44;
        if ((i11 & 8) != 0) {
            j45 = ColorLightTokens.INSTANCE.m29741getSurfaceDim0d7_KjU();
        }
        return m28517lightColorSchemeCXl9yA(j46, jM29709getOnPrimary0d7_KjU, jM29726getPrimaryContainer0d7_KjU, jM29710getOnPrimaryContainer0d7_KjU, jM29704getInversePrimary0d7_KjU, jM29730getSecondary0d7_KjU, jM29713getOnSecondary0d7_KjU, jM29731getSecondaryContainer0d7_KjU, jM29714getOnSecondaryContainer0d7_KjU, jM29744getTertiary0d7_KjU, jM29719getOnTertiary0d7_KjU, jM29745getTertiaryContainer0d7_KjU, jM29720getOnTertiaryContainer0d7_KjU, jM29700getBackground0d7_KjU, jM29706getOnBackground0d7_KjU, jM29734getSurface0d7_KjU, jM29717getOnSurface0d7_KjU, jM29743getSurfaceVariant0d7_KjU, jM29718getOnSurfaceVariant0d7_KjU, j47, jM29705getInverseSurface0d7_KjU, jM29703getInverseOnSurface0d7_KjU, jM29701getError0d7_KjU, jM29707getOnError0d7_KjU, jM29702getErrorContainer0d7_KjU, jM29708getOnErrorContainer0d7_KjU, jM29723getOutline0d7_KjU, jM29724getOutlineVariant0d7_KjU, jM29729getScrim0d7_KjU, jM29735getSurfaceBright0d7_KjU, jM29736getSurfaceContainer0d7_KjU, jM29737getSurfaceContainerHigh0d7_KjU, jM29738getSurfaceContainerHighest0d7_KjU, jM29739getSurfaceContainerLow0d7_KjU, jM29740getSurfaceContainerLowest0d7_KjU, j45);
    }

    @InterfaceC10770a
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m28519lightColorSchemeG1PFcw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38) {
        return m28518lightColorSchemeCXl9yA$default(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m28520lightColorSchemeG1PFcw$default(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, int i10, Object obj) {
        long jM29725getPrimary0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m29725getPrimary0d7_KjU() : j10;
        long jM29709getOnPrimary0d7_KjU = (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m29709getOnPrimary0d7_KjU() : j11;
        long jM29726getPrimaryContainer0d7_KjU = (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m29726getPrimaryContainer0d7_KjU() : j12;
        long jM29710getOnPrimaryContainer0d7_KjU = (i10 & 8) != 0 ? ColorLightTokens.INSTANCE.m29710getOnPrimaryContainer0d7_KjU() : j13;
        long jM29704getInversePrimary0d7_KjU = (i10 & 16) != 0 ? ColorLightTokens.INSTANCE.m29704getInversePrimary0d7_KjU() : j14;
        long jM29730getSecondary0d7_KjU = (i10 & 32) != 0 ? ColorLightTokens.INSTANCE.m29730getSecondary0d7_KjU() : j15;
        long jM29713getOnSecondary0d7_KjU = (i10 & 64) != 0 ? ColorLightTokens.INSTANCE.m29713getOnSecondary0d7_KjU() : j16;
        long jM29731getSecondaryContainer0d7_KjU = (i10 & 128) != 0 ? ColorLightTokens.INSTANCE.m29731getSecondaryContainer0d7_KjU() : j17;
        long j39 = jM29725getPrimary0d7_KjU;
        long jM29714getOnSecondaryContainer0d7_KjU = (i10 & 256) != 0 ? ColorLightTokens.INSTANCE.m29714getOnSecondaryContainer0d7_KjU() : j18;
        long jM29744getTertiary0d7_KjU = (i10 & 512) != 0 ? ColorLightTokens.INSTANCE.m29744getTertiary0d7_KjU() : j19;
        long jM29719getOnTertiary0d7_KjU = (i10 & 1024) != 0 ? ColorLightTokens.INSTANCE.m29719getOnTertiary0d7_KjU() : j20;
        long jM29745getTertiaryContainer0d7_KjU = (i10 & 2048) != 0 ? ColorLightTokens.INSTANCE.m29745getTertiaryContainer0d7_KjU() : j21;
        long jM29720getOnTertiaryContainer0d7_KjU = (i10 & 4096) != 0 ? ColorLightTokens.INSTANCE.m29720getOnTertiaryContainer0d7_KjU() : j22;
        long jM29700getBackground0d7_KjU = (i10 & 8192) != 0 ? ColorLightTokens.INSTANCE.m29700getBackground0d7_KjU() : j23;
        long jM29706getOnBackground0d7_KjU = (i10 & 16384) != 0 ? ColorLightTokens.INSTANCE.m29706getOnBackground0d7_KjU() : j24;
        long jM29734getSurface0d7_KjU = (i10 & 32768) != 0 ? ColorLightTokens.INSTANCE.m29734getSurface0d7_KjU() : j25;
        long jM29717getOnSurface0d7_KjU = (i10 & 65536) != 0 ? ColorLightTokens.INSTANCE.m29717getOnSurface0d7_KjU() : j26;
        long jM29743getSurfaceVariant0d7_KjU = (i10 & 131072) != 0 ? ColorLightTokens.INSTANCE.m29743getSurfaceVariant0d7_KjU() : j27;
        long jM29718getOnSurfaceVariant0d7_KjU = (i10 & 262144) != 0 ? ColorLightTokens.INSTANCE.m29718getOnSurfaceVariant0d7_KjU() : j28;
        long j40 = (i10 & 524288) != 0 ? j39 : j29;
        long jM29705getInverseSurface0d7_KjU = (i10 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m29705getInverseSurface0d7_KjU() : j30;
        long jM29703getInverseOnSurface0d7_KjU = (i10 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m29703getInverseOnSurface0d7_KjU() : j31;
        long jM29701getError0d7_KjU = (i10 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m29701getError0d7_KjU() : j32;
        long jM29707getOnError0d7_KjU = (i10 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m29707getOnError0d7_KjU() : j33;
        long jM29702getErrorContainer0d7_KjU = (i10 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m29702getErrorContainer0d7_KjU() : j34;
        long jM29708getOnErrorContainer0d7_KjU = (i10 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m29708getOnErrorContainer0d7_KjU() : j35;
        long jM29723getOutline0d7_KjU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m29723getOutline0d7_KjU() : j36;
        long jM29724getOutlineVariant0d7_KjU = (i10 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m29724getOutlineVariant0d7_KjU() : j37;
        if ((i10 & 268435456) != 0) {
            j38 = ColorLightTokens.INSTANCE.m29729getScrim0d7_KjU();
        }
        return m28519lightColorSchemeG1PFcw(j39, jM29709getOnPrimary0d7_KjU, jM29726getPrimaryContainer0d7_KjU, jM29710getOnPrimaryContainer0d7_KjU, jM29704getInversePrimary0d7_KjU, jM29730getSecondary0d7_KjU, jM29713getOnSecondary0d7_KjU, jM29731getSecondaryContainer0d7_KjU, jM29714getOnSecondaryContainer0d7_KjU, jM29744getTertiary0d7_KjU, jM29719getOnTertiary0d7_KjU, jM29745getTertiaryContainer0d7_KjU, jM29720getOnTertiaryContainer0d7_KjU, jM29700getBackground0d7_KjU, jM29706getOnBackground0d7_KjU, jM29734getSurface0d7_KjU, jM29717getOnSurface0d7_KjU, jM29743getSurfaceVariant0d7_KjU, jM29718getOnSurfaceVariant0d7_KjU, j40, jM29705getInverseSurface0d7_KjU, jM29703getInverseOnSurface0d7_KjU, jM29701getError0d7_KjU, jM29707getOnError0d7_KjU, jM29702getErrorContainer0d7_KjU, jM29708getOnErrorContainer0d7_KjU, jM29723getOutline0d7_KjU, jM29724getOutlineVariant0d7_KjU, j38);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m28521surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f10) {
        if (C3186Dp.m33506equalsimpl0(f10, C3186Dp.m33501constructorimpl(0))) {
            return colorScheme.m28498getSurface0d7_KjU();
        }
        return ColorKt.m30923compositeOverOWjLjI(Color.m30877copywmQWz5c$default(colorScheme.m28506getSurfaceTint0d7_KjU(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m28498getSurface0d7_KjU());
    }
}
