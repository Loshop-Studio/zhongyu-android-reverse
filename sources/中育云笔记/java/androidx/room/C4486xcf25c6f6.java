package androidx.room;

import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m26211f = "InvalidationTracker.kt", m26212l = {413, 420}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 */
/* loaded from: classes3.dex */
public final class C4486xcf25c6f6 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    @InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m26211f = "InvalidationTracker.kt", m26212l = {421}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC11588c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(TransactionScope<Set<Integer>> transactionScope, InterfaceC11588c<? super Set<Integer>> interfaceC11588c) {
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
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
            this.label = 1;
            Object objCheckInvalidatedTables = triggerBasedInvalidationTracker.checkInvalidatedTables(transactionScope, this);
            return objCheckInvalidatedTables == objM25952f ? objM25952f : objCheckInvalidatedTables;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4486xcf25c6f6(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC11588c<? super C4486xcf25c6f6> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C4486xcf25c6f6 c4486xcf25c6f6 = new C4486xcf25c6f6(this.this$0, interfaceC11588c);
        c4486xcf25c6f6.L$0 = obj;
        return c4486xcf25c6f6;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(Transactor transactor, InterfaceC11588c<? super Set<Integer>> interfaceC11588c) {
        return ((C4486xcf25c6f6) create(transactor, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: android.database.SQLException -> L5a
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.AbstractC9924b.m20071b(r7)
            goto L35
        L22:
            kotlin.AbstractC9924b.m20071b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r1.inTransaction(r6)
            if (r7 != r0) goto L35
            goto L56
        L35:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L42
            java.util.Set r7 = p325rc.AbstractC10983y0.m24160f()
            return r7
        L42:
            androidx.room.Transactor$SQLiteTransactionType r7 = androidx.room.Transactor.SQLiteTransactionType.IMMEDIATE     // Catch: android.database.SQLException -> L5a
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1 r3 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1     // Catch: android.database.SQLException -> L5a
            androidx.room.TriggerBasedInvalidationTracker r4 = r6.this$0     // Catch: android.database.SQLException -> L5a
            r5 = 0
            r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
            r6.L$0 = r5     // Catch: android.database.SQLException -> L5a
            r6.label = r2     // Catch: android.database.SQLException -> L5a
            java.lang.Object r7 = r1.withTransaction(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
            return r7
        L5a:
            java.util.Set r7 = p325rc.AbstractC10983y0.m24160f()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C4486xcf25c6f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
