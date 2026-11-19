package androidx.compose.p011ui.platform;

import android.os.Build;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.CompositingStrategy;
import androidx.compose.p011ui.graphics.Fields;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.MatrixKt;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOrigin;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.p011ui.layout.GraphicLayerInfo;
import androidx.compose.p011ui.node.OwnedLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DensityKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010,\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020)H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001a\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0001¢\u0006\u0004\b/\u0010+J!\u00101\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010\u0016J\"\u0010:\u001a\u00020#2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020%H\u0016ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;2\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b=\u0010>JW\u0010?\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b?\u0010@J\u001a\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\bE\u0010CR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010GR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IRJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u001c\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010LR\u0016\u0010M\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010Q\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bQ\u0010PR$\u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bS\u0010N\"\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010 \u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bb\u0010LR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010NR\u0016\u0010j\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010NR\u0016\u0010k\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010NR\u0016\u0010l\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010NR%\u0010p\u001a\u0013\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u000f0m¢\u0006\u0002\bo8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010tR\u001a\u0010y\u001a\u00020\u00188VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bx\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006z"}, m5110d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroidx/compose/ui/graphics/GraphicsContext;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "parentLayer", "Ld6/s;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lr6/e;Lr6/a;)V", "triggerRepaint", "()V", "updateOutline", "Landroidx/compose/ui/graphics/Matrix;", "getMatrix-sQKQjiQ", "()[F", "getMatrix", "getInverseMatrix-3i98HWw", "getInverseMatrix", "updateMatrix", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lr6/e;Lr6/a;)V", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lr6/e;", "Lr6/a;", "J", "isDestroyed", "Z", "matrixCache", "[F", "inverseMatrixCache", "value", "isDirty", "setDirty", "(Z)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "", "mutatedFields", "I", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "isMatrixDirty", "isInverseMatrixDirty", "isIdentity", "drawnWithEnabledZ", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "recordLambda", "Lr6/c;", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,415:1\n30#2:416\n30#2:452\n80#3:417\n85#3:419\n90#3:421\n53#3,3:423\n60#3:427\n70#3:430\n85#3:433\n90#3:435\n53#3,3:437\n80#3:453\n60#3:461\n70#3:465\n54#4:418\n59#4:420\n54#4:432\n59#4:434\n30#5:422\n30#5:436\n278#5:458\n65#6:426\n69#6:429\n71#6:459\n65#6:460\n73#6:463\n69#6:464\n22#7:428\n22#7:431\n22#7:462\n22#7:466\n76#8,7:440\n102#8,5:447\n1#9:454\n49#10:455\n52#10,2:456\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n*L\n62#1:416\n336#1:452\n62#1:417\n147#1:419\n148#1:421\n146#1:423,3\n211#1:427\n212#1:430\n250#1:433\n251#1:435\n249#1:437,3\n336#1:453\n390#1:461\n389#1:465\n147#1:418\n148#1:420\n250#1:432\n251#1:434\n146#1:422\n249#1:436\n390#1:458\n211#1:426\n212#1:429\n390#1:459\n390#1:460\n389#1:463\n389#1:464\n211#1:428\n212#1:431\n390#1:462\n389#1:466\n313#1:440,7\n316#1:447,5\n369#1:455\n381#1:456,2\n*E\n"})
/* loaded from: classes2.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;

    @Nullable
    private final GraphicsContext context;

    @Nullable
    private InterfaceC6473e drawBlock;
    private boolean drawnWithEnabledZ;

    @NotNull
    private GraphicsLayer graphicsLayer;

    @Nullable
    private InterfaceC6469a invalidateParentLayer;

    @Nullable
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;

    @Nullable
    private Outline outline;

    @NotNull
    private final AndroidComposeView ownerView;
    private long size;

    @Nullable
    private Paint softwareLayerPaint;

    @NotNull
    private final float[] matrixCache = Matrix.m10912constructorimpl$default(null, 1, null);

    @NotNull
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @NotNull
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @NotNull
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();
    private boolean isIdentity = true;

    @NotNull
    private final InterfaceC6471c recordLambda = new InterfaceC6471c() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return C5443s.f8405a;
        }

        public final void invoke(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            InterfaceC6473e interfaceC6473e = graphicsLayerOwnerLayer.drawBlock;
            if (interfaceC6473e != null) {
                interfaceC6473e.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }
    };

    public GraphicsLayerOwnerLayer(@NotNull GraphicsLayer graphicsLayer, @Nullable GraphicsContext graphicsContext, @NotNull AndroidComposeView androidComposeView, @NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC6469a interfaceC6469a) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = interfaceC6473e;
        this.invalidateParentLayer = interfaceC6469a;
        long j7 = Integer.MAX_VALUE;
        this.size = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m12469getInverseMatrix3i98HWw() {
        float[] fArrM10912constructorimpl$default = this.inverseMatrixCache;
        if (fArrM10912constructorimpl$default == null) {
            fArrM10912constructorimpl$default = Matrix.m10912constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM10912constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM10912constructorimpl$default[0])) {
                return null;
            }
            return fArrM10912constructorimpl$default;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM12470getMatrixsQKQjiQ = m12470getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return fArrM12470getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m12471invertToJiSxe2E(fArrM12470getMatrixsQKQjiQ, fArrM10912constructorimpl$default)) {
            return fArrM10912constructorimpl$default;
        }
        fArrM10912constructorimpl$default[0] = Float.NaN;
        return null;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m12470getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
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

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jM10520getCenteruvyYCjk = (graphicsLayer.getPivotOffset() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m10520getCenteruvyYCjk(IntSizeKt.m13488toSizeozmzZPI(this.size)) : graphicsLayer.getPivotOffset();
            Matrix.m10922resetToPivotedTransformimpl(this.matrixCache, Float.intBitsToFloat((int) (jM10520getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (jM10520getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 1.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m10937isIdentity58bKbWc(this.matrixCache);
        }
    }

    private final void updateOutline() {
        InterfaceC6469a interfaceC6469a;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (!(outline instanceof Outline.Generic) || Build.VERSION.SDK_INT >= 33 || (interfaceC6469a = this.invalidateParentLayer) == null) {
            return;
        }
        interfaceC6469a.invoke();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui_release(this);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas, @Nullable GraphicsLayer parentLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(parentLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.p011ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.p011ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    @NotNull
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo12365getUnderlyingMatrixsQKQjiQ() {
        return m12470getMatrixsQKQjiQ();
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
        float[] fArrM12469getInverseMatrix3i98HWw = m12469getInverseMatrix3i98HWw();
        if (fArrM12469getInverseMatrix3i98HWw != null) {
            Matrix.m10931timesAssign58bKbWc(matrix, fArrM12469getInverseMatrix3i98HWw);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo12367isInLayerk4lQ0M(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean inverse) {
        float[] fArrM12469getInverseMatrix3i98HWw = inverse ? m12469getInverseMatrix3i98HWw() : m12470getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM12469getInverseMatrix3i98HWw == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m10920mapimpl(fArrM12469getInverseMatrix3i98HWw, rect);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo12368mapOffset8S9VItk(long point, boolean inverse) {
        float[] fArrM12470getMatrixsQKQjiQ;
        if (inverse) {
            fArrM12470getMatrixsQKQjiQ = m12469getInverseMatrix3i98HWw();
            if (fArrM12470getMatrixsQKQjiQ == null) {
                return Offset.INSTANCE.m10455getInfiniteF1C5BW0();
            }
        } else {
            fArrM12470getMatrixsQKQjiQ = m12470getMatrixsQKQjiQ();
        }
        return this.isIdentity ? point : Matrix.m10918mapMKHz9U(fArrM12470getMatrixsQKQjiQ, point);
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo12369movegyyYBs(long position) {
        this.graphicsLayer.m11335setTopLeftgyyYBs(position);
        triggerRepaint();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo12370resizeozmzZPI(long size) {
        if (IntSize.m13474equalsimpl0(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void reuseLayer(@NotNull InterfaceC6473e drawBlock, @NotNull InterfaceC6469a invalidateParentLayer) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            throw AbstractC1923c.m1053q("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.getIsReleased()) {
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m10921resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m10921resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        long j7 = Integer.MAX_VALUE;
        this.size = IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo12371transform58bKbWc(@NotNull float[] matrix) {
        Matrix.m10931timesAssign58bKbWc(matrix, m12470getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty) {
            if (!TransformOrigin.m11067equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ()) && !IntSize.m13474equalsimpl0(this.graphicsLayer.getSize(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM11068getPivotFractionXimpl = TransformOrigin.m11068getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                float fM11069getPivotFractionYimpl = TransformOrigin.m11069getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.m11331setPivotOffsetk4lQ0M(Offset.m10433constructorimpl((Float.floatToRawIntBits(fM11069getPivotFractionYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM11068getPivotFractionXimpl) << 32)));
            }
            this.graphicsLayer.m11327recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    @Override // androidx.compose.p011ui.node.OwnedLayer
    public void updateLayerProperties(@NotNull ReusableGraphicsLayerScope scope) {
        int iM11314getModulateAlphake2Ky5w;
        InterfaceC6469a interfaceC6469a;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i = mutatedFields & 4096;
        if (i != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.setShadowElevation(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (interfaceC6469a = this.invalidateParentLayer) != null) {
                interfaceC6469a.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.m11328setAmbientShadowColor8_81llA(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.m11334setSpotShadowColor8_81llA(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.setRotationZ(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.setCameraDistance(scope.getCameraDistance());
        }
        if (i != 0) {
            if (TransformOrigin.m11067equalsimpl0(this.transformOrigin, TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ())) {
                this.graphicsLayer.m11331setPivotOffsetk4lQ0M(Offset.INSTANCE.m10456getUnspecifiedF1C5BW0());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float fM11068getPivotFractionXimpl = TransformOrigin.m11068getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.m11331setPivotOffsetk4lQ0M(Offset.m10433constructorimpl((Float.floatToRawIntBits(TransformOrigin.m11069getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fM11068getPivotFractionXimpl) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.setClip(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            this.graphicsLayer.setRenderEffect(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
            if (CompositingStrategy.m10766equalsimpl0(compositingStrategy, companion.m10770getAutoNrFUSI())) {
                iM11314getModulateAlphake2Ky5w = androidx.compose.p011ui.graphics.layer.CompositingStrategy.INSTANCE.m11313getAutoke2Ky5w();
            } else if (CompositingStrategy.m10766equalsimpl0(compositingStrategy, companion.m10772getOffscreenNrFUSI())) {
                iM11314getModulateAlphake2Ky5w = androidx.compose.p011ui.graphics.layer.CompositingStrategy.INSTANCE.m11315getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m10766equalsimpl0(compositingStrategy, companion.m10771getModulateAlphaNrFUSI())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iM11314getModulateAlphake2Ky5w = androidx.compose.p011ui.graphics.layer.CompositingStrategy.INSTANCE.m11314getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m11330setCompositingStrategyWpw9cng(iM11314getModulateAlphake2Ky5w);
        }
        boolean z8 = true;
        if ((mutatedFields & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (AbstractC5830k.m5325b(this.outline, scope.getOutline())) {
            z8 = false;
        } else {
            this.outline = scope.getOutline();
            updateOutline();
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z8) {
            triggerRepaint();
        }
    }
}
