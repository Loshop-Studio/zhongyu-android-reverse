package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.AbstractC1455c;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutModifierNode;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.p006ui.node.NodeKind;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0094\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0006\u0010Q\u001a\u000203J\b\u0010R\u001a\u00020SH\u0016J)\u0010T\u001a\u00020U*\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010\\R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR%\u0010\u0016\u001a\u00020\u0017X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R%\u0010\u0019\u001a\u00020\u001aX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001f\u00100\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301¢\u0006\u0002\b4X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001fR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001d\"\u0004\bB\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR%\u0010\u0018\u001a\u00020\u0017X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#R%\u0010\u000e\u001a\u00020\u000fX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bK\u0010!\"\u0004\bL\u0010#R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001d\"\u0004\bN\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m5175d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "getCameraDistance", "setCameraDistance", "getClip", "()Z", "setClip", "(Z)V", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "I", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getRotationZ", "setRotationZ", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getShadowElevation", "setShadowElevation", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "invalidateLayerBlock", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,661:1\n69#2:662\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n625#1:662\n*E\n"})
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    private float alpha;
    private long ambientShadowColor;
    private float cameraDistance;
    private boolean clip;
    private int compositingStrategy;
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private Shape shape;
    private long spotShadowColor;
    private long transformOrigin;
    private float translationX;
    private float translationY;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, long j4, Shape shape, boolean z3, RenderEffect renderEffect, long j5, long j6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, j4, shape, z3, renderEffect, j5, j6, i4);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode, androidx.compose.p006ui.layout.Remeasurement
    public /* synthetic */ void forceRemeasure() {
        AbstractC1455c.m717a(this);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped = DelegatableNodeKt.m10677requireCoordinator64DMado(this, NodeKind.m10773constructorimpl(2)).getWrapped();
        if (wrapped != null) {
            wrapped.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1455c.m718b(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1455c.m719c(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo8862measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
        return MeasureScope.CC.m634p(measure, placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeWithLayer$default(layout, placeableMo10585measureBRTryo0, 0, 0, 0.0f, this.layerBlock, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1455c.m720d(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1455c.m721e(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    public final void setAlpha(float f4) {
        this.alpha = f4;
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m9479setAmbientShadowColor8_81llA(long j4) {
        this.ambientShadowColor = j4;
    }

    public final void setCameraDistance(float f4) {
        this.cameraDistance = f4;
    }

    public final void setClip(boolean z3) {
        this.clip = z3;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m9480setCompositingStrategyaDBOjCE(int i4) {
        this.compositingStrategy = i4;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f4) {
        this.rotationX = f4;
    }

    public final void setRotationY(float f4) {
        this.rotationY = f4;
    }

    public final void setRotationZ(float f4) {
        this.rotationZ = f4;
    }

    public final void setScaleX(float f4) {
        this.scaleX = f4;
    }

    public final void setScaleY(float f4) {
        this.scaleY = f4;
    }

    public final void setShadowElevation(float f4) {
        this.shadowElevation = f4;
    }

    public final void setShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.shape = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m9481setSpotShadowColor8_81llA(long j4) {
        this.spotShadowColor = j4;
    }

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public final void m9482setTransformOrigin__ExYCQ(long j4) {
        this.transformOrigin = j4;
    }

    public final void setTranslationX(float f4) {
        this.translationX = f4;
    }

    public final void setTranslationY(float f4) {
        this.translationY = f4;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.m9537toStringimpl(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.m9186toStringimpl(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.m9186toStringimpl(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m9260toStringimpl(this.compositingStrategy)) + ')';
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, long j4, Shape shape, boolean z3, RenderEffect renderEffect, long j5, long j6, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, j4, shape, z3, renderEffect, j5, j6, (i5 & 65536) != 0 ? CompositingStrategy.INSTANCE.m9262getAutoNrFUSI() : i4, null);
    }

    private SimpleGraphicsLayerModifier(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, long j4, Shape shape, boolean z3, RenderEffect renderEffect, long j5, long j6, int i4) {
        this.scaleX = f4;
        this.scaleY = f5;
        this.alpha = f6;
        this.translationX = f7;
        this.translationY = f8;
        this.shadowElevation = f9;
        this.rotationX = f10;
        this.rotationY = f11;
        this.rotationZ = f12;
        this.cameraDistance = f13;
        this.transformOrigin = j4;
        this.shape = shape;
        this.clip = z3;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j5;
        this.spotShadowColor = j6;
        this.compositingStrategy = i4;
        this.layerBlock = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
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
                Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
                graphicsLayerScope.setScaleX(this.this$0.getScaleX());
                graphicsLayerScope.setScaleY(this.this$0.getScaleY());
                graphicsLayerScope.setAlpha(this.this$0.getAlpha());
                graphicsLayerScope.setTranslationX(this.this$0.getTranslationX());
                graphicsLayerScope.setTranslationY(this.this$0.getTranslationY());
                graphicsLayerScope.setShadowElevation(this.this$0.getShadowElevation());
                graphicsLayerScope.setRotationX(this.this$0.getRotationX());
                graphicsLayerScope.setRotationY(this.this$0.getRotationY());
                graphicsLayerScope.setRotationZ(this.this$0.getRotationZ());
                graphicsLayerScope.setCameraDistance(this.this$0.getCameraDistance());
                graphicsLayerScope.mo9347setTransformOrigin__ExYCQ(this.this$0.getTransformOrigin());
                graphicsLayerScope.setShape(this.this$0.getShape());
                graphicsLayerScope.setClip(this.this$0.getClip());
                graphicsLayerScope.setRenderEffect(this.this$0.getRenderEffect());
                graphicsLayerScope.mo9344setAmbientShadowColor8_81llA(this.this$0.getAmbientShadowColor());
                graphicsLayerScope.mo9346setSpotShadowColor8_81llA(this.this$0.getSpotShadowColor());
                graphicsLayerScope.mo9345setCompositingStrategyaDBOjCE(this.this$0.getCompositingStrategy());
            }
        };
    }
}
