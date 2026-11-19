package androidx.compose.p014ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Fields;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.layout.GraphicLayerInfo;
import androidx.compose.p014ui.node.OwnedLayer;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private InterfaceC9544p drawBlock;
    private boolean drawnWithZ;
    private InterfaceC9529a invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC9544p getMatrix = new InterfaceC9544p() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((DeviceRenderNode) obj, (Matrix) obj2);
            return C10786q.f26013a;
        }

        public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };
    private final OutlineResolver outlineResolver = new OutlineResolver();
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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

    public RenderNodeLayer(AndroidComposeView androidComposeView, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
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

    @Override // androidx.compose.p014ui.node.OwnedLayer
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

    @Override // androidx.compose.p014ui.node.OwnedLayer
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
        canvas.mo30733concat58bKbWc(this.matrixCache.m32670calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        InterfaceC9544p interfaceC9544p = this.drawBlock;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.p014ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.p014ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo32561getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m32670calculateMatrixGrdbGEg(this.renderNode);
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
        float[] fArrM32669calculateInverseMatrixbWbORWo = this.matrixCache.m32669calculateInverseMatrixbWbORWo(this.renderNode);
        if (fArrM32669calculateInverseMatrixbWbORWo != null) {
            androidx.compose.p014ui.graphics.Matrix.m31127timesAssign58bKbWc(fArr, fArrM32669calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo32563isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m32697isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        if (z10) {
            this.matrixCache.mapInverse(this.renderNode, mutableRect);
        } else {
            this.matrixCache.map(this.renderNode, mutableRect);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo32564mapOffset8S9VItk(long j10, boolean z10) {
        return z10 ? this.matrixCache.m32672mapInverseR5De75A(this.renderNode, j10) : this.matrixCache.m32671mapR5De75A(this.renderNode, j10);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo32565movegyyYBs(long j10) {
        int left = this.renderNode.getLeft();
        int top2 = this.renderNode.getTop();
        int iM33629getXimpl = IntOffset.m33629getXimpl(j10);
        int iM33630getYimpl = IntOffset.m33630getYimpl(j10);
        if (left == iM33629getXimpl && top2 == iM33630getYimpl) {
            return;
        }
        if (left != iM33629getXimpl) {
            this.renderNode.offsetLeftAndRight(iM33629getXimpl - left);
        }
        if (top2 != iM33630getYimpl) {
            this.renderNode.offsetTopAndBottom(iM33630getYimpl - top2);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo32566resizeozmzZPI(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.renderNode.setPivotX(TransformOrigin.m31264getPivotFractionXimpl(this.transformOrigin) * i10);
        this.renderNode.setPivotY(TransformOrigin.m31265getPivotFractionYimpl(this.transformOrigin) * i11);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i10, this.renderNode.getTop() + i11)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void reuseLayer(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo32567transform58bKbWc(float[] fArr) {
        androidx.compose.p014ui.graphics.Matrix.m31127timesAssign58bKbWc(fArr, this.matrixCache.m32670calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            final InterfaceC9544p interfaceC9544p = this.drawBlock;
            if (interfaceC9544p != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Canvas) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Canvas canvas) {
                        interfaceC9544p.invoke(canvas, null);
                    }
                });
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        InterfaceC9529a interfaceC9529a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        int i10 = mutatedFields$ui_release & 4096;
        if (i10 != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo31066getTransformOriginSzJe1aQ();
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
            this.renderNode.setAmbientShadowColor(ColorKt.m30932toArgb8_81llA(reusableGraphicsLayerScope.mo31062getAmbientShadowColor0d7_KjU()));
        }
        if ((mutatedFields$ui_release & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m30932toArgb8_81llA(reusableGraphicsLayerScope.mo31065getSpotShadowColor0d7_KjU()));
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
            this.renderNode.setPivotX(TransformOrigin.m31264getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m31265getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
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
            this.renderNode.mo32651setCompositingStrategyaDBOjCE(reusableGraphicsLayerScope.mo31063getCompositingStrategyNrFUSI());
        }
        boolean zM32698updateS_szKao = this.outlineResolver.m32698updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z12, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo31064getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z12 && !this.outlineResolver.getOutlineClipSupported()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zM32698updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (interfaceC9529a = this.invalidateParentLayer) != null) {
            interfaceC9529a.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
