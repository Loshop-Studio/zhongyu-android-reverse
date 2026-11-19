package androidx.compose.p014ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.AbstractC1392k;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.p014ui.graphics.AndroidCanvas;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.RenderEffect;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.layer.CompositingStrategy;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@RequiresApi(29)
/* loaded from: classes2.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j10;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeM913a = AbstractC1392k.m913a("graphicsLayer");
        this.renderNode = renderNodeM913a;
        this.size = Size.Companion.m30715getZeroNHjbRc();
        renderNodeM913a.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        m31545applyCompositingStrategyZ1X6vPc(renderNodeM913a, companion.m31509getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.Companion.m30820getSrcOver0nO6VwU();
        this.pivotOffset = Offset.Companion.m30652getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.Companion;
        this.ambientShadowColor = companion2.m30904getBlack0d7_KjU();
        this.spotShadowColor = companion2.m30904getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.m31509getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    private final void applyClip() {
        boolean z10 = false;
        boolean z11 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z10 = true;
        }
        if (z11 != this.clipToBounds) {
            this.clipToBounds = z11;
            this.renderNode.setClipToBounds(z11);
        }
        if (z10 != this.clipToOutline) {
            this.clipToOutline = z10;
            this.renderNode.setClipToOutline(z10);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m31545applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i10) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31511getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31510getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m31505equalsimpl0(mo31534getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m31511getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m30789equalsimpl0(mo31533getBlendMode0nO6VwU(), BlendMode.Companion.m30820getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m31545applyCompositingStrategyZ1X6vPc(this.renderNode, CompositingStrategy.Companion.m31511getOffscreenke2Ky5w());
        } else {
            m31545applyCompositingStrategyZ1X6vPc(this.renderNode, mo31534getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo31532getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU */
    public int mo31533getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo31534getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0 */
    public long mo31535getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo31536getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, InterfaceC9540l interfaceC9540l) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(graphicsLayer);
            drawContext.mo31351setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            interfaceC9540l.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f10) {
        this.alpha = f10;
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo31537setAmbientShadowColor8_81llA(long j10) {
        this.ambientShadowColor = j10;
        this.renderNode.setAmbientShadowColor(ColorKt.m30932toArgb8_81llA(j10));
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo31538setBlendModes9anfk8(int i10) {
        this.blendMode = i10;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m30729toAndroidBlendModes9anfk8(i10));
        updateLayerProperties();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z10) {
        this.clip = z10;
        applyClip();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo31539setCompositingStrategyWpw9cng(int i10) {
        this.compositingStrategy = i10;
        updateLayerProperties();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z10) {
        this.isInvalidated = z10;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo31540setOutlineO0kMr_c(Outline outline, long j10) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo31541setPivotOffsetk4lQ0M(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo31542setPositionH0pRuoY(int i10, int i11, long j10) {
        this.renderNode.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (4294967295L & j10)) + i11);
        this.size = IntSizeKt.m33684toSizeozmzZPI(j10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f10) {
        this.rotationX = f10;
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f10) {
        this.rotationY = f10;
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f10) {
        this.rotationZ = f10;
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f10) {
        this.scaleX = f10;
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f10) {
        this.scaleY = f10;
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f10) {
        this.shadowElevation = f10;
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo31543setSpotShadowColor8_81llA(long j10) {
        this.spotShadowColor = j10;
        this.renderNode.setSpotShadowColor(ColorKt.m30932toArgb8_81llA(j10));
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f10) {
        this.translationX = f10;
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f10) {
        this.translationY = f10;
        this.renderNode.setTranslationY(f10);
    }

    public /* synthetic */ GraphicsLayerV29(long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i10, AbstractC9972n abstractC9972n) {
        this(j10, (i10 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i10 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
