package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jo\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5175d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ListItemColors;", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "colors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m8540getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    @Composable
    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m8023colorsJ08w3E(long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i4, int i5) {
        composer.startReplaceableGroup(-352515689);
        long color = (i5 & 1) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6) : j4;
        long color2 = (i5 & 2) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6) : j5;
        long color3 = (i5 & 4) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6) : j6;
        long color4 = (i5 & 8) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6) : j7;
        long color5 = (i5 & 16) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6) : j8;
        long color6 = (i5 & 32) != 0 ? ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6) : j9;
        long jM9177copywmQWz5c$default = (i5 & 64) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLabelTextColor(), composer, 6), 0.3f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jM9177copywmQWz5c$default2 = (i5 & 128) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jM9177copywmQWz5c$default3 = (i5 & 256) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i4, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:400)");
        }
        ListItemColors listItemColors = new ListItemColors(color, color2, color3, color4, color5, color6, jM9177copywmQWz5c$default, jM9177copywmQWz5c$default2, jM9177copywmQWz5c$default3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listItemColors;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(Composer composer, int i4) {
        composer.startReplaceableGroup(-1253579929);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:377)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getContentColor")
    public final long getContentColor(Composer composer, int i4) {
        composer.startReplaceableGroup(1076068327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:380)");
        }
        long color = ColorSchemeKt.toColor(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m8024getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getShape")
    public final Shape getShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-496871597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i4, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:374)");
        }
        Shape shape = ShapesKt.toShape(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
