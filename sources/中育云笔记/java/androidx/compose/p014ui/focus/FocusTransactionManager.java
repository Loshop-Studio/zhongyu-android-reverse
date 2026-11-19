package androidx.compose.p014ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private int generation;
    private boolean ongoingTransaction;
    private final MutableScatterMap<FocusTargetNode, FocusStateImpl> states = ScatterMapKt.mutableScatterMapOf();
    private final MutableVector<InterfaceC9529a> cancellationListener = new MutableVector<>(new InterfaceC9529a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        this.states.clear();
        this.ongoingTransaction = false;
        MutableVector<InterfaceC9529a> mutableVector = this.cancellationListener;
        InterfaceC9529a[] interfaceC9529aArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9529aArr[i10].invoke();
        }
        this.cancellationListener.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void commitTransaction() {
        /*
            r14 = this;
            androidx.collection.MutableScatterMap<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r0 = r14.states
            java.lang.Object[] r1 = r0.keys
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p014ui.focus.FocusTargetNode) r10
            r10.commitFocusState$ui_release()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            androidx.collection.MutableScatterMap<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r0 = r14.states
            r0.clear()
            r14.ongoingTransaction = r3
            androidx.compose.runtime.collection.MutableVector<hd.a> r0 = r14.cancellationListener
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusTransactionManager.commitTransaction():void");
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        if (interfaceC9529a != null) {
            focusTransactionManager.cancellationListener.add(interfaceC9529a);
        }
        if (focusTransactionManager.getOngoingTransaction()) {
            return interfaceC9529a2.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return interfaceC9529a2.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            focusTransactionManager.commitTransaction();
            AbstractC9977s.m20285a(1);
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        try {
            if (focusTransactionManager.getOngoingTransaction()) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (interfaceC9529a != null) {
                focusTransactionManager.cancellationListener.add(interfaceC9529a);
            }
            Object objInvoke = interfaceC9529a2.invoke();
            AbstractC9977s.m20286b(1);
            focusTransactionManager.commitTransaction();
            AbstractC9977s.m20285a(1);
            return objInvoke;
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            focusTransactionManager.commitTransaction();
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
        }
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return;
        }
        FocusStateImpl focusStateImpl2 = this.states.get(focusTargetNode);
        if (focusStateImpl2 == null) {
            focusStateImpl2 = FocusStateImpl.Inactive;
        }
        if (focusStateImpl2 != focusStateImpl) {
            this.generation++;
        }
        MutableScatterMap<FocusTargetNode, FocusStateImpl> mutableScatterMap = this.states;
        if (focusStateImpl != null) {
            mutableScatterMap.set(focusTargetNode, focusStateImpl);
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }

    public final <T> T withExistingTransaction(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        if (interfaceC9529a != null) {
            this.cancellationListener.add(interfaceC9529a);
        }
        if (getOngoingTransaction()) {
            return (T) interfaceC9529a2.invoke();
        }
        try {
            beginTransaction();
            return (T) interfaceC9529a2.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            commitTransaction();
            AbstractC9977s.m20285a(1);
        }
    }

    public final <T> T withNewTransaction(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        try {
            if (getOngoingTransaction()) {
                cancelTransaction();
            }
            beginTransaction();
            if (interfaceC9529a != null) {
                this.cancellationListener.add(interfaceC9529a);
            }
            T t10 = (T) interfaceC9529a2.invoke();
            AbstractC9977s.m20286b(1);
            commitTransaction();
            AbstractC9977s.m20285a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            commitTransaction();
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }
}
