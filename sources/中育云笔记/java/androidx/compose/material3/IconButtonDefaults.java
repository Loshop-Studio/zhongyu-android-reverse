package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m28732defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconButtonColors defaultIconButtonColorsCached$material3_release = colorScheme.getDefaultIconButtonColorsCached$material3_release();
        if (defaultIconButtonColorsCached$material3_release != null) {
            return defaultIconButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m30913getTransparent0d7_KjU(), j10, companion.m30913getTransparent0d7_KjU(), Color.m30877copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m28733defaultIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultIconToggleButtonColorsCached$material3_release();
        if (defaultIconToggleButtonColorsCached$material3_release != null) {
            return defaultIconToggleButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(companion.m30913getTransparent0d7_KjU(), j10, companion.m30913getTransparent0d7_KjU(), Color.m30877copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m30913getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconButtonColors defaultOutlinedIconButtonColorsCached$material3_release = colorScheme.getDefaultOutlinedIconButtonColorsCached$material3_release();
        if (defaultOutlinedIconButtonColorsCached$material3_release != null) {
            return defaultOutlinedIconButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m30913getTransparent0d7_KjU(), j10, companion.m30913getTransparent0d7_KjU(), Color.m30877copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultIconToggleButtonColorsCached$material3_release();
        if (defaultIconToggleButtonColorsCached$material3_release != null) {
            return defaultIconToggleButtonColorsCached$material3_release;
        }
        Color.Companion companion = Color.Companion;
        long jM30913getTransparent0d7_KjU = companion.m30913getTransparent0d7_KjU();
        long jM30913getTransparent0d7_KjU2 = companion.m30913getTransparent0d7_KjU();
        long jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM30913getTransparent0d7_KjU, j10, jM30913getTransparent0d7_KjU2, jM30877copywmQWz5c$default, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    @Composable
    public final IconButtonColors filledIconButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1857395287, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        IconButtonColors defaultFilledIconButtonColors$material3_release = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconButtonColors$material3_release;
    }

    @Composable
    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m28736filledIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = ColorSchemeKt.m28512contentColorForek8zF_U(j10, composer, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
        }
        long j14 = j10;
        IconButtonColors iconButtonColorsM28727copyjRlVdoo = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28727copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM28727copyjRlVdoo;
    }

    @Composable
    public final IconToggleButtonColors filledIconToggleButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1554706367, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
        }
        IconToggleButtonColors defaultFilledIconToggleButtonColors$material3_release = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconToggleButtonColors$material3_release;
    }

    @Composable
    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m28737filledIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM28512contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU5, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            j16 = jM30914getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1887173701, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
        } else {
            j16 = jM30914getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM28750copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28750copytNS2XkQ(j16, jM30914getUnspecified0d7_KjU2, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM28512contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM28750copytNS2XkQ;
    }

    @Composable
    public final IconButtonColors filledTonalIconButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1099140437, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
        }
        IconButtonColors defaultFilledTonalIconButtonColors$material3_release = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconButtonColors$material3_release;
    }

    @Composable
    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m28738filledTonalIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = ColorSchemeKt.m28512contentColorForek8zF_U(j10, composer, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
        }
        long j14 = j10;
        IconButtonColors iconButtonColorsM28727copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28727copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM28727copyjRlVdoo;
    }

    @Composable
    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(434219587, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
        }
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColors$material3_release = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconToggleButtonColors$material3_release;
    }

    @Composable
    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m28739filledTonalIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM28512contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU3 = (i11 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU5 = (i11 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            j16 = jM30914getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-19426557, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
        } else {
            j16 = jM30914getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM28750copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m28750copytNS2XkQ(j16, jM28512contentColorForek8zF_U, jM30914getUnspecified0d7_KjU2, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM28750copytNS2XkQ;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached$material3_release = colorScheme.getDefaultFilledIconButtonColorsCached$material3_release();
        if (defaultFilledIconButtonColorsCached$material3_release != null) {
            return defaultFilledIconButtonColorsCached$material3_release;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor())), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached$material3_release = colorScheme.getDefaultFilledIconToggleButtonColorsCached$material3_release();
        if (defaultFilledIconToggleButtonColorsCached$material3_release != null) {
            return defaultFilledIconToggleButtonColorsCached$material3_release;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getToggleUnselectedColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalIconButtonColorsCached$material3_release();
        if (defaultFilledTonalIconButtonColorsCached$material3_release != null) {
            return defaultFilledTonalIconButtonColorsCached$material3_release;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor())), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors iconToggleButtonColorsM1003x5914e7b2 = colorScheme.m1003x5914e7b2();
        if (iconToggleButtonColorsM1003x5914e7b2 != null) {
            return iconToggleButtonColorsM1003x5914e7b2;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.m28511contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor())), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getToggleSelectedColor()), null);
        colorScheme.m1005xa626b4be(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        Shape value = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
        }
        Shape value = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    public final IconButtonColors iconButtonColors(Composer composer, int i10) {
        composer.startReplaceGroup(-1519621781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long jM30888unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
        IconButtonColors iconButtonColorsM28732defaultIconButtonColors4WTKRHQ$material3_release = m28732defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM30888unboximpl);
        if (Color.m30879equalsimpl0(iconButtonColorsM28732defaultIconButtonColors4WTKRHQ$material3_release.m28729getContentColor0d7_KjU(), jM30888unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM28732defaultIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM28724copyjRlVdoo$default = IconButtonColors.m28724copyjRlVdoo$default(iconButtonColorsM28732defaultIconButtonColors4WTKRHQ$material3_release, 0L, jM30888unboximpl, 0L, Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM28724copyjRlVdoo$default;
    }

    @Composable
    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m28740iconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        long jM30888unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl() : j11;
        long jM30914getUnspecified0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30877copywmQWz5c$default = (i11 & 8) != 0 ? Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        IconButtonColors iconButtonColorsM28727copyjRlVdoo = m28732defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl()).m28727copyjRlVdoo(j10, jM30888unboximpl, jM30914getUnspecified0d7_KjU, jM30877copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM28727copyjRlVdoo;
    }

    @Composable
    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i10) {
        composer.startReplaceGroup(-589987581);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589987581, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        long jM30888unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM28733defaultIconToggleButtonColors4WTKRHQ$material3_release = m28733defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM30888unboximpl);
        if (Color.m30879equalsimpl0(iconToggleButtonColorsM28733defaultIconToggleButtonColors4WTKRHQ$material3_release.m28754getContentColor0d7_KjU(), jM30888unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM28733defaultIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM28749copytNS2XkQ$default = IconToggleButtonColors.m28749copytNS2XkQ$default(iconToggleButtonColorsM28733defaultIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM30888unboximpl, 0L, Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM28749copytNS2XkQ$default;
    }

    @Composable
    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m28741iconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM30877copywmQWz5c$default;
        long j17;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30888unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl() : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j18 = jM30888unboximpl;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j18, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j18;
        } else {
            j16 = jM30888unboximpl;
            jM30877copywmQWz5c$default = j13;
        }
        long jM30914getUnspecified0d7_KjU3 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU4 = (i11 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM30914getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-2020719549, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
        } else {
            j17 = jM30914getUnspecified0d7_KjU;
        }
        long j19 = j17;
        IconToggleButtonColors iconToggleButtonColorsM28750copytNS2XkQ = m28733defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl()).m28750copytNS2XkQ(j19, j16, jM30914getUnspecified0d7_KjU2, jM30877copywmQWz5c$default, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM28750copytNS2XkQ;
    }

    @Composable
    public final BorderStroke outlinedIconButtonBorder(boolean z10, Composer composer, int i10) {
        long jM30877copywmQWz5c$default;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if (z10) {
            composer.startReplaceGroup(1186104514);
            jM30877copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1186170420);
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM30877copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m26979BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m29970getUnselectedOutlineWidthD9Ej5fM(), jM30877copywmQWz5c$default);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    @Composable
    public final IconButtonColors outlinedIconButtonColors(Composer composer, int i10) {
        composer.startReplaceGroup(389287465);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389287465, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
        }
        IconButtonColors iconButtonColorsM28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release = m28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl());
        long jM30888unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
        if (Color.m30879equalsimpl0(iconButtonColorsM28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release.m28729getContentColor0d7_KjU(), jM30888unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM28724copyjRlVdoo$default = IconButtonColors.m28724copyjRlVdoo$default(iconButtonColorsM28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release, 0L, jM30888unboximpl, 0L, Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM28724copyjRlVdoo$default;
    }

    @Composable
    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m28742outlinedIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.Companion.m30914getUnspecified0d7_KjU();
        }
        long jM30888unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl() : j11;
        long jM30914getUnspecified0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30877copywmQWz5c$default = (i11 & 8) != 0 ? Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
        }
        IconButtonColors iconButtonColorsM28727copyjRlVdoo = m28734defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl()).m28727copyjRlVdoo(j10, jM30888unboximpl, jM30914getUnspecified0d7_KjU, jM30877copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM28727copyjRlVdoo;
    }

    @Composable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z10, boolean z11, Composer composer, int i10) {
        composer.startReplaceGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if (z11) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z10, composer, (i10 & 14) | ((i10 >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    @Composable
    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer composer, int i10) {
        composer.startReplaceGroup(-779749183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-779749183, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
        }
        long jM30888unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release = m28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM30888unboximpl);
        if (Color.m30879equalsimpl0(iconToggleButtonColorsM28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release.m28754getContentColor0d7_KjU(), jM30888unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM28749copytNS2XkQ$default = IconToggleButtonColors.m28749copytNS2XkQ$default(iconToggleButtonColorsM28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM30888unboximpl, 0L, Color.m30877copywmQWz5c$default(jM30888unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM28749copytNS2XkQ$default;
    }

    @Composable
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m28743outlinedIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM30877copywmQWz5c$default;
        long j17;
        long jM30914getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30888unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl() : j11;
        long jM30914getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j18 = jM30888unboximpl;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j18, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j18;
        } else {
            j16 = jM30888unboximpl;
            jM30877copywmQWz5c$default = j13;
        }
        long jM30914getUnspecified0d7_KjU3 = (i11 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM28512contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m28512contentColorForek8zF_U(jM30914getUnspecified0d7_KjU3, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM30914getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(2130592709, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
        } else {
            j17 = jM30914getUnspecified0d7_KjU;
        }
        long j19 = j17;
        IconToggleButtonColors iconToggleButtonColorsM28750copytNS2XkQ = m28735defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m30888unboximpl()).m28750copytNS2XkQ(j19, j16, jM30914getUnspecified0d7_KjU2, jM30877copywmQWz5c$default, jM30914getUnspecified0d7_KjU3, jM28512contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM28750copytNS2XkQ;
    }
}
