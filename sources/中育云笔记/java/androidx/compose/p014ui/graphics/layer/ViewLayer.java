package androidx.compose.p014ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidCanvas;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class ViewLayer extends View {
    public static final Companion Companion = new Companion(null);
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    };
    private boolean canUseCompositingLayer;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private Density density;
    private InterfaceC9540l drawBlock;
    private boolean isInvalidated;
    private Outline layerOutline;
    private LayoutDirection layoutDirection;
    private final View ownerView;
    private GraphicsLayer parentLayer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics_release() {
            return ViewLayer.LayerOutlineProvider;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i10, AbstractC9972n abstractC9972n) {
        this(view, (i10 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i10 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        float height = getHeight();
        long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        InterfaceC9540l interfaceC9540l = this.drawBlock;
        Density density2 = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.p014ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo31350getSizeNHjbRc = canvasDrawScope.getDrawContext().mo31350getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(androidCanvas);
        drawContext.mo31351setSizeuvyYCjk(jM30697constructorimpl);
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
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.isInvalidated = false;
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
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.canUseCompositingLayer;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.canUseCompositingLayer != z10) {
            this.canUseCompositingLayer = z10;
            invalidate();
        }
    }

    public final void setDrawParams(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, InterfaceC9540l interfaceC9540l) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = interfaceC9540l;
        this.parentLayer = graphicsLayer;
    }

    public final void setInvalidated(boolean z10) {
        this.isInvalidated = z10;
    }

    public final boolean setLayerOutline(Outline outline) {
        this.layerOutline = outline;
        return OutlineUtils.INSTANCE.rebuildOutline(this);
    }

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }
}
