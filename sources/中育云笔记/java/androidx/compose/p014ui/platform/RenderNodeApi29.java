package androidx.compose.p014ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.AbstractC1392k;
import androidx.compose.p014ui.graphics.AndroidCanvas;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.CompositingStrategy;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.RenderEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
@RequiresApi(29)
/* loaded from: classes2.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;
    private RenderEffect internalRenderEffect;
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode = AbstractC1392k.m913a("Compose");
    private int internalCompositingStrategy = CompositingStrategy.Companion.m30966getAutoNrFUSI();

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void drawInto(Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getAmbientShadowColor(), this.renderNode.getSpotShadowColor(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha(), this.internalRenderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return this.renderNode.getAmbientShadowColor();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo32650getCompositingStrategyNrFUSI() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void getInverseMatrix(Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void getMatrix(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public RenderEffect getRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotationZ();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return this.renderNode.getSpotShadowColor();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.renderNode.hasOverlappingRendering();
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return this.renderNode.getUseCompositingLayer();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i10) {
        this.renderNode.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i10) {
        this.renderNode.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder, Path path, InterfaceC9540l interfaceC9540l) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            androidx.compose.p014ui.graphics.Canvas.m30849clipPathmtrdDE$default(androidCanvas, path, 0, 2, null);
        }
        interfaceC9540l.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setAlpha(float f10) {
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i10) {
        this.renderNode.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setCameraDistance(float f10) {
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z10) {
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z10) {
        this.renderNode.setClipToOutline(z10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo32651setCompositingStrategyaDBOjCE(int i10) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m30962equalsimpl0(i10, companion.m30968getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m30962equalsimpl0(i10, companion.m30967getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i10;
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setElevation(float f10) {
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z10) {
        return this.renderNode.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setPivotX(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setPivotY(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public boolean setPosition(int i10, int i11, int i12, int i13) {
        return this.renderNode.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setRenderEffect(RenderEffect renderEffect) {
        this.internalRenderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setRotationX(float f10) {
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setRotationY(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setRotationZ(float f10) {
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setScaleX(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setScaleY(float f10) {
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i10) {
        this.renderNode.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setTranslationX(float f10) {
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.p014ui.platform.DeviceRenderNode
    public void setTranslationY(float f10) {
        this.renderNode.setTranslationY(f10);
    }
}
