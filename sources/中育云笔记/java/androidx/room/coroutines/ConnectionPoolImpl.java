package androidx.room.coroutines;

import android.database.SQLException;
import androidx.compose.material3.MenuKt;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p326rd.AbstractC10988c;
import p326rd.C10986a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    private final AtomicBoolean _isClosed;
    private final SQLiteDriver driver;
    private final Pool readers;
    private final ThreadLocal<PooledConnectionImpl> threadLocal;
    private boolean throwOnTimeout;
    private long timeout;
    private final Pool writers;

    @InterfaceC11829d(m26210c = "androidx.room.coroutines.ConnectionPoolImpl", m26211f = "ConnectionPoolImpl.kt", m26212l = {116, MenuKt.InTransitionDuration, 138, 143}, m26213m = "useConnection")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1 */
    public static final class C44971<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C44971(InterfaceC11588c<? super C44971> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m26211f = "ConnectionPoolImpl.kt", m26212l = {117}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2 */
    public static final class C44982 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ PooledConnectionImpl $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44982(InterfaceC9544p interfaceC9544p, PooledConnectionImpl pooledConnectionImpl, InterfaceC11588c<? super C44982> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
            this.$confinedConnection = pooledConnectionImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44982(this.$block, this.$confinedConnection, interfaceC11588c);
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
            InterfaceC9544p interfaceC9544p = this.$block;
            PooledConnectionImpl pooledConnectionImpl = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = interfaceC9544p.invoke(pooledConnectionImpl, this);
            return objInvoke == objM25952f ? objM25952f : objInvoke;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C44982) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m26211f = "ConnectionPoolImpl.kt", m26212l = {143}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4 */
    public static final class C44994 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ Ref$ObjectRef<PooledConnectionImpl> $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44994(InterfaceC9544p interfaceC9544p, Ref$ObjectRef<PooledConnectionImpl> ref$ObjectRef, InterfaceC11588c<? super C44994> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
            this.$connection = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44994(this.$block, this.$connection, interfaceC11588c);
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
            InterfaceC9544p interfaceC9544p = this.$block;
            Object obj2 = this.$connection.f23402c;
            this.label = 1;
            Object objInvoke = interfaceC9544p.invoke(obj2, this);
            return objInvoke == objM25952f ? objM25952f : objInvoke;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C44994) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName) {
        AbstractC9979u.m20294g(driver, "driver");
        AbstractC9979u.m20294g(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        C10986a.a aVar = C10986a.f26491d;
        this.timeout = AbstractC10988c.m24228s(30, DurationUnit.f23459g);
        this.driver = driver;
        Pool pool = new Pool(1, new InterfaceC9529a() { // from class: androidx.room.coroutines.d
            @Override // p181hd.InterfaceC9529a
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

    private final InterfaceC9945d createConnectionContext(PooledConnectionImpl pooledConnectionImpl) {
        return new ConnectionElement(pooledConnectionImpl).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, pooledConnectionImpl));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final void onTimeout(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.dump(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.dump(sb2);
        try {
            SQLite.throwSQLiteException(5, sb2.toString());
            throw new KotlinNothingValueException();
        } catch (SQLException e10) {
            if (this.throwOnTimeout) {
                throw e10;
            }
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z10) {
        connectionPoolImpl.onTimeout(z10);
        return C10786q.f26013a;
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
    public final long m33812getTimeoutUwyO8pc$room_runtime_release() {
        return this.timeout;
    }

    public final void setThrowOnTimeout$room_runtime_release(boolean z10) {
        this.throwOnTimeout = z10;
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m33813setTimeoutLRDsOJo$room_runtime_release(long j10) {
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
    public <R> java.lang.Object useConnection(final boolean r13, p181hd.InterfaceC9544p r14, vc.InterfaceC11588c<? super R> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.useConnection(boolean, hd.p, vc.c):java.lang.Object");
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName, int i10, int i11) {
        AbstractC9979u.m20294g(driver, "driver");
        AbstractC9979u.m20294g(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        C10986a.a aVar = C10986a.f26491d;
        this.timeout = AbstractC10988c.m24228s(30, DurationUnit.f23459g);
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new Pool(i10, new InterfaceC9529a() { // from class: androidx.room.coroutines.b
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return ConnectionPoolImpl._init_$lambda$4(driver, fileName);
                }
            });
            this.writers = new Pool(i11, new InterfaceC9529a() { // from class: androidx.room.coroutines.c
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return driver.open(fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
