package androidx.compose.p011ui.graphics;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020 *\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0016\u00103\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J\u0016\u0010;\u001a\u00020\u0016HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00102J\u0016\u0010=\u001a\u00020\u0016HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u00102J\u0016\u0010@\u001a\u00020\u0019HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J¿\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010?J\u001a\u0010K\u001a\u00020\u00122\b\u0010J\u001a\u0004\u0018\u00010IHÖ\u0003¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bO\u0010'R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010M\u001a\u0004\bP\u0010'R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bQ\u0010'R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bR\u0010'R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bS\u0010'R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bT\u0010'R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bU\u0010'R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bV\u0010'R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bW\u0010'R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b[\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\\\u001a\u0004\b]\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\b_\u00109R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\b`\u00102R\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\ba\u00102R\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010b\u001a\u0004\bc\u0010?\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006d"}, m5110d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/e;)V", "create", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "node", "Ld6/s;", "update", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11-SzJe1aQ", "()J", "component11", "component12", "()Landroidx/compose/ui/graphics/Shape;", "component13", "()Z", "component14", "()Landroidx/compose/ui/graphics/RenderEffect;", "component15-0d7_KjU", "component15", "component16-0d7_KjU", "component16", "component17--NrFUSI", "()I", "component17", "copy-JVvOYNQ", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/graphics/GraphicsLayerElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getScaleX", "getScaleY", "getAlpha", "getTranslationX", "getTranslationY", "getShadowElevation", "getRotationX", "getRotationY", "getRotationZ", "getCameraDistance", "J", "getTransformOrigin-SzJe1aQ", "Landroidx/compose/ui/graphics/Shape;", "getShape", "Z", "getClip", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "getAmbientShadowColor-0d7_KjU", "getSpotShadowColor-0d7_KjU", "I", "getCompositingStrategy--NrFUSI", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;

    @Nullable
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;

    @NotNull
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect, long j8, long j9, int i, AbstractC5824e abstractC5824e) {
        this(f, f7, f8, f9, f10, f11, f12, f13, f14, f15, j7, shape, z8, renderEffect, j8, j9, i);
    }

    /* renamed from: copy-JVvOYNQ$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m10829copyJVvOYNQ$default(GraphicsLayerElement graphicsLayerElement, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect, long j8, long j9, int i, int i8, Object obj) {
        int i9;
        long j10;
        float f16 = (i8 & 1) != 0 ? graphicsLayerElement.scaleX : f;
        float f17 = (i8 & 2) != 0 ? graphicsLayerElement.scaleY : f7;
        float f18 = (i8 & 4) != 0 ? graphicsLayerElement.alpha : f8;
        float f19 = (i8 & 8) != 0 ? graphicsLayerElement.translationX : f9;
        float f20 = (i8 & 16) != 0 ? graphicsLayerElement.translationY : f10;
        float f21 = (i8 & 32) != 0 ? graphicsLayerElement.shadowElevation : f11;
        float f22 = (i8 & 64) != 0 ? graphicsLayerElement.rotationX : f12;
        float f23 = (i8 & 128) != 0 ? graphicsLayerElement.rotationY : f13;
        float f24 = (i8 & 256) != 0 ? graphicsLayerElement.rotationZ : f14;
        float f25 = (i8 & 512) != 0 ? graphicsLayerElement.cameraDistance : f15;
        long j11 = (i8 & 1024) != 0 ? graphicsLayerElement.transformOrigin : j7;
        Shape shape2 = (i8 & 2048) != 0 ? graphicsLayerElement.shape : shape;
        boolean z9 = (i8 & 4096) != 0 ? graphicsLayerElement.clip : z8;
        float f26 = f16;
        RenderEffect renderEffect2 = (i8 & 8192) != 0 ? graphicsLayerElement.renderEffect : renderEffect;
        long j12 = (i8 & 16384) != 0 ? graphicsLayerElement.ambientShadowColor : j8;
        long j13 = (i8 & 32768) != 0 ? graphicsLayerElement.spotShadowColor : j9;
        if ((i8 & 65536) != 0) {
            j10 = j13;
            i9 = graphicsLayerElement.compositingStrategy;
        } else {
            i9 = i;
            j10 = j13;
        }
        return graphicsLayerElement.m10834copyJVvOYNQ(f26, f17, f18, f19, f20, f21, f22, f23, f24, f25, j11, shape2, z9, renderEffect2, j12, j10, i9);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component10, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: component11-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: component17--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: component2, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: component5, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: component6, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: component7, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component8, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component9, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @NotNull
    /* renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m10834copyJVvOYNQ(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @NotNull Shape shape, boolean clip, @Nullable RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        return new GraphicsLayerElement(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m11067equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && AbstractC5830k.m5325b(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && AbstractC5830k.m5325b(this.renderEffect, graphicsLayerElement.renderEffect) && Color.m10683equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m10683equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m10766equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m10835getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m10836getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Nullable
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

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m10837getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m10838getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.clip, (this.shape.hashCode() + ((TransformOrigin.m11070hashCodeimpl(this.transformOrigin) + AbstractC0584a.m901b(this.cameraDistance, AbstractC0584a.m901b(this.rotationZ, AbstractC0584a.m901b(this.rotationY, AbstractC0584a.m901b(this.rotationX, AbstractC0584a.m901b(this.shadowElevation, AbstractC0584a.m901b(this.translationY, AbstractC0584a.m901b(this.translationX, AbstractC0584a.m901b(this.alpha, AbstractC0584a.m901b(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31);
        RenderEffect renderEffect = this.renderEffect;
        return CompositingStrategy.m10767hashCodeimpl(this.compositingStrategy) + AbstractC0584a.m904e(this.spotShadowColor, AbstractC0584a.m904e(this.ambientShadowColor, (iM908i + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31, 31), 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m11060boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        AbstractC0584a.m910k(this.clip, inspectorInfo.getProperties(), "clip", inspectorInfo).set("renderEffect", this.renderEffect);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m10672boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m10672boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m10763boximpl(this.compositingStrategy));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m11071toStringimpl(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", ambientShadowColor=");
        AbstractC0584a.m919t(this.ambientShadowColor, ", spotShadowColor=", sb);
        AbstractC0584a.m919t(this.spotShadowColor, ", compositingStrategy=", sb);
        sb.append((Object) CompositingStrategy.m10768toStringimpl(this.compositingStrategy));
        sb.append(')');
        return sb.toString();
    }

    private GraphicsLayerElement(float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, long j7, Shape shape, boolean z8, RenderEffect renderEffect, long j8, long j9, int i) {
        this.scaleX = f;
        this.scaleY = f7;
        this.alpha = f8;
        this.translationX = f9;
        this.translationY = f10;
        this.shadowElevation = f11;
        this.rotationX = f12;
        this.rotationY = f13;
        this.rotationZ = f14;
        this.cameraDistance = f15;
        this.transformOrigin = j7;
        this.shape = shape;
        this.clip = z8;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j8;
        this.spotShadowColor = j9;
        this.compositingStrategy = i;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public SimpleGraphicsLayerModifier getNode() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull SimpleGraphicsLayerModifier node) {
        node.setScaleX(this.scaleX);
        node.setScaleY(this.scaleY);
        node.setAlpha(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.setShadowElevation(this.shadowElevation);
        node.setRotationX(this.rotationX);
        node.setRotationY(this.rotationY);
        node.setRotationZ(this.rotationZ);
        node.setCameraDistance(this.cameraDistance);
        node.m11016setTransformOrigin__ExYCQ(this.transformOrigin);
        node.setShape(this.shape);
        node.setClip(this.clip);
        node.setRenderEffect(this.renderEffect);
        node.m11013setAmbientShadowColor8_81llA(this.ambientShadowColor);
        node.m11015setSpotShadowColor8_81llA(this.spotShadowColor);
        node.m11014setCompositingStrategyaDBOjCE(this.compositingStrategy);
        node.invalidateLayerBlock();
    }
}
