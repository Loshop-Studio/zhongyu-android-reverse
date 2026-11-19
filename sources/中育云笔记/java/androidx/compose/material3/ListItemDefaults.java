package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m29916getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    @Composable
    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m28789colorsJ08w3E(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Composer composer, int i10, int i11) {
        long jM30877copywmQWz5c$default;
        long jM30877copywmQWz5c$default2;
        long jM30877copywmQWz5c$default3;
        long j19;
        long value = (i11 & 1) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6) : j10;
        long value2 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6) : j11;
        long value3 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6) : j12;
        long value4 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6) : j13;
        long value5 = (i11 & 16) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6) : j14;
        long value6 = (i11 & 32) != 0 ? ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6) : j15;
        if ((i11 & 64) != 0) {
            ListTokens listTokens = ListTokens.INSTANCE;
            jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(listTokens.getListItemDisabledLabelTextColor(), composer, 6), listTokens.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default = j16;
        }
        if ((i11 & 128) != 0) {
            ListTokens listTokens2 = ListTokens.INSTANCE;
            jM30877copywmQWz5c$default2 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(listTokens2.getListItemDisabledLeadingIconColor(), composer, 6), listTokens2.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default2 = j17;
        }
        if ((i11 & 256) != 0) {
            ListTokens listTokens3 = ListTokens.INSTANCE;
            jM30877copywmQWz5c$default3 = Color.m30877copywmQWz5c$default(ColorSchemeKt.getValue(listTokens3.getListItemDisabledTrailingIconColor(), composer, 6), listTokens3.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM30877copywmQWz5c$default3 = j18;
        }
        if (ComposerKt.isTraceInProgress()) {
            j19 = jM30877copywmQWz5c$default3;
            ComposerKt.traceEventStart(-352515689, i10, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:583)");
        } else {
            j19 = jM30877copywmQWz5c$default3;
        }
        ListItemColors listItemColors = new ListItemColors(value, value2, value3, value4, value5, value6, jM30877copywmQWz5c$default, jM30877copywmQWz5c$default2, j19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemColors;
    }

    @Composable
    @ReadOnlyComposable
    public final long getContainerColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:540)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @Composable
    @ReadOnlyComposable
    public final long getContentColor(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:544)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m28790getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @ReadOnlyComposable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i10, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:536)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
