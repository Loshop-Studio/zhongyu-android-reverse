package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.RenderEffectKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.TileMode;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m13558d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n107#1:149\n*E\n"})
/* loaded from: classes2.dex */
public final class BlurKt {
    @Stable
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m20581blur1fqSgw(Modifier modifier, final float f10, final float f11, final Shape shape) {
        int iM21350getDecal3opZhB0;
        final boolean z9;
        if (shape != null) {
            iM21350getDecal3opZhB0 = TileMode.INSTANCE.m21349getClamp3opZhB0();
            z9 = true;
        } else {
            iM21350getDecal3opZhB0 = TileMode.INSTANCE.m21350getDecal3opZhB0();
            z9 = false;
        }
        final int i10 = iM21350getDecal3opZhB0;
        float f12 = 0;
        return ((C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl(f12)) <= 0 || C3127Dp.m23560compareTo0680j_4(f11, C3127Dp.m23561constructorimpl(f12)) <= 0) && !z9) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
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
                float fMo17332toPx0680j_4 = graphicsLayerScope.mo17332toPx0680j_4(f10);
                float fMo17332toPx0680j_42 = graphicsLayerScope.mo17332toPx0680j_4(f11);
                graphicsLayerScope.setRenderEffect((fMo17332toPx0680j_4 <= 0.0f || fMo17332toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m21284BlurEffect3YTHUZs(fMo17332toPx0680j_4, fMo17332toPx0680j_42, i10));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z9);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20582blur1fqSgw$default(Modifier modifier, float f10, float f11, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m20585boximpl(BlurredEdgeTreatment.INSTANCE.m20592getRectangleGoahg());
        }
        return m20581blur1fqSgw(modifier, f10, f11, blurredEdgeTreatment.m20591unboximpl());
    }

    @Stable
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m20583blurF8QBwvs(Modifier modifier, float f10, Shape shape) {
        return m20581blur1fqSgw(modifier, f10, f10, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m20584blurF8QBwvs$default(Modifier modifier, float f10, BlurredEdgeTreatment blurredEdgeTreatment, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m20585boximpl(BlurredEdgeTreatment.INSTANCE.m20592getRectangleGoahg());
        }
        return m20583blurF8QBwvs(modifier, f10, blurredEdgeTreatment.m20591unboximpl());
    }
}
