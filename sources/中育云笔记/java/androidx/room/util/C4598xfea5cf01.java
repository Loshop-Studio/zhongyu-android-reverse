package androidx.room.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", m26211f = "DBUtil.android.kt", m26212l = {Opcodes.FSTORE, Opcodes.DSTORE, 59, 60, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 */
/* loaded from: classes3.dex */
public final class C4598xfea5cf01 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", m26211f = "DBUtil.android.kt", m26212l = {60}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC11588c interfaceC11588c, InterfaceC9540l interfaceC9540l) {
            super(2, interfaceC11588c);
            this.$block$inlined = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC11588c, this.$block$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransactionScope<R> transactionScope, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((AnonymousClass1) create(transactionScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC9540l interfaceC9540l = this.$block$inlined;
            this.label = 1;
            AbstractC9977s.m20287c(6);
            Object objInvoke = interfaceC9540l.invoke(this);
            AbstractC9977s.m20287c(7);
            return objInvoke == objM25952f ? objM25952f : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4598xfea5cf01(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC11588c interfaceC11588c, InterfaceC9540l interfaceC9540l) {
        super(2, interfaceC11588c);
        this.$inTransaction = z10;
        this.$isReadOnly = z11;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C4598xfea5cf01 c4598xfea5cf01 = new C4598xfea5cf01(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, interfaceC11588c, this.$block$inlined);
        c4598xfea5cf01.L$0 = obj;
        return c4598xfea5cf01;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(Transactor transactor, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((C4598xfea5cf01) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9.sync$room_runtime_release(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
      0x00a8: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v19 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C4598xfea5cf01.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
