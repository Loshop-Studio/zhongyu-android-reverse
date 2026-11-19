package androidx.compose.p011ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.p011ui.Actual_androidKt;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.graphics.MatrixKt;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.MeasurePassDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.OwnedLayer;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6475g;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u000b*\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\b*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u000b*\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010%J(\u0010,\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010%J\u0015\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u0004\u0018\u0001042\u0006\u00101\u001a\u00020\u00122\u0006\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u0004\u0018\u00010\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\b07¢\u0006\u0004\b9\u0010:JA\u0010@\u001a\u00020?2\u0006\u00101\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00103\u001a\u0002022\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0>¢\u0006\u0004\b@\u0010AJA\u0010B\u001a\u00020?2\u0006\u00101\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00103\u001a\u0002022\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0>¢\u0006\u0004\bB\u0010AJ\u0017\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\bF\u0010\nJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\bG\u0010\nJ(\u0010I\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bH\u0010\u0010J\u0015\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\bJ\u0010\nJ\u001f\u0010O\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0000¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010PR\u0017\u0010R\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b070Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0016\u0010_\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, m5110d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(Landroidx/collection/IntObjectMap;)V", "layoutNode", "Ld6/s;", "insertOrUpdateTransformedNodeSubhierarchy", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/IntOffset;", RequestParameters.POSITION, "", "firstPlacement", "insertOrUpdateTransformedNode-70tqf50", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "insertOrUpdateTransformedNode", "", "l", "t", "r", "b", "insertOrUpdate", "(Landroidx/compose/ui/node/LayoutNode;ZIIII)V", "Landroidx/compose/ui/node/NodeCoordinator;", "positionInRoot-Bjo55l4", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "positionInRoot", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "boundingRectInRoot", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "outerToInnerOffset-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "outerToInnerOffset", "invalidate", "()V", "screenOffset", "windowOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "updateOffsets-ucfNpQE", "(JJ[F)V", "updateOffsets", "dispatchCallbacks", "ensureSomethingScheduled", "scheduleDebounceCallback", "(Z)V", "id", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "currentRectInfo", "(ILandroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Lkotlin/Function0;", "callback", "registerOnChangedCallback", "(Lr6/a;)Ljava/lang/Object;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChangedCallback", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lr6/c;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalLayoutCallback", "token", "unregisterOnChangedCallback", "(Ljava/lang/Object;)V", "invalidateCallbacksFor", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged-70tqf50", "onLayoutPositionChanged", "remove", "targetId", "otherId", "isTargetDrawnFirst$ui_release", "(II)Z", "isTargetDrawnFirst", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/collection/MutableObjectList;", "callbacks", "Landroidx/collection/MutableObjectList;", "isDirty", "Z", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "Ljava/lang/Object;", "scheduledDispatchDeadline", "J", "dispatchLambda", "Lr6/a;", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,547:1\n1516#2:548\n544#3:549\n540#3:607\n544#3:608\n287#4,6:550\n725#5,7:556\n732#5,4:564\n736#5,7:569\n835#6:563\n810#6:568\n207#7:576\n207#7:592\n423#8,9:577\n423#8,9:593\n54#9:586\n59#9:588\n85#10:587\n90#10:589\n80#10:591\n53#10,3:604\n30#11:590\n159#12:602\n30#13:603\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:548\n75#1:549\n425#1:607\n426#1:608\n90#1:550,6\n91#1:556,7\n91#1:564,4\n91#1:569,7\n91#1:563\n91#1:568\n213#1:576\n303#1:592\n213#1:577,9\n303#1:593,9\n249#1:586\n250#1:588\n249#1:587\n250#1:589\n288#1:591\n402#1:604,3\n288#1:590\n402#1:602\n402#1:603\n*E\n"})
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;

    @NotNull
    private final MutableRect cachedRect;

    @NotNull
    private final MutableObjectList<InterfaceC6469a> callbacks;

    @NotNull
    private final InterfaceC6469a dispatchLambda;

    @Nullable
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;

    @NotNull
    private final IntObjectMap<LayoutNode> layoutNodes;

    @NotNull
    private final RectList rects;
    private long scheduledDispatchDeadline;

    @NotNull
    private final ThrottledCallbacks throttledCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long position = nodeCoordinator.getPosition();
            float fM13433getXimpl = IntOffset.m13433getXimpl(position);
            float fM13434getYimpl = IntOffset.m13434getYimpl(position);
            mutableRect.m10426translatek4lQ0M(Offset.m10433constructorimpl((Float.floatToRawIntBits(fM13433getXimpl) << 32) | (Float.floatToRawIntBits(fM13434getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo12365getUnderlyingMatrixsQKQjiQ = layer.mo12365getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m10937isIdentity58bKbWc(fArrMo12365getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m10920mapimpl(fArrMo12365getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean firstPlacement, int l, int t8, int r, int b6) {
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.move(semanticsId, l, t8, r, b6)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, l, t8, r, b6, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m12554insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m13433getXimpl(position), IntOffset.m13434getYimpl(position), IntOffset.m13433getXimpl(position) + measuredWidth, IntOffset.m13434getYimpl(position) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top2 = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.update(semanticsId, left, top2, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top2, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            m12554insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m12555outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            jM10457getZeroF1C5BW0 = IntOffsetKt.m13448plusNvtHpc(jM10457getZeroF1C5BW0, innerCoordinator$ui_release.getPosition());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy();
            if (layer != null) {
                float[] fArrMo12365getUnderlyingMatrixsQKQjiQ = layer.mo12365getUnderlyingMatrixsQKQjiQ();
                int iM12562analyzeComponents58bKbWc = RectManagerKt.m12562analyzeComponents58bKbWc(fArrMo12365getUnderlyingMatrixsQKQjiQ);
                if (iM12562analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM12562analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m13443getMaxnOccac();
                    }
                    jM10457getZeroF1C5BW0 = Matrix.m10918mapMKHz9U(fArrMo12365getUnderlyingMatrixsQKQjiQ, jM10457getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m13450roundk4lQ0M(jM10457getZeroF1C5BW0);
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m12556positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jM10457getZeroF1C5BW0 = IntOffsetKt.m13448plusNvtHpc(jM10457getZeroF1C5BW0, nodeCoordinator.getPosition());
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo12365getUnderlyingMatrixsQKQjiQ = layer.mo12365getUnderlyingMatrixsQKQjiQ();
                int iM12562analyzeComponents58bKbWc = RectManagerKt.m12562analyzeComponents58bKbWc(fArrMo12365getUnderlyingMatrixsQKQjiQ);
                if (iM12562analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM12562analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m13443getMaxnOccac();
                    }
                    jM10457getZeroF1C5BW0 = Matrix.m10918mapMKHz9U(fArrMo12365getUnderlyingMatrixsQKQjiQ, jM10457getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m13450roundk4lQ0M(jM10457getZeroF1C5BW0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final RelativeLayoutBounds currentRectInfo(int id, @NotNull final DelegatableNode node) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.rects.withRect(id, new InterfaceC6475g() { // from class: androidx.compose.ui.spatial.RectManager.currentRectInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            /* JADX WARN: Type inference failed for: r12v9, types: [T, androidx.compose.ui.spatial.RelativeLayoutBounds] */
            public final void invoke(int i, int i8, int i9, int i10) {
                ref$ObjectRef.element = ThrottledCallbacksKt.m12577rectInfoForQMZNJw(node, (i << 32) | (i8 & 4294967295L), (i9 << 32) | (i10 & 4294967295L), this.throttledCallbacks.getWindowOffset(), this.throttledCallbacks.getScreenOffset(), this.throttledCallbacks.getViewToWindowMatrix());
            }
        });
        return (RelativeLayoutBounds) ref$ObjectRef.element;
    }

    public final void dispatchCallbacks() {
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z8 = this.isDirty;
        boolean z9 = z8 || this.isScreenOrWindowDirty;
        if (z8) {
            this.isDirty = false;
            MutableObjectList<InterfaceC6469a> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i8 = 0; i8 < i; i8++) {
                ((InterfaceC6469a) objArr[i8]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i9 = rectList.itemsSize;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                long j7 = jArr[i10 + 2];
                if ((((int) (j7 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j7), jArr[i10], jArr[i10 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z9) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
    }

    @NotNull
    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(@NotNull LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.markUpdated(layoutNode.getSemanticsId());
        scheduleDebounceCallback(true);
    }

    public final boolean isTargetDrawnFirst$ui_release(int targetId, int otherId) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        LayoutNode parent$ui_release3 = this.layoutNodes.get(targetId);
        if (parent$ui_release3 != null && (parent$ui_release = this.layoutNodes.get(otherId)) != null && parent$ui_release3.getDepth() != 0 && parent$ui_release.getDepth() != 0) {
            while (parent$ui_release3.getDepth() > parent$ui_release.getDepth()) {
                parent$ui_release3 = parent$ui_release3.getParent$ui_release();
                if (parent$ui_release3 == null) {
                    return false;
                }
            }
            if (parent$ui_release3 == parent$ui_release) {
                return false;
            }
            while (parent$ui_release.getDepth() > parent$ui_release3.getDepth()) {
                parent$ui_release = parent$ui_release.getParent$ui_release();
                if (parent$ui_release == null) {
                    return false;
                }
            }
            if (parent$ui_release3 == parent$ui_release) {
                return false;
            }
            LayoutNode layoutNode = parent$ui_release;
            LayoutNode layoutNode2 = layoutNode;
            LayoutNode layoutNode3 = parent$ui_release3;
            while (parent$ui_release3 != layoutNode) {
                LayoutNode parent$ui_release4 = parent$ui_release3.getParent$ui_release();
                if (parent$ui_release4 == null || (parent$ui_release2 = layoutNode.getParent$ui_release()) == null) {
                    return false;
                }
                layoutNode3 = parent$ui_release3;
                parent$ui_release3 = parent$ui_release4;
                layoutNode2 = layoutNode;
                layoutNode = parent$ui_release2;
            }
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex() == layoutNode2.getMeasurePassDelegate$ui_release().getZIndex()) {
                return layoutNode3.getPlaceOrder$ui_release() < layoutNode2.getPlaceOrder$ui_release();
            }
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex() < layoutNode2.getMeasurePassDelegate$ui_release().getZIndex()) {
                return true;
            }
        }
        return false;
    }

    public final void onLayoutLayerPositionalPropertiesChanged(@NotNull LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jM12555outerToInnerOffsetBjo55l4 = m12555outerToInnerOffsetBjo55l4(layoutNode);
            if (!RectManagerKt.m12563isSetgyyYBs(jM12555outerToInnerOffsetBjo55l4)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m12221setOuterToInnerOffsetgyyYBs$ui_release(jM12555outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode2 = layoutNodeArr[i];
                m12557onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m12557onLayoutPositionChanged70tqf50(@NotNull LayoutNode layoutNode, long position, boolean firstPlacement) {
        long j7;
        long jM12556positionInRootBjo55l4;
        long jM12555outerToInnerOffsetBjo55l4;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long offsetFromRoot = layoutNode.getOffsetFromRoot();
            long lastSize = layoutNode.getLastSize();
            int i = (int) (lastSize >> 32);
            int i8 = (int) (lastSize & 4294967295L);
            boolean z8 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty = parent$ui_release.getOuterToInnerOffsetDirty();
                long offsetFromRoot2 = parent$ui_release.getOffsetFromRoot();
                long outerToInnerOffset = parent$ui_release.getOuterToInnerOffset();
                if (RectManagerKt.m12563isSetgyyYBs(offsetFromRoot2)) {
                    if (outerToInnerOffsetDirty) {
                        j7 = 4294967295L;
                        jM12555outerToInnerOffsetBjo55l4 = m12555outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m12221setOuterToInnerOffsetgyyYBs$ui_release(jM12555outerToInnerOffsetBjo55l4);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j7 = 4294967295L;
                        jM12555outerToInnerOffsetBjo55l4 = outerToInnerOffset;
                    }
                    z8 = !RectManagerKt.m12563isSetgyyYBs(jM12555outerToInnerOffsetBjo55l4);
                    jM12556positionInRootBjo55l4 = IntOffset.m13437plusqkQi6aY(IntOffset.m13437plusqkQi6aY(offsetFromRoot2, jM12555outerToInnerOffsetBjo55l4), position);
                } else {
                    j7 = 4294967295L;
                    jM12556positionInRootBjo55l4 = m12556positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j7 = 4294967295L;
                jM12556positionInRootBjo55l4 = position;
            }
            if (z8 || !RectManagerKt.m12563isSetgyyYBs(jM12556positionInRootBjo55l4)) {
                m12554insertOrUpdateTransformedNode70tqf50(layoutNode, position, firstPlacement);
                return;
            }
            layoutNode.m12220setOffsetFromRootgyyYBs$ui_release(jM12556positionInRootBjo55l4);
            layoutNode.m12219setLastSizeozmzZPI$ui_release(IntSize.m13471constructorimpl((measuredWidth << 32) | (measuredHeight & j7)));
            int iM13433getXimpl = IntOffset.m13433getXimpl(jM12556positionInRootBjo55l4);
            int iM13434getYimpl = IntOffset.m13434getYimpl(jM12556positionInRootBjo55l4);
            int i9 = iM13433getXimpl + measuredWidth;
            int i10 = iM13434getYimpl + measuredHeight;
            if (!firstPlacement && IntOffset.m13432equalsimpl0(jM12556positionInRootBjo55l4, offsetFromRoot) && i == measuredWidth && i8 == measuredHeight) {
                return;
            }
            insertOrUpdate(layoutNode, firstPlacement, iM13433getXimpl, iM13434getYimpl, i9, i10);
        }
    }

    @Nullable
    public final Object registerOnChangedCallback(@NotNull InterfaceC6469a callback) {
        this.callbacks.add(callback);
        return callback;
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull InterfaceC6471c callback) {
        return this.throttledCallbacks.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, callback);
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull InterfaceC6471c callback) {
        return this.throttledCallbacks.registerOnRectChanged(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void remove(@NotNull LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z8 = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z8) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z8) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.removePost(obj);
            }
            long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
            long jMax = Math.max(minDebounceDeadline, 16 + jCurrentTimeMillis);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = Actual_androidKt.postDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
        }
    }

    public final void unregisterOnChangedCallback(@Nullable Object token) {
        if ((AbstractC5835p.m5356e(0, token) ? (InterfaceC6469a) token : null) == null) {
            return;
        }
        this.callbacks.remove(token);
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m12558updateOffsetsucfNpQE(long screenOffset, long windowOffset, @NotNull float[] viewToWindowMatrix) {
        int iM12562analyzeComponents58bKbWc = RectManagerKt.m12562analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM12562analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m12575updateOffsetsbT0EZQs(screenOffset, windowOffset, viewToWindowMatrix) || this.isScreenOrWindowDirty;
    }

    public RectManager(@NotNull IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new InterfaceC6469a() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12559invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12559invoke() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }
}
