package androidx.room;

import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11116g2;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {

    @InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", m26211f = "RoomDatabase.android.kt", m26212l = {2001}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2 */
    public static final class C44772 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44772(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C44772> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.$this_withTransaction = roomDatabase;
            this.$block = interfaceC9540l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C44772(this.$this_withTransaction, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    this.$this_withTransaction.beginTransaction();
                    InterfaceC9540l interfaceC9540l = this.$block;
                    this.label = 1;
                    obj = interfaceC9540l.invoke(this);
                    if (obj == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                this.$this_withTransaction.setTransactionSuccessful();
                return obj;
            } finally {
                this.$this_withTransaction.endTransaction();
            }
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C44772) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9945d createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(RoomDatabase roomDatabase, InterfaceC9944c interfaceC9944c) {
        TransactionElement transactionElement = new TransactionElement(interfaceC9944c);
        return interfaceC9944c.plus(transactionElement).plus(AbstractC11116g2.m24722a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    @InterfaceC10770a
    public static final InterfaceC11594c invalidationTrackerFlow(RoomDatabase roomDatabase, String[] tables, boolean z10) {
        AbstractC9979u.m20294g(roomDatabase, "<this>");
        AbstractC9979u.m20294g(tables, "tables");
        return roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tables, tables.length), z10);
    }

    public static /* synthetic */ InterfaceC11594c invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return RoomDatabaseKt.invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(final RoomDatabase roomDatabase, final InterfaceC9945d interfaceC9945d, final InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                @InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", m26211f = "RoomDatabase.android.kt", m26212l = {2048}, m26213m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ InterfaceC11125j $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ InterfaceC9544p $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(RoomDatabase roomDatabase, InterfaceC11125j interfaceC11125j, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = interfaceC11125j;
                        this.$transactionBlock = interfaceC9544p;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, interfaceC11588c);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        InterfaceC11588c interfaceC11588c;
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            InterfaceC9945d.b bVar = ((InterfaceC11122i0) this.L$0).getCoroutineContext().get(InterfaceC9944c.f23354a0);
                            AbstractC9979u.m20291d(bVar);
                            InterfaceC9945d interfaceC9945dCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt = RoomDatabaseKt__RoomDatabase_androidKt.createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(this.$this_startTransactionCoroutine, (InterfaceC9944c) bVar);
                            InterfaceC11125j interfaceC11125j = this.$continuation;
                            Result.C9921a c9921a = Result.f23263d;
                            InterfaceC9544p interfaceC9544p = this.$transactionBlock;
                            this.L$0 = interfaceC11125j;
                            this.label = 1;
                            obj = AbstractC11109f.m24709g(interfaceC9945dCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt, interfaceC9544p, this);
                            if (obj == objM25952f) {
                                return objM25952f;
                            }
                            interfaceC11588c = interfaceC11125j;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC11588c = (InterfaceC11588c) this.L$0;
                            AbstractC9924b.m20071b(obj);
                        }
                        interfaceC11588c.resumeWith(Result.m20054c(obj));
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AbstractC11109f.m24707e(interfaceC9945d.minusKey(InterfaceC9944c.f23354a0), new AnonymousClass1(roomDatabase, c9997c, interfaceC9544p, null));
                    } catch (Throwable th) {
                        c9997c.mo20530o(th);
                    }
                }
            });
        } catch (RejectedExecutionException e10) {
            c9997c.mo20530o(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        return RoomDatabaseKt.withTransactionContext(roomDatabase, new C44772(roomDatabase, interfaceC9540l, null), interfaceC11588c);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
        C4478x2e53b6b3 c4478x2e53b6b3 = new C4478x2e53b6b3(interfaceC9540l, null);
        TransactionElement transactionElement = (TransactionElement) interfaceC11588c.getContext().get(TransactionElement.Key);
        InterfaceC9944c transactionDispatcher$room_runtime_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_runtime_release() : null;
        return transactionDispatcher$room_runtime_release != null ? AbstractC11109f.m24709g(transactionDispatcher$room_runtime_release, c4478x2e53b6b3, interfaceC11588c) : startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(roomDatabase, interfaceC11588c.getContext(), c4478x2e53b6b3, interfaceC11588c);
    }
}
