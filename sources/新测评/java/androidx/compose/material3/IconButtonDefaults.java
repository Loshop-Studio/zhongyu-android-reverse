package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001eJ\r\u0010+\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010$J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101J\r\u00102\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017J:\u00102\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001eJ\u001f\u00104\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\u0006\u00105\u001a\u000200H\u0007¢\u0006\u0002\u00106J\r\u00107\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 JN\u00107\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010$J\u001e\u00109\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001e\u0010=\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001e\u0010@\u001a\u00020\n*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bA\u0010<J\u001e\u0010B\u001a\u00020\u000f*\u00020\u000b2\u0006\u0010:\u001a\u00020\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\bC\u0010?R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\u0014\u001a\u00020\u000f*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m13558d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "defaultFilledIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultFilledIconButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconButtonColors;", "defaultFilledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "getDefaultFilledIconToggleButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconToggleButtonColors;", "defaultFilledTonalIconButtonColors", "getDefaultFilledTonalIconButtonColors$material3_release", "defaultFilledTonalIconToggleButtonColors", "getDefaultFilledTonalIconToggleButtonColors$material3_release", "filledIconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "defaultIconButtonColors", "localContentColor", "defaultIconButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "defaultIconToggleButtonColors", "defaultIconToggleButtonColors-4WTKRHQ$material3_release", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconToggleButtonColors;", "defaultOutlinedIconButtonColors", "defaultOutlinedIconButtonColors-4WTKRHQ$material3_release", "defaultOutlinedIconToggleButtonColors", "defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1292:1\n77#2:1293\n77#2:1294\n77#2:1295\n77#2:1297\n77#2:1298\n77#2:1299\n77#2:1300\n77#2:1301\n77#2:1302\n77#2:1303\n77#2:1304\n77#2:1305\n77#2:1306\n77#2:1307\n77#2:1308\n1#3:1296\n1223#4,6:1309\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n594#1:1293\n618#1:1294\n624#1:1295\n652#1:1297\n679#1:1298\n687#1:1299\n941#1:1300\n942#1:1301\n966#1:1302\n972#1:1303\n1002#1:1304\n1029#1:1305\n1037#1:1306\n1095#1:1307\n1097#1:1308\n1101#1:1309,6\n*E\n"})
/* loaded from: classes2.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m18873defaultIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconButtonColors defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m21011getTransparent0d7_KjU(), j10, companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m18874defaultIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(companion.m21011getTransparent0d7_KjU(), j10, companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m21011getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, IconButtonTokens.INSTANCE.getSelectedIconColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconButtonColors m18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconButtonColors defaultOutlinedIconButtonColorsCached = colorScheme.getDefaultOutlinedIconButtonColorsCached();
        if (defaultOutlinedIconButtonColorsCached != null) {
            return defaultOutlinedIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.m21011getTransparent0d7_KjU(), j10, companion.m21011getTransparent0d7_KjU(), Color.m20975copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3_release, reason: not valid java name */
    public final IconToggleButtonColors m18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(ColorScheme colorScheme, long j10) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM21011getTransparent0d7_KjU = companion.m21011getTransparent0d7_KjU();
        long jM21011getTransparent0d7_KjU2 = companion.m21011getTransparent0d7_KjU();
        long jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jM21011getTransparent0d7_KjU, j10, jM21011getTransparent0d7_KjU2, jM20975copywmQWz5c$default, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedIconButtonTokens.getSelectedContainerColor())), null);
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
    public final IconButtonColors m18877filledIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = ColorSchemeKt.m18666contentColorForek8zF_U(j10, composer, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:736)");
        }
        long j14 = j10;
        IconButtonColors iconButtonColorsM18868copyjRlVdoo = getDefaultFilledIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18868copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM18868copyjRlVdoo;
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
    public final IconToggleButtonColors m18878filledIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 2) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j11;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM18666contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU5, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            j16 = jM21012getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1887173701, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:790)");
        } else {
            j16 = jM21012getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM18891copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18891copytNS2XkQ(j16, jM21012getUnspecified0d7_KjU2, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5, jM18666contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM18891copytNS2XkQ;
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
    public final IconButtonColors m18879filledTonalIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 2) != 0) {
            j11 = ColorSchemeKt.m18666contentColorForek8zF_U(j10, composer, i10 & 14);
        }
        if ((i11 & 4) != 0) {
            j12 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if ((i11 & 8) != 0) {
            j13 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:848)");
        }
        long j14 = j10;
        IconButtonColors iconButtonColorsM18868copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18868copyjRlVdoo(j14, j11, j12, j13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM18868copyjRlVdoo;
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
    public final IconToggleButtonColors m18880filledTonalIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM18666contentColorForek8zF_U = (i11 & 2) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU, composer, i10 & 14) : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM21012getUnspecified0d7_KjU3 = (i11 & 8) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j13;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU5 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            j16 = jM21012getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-19426557, i10, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:900)");
        } else {
            j16 = jM21012getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM18891copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m18891copytNS2XkQ(j16, jM18666contentColorForek8zF_U, jM21012getUnspecified0d7_KjU2, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4, jM21012getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM18891copytNS2XkQ;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached = colorScheme.getDefaultFilledIconButtonColorsCached();
        if (defaultFilledIconButtonColorsCached != null) {
            return defaultFilledIconButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getContainerColor())), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached = colorScheme.getDefaultFilledIconToggleButtonColorsCached();
        if (defaultFilledIconToggleButtonColorsCached != null) {
            return defaultFilledIconToggleButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getToggleUnselectedColor()), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledContainerColor()), filledIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getDisabledColor()), filledIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledIconButtonTokens.getSelectedContainerColor())), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3_release(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3_release(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached = colorScheme.getDefaultFilledTonalIconButtonColorsCached();
        if (defaultFilledTonalIconButtonColorsCached != null) {
            return defaultFilledTonalIconButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getContainerColor())), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3_release(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3_release(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached();
        if (defaultFilledTonalIconToggleButtonColorsCached != null) {
            return defaultFilledTonalIconToggleButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor()), ColorSchemeKt.m18665contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getUnselectedContainerColor())), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledContainerColor()), filledTonalIconButtonTokens.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m20975copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getDisabledColor()), filledTonalIconButtonTokens.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalIconButtonTokens.getToggleSelectedColor()), null);
        colorScheme.m1155xa626b4be(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    @Composable
    @JvmName(name = "getFilledShape")
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
    @JvmName(name = "getOutlinedShape")
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
        long jM20986unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl();
        IconButtonColors iconButtonColorsM18873defaultIconButtonColors4WTKRHQ$material3_release = m18873defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM20986unboximpl);
        if (Color.m20977equalsimpl0(iconButtonColorsM18873defaultIconButtonColors4WTKRHQ$material3_release.getContentColor(), jM20986unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM18873defaultIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM18865copyjRlVdoo$default = IconButtonColors.m18865copyjRlVdoo$default(iconButtonColorsM18873defaultIconButtonColors4WTKRHQ$material3_release, 0L, jM20986unboximpl, 0L, Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM18865copyjRlVdoo$default;
    }

    @Composable
    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m18881iconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        long jM20986unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl() : j11;
        long jM21012getUnspecified0d7_KjU = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM20975copywmQWz5c$default = (i11 & 8) != 0 ? Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999008085, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:622)");
        }
        IconButtonColors iconButtonColorsM18868copyjRlVdoo = m18873defaultIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl()).m18868copyjRlVdoo(j10, jM20986unboximpl, jM21012getUnspecified0d7_KjU, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM18868copyjRlVdoo;
    }

    @Composable
    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i10) {
        composer.startReplaceGroup(-589987581);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589987581, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        long jM20986unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM18874defaultIconToggleButtonColors4WTKRHQ$material3_release = m18874defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM20986unboximpl);
        if (Color.m20977equalsimpl0(iconToggleButtonColorsM18874defaultIconToggleButtonColors4WTKRHQ$material3_release.getContentColor(), jM20986unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM18874defaultIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM18890copytNS2XkQ$default = IconToggleButtonColors.m18890copytNS2XkQ$default(iconToggleButtonColorsM18874defaultIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM20986unboximpl, 0L, Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM18890copytNS2XkQ$default;
    }

    @Composable
    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m18882iconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM20975copywmQWz5c$default;
        long j17;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM20986unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl() : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j18 = jM20986unboximpl;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j18, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j18;
        } else {
            j16 = jM20986unboximpl;
            jM20975copywmQWz5c$default = j13;
        }
        long jM21012getUnspecified0d7_KjU3 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM21012getUnspecified0d7_KjU4 = (i11 & 32) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM21012getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-2020719549, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:685)");
        } else {
            j17 = jM21012getUnspecified0d7_KjU;
        }
        long j19 = j17;
        IconToggleButtonColors iconToggleButtonColorsM18891copytNS2XkQ = m18874defaultIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl()).m18891copytNS2XkQ(j19, j16, jM21012getUnspecified0d7_KjU2, jM20975copywmQWz5c$default, jM21012getUnspecified0d7_KjU3, jM21012getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM18891copytNS2XkQ;
    }

    @Composable
    public final BorderStroke outlinedIconButtonBorder(boolean z9, Composer composer, int i10) {
        long jM20975copywmQWz5c$default;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if (z9) {
            composer.startReplaceGroup(1186104514);
            jM20975copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1186170420);
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(jM20975copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m17217BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m20092getUnselectedOutlineWidthD9Ej5fM(), jM20975copywmQWz5c$default);
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
        IconButtonColors iconButtonColorsM18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release = m18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl());
        long jM20986unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl();
        if (Color.m20977equalsimpl0(iconButtonColorsM18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release.getContentColor(), jM20986unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconButtonColorsM18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release;
        }
        IconButtonColors iconButtonColorsM18865copyjRlVdoo$default = IconButtonColors.m18865copyjRlVdoo$default(iconButtonColorsM18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release, 0L, jM20986unboximpl, 0L, Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM18865copyjRlVdoo$default;
    }

    @Composable
    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m18883outlinedIconButtonColorsro_MJ88(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        long jM20986unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl() : j11;
        long jM21012getUnspecified0d7_KjU = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        long jM20975copywmQWz5c$default = (i11 & 8) != 0 ? Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:970)");
        }
        IconButtonColors iconButtonColorsM18868copyjRlVdoo = m18875defaultOutlinedIconButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl()).m18868copyjRlVdoo(j10, jM20986unboximpl, jM21012getUnspecified0d7_KjU, jM20975copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM18868copyjRlVdoo;
    }

    @Composable
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z9, boolean z10, Composer composer, int i10) {
        composer.startReplaceGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if (z10) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        BorderStroke borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z9, composer, (i10 & 14) | ((i10 >> 3) & 112));
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
        long jM20986unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release = m18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM20986unboximpl);
        if (Color.m20977equalsimpl0(iconToggleButtonColorsM18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release.getContentColor(), jM20986unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return iconToggleButtonColorsM18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release;
        }
        IconToggleButtonColors iconToggleButtonColorsM18890copytNS2XkQ$default = IconToggleButtonColors.m18890copytNS2XkQ$default(iconToggleButtonColorsM18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release, 0L, jM20986unboximpl, 0L, Color.m20975copywmQWz5c$default(jM20986unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM18890copytNS2XkQ$default;
    }

    @Composable
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m18884outlinedIconToggleButtonColors5tl4gsc(long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i10, int i11) {
        long j16;
        long jM20975copywmQWz5c$default;
        long j17;
        long jM21012getUnspecified0d7_KjU = (i11 & 1) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j10;
        long jM20986unboximpl = (i11 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl() : j11;
        long jM21012getUnspecified0d7_KjU2 = (i11 & 4) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j12;
        if ((i11 & 8) != 0) {
            long j18 = jM20986unboximpl;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j18, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j18;
        } else {
            j16 = jM20986unboximpl;
            jM20975copywmQWz5c$default = j13;
        }
        long jM21012getUnspecified0d7_KjU3 = (i11 & 16) != 0 ? Color.INSTANCE.m21012getUnspecified0d7_KjU() : j14;
        long jM18666contentColorForek8zF_U = (i11 & 32) != 0 ? ColorSchemeKt.m18666contentColorForek8zF_U(jM21012getUnspecified0d7_KjU3, composer, (i10 >> 12) & 14) : j15;
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM21012getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(2130592709, i10, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1035)");
        } else {
            j17 = jM21012getUnspecified0d7_KjU;
        }
        long j19 = j17;
        IconToggleButtonColors iconToggleButtonColorsM18891copytNS2XkQ = m18876defaultOutlinedIconToggleButtonColors4WTKRHQ$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m20986unboximpl()).m18891copytNS2XkQ(j19, j16, jM21012getUnspecified0d7_KjU2, jM20975copywmQWz5c$default, jM21012getUnspecified0d7_KjU3, jM18666contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM18891copytNS2XkQ;
    }
}
