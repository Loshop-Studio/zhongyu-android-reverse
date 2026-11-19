package androidx.compose.p014ui.graphics;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable = 0;
    private boolean clip;
    private int mutatedFields;
    private Outline outline;
    private RenderEffect renderEffect;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float shadowElevation;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float alpha = 1.0f;
    private long ambientShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private long spotShadowColor = GraphicsLayerScopeKt.getDefaultShadowColor();
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
    private Shape shape = RectangleShapeKt.getRectangleShape();
    private int compositingStrategy = CompositingStrategy.Companion.m30966getAutoNrFUSI();
    private long size = Size.Companion.m30714getUnspecifiedNHjbRc();
    private Density graphicsDensity = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo31062getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo31063getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final Density getGraphicsDensity$ui_release() {
        return this.graphicsDensity;
    }

    public final LayoutDirection getLayoutDirection$ui_release() {
        return this.layoutDirection;
    }

    public final int getMutatedFields$ui_release() {
        return this.mutatedFields;
    }

    public final Outline getOutline$ui_release() {
        return this.outline;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo31064getSizeNHjbRc() {
        return this.size;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo31065getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo31066getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.translationY;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo31067setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo31069setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo31070setTransformOrigin__ExYCQ(TransformOrigin.Companion.m31269getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo31068setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m30966getAutoNrFUSI());
        m31190setSizeuvyYCjk(Size.Companion.m30714getUnspecifiedNHjbRc());
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setAlpha(float f10) {
        if (this.alpha == f10) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo31067setAmbientShadowColor8_81llA(long j10) {
        if (Color.m30879equalsimpl0(this.ambientShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f10) {
        if (this.cameraDistance == f10) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setClip(boolean z10) {
        if (this.clip != z10) {
            this.mutatedFields |= 16384;
            this.clip = z10;
        }
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo31068setCompositingStrategyaDBOjCE(int i10) {
        if (CompositingStrategy.m30962equalsimpl0(this.compositingStrategy, i10)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i10;
    }

    public final void setGraphicsDensity$ui_release(Density density) {
        this.graphicsDensity = density;
    }

    public final void setLayoutDirection$ui_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setMutatedFields$ui_release(int i10) {
        this.mutatedFields = i10;
    }

    @VisibleForTesting
    public final void setOutline$ui_release(Outline outline) {
        this.outline = outline;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setRenderEffect(RenderEffect renderEffect) {
        if (AbstractC9979u.m20289b(this.renderEffect, renderEffect)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setRotationX(float f10) {
        if (this.rotationX == f10) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setRotationY(float f10) {
        if (this.rotationY == f10) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f10) {
        if (this.rotationZ == f10) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setScaleX(float f10) {
        if (this.scaleX == f10) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setScaleY(float f10) {
        if (this.scaleY == f10) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f10) {
        if (this.shadowElevation == f10) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setShape(Shape shape) {
        if (AbstractC9979u.m20289b(this.shape, shape)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = shape;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public void m31190setSizeuvyYCjk(long j10) {
        this.size = j10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo31069setSpotShadowColor8_81llA(long j10) {
        if (Color.m30879equalsimpl0(this.spotShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo31070setTransformOrigin__ExYCQ(long j10) {
        if (TransformOrigin.m31263equalsimpl0(this.transformOrigin, j10)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f10) {
        if (this.translationX == f10) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f10;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f10) {
        if (this.translationY == f10) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f10;
    }

    public final void updateOutline$ui_release() {
        this.outline = getShape().mo27009createOutlinePq9zytI(mo31064getSizeNHjbRc(), this.layoutDirection, this.graphicsDensity);
    }
}
