package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", m26211f = "DBUtil.android.kt", m26212l = {Opcodes.FSTORE, Opcodes.DSTORE, 59, 60}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 */
/* loaded from: classes3.dex */
public final class C4601x2db6401c extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", m26211f = "DBUtil.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1, reason: invalid class name */
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
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            AbstractC9979u.m20292e(transactionScope, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.$block$inlined.invoke(((RawConnectionAccessor) transactionScope).getRawConnection());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4601x2db6401c(boolean z10, boolean z11, RoomDatabase roomDatabase, InterfaceC11588c interfaceC11588c, InterfaceC9540l interfaceC9540l) {
        super(2, interfaceC11588c);
        this.$inTransaction = z10;
        this.$isReadOnly = z11;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C4601x2db6401c c4601x2db6401c = new C4601x2db6401c(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, interfaceC11588c, this.$block$inlined);
        c4601x2db6401c.L$0 = obj;
        return c4601x2db6401c;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(Transactor transactor, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((C4601x2db6401c) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
      0x00a2: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.C4601x2db6401c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
