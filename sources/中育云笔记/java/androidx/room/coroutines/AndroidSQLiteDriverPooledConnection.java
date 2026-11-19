package androidx.room.coroutines;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p152fd.AbstractC9223a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class AndroidSQLiteDriverPooledConnection implements Transactor, RawConnectionAccessor {
    private Transactor.SQLiteTransactionType currentTransactionType;
    private final AndroidSQLiteConnection delegate;

    public final class AndroidSQLiteDriverTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public AndroidSQLiteDriverTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection getRawConnection() {
            return AndroidSQLiteDriverPooledConnection.this.getRawConnection();
        }

        @Override // androidx.room.TransactionScope
        public Object rollback(T t10, InterfaceC11588c<?> interfaceC11588c) throws ConnectionPool.RollbackException {
            throw new ConnectionPool.RollbackException(t10);
        }

        @Override // androidx.room.PooledConnection
        public <R> Object usePrepared(String str, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) {
            return AndroidSQLiteDriverPooledConnection.this.usePrepared(str, interfaceC9540l, interfaceC11588c);
        }

        @Override // androidx.room.TransactionScope
        public <R> Object withNestedTransaction(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
            AndroidSQLiteDriverPooledConnection androidSQLiteDriverPooledConnection = AndroidSQLiteDriverPooledConnection.this;
            Transactor.SQLiteTransactionType sQLiteTransactionType = androidSQLiteDriverPooledConnection.currentTransactionType;
            if (sQLiteTransactionType != null) {
                return androidSQLiteDriverPooledConnection.transaction(sQLiteTransactionType, interfaceC9544p, interfaceC11588c);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.coroutines.AndroidSQLiteDriverPooledConnection", m26211f = "AndroidSQLiteDriverConnectionPool.android.kt", m26212l = {Opcodes.POP}, m26213m = "transaction")
    /* renamed from: androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1 */
    public static final class C44961<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C44961(InterfaceC11588c<? super C44961> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSQLiteDriverPooledConnection.this.transaction(null, null, this);
        }
    }

    public AndroidSQLiteDriverPooledConnection(AndroidSQLiteConnection delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object transaction(androidx.room.Transactor.SQLiteTransactionType r6, p181hd.InterfaceC9544p r7, vc.InterfaceC11588c<? super R> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.C44961
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1 r0 = (androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.C44961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1 r0 = new androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$transaction$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.L$1
            android.database.sqlite.SQLiteDatabase r6 = (android.database.sqlite.SQLiteDatabase) r6
            java.lang.Object r7 = r0.L$0
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection r7 = (androidx.room.coroutines.AndroidSQLiteDriverPooledConnection) r7
            kotlin.AbstractC9924b.m20071b(r8)     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            goto L88
        L32:
            r8 = move-exception
            goto Lb2
        L35:
            r8 = move-exception
            goto La2
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.sqlite.driver.AndroidSQLiteConnection r8 = r5.delegate
            android.database.sqlite.SQLiteDatabase r8 = r8.getDb()
            boolean r2 = r8.inTransaction()
            if (r2 != 0) goto L51
            r5.currentTransactionType = r6
        L51:
            int[] r2 = androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L6f
            r2 = 2
            if (r6 == r2) goto L6b
            r2 = 3
            if (r6 != r2) goto L65
            r8.beginTransaction()
            goto L72
        L65:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6b:
            r8.beginTransactionNonExclusive()
            goto L72
        L6f:
            r8.beginTransactionNonExclusive()
        L72:
            androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$AndroidSQLiteDriverTransactor r6 = new androidx.room.coroutines.AndroidSQLiteDriverPooledConnection$AndroidSQLiteDriverTransactor     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r6.<init>()     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            r0.label = r4     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L97 androidx.room.coroutines.ConnectionPool.RollbackException -> L9d
            if (r6 != r1) goto L84
            return r1
        L84:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L88:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32 androidx.room.coroutines.ConnectionPool.RollbackException -> L35
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto L96
            r7.currentTransactionType = r3
        L96:
            return r8
        L97:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto Lb2
        L9d:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        La2:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Throwable -> L32
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lb1
            r7.currentTransactionType = r3
        Lb1:
            return r8
        Lb2:
            r6.endTransaction()
            boolean r6 = r6.inTransaction()
            if (r6 != 0) goto Lbd
            r7.currentTransactionType = r3
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.AndroidSQLiteDriverPooledConnection.transaction(androidx.room.Transactor$SQLiteTransactionType, hd.p, vc.c):java.lang.Object");
    }

    public final AndroidSQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public Object inTransaction(InterfaceC11588c<? super Boolean> interfaceC11588c) {
        return AbstractC11826a.m26206a(this.delegate.getDb().inTransaction());
    }

    @Override // androidx.room.PooledConnection
    public <R> Object usePrepared(String str, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super R> interfaceC11588c) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = this.delegate.prepare(str);
        try {
            Object objInvoke = interfaceC9540l.invoke(sQLiteStatementPrepare);
            AbstractC9223a.m18142a(sQLiteStatementPrepare, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    public <R> Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return transaction(sQLiteTransactionType, interfaceC9544p, interfaceC11588c);
    }
}
