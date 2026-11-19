package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    public static final Modifier graphicsLayer(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new BlockGraphicsLayerElement(interfaceC10570l));
    }

    @Stable
    @InterfaceC8721a
    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m24433graphicsLayer2Xn7asI(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect) {
        return m24435graphicsLayerAp8cVGQ(modifier, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m24364getAutoNrFUSI());
    }

    @Stable
    /* renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final Modifier m24435graphicsLayerAp8cVGQ(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10) {
        return modifier.then(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, renderEffect, j11, j12, i10, null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m24436graphicsLayerAp8cVGQ$default(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12, int i10, int i11, Object obj) {
        return m24435graphicsLayerAp8cVGQ(modifier, (i11 & 1) != 0 ? 1.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) == 0 ? f12 : 1.0f, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 0.0f : f14, (i11 & 32) != 0 ? 0.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) == 0 ? f18 : 0.0f, (i11 & 512) != 0 ? 8.0f : f19, (i11 & 1024) != 0 ? TransformOrigin.Companion.m24667getCenterSzJe1aQ() : j10, (i11 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i11 & 4096) != 0 ? false : z10, (i11 & 8192) != 0 ? null : renderEffect, (i11 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11, (32768 & i11) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j12, (i11 & 65536) != 0 ? CompositingStrategy.Companion.m24364getAutoNrFUSI() : i10);
    }

    @Stable
    @InterfaceC8721a
    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m24437graphicsLayerpANQ8Wg(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, RenderEffect renderEffect, long j11, long j12) {
        return m24435graphicsLayerAp8cVGQ(modifier, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, renderEffect, j11, j12, CompositingStrategy.Companion.m24364getAutoNrFUSI());
    }

    @Stable
    @InterfaceC8721a
    /* renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ Modifier m24439graphicsLayersKFY_QE(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10) {
        return m24436graphicsLayerAp8cVGQ$default(modifier, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, shape, z10, null, 0L, 0L, 0, 114688, null);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m24440graphicsLayersKFY_QE$default(Modifier modifier, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, Shape shape, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return m24439graphicsLayersKFY_QE(modifier, f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) == 0 ? f12 : 1.0f, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? 0.0f : f14, (i10 & 32) != 0 ? 0.0f : f15, (i10 & 64) != 0 ? 0.0f : f16, (i10 & 128) != 0 ? 0.0f : f17, (i10 & 256) == 0 ? f18 : 0.0f, (i10 & 512) != 0 ? 8.0f : f19, (i10 & 1024) != 0 ? TransformOrigin.Companion.m24667getCenterSzJe1aQ() : j10, (i10 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i10 & 4096) != 0 ? false : z10);
    }

    @Stable
    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m24436graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
