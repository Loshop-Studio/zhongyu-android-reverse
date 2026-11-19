package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Fields;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.GraphicLayerInfo;
import androidx.compose.p013ui.node.OwnedLayer;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private InterfaceC10574p drawBlock;
    private boolean drawnWithZ;
    private InterfaceC10559a invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC10574p getMatrix = new InterfaceC10574p() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((DeviceRenderNode) obj, (Matrix) obj2);
            return C8736p.f16368a;
        }

        public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };
    private final OutlineResolver outlineResolver = new OutlineResolver();
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    @RequiresApi(29)
    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.setHasOverlappingRendering(true);
        renderNodeApi29.setClipToBounds(false);
        this.renderNode = renderNodeApi29;
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
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

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z10 = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z10;
            if (z10) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top2 = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top2, right, bottom, Paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top2);
        canvas.mo24131concat58bKbWc(this.matrixCache.m26068calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        InterfaceC10574p interfaceC10574p = this.drawBlock;
        if (interfaceC10574p != null) {
            interfaceC10574p.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.p013ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.p013ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo25959getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m26068calculateMatrixGrdbGEg(this.renderNode);
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
        float[] fArrM26067calculateInverseMatrixbWbORWo = this.matrixCache.m26067calculateInverseMatrixbWbORWo(this.renderNode);
        if (fArrM26067calculateInverseMatrixbWbORWo != null) {
            androidx.compose.p013ui.graphics.Matrix.m24525timesAssign58bKbWc(fArr, fArrM26067calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo25961isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m26095isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        if (z10) {
            this.matrixCache.mapInverse(this.renderNode, mutableRect);
        } else {
            this.matrixCache.map(this.renderNode, mutableRect);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo25962mapOffset8S9VItk(long j10, boolean z10) {
        return z10 ? this.matrixCache.m26070mapInverseR5De75A(this.renderNode, j10) : this.matrixCache.m26069mapR5De75A(this.renderNode, j10);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo25963movegyyYBs(long j10) {
        int left = this.renderNode.getLeft();
        int top2 = this.renderNode.getTop();
        int iM27027getXimpl = IntOffset.m27027getXimpl(j10);
        int iM27028getYimpl = IntOffset.m27028getYimpl(j10);
        if (left == iM27027getXimpl && top2 == iM27028getYimpl) {
            return;
        }
        if (left != iM27027getXimpl) {
            this.renderNode.offsetLeftAndRight(iM27027getXimpl - left);
        }
        if (top2 != iM27028getYimpl) {
            this.renderNode.offsetTopAndBottom(iM27028getYimpl - top2);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo25964resizeozmzZPI(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.renderNode.setPivotX(TransformOrigin.m24662getPivotFractionXimpl(this.transformOrigin) * i10);
        this.renderNode.setPivotY(TransformOrigin.m24663getPivotFractionYimpl(this.transformOrigin) * i11);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i10, this.renderNode.getTop() + i11)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void reuseLayer(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo25965transform58bKbWc(float[] fArr) {
        androidx.compose.p013ui.graphics.Matrix.m24525timesAssign58bKbWc(fArr, this.matrixCache.m26068calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            final InterfaceC10574p interfaceC10574p = this.drawBlock;
            if (interfaceC10574p != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new InterfaceC10570l() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Canvas) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Canvas canvas) {
                        interfaceC10574p.invoke(canvas, null);
                    }
                });
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        InterfaceC10559a interfaceC10559a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i10 = mutatedFields$ui_release & 4096;
        if (i10 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo24464getTransformOriginSzJe1aQ();
        }
        boolean z10 = false;
        boolean z11 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields$ui_release & 1) != 0) {
            this.renderNode.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            this.renderNode.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            this.renderNode.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            this.renderNode.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            this.renderNode.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            this.renderNode.setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m24330toArgb8_81llA(reusableGraphicsLayerScope.mo24460getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m24330toArgb8_81llA(reusableGraphicsLayerScope.mo24463getSpotShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            this.renderNode.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            this.renderNode.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            this.renderNode.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            this.renderNode.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i10 != 0) {
            this.renderNode.setPivotX(TransformOrigin.m24662getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m24663getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z12 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.renderNode.setClipToOutline(z12);
            this.renderNode.setClipToBounds(reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields$ui_release) != 0) {
            this.renderNode.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((32768 & mutatedFields$ui_release) != 0) {
            this.renderNode.mo26049setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo24461getCompositingStrategyNrFUSI());
        }
        boolean zM26096updateS_szKao = this.outlineResolver.m26096updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z12, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo24462getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z12 && !this.outlineResolver.getOutlineClipSupported()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zM26096updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (interfaceC10559a = this.invalidateParentLayer) != null) {
            interfaceC10559a.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
