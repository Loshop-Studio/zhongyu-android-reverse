package androidx.compose.p009ui.draw;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p009ui.graphics.GraphicsLayerScope;
import androidx.compose.p009ui.graphics.RectangleShapeKt;
import androidx.compose.p009ui.graphics.RenderEffectKt;
import androidx.compose.p009ui.graphics.Shape;
import androidx.compose.p009ui.graphics.TileMode;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m7880d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n107#1:149\n*E\n"})
/* loaded from: classes2.dex */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m13504blur1fqSgw(Modifier modifier, final float f6, final float f7, final Shape shape) {
        int iM14273getDecal3opZhB0;
        final boolean z6;
        if (shape != null) {
            iM14273getDecal3opZhB0 = TileMode.INSTANCE.m14272getClamp3opZhB0();
            z6 = true;
        } else {
            iM14273getDecal3opZhB0 = TileMode.INSTANCE.m14273getDecal3opZhB0();
            z6 = false;
        }
        final int i6 = iM14273getDecal3opZhB0;
        float f8 = 0;
        return ((C2452Dp.m16483compareTo0680j_4(f6, C2452Dp.m16484constructorimpl(f8)) <= 0 || C2452Dp.m16483compareTo0680j_4(f7, C2452Dp.m16484constructorimpl(f8)) <= 0) && !z6) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float fMo10255toPx0680j_4 = graphicsLayerScope.mo10255toPx0680j_4(f6);
                float fMo10255toPx0680j_42 = graphicsLayerScope.mo10255toPx0680j_4(f7);
                graphicsLayerScope.setRenderEffect((fMo10255toPx0680j_4 <= 0.0f || fMo10255toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m14207BlurEffect3YTHUZs(fMo10255toPx0680j_4, fMo10255toPx0680j_42, i6));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z6);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m13505blur1fqSgw$default(Modifier modifier, float f6, float f7, BlurredEdgeTreatment blurredEdgeTreatment, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m13508boximpl(BlurredEdgeTreatment.INSTANCE.m13515getRectangleGoahg());
        }
        return m13504blur1fqSgw(modifier, f6, f7, blurredEdgeTreatment.m13514unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m13506blurF8QBwvs(Modifier modifier, float f6, Shape shape) {
        return m13504blur1fqSgw(modifier, f6, f6, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m13507blurF8QBwvs$default(Modifier modifier, float f6, BlurredEdgeTreatment blurredEdgeTreatment, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m13508boximpl(BlurredEdgeTreatment.INSTANCE.m13515getRectangleGoahg());
        }
        return m13506blurF8QBwvs(modifier, f6, blurredEdgeTreatment.m13514unboximpl());
    }
}
