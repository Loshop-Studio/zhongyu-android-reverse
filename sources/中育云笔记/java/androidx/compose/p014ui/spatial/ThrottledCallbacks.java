package androidx.compose.p014ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final InterfaceC9540l callback;
        private final long debounceMillis;

        /* renamed from: id */
        private final int f1280id;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        public Entry(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC9540l interfaceC9540l) {
            this.f1280id = i10;
            this.throttleMillis = j10;
            this.debounceMillis = j11;
            this.node = delegatableNode;
            this.callback = interfaceC9540l;
            this.lastInvokeMillis = -j10;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m32772fire9b9wPM(long j10, long j11, long j12, long j13, float[] fArr) {
            RelativeLayoutBounds relativeLayoutBoundsM32773rectInfoForQMZNJw = ThrottledCallbacksKt.m32773rectInfoForQMZNJw(this.node, j10, j11, j12, j13, fArr);
            if (relativeLayoutBoundsM32773rectInfoForQMZNJw == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM32773rectInfoForQMZNJw);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final InterfaceC9540l getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.f1280id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j10) {
            this.bottomRight = j10;
        }

        public final void setLastInvokeMillis(long j10) {
            this.lastInvokeMillis = j10;
        }

        public final void setLastUninvokedFireMillis(long j10) {
            this.lastUninvokedFireMillis = j10;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j10) {
            this.topLeft = j10;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.f1280id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.Companion;
        this.windowOffset = companion.m33640getZeronOccac();
        this.screenOffset = companion.m33640getZeronOccac();
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m32763debounceEntryb8qMvQI(Entry entry, long j10, long j11, float[] fArr, long j12, long j13) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return j13;
        }
        if (j12 - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(j13, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.setLastInvokeMillis(j12);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m32772fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j10, j11, fArr);
        return j13;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m32764fireWY9HvpM(Entry entry, long j10, long j11, float[] fArr, long j12) {
        boolean z10 = j12 - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z11 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(j12);
        if (z10 && z11) {
            entry.setLastInvokeMillis(j12);
            entry.m32772fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), j10, j11, fArr);
        }
        if (z11) {
            return;
        }
        long j13 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + j12;
        if (j13 <= 0 || debounceMillis >= j13) {
            return;
        }
        this.minDebounceDeadline = j13;
    }

    private final void fireWithUpdatedRect(Entry entry, long j10, long j11, long j12) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z10 = j12 - lastInvokeMillis >= throttleMillis;
        boolean z11 = debounceMillis == 0;
        boolean z12 = throttleMillis == 0;
        entry.setTopLeft(j10);
        entry.setBottomRight(j11);
        boolean z13 = !(z11 || z12) || z11;
        if (z10 && z13) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(j12);
            entry.m32772fire9b9wPM(j10, j11, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z11) {
                return;
            }
            entry.setLastUninvokedFireMillis(j12);
            long j13 = this.minDebounceDeadline;
            long j14 = j12 + debounceMillis;
            if (j13 <= 0 || j14 >= j13) {
                return;
            }
            this.minDebounceDeadline = j13;
        }
    }

    private final void linkedForEach(Entry entry, InterfaceC9540l interfaceC9540l) {
        while (entry != null) {
            interfaceC9540l.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, InterfaceC9540l interfaceC9540l) {
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        for (Entry next = (Entry) objArr[(i10 << 3) + i12]; next != null; next = next.getNext()) {
                            interfaceC9540l.invoke(next);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i10, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i10);
        if (entry2 == null) {
            mutableIntObjectMap.set(i10, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                AbstractC9979u.m20291d(next);
            }
            next.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean multiRemove(androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> r6, int r7, androidx.compose.ui.spatial.ThrottledCallbacks.Entry r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.remove(r7)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) r0
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = kotlin.jvm.internal.AbstractC9979u.m20289b(r0, r8)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1f
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r8.getNext()
            r8.setNext(r4)
            if (r0 == 0) goto L1e
            r6.put(r7, r0)
        L1e:
            return r3
        L1f:
            r6.put(r7, r0)
        L22:
            if (r0 == 0) goto L3d
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r6 = r0.getNext()
            if (r6 != 0) goto L2b
            return r1
        L2b:
            if (r6 != r8) goto L38
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r6 = r8.getNext()
            r0.setNext(r6)
            r8.setNext(r4)
            goto L3d
        L38:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            goto L22
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.spatial.ThrottledCallbacks.multiRemove(androidx.collection.MutableIntObjectMap, int, androidx.compose.ui.spatial.ThrottledCallbacks$Entry):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = next;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final long roundDownToMultipleOf8(long j10) {
        return (j10 >> 3) << 3;
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i10, InterfaceC9540l interfaceC9540l) {
        for (Entry next = mutableIntObjectMap.get(i10); next != null; next = next.getNext()) {
            interfaceC9540l.invoke(next);
        }
    }

    public final void fireGlobalChangeEntries(long j10) {
        long j11 = this.windowOffset;
        long j12 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long jM32409getOffsetFromRootnOccac$ui_release = layoutNodeRequireLayoutNode.m32409getOffsetFromRootnOccac$ui_release();
                long jM32408getLastSizeYbymL2g$ui_release = layoutNodeRequireLayoutNode.m32408getLastSizeYbymL2g$ui_release();
                next.setTopLeft(jM32409getOffsetFromRootnOccac$ui_release);
                next.setBottomRight(((IntOffset.m33629getXimpl(jM32409getOffsetFromRootnOccac$ui_release) + ((int) (jM32408getLastSizeYbymL2g$ui_release >> 32))) << 32) | ((IntOffset.m33630getYimpl(jM32409getOffsetFromRootnOccac$ui_release) + ((int) (jM32408getLastSizeYbymL2g$ui_release & 4294967295L))) & 4294967295L));
                m32764fireWY9HvpM(next, j11, j12, fArr, j10);
            }
        }
    }

    public final void fireOnRectChangedEntries(long j10) {
        ThrottledCallbacks throttledCallbacks = this;
        long j11 = throttledCallbacks.windowOffset;
        long j12 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j13 = jArr[i10];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                long j14 = j13;
                int i12 = 0;
                while (i12 < i11) {
                    if ((j14 & 255) < 128) {
                        Entry next = (Entry) objArr[(i10 << 3) + i12];
                        while (next != null) {
                            int i13 = i12;
                            Entry entry = next;
                            throttledCallbacks.m32764fireWY9HvpM(entry, j11, j12, fArr, j10);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i12 = i13;
                        }
                    }
                    j14 >>= 8;
                    i12++;
                    throttledCallbacks = this;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            }
            i10++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int i10, long j10, long j11, long j12) {
        for (Entry next = this.rectChangedMap.get(i10); next != null; next = next.getNext()) {
            fireWithUpdatedRect(next, j10, j11, j12);
        }
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name */
    public final long m32765getScreenOffsetnOccac() {
        return this.screenOffset;
    }

    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name */
    public final float[] m32766getViewToWindowMatrix3i98HWw() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name */
    public final long m32767getWindowOffsetnOccac() {
        return this.windowOffset;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC9540l interfaceC9540l) {
        Entry entry = new Entry(i10, j10, j11 == 0 ? j10 : j11, delegatableNode, interfaceC9540l);
        addToGlobalEntries(entry);
        return entry;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int i10, long j10, long j11, DelegatableNode delegatableNode, InterfaceC9540l interfaceC9540l) {
        return multiPut(this.rectChangedMap, i10, new Entry(i10, j10, j11 == 0 ? j10 : j11, delegatableNode, interfaceC9540l));
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j10) {
        this.minDebounceDeadline = j10;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m32768setScreenOffsetgyyYBs(long j10) {
        this.screenOffset = j10;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m32769setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m32770setWindowOffsetgyyYBs(long j10) {
        this.windowOffset = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void triggerDebounced(long r27) {
        /*
            r26 = this;
            r0 = r26
            long r1 = r0.minDebounceDeadline
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L9
            return
        L9:
            long r2 = r0.windowOffset
            long r4 = r0.screenOffset
            float[] r6 = r0.viewToWindowMatrix
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks$Entry> r1 = r0.rectChangedMap
            java.lang.Object[] r11 = r1.values
            long[] r12 = r1.metadata
            int r1 = r12.length
            int r13 = r1 + (-2)
            if (r13 < 0) goto L8f
            r16 = 0
            r1 = r16
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L23:
            r9 = r12[r1]
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = ~r9
            r19 = 7
            long r14 = r14 << r19
            long r14 = r14 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = r1 - r13
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r19 = r9
            r9 = r16
        L48:
            if (r9 >= r14) goto L84
            r21 = 255(0xff, double:1.26E-321)
            long r21 = r19 & r21
            r23 = 128(0x80, double:6.3E-322)
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 >= 0) goto L7a
            int r10 = r1 << 3
            int r10 = r10 + r9
            r10 = r11[r10]
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r10 = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) r10
        L5b:
            if (r10 == 0) goto L74
            r25 = r1
            r21 = r9
            r1 = r10
            r9 = r7
            r7 = r27
            long r9 = r0.m32763debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            r7 = r9
            r9 = r21
            r10 = r1
            r1 = r25
            goto L5b
        L74:
            r21 = r9
            r9 = r7
        L77:
            r25 = r1
            goto L7d
        L7a:
            r21 = r9
            goto L77
        L7d:
            long r19 = r19 >> r15
            int r9 = r21 + 1
            r1 = r25
            goto L48
        L84:
            r25 = r1
            if (r14 != r15) goto L96
            r1 = r25
        L8a:
            if (r1 == r13) goto L96
            int r1 = r1 + 1
            goto L23
        L8f:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r17
        L96:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r0.globalChangeEntries
            if (r1 == 0) goto La9
            r9 = r7
        L9b:
            if (r1 == 0) goto La8
            r7 = r27
            long r9 = r0.m32763debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            goto L9b
        La8:
            r7 = r9
        La9:
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 != 0) goto Laf
            r7 = -1
        Laf:
            r0.minDebounceDeadline = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.spatial.ThrottledCallbacks.triggerDebounced(long):void");
    }

    /* renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m32771updateOffsetsbT0EZQs(long j10, long j11, float[] fArr) {
        boolean z10;
        if (IntOffset.m33628equalsimpl0(j11, this.windowOffset)) {
            z10 = false;
        } else {
            this.windowOffset = j11;
            z10 = true;
        }
        if (!IntOffset.m33628equalsimpl0(j10, this.screenOffset)) {
            this.screenOffset = j10;
            z10 = true;
        }
        if (fArr == null) {
            return z10;
        }
        this.viewToWindowMatrix = fArr;
        return true;
    }
}
