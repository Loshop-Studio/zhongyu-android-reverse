package androidx.compose.p011ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.CanvasHolder;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.Fields;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.RectangleShapeKt;
import androidx.compose.p011ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOrigin;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.layout.GraphicLayerInfo;
import androidx.compose.p011ui.node.OwnedLayer;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0001\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002ijBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00128\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010#J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u0013J!\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010\u0013J\"\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b4\u00105JW\u00106\u001a\u00020\f28\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b6\u00107J\u001a\u0010<\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010ARJ\u0010\r\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010BR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010CR$\u0010E\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010M\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010bR\u001a\u0010h\u001a\u0002088VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, m5110d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Ld6/s;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lr6/e;Lr6/a;)V", "triggerRepaint", "()V", "clipRenderNode", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lr6/e;Lr6/a;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lr6/e;", "Lr6/a;", "value", "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "J", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "", "mutatedFields", "I", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "Companion", "UniqueDrawingIdApi29", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RequiresApi(23)
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n65#2:403\n69#2:406\n60#3:404\n70#3:407\n85#3:410\n90#3:412\n22#4:405\n22#4:408\n54#5:409\n59#5:411\n1#6:413\n*S KotlinDebug\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n*L\n196#1:403\n197#1:406\n196#1:404\n197#1:407\n210#1:410\n211#1:412\n196#1:405\n197#1:408\n210#1:409\n211#1:411\n*E\n"})
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {

    @Nullable
    private InterfaceC6473e drawBlock;
    private boolean drawnWithZ;

    @Nullable
    private InterfaceC6469a invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private int mutatedFields;

    @NotNull
    private final AndroidComposeView ownerView;

    @NotNull
    private final DeviceRenderNode renderNode;

    @Nullable
    private Paint softwareLayerPaint;
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC6473e getMatrix = new InterfaceC6473e() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((DeviceRenderNode) obj, (Matrix) obj2);
            return C5443s.f8405a;
        }

        public final void invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
            deviceRenderNode.getMatrix(matrix);
        }
    };

    @NotNull
    private final OutlineResolver outlineResolver = new OutlineResolver();

    @NotNull
    private final LayerMatrixCache<DeviceRenderNode> matrixCache = new LayerMatrixCache<>(getMatrix);

    @NotNull
    private final CanvasHolder canvasHolder = new CanvasHolder();
    private long transformOrigin = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();

    @RequiresApi(ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS)
    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class UniqueDrawingIdApi29 {

        @NotNull
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @JvmStatic
        public static final long getUniqueDrawingId(@NotNull View view) {
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(@NotNull AndroidComposeView androidComposeView, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6469a interfaceC6469a) {
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC6473e;
        this.invalidateParentLayer = interfaceC6469a;
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

    private final void setDirty(boolean z8) {
        if (z8 != this.isDirty) {
            this.isDirty = z8;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z8);
        }
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
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

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas, @Nullable GraphicsLayer parentLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z8 = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z8;
            if (z8) {
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
            nativeCanvas.saveLayer(left, top2, right, bottom, Paint.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top2);
        canvas.mo10537concat58bKbWc(this.matrixCache.m12474calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        InterfaceC6473e interfaceC6473e = this.drawBlock;
        if (interfaceC6473e != null) {
            interfaceC6473e.invoke(canvas, null);
        }
        canvas.restore();
        setDirty(false);
    }

    @Override // androidx.compose.p011ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.p011ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    @NotNull
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo12365getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.m12474calculateMatrixGrdbGEg(this.renderNode);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo12366inverseTransform58bKbWc(@NotNull float[] matrix) {
        float[] fArrM12473calculateInverseMatrixbWbORWo = this.matrixCache.m12473calculateInverseMatrixbWbORWo(this.renderNode);
        if (fArrM12473calculateInverseMatrixbWbORWo != null) {
            androidx.compose.p011ui.graphics.Matrix.m10931timesAssign58bKbWc(matrix, fArrM12473calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo12367isInLayerk4lQ0M(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m12501isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.mapInverse(this.renderNode, rect);
        } else {
            this.matrixCache.map(this.renderNode, rect);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo12368mapOffset8S9VItk(long point, boolean inverse) {
        return inverse ? this.matrixCache.m12476mapInverseR5De75A(this.renderNode, point) : this.matrixCache.m12475mapR5De75A(this.renderNode, point);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo12369movegyyYBs(long position) {
        int left = this.renderNode.getLeft();
        int top2 = this.renderNode.getTop();
        int iM13433getXimpl = IntOffset.m13433getXimpl(position);
        int iM13434getYimpl = IntOffset.m13434getYimpl(position);
        if (left == iM13433getXimpl && top2 == iM13434getYimpl) {
            return;
        }
        if (left != iM13433getXimpl) {
            this.renderNode.offsetLeftAndRight(iM13433getXimpl - left);
        }
        if (top2 != iM13434getYimpl) {
            this.renderNode.offsetTopAndBottom(iM13434getYimpl - top2);
        }
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo12370resizeozmzZPI(long size) {
        int i = (int) (size >> 32);
        int i8 = (int) (size & 4294967295L);
        this.renderNode.setPivotX(TransformOrigin.m11068getPivotFractionXimpl(this.transformOrigin) * i);
        this.renderNode.setPivotY(TransformOrigin.m11069getPivotFractionYimpl(this.transformOrigin) * i8);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i, this.renderNode.getTop() + i8)) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void reuseLayer(@NotNull InterfaceC6473e drawBlock, @NotNull InterfaceC6469a invalidateParentLayer) {
        this.matrixCache.reset();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo12371transform58bKbWc(@NotNull float[] matrix) {
        androidx.compose.p011ui.graphics.Matrix.m10931timesAssign58bKbWc(matrix, this.matrixCache.m12474calculateMatrixGrdbGEg(this.renderNode));
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            final InterfaceC6473e interfaceC6473e = this.drawBlock;
            if (interfaceC6473e != null) {
                this.renderNode.record(this.canvasHolder, clipPath, new InterfaceC6471c() { // from class: androidx.compose.ui.platform.RenderNodeLayer$updateDisplayList$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Canvas) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(Canvas canvas) {
                        interfaceC6473e.invoke(canvas, null);
                    }
                });
            }
            setDirty(false);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateLayerProperties(@NotNull ReusableGraphicsLayerScope scope) {
        InterfaceC6469a interfaceC6469a;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z8 = false;
        boolean z9 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.setAmbientShadowColor(ColorKt.m10736toArgb8_81llA(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.setSpotShadowColor(ColorKt.m10736toArgb8_81llA(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            this.renderNode.setPivotX(TransformOrigin.m11068getPivotFractionXimpl(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.setPivotY(TransformOrigin.m11069getPivotFractionYimpl(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z10 = scope.getClip() && scope.getShape() != RectangleShapeKt.getRectangleShape();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.setClipToOutline(z10);
            this.renderNode.setClipToBounds(scope.getClip() && scope.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if ((131072 & mutatedFields) != 0) {
            this.renderNode.setRenderEffect(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.mo12455setCompositingStrategyaDBOjCE(scope.getCompositingStrategy());
        }
        boolean zM12502updateS_szKao = this.outlineResolver.m12502updateS_szKao(scope.getOutline(), scope.getAlpha(), z10, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.setOutline(this.outlineResolver.getAndroidOutline());
        }
        if (z10 && !this.outlineResolver.getOutlineClipSupported()) {
            z8 = true;
        }
        if (z9 != z8 || (z8 && zM12502updateS_szKao)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (interfaceC6469a = this.invalidateParentLayer) != null) {
            interfaceC6469a.invoke();
        }
        if ((mutatedFields & Fields.MatrixAffectingFields) != 0) {
            this.matrixCache.invalidate();
        }
        this.mutatedFields = scope.getMutatedFields();
    }
}
