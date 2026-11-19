package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Stable;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m30505shadows4CzXII(Modifier modifier, float f10, Shape shape, boolean z10, long j10, long j11) {
        return (C3186Dp.m33500compareTo0680j_4(f10, C3186Dp.m33501constructorimpl((float) 0)) > 0 || z10) ? modifier.then(new ShadowGraphicsLayerElement(f10, shape, z10, j10, j11, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m30506shadows4CzXII$default(Modifier modifier, float f10, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        Shape rectangleShape = (i10 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (C3186Dp.m33500compareTo0680j_4(f10, C3186Dp.m33501constructorimpl(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m30505shadows4CzXII(modifier, f10, rectangleShape, z11, (i10 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11);
    }

    @Stable
    @InterfaceC10770a
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m30507shadowziNgDLE(Modifier modifier, float f10, Shape shape, boolean z10) {
        return m30505shadows4CzXII(modifier, f10, shape, z10, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m30508shadowziNgDLE$default(Modifier modifier, float f10, Shape shape, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (C3186Dp.m33500compareTo0680j_4(f10, C3186Dp.m33501constructorimpl(0)) > 0) {
                z10 = true;
            }
        }
        return m30507shadowziNgDLE(modifier, f10, shape, z10);
    }
}
