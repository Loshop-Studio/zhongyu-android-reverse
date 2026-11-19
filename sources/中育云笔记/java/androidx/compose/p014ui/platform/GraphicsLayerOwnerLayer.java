package androidx.compose.p014ui.platform;

import android.os.Build;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.CompositingStrategy;
import androidx.compose.p014ui.graphics.Fields;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.MatrixKt;
import androidx.compose.p014ui.graphics.Outline;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p014ui.layout.GraphicLayerInfo;
import androidx.compose.p014ui.node.OwnedLayer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private InterfaceC9544p drawBlock;
    private boolean drawnWithEnabledZ;
    private GraphicsLayer graphicsLayer;
    private InterfaceC9529a invalidateParentLayer;
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
    private final float[] matrixCache = Matrix.m31108constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final InterfaceC9540l recordLambda = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            InterfaceC9544p interfaceC9544p = graphicsLayerOwnerLayer.drawBlock;
            if (interfaceC9544p != null) {
                interfaceC9544p.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
        long j10 = Integer.MAX_VALUE;
        this.size = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m32665getInverseMatrix3i98HWw() {
        float[] fArrM31108constructorimpl$default = this.inverseMatrixCache;
        if (fArrM31108constructorimpl$default == null) {
            fArrM31108constructorimpl$default = Matrix.m31108constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM31108constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM31108constructorimpl$default[0])) {
                return null;
            }
            return fArrM31108constructorimpl$default;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM32666getMatrixsQKQjiQ = m32666getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return fArrM32666getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m32667invertToJiSxe2E(fArrM32666getMatrixsQKQjiQ, fArrM31108constructorimpl$default)) {
            return fArrM31108constructorimpl$default;
        }
        fArrM31108constructorimpl$default[0] = Float.NaN;
        return null;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m32666getMatrixsQKQjiQ() {
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
            long jM30716getCenteruvyYCjk = (graphicsLayer.m31519getPivotOffsetF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m30716getCenteruvyYCjk(IntSizeKt.m33684toSizeozmzZPI(this.size)) : graphicsLayer.m31519getPivotOffsetF1C5BW0();
            Matrix.m31118resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (jM30716getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m31133isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        InterfaceC9529a interfaceC9529a;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (interfaceC9529a = this.invalidateParentLayer) == null) {
            return;
        }
        interfaceC9529a.invoke();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
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

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.p014ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.p014ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo32561getUnderlyingMatrixsQKQjiQ() {
        return m32666getMatrixsQKQjiQ();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo32562inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM32665getInverseMatrix3i98HWw = m32665getInverseMatrix3i98HWw();
        if (fArrM32665getInverseMatrix3i98HWw != null) {
            Matrix.m31127timesAssign58bKbWc(fArr, fArrM32665getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo32563isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        float[] fArrM32665getInverseMatrix3i98HWw = z10 ? m32665getInverseMatrix3i98HWw() : m32666getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM32665getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m31116mapimpl(fArrM32665getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo32564mapOffset8S9VItk(long j10, boolean z10) {
        float[] fArrM32666getMatrixsQKQjiQ;
        if (z10) {
            fArrM32666getMatrixsQKQjiQ = m32665getInverseMatrix3i98HWw();
            if (fArrM32666getMatrixsQKQjiQ == null) {
                return Offset.Companion.m30651getInfiniteF1C5BW0();
            }
        } else {
            fArrM32666getMatrixsQKQjiQ = m32666getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j10 : Matrix.m31114mapMKHz9U(fArrM32666getMatrixsQKQjiQ, j10);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo32565movegyyYBs(long j10) {
        this.graphicsLayer.m31531setTopLeftgyyYBs(j10);
        triggerRepaint();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo32566resizeozmzZPI(long j10) {
        if (IntSize.m33670equalsimpl0(j10, this.size)) {
            return;
        }
        this.size = j10;
        invalidate();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void reuseLayer(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m31117resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m31117resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        long j10 = Integer.MAX_VALUE;
        this.size = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo32567transform58bKbWc(float[] fArr) {
        Matrix.m31127timesAssign58bKbWc(fArr, m32666getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m31263equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m31269getCenterSzJe1aQ()) && !IntSize.m33670equalsimpl0(this.graphicsLayer.m31520getSizeYbymL2g(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM31264getPivotFractionXimpl = TransformOrigin.m31264getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float fM31265getPivotFractionYimpl = TransformOrigin.m31265getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m31527setPivotOffsetk4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(fM31265getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM31264getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m31523recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int iM31510getModulateAlphake2Ky5w;
        InterfaceC9529a interfaceC9529a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui_release();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui_release();
        int i10 = mutatedFields$ui_release & 4096;
        if (i10 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo31066getTransformOriginSzJe1aQ();
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
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (interfaceC9529a = this.invalidateParentLayer) != null) {
                interfaceC9529a.invoke();
            }
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.graphicsLayer.m31524setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo31062getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.graphicsLayer.m31530setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo31065getSpotShadowColor0d7_KjU());
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
            if (TransformOrigin.m31263equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m31269getCenterSzJe1aQ())) {
                this.graphicsLayer.m31527setPivotOffsetk4lQ0M(Offset.Companion.m30652getUnspecifiedF1C5BW0());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM31264getPivotFractionXimpl = TransformOrigin.m31264getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m31527setPivotOffsetk4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(TransformOrigin.m31265getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fM31264getPivotFractionXimpl) << 32)));
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
            int iMo31063getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo31063getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m30962equalsimpl0(iMo31063getCompositingStrategyNrFUSI, companion.m30966getAutoNrFUSI())) {
                iM31510getModulateAlphake2Ky5w = androidx.compose.p014ui.graphics.layer.CompositingStrategy.Companion.m31509getAutoke2Ky5w();
            } else if (CompositingStrategy.m30962equalsimpl0(iMo31063getCompositingStrategyNrFUSI, companion.m30968getOffscreenNrFUSI())) {
                iM31510getModulateAlphake2Ky5w = androidx.compose.p014ui.graphics.layer.CompositingStrategy.Companion.m31511getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m30962equalsimpl0(iMo31063getCompositingStrategyNrFUSI, companion.m30967getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM31510getModulateAlphake2Ky5w = androidx.compose.p014ui.graphics.layer.CompositingStrategy.Companion.m31510getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m31526setCompositingStrategyWpw9cng(iM31510getModulateAlphake2Ky5w);
        }
        boolean z10 = true;
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (AbstractC9979u.m20289b(this.outline, reusableGraphicsLayerScope.getOutline$ui_release())) {
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
