package androidx.compose.p013ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.Actual_androidKt;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.MatrixKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.MeasurePassDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.node.OwnedLayer;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10576r;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<InterfaceC10559a> callbacks;
    private final InterfaceC10559a dispatchLambda;
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
            long jMo25829getPositionnOccac = nodeCoordinator.mo25829getPositionnOccac();
            float fM27027getXimpl = IntOffset.m27027getXimpl(jMo25829getPositionnOccac);
            float fM27028getYimpl = IntOffset.m27028getYimpl(jMo25829getPositionnOccac);
            mutableRect.m24020translatek4lQ0M(Offset.m24027constructorimpl((Float.floatToRawIntBits(fM27027getXimpl) << 32) | (Float.floatToRawIntBits(fM27028getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo25959getUnderlyingMatrixsQKQjiQ = layer.mo25959getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m24531isIdentity58bKbWc(fArrMo25959getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m24514mapimpl(fArrMo25959getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean z10, int i10, int i11, int i12, int i13) {
        int semanticsId = layoutNode.getSemanticsId();
        if (z10 || !this.rects.move(semanticsId, i10, i11, i12, i13)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, i10, i11, i12, i13, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m26148insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long j10, boolean z10) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m27027getXimpl(j10), IntOffset.m27028getYimpl(j10), IntOffset.m27027getXimpl(j10) + measuredWidth, IntOffset.m27028getYimpl(j10) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top2 = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (z10 || !this.rects.update(semanticsId, left, top2, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top2, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, 192, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            m26148insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo25829getPositionnOccac(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m26149outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM24051getZeroF1C5BW0 = Offset.Companion.m24051getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            jM24051getZeroF1C5BW0 = IntOffsetKt.m27042plusNvtHpc(jM24051getZeroF1C5BW0, innerCoordinator$ui_release.mo25829getPositionnOccac());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo25959getUnderlyingMatrixsQKQjiQ = layer.mo25959getUnderlyingMatrixsQKQjiQ();
                int iM26156analyzeComponents58bKbWc = RectManagerKt.m26156analyzeComponents58bKbWc(fArrMo25959getUnderlyingMatrixsQKQjiQ);
                if (iM26156analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM26156analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m27037getMaxnOccac();
                    }
                    jM24051getZeroF1C5BW0 = Matrix.m24512mapMKHz9U(fArrMo25959getUnderlyingMatrixsQKQjiQ, jM24051getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m27044roundk4lQ0M(jM24051getZeroF1C5BW0);
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m26150positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        long jM24051getZeroF1C5BW0 = Offset.Companion.m24051getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jM24051getZeroF1C5BW0 = IntOffsetKt.m27042plusNvtHpc(jM24051getZeroF1C5BW0, nodeCoordinator.mo25829getPositionnOccac());
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo25959getUnderlyingMatrixsQKQjiQ = layer.mo25959getUnderlyingMatrixsQKQjiQ();
                int iM26156analyzeComponents58bKbWc = RectManagerKt.m26156analyzeComponents58bKbWc(fArrMo25959getUnderlyingMatrixsQKQjiQ);
                if (iM26156analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM26156analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m27037getMaxnOccac();
                    }
                    jM24051getZeroF1C5BW0 = Matrix.m24512mapMKHz9U(fArrMo25959getUnderlyingMatrixsQKQjiQ, jM24051getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m27044roundk4lQ0M(jM24051getZeroF1C5BW0);
    }

    public final RelativeLayoutBounds currentRectInfo(int i10, final DelegatableNode delegatableNode) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.rects.withRect(i10, new InterfaceC10576r() { // from class: androidx.compose.ui.spatial.RectManager.currentRectInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p300x7.InterfaceC10576r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C8736p.f16368a;
            }

            public final void invoke(int i11, int i12, int i13, int i14) {
                ref$ObjectRef.f17473a = ThrottledCallbacksKt.m26171rectInfoForQMZNJw(delegatableNode, (i11 << 32) | (i12 & 4294967295L), (i13 << 32) | (i14 & 4294967295L), this.throttledCallbacks.m26165getWindowOffsetnOccac(), this.throttledCallbacks.m26163getScreenOffsetnOccac(), this.throttledCallbacks.m26164getViewToWindowMatrix3i98HWw());
            }
        });
        return (RelativeLayoutBounds) ref$ObjectRef.f17473a;
    }

    public final void dispatchCallbacks() {
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z10 = this.isDirty;
        boolean z11 = z10 || this.isScreenOrWindowDirty;
        if (z10) {
            this.isDirty = false;
            MutableObjectList<InterfaceC10559a> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i10 = mutableObjectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((InterfaceC10559a) objArr[i11]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i12 = rectList.itemsSize;
            for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
                long j10 = jArr[i13 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(67108863 & ((int) j10), jArr[i13], jArr[i13 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z11) {
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

    public final boolean isTargetDrawnFirst$ui_release(int i10, int i11) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        LayoutNode parent$ui_release3 = this.layoutNodes.get(i10);
        if (parent$ui_release3 != null && (parent$ui_release = this.layoutNodes.get(i11)) != null && parent$ui_release3.getDepth$ui_release() != 0 && parent$ui_release.getDepth$ui_release() != 0) {
            while (parent$ui_release3.getDepth$ui_release() > parent$ui_release.getDepth$ui_release()) {
                parent$ui_release3 = parent$ui_release3.getParent$ui_release();
                if (parent$ui_release3 == null) {
                    return false;
                }
            }
            if (parent$ui_release3 == parent$ui_release) {
                return false;
            }
            while (parent$ui_release.getDepth$ui_release() > parent$ui_release3.getDepth$ui_release()) {
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
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex$ui_release() == layoutNode2.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) {
                return layoutNode3.getPlaceOrder$ui_release() < layoutNode2.getPlaceOrder$ui_release();
            }
            if (layoutNode3.getMeasurePassDelegate$ui_release().getZIndex$ui_release() < layoutNode2.getMeasurePassDelegate$ui_release().getZIndex$ui_release()) {
                return true;
            }
        }
        return false;
    }

    public final void onLayoutLayerPositionalPropertiesChanged(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jM26149outerToInnerOffsetBjo55l4 = m26149outerToInnerOffsetBjo55l4(layoutNode);
            if (!RectManagerKt.m26157isSetgyyYBs(jM26149outerToInnerOffsetBjo55l4)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m25815setOuterToInnerOffsetgyyYBs$ui_release(jM26149outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode2 = layoutNodeArr[i10];
                m26151onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo25829getPositionnOccac(), false);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m26151onLayoutPositionChanged70tqf50(LayoutNode layoutNode, long j10, boolean z10) {
        long j11;
        long jM26150positionInRootBjo55l4;
        long jM26149outerToInnerOffsetBjo55l4;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long jM25807getOffsetFromRootnOccac$ui_release = layoutNode.m25807getOffsetFromRootnOccac$ui_release();
            long jM25806getLastSizeYbymL2g$ui_release = layoutNode.m25806getLastSizeYbymL2g$ui_release();
            int i10 = (int) (jM25806getLastSizeYbymL2g$ui_release >> 32);
            int i11 = (int) (jM25806getLastSizeYbymL2g$ui_release & 4294967295L);
            boolean z11 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty$ui_release = parent$ui_release.getOuterToInnerOffsetDirty$ui_release();
                long jM25807getOffsetFromRootnOccac$ui_release2 = parent$ui_release.m25807getOffsetFromRootnOccac$ui_release();
                long jM25808getOuterToInnerOffsetnOccac$ui_release = parent$ui_release.m25808getOuterToInnerOffsetnOccac$ui_release();
                if (RectManagerKt.m26157isSetgyyYBs(jM25807getOffsetFromRootnOccac$ui_release2)) {
                    if (outerToInnerOffsetDirty$ui_release) {
                        j11 = 4294967295L;
                        jM26149outerToInnerOffsetBjo55l4 = m26149outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m25815setOuterToInnerOffsetgyyYBs$ui_release(jM26149outerToInnerOffsetBjo55l4);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j11 = 4294967295L;
                        jM26149outerToInnerOffsetBjo55l4 = jM25808getOuterToInnerOffsetnOccac$ui_release;
                    }
                    z11 = !RectManagerKt.m26157isSetgyyYBs(jM26149outerToInnerOffsetBjo55l4);
                    jM26150positionInRootBjo55l4 = IntOffset.m27031plusqkQi6aY(IntOffset.m27031plusqkQi6aY(jM25807getOffsetFromRootnOccac$ui_release2, jM26149outerToInnerOffsetBjo55l4), j10);
                } else {
                    j11 = 4294967295L;
                    jM26150positionInRootBjo55l4 = m26150positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j11 = 4294967295L;
                jM26150positionInRootBjo55l4 = j10;
            }
            if (z11 || !RectManagerKt.m26157isSetgyyYBs(jM26150positionInRootBjo55l4)) {
                m26148insertOrUpdateTransformedNode70tqf50(layoutNode, j10, z10);
                return;
            }
            layoutNode.m25814setOffsetFromRootgyyYBs$ui_release(jM26150positionInRootBjo55l4);
            layoutNode.m25813setLastSizeozmzZPI$ui_release(IntSize.m27065constructorimpl((measuredWidth << 32) | (measuredHeight & j11)));
            int iM27027getXimpl = IntOffset.m27027getXimpl(jM26150positionInRootBjo55l4);
            int iM27028getYimpl = IntOffset.m27028getYimpl(jM26150positionInRootBjo55l4);
            int i12 = iM27027getXimpl + measuredWidth;
            int i13 = iM27028getYimpl + measuredHeight;
            if (!z10 && IntOffset.m27026equalsimpl0(jM26150positionInRootBjo55l4, jM25807getOffsetFromRootnOccac$ui_release) && i10 == measuredWidth && i11 == measuredHeight) {
                return;
            }
            insertOrUpdate(layoutNode, z10, iM27027getXimpl, iM27028getYimpl, i12, i13);
        }
    }

    public final Object registerOnChangedCallback(InterfaceC10559a interfaceC10559a) {
        this.callbacks.add(interfaceC10559a);
        return interfaceC10559a;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC10570l interfaceC10570l) {
        return this.throttledCallbacks.registerOnGlobalChange(i10, j10, j11, delegatableNode, interfaceC10570l);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC10570l interfaceC10570l) {
        return this.throttledCallbacks.registerOnRectChanged(i10, j10, j11, delegatableNode, interfaceC10570l);
    }

    public final void remove(LayoutNode layoutNode) {
        this.rects.remove(layoutNode.getSemanticsId());
        invalidate();
        this.isFragmented = true;
    }

    public final void scheduleDebounceCallback(boolean z10) {
        boolean z11 = (z10 && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z11) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z11) {
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

    public final void unregisterOnChangedCallback(Object obj) {
        if ((AbstractC9116d0.m16102k(obj, 0) ? (InterfaceC10559a) obj : null) == null) {
            return;
        }
        this.callbacks.remove(obj);
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m26152updateOffsetsucfNpQE(long j10, long j11, float[] fArr) {
        int iM26156analyzeComponents58bKbWc = RectManagerKt.m26156analyzeComponents58bKbWc(fArr);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM26156analyzeComponents58bKbWc & 2) != 0) {
            fArr = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m26169updateOffsetsbT0EZQs(j10, j11, fArr) || this.isScreenOrWindowDirty;
    }

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new InterfaceC10559a() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m26153invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26153invoke() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    C8736p c8736p = C8736p.f16368a;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }
}
