package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0098\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¤\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a¸\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aÂ\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a,\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H\u0007¢\u0006\u0004\b\u0014\u0010'\u001a\u0013\u0010(\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "graphicsLayer", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "graphicsLayer-2Xn7asI", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "graphicsLayer-pANQ8Wg", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "graphicsLayer-Ap8cVGQ", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new BlockGraphicsLayerElement(interfaceC6471c));
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m10839graphicsLayer2Xn7asI(Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect) {
        return m10841graphicsLayerAp8cVGQ(modifier, f, f7, f8, f9, f10, f11, f12, f13, f14, f15, j7, shape, z8, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.INSTANCE.m10770getAutoNrFUSI());
    }

    @Stable
    @NotNull
    /* renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final Modifier m10841graphicsLayerAp8cVGQ(@NotNull Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, @NotNull Shape shape, boolean z8, @Nullable RenderEffect renderEffect, long j8, long j9, int i) {
        return modifier.then(new GraphicsLayerElement(f, f7, f8, f9, f10, f11, f12, f13, f14, f15, j7, shape, z8, renderEffect, j8, j9, i, null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10842graphicsLayerAp8cVGQ$default(Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect, long j8, long j9, int i, int i8, Object obj) {
        return m10841graphicsLayerAp8cVGQ(modifier, (i8 & 1) != 0 ? 1.0f : f, (i8 & 2) != 0 ? 1.0f : f7, (i8 & 4) == 0 ? f8 : 1.0f, (i8 & 8) != 0 ? 0.0f : f9, (i8 & 16) != 0 ? 0.0f : f10, (i8 & 32) != 0 ? 0.0f : f11, (i8 & 64) != 0 ? 0.0f : f12, (i8 & 128) != 0 ? 0.0f : f13, (i8 & 256) == 0 ? f14 : 0.0f, (i8 & 512) != 0 ? 8.0f : f15, (i8 & 1024) != 0 ? TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ() : j7, (i8 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i8 & 4096) != 0 ? false : z8, (i8 & 8192) != 0 ? null : renderEffect, (i8 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j8, (32768 & i8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j9, (i8 & 65536) != 0 ? CompositingStrategy.INSTANCE.m10770getAutoNrFUSI() : i);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m10843graphicsLayerpANQ8Wg(Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect, long j8, long j9) {
        return m10841graphicsLayerAp8cVGQ(modifier, f, f7, f8, f9, f10, f11, f12, f13, f14, f15, j7, shape, z8, renderEffect, j8, j9, CompositingStrategy.INSTANCE.m10770getAutoNrFUSI());
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ Modifier m10845graphicsLayersKFY_QE(Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8) {
        return m10842graphicsLayerAp8cVGQ$default(modifier, f, f7, f8, f9, f10, f11, f12, f13, f14, f15, j7, shape, z8, null, 0L, 0L, 0, 114688, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10846graphicsLayersKFY_QE$default(Modifier modifier, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m10845graphicsLayersKFY_QE(modifier, f, (i & 2) != 0 ? 1.0f : f7, (i & 4) == 0 ? f8 : 1.0f, (i & 8) != 0 ? 0.0f : f9, (i & 16) != 0 ? 0.0f : f10, (i & 32) != 0 ? 0.0f : f11, (i & 64) != 0 ? 0.0f : f12, (i & 128) != 0 ? 0.0f : f13, (i & 256) == 0 ? f14 : 0.0f, (i & 512) != 0 ? 8.0f : f15, (i & 1024) != 0 ? TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ() : j7, (i & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 4096) != 0 ? false : z8);
    }

    @Stable
    @NotNull
    public static final Modifier toolingGraphicsLayer(@NotNull Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m10842graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
