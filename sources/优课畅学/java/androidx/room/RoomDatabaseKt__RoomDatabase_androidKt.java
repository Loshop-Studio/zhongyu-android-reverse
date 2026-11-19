package androidx.room;

import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8880u1;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8845j;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {

    @InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", m17801f = "RoomDatabase.android.kt", m17802l = {2001}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2 */
    public static final class C45292 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45292(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C45292> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$this_withTransaction = roomDatabase;
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C45292(this.$this_withTransaction, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    this.$this_withTransaction.beginTransaction();
                    InterfaceC10570l interfaceC10570l = this.$block;
                    this.label = 1;
                    obj = interfaceC10570l.invoke(this);
                    if (obj == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                this.$this_withTransaction.setTransactionSuccessful();
                return obj;
            } finally {
                this.$this_withTransaction.endTransaction();
            }
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C45292) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9100d createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(RoomDatabase roomDatabase, InterfaceC9099c interfaceC9099c) {
        TransactionElement transactionElement = new TransactionElement(interfaceC9099c);
        return interfaceC9099c.plus(transactionElement).plus(AbstractC8880u1.m14917a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    @InterfaceC8721a
    public static final InterfaceC9266c invalidationTrackerFlow(RoomDatabase roomDatabase, String[] tables, boolean z10) {
        AbstractC9133u.m16133g(roomDatabase, "<this>");
        AbstractC9133u.m16133g(tables, "tables");
        return roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tables, tables.length), z10);
    }

    public static /* synthetic */ InterfaceC9266c invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return RoomDatabaseKt.invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(final RoomDatabase roomDatabase, final InterfaceC9100d interfaceC9100d, final InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                @InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", m17801f = "RoomDatabase.android.kt", m17802l = {2048}, m17803m = "invokeSuspend")
                /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    final /* synthetic */ InterfaceC8845j $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ InterfaceC10574p $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(RoomDatabase roomDatabase, InterfaceC8845j interfaceC8845j, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = interfaceC8845j;
                        this.$transactionBlock = interfaceC10574p;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, interfaceC9324c);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        InterfaceC9324c interfaceC9324c;
                        Object objM17291f = AbstractC9434a.m17291f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9079b.m15926b(obj);
                            InterfaceC9100d.b bVar = ((InterfaceC8822b0) this.L$0).getCoroutineContext().get(InterfaceC9099c.f17441b0);
                            AbstractC9133u.m16130d(bVar);
                            InterfaceC9100d interfaceC9100dCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt = RoomDatabaseKt__RoomDatabase_androidKt.createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(this.$this_startTransactionCoroutine, (InterfaceC9099c) bVar);
                            InterfaceC8845j interfaceC8845j = this.$continuation;
                            Result.C9076a c9076a = Result.f17350b;
                            InterfaceC10574p interfaceC10574p = this.$transactionBlock;
                            this.L$0 = interfaceC8845j;
                            this.label = 1;
                            obj = AbstractC8833f.m14848g(interfaceC9100dCreateTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt, interfaceC10574p, this);
                            if (obj == objM17291f) {
                                return objM17291f;
                            }
                            interfaceC9324c = interfaceC8845j;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC9324c = (InterfaceC9324c) this.L$0;
                            AbstractC9079b.m15926b(obj);
                        }
                        interfaceC9324c.resumeWith(Result.m15909b(obj));
                        return C8736p.f16368a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AbstractC8833f.m14846e(interfaceC9100d.minusKey(InterfaceC9099c.f17441b0), new AnonymousClass1(roomDatabase, c9155c, interfaceC10574p, null));
                    } catch (Throwable th) {
                        c9155c.mo14871i(th);
                    }
                }
            });
        } catch (RejectedExecutionException e10) {
            c9155c.mo14871i(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public static final <R> Object withTransaction(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return RoomDatabaseKt.withTransactionContext(roomDatabase, new C45292(roomDatabase, interfaceC10570l, null), interfaceC9324c);
    }

    public static final <R> Object withTransactionContext(RoomDatabase roomDatabase, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        C4530x2e53b6b3 c4530x2e53b6b3 = new C4530x2e53b6b3(interfaceC10570l, null);
        TransactionElement transactionElement = (TransactionElement) interfaceC9324c.getContext().get(TransactionElement.Key);
        InterfaceC9099c transactionDispatcher$room_runtime_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_runtime_release() : null;
        return transactionDispatcher$room_runtime_release != null ? AbstractC8833f.m14848g(transactionDispatcher$room_runtime_release, c4530x2e53b6b3, interfaceC9324c) : startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(roomDatabase, interfaceC9324c.getContext(), c4530x2e53b6b3, interfaceC9324c);
    }
}
