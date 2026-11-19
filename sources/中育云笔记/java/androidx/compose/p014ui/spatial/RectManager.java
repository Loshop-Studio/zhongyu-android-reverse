package androidx.compose.p014ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Actual_androidKt;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.MatrixKt;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.MeasurePassDelegate;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.OwnedLayer;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final MutableObjectList<InterfaceC9529a> callbacks;
    private final InterfaceC9529a dispatchLambda;
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
            long jMo32431getPositionnOccac = nodeCoordinator.mo32431getPositionnOccac();
            float fM33629getXimpl = IntOffset.m33629getXimpl(jMo32431getPositionnOccac);
            float fM33630getYimpl = IntOffset.m33630getYimpl(jMo32431getPositionnOccac);
            mutableRect.m30622translatek4lQ0M(Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo32561getUnderlyingMatrixsQKQjiQ = layer.mo32561getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m31133isIdentity58bKbWc(fArrMo32561getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m31116mapimpl(fArrMo32561getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final void insertOrUpdate(LayoutNode layoutNode, boolean z10, int i10, int i11, int i12, int i13) {
        int semanticsId = layoutNode.getSemanticsId();
        if (z10 || !this.rects.move(semanticsId, i10, i11, i12, i13)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, i10, i11, i12, i13, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, Opcodes.CHECKCAST, null);
        }
        invalidate();
    }

    /* renamed from: insertOrUpdateTransformedNode-70tqf50, reason: not valid java name */
    private final void m32750insertOrUpdateTransformedNode70tqf50(LayoutNode layoutNode, long j10, boolean z10) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(IntOffset.m33629getXimpl(j10), IntOffset.m33630getYimpl(j10), IntOffset.m33629getXimpl(j10) + measuredWidth, IntOffset.m33630getYimpl(j10) + measuredHeight);
        boundingRectInRoot(outerCoordinator$ui_release, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top2 = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (z10 || !this.rects.update(semanticsId, left, top2, right, bottom)) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            RectList.insert$default(this.rects, semanticsId, left, top2, right, bottom, parent$ui_release != null ? parent$ui_release.getSemanticsId() : -1, false, false, Opcodes.CHECKCAST, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            m32750insertOrUpdateTransformedNode70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo32431getPositionnOccac(), false);
            insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
        }
    }

    /* renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m32751outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
        long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        while (innerCoordinator$ui_release != null && innerCoordinator$ui_release != outerCoordinator$ui_release) {
            OwnedLayer layer = innerCoordinator$ui_release.getLayer();
            jM30653getZeroF1C5BW0 = IntOffsetKt.m33644plusNvtHpc(jM30653getZeroF1C5BW0, innerCoordinator$ui_release.mo32431getPositionnOccac());
            innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo32561getUnderlyingMatrixsQKQjiQ = layer.mo32561getUnderlyingMatrixsQKQjiQ();
                int iM32758analyzeComponents58bKbWc = RectManagerKt.m32758analyzeComponents58bKbWc(fArrMo32561getUnderlyingMatrixsQKQjiQ);
                if (iM32758analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM32758analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m33639getMaxnOccac();
                    }
                    jM30653getZeroF1C5BW0 = Matrix.m31114mapMKHz9U(fArrMo32561getUnderlyingMatrixsQKQjiQ, jM30653getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m33646roundk4lQ0M(jM30653getZeroF1C5BW0);
    }

    /* renamed from: positionInRoot-Bjo55l4, reason: not valid java name */
    private final long m32752positionInRootBjo55l4(NodeCoordinator nodeCoordinator) {
        long jM30653getZeroF1C5BW0 = Offset.Companion.m30653getZeroF1C5BW0();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jM30653getZeroF1C5BW0 = IntOffsetKt.m33644plusNvtHpc(jM30653getZeroF1C5BW0, nodeCoordinator.mo32431getPositionnOccac());
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            if (layer != null) {
                float[] fArrMo32561getUnderlyingMatrixsQKQjiQ = layer.mo32561getUnderlyingMatrixsQKQjiQ();
                int iM32758analyzeComponents58bKbWc = RectManagerKt.m32758analyzeComponents58bKbWc(fArrMo32561getUnderlyingMatrixsQKQjiQ);
                if (iM32758analyzeComponents58bKbWc == 3) {
                    continue;
                } else {
                    if ((iM32758analyzeComponents58bKbWc & 2) == 0) {
                        return IntOffset.Companion.m33639getMaxnOccac();
                    }
                    jM30653getZeroF1C5BW0 = Matrix.m31114mapMKHz9U(fArrMo32561getUnderlyingMatrixsQKQjiQ, jM30653getZeroF1C5BW0);
                }
            }
        }
        return IntOffsetKt.m33646roundk4lQ0M(jM30653getZeroF1C5BW0);
    }

    public final RelativeLayoutBounds currentRectInfo(int i10, final DelegatableNode delegatableNode) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.rects.withRect(i10, new InterfaceC9546r() { // from class: androidx.compose.ui.spatial.RectManager.currentRectInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(int i11, int i12, int i13, int i14) {
                ref$ObjectRef.f23402c = ThrottledCallbacksKt.m32773rectInfoForQMZNJw(delegatableNode, (i11 << 32) | (i12 & 4294967295L), (i13 << 32) | (i14 & 4294967295L), this.throttledCallbacks.m32767getWindowOffsetnOccac(), this.throttledCallbacks.m32765getScreenOffsetnOccac(), this.throttledCallbacks.m32766getViewToWindowMatrix3i98HWw());
            }
        });
        return (RelativeLayoutBounds) ref$ObjectRef.f23402c;
    }

    public final void dispatchCallbacks() {
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z10 = this.isDirty;
        boolean z11 = z10 || this.isScreenOrWindowDirty;
        if (z10) {
            this.isDirty = false;
            MutableObjectList<InterfaceC9529a> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i10 = mutableObjectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((InterfaceC9529a) objArr[i11]).invoke();
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
            long jM32751outerToInnerOffsetBjo55l4 = m32751outerToInnerOffsetBjo55l4(layoutNode);
            if (!RectManagerKt.m32759isSetgyyYBs(jM32751outerToInnerOffsetBjo55l4)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m32417setOuterToInnerOffsetgyyYBs$ui_release(jM32751outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui_release(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode2 = layoutNodeArr[i10];
                m32753onLayoutPositionChanged70tqf50(layoutNode2, layoutNode2.getOuterCoordinator$ui_release().mo32431getPositionnOccac(), false);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    /* renamed from: onLayoutPositionChanged-70tqf50, reason: not valid java name */
    public final void m32753onLayoutPositionChanged70tqf50(LayoutNode layoutNode, long j10, boolean z10) {
        long j11;
        long jM32752positionInRootBjo55l4;
        long jM32751outerToInnerOffsetBjo55l4;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
            int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui_release.getMeasuredHeight();
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            long jM32409getOffsetFromRootnOccac$ui_release = layoutNode.m32409getOffsetFromRootnOccac$ui_release();
            long jM32408getLastSizeYbymL2g$ui_release = layoutNode.m32408getLastSizeYbymL2g$ui_release();
            int i10 = (int) (jM32408getLastSizeYbymL2g$ui_release >> 32);
            int i11 = (int) (jM32408getLastSizeYbymL2g$ui_release & 4294967295L);
            boolean z11 = false;
            if (parent$ui_release != null) {
                boolean outerToInnerOffsetDirty$ui_release = parent$ui_release.getOuterToInnerOffsetDirty$ui_release();
                long jM32409getOffsetFromRootnOccac$ui_release2 = parent$ui_release.m32409getOffsetFromRootnOccac$ui_release();
                long jM32410getOuterToInnerOffsetnOccac$ui_release = parent$ui_release.m32410getOuterToInnerOffsetnOccac$ui_release();
                if (RectManagerKt.m32759isSetgyyYBs(jM32409getOffsetFromRootnOccac$ui_release2)) {
                    if (outerToInnerOffsetDirty$ui_release) {
                        j11 = 4294967295L;
                        jM32751outerToInnerOffsetBjo55l4 = m32751outerToInnerOffsetBjo55l4(parent$ui_release);
                        parent$ui_release.m32417setOuterToInnerOffsetgyyYBs$ui_release(jM32751outerToInnerOffsetBjo55l4);
                        parent$ui_release.setOuterToInnerOffsetDirty$ui_release(false);
                    } else {
                        j11 = 4294967295L;
                        jM32751outerToInnerOffsetBjo55l4 = jM32410getOuterToInnerOffsetnOccac$ui_release;
                    }
                    z11 = !RectManagerKt.m32759isSetgyyYBs(jM32751outerToInnerOffsetBjo55l4);
                    jM32752positionInRootBjo55l4 = IntOffset.m33633plusqkQi6aY(IntOffset.m33633plusqkQi6aY(jM32409getOffsetFromRootnOccac$ui_release2, jM32751outerToInnerOffsetBjo55l4), j10);
                } else {
                    j11 = 4294967295L;
                    jM32752positionInRootBjo55l4 = m32752positionInRootBjo55l4(layoutNode.getOuterCoordinator$ui_release());
                }
            } else {
                j11 = 4294967295L;
                jM32752positionInRootBjo55l4 = j10;
            }
            if (z11 || !RectManagerKt.m32759isSetgyyYBs(jM32752positionInRootBjo55l4)) {
                m32750insertOrUpdateTransformedNode70tqf50(layoutNode, j10, z10);
                return;
            }
            layoutNode.m32416setOffsetFromRootgyyYBs$ui_release(jM32752positionInRootBjo55l4);
            layoutNode.m32415setLastSizeozmzZPI$ui_release(IntSize.m33667constructorimpl((measuredWidth << 32) | (measuredHeight & j11)));
            int iM33629getXimpl = IntOffset.m33629getXimpl(jM32752positionInRootBjo55l4);
            int iM33630getYimpl = IntOffset.m33630getYimpl(jM32752positionInRootBjo55l4);
            int i12 = iM33629getXimpl + measuredWidth;
            int i13 = iM33630getYimpl + measuredHeight;
            if (!z10 && IntOffset.m33628equalsimpl0(jM32752positionInRootBjo55l4, jM32409getOffsetFromRootnOccac$ui_release) && i10 == measuredWidth && i11 == measuredHeight) {
                return;
            }
            insertOrUpdate(layoutNode, z10, iM33629getXimpl, iM33630getYimpl, i12, i13);
        }
    }

    public final Object registerOnChangedCallback(InterfaceC9529a interfaceC9529a) {
        this.callbacks.add(interfaceC9529a);
        return interfaceC9529a;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC9540l interfaceC9540l) {
        return this.throttledCallbacks.registerOnGlobalChange(i10, j10, j11, delegatableNode, interfaceC9540l);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC9540l interfaceC9540l) {
        return this.throttledCallbacks.registerOnRectChanged(i10, j10, j11, delegatableNode, interfaceC9540l);
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
        if ((AbstractC9962d0.m20260k(obj, 0) ? (InterfaceC9529a) obj : null) == null) {
            return;
        }
        this.callbacks.remove(obj);
    }

    /* renamed from: updateOffsets-ucfNpQE, reason: not valid java name */
    public final void m32754updateOffsetsucfNpQE(long j10, long j11, float[] fArr) {
        int iM32758analyzeComponents58bKbWc = RectManagerKt.m32758analyzeComponents58bKbWc(fArr);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM32758analyzeComponents58bKbWc & 2) != 0) {
            fArr = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m32771updateOffsetsbT0EZQs(j10, j11, fArr) || this.isScreenOrWindowDirty;
    }

    public RectManager(IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new MutableObjectList<>(0, 1, null);
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new InterfaceC9529a() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32755invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32755invoke() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    C10786q c10786q = C10786q.f26013a;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ RectManager(IntObjectMap intObjectMap, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? IntObjectMapKt.intObjectMapOf() : intObjectMap);
    }
}
