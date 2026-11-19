package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p006ui.graphics.GraphicsLayerScope;
import androidx.compose.p006ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m5175d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m8863shadows4CzXII(Modifier shadow, final float f4, final Shape shape, final boolean z3, final long j4, final long j5) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        if (C1700Dp.m11524compareTo0680j_4(f4, C1700Dp.m11525constructorimpl(0)) > 0 || z3) {
            return InspectableValueKt.inspectableWrapper(shadow, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(InspectorInfo inspectorInfo) {
                    Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                    inspectorInfo.setName("shadow");
                    inspectorInfo.getProperties().set("elevation", C1700Dp.m11523boximpl(f4));
                    inspectorInfo.getProperties().set("shape", shape);
                    inspectorInfo.getProperties().set("clip", Boolean.valueOf(z3));
                    inspectorInfo.getProperties().set("ambientColor", Color.m9168boximpl(j4));
                    inspectorInfo.getProperties().set("spotColor", Color.m9168boximpl(j5));
                }
            } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
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
                    graphicsLayer.setShadowElevation(graphicsLayer.mo7206toPx0680j_4(f4));
                    graphicsLayer.setShape(shape);
                    graphicsLayer.setClip(z3);
                    graphicsLayer.mo9344setAmbientShadowColor8_81llA(j4);
                    graphicsLayer.mo9346setSpotShadowColor8_81llA(j5);
                }
            }));
        }
        return shadow;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8864shadows4CzXII$default(Modifier modifier, float f4, Shape shape, boolean z3, long j4, long j5, int i4, Object obj) {
        boolean z4;
        Shape rectangleShape = (i4 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i4 & 4) != 0) {
            z4 = false;
            if (C1700Dp.m11524compareTo0680j_4(f4, C1700Dp.m11525constructorimpl(0)) > 0) {
                z4 = true;
            }
        } else {
            z4 = z3;
        }
        return m8863shadows4CzXII(modifier, f4, rectangleShape, z4, (i4 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j4, (i4 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j5);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m8865shadowziNgDLE(Modifier shadow, float f4, Shape shape, boolean z3) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m8863shadows4CzXII(shadow, f4, shape, z3, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8866shadowziNgDLE$default(Modifier modifier, float f4, Shape shape, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i4 & 4) != 0) {
            z3 = false;
            if (C1700Dp.m11524compareTo0680j_4(f4, C1700Dp.m11525constructorimpl(0)) > 0) {
                z3 = true;
            }
        }
        return m8865shadowziNgDLE(modifier, f4, shape, z3);
    }
}
