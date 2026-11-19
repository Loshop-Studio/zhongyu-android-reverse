package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\b\u0010<\u001a\u00020\u0004H\u0000\u001a´\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u00102\u001aø\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b?\u0010;\u001a&\u0010@\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020BH\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001e\u0010I\u001a\u00020\u000b*\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m13413d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "value", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "expressiveLightColorScheme", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1011:1\n708#2:1012\n696#2:1013\n77#3:1014\n77#3:1015\n148#4:1016\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n879#1:1012\n879#1:1013\n880#1:1014\n897#1:1015\n916#1:1016\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0<ColorScheme>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ColorScheme invoke() {
            return ColorSchemeKt.m19105lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final long m19097applyTonalElevationRFCenO8(ColorScheme colorScheme, long j9, float f10, Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i9, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m21410equalsimpl0(j9, colorScheme.getSurface()) && zBooleanValue) {
            j9 = m19108surfaceColorAtElevation3ABfNKs(colorScheme, f10);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j9;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m19098contentColorFor4WTKRHQ(ColorScheme colorScheme, long j9) {
        return Color.m21410equalsimpl0(j9, colorScheme.getPrimary()) ? colorScheme.getOnPrimary() : Color.m21410equalsimpl0(j9, colorScheme.getSecondary()) ? colorScheme.getOnSecondary() : Color.m21410equalsimpl0(j9, colorScheme.getTertiary()) ? colorScheme.getOnTertiary() : Color.m21410equalsimpl0(j9, colorScheme.getBackground()) ? colorScheme.getOnBackground() : Color.m21410equalsimpl0(j9, colorScheme.getError()) ? colorScheme.getOnError() : Color.m21410equalsimpl0(j9, colorScheme.getPrimaryContainer()) ? colorScheme.getOnPrimaryContainer() : Color.m21410equalsimpl0(j9, colorScheme.getSecondaryContainer()) ? colorScheme.getOnSecondaryContainer() : Color.m21410equalsimpl0(j9, colorScheme.getTertiaryContainer()) ? colorScheme.getOnTertiaryContainer() : Color.m21410equalsimpl0(j9, colorScheme.getErrorContainer()) ? colorScheme.getOnErrorContainer() : Color.m21410equalsimpl0(j9, colorScheme.getInverseSurface()) ? colorScheme.getInverseOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurface()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceVariant()) ? colorScheme.getOnSurfaceVariant() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceBright()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceContainer()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceContainerHigh()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceContainerHighest()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceContainerLow()) ? colorScheme.getOnSurface() : Color.m21410equalsimpl0(j9, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : Color.INSTANCE.m21445getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m19099contentColorForek8zF_U(long j9, Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i9, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM19098contentColorFor4WTKRHQ = m19098contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j9);
        if (jM19098contentColorFor4WTKRHQ == 16) {
            jM19098contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m21419unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM19098contentColorFor4WTKRHQ;
    }

    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m19100darkColorSchemeCXl9yA(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44) {
        return new ColorScheme(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j44, j39, j40, j41, j42, j43, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m19101darkColorSchemeCXl9yA$default(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i9, int i10, Object obj) {
        long jM20232getPrimary0d7_KjU = (i9 & 1) != 0 ? ColorDarkTokens.INSTANCE.m20232getPrimary0d7_KjU() : j9;
        long jM20216getOnPrimary0d7_KjU = (i9 & 2) != 0 ? ColorDarkTokens.INSTANCE.m20216getOnPrimary0d7_KjU() : j10;
        long jM20233getPrimaryContainer0d7_KjU = (i9 & 4) != 0 ? ColorDarkTokens.INSTANCE.m20233getPrimaryContainer0d7_KjU() : j11;
        long jM20217getOnPrimaryContainer0d7_KjU = (i9 & 8) != 0 ? ColorDarkTokens.INSTANCE.m20217getOnPrimaryContainer0d7_KjU() : j12;
        long jM20211getInversePrimary0d7_KjU = (i9 & 16) != 0 ? ColorDarkTokens.INSTANCE.m20211getInversePrimary0d7_KjU() : j13;
        long jM20237getSecondary0d7_KjU = (i9 & 32) != 0 ? ColorDarkTokens.INSTANCE.m20237getSecondary0d7_KjU() : j14;
        long jM20220getOnSecondary0d7_KjU = (i9 & 64) != 0 ? ColorDarkTokens.INSTANCE.m20220getOnSecondary0d7_KjU() : j15;
        long jM20238getSecondaryContainer0d7_KjU = (i9 & 128) != 0 ? ColorDarkTokens.INSTANCE.m20238getSecondaryContainer0d7_KjU() : j16;
        long j45 = jM20232getPrimary0d7_KjU;
        long jM20221getOnSecondaryContainer0d7_KjU = (i9 & 256) != 0 ? ColorDarkTokens.INSTANCE.m20221getOnSecondaryContainer0d7_KjU() : j17;
        long jM20251getTertiary0d7_KjU = (i9 & 512) != 0 ? ColorDarkTokens.INSTANCE.m20251getTertiary0d7_KjU() : j18;
        long jM20226getOnTertiary0d7_KjU = (i9 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m20226getOnTertiary0d7_KjU() : j19;
        long jM20252getTertiaryContainer0d7_KjU = (i9 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m20252getTertiaryContainer0d7_KjU() : j20;
        long jM20227getOnTertiaryContainer0d7_KjU = (i9 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m20227getOnTertiaryContainer0d7_KjU() : j21;
        long jM20207getBackground0d7_KjU = (i9 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m20207getBackground0d7_KjU() : j22;
        long jM20213getOnBackground0d7_KjU = (i9 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m20213getOnBackground0d7_KjU() : j23;
        long jM20241getSurface0d7_KjU = (i9 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m20241getSurface0d7_KjU() : j24;
        long jM20224getOnSurface0d7_KjU = (i9 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m20224getOnSurface0d7_KjU() : j25;
        long jM20250getSurfaceVariant0d7_KjU = (i9 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m20250getSurfaceVariant0d7_KjU() : j26;
        long jM20225getOnSurfaceVariant0d7_KjU = (i9 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m20225getOnSurfaceVariant0d7_KjU() : j27;
        long j46 = (i9 & 524288) != 0 ? j45 : j28;
        long jM20212getInverseSurface0d7_KjU = (i9 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m20212getInverseSurface0d7_KjU() : j29;
        long jM20210getInverseOnSurface0d7_KjU = (i9 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m20210getInverseOnSurface0d7_KjU() : j30;
        long jM20208getError0d7_KjU = (i9 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m20208getError0d7_KjU() : j31;
        long jM20214getOnError0d7_KjU = (i9 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m20214getOnError0d7_KjU() : j32;
        long jM20209getErrorContainer0d7_KjU = (i9 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m20209getErrorContainer0d7_KjU() : j33;
        long jM20215getOnErrorContainer0d7_KjU = (i9 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m20215getOnErrorContainer0d7_KjU() : j34;
        long jM20230getOutline0d7_KjU = (i9 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m20230getOutline0d7_KjU() : j35;
        long jM20231getOutlineVariant0d7_KjU = (i9 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m20231getOutlineVariant0d7_KjU() : j36;
        long jM20236getScrim0d7_KjU = (i9 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m20236getScrim0d7_KjU() : j37;
        long jM20242getSurfaceBright0d7_KjU = (i9 & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m20242getSurfaceBright0d7_KjU() : j38;
        long jM20243getSurfaceContainer0d7_KjU = (i9 & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m20243getSurfaceContainer0d7_KjU() : j39;
        long jM20244getSurfaceContainerHigh0d7_KjU = (i9 & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m20244getSurfaceContainerHigh0d7_KjU() : j40;
        long jM20245getSurfaceContainerHighest0d7_KjU = (i10 & 1) != 0 ? ColorDarkTokens.INSTANCE.m20245getSurfaceContainerHighest0d7_KjU() : j41;
        long jM20246getSurfaceContainerLow0d7_KjU = (i10 & 2) != 0 ? ColorDarkTokens.INSTANCE.m20246getSurfaceContainerLow0d7_KjU() : j42;
        long jM20247getSurfaceContainerLowest0d7_KjU = (i10 & 4) != 0 ? ColorDarkTokens.INSTANCE.m20247getSurfaceContainerLowest0d7_KjU() : j43;
        if ((i10 & 8) != 0) {
            j44 = ColorDarkTokens.INSTANCE.m20248getSurfaceDim0d7_KjU();
        }
        return m19100darkColorSchemeCXl9yA(j45, jM20216getOnPrimary0d7_KjU, jM20233getPrimaryContainer0d7_KjU, jM20217getOnPrimaryContainer0d7_KjU, jM20211getInversePrimary0d7_KjU, jM20237getSecondary0d7_KjU, jM20220getOnSecondary0d7_KjU, jM20238getSecondaryContainer0d7_KjU, jM20221getOnSecondaryContainer0d7_KjU, jM20251getTertiary0d7_KjU, jM20226getOnTertiary0d7_KjU, jM20252getTertiaryContainer0d7_KjU, jM20227getOnTertiaryContainer0d7_KjU, jM20207getBackground0d7_KjU, jM20213getOnBackground0d7_KjU, jM20241getSurface0d7_KjU, jM20224getOnSurface0d7_KjU, jM20250getSurfaceVariant0d7_KjU, jM20225getOnSurfaceVariant0d7_KjU, j46, jM20212getInverseSurface0d7_KjU, jM20210getInverseOnSurface0d7_KjU, jM20208getError0d7_KjU, jM20214getOnError0d7_KjU, jM20209getErrorContainer0d7_KjU, jM20215getOnErrorContainer0d7_KjU, jM20230getOutline0d7_KjU, jM20231getOutlineVariant0d7_KjU, jM20236getScrim0d7_KjU, jM20242getSurfaceBright0d7_KjU, jM20243getSurfaceContainer0d7_KjU, jM20244getSurfaceContainerHigh0d7_KjU, jM20245getSurfaceContainerHighest0d7_KjU, jM20246getSurfaceContainerLow0d7_KjU, jM20247getSurfaceContainerLowest0d7_KjU, j44);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m19102darkColorSchemeG1PFcw(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return m19101darkColorSchemeCXl9yA$default(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m19103darkColorSchemeG1PFcw$default(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i9, Object obj) {
        long jM20232getPrimary0d7_KjU = (i9 & 1) != 0 ? ColorDarkTokens.INSTANCE.m20232getPrimary0d7_KjU() : j9;
        long jM20216getOnPrimary0d7_KjU = (i9 & 2) != 0 ? ColorDarkTokens.INSTANCE.m20216getOnPrimary0d7_KjU() : j10;
        long jM20233getPrimaryContainer0d7_KjU = (i9 & 4) != 0 ? ColorDarkTokens.INSTANCE.m20233getPrimaryContainer0d7_KjU() : j11;
        long jM20217getOnPrimaryContainer0d7_KjU = (i9 & 8) != 0 ? ColorDarkTokens.INSTANCE.m20217getOnPrimaryContainer0d7_KjU() : j12;
        long jM20211getInversePrimary0d7_KjU = (i9 & 16) != 0 ? ColorDarkTokens.INSTANCE.m20211getInversePrimary0d7_KjU() : j13;
        long jM20237getSecondary0d7_KjU = (i9 & 32) != 0 ? ColorDarkTokens.INSTANCE.m20237getSecondary0d7_KjU() : j14;
        long jM20220getOnSecondary0d7_KjU = (i9 & 64) != 0 ? ColorDarkTokens.INSTANCE.m20220getOnSecondary0d7_KjU() : j15;
        long jM20238getSecondaryContainer0d7_KjU = (i9 & 128) != 0 ? ColorDarkTokens.INSTANCE.m20238getSecondaryContainer0d7_KjU() : j16;
        long j38 = jM20232getPrimary0d7_KjU;
        long jM20221getOnSecondaryContainer0d7_KjU = (i9 & 256) != 0 ? ColorDarkTokens.INSTANCE.m20221getOnSecondaryContainer0d7_KjU() : j17;
        long jM20251getTertiary0d7_KjU = (i9 & 512) != 0 ? ColorDarkTokens.INSTANCE.m20251getTertiary0d7_KjU() : j18;
        long jM20226getOnTertiary0d7_KjU = (i9 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m20226getOnTertiary0d7_KjU() : j19;
        long jM20252getTertiaryContainer0d7_KjU = (i9 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m20252getTertiaryContainer0d7_KjU() : j20;
        long jM20227getOnTertiaryContainer0d7_KjU = (i9 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m20227getOnTertiaryContainer0d7_KjU() : j21;
        long jM20207getBackground0d7_KjU = (i9 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m20207getBackground0d7_KjU() : j22;
        long jM20213getOnBackground0d7_KjU = (i9 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m20213getOnBackground0d7_KjU() : j23;
        long jM20241getSurface0d7_KjU = (i9 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m20241getSurface0d7_KjU() : j24;
        long jM20224getOnSurface0d7_KjU = (i9 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m20224getOnSurface0d7_KjU() : j25;
        long jM20250getSurfaceVariant0d7_KjU = (i9 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m20250getSurfaceVariant0d7_KjU() : j26;
        long jM20225getOnSurfaceVariant0d7_KjU = (i9 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m20225getOnSurfaceVariant0d7_KjU() : j27;
        long j39 = (i9 & 524288) != 0 ? j38 : j28;
        long jM20212getInverseSurface0d7_KjU = (i9 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m20212getInverseSurface0d7_KjU() : j29;
        long jM20210getInverseOnSurface0d7_KjU = (i9 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m20210getInverseOnSurface0d7_KjU() : j30;
        long jM20208getError0d7_KjU = (i9 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m20208getError0d7_KjU() : j31;
        long jM20214getOnError0d7_KjU = (i9 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m20214getOnError0d7_KjU() : j32;
        long jM20209getErrorContainer0d7_KjU = (i9 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m20209getErrorContainer0d7_KjU() : j33;
        long jM20215getOnErrorContainer0d7_KjU = (i9 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m20215getOnErrorContainer0d7_KjU() : j34;
        long jM20230getOutline0d7_KjU = (i9 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m20230getOutline0d7_KjU() : j35;
        long jM20231getOutlineVariant0d7_KjU = (i9 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m20231getOutlineVariant0d7_KjU() : j36;
        if ((i9 & 268435456) != 0) {
            j37 = ColorDarkTokens.INSTANCE.m20236getScrim0d7_KjU();
        }
        return m19102darkColorSchemeG1PFcw(j38, jM20216getOnPrimary0d7_KjU, jM20233getPrimaryContainer0d7_KjU, jM20217getOnPrimaryContainer0d7_KjU, jM20211getInversePrimary0d7_KjU, jM20237getSecondary0d7_KjU, jM20220getOnSecondary0d7_KjU, jM20238getSecondaryContainer0d7_KjU, jM20221getOnSecondaryContainer0d7_KjU, jM20251getTertiary0d7_KjU, jM20226getOnTertiary0d7_KjU, jM20252getTertiaryContainer0d7_KjU, jM20227getOnTertiaryContainer0d7_KjU, jM20207getBackground0d7_KjU, jM20213getOnBackground0d7_KjU, jM20241getSurface0d7_KjU, jM20224getOnSurface0d7_KjU, jM20250getSurfaceVariant0d7_KjU, jM20225getOnSurfaceVariant0d7_KjU, j39, jM20212getInverseSurface0d7_KjU, jM20210getInverseOnSurface0d7_KjU, jM20208getError0d7_KjU, jM20214getOnError0d7_KjU, jM20209getErrorContainer0d7_KjU, jM20215getOnErrorContainer0d7_KjU, jM20230getOutline0d7_KjU, jM20231getOutlineVariant0d7_KjU, j37);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m19105lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m20591getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m20604getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m20604getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
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
                return Color.INSTANCE.m21445getUnspecified0d7_KjU();
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
    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i9) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i9, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m19104lightColorSchemeCXl9yA(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44) {
        return new ColorScheme(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j44, j39, j40, j41, j42, j43, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m19105lightColorSchemeCXl9yA$default(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i9, int i10, Object obj) {
        long jM20280getPrimary0d7_KjU = (i9 & 1) != 0 ? ColorLightTokens.INSTANCE.m20280getPrimary0d7_KjU() : j9;
        long jM20264getOnPrimary0d7_KjU = (i9 & 2) != 0 ? ColorLightTokens.INSTANCE.m20264getOnPrimary0d7_KjU() : j10;
        long jM20281getPrimaryContainer0d7_KjU = (i9 & 4) != 0 ? ColorLightTokens.INSTANCE.m20281getPrimaryContainer0d7_KjU() : j11;
        long jM20265getOnPrimaryContainer0d7_KjU = (i9 & 8) != 0 ? ColorLightTokens.INSTANCE.m20265getOnPrimaryContainer0d7_KjU() : j12;
        long jM20259getInversePrimary0d7_KjU = (i9 & 16) != 0 ? ColorLightTokens.INSTANCE.m20259getInversePrimary0d7_KjU() : j13;
        long jM20285getSecondary0d7_KjU = (i9 & 32) != 0 ? ColorLightTokens.INSTANCE.m20285getSecondary0d7_KjU() : j14;
        long jM20268getOnSecondary0d7_KjU = (i9 & 64) != 0 ? ColorLightTokens.INSTANCE.m20268getOnSecondary0d7_KjU() : j15;
        long jM20286getSecondaryContainer0d7_KjU = (i9 & 128) != 0 ? ColorLightTokens.INSTANCE.m20286getSecondaryContainer0d7_KjU() : j16;
        long j45 = jM20280getPrimary0d7_KjU;
        long jM20269getOnSecondaryContainer0d7_KjU = (i9 & 256) != 0 ? ColorLightTokens.INSTANCE.m20269getOnSecondaryContainer0d7_KjU() : j17;
        long jM20299getTertiary0d7_KjU = (i9 & 512) != 0 ? ColorLightTokens.INSTANCE.m20299getTertiary0d7_KjU() : j18;
        long jM20274getOnTertiary0d7_KjU = (i9 & 1024) != 0 ? ColorLightTokens.INSTANCE.m20274getOnTertiary0d7_KjU() : j19;
        long jM20300getTertiaryContainer0d7_KjU = (i9 & 2048) != 0 ? ColorLightTokens.INSTANCE.m20300getTertiaryContainer0d7_KjU() : j20;
        long jM20275getOnTertiaryContainer0d7_KjU = (i9 & 4096) != 0 ? ColorLightTokens.INSTANCE.m20275getOnTertiaryContainer0d7_KjU() : j21;
        long jM20255getBackground0d7_KjU = (i9 & 8192) != 0 ? ColorLightTokens.INSTANCE.m20255getBackground0d7_KjU() : j22;
        long jM20261getOnBackground0d7_KjU = (i9 & 16384) != 0 ? ColorLightTokens.INSTANCE.m20261getOnBackground0d7_KjU() : j23;
        long jM20289getSurface0d7_KjU = (i9 & 32768) != 0 ? ColorLightTokens.INSTANCE.m20289getSurface0d7_KjU() : j24;
        long jM20272getOnSurface0d7_KjU = (i9 & 65536) != 0 ? ColorLightTokens.INSTANCE.m20272getOnSurface0d7_KjU() : j25;
        long jM20298getSurfaceVariant0d7_KjU = (i9 & 131072) != 0 ? ColorLightTokens.INSTANCE.m20298getSurfaceVariant0d7_KjU() : j26;
        long jM20273getOnSurfaceVariant0d7_KjU = (i9 & 262144) != 0 ? ColorLightTokens.INSTANCE.m20273getOnSurfaceVariant0d7_KjU() : j27;
        long j46 = (i9 & 524288) != 0 ? j45 : j28;
        long jM20260getInverseSurface0d7_KjU = (i9 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m20260getInverseSurface0d7_KjU() : j29;
        long jM20258getInverseOnSurface0d7_KjU = (i9 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m20258getInverseOnSurface0d7_KjU() : j30;
        long jM20256getError0d7_KjU = (i9 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m20256getError0d7_KjU() : j31;
        long jM20262getOnError0d7_KjU = (i9 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m20262getOnError0d7_KjU() : j32;
        long jM20257getErrorContainer0d7_KjU = (i9 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m20257getErrorContainer0d7_KjU() : j33;
        long jM20263getOnErrorContainer0d7_KjU = (i9 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m20263getOnErrorContainer0d7_KjU() : j34;
        long jM20278getOutline0d7_KjU = (i9 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m20278getOutline0d7_KjU() : j35;
        long jM20279getOutlineVariant0d7_KjU = (i9 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m20279getOutlineVariant0d7_KjU() : j36;
        long jM20284getScrim0d7_KjU = (i9 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m20284getScrim0d7_KjU() : j37;
        long jM20290getSurfaceBright0d7_KjU = (i9 & 536870912) != 0 ? ColorLightTokens.INSTANCE.m20290getSurfaceBright0d7_KjU() : j38;
        long jM20291getSurfaceContainer0d7_KjU = (i9 & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m20291getSurfaceContainer0d7_KjU() : j39;
        long jM20292getSurfaceContainerHigh0d7_KjU = (i9 & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m20292getSurfaceContainerHigh0d7_KjU() : j40;
        long jM20293getSurfaceContainerHighest0d7_KjU = (i10 & 1) != 0 ? ColorLightTokens.INSTANCE.m20293getSurfaceContainerHighest0d7_KjU() : j41;
        long jM20294getSurfaceContainerLow0d7_KjU = (i10 & 2) != 0 ? ColorLightTokens.INSTANCE.m20294getSurfaceContainerLow0d7_KjU() : j42;
        long jM20295getSurfaceContainerLowest0d7_KjU = (i10 & 4) != 0 ? ColorLightTokens.INSTANCE.m20295getSurfaceContainerLowest0d7_KjU() : j43;
        if ((i10 & 8) != 0) {
            j44 = ColorLightTokens.INSTANCE.m20296getSurfaceDim0d7_KjU();
        }
        return m19104lightColorSchemeCXl9yA(j45, jM20264getOnPrimary0d7_KjU, jM20281getPrimaryContainer0d7_KjU, jM20265getOnPrimaryContainer0d7_KjU, jM20259getInversePrimary0d7_KjU, jM20285getSecondary0d7_KjU, jM20268getOnSecondary0d7_KjU, jM20286getSecondaryContainer0d7_KjU, jM20269getOnSecondaryContainer0d7_KjU, jM20299getTertiary0d7_KjU, jM20274getOnTertiary0d7_KjU, jM20300getTertiaryContainer0d7_KjU, jM20275getOnTertiaryContainer0d7_KjU, jM20255getBackground0d7_KjU, jM20261getOnBackground0d7_KjU, jM20289getSurface0d7_KjU, jM20272getOnSurface0d7_KjU, jM20298getSurfaceVariant0d7_KjU, jM20273getOnSurfaceVariant0d7_KjU, j46, jM20260getInverseSurface0d7_KjU, jM20258getInverseOnSurface0d7_KjU, jM20256getError0d7_KjU, jM20262getOnError0d7_KjU, jM20257getErrorContainer0d7_KjU, jM20263getOnErrorContainer0d7_KjU, jM20278getOutline0d7_KjU, jM20279getOutlineVariant0d7_KjU, jM20284getScrim0d7_KjU, jM20290getSurfaceBright0d7_KjU, jM20291getSurfaceContainer0d7_KjU, jM20292getSurfaceContainerHigh0d7_KjU, jM20293getSurfaceContainerHighest0d7_KjU, jM20294getSurfaceContainerLow0d7_KjU, jM20295getSurfaceContainerLowest0d7_KjU, j44);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m19106lightColorSchemeG1PFcw(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37) {
        return m19105lightColorSchemeCXl9yA$default(j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m19107lightColorSchemeG1PFcw$default(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, int i9, Object obj) {
        long jM20280getPrimary0d7_KjU = (i9 & 1) != 0 ? ColorLightTokens.INSTANCE.m20280getPrimary0d7_KjU() : j9;
        long jM20264getOnPrimary0d7_KjU = (i9 & 2) != 0 ? ColorLightTokens.INSTANCE.m20264getOnPrimary0d7_KjU() : j10;
        long jM20281getPrimaryContainer0d7_KjU = (i9 & 4) != 0 ? ColorLightTokens.INSTANCE.m20281getPrimaryContainer0d7_KjU() : j11;
        long jM20265getOnPrimaryContainer0d7_KjU = (i9 & 8) != 0 ? ColorLightTokens.INSTANCE.m20265getOnPrimaryContainer0d7_KjU() : j12;
        long jM20259getInversePrimary0d7_KjU = (i9 & 16) != 0 ? ColorLightTokens.INSTANCE.m20259getInversePrimary0d7_KjU() : j13;
        long jM20285getSecondary0d7_KjU = (i9 & 32) != 0 ? ColorLightTokens.INSTANCE.m20285getSecondary0d7_KjU() : j14;
        long jM20268getOnSecondary0d7_KjU = (i9 & 64) != 0 ? ColorLightTokens.INSTANCE.m20268getOnSecondary0d7_KjU() : j15;
        long jM20286getSecondaryContainer0d7_KjU = (i9 & 128) != 0 ? ColorLightTokens.INSTANCE.m20286getSecondaryContainer0d7_KjU() : j16;
        long j38 = jM20280getPrimary0d7_KjU;
        long jM20269getOnSecondaryContainer0d7_KjU = (i9 & 256) != 0 ? ColorLightTokens.INSTANCE.m20269getOnSecondaryContainer0d7_KjU() : j17;
        long jM20299getTertiary0d7_KjU = (i9 & 512) != 0 ? ColorLightTokens.INSTANCE.m20299getTertiary0d7_KjU() : j18;
        long jM20274getOnTertiary0d7_KjU = (i9 & 1024) != 0 ? ColorLightTokens.INSTANCE.m20274getOnTertiary0d7_KjU() : j19;
        long jM20300getTertiaryContainer0d7_KjU = (i9 & 2048) != 0 ? ColorLightTokens.INSTANCE.m20300getTertiaryContainer0d7_KjU() : j20;
        long jM20275getOnTertiaryContainer0d7_KjU = (i9 & 4096) != 0 ? ColorLightTokens.INSTANCE.m20275getOnTertiaryContainer0d7_KjU() : j21;
        long jM20255getBackground0d7_KjU = (i9 & 8192) != 0 ? ColorLightTokens.INSTANCE.m20255getBackground0d7_KjU() : j22;
        long jM20261getOnBackground0d7_KjU = (i9 & 16384) != 0 ? ColorLightTokens.INSTANCE.m20261getOnBackground0d7_KjU() : j23;
        long jM20289getSurface0d7_KjU = (i9 & 32768) != 0 ? ColorLightTokens.INSTANCE.m20289getSurface0d7_KjU() : j24;
        long jM20272getOnSurface0d7_KjU = (i9 & 65536) != 0 ? ColorLightTokens.INSTANCE.m20272getOnSurface0d7_KjU() : j25;
        long jM20298getSurfaceVariant0d7_KjU = (i9 & 131072) != 0 ? ColorLightTokens.INSTANCE.m20298getSurfaceVariant0d7_KjU() : j26;
        long jM20273getOnSurfaceVariant0d7_KjU = (i9 & 262144) != 0 ? ColorLightTokens.INSTANCE.m20273getOnSurfaceVariant0d7_KjU() : j27;
        long j39 = (i9 & 524288) != 0 ? j38 : j28;
        long jM20260getInverseSurface0d7_KjU = (i9 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m20260getInverseSurface0d7_KjU() : j29;
        long jM20258getInverseOnSurface0d7_KjU = (i9 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m20258getInverseOnSurface0d7_KjU() : j30;
        long jM20256getError0d7_KjU = (i9 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m20256getError0d7_KjU() : j31;
        long jM20262getOnError0d7_KjU = (i9 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m20262getOnError0d7_KjU() : j32;
        long jM20257getErrorContainer0d7_KjU = (i9 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m20257getErrorContainer0d7_KjU() : j33;
        long jM20263getOnErrorContainer0d7_KjU = (i9 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m20263getOnErrorContainer0d7_KjU() : j34;
        long jM20278getOutline0d7_KjU = (i9 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m20278getOutline0d7_KjU() : j35;
        long jM20279getOutlineVariant0d7_KjU = (i9 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m20279getOutlineVariant0d7_KjU() : j36;
        if ((i9 & 268435456) != 0) {
            j37 = ColorLightTokens.INSTANCE.m20284getScrim0d7_KjU();
        }
        return m19106lightColorSchemeG1PFcw(j38, jM20264getOnPrimary0d7_KjU, jM20281getPrimaryContainer0d7_KjU, jM20265getOnPrimaryContainer0d7_KjU, jM20259getInversePrimary0d7_KjU, jM20285getSecondary0d7_KjU, jM20268getOnSecondary0d7_KjU, jM20286getSecondaryContainer0d7_KjU, jM20269getOnSecondaryContainer0d7_KjU, jM20299getTertiary0d7_KjU, jM20274getOnTertiary0d7_KjU, jM20300getTertiaryContainer0d7_KjU, jM20275getOnTertiaryContainer0d7_KjU, jM20255getBackground0d7_KjU, jM20261getOnBackground0d7_KjU, jM20289getSurface0d7_KjU, jM20272getOnSurface0d7_KjU, jM20298getSurfaceVariant0d7_KjU, jM20273getOnSurfaceVariant0d7_KjU, j39, jM20260getInverseSurface0d7_KjU, jM20258getInverseOnSurface0d7_KjU, jM20256getError0d7_KjU, jM20262getOnError0d7_KjU, jM20257getErrorContainer0d7_KjU, jM20263getOnErrorContainer0d7_KjU, jM20278getOutline0d7_KjU, jM20279getOutlineVariant0d7_KjU, j37);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m19108surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f10) {
        if (C3115Dp.m23999equalsimpl0(f10, C3115Dp.m23994constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m21454compositeOverOWjLjI(Color.m21408copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
