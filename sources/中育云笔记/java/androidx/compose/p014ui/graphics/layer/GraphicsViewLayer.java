package androidx.compose.p014ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.p014ui.graphics.AndroidCanvas;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p014ui.graphics.BlendMode;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.RenderEffect;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.layer.CompositingStrategy;
import androidx.compose.p014ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;

    /* renamed from: x */
    private int f1180x;

    /* renamed from: y */
    private int f1181y;
    public static final Companion Companion = new Companion(null);
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        private Companion() {
        }
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j10;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z10 = mayRenderInSoftware;
        this.picture = z10 ? new Picture() : null;
        this.pictureDrawScope = z10 ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z10 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m33677getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m30820getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m31509getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m30653getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.Companion;
        this.ambientShadowColor = companion.m30904getBlack0d7_KjU();
        this.spotShadowColor = companion.m30904getBlack0d7_KjU();
        this.supportsSoftwareRendering = z10;
    }

    /* renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m31546applyCompositingLayerWpw9cng(int i10) {
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        boolean z10 = true;
        if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31511getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (CompositingStrategy.m31505equalsimpl0(i10, companion.m31510getModulateAlphake2Ky5w())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z10 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z10);
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

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m31505equalsimpl0(mo31534getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m31511getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m30789equalsimpl0(mo31533getBlendMode0nO6VwU(), BlendMode.Companion.m30820getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m31546applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m31511getOffscreenke2Ky5w());
        } else {
            m31546applyCompositingLayerWpw9cng(mo31534getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.p014ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
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
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
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
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
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
        CanvasHolder canvasHolder;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, interfaceC9540l);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                long j10 = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j10 >> 32), (int) (j10 & 4294967295L));
                try {
                    CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
                    if (canvasHolder2 != null) {
                        Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                        canvasHolder2.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long jM33684toSizeozmzZPI = IntSizeKt.m33684toSizeozmzZPI(this.size);
                            Density density2 = canvasDrawScope.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            androidx.compose.p014ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
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
                                drawContext2.setCanvas(canvas2);
                                drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer2);
                            } catch (Throwable th) {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas2);
                                drawContext3.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer2);
                                throw th;
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                        C10786q c10786q = C10786q.f26013a;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f10) {
        this.alpha = f10;
        this.viewLayer.setAlpha(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo31537setAmbientShadowColor8_81llA(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j10;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m30932toArgb8_81llA(j10));
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo31538setBlendModes9anfk8(int i10) {
        this.blendMode = i10;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m30730toPorterDuffModes9anfk8(i10)));
        updateLayerProperties();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f10) {
        this.viewLayer.setCameraDistance(f10 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z10) {
        boolean z11 = false;
        this.clipToBounds = z10 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z10 && this.outlineIsProvided) {
            z11 = true;
        }
        viewLayer.setClipToOutline(z11);
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
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo31541setPivotOffsetk4lQ0M(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo31542setPositionH0pRuoY(int i10, int i11, long j10) {
        if (IntSize.m33670equalsimpl0(this.size, j10)) {
            int i12 = this.f1180x;
            if (i12 != i10) {
                this.viewLayer.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f1181y;
            if (i13 != i11) {
                this.viewLayer.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (4294967295L & j10);
            this.viewLayer.layout(i10, i11, i10 + i14, i11 + i15);
            this.size = j10;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i14 / 2.0f);
                this.viewLayer.setPivotY(i15 / 2.0f);
            }
        }
        this.f1180x = i10;
        this.f1181y = i11;
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f10) {
        this.rotationX = f10;
        this.viewLayer.setRotationX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f10) {
        this.rotationY = f10;
        this.viewLayer.setRotationY(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f10) {
        this.rotationZ = f10;
        this.viewLayer.setRotation(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f10) {
        this.scaleX = f10;
        this.viewLayer.setScaleX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f10) {
        this.scaleY = f10;
        this.viewLayer.setScaleY(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f10) {
        this.shadowElevation = f10;
        this.viewLayer.setElevation(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo31543setSpotShadowColor8_81llA(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j10;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m30932toArgb8_81llA(j10));
        }
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f10) {
        this.translationX = f10;
        this.viewLayer.setTranslationX(f10);
    }

    @Override // androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f10) {
        this.translationY = f10;
        this.viewLayer.setTranslationY(f10);
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i10, AbstractC9972n abstractC9972n) {
        this(drawChildContainer, j10, (i10 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i10 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
