package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.RectangleShapeKt;
import androidx.compose.p011ui.graphics.RenderEffectKt;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.TileMode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m5110d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,148:1\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n107#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    @NotNull
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m10279blur1fqSgw(@NotNull Modifier modifier, final float f, final float f7, @NotNull final Shape shape) {
        int iM11056getDecal3opZhB0;
        final boolean z8;
        if (shape != null) {
            iM11056getDecal3opZhB0 = TileMode.INSTANCE.m11055getClamp3opZhB0();
            z8 = true;
        } else {
            iM11056getDecal3opZhB0 = TileMode.INSTANCE.m11056getDecal3opZhB0();
            z8 = false;
        }
        final int i = iM11056getDecal3opZhB0;
        float f8 = 0;
        return ((C2331Dp.m13304compareTo0680j_4(f, C2331Dp.m13305constructorimpl(f8)) <= 0 || C2331Dp.m13304compareTo0680j_4(f7, C2331Dp.m13305constructorimpl(f8)) <= 0) && !z8) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new InterfaceC6471c() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                float fMo6903toPx0680j_4 = graphicsLayerScope.mo6903toPx0680j_4(f);
                float fMo6903toPx0680j_42 = graphicsLayerScope.mo6903toPx0680j_4(f7);
                graphicsLayerScope.setRenderEffect((fMo6903toPx0680j_4 <= 0.0f || fMo6903toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m10990BlurEffect3YTHUZs(fMo6903toPx0680j_4, fMo6903toPx0680j_42, i));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z8);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10280blur1fqSgw$default(Modifier modifier, float f, float f7, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m10283boximpl(BlurredEdgeTreatment.INSTANCE.m10290getRectangleGoahg());
        }
        return m10279blur1fqSgw(modifier, f, f7, blurredEdgeTreatment.m10289unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m10281blurF8QBwvs(@NotNull Modifier modifier, float f, @NotNull Shape shape) {
        return m10279blur1fqSgw(modifier, f, f, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m10282blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m10283boximpl(BlurredEdgeTreatment.INSTANCE.m10290getRectangleGoahg());
        }
        return m10281blurF8QBwvs(modifier, f, blurredEdgeTreatment.m10289unboximpl());
    }
}
