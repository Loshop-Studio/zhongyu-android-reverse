package androidx.compose.p014ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.graphics.AndroidCanvas;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.CompositingStrategy;
import androidx.compose.p014ui.graphics.Fields;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOrigin;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.layout.GraphicLayerInfo;
import androidx.compose.p014ui.node.OwnedLayer;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

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
    private InterfaceC9544p drawBlock;
    private boolean drawnWithZ;
    private InterfaceC9529a invalidateParentLayer;
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
    private static final InterfaceC9544p getMatrix = new InterfaceC9544p() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, (Matrix) obj2);
            return C10786q.f26013a;
        }

        public final void invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC9979u.m20292e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline androidOutline = ((ViewLayer) view).outlineResolver.getAndroidOutline();
            AbstractC9979u.m20291d(androidOutline);
            outline.set(androidOutline);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
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

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
        this.outlineResolver = new OutlineResolver();
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache<>(getMatrix);
        this.mTransformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
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
                AbstractC9979u.m20291d(rect2);
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

    @Override // androidx.compose.p014ui.node.OwnedLayer
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
        InterfaceC9544p interfaceC9544p = this.drawBlock;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(androidCanvas, null);
        }
        if (z10) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        setInvalidated(false);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void drawLayer(androidx.compose.p014ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
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

    @Override // androidx.compose.p014ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.layerId;
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
        return this.matrixCache.m32670calculateMatrixGrdbGEg(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.p014ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo32562inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM32669calculateInverseMatrixbWbORWo = this.matrixCache.m32669calculateInverseMatrixbWbORWo(this);
        if (fArrM32669calculateInverseMatrixbWbORWo != null) {
            androidx.compose.p014ui.graphics.Matrix.m31127timesAssign58bKbWc(fArr, fArrM32669calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo32563isInLayerk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m32697isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z10) {
        if (z10) {
            this.matrixCache.mapInverse(this, mutableRect);
        } else {
            this.matrixCache.map(this, mutableRect);
        }
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo32564mapOffset8S9VItk(long j10, boolean z10) {
        return z10 ? this.matrixCache.m32672mapInverseR5De75A(this, j10) : this.matrixCache.m32671mapR5De75A(this, j10);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo32565movegyyYBs(long j10) {
        int iM33629getXimpl = IntOffset.m33629getXimpl(j10);
        if (iM33629getXimpl != getLeft()) {
            offsetLeftAndRight(iM33629getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int iM33630getYimpl = IntOffset.m33630getYimpl(j10);
        if (iM33630getYimpl != getTop()) {
            offsetTopAndBottom(iM33630getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo32566resizeozmzZPI(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m31264getPivotFractionXimpl(this.mTransformOrigin) * i10);
        setPivotY(TransformOrigin.m31265getPivotFractionYimpl(this.mTransformOrigin) * i11);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void reuseLayer(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a) {
        this.container.addView(this);
        this.matrixCache.reset();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();
        this.drawBlock = interfaceC9544p;
        this.invalidateParentLayer = interfaceC9529a;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo32567transform58bKbWc(float[] fArr) {
        androidx.compose.p014ui.graphics.Matrix.m31127timesAssign58bKbWc(fArr, this.matrixCache.m32670calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.updateDisplayList(this);
        setInvalidated(false);
    }

    @Override // androidx.compose.p014ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        InterfaceC9529a interfaceC9529a;
        int mutatedFields$ui_release = reusableGraphicsLayerScope.getMutatedFields$ui_release() | this.mutatedFields;
        if ((mutatedFields$ui_release & 4096) != 0) {
            long jMo31066getTransformOriginSzJe1aQ = reusableGraphicsLayerScope.mo31066getTransformOriginSzJe1aQ();
            this.mTransformOrigin = jMo31066getTransformOriginSzJe1aQ;
            setPivotX(TransformOrigin.m31264getPivotFractionXimpl(jMo31066getTransformOriginSzJe1aQ) * getWidth());
            setPivotY(TransformOrigin.m31265getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
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
        boolean zM32698updateS_szKao = this.outlineResolver.m32698updateS_szKao(reusableGraphicsLayerScope.getOutline$ui_release(), reusableGraphicsLayerScope.getAlpha(), z12, reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.mo31064getSizeNHjbRc());
        if (this.outlineResolver.getCacheIsDirty$ui_release()) {
            updateOutlineResolver();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zM32698updateS_szKao)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (interfaceC9529a = this.invalidateParentLayer) != null) {
            interfaceC9529a.invoke();
        }
        if ((mutatedFields$ui_release & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((mutatedFields$ui_release & 64) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this, ColorKt.m30932toArgb8_81llA(reusableGraphicsLayerScope.mo31062getAmbientShadowColor0d7_KjU()));
            }
            if ((mutatedFields$ui_release & 128) != 0) {
                ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this, ColorKt.m30932toArgb8_81llA(reusableGraphicsLayerScope.mo31065getSpotShadowColor0d7_KjU()));
            }
        }
        if (i10 >= 31 && (131072 & mutatedFields$ui_release) != 0) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((mutatedFields$ui_release & 32768) != 0) {
            int iMo31063getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo31063getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m30962equalsimpl0(iMo31063getCompositingStrategyNrFUSI, companion.m30968getOffscreenNrFUSI())) {
                setLayerType(2, null);
            } else if (CompositingStrategy.m30962equalsimpl0(iMo31063getCompositingStrategyNrFUSI, companion.m30967getModulateAlphaNrFUSI())) {
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
