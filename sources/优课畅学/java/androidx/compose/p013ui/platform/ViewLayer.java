package androidx.compose.p013ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.graphics.AndroidCanvas;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.CompositingStrategy;
import androidx.compose.p013ui.graphics.Fields;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.GraphicLayerInfo;
import androidx.compose.p013ui.node.OwnedLayer;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private InterfaceC10574p drawBlock;
    private boolean drawnWithZ;
    private InterfaceC10559a invalidateParentLayer;
    private boolean isInvalidated;
    private final long layerId;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final LayerMatrixCache<View> matrixCache;
    private int mutatedFields;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC10574p getMatrix = new InterfaceC10574p() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, (Matrix) obj2);
            return C8736p.f16368a;
        }

        public final void invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC9133u.m16131e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline androidOutline = ((ViewLayer) view).outlineResolver.getAndroidOutline();
            AbstractC9133u.m16130d(androidOutline);
            outline.set(androidOutline);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z10) {
            ViewLayer.shouldUseDispatchDraw = z10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(View view) {
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
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

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC9133u.m16130d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getAndroidOutline() != null ? OutlineProvider : null);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z10 = true;
        }
        InterfaceC10574p interfaceC10574p = this.drawBlock;
        if (interfaceC10574p != null) {
            interfaceC10574p.invoke(androidCanvas, null);
        }
        if (z10) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void drawLayer(androidx.compose.p013ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z10 = getElevation() > 0.0f;
        this.drawnWithZ = z10;
        if (z10) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    @Override // androidx.compose.p013ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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
        return this.matrixCache.m26068calculateMatrixGrdbGEg(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.p013ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo25960inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM26067calculateInverseMatrixbWbORWo = this.matrixCache.m26067calculateInverseMatrixbWbORWo(this);
        if (fArrM26067calculateInverseMatrixbWbORWo != null) {
            androidx.compose.p013ui.graphics.Matrix.m24525timesAssign58bKbWc(fArr, fArrM26067calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo25961isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m26095isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        if (z10) {
            this.matrixCache.mapInverse(this, mutableRect);
        } else {
            this.matrixCache.map(this, mutableRect);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo25962mapOffset8S9VItk(long j10, boolean z10) {
        return z10 ? this.matrixCache.m26070mapInverseR5De75A(this, j10) : this.matrixCache.m26069mapR5De75A(this, j10);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo25963movegyyYBs(long j10) {
        int iM27027getXimpl = IntOffset.m27027getXimpl(j10);
        if (iM27027getXimpl != getLeft()) {
            offsetLeftAndRight(iM27027getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int iM27028getYimpl = IntOffset.m27028getYimpl(j10);
        if (iM27028getYimpl != getTop()) {
            offsetTopAndBottom(iM27028getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo25964resizeozmzZPI(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m24662getPivotFractionXimpl(this.mTransformOrigin) * i10);
        setPivotY(TransformOrigin.m24663getPivotFractionYimpl(this.mTransformOrigin) * i11);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void reuseLayer(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m24667getCenterSzJe1aQ();
        this.drawBlock = interfaceC10574p;
        this.invalidateParentLayer = interfaceC10559a;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo25965transform58bKbWc(float[] fArr) {
        androidx.compose.p013ui.graphics.Matrix.m24525timesAssign58bKbWc(fArr, this.matrixCache.m26068calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        InterfaceC10559a interfaceC10559a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long jMo24464getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo24464getTransformOriginSzJe1aQ();
            this.mTransformOrigin = jMo24464getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m24662getPivotFractionXimpl(jMo24464getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m24663getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields$ui_release & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui_release & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui_release & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui_release & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui_release & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui_release & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.getShadowElevation());
        }
        if ((mutatedFields$ui_release & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui_release & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui_release & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui_release & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.getCameraDistance());
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields$ui_release & 24576) != 0) {
            this.clipToBounds = reusableGraphicsLayerScope.getClip() && reusableGraphicsLayerScope.getShape() == RectangleShapeKt.getRectangleShape();
            resetClipBounds();
            setClipToOutline(z12);
        }
        boolean zM26096updateS_szKao = this.outlineResolver.m26096updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z12, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo24462getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zM26096updateS_szKao)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (interfaceC10559a = this.invalidateParentLayer) != null) {
            interfaceC10559a.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m24330toArgb8_81llA(reusableGraphicsLayerScope.mo24460getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m24330toArgb8_81llA(reusableGraphicsLayerScope.mo24463getSpotShadowColor0d7_KjU()));
            }
        }
        if (i10 >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & 32768) != 0) {
            int iMo24461getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo24461getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m24360equalsimpl0(iMo24461getCompositingStrategyNrFUSI, companion.m24366getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m24360equalsimpl0(iMo24461getCompositingStrategyNrFUSI, companion.m24365getModulateAlphaNrFUSI())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z10;
            } else {
                setLayerType(0, null);
            }
            z10 = true;
            this.mHasOverlappingRendering = z10;
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui_release();
    }
}
