package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.RenderEffectKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.TileMode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m23873blur1fqSgw(Modifier modifier, final float f10, final float f11, final Shape shape) {
        int iM24650getDecal3opZhB0;
        final boolean z10;
        if (shape != null) {
            iM24650getDecal3opZhB0 = TileMode.Companion.m24649getClamp3opZhB0();
            z10 = true;
        } else {
            iM24650getDecal3opZhB0 = TileMode.Companion.m24650getDecal3opZhB0();
            z10 = false;
        }
        final int i10 = iM24650getDecal3opZhB0;
        float f12 = 0;
        return ((C3156Dp.m26898compareTo0680j_4(f10, C3156Dp.m26899constructorimpl(f12)) <= 0 || C3156Dp.m26898compareTo0680j_4(f11, C3156Dp.m26899constructorimpl(f12)) <= 0) && !z10) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new InterfaceC10570l() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                float fMo20497toPx0680j_4 = graphicsLayerScope.mo20497toPx0680j_4(f10);
                float fMo20497toPx0680j_42 = graphicsLayerScope.mo20497toPx0680j_4(f11);
                graphicsLayerScope.setRenderEffect((fMo20497toPx0680j_4 <= 0.0f || fMo20497toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m24584BlurEffect3YTHUZs(fMo20497toPx0680j_4, fMo20497toPx0680j_42, i10));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z10);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23874blur1fqSgw$default(Modifier modifier, float f10, float f11, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m23877boximpl(BlurredEdgeTreatment.Companion.m23884getRectangleGoahg());
        }
        return m23873blur1fqSgw(modifier, f10, f11, blurredEdgeTreatment.m23883unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m23875blurF8QBwvs(Modifier modifier, float f10, Shape shape) {
        return m23873blur1fqSgw(modifier, f10, f10, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m23876blurF8QBwvs$default(Modifier modifier, float f10, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m23877boximpl(BlurredEdgeTreatment.Companion.m23884getRectangleGoahg());
        }
        return m23875blurF8QBwvs(modifier, f10, blurredEdgeTreatment.m23883unboximpl());
    }
}
