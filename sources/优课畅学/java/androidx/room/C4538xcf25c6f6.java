package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m17801f = "InvalidationTracker.kt", m17802l = {TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX, TypedValues.CycleType.TYPE_EASING}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 */
/* loaded from: classes3.dex */
public final class C4538xcf25c6f6 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    @InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m17801f = "InvalidationTracker.kt", m17802l = {TypedValues.CycleType.TYPE_WAVE_SHAPE}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC9324c);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(TransactionScope<Set<Integer>> transactionScope, InterfaceC9324c<? super Set<Integer>> interfaceC9324c) {
            return ((AnonymousClass1) create(transactionScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
            this.label = 1;
            Object objCheckInvalidatedTables = triggerBasedInvalidationTracker.checkInvalidatedTables(transactionScope, this);
            return objCheckInvalidatedTables == objM17291f ? objM17291f : objCheckInvalidatedTables;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4538xcf25c6f6(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC9324c<? super C4538xcf25c6f6> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C4538xcf25c6f6 c4538xcf25c6f6 = new C4538xcf25c6f6(this.this$0, interfaceC9324c);
        c4538xcf25c6f6.L$0 = obj;
        return c4538xcf25c6f6;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(Transactor transactor, InterfaceC9324c<? super Set<Integer>> interfaceC9324c) {
        return ((C4538xcf25c6f6) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: android.database.SQLException -> L5a
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.AbstractC9079b.m15926b(r7)
            goto L35
        L22:
            kotlin.AbstractC9079b.m15926b(r7)
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
            java.util.Set r7 = p134i7.AbstractC8812w0.m14788f()
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
            java.util.Set r7 = p134i7.AbstractC8812w0.m14788f()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C4538xcf25c6f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
