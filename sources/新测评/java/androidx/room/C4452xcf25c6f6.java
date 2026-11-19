package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m13558d2 = {"<anonymous>", "", "", "connection", "Landroidx/room/Transactor;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m13596f = "InvalidationTracker.kt", m13597i = {0}, m13598l = {413, TypedValues.CycleType.TYPE_EASING}, m13599m = "invokeSuspend", m13600n = {"connection"}, m13601s = {"L$0"})
/* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 */
/* loaded from: classes3.dex */
public final class C4452xcf25c6f6 extends SuspendLambda implements Function2<Transactor, Continuation<? super Set<? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0003H\n"}, m13558d2 = {"<anonymous>", "", "", "Landroidx/room/TransactionScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m13596f = "InvalidationTracker.kt", m13597i = {}, m13598l = {TypedValues.CycleType.TYPE_WAVE_SHAPE}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Set<? extends Integer>>, Continuation<? super Set<? extends Integer>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(TransactionScope<Set<Integer>> transactionScope, Continuation<? super Set<Integer>> continuation) {
            return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            TransactionScope transactionScope = (TransactionScope) this.L$0;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
            this.label = 1;
            Object objCheckInvalidatedTables = triggerBasedInvalidationTracker.checkInvalidatedTables(transactionScope, this);
            return objCheckInvalidatedTables == coroutine_suspended ? coroutine_suspended : objCheckInvalidatedTables;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(TransactionScope<Set<? extends Integer>> transactionScope, Continuation<? super Set<? extends Integer>> continuation) {
            return invoke2((TransactionScope<Set<Integer>>) transactionScope, (Continuation<? super Set<Integer>>) continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4452xcf25c6f6(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation<? super C4452xcf25c6f6> continuation) {
        super(2, continuation);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C4452xcf25c6f6 c4452xcf25c6f6 = new C4452xcf25c6f6(this.this$0, continuation);
        c4452xcf25c6f6.L$0 = obj;
        return c4452xcf25c6f6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Transactor transactor, Continuation<? super Set<Integer>> continuation) {
        return ((C4452xcf25c6f6) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: android.database.SQLException -> L5a
            goto L57
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            androidx.room.Transactor r1 = (androidx.room.Transactor) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L35
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
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
            java.util.Set r7 = kotlin.collections.SetsKt.emptySet()
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
            java.util.Set r7 = kotlin.collections.SetsKt.emptySet()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C4452xcf25c6f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Transactor transactor, Continuation<? super Set<? extends Integer>> continuation) {
        return invoke2(transactor, (Continuation<? super Set<Integer>>) continuation);
    }
}
