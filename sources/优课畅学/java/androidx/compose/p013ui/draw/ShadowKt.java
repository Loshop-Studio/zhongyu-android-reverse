package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Stable;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m23903shadows4CzXII(Modifier modifier, float f10, Shape shape, boolean z10, long j10, long j11) {
        return (C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl((float) 0)) > 0 || z10) ? modifier.then(new ShadowGraphicsLayerElement(f10, shape, z10, j10, j11, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23904shadows4CzXII$default(Modifier modifier, float f10, Shape shape, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        Shape rectangleShape = (i10 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m23903shadows4CzXII(modifier, f10, rectangleShape, z11, (i10 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11);
    }

    @Stable
    @InterfaceC8721a
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m23905shadowziNgDLE(Modifier modifier, float f10, Shape shape, boolean z10) {
        return m23903shadows4CzXII(modifier, f10, shape, z10, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23906shadowziNgDLE$default(Modifier modifier, float f10, Shape shape, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl(0)) > 0) {
                z10 = true;
            }
        }
        return m23905shadowziNgDLE(modifier, f10, shape, z10);
    }
}
