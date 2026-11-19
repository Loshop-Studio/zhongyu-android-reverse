package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import p123h7.C8736p;
import p124h8.AbstractC8740c;
import p124h8.C8738a;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    private final AtomicBoolean _isClosed;
    private final SQLiteDriver driver;
    private final Pool readers;
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private boolean throwOnTimeout;
    private long timeout;
    private final Pool writers;

    @InterfaceC9539d(m17800c = "androidx.room.coroutines.ConnectionPoolImpl", m17801f = "ConnectionPoolImpl.kt", m17802l = {116, 120, 138, 143}, m17803m = "useConnection")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1 */
    public static final class C45491<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C45491(InterfaceC9324c<? super C45491> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m17801f = "ConnectionPoolImpl.kt", m17802l = {117}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2 */
    public static final class C45502 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45502(InterfaceC10574p interfaceC10574p, PooledConnectionImpl pooledConnectionImpl, InterfaceC9324c<? super C45502> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45502(this.$block, this.$confinedConnection, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C45502) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            InterfaceC10574p interfaceC10574p = this.$block;
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = interfaceC10574p.invoke(pooledConnectionImpl, this);
            return objInvoke == objM17291f ? objM17291f : objInvoke;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m17801f = "ConnectionPoolImpl.kt", m17802l = {143}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4 */
    public static final class C45514 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ Ref$ObjectRef<PooledConnectionImpl> $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45514(InterfaceC10574p interfaceC10574p, Ref$ObjectRef<PooledConnectionImpl> ref$ObjectRef, InterfaceC9324c<? super C45514> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
            this.$connection = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45514(this.$block, this.$connection, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C45514) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            InterfaceC10574p interfaceC10574p = this.$block;
            Object obj2 = this.$connection.f17473a;
            this.label = 1;
            Object objInvoke = interfaceC10574p.invoke(obj2, this);
            return objInvoke == objM17291f ? objM17291f : objInvoke;
        }
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName) {
        AbstractC9133u.m16133g(driver, "driver");
        AbstractC9133u.m16133g(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        C8738a.a aVar = C8738a.f16369b;
        this.timeout = AbstractC8740c.m14387s(30, DurationUnit.f17530e);
        this.driver = driver;
        Pool pool = new Pool(1, new InterfaceC10559a() { // from class: androidx.room.coroutines.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return driver.open(fileName);
            }
        });
        this.readers = pool;
        this.writers = pool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) throws Exception {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    private final InterfaceC9100d createConnectionContext(PooledConnectionImpl pooledConnectionImpl) {
        return new ConnectionElement(pooledConnectionImpl).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, pooledConnectionImpl));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final void onTimeout(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append('\n');
        sb.append('\n');
        sb.append("Writer pool:");
        sb.append('\n');
        this.writers.dump(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.dump(sb);
        try {
            SQLite.throwSQLiteException(5, sb.toString());
            throw new KotlinNothingValueException();
        } catch (SQLException e10) {
            if (this.throwOnTimeout) {
                throw e10;
            }
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z10) {
        connectionPoolImpl.onTimeout(z10);
        return C8736p.f16368a;
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }

    public final boolean getThrowOnTimeout$room_runtime_release() {
        return this.throwOnTimeout;
    }

    /* renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name */
    public final long m27217getTimeoutUwyO8pc$room_runtime_release() {
        return this.timeout;
    }

    public final void setThrowOnTimeout$room_runtime_release(boolean z10) {
        this.throwOnTimeout = z10;
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m27218setTimeoutLRDsOJo$room_runtime_release(long j10) {
        this.timeout = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x012c A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:74:0x014f, B:76:0x0155), top: B:96:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c A[Catch: all -> 0x0167, TRY_ENTER, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object useConnection(final boolean r13, p300x7.InterfaceC10574p r14, p179m7.InterfaceC9324c<? super R> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, x7.p, m7.c):java.lang.Object");
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName, int i10, int i11) {
        AbstractC9133u.m16133g(driver, "driver");
        AbstractC9133u.m16133g(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        C8738a.a aVar = C8738a.f16369b;
        this.timeout = AbstractC8740c.m14387s(30, DurationUnit.f17530e);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new Pool(i10, new InterfaceC10559a() { // from class: androidx.room.coroutines.b
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return ConnectionPoolImpl._init_$lambda$4(driver, fileName);
                }
            });
            this.writers = new Pool(i11, new InterfaceC10559a() { // from class: androidx.room.coroutines.c
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return driver.open(fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
