package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p006ui.graphics.GraphicsLayerScope;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.RenderEffectKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.graphics.TileMode;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m5175d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m8843blur1fqSgw(Modifier blur, final float f4, final float f5, final Shape shape) {
        final boolean z3;
        final int iM9522getDecal3opZhB0;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (shape != null) {
            iM9522getDecal3opZhB0 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            z3 = true;
        } else {
            z3 = false;
            iM9522getDecal3opZhB0 = TileMode.INSTANCE.m9522getDecal3opZhB0();
        }
        float f6 = 0;
        return ((C1700Dp.m11524compareTo0680j_4(f4, C1700Dp.m11525constructorimpl(f6)) <= 0 || C1700Dp.m11524compareTo0680j_4(f5, C1700Dp.m11525constructorimpl(f6)) <= 0) && !z3) ? blur : GraphicsLayerModifierKt.graphicsLayer(blur, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
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
            public final void invoke2(GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                float fMo7206toPx0680j_4 = graphicsLayer.mo7206toPx0680j_4(f4);
                float fMo7206toPx0680j_42 = graphicsLayer.mo7206toPx0680j_4(f5);
                graphicsLayer.setRenderEffect((fMo7206toPx0680j_4 <= 0.0f || fMo7206toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m9456BlurEffect3YTHUZs(fMo7206toPx0680j_4, fMo7206toPx0680j_42, iM9522getDecal3opZhB0));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayer.setShape(rectangleShape);
                graphicsLayer.setClip(z3);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8844blur1fqSgw$default(Modifier modifier, float f4, float f5, BlurredEdgeTreatment blurredEdgeTreatment, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m8847boximpl(BlurredEdgeTreatment.INSTANCE.m8854getRectangleGoahg());
        }
        return m8843blur1fqSgw(modifier, f4, f5, blurredEdgeTreatment.m8853unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m8845blurF8QBwvs(Modifier blur, float f4, Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m8843blur1fqSgw(blur, f4, f4, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8846blurF8QBwvs$default(Modifier modifier, float f4, BlurredEdgeTreatment blurredEdgeTreatment, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m8847boximpl(BlurredEdgeTreatment.INSTANCE.m8854getRectangleGoahg());
        }
        return m8845blurF8QBwvs(modifier, f4, blurredEdgeTreatment.m8853unboximpl());
    }
}
