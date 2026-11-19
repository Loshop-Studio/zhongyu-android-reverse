package androidx.compose.p013ui.platform;

import android.os.Build;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.CompositingStrategy;
import androidx.compose.p013ui.graphics.Fields;
import androidx.compose.p013ui.graphics.GraphicsContext;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.MatrixKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p013ui.layout.GraphicLayerInfo;
import androidx.compose.p013ui.node.OwnedLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private InterfaceC10574p drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private InterfaceC10559a invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size;
    private Paint softwareLayerPaint;
    private final float[] matrixCache = Matrix.m24506constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final InterfaceC10570l recordLambda = new InterfaceC10570l() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C8736p.f16368a;
        }

        public final void invoke(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            InterfaceC10574p interfaceC10574p = graphicsLayerOwnerLayer.drawBlock;
            if (interfaceC10574p != null) {
                interfaceC10574p.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
        long j10 = Integer.MAX_VALUE;
        this.size = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m26063getInverseMatrix3i98HWw() {
        float[] fArrM24506constructorimpl$default = this.inverseMatrixCache;
        if (fArrM24506constructorimpl$default == null) {
            fArrM24506constructorimpl$default = Matrix.m24506constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM24506constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM24506constructorimpl$default[0])) {
                return null;
            }
            return fArrM24506constructorimpl$default;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM26064getMatrixsQKQjiQ = m26064getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return fArrM26064getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m26065invertToJiSxe2E(fArrM26064getMatrixsQKQjiQ, fArrM24506constructorimpl$default)) {
            return fArrM24506constructorimpl$default;
        }
        fArrM24506constructorimpl$default[0] = Float.NaN;
        return null;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m26064getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    private final void setDirty(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jM24114getCenteruvyYCjk = (graphicsLayer.m24917getPivotOffsetF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m24114getCenteruvyYCjk(IntSizeKt.m27082toSizeozmzZPI(this.size)) : graphicsLayer.m24917getPivotOffsetF1C5BW0();
            Matrix.m24516resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (jM24114getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (jM24114getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m24531isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        InterfaceC10559a interfaceC10559a;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (interfaceC10559a = this.invalidateParentLayer) == null) {
            return;
        }
        interfaceC10559a.invoke();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.p013ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.p013ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo25959getUnderlyingMatrixsQKQjiQ() {
        return m26064getMatrixsQKQjiQ();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo25960inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM26063getInverseMatrix3i98HWw = m26063getInverseMatrix3i98HWw();
        if (fArrM26063getInverseMatrix3i98HWw != null) {
            Matrix.m24525timesAssign58bKbWc(fArr, fArrM26063getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo25961isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        float[] fArrM26063getInverseMatrix3i98HWw = z10 ? m26063getInverseMatrix3i98HWw() : m26064getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM26063getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m24514mapimpl(fArrM26063getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo25962mapOffset8S9VItk(long j10, boolean z10) {
        float[] fArrM26064getMatrixsQKQjiQ;
        if (z10) {
            fArrM26064getMatrixsQKQjiQ = m26063getInverseMatrix3i98HWw();
            if (fArrM26064getMatrixsQKQjiQ == null) {
                return Offset.Companion.m24049getInfiniteF1C5BW0();
            }
        } else {
            fArrM26064getMatrixsQKQjiQ = m26064getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j10 : Matrix.m24512mapMKHz9U(fArrM26064getMatrixsQKQjiQ, j10);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo25963movegyyYBs(long j10) {
        this.graphicsLayer.m24929setTopLeftgyyYBs(j10);
        triggerRepaint();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo25964resizeozmzZPI(long j10) {
        if (IntSize.m27068equalsimpl0(j10, this.size)) {
            return;
        }
        this.size = j10;
        invalidate();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void reuseLayer(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            androidx.compose.p013ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.p013ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m24515resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m24515resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        long j10 = Integer.MAX_VALUE;
        this.size = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo25965transform58bKbWc(float[] fArr) {
        Matrix.m24525timesAssign58bKbWc(fArr, m26064getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m24661equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m24667getCenterSzJe1aQ()) && !IntSize.m27068equalsimpl0(this.graphicsLayer.m24918getSizeYbymL2g(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM24662getPivotFractionXimpl = TransformOrigin.m24662getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float fM24663getPivotFractionYimpl = TransformOrigin.m24663getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m24925setPivotOffsetk4lQ0M(Offset.m24027constructorimpl((Float.floatToRawIntBits(fM24663getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM24662getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m24921recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int iM24908getModulateAlphake2Ky5w;
        InterfaceC10559a interfaceC10559a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui_release();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui_release();
        int i10 = mutatedFields$ui_release & 4096;
        if (i10 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo24464getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (interfaceC10559a = this.invalidateParentLayer) != null) {
                interfaceC10559a.invoke();
            }
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.graphicsLayer.m24922setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo24460getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.graphicsLayer.m24928setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo24463getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i10 != 0) {
            if (TransformOrigin.m24661equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m24667getCenterSzJe1aQ())) {
                this.graphicsLayer.m24925setPivotOffsetk4lQ0M(Offset.Companion.m24050getUnspecifiedF1C5BW0());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM24662getPivotFractionXimpl = TransformOrigin.m24662getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m24925setPivotOffsetk4lQ0M(Offset.m24027constructorimpl((Float.floatToRawIntBits(TransformOrigin.m24663getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fM24662getPivotFractionXimpl) << 32)));
            }
        }
        if ((mutatedFields$ui_release & 16384) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int iMo24461getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo24461getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m24360equalsimpl0(iMo24461getCompositingStrategyNrFUSI, companion.m24364getAutoNrFUSI())) {
                iM24908getModulateAlphake2Ky5w = androidx.compose.p013ui.graphics.layer.CompositingStrategy.Companion.m24907getAutoke2Ky5w();
            } else if (CompositingStrategy.m24360equalsimpl0(iMo24461getCompositingStrategyNrFUSI, companion.m24366getOffscreenNrFUSI())) {
                iM24908getModulateAlphake2Ky5w = androidx.compose.p013ui.graphics.layer.CompositingStrategy.Companion.m24909getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m24360equalsimpl0(iMo24461getCompositingStrategyNrFUSI, companion.m24365getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM24908getModulateAlphake2Ky5w = androidx.compose.p013ui.graphics.layer.CompositingStrategy.Companion.m24908getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m24924setCompositingStrategyWpw9cng(iM24908getModulateAlphake2Ky5w);
        }
        boolean z10 = true;
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (AbstractC9133u.m16128b(this.outline, reusableGraphicsLayerScope.getOutline$ui_release())) {
            z10 = false;
        } else {
            this.outline = reusableGraphicsLayerScope.getOutline$ui_release();
            updateOutline();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
        if (mutatedFields$ui_release != 0 || z10) {
            triggerRepaint();
        }
    }
}
