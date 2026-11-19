package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorKt;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\b\u0010<\u001a\u00020\u0004H\u0000\u001a´\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u00102\u001aø\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b?\u0010;\u001a&\u0010@\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020BH\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001e\u0010I\u001a\u00020\u000b*\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m7880d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "value", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "expressiveLightColorScheme", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1011:1\n708#2:1012\n696#2:1013\n77#3:1014\n77#3:1015\n148#4:1016\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n879#1:1012\n879#1:1013\n880#1:1014\n897#1:1015\n916#1:1016\n*E\n"})
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m11595lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Metadata(m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
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
    public static final long m11587applyTonalElevationRFCenO8(ColorScheme colorScheme, long j6, float f6, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i6, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m13900equalsimpl0(j6, colorScheme.getSurface()) && zBooleanValue) {
            j6 = m11598surfaceColorAtElevation3ABfNKs(colorScheme, f6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j6;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m11588contentColorFor4WTKRHQ(ColorScheme colorScheme, long j6) {
        return Color.m13900equalsimpl0(j6, colorScheme.getPrimary()) ? colorScheme.getOnPrimary() : Color.m13900equalsimpl0(j6, colorScheme.getSecondary()) ? colorScheme.getOnSecondary() : Color.m13900equalsimpl0(j6, colorScheme.getTertiary()) ? colorScheme.getOnTertiary() : Color.m13900equalsimpl0(j6, colorScheme.getBackground()) ? colorScheme.getOnBackground() : Color.m13900equalsimpl0(j6, colorScheme.getError()) ? colorScheme.getOnError() : Color.m13900equalsimpl0(j6, colorScheme.getPrimaryContainer()) ? colorScheme.getOnPrimaryContainer() : Color.m13900equalsimpl0(j6, colorScheme.getSecondaryContainer()) ? colorScheme.getOnSecondaryContainer() : Color.m13900equalsimpl0(j6, colorScheme.getTertiaryContainer()) ? colorScheme.getOnTertiaryContainer() : Color.m13900equalsimpl0(j6, colorScheme.getErrorContainer()) ? colorScheme.getOnErrorContainer() : Color.m13900equalsimpl0(j6, colorScheme.getInverseSurface()) ? colorScheme.getInverseOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurface()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceVariant()) ? colorScheme.getOnSurfaceVariant() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceBright()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceContainer()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceContainerHigh()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceContainerHighest()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceContainerLow()) ? colorScheme.getOnSurface() : Color.m13900equalsimpl0(j6, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : Color.INSTANCE.m13935getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m11589contentColorForek8zF_U(long j6, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i6, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM11588contentColorFor4WTKRHQ = m11588contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j6);
        if (jM11588contentColorFor4WTKRHQ == 16) {
            jM11588contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m13909unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM11588contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m11590darkColorSchemeCXl9yA(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41) {
        return new ColorScheme(j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j41, j36, j37, j38, j39, j40, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m11591darkColorSchemeCXl9yA$default(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, int i6, int i7, Object obj) {
        long jM12722getPrimary0d7_KjU = (i6 & 1) != 0 ? ColorDarkTokens.INSTANCE.m12722getPrimary0d7_KjU() : j6;
        long jM12706getOnPrimary0d7_KjU = (i6 & 2) != 0 ? ColorDarkTokens.INSTANCE.m12706getOnPrimary0d7_KjU() : j7;
        long jM12723getPrimaryContainer0d7_KjU = (i6 & 4) != 0 ? ColorDarkTokens.INSTANCE.m12723getPrimaryContainer0d7_KjU() : j8;
        long jM12707getOnPrimaryContainer0d7_KjU = (i6 & 8) != 0 ? ColorDarkTokens.INSTANCE.m12707getOnPrimaryContainer0d7_KjU() : j9;
        long jM12701getInversePrimary0d7_KjU = (i6 & 16) != 0 ? ColorDarkTokens.INSTANCE.m12701getInversePrimary0d7_KjU() : j10;
        long jM12727getSecondary0d7_KjU = (i6 & 32) != 0 ? ColorDarkTokens.INSTANCE.m12727getSecondary0d7_KjU() : j11;
        long jM12710getOnSecondary0d7_KjU = (i6 & 64) != 0 ? ColorDarkTokens.INSTANCE.m12710getOnSecondary0d7_KjU() : j12;
        long jM12728getSecondaryContainer0d7_KjU = (i6 & 128) != 0 ? ColorDarkTokens.INSTANCE.m12728getSecondaryContainer0d7_KjU() : j13;
        long j42 = jM12722getPrimary0d7_KjU;
        long jM12711getOnSecondaryContainer0d7_KjU = (i6 & 256) != 0 ? ColorDarkTokens.INSTANCE.m12711getOnSecondaryContainer0d7_KjU() : j14;
        long jM12741getTertiary0d7_KjU = (i6 & 512) != 0 ? ColorDarkTokens.INSTANCE.m12741getTertiary0d7_KjU() : j15;
        long jM12716getOnTertiary0d7_KjU = (i6 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m12716getOnTertiary0d7_KjU() : j16;
        long jM12742getTertiaryContainer0d7_KjU = (i6 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m12742getTertiaryContainer0d7_KjU() : j17;
        long jM12717getOnTertiaryContainer0d7_KjU = (i6 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m12717getOnTertiaryContainer0d7_KjU() : j18;
        long jM12697getBackground0d7_KjU = (i6 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m12697getBackground0d7_KjU() : j19;
        long jM12703getOnBackground0d7_KjU = (i6 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m12703getOnBackground0d7_KjU() : j20;
        long jM12731getSurface0d7_KjU = (i6 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m12731getSurface0d7_KjU() : j21;
        long jM12714getOnSurface0d7_KjU = (i6 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m12714getOnSurface0d7_KjU() : j22;
        long jM12740getSurfaceVariant0d7_KjU = (i6 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m12740getSurfaceVariant0d7_KjU() : j23;
        long jM12715getOnSurfaceVariant0d7_KjU = (i6 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m12715getOnSurfaceVariant0d7_KjU() : j24;
        long j43 = (i6 & 524288) != 0 ? j42 : j25;
        long jM12702getInverseSurface0d7_KjU = (i6 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m12702getInverseSurface0d7_KjU() : j26;
        long jM12700getInverseOnSurface0d7_KjU = (i6 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m12700getInverseOnSurface0d7_KjU() : j27;
        long jM12698getError0d7_KjU = (i6 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m12698getError0d7_KjU() : j28;
        long jM12704getOnError0d7_KjU = (i6 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m12704getOnError0d7_KjU() : j29;
        long jM12699getErrorContainer0d7_KjU = (i6 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m12699getErrorContainer0d7_KjU() : j30;
        long jM12705getOnErrorContainer0d7_KjU = (i6 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m12705getOnErrorContainer0d7_KjU() : j31;
        long jM12720getOutline0d7_KjU = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m12720getOutline0d7_KjU() : j32;
        long jM12721getOutlineVariant0d7_KjU = (i6 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m12721getOutlineVariant0d7_KjU() : j33;
        long jM12726getScrim0d7_KjU = (i6 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m12726getScrim0d7_KjU() : j34;
        long jM12732getSurfaceBright0d7_KjU = (i6 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m12732getSurfaceBright0d7_KjU() : j35;
        long jM12733getSurfaceContainer0d7_KjU = (i6 & BasicMeasure.EXACTLY) != 0 ? ColorDarkTokens.INSTANCE.m12733getSurfaceContainer0d7_KjU() : j36;
        long jM12734getSurfaceContainerHigh0d7_KjU = (i6 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m12734getSurfaceContainerHigh0d7_KjU() : j37;
        long jM12735getSurfaceContainerHighest0d7_KjU = (i7 & 1) != 0 ? ColorDarkTokens.INSTANCE.m12735getSurfaceContainerHighest0d7_KjU() : j38;
        long jM12736getSurfaceContainerLow0d7_KjU = (i7 & 2) != 0 ? ColorDarkTokens.INSTANCE.m12736getSurfaceContainerLow0d7_KjU() : j39;
        long jM12737getSurfaceContainerLowest0d7_KjU = (i7 & 4) != 0 ? ColorDarkTokens.INSTANCE.m12737getSurfaceContainerLowest0d7_KjU() : j40;
        if ((i7 & 8) != 0) {
            j41 = ColorDarkTokens.INSTANCE.m12738getSurfaceDim0d7_KjU();
        }
        return m11590darkColorSchemeCXl9yA(j42, jM12706getOnPrimary0d7_KjU, jM12723getPrimaryContainer0d7_KjU, jM12707getOnPrimaryContainer0d7_KjU, jM12701getInversePrimary0d7_KjU, jM12727getSecondary0d7_KjU, jM12710getOnSecondary0d7_KjU, jM12728getSecondaryContainer0d7_KjU, jM12711getOnSecondaryContainer0d7_KjU, jM12741getTertiary0d7_KjU, jM12716getOnTertiary0d7_KjU, jM12742getTertiaryContainer0d7_KjU, jM12717getOnTertiaryContainer0d7_KjU, jM12697getBackground0d7_KjU, jM12703getOnBackground0d7_KjU, jM12731getSurface0d7_KjU, jM12714getOnSurface0d7_KjU, jM12740getSurfaceVariant0d7_KjU, jM12715getOnSurfaceVariant0d7_KjU, j43, jM12702getInverseSurface0d7_KjU, jM12700getInverseOnSurface0d7_KjU, jM12698getError0d7_KjU, jM12704getOnError0d7_KjU, jM12699getErrorContainer0d7_KjU, jM12705getOnErrorContainer0d7_KjU, jM12720getOutline0d7_KjU, jM12721getOutlineVariant0d7_KjU, jM12726getScrim0d7_KjU, jM12732getSurfaceBright0d7_KjU, jM12733getSurfaceContainer0d7_KjU, jM12734getSurfaceContainerHigh0d7_KjU, jM12735getSurfaceContainerHighest0d7_KjU, jM12736getSurfaceContainerLow0d7_KjU, jM12737getSurfaceContainerLowest0d7_KjU, j41);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m11592darkColorSchemeG1PFcw(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34) {
        return m11591darkColorSchemeCXl9yA$default(j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m11593darkColorSchemeG1PFcw$default(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i6, Object obj) {
        long jM12722getPrimary0d7_KjU = (i6 & 1) != 0 ? ColorDarkTokens.INSTANCE.m12722getPrimary0d7_KjU() : j6;
        long jM12706getOnPrimary0d7_KjU = (i6 & 2) != 0 ? ColorDarkTokens.INSTANCE.m12706getOnPrimary0d7_KjU() : j7;
        long jM12723getPrimaryContainer0d7_KjU = (i6 & 4) != 0 ? ColorDarkTokens.INSTANCE.m12723getPrimaryContainer0d7_KjU() : j8;
        long jM12707getOnPrimaryContainer0d7_KjU = (i6 & 8) != 0 ? ColorDarkTokens.INSTANCE.m12707getOnPrimaryContainer0d7_KjU() : j9;
        long jM12701getInversePrimary0d7_KjU = (i6 & 16) != 0 ? ColorDarkTokens.INSTANCE.m12701getInversePrimary0d7_KjU() : j10;
        long jM12727getSecondary0d7_KjU = (i6 & 32) != 0 ? ColorDarkTokens.INSTANCE.m12727getSecondary0d7_KjU() : j11;
        long jM12710getOnSecondary0d7_KjU = (i6 & 64) != 0 ? ColorDarkTokens.INSTANCE.m12710getOnSecondary0d7_KjU() : j12;
        long jM12728getSecondaryContainer0d7_KjU = (i6 & 128) != 0 ? ColorDarkTokens.INSTANCE.m12728getSecondaryContainer0d7_KjU() : j13;
        long j35 = jM12722getPrimary0d7_KjU;
        long jM12711getOnSecondaryContainer0d7_KjU = (i6 & 256) != 0 ? ColorDarkTokens.INSTANCE.m12711getOnSecondaryContainer0d7_KjU() : j14;
        long jM12741getTertiary0d7_KjU = (i6 & 512) != 0 ? ColorDarkTokens.INSTANCE.m12741getTertiary0d7_KjU() : j15;
        long jM12716getOnTertiary0d7_KjU = (i6 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m12716getOnTertiary0d7_KjU() : j16;
        long jM12742getTertiaryContainer0d7_KjU = (i6 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m12742getTertiaryContainer0d7_KjU() : j17;
        long jM12717getOnTertiaryContainer0d7_KjU = (i6 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m12717getOnTertiaryContainer0d7_KjU() : j18;
        long jM12697getBackground0d7_KjU = (i6 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m12697getBackground0d7_KjU() : j19;
        long jM12703getOnBackground0d7_KjU = (i6 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m12703getOnBackground0d7_KjU() : j20;
        long jM12731getSurface0d7_KjU = (i6 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m12731getSurface0d7_KjU() : j21;
        long jM12714getOnSurface0d7_KjU = (i6 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m12714getOnSurface0d7_KjU() : j22;
        long jM12740getSurfaceVariant0d7_KjU = (i6 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m12740getSurfaceVariant0d7_KjU() : j23;
        long jM12715getOnSurfaceVariant0d7_KjU = (i6 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m12715getOnSurfaceVariant0d7_KjU() : j24;
        long j36 = (i6 & 524288) != 0 ? j35 : j25;
        long jM12702getInverseSurface0d7_KjU = (i6 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m12702getInverseSurface0d7_KjU() : j26;
        long jM12700getInverseOnSurface0d7_KjU = (i6 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m12700getInverseOnSurface0d7_KjU() : j27;
        long jM12698getError0d7_KjU = (i6 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m12698getError0d7_KjU() : j28;
        long jM12704getOnError0d7_KjU = (i6 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m12704getOnError0d7_KjU() : j29;
        long jM12699getErrorContainer0d7_KjU = (i6 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m12699getErrorContainer0d7_KjU() : j30;
        long jM12705getOnErrorContainer0d7_KjU = (i6 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m12705getOnErrorContainer0d7_KjU() : j31;
        long jM12720getOutline0d7_KjU = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m12720getOutline0d7_KjU() : j32;
        long jM12721getOutlineVariant0d7_KjU = (i6 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m12721getOutlineVariant0d7_KjU() : j33;
        if ((i6 & 268435456) != 0) {
            j34 = ColorDarkTokens.INSTANCE.m12726getScrim0d7_KjU();
        }
        return m11592darkColorSchemeG1PFcw(j35, jM12706getOnPrimary0d7_KjU, jM12723getPrimaryContainer0d7_KjU, jM12707getOnPrimaryContainer0d7_KjU, jM12701getInversePrimary0d7_KjU, jM12727getSecondary0d7_KjU, jM12710getOnSecondary0d7_KjU, jM12728getSecondaryContainer0d7_KjU, jM12711getOnSecondaryContainer0d7_KjU, jM12741getTertiary0d7_KjU, jM12716getOnTertiary0d7_KjU, jM12742getTertiaryContainer0d7_KjU, jM12717getOnTertiaryContainer0d7_KjU, jM12697getBackground0d7_KjU, jM12703getOnBackground0d7_KjU, jM12731getSurface0d7_KjU, jM12714getOnSurface0d7_KjU, jM12740getSurfaceVariant0d7_KjU, jM12715getOnSurfaceVariant0d7_KjU, j36, jM12702getInverseSurface0d7_KjU, jM12700getInverseOnSurface0d7_KjU, jM12698getError0d7_KjU, jM12704getOnError0d7_KjU, jM12699getErrorContainer0d7_KjU, jM12705getOnErrorContainer0d7_KjU, jM12720getOutline0d7_KjU, jM12721getOutlineVariant0d7_KjU, j34);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m11595lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m13081getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m13094getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m13094getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    @Stable
    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return Color.INSTANCE.m13935getUnspecified0d7_KjU();
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
    @JvmName(name = "getValue")
    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i6, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m11594lightColorSchemeCXl9yA(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41) {
        return new ColorScheme(j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j41, j36, j37, j38, j39, j40, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m11595lightColorSchemeCXl9yA$default(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, int i6, int i7, Object obj) {
        long jM12770getPrimary0d7_KjU = (i6 & 1) != 0 ? ColorLightTokens.INSTANCE.m12770getPrimary0d7_KjU() : j6;
        long jM12754getOnPrimary0d7_KjU = (i6 & 2) != 0 ? ColorLightTokens.INSTANCE.m12754getOnPrimary0d7_KjU() : j7;
        long jM12771getPrimaryContainer0d7_KjU = (i6 & 4) != 0 ? ColorLightTokens.INSTANCE.m12771getPrimaryContainer0d7_KjU() : j8;
        long jM12755getOnPrimaryContainer0d7_KjU = (i6 & 8) != 0 ? ColorLightTokens.INSTANCE.m12755getOnPrimaryContainer0d7_KjU() : j9;
        long jM12749getInversePrimary0d7_KjU = (i6 & 16) != 0 ? ColorLightTokens.INSTANCE.m12749getInversePrimary0d7_KjU() : j10;
        long jM12775getSecondary0d7_KjU = (i6 & 32) != 0 ? ColorLightTokens.INSTANCE.m12775getSecondary0d7_KjU() : j11;
        long jM12758getOnSecondary0d7_KjU = (i6 & 64) != 0 ? ColorLightTokens.INSTANCE.m12758getOnSecondary0d7_KjU() : j12;
        long jM12776getSecondaryContainer0d7_KjU = (i6 & 128) != 0 ? ColorLightTokens.INSTANCE.m12776getSecondaryContainer0d7_KjU() : j13;
        long j42 = jM12770getPrimary0d7_KjU;
        long jM12759getOnSecondaryContainer0d7_KjU = (i6 & 256) != 0 ? ColorLightTokens.INSTANCE.m12759getOnSecondaryContainer0d7_KjU() : j14;
        long jM12789getTertiary0d7_KjU = (i6 & 512) != 0 ? ColorLightTokens.INSTANCE.m12789getTertiary0d7_KjU() : j15;
        long jM12764getOnTertiary0d7_KjU = (i6 & 1024) != 0 ? ColorLightTokens.INSTANCE.m12764getOnTertiary0d7_KjU() : j16;
        long jM12790getTertiaryContainer0d7_KjU = (i6 & 2048) != 0 ? ColorLightTokens.INSTANCE.m12790getTertiaryContainer0d7_KjU() : j17;
        long jM12765getOnTertiaryContainer0d7_KjU = (i6 & 4096) != 0 ? ColorLightTokens.INSTANCE.m12765getOnTertiaryContainer0d7_KjU() : j18;
        long jM12745getBackground0d7_KjU = (i6 & 8192) != 0 ? ColorLightTokens.INSTANCE.m12745getBackground0d7_KjU() : j19;
        long jM12751getOnBackground0d7_KjU = (i6 & 16384) != 0 ? ColorLightTokens.INSTANCE.m12751getOnBackground0d7_KjU() : j20;
        long jM12779getSurface0d7_KjU = (i6 & 32768) != 0 ? ColorLightTokens.INSTANCE.m12779getSurface0d7_KjU() : j21;
        long jM12762getOnSurface0d7_KjU = (i6 & 65536) != 0 ? ColorLightTokens.INSTANCE.m12762getOnSurface0d7_KjU() : j22;
        long jM12788getSurfaceVariant0d7_KjU = (i6 & 131072) != 0 ? ColorLightTokens.INSTANCE.m12788getSurfaceVariant0d7_KjU() : j23;
        long jM12763getOnSurfaceVariant0d7_KjU = (i6 & 262144) != 0 ? ColorLightTokens.INSTANCE.m12763getOnSurfaceVariant0d7_KjU() : j24;
        long j43 = (i6 & 524288) != 0 ? j42 : j25;
        long jM12750getInverseSurface0d7_KjU = (i6 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m12750getInverseSurface0d7_KjU() : j26;
        long jM12748getInverseOnSurface0d7_KjU = (i6 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m12748getInverseOnSurface0d7_KjU() : j27;
        long jM12746getError0d7_KjU = (i6 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m12746getError0d7_KjU() : j28;
        long jM12752getOnError0d7_KjU = (i6 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m12752getOnError0d7_KjU() : j29;
        long jM12747getErrorContainer0d7_KjU = (i6 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m12747getErrorContainer0d7_KjU() : j30;
        long jM12753getOnErrorContainer0d7_KjU = (i6 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m12753getOnErrorContainer0d7_KjU() : j31;
        long jM12768getOutline0d7_KjU = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m12768getOutline0d7_KjU() : j32;
        long jM12769getOutlineVariant0d7_KjU = (i6 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m12769getOutlineVariant0d7_KjU() : j33;
        long jM12774getScrim0d7_KjU = (i6 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m12774getScrim0d7_KjU() : j34;
        long jM12780getSurfaceBright0d7_KjU = (i6 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m12780getSurfaceBright0d7_KjU() : j35;
        long jM12781getSurfaceContainer0d7_KjU = (i6 & BasicMeasure.EXACTLY) != 0 ? ColorLightTokens.INSTANCE.m12781getSurfaceContainer0d7_KjU() : j36;
        long jM12782getSurfaceContainerHigh0d7_KjU = (i6 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m12782getSurfaceContainerHigh0d7_KjU() : j37;
        long jM12783getSurfaceContainerHighest0d7_KjU = (i7 & 1) != 0 ? ColorLightTokens.INSTANCE.m12783getSurfaceContainerHighest0d7_KjU() : j38;
        long jM12784getSurfaceContainerLow0d7_KjU = (i7 & 2) != 0 ? ColorLightTokens.INSTANCE.m12784getSurfaceContainerLow0d7_KjU() : j39;
        long jM12785getSurfaceContainerLowest0d7_KjU = (i7 & 4) != 0 ? ColorLightTokens.INSTANCE.m12785getSurfaceContainerLowest0d7_KjU() : j40;
        if ((i7 & 8) != 0) {
            j41 = ColorLightTokens.INSTANCE.m12786getSurfaceDim0d7_KjU();
        }
        return m11594lightColorSchemeCXl9yA(j42, jM12754getOnPrimary0d7_KjU, jM12771getPrimaryContainer0d7_KjU, jM12755getOnPrimaryContainer0d7_KjU, jM12749getInversePrimary0d7_KjU, jM12775getSecondary0d7_KjU, jM12758getOnSecondary0d7_KjU, jM12776getSecondaryContainer0d7_KjU, jM12759getOnSecondaryContainer0d7_KjU, jM12789getTertiary0d7_KjU, jM12764getOnTertiary0d7_KjU, jM12790getTertiaryContainer0d7_KjU, jM12765getOnTertiaryContainer0d7_KjU, jM12745getBackground0d7_KjU, jM12751getOnBackground0d7_KjU, jM12779getSurface0d7_KjU, jM12762getOnSurface0d7_KjU, jM12788getSurfaceVariant0d7_KjU, jM12763getOnSurfaceVariant0d7_KjU, j43, jM12750getInverseSurface0d7_KjU, jM12748getInverseOnSurface0d7_KjU, jM12746getError0d7_KjU, jM12752getOnError0d7_KjU, jM12747getErrorContainer0d7_KjU, jM12753getOnErrorContainer0d7_KjU, jM12768getOutline0d7_KjU, jM12769getOutlineVariant0d7_KjU, jM12774getScrim0d7_KjU, jM12780getSurfaceBright0d7_KjU, jM12781getSurfaceContainer0d7_KjU, jM12782getSurfaceContainerHigh0d7_KjU, jM12783getSurfaceContainerHighest0d7_KjU, jM12784getSurfaceContainerLow0d7_KjU, jM12785getSurfaceContainerLowest0d7_KjU, j41);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m11596lightColorSchemeG1PFcw(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34) {
        return m11595lightColorSchemeCXl9yA$default(j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m11597lightColorSchemeG1PFcw$default(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, int i6, Object obj) {
        long jM12770getPrimary0d7_KjU = (i6 & 1) != 0 ? ColorLightTokens.INSTANCE.m12770getPrimary0d7_KjU() : j6;
        long jM12754getOnPrimary0d7_KjU = (i6 & 2) != 0 ? ColorLightTokens.INSTANCE.m12754getOnPrimary0d7_KjU() : j7;
        long jM12771getPrimaryContainer0d7_KjU = (i6 & 4) != 0 ? ColorLightTokens.INSTANCE.m12771getPrimaryContainer0d7_KjU() : j8;
        long jM12755getOnPrimaryContainer0d7_KjU = (i6 & 8) != 0 ? ColorLightTokens.INSTANCE.m12755getOnPrimaryContainer0d7_KjU() : j9;
        long jM12749getInversePrimary0d7_KjU = (i6 & 16) != 0 ? ColorLightTokens.INSTANCE.m12749getInversePrimary0d7_KjU() : j10;
        long jM12775getSecondary0d7_KjU = (i6 & 32) != 0 ? ColorLightTokens.INSTANCE.m12775getSecondary0d7_KjU() : j11;
        long jM12758getOnSecondary0d7_KjU = (i6 & 64) != 0 ? ColorLightTokens.INSTANCE.m12758getOnSecondary0d7_KjU() : j12;
        long jM12776getSecondaryContainer0d7_KjU = (i6 & 128) != 0 ? ColorLightTokens.INSTANCE.m12776getSecondaryContainer0d7_KjU() : j13;
        long j35 = jM12770getPrimary0d7_KjU;
        long jM12759getOnSecondaryContainer0d7_KjU = (i6 & 256) != 0 ? ColorLightTokens.INSTANCE.m12759getOnSecondaryContainer0d7_KjU() : j14;
        long jM12789getTertiary0d7_KjU = (i6 & 512) != 0 ? ColorLightTokens.INSTANCE.m12789getTertiary0d7_KjU() : j15;
        long jM12764getOnTertiary0d7_KjU = (i6 & 1024) != 0 ? ColorLightTokens.INSTANCE.m12764getOnTertiary0d7_KjU() : j16;
        long jM12790getTertiaryContainer0d7_KjU = (i6 & 2048) != 0 ? ColorLightTokens.INSTANCE.m12790getTertiaryContainer0d7_KjU() : j17;
        long jM12765getOnTertiaryContainer0d7_KjU = (i6 & 4096) != 0 ? ColorLightTokens.INSTANCE.m12765getOnTertiaryContainer0d7_KjU() : j18;
        long jM12745getBackground0d7_KjU = (i6 & 8192) != 0 ? ColorLightTokens.INSTANCE.m12745getBackground0d7_KjU() : j19;
        long jM12751getOnBackground0d7_KjU = (i6 & 16384) != 0 ? ColorLightTokens.INSTANCE.m12751getOnBackground0d7_KjU() : j20;
        long jM12779getSurface0d7_KjU = (i6 & 32768) != 0 ? ColorLightTokens.INSTANCE.m12779getSurface0d7_KjU() : j21;
        long jM12762getOnSurface0d7_KjU = (i6 & 65536) != 0 ? ColorLightTokens.INSTANCE.m12762getOnSurface0d7_KjU() : j22;
        long jM12788getSurfaceVariant0d7_KjU = (i6 & 131072) != 0 ? ColorLightTokens.INSTANCE.m12788getSurfaceVariant0d7_KjU() : j23;
        long jM12763getOnSurfaceVariant0d7_KjU = (i6 & 262144) != 0 ? ColorLightTokens.INSTANCE.m12763getOnSurfaceVariant0d7_KjU() : j24;
        long j36 = (i6 & 524288) != 0 ? j35 : j25;
        long jM12750getInverseSurface0d7_KjU = (i6 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m12750getInverseSurface0d7_KjU() : j26;
        long jM12748getInverseOnSurface0d7_KjU = (i6 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m12748getInverseOnSurface0d7_KjU() : j27;
        long jM12746getError0d7_KjU = (i6 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m12746getError0d7_KjU() : j28;
        long jM12752getOnError0d7_KjU = (i6 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m12752getOnError0d7_KjU() : j29;
        long jM12747getErrorContainer0d7_KjU = (i6 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m12747getErrorContainer0d7_KjU() : j30;
        long jM12753getOnErrorContainer0d7_KjU = (i6 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m12753getOnErrorContainer0d7_KjU() : j31;
        long jM12768getOutline0d7_KjU = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m12768getOutline0d7_KjU() : j32;
        long jM12769getOutlineVariant0d7_KjU = (i6 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m12769getOutlineVariant0d7_KjU() : j33;
        if ((i6 & 268435456) != 0) {
            j34 = ColorLightTokens.INSTANCE.m12774getScrim0d7_KjU();
        }
        return m11596lightColorSchemeG1PFcw(j35, jM12754getOnPrimary0d7_KjU, jM12771getPrimaryContainer0d7_KjU, jM12755getOnPrimaryContainer0d7_KjU, jM12749getInversePrimary0d7_KjU, jM12775getSecondary0d7_KjU, jM12758getOnSecondary0d7_KjU, jM12776getSecondaryContainer0d7_KjU, jM12759getOnSecondaryContainer0d7_KjU, jM12789getTertiary0d7_KjU, jM12764getOnTertiary0d7_KjU, jM12790getTertiaryContainer0d7_KjU, jM12765getOnTertiaryContainer0d7_KjU, jM12745getBackground0d7_KjU, jM12751getOnBackground0d7_KjU, jM12779getSurface0d7_KjU, jM12762getOnSurface0d7_KjU, jM12788getSurfaceVariant0d7_KjU, jM12763getOnSurfaceVariant0d7_KjU, j36, jM12750getInverseSurface0d7_KjU, jM12748getInverseOnSurface0d7_KjU, jM12746getError0d7_KjU, jM12752getOnError0d7_KjU, jM12747getErrorContainer0d7_KjU, jM12753getOnErrorContainer0d7_KjU, jM12768getOutline0d7_KjU, jM12769getOutlineVariant0d7_KjU, j34);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m11598surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f6) {
        if (C2452Dp.m16489equalsimpl0(f6, C2452Dp.m16484constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m13944compositeOverOWjLjI(Color.m13898copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
