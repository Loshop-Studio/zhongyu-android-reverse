package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a´\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aø\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\b\u0010<\u001a\u00020\u0004H\u0000\u001a´\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u00102\u001aø\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b?\u0010;\u001a&\u0010@\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020BH\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010G\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001e\u0010I\u001a\u00020\u000b*\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m5110d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "value", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "darkColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "expressiveLightColorScheme", "lightColorScheme", "lightColorScheme-G1PFc-w", "lightColorScheme-C-Xl9yA", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1011:1\n708#2:1012\n696#2:1013\n77#3:1014\n77#3:1015\n148#4:1016\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n879#1:1012\n879#1:1013\n880#1:1014\n897#1:1015\n916#1:1016\n*E\n"})
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;

    @NotNull
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC6469a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalColorScheme$1
        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final ColorScheme invoke() {
            return ColorSchemeKt.m8322lightColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    });

    @NotNull
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC6469a() { // from class: androidx.compose.material3.ColorSchemeKt$LocalTonalElevationEnabled$1
        @Override // p152r6.InterfaceC6469a
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final long m8314applyTonalElevationRFCenO8(@NotNull ColorScheme colorScheme, long j7, float f, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m10683equalsimpl0(j7, colorScheme.getSurface()) && zBooleanValue) {
            j7 = m8325surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j7;
    }

    @Stable
    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m8315contentColorFor4WTKRHQ(@NotNull ColorScheme colorScheme, long j7) {
        return Color.m10683equalsimpl0(j7, colorScheme.getPrimary()) ? colorScheme.getOnPrimary() : Color.m10683equalsimpl0(j7, colorScheme.getSecondary()) ? colorScheme.getOnSecondary() : Color.m10683equalsimpl0(j7, colorScheme.getTertiary()) ? colorScheme.getOnTertiary() : Color.m10683equalsimpl0(j7, colorScheme.getBackground()) ? colorScheme.getOnBackground() : Color.m10683equalsimpl0(j7, colorScheme.getError()) ? colorScheme.getOnError() : Color.m10683equalsimpl0(j7, colorScheme.getPrimaryContainer()) ? colorScheme.getOnPrimaryContainer() : Color.m10683equalsimpl0(j7, colorScheme.getSecondaryContainer()) ? colorScheme.getOnSecondaryContainer() : Color.m10683equalsimpl0(j7, colorScheme.getTertiaryContainer()) ? colorScheme.getOnTertiaryContainer() : Color.m10683equalsimpl0(j7, colorScheme.getErrorContainer()) ? colorScheme.getOnErrorContainer() : Color.m10683equalsimpl0(j7, colorScheme.getInverseSurface()) ? colorScheme.getInverseOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurface()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceVariant()) ? colorScheme.getOnSurfaceVariant() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceBright()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceContainer()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceContainerHigh()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceContainerHighest()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceContainerLow()) ? colorScheme.getOnSurface() : Color.m10683equalsimpl0(j7, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : Color.INSTANCE.m10718getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m8316contentColorForek8zF_U(long j7, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        composer.startReplaceGroup(-1680936624);
        long jM8315contentColorFor4WTKRHQ = m8315contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j7);
        if (jM8315contentColorFor4WTKRHQ == 16) {
            jM8315contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m10692unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM8315contentColorFor4WTKRHQ;
    }

    @NotNull
    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m8317darkColorSchemeCXl9yA(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new ColorScheme(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j42, j37, j38, j39, j40, j41, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8318darkColorSchemeCXl9yA$default(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, int i, int i8, Object obj) {
        long jM9481getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m9481getPrimary0d7_KjU() : j7;
        long jM9465getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m9465getOnPrimary0d7_KjU() : j8;
        long jM9482getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m9482getPrimaryContainer0d7_KjU() : j9;
        long jM9466getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m9466getOnPrimaryContainer0d7_KjU() : j10;
        long jM9460getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m9460getInversePrimary0d7_KjU() : j11;
        long jM9486getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m9486getSecondary0d7_KjU() : j12;
        long jM9469getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m9469getOnSecondary0d7_KjU() : j13;
        long jM9487getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m9487getSecondaryContainer0d7_KjU() : j14;
        long j43 = jM9481getPrimary0d7_KjU;
        long jM9470getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m9470getOnSecondaryContainer0d7_KjU() : j15;
        long jM9500getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m9500getTertiary0d7_KjU() : j16;
        long jM9475getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m9475getOnTertiary0d7_KjU() : j17;
        long jM9501getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m9501getTertiaryContainer0d7_KjU() : j18;
        long jM9476getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m9476getOnTertiaryContainer0d7_KjU() : j19;
        long jM9456getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m9456getBackground0d7_KjU() : j20;
        long jM9462getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m9462getOnBackground0d7_KjU() : j21;
        long jM9490getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m9490getSurface0d7_KjU() : j22;
        long jM9473getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m9473getOnSurface0d7_KjU() : j23;
        long jM9499getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m9499getSurfaceVariant0d7_KjU() : j24;
        long jM9474getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m9474getOnSurfaceVariant0d7_KjU() : j25;
        long j44 = (i & 524288) != 0 ? j43 : j26;
        long jM9461getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m9461getInverseSurface0d7_KjU() : j27;
        long jM9459getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m9459getInverseOnSurface0d7_KjU() : j28;
        long jM9457getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m9457getError0d7_KjU() : j29;
        long jM9463getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m9463getOnError0d7_KjU() : j30;
        long jM9458getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m9458getErrorContainer0d7_KjU() : j31;
        long jM9464getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m9464getOnErrorContainer0d7_KjU() : j32;
        long jM9479getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m9479getOutline0d7_KjU() : j33;
        long jM9480getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m9480getOutlineVariant0d7_KjU() : j34;
        long jM9485getScrim0d7_KjU = (i & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m9485getScrim0d7_KjU() : j35;
        long jM9491getSurfaceBright0d7_KjU = (i & 536870912) != 0 ? ColorDarkTokens.INSTANCE.m9491getSurfaceBright0d7_KjU() : j36;
        long jM9492getSurfaceContainer0d7_KjU = (i & BasicMeasure.EXACTLY) != 0 ? ColorDarkTokens.INSTANCE.m9492getSurfaceContainer0d7_KjU() : j37;
        long jM9493getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m9493getSurfaceContainerHigh0d7_KjU() : j38;
        long jM9494getSurfaceContainerHighest0d7_KjU = (i8 & 1) != 0 ? ColorDarkTokens.INSTANCE.m9494getSurfaceContainerHighest0d7_KjU() : j39;
        long jM9495getSurfaceContainerLow0d7_KjU = (i8 & 2) != 0 ? ColorDarkTokens.INSTANCE.m9495getSurfaceContainerLow0d7_KjU() : j40;
        long jM9496getSurfaceContainerLowest0d7_KjU = (i8 & 4) != 0 ? ColorDarkTokens.INSTANCE.m9496getSurfaceContainerLowest0d7_KjU() : j41;
        if ((i8 & 8) != 0) {
            j42 = ColorDarkTokens.INSTANCE.m9497getSurfaceDim0d7_KjU();
        }
        return m8317darkColorSchemeCXl9yA(j43, jM9465getOnPrimary0d7_KjU, jM9482getPrimaryContainer0d7_KjU, jM9466getOnPrimaryContainer0d7_KjU, jM9460getInversePrimary0d7_KjU, jM9486getSecondary0d7_KjU, jM9469getOnSecondary0d7_KjU, jM9487getSecondaryContainer0d7_KjU, jM9470getOnSecondaryContainer0d7_KjU, jM9500getTertiary0d7_KjU, jM9475getOnTertiary0d7_KjU, jM9501getTertiaryContainer0d7_KjU, jM9476getOnTertiaryContainer0d7_KjU, jM9456getBackground0d7_KjU, jM9462getOnBackground0d7_KjU, jM9490getSurface0d7_KjU, jM9473getOnSurface0d7_KjU, jM9499getSurfaceVariant0d7_KjU, jM9474getOnSurfaceVariant0d7_KjU, j44, jM9461getInverseSurface0d7_KjU, jM9459getInverseOnSurface0d7_KjU, jM9457getError0d7_KjU, jM9463getOnError0d7_KjU, jM9458getErrorContainer0d7_KjU, jM9464getOnErrorContainer0d7_KjU, jM9479getOutline0d7_KjU, jM9480getOutlineVariant0d7_KjU, jM9485getScrim0d7_KjU, jM9491getSurfaceBright0d7_KjU, jM9492getSurfaceContainer0d7_KjU, jM9493getSurfaceContainerHigh0d7_KjU, jM9494getSurfaceContainerHighest0d7_KjU, jM9495getSurfaceContainerLow0d7_KjU, jM9496getSurfaceContainerLowest0d7_KjU, j42);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m8319darkColorSchemeG1PFcw(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35) {
        return m8318darkColorSchemeCXl9yA$default(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8320darkColorSchemeG1PFcw$default(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, Object obj) {
        long jM9481getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m9481getPrimary0d7_KjU() : j7;
        long jM9465getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m9465getOnPrimary0d7_KjU() : j8;
        long jM9482getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m9482getPrimaryContainer0d7_KjU() : j9;
        long jM9466getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m9466getOnPrimaryContainer0d7_KjU() : j10;
        long jM9460getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m9460getInversePrimary0d7_KjU() : j11;
        long jM9486getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m9486getSecondary0d7_KjU() : j12;
        long jM9469getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m9469getOnSecondary0d7_KjU() : j13;
        long jM9487getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m9487getSecondaryContainer0d7_KjU() : j14;
        long j36 = jM9481getPrimary0d7_KjU;
        long jM9470getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m9470getOnSecondaryContainer0d7_KjU() : j15;
        long jM9500getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m9500getTertiary0d7_KjU() : j16;
        long jM9475getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m9475getOnTertiary0d7_KjU() : j17;
        long jM9501getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m9501getTertiaryContainer0d7_KjU() : j18;
        long jM9476getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m9476getOnTertiaryContainer0d7_KjU() : j19;
        long jM9456getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m9456getBackground0d7_KjU() : j20;
        long jM9462getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m9462getOnBackground0d7_KjU() : j21;
        long jM9490getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m9490getSurface0d7_KjU() : j22;
        long jM9473getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m9473getOnSurface0d7_KjU() : j23;
        long jM9499getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m9499getSurfaceVariant0d7_KjU() : j24;
        long jM9474getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m9474getOnSurfaceVariant0d7_KjU() : j25;
        long j37 = (i & 524288) != 0 ? j36 : j26;
        long jM9461getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m9461getInverseSurface0d7_KjU() : j27;
        long jM9459getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m9459getInverseOnSurface0d7_KjU() : j28;
        long jM9457getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m9457getError0d7_KjU() : j29;
        long jM9463getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m9463getOnError0d7_KjU() : j30;
        long jM9458getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m9458getErrorContainer0d7_KjU() : j31;
        long jM9464getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m9464getOnErrorContainer0d7_KjU() : j32;
        long jM9479getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorDarkTokens.INSTANCE.m9479getOutline0d7_KjU() : j33;
        long jM9480getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m9480getOutlineVariant0d7_KjU() : j34;
        if ((i & 268435456) != 0) {
            j35 = ColorDarkTokens.INSTANCE.m9485getScrim0d7_KjU();
        }
        return m8319darkColorSchemeG1PFcw(j36, jM9465getOnPrimary0d7_KjU, jM9482getPrimaryContainer0d7_KjU, jM9466getOnPrimaryContainer0d7_KjU, jM9460getInversePrimary0d7_KjU, jM9486getSecondary0d7_KjU, jM9469getOnSecondary0d7_KjU, jM9487getSecondaryContainer0d7_KjU, jM9470getOnSecondaryContainer0d7_KjU, jM9500getTertiary0d7_KjU, jM9475getOnTertiary0d7_KjU, jM9501getTertiaryContainer0d7_KjU, jM9476getOnTertiaryContainer0d7_KjU, jM9456getBackground0d7_KjU, jM9462getOnBackground0d7_KjU, jM9490getSurface0d7_KjU, jM9473getOnSurface0d7_KjU, jM9499getSurfaceVariant0d7_KjU, jM9474getOnSurfaceVariant0d7_KjU, j37, jM9461getInverseSurface0d7_KjU, jM9459getInverseOnSurface0d7_KjU, jM9457getError0d7_KjU, jM9463getOnError0d7_KjU, jM9458getErrorContainer0d7_KjU, jM9464getOnErrorContainer0d7_KjU, jM9479getOutline0d7_KjU, jM9480getOutlineVariant0d7_KjU, j35);
    }

    @NotNull
    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m8322lightColorSchemeCXl9yA$default(0L, 0L, 0L, paletteTokens.m9840getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m9853getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m9853getSecondary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15, null);
    }

    @Stable
    public static final long fromToken(@NotNull ColorScheme colorScheme, @NotNull ColorSchemeKeyTokens colorSchemeKeyTokens) {
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
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
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
                return Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getValue")
    public static final long getValue(@NotNull ColorSchemeKeyTokens colorSchemeKeyTokens, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jFromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jFromToken;
    }

    @NotNull
    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final ColorScheme m8321lightColorSchemeCXl9yA(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new ColorScheme(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j42, j37, j38, j39, j40, j41, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8322lightColorSchemeCXl9yA$default(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, int i, int i8, Object obj) {
        long jM9529getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m9529getPrimary0d7_KjU() : j7;
        long jM9513getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m9513getOnPrimary0d7_KjU() : j8;
        long jM9530getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m9530getPrimaryContainer0d7_KjU() : j9;
        long jM9514getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m9514getOnPrimaryContainer0d7_KjU() : j10;
        long jM9508getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m9508getInversePrimary0d7_KjU() : j11;
        long jM9534getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m9534getSecondary0d7_KjU() : j12;
        long jM9517getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m9517getOnSecondary0d7_KjU() : j13;
        long jM9535getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m9535getSecondaryContainer0d7_KjU() : j14;
        long j43 = jM9529getPrimary0d7_KjU;
        long jM9518getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m9518getOnSecondaryContainer0d7_KjU() : j15;
        long jM9548getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m9548getTertiary0d7_KjU() : j16;
        long jM9523getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m9523getOnTertiary0d7_KjU() : j17;
        long jM9549getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m9549getTertiaryContainer0d7_KjU() : j18;
        long jM9524getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m9524getOnTertiaryContainer0d7_KjU() : j19;
        long jM9504getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m9504getBackground0d7_KjU() : j20;
        long jM9510getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m9510getOnBackground0d7_KjU() : j21;
        long jM9538getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m9538getSurface0d7_KjU() : j22;
        long jM9521getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m9521getOnSurface0d7_KjU() : j23;
        long jM9547getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m9547getSurfaceVariant0d7_KjU() : j24;
        long jM9522getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m9522getOnSurfaceVariant0d7_KjU() : j25;
        long j44 = (i & 524288) != 0 ? j43 : j26;
        long jM9509getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m9509getInverseSurface0d7_KjU() : j27;
        long jM9507getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m9507getInverseOnSurface0d7_KjU() : j28;
        long jM9505getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m9505getError0d7_KjU() : j29;
        long jM9511getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m9511getOnError0d7_KjU() : j30;
        long jM9506getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m9506getErrorContainer0d7_KjU() : j31;
        long jM9512getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m9512getOnErrorContainer0d7_KjU() : j32;
        long jM9527getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m9527getOutline0d7_KjU() : j33;
        long jM9528getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m9528getOutlineVariant0d7_KjU() : j34;
        long jM9533getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m9533getScrim0d7_KjU() : j35;
        long jM9539getSurfaceBright0d7_KjU = (i & 536870912) != 0 ? ColorLightTokens.INSTANCE.m9539getSurfaceBright0d7_KjU() : j36;
        long jM9540getSurfaceContainer0d7_KjU = (i & BasicMeasure.EXACTLY) != 0 ? ColorLightTokens.INSTANCE.m9540getSurfaceContainer0d7_KjU() : j37;
        long jM9541getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m9541getSurfaceContainerHigh0d7_KjU() : j38;
        long jM9542getSurfaceContainerHighest0d7_KjU = (i8 & 1) != 0 ? ColorLightTokens.INSTANCE.m9542getSurfaceContainerHighest0d7_KjU() : j39;
        long jM9543getSurfaceContainerLow0d7_KjU = (i8 & 2) != 0 ? ColorLightTokens.INSTANCE.m9543getSurfaceContainerLow0d7_KjU() : j40;
        long jM9544getSurfaceContainerLowest0d7_KjU = (i8 & 4) != 0 ? ColorLightTokens.INSTANCE.m9544getSurfaceContainerLowest0d7_KjU() : j41;
        if ((i8 & 8) != 0) {
            j42 = ColorLightTokens.INSTANCE.m9545getSurfaceDim0d7_KjU();
        }
        return m8321lightColorSchemeCXl9yA(j43, jM9513getOnPrimary0d7_KjU, jM9530getPrimaryContainer0d7_KjU, jM9514getOnPrimaryContainer0d7_KjU, jM9508getInversePrimary0d7_KjU, jM9534getSecondary0d7_KjU, jM9517getOnSecondary0d7_KjU, jM9535getSecondaryContainer0d7_KjU, jM9518getOnSecondaryContainer0d7_KjU, jM9548getTertiary0d7_KjU, jM9523getOnTertiary0d7_KjU, jM9549getTertiaryContainer0d7_KjU, jM9524getOnTertiaryContainer0d7_KjU, jM9504getBackground0d7_KjU, jM9510getOnBackground0d7_KjU, jM9538getSurface0d7_KjU, jM9521getOnSurface0d7_KjU, jM9547getSurfaceVariant0d7_KjU, jM9522getOnSurfaceVariant0d7_KjU, j44, jM9509getInverseSurface0d7_KjU, jM9507getInverseOnSurface0d7_KjU, jM9505getError0d7_KjU, jM9511getOnError0d7_KjU, jM9506getErrorContainer0d7_KjU, jM9512getOnErrorContainer0d7_KjU, jM9527getOutline0d7_KjU, jM9528getOutlineVariant0d7_KjU, jM9533getScrim0d7_KjU, jM9539getSurfaceBright0d7_KjU, jM9540getSurfaceContainer0d7_KjU, jM9541getSurfaceContainerHigh0d7_KjU, jM9542getSurfaceContainerHighest0d7_KjU, jM9543getSurfaceContainerLow0d7_KjU, jM9544getSurfaceContainerLowest0d7_KjU, j42);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m8323lightColorSchemeG1PFcw(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35) {
        return m8322lightColorSchemeCXl9yA$default(j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m8324lightColorSchemeG1PFcw$default(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, Object obj) {
        long jM9529getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m9529getPrimary0d7_KjU() : j7;
        long jM9513getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m9513getOnPrimary0d7_KjU() : j8;
        long jM9530getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m9530getPrimaryContainer0d7_KjU() : j9;
        long jM9514getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m9514getOnPrimaryContainer0d7_KjU() : j10;
        long jM9508getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m9508getInversePrimary0d7_KjU() : j11;
        long jM9534getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m9534getSecondary0d7_KjU() : j12;
        long jM9517getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m9517getOnSecondary0d7_KjU() : j13;
        long jM9535getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m9535getSecondaryContainer0d7_KjU() : j14;
        long j36 = jM9529getPrimary0d7_KjU;
        long jM9518getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m9518getOnSecondaryContainer0d7_KjU() : j15;
        long jM9548getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m9548getTertiary0d7_KjU() : j16;
        long jM9523getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m9523getOnTertiary0d7_KjU() : j17;
        long jM9549getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m9549getTertiaryContainer0d7_KjU() : j18;
        long jM9524getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m9524getOnTertiaryContainer0d7_KjU() : j19;
        long jM9504getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m9504getBackground0d7_KjU() : j20;
        long jM9510getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m9510getOnBackground0d7_KjU() : j21;
        long jM9538getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m9538getSurface0d7_KjU() : j22;
        long jM9521getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m9521getOnSurface0d7_KjU() : j23;
        long jM9547getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m9547getSurfaceVariant0d7_KjU() : j24;
        long jM9522getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m9522getOnSurfaceVariant0d7_KjU() : j25;
        long j37 = (i & 524288) != 0 ? j36 : j26;
        long jM9509getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m9509getInverseSurface0d7_KjU() : j27;
        long jM9507getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m9507getInverseOnSurface0d7_KjU() : j28;
        long jM9505getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m9505getError0d7_KjU() : j29;
        long jM9511getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m9511getOnError0d7_KjU() : j30;
        long jM9506getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m9506getErrorContainer0d7_KjU() : j31;
        long jM9512getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m9512getOnErrorContainer0d7_KjU() : j32;
        long jM9527getOutline0d7_KjU = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorLightTokens.INSTANCE.m9527getOutline0d7_KjU() : j33;
        long jM9528getOutlineVariant0d7_KjU = (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m9528getOutlineVariant0d7_KjU() : j34;
        if ((i & 268435456) != 0) {
            j35 = ColorLightTokens.INSTANCE.m9533getScrim0d7_KjU();
        }
        return m8323lightColorSchemeG1PFcw(j36, jM9513getOnPrimary0d7_KjU, jM9530getPrimaryContainer0d7_KjU, jM9514getOnPrimaryContainer0d7_KjU, jM9508getInversePrimary0d7_KjU, jM9534getSecondary0d7_KjU, jM9517getOnSecondary0d7_KjU, jM9535getSecondaryContainer0d7_KjU, jM9518getOnSecondaryContainer0d7_KjU, jM9548getTertiary0d7_KjU, jM9523getOnTertiary0d7_KjU, jM9549getTertiaryContainer0d7_KjU, jM9524getOnTertiaryContainer0d7_KjU, jM9504getBackground0d7_KjU, jM9510getOnBackground0d7_KjU, jM9538getSurface0d7_KjU, jM9521getOnSurface0d7_KjU, jM9547getSurfaceVariant0d7_KjU, jM9522getOnSurfaceVariant0d7_KjU, j37, jM9509getInverseSurface0d7_KjU, jM9507getInverseOnSurface0d7_KjU, jM9505getError0d7_KjU, jM9511getOnError0d7_KjU, jM9506getErrorContainer0d7_KjU, jM9512getOnErrorContainer0d7_KjU, jM9527getOutline0d7_KjU, jM9528getOutlineVariant0d7_KjU, j35);
    }

    @Stable
    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m8325surfaceColorAtElevation3ABfNKs(@NotNull ColorScheme colorScheme, float f) {
        if (C2331Dp.m13310equalsimpl0(f, C2331Dp.m13305constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m10727compositeOverOWjLjI(Color.m10681copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
