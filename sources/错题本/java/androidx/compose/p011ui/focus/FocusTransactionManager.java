package androidx.compose.p011ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\b¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010'\u001a\u0004\u0018\u00010\u0011*\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTransactionManager;", "", "<init>", "()V", "Ld6/s;", "beginTransaction", "commitTransaction", "cancelTransaction", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "onCancelled", "block", "withNewTransaction", "(Lr6/a;Lr6/a;)Ljava/lang/Object;", "withExistingTransaction", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusStateImpl;", "states", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/collection/MutableVector;", "cancellationListener", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "ongoingTransaction", "Z", "getOngoingTransaction", "()Z", "", "generation", "I", "getGeneration", "()I", "value", "getUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;", "setUncommittedFocusState", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V", "uncommittedFocusState", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,122:1\n1101#2:123\n1083#2,2:124\n1#3:126\n641#4,2:127\n641#4,2:129\n423#4,9:162\n76#5,7:131\n365#6,3:138\n329#6,6:141\n339#6,3:148\n342#6,9:152\n368#6:161\n1399#7:147\n1270#7:151\n*S KotlinDebug\n*F\n+ 1 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n*L\n32#1:123\n32#1:124,2\n55#1:127,2\n72#1:129,2\n118#1:162,9\n100#1:131,7\n109#1:138,3\n109#1:141,6\n109#1:148,3\n109#1:152,9\n109#1:161\n109#1:147\n109#1:151\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private int generation;
    private boolean ongoingTransaction;

    @NotNull
    private final MutableScatterMap<FocusTargetNode, FocusStateImpl> states = ScatterMapKt.mutableScatterMapOf();

    @NotNull
    private final MutableVector<InterfaceC6469a> cancellationListener = new MutableVector<>(new InterfaceC6469a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        this.states.clear();
        this.ongoingTransaction = false;
        MutableVector<InterfaceC6469a> mutableVector = this.cancellationListener;
        InterfaceC6469a[] interfaceC6469aArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            interfaceC6469aArr[i].invoke();
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
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p011ui.focus.FocusTargetNode) r10
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
            androidx.compose.runtime.collection.MutableVector<r6.a> r0 = r14.cancellationListener
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusTransactionManager.commitTransaction():void");
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = null;
        }
        if (interfaceC6469a != null) {
            focusTransactionManager.cancellationListener.add(interfaceC6469a);
        }
        if (focusTransactionManager.getOngoingTransaction()) {
            return interfaceC6469a2.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return interfaceC6469a2.invoke();
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = null;
        }
        try {
            if (focusTransactionManager.getOngoingTransaction()) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (interfaceC6469a != null) {
                focusTransactionManager.cancellationListener.add(interfaceC6469a);
            }
            Object objInvoke = interfaceC6469a2.invoke();
            focusTransactionManager.commitTransaction();
            return objInvoke;
        } catch (Throwable th) {
            focusTransactionManager.commitTransaction();
            throw th;
        }
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final boolean getOngoingTransaction() {
        return this.ongoingTransaction;
    }

    @Nullable
    public final FocusStateImpl getUncommittedFocusState(@NotNull FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
        }
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(@NotNull FocusTargetNode focusTargetNode, @Nullable FocusStateImpl focusStateImpl) {
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
        if (focusStateImpl == null) {
            throw AbstractC1923c.m1053q("requires a non-null focus state");
        }
        mutableScatterMap.set(focusTargetNode, focusStateImpl);
    }

    public final <T> T withExistingTransaction(@Nullable InterfaceC6469a onCancelled, @NotNull InterfaceC6469a block) {
        if (onCancelled != null) {
            this.cancellationListener.add(onCancelled);
        }
        if (getOngoingTransaction()) {
            return (T) block.invoke();
        }
        try {
            beginTransaction();
            return (T) block.invoke();
        } finally {
            commitTransaction();
        }
    }

    public final <T> T withNewTransaction(@Nullable InterfaceC6469a onCancelled, @NotNull InterfaceC6469a block) {
        try {
            if (getOngoingTransaction()) {
                cancelTransaction();
            }
            beginTransaction();
            if (onCancelled != null) {
                this.cancellationListener.add(onCancelled);
            }
            T t8 = (T) block.invoke();
            commitTransaction();
            return t8;
        } catch (Throwable th) {
            commitTransaction();
            throw th;
        }
    }
}
