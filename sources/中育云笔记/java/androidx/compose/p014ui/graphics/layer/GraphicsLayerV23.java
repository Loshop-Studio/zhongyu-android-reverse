package androidx.compose.p014ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
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
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@RequiresApi(23)
/* loaded from: classes2.dex */
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean needToValidateAccess = new AtomicBoolean(true);
    private static boolean testFailCreateRenderNode;
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
    private final long layerId;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private long outlineSize;
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
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return GraphicsLayerV23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean z10) {
            GraphicsLayerV23.testFailCreateRenderNode = z10;
        }

        private Companion() {
        }
    }

    public GraphicsLayerV23(View view, long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j10;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        IntSize.Companion companion = IntSize.Companion;
        this.size = companion.m33677getZeroYbymL2g();
        this.outlineSize = companion.m33677getZeroYbymL2g();
        if (needToValidateAccess.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            verifyShadowColorProperties(renderNodeCreate);
            discardDisplayListInternal$ui_graphics_release();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        CompositingStrategy.Companion companion2 = CompositingStrategy.Companion;
        m31544applyCompositingStrategyWpw9cng(companion2.m31509getAutoke2Ky5w());
        this.compositingStrategy = companion2.m31509getAutoke2Ky5w();
        this.blendMode = BlendMode.Companion.m30820getSrcOver0nO6VwU();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m30652getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion3 = Color.Companion;
        this.ambientShadowColor = companion3.m30904getBlack0d7_KjU();
        this.spotShadowColor = companion3.m30904getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
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

    /* renamed from: applyCompositingStrategy-Wpw9cng, reason: not valid java name */
    private final void m31544applyCompositingStrategyWpw9cng(int i10) {
        RenderNode renderNode = this.renderNode;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31511getOffscreenke2Ky5w())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31510getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
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
        return (!CompositingStrategy.m31505equalsimpl0(mo31534getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m31511getOffscreenke2Ky5w()) && BlendMode.m30789equalsimpl0(mo31533getBlendMode0nO6VwU(), BlendMode.Companion.m30820getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m31544applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m31511getOffscreenke2Ky5w());
        } else {
            m31544applyCompositingStrategyWpw9cng(mo31534getCompositingStrategyke2Ky5w());
        }
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
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
        discardDisplayListInternal$ui_graphics_release();
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        DisplayListCanvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        AbstractC9979u.m20292e(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.renderNode);
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
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
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
        android.graphics.Canvas canvasStart = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & 4294967295L), (int) (this.outlineSize & 4294967295L)));
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvasStart);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
            long jM33684toSizeozmzZPI = IntSizeKt.m33684toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
            long jMo31350getSizeNHjbRc = canvasDrawScope.getDrawContext().mo31350getSizeNHjbRc();
            GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(androidCanvas);
            drawContext.mo31351setSizeuvyYCjk(jM33684toSizeozmzZPI);
            drawContext.setGraphicsLayer(graphicsLayer);
            androidCanvas.save();
            try {
                interfaceC9540l.invoke(canvasDrawScope);
                androidCanvas.restore();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                this.renderNode.end(canvasStart);
                setInvalidated(false);
            } catch (Throwable th) {
                androidCanvas.restore();
                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer2);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j10;
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, ColorKt.m30932toArgb8_81llA(j10));
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo31538setBlendModes9anfk8(int i10) {
        if (BlendMode.m30789equalsimpl0(this.blendMode, i10)) {
            return;
        }
        this.blendMode = i10;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m30730toPorterDuffModes9anfk8(i10)));
        updateLayerProperties();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(-f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z10) {
        this.clip = z10;
        applyClip();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (colorFilter == null) {
            updateLayerProperties();
            return;
        }
        m31544applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m31511getOffscreenke2Ky5w());
        RenderNode renderNode = this.renderNode;
        Paint paintObtainLayerPaint = obtainLayerPaint();
        paintObtainLayerPaint.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
        renderNode.setLayerPaint(paintObtainLayerPaint);
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
        this.outlineSize = j10;
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo31541setPivotOffsetk4lQ0M(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo31542setPositionH0pRuoY(int i10, int i11, long j10) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (4294967295L & j10);
        this.renderNode.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (IntSize.m33670equalsimpl0(this.size, j10)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i12 / 2.0f);
            this.renderNode.setPivotY(i13 / 2.0f);
        }
        this.size = j10;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
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
        this.renderNode.setRotation(f10);
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j10;
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, ColorKt.m30932toArgb8_81llA(j10));
        }
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

    public /* synthetic */ GraphicsLayerV23(View view, long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i10, AbstractC9972n abstractC9972n) {
        this(view, j10, (i10 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i10 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
