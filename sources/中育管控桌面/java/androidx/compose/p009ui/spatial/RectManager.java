package androidx.compose.p009ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.p009ui.Actual_androidKt;
import androidx.compose.p009ui.ComposeUiFlags;
import androidx.compose.p009ui.geometry.MutableRect;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.graphics.Matrix;
import androidx.compose.p009ui.graphics.MatrixKt;
import androidx.compose.p009ui.node.DelegatableNode;
import androidx.compose.p009ui.node.LayoutNode;
import androidx.compose.p009ui.node.MeasurePassDelegate;
import androidx.compose.p009ui.node.NodeCoordinator;
import androidx.compose.p009ui.node.OwnedLayer;
import androidx.compose.p009ui.unit.IntOffset;
import androidx.compose.p009ui.unit.IntOffsetKt;
import androidx.compose.p009ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u000bJ8\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001dH\u0002J*\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0006\u0010.\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u001d\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001dH\u0000¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J(\u00105\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b6\u0010,J\u0016\u00107\u001a\u0004\u0018\u00010\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ:\u00109\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J:\u0010>\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0=J\u000e\u0010?\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000fJ\u0010\u0010B\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010\u0001J(\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020Hø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0014\u0010K\u001a\u00020\u000b*\u00020L2\u0006\u0010M\u001a\u00020\u0007H\u0002J\u0019\u0010N\u001a\u00020**\u00020\u0004H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020**\u00020LH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, m7880d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "layoutNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/collection/IntObjectMap;)V", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "callbacks", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "", "dispatchLambda", "dispatchToken", "isDirty", "", "isFragmented", "isScreenOrWindowDirty", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "scheduledDispatchDeadline", "", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "currentRectInfo", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "id", "", "node", "Landroidx/compose/ui/node/DelegatableNode;", "dispatchCallbacks", "insertOrUpdate", "layoutNode", "firstPlacement", "l", "t", "r", "b", "insertOrUpdateTransformedNode", RequestParameters.POSITION, "Landroidx/compose/ui/unit/IntOffset;", "insertOrUpdateTransformedNode-70tqf50", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "insertOrUpdateTransformedNodeSubhierarchy", "invalidate", "invalidateCallbacksFor", "isTargetDrawnFirst", "targetId", "otherId", "isTargetDrawnFirst$ui_release", "onLayoutLayerPositionalPropertiesChanged", "onLayoutPositionChanged", "onLayoutPositionChanged-70tqf50", "registerOnChangedCallback", "callback", "registerOnGlobalLayoutCallback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "registerOnRectChangedCallback", "remove", "scheduleDebounceCallback", "ensureSomethingScheduled", "unregisterOnChangedCallback", "token", "updateOffsets", "screenOffset", "windowOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "updateOffsets-ucfNpQE", "(JJ[F)V", "boundingRectInRoot", "Landroidx/compose/ui/node/NodeCoordinator;", "rect", "outerToInnerOffset", "outerToInnerOffset-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "positionInRoot", "positionInRoot-Bjo55l4", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,547:1\n1516#2:548\n544#3:549\n540#3:607\n544#3:608\n287#4,6:550\n725#5,7:556\n732#5,4:564\n736#5,7:569\n835#6:563\n810#6:568\n207#7:576\n207#7:592\n423#8,9:577\n423#8,9:593\n54#9:586\n59#9:588\n85#10:587\n90#10:589\n80#10:591\n53#10,3:604\n30#11:590\n159#12:602\n30#13:603\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:548\n75#1:549\n425#1:607\n426#1:608\n90#1:550,6\n91#1:556,7\n91#1:564,4\n91#1:569,7\n91#1:563\n91#1:568\n213#1:576\n303#1:592\n213#1:577,9\n303#1:593,9\n249#1:586\n250#1:588\n249#1:587\n250#1:589\n288#1:591\n402#1:604,3\n288#1:590\n402#1:602\n402#1:603\n*E\n"})
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<Function0<Unit>> callbacks;
    private final Function0<Unit> dispatchLambda;
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final IntObjectMap<LayoutNode> layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RectManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long position = nodeCoordinator.getPosition();
            float fM16612getXimpl = IntOffset.m16612getXimpl(position);
            float fM16613getYimpl = IntOffset.m16613getYimpl(position);
            mutableRect.m13643translatek4lQ0M(Offset.m13650constructorimpl((Float.floatToRawIntBits(fM16612getXimpl) << 32) | (Float.floatToRawIntBits(fM16613getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo15560getUnderlyingMatrixsQKQjiQ = layer.mo15560getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m14154isIdentity58bKbWc(fArrMo15560getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m14137mapimpl(fArrMo15560getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean firstPlacement, int l6, int t6, int r6, int b7) {
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.move(semanticsId, l6, t6, r6, b7)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, l6, t6, r6, b7, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m15735insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m16612getXimpl(position), IntOffset.m16613getYimpl(position), IntOffset.m16612getXimpl(position) + measuredWidth, IntOffset.m16613getYimpl(position) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i6 = 0; i6 < size; i6++) {
            LayoutNode layoutNode2 = layoutNodeArr[i6];
            m15735insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m15736outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM13674getZeroF1C5BW0 = Offset.INSTANCE.m13674getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            jM13674getZeroF1C5BW0 = IntOffsetKt.m16627plusNvtHpc(jM13674getZeroF1C5BW0, innerCoordinator$ui_release.getPosition());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy();
            if (layer != null) {
                float[] fArrMo15560getUnderlyingMatrixsQKQjiQ = layer.mo15560getUnderlyingMatrixsQKQjiQ();
                int iM15742analyzeComponents58bKbWc = RectManagerKt.m15742analyzeComponents58bKbWc(fArrMo15560getUnderlyingMatrixsQKQjiQ);
                if (iM15742analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM15742analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m16622getMaxnOccac();
                    }
                    jM13674getZeroF1C5BW0 = Matrix.m14135mapMKHz9U(fArrMo15560getUnderlyingMatrixsQKQjiQ, jM13674getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m16629roundk4lQ0M(jM13674getZeroF1C5BW0);
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m15737positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        long jM13674getZeroF1C5BW0 = Offset.INSTANCE.m13674getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jM13674getZeroF1C5BW0 = IntOffsetKt.m16627plusNvtHpc(jM13674getZeroF1C5BW0, nodeCoordinator.getPosition());
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo15560getUnderlyingMatrixsQKQjiQ = layer.mo15560getUnderlyingMatrixsQKQjiQ();
                int iM15742analyzeComponents58bKbWc = RectManagerKt.m15742analyzeComponents58bKbWc(fArrMo15560getUnderlyingMatrixsQKQjiQ);
                if (iM15742analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM15742analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.INSTANCE.m16622getMaxnOccac();
                    }
                    jM13674getZeroF1C5BW0 = Matrix.m14135mapMKHz9U(fArrMo15560getUnderlyingMatrixsQKQjiQ, jM13674getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m16629roundk4lQ0M(jM13674getZeroF1C5BW0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RelativeLayoutBounds currentRectInfo(int id, final DelegatableNode node) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.rects.withRect(id, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.spatial.RectManager.currentRectInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r12v9, types: [T, androidx.compose.ui.spatial.RelativeLayoutBounds] */
            public final void invoke(int i6, int i7, int i8, int i9) {
                objectRef.element = ThrottledCallbacksKt.m15757rectInfoForQMZNJw(node, (i6 << 32) | (i7 & 4294967295L), (i8 << 32) | (i9 & 4294967295L), this.throttledCallbacks.getWindowOffset(), this.throttledCallbacks.getScreenOffset(), this.throttledCallbacks.getViewToWindowMatrix());
            }
        });
        return (RelativeLayoutBounds) objectRef.element;
    }

    public final void dispatchCallbacks() {
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z6 = this.isDirty;
        boolean z7 = z6 || this.isScreenOrWindowDirty;
        if (z6) {
            this.isDirty = false;
            MutableObjectList<Function0<Unit>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i6 = mutableObjectList._size;
            for (int i7 = 0; i7 < i6; i7++) {
                ((Function0) objArr[i7]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i8 = rectList.itemsSize;
            for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
                long j6 = jArr[i9 + 2];
                if ((((int) (j6 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j6), jArr[i9], jArr[i9 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z7) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
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

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jM15736outerToInnerOffsetBjo55l4 = m15736outerToInnerOffsetBjo55l4(layoutNode);
            if (!RectManagerKt.m15743isSetgyyYBs(jM15736outerToInnerOffsetBjo55l4)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m15430setOuterToInnerOffsetgyyYBs$ui_release(jM15736outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i6 = 0; i6 < size; i6++) {
                LayoutNode layoutNode2 = layoutNodeArr[i6];
                m15738onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().getPosition(), false);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m15738onLayoutPositionChanged70tqf50(LayoutNode layoutNode, long position, boolean firstPlacement) {
        long j6;
        long jM15737positionInRootBjo55l4;
        long jM15736outerToInnerOffsetBjo55l4;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long offsetFromRoot = layoutNode.getOffsetFromRoot();
            long lastSize = layoutNode.getLastSize();
            int i6 = (int) (lastSize >> 32);
            int i7 = (int) (lastSize & 4294967295L);
            boolean z6 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty = parent$ui_release.getOuterToInnerOffsetDirty();
                long offsetFromRoot2 = parent$ui_release.getOffsetFromRoot();
                long outerToInnerOffset = parent$ui_release.getOuterToInnerOffset();
                if (RectManagerKt.m15743isSetgyyYBs(offsetFromRoot2)) {
                    if (outerToInnerOffsetDirty) {
                        j6 = 4294967295L;
                        jM15736outerToInnerOffsetBjo55l4 = m15736outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m15430setOuterToInnerOffsetgyyYBs$ui_release(jM15736outerToInnerOffsetBjo55l4);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j6 = 4294967295L;
                        jM15736outerToInnerOffsetBjo55l4 = outerToInnerOffset;
                    }
                    z6 = !RectManagerKt.m15743isSetgyyYBs(jM15736outerToInnerOffsetBjo55l4);
                    jM15737positionInRootBjo55l4 = IntOffset.m16616plusqkQi6aY(IntOffset.m16616plusqkQi6aY(offsetFromRoot2, jM15736outerToInnerOffsetBjo55l4), position);
                } else {
                    j6 = 4294967295L;
                    jM15737positionInRootBjo55l4 = m15737positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j6 = 4294967295L;
                jM15737positionInRootBjo55l4 = position;
            }
            if (z6 || !RectManagerKt.m15743isSetgyyYBs(jM15737positionInRootBjo55l4)) {
                m15735insertOrUpdateTransformedNode70tqf50(layoutNode, position, firstPlacement);
                return;
            }
            layoutNode.m15429setOffsetFromRootgyyYBs$ui_release(jM15737positionInRootBjo55l4);
            layoutNode.m15428setLastSizeozmzZPI$ui_release(IntSize.m16650constructorimpl((measuredWidth << 32) | (measuredHeight & j6)));
            int iM16612getXimpl = IntOffset.m16612getXimpl(jM15737positionInRootBjo55l4);
            int iM16613getYimpl = IntOffset.m16613getYimpl(jM15737positionInRootBjo55l4);
            int i8 = iM16612getXimpl + measuredWidth;
            int i9 = iM16613getYimpl + measuredHeight;
            if (!firstPlacement && IntOffset.m16611equalsimpl0(jM15737positionInRootBjo55l4, offsetFromRoot) && i6 == measuredWidth && i7 == measuredHeight) {
                return;
            }
            insertOrUpdate(layoutNode, firstPlacement, iM16612getXimpl, iM16613getYimpl, i8, i9);
        }
    }

    public final Object registerOnChangedCallback(Function0<Unit> callback) {
        this.callbacks.add(callback);
        return callback;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return this.throttledCallbacks.registerOnGlobalChange(id, throttleMillis, debounceMillis, node, callback);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return this.throttledCallbacks.registerOnRectChanged(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void remove(LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z6 = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z6) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z6) {
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

    public final void unregisterOnChangedCallback(Object token) {
        if ((TypeIntrinsics.isFunctionOfArity(token, 0) ? (Function0) token : null) == null) {
            return;
        }
        this.callbacks.remove(token);
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m15739updateOffsetsucfNpQE(long screenOffset, long windowOffset, float[] viewToWindowMatrix) {
        int iM15742analyzeComponents58bKbWc = RectManagerKt.m15742analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM15742analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m15755updateOffsetsbT0EZQs(screenOffset, windowOffset, viewToWindowMatrix) || this.isScreenOrWindowDirty;
    }

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }
}
