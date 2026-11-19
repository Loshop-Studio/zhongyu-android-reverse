package androidx.room.support;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class AutoCloser {
    public static final String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    public static final Companion Companion = new Companion(null);
    private InterfaceC10045g autoCloseJob;
    private final long autoCloseTimeoutInMs;
    private InterfaceC11122i0 coroutineScope;

    @GuardedBy("lock")
    private SupportSQLiteDatabase delegateDatabase;
    private SupportSQLiteOpenHelper delegateOpenHelper;
    private AtomicLong lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private InterfaceC9529a onAutoCloseCallback;
    private final AtomicInteger referenceCount;
    private final Watch watch;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public interface Watch {
        long getMillis();
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", m26211f = "AutoCloser.android.kt", m26212l = {Opcodes.GOTO}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2 */
    public static final class C45422 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45422(InterfaceC11588c<? super C45422> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return AutoCloser.this.new C45422(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                long j10 = AutoCloser.this.autoCloseTimeoutInMs;
                this.label = 1;
                if (DelayKt.m20376b(j10, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            AutoCloser.this.autoCloseDatabase();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45422) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public AutoCloser(long j10, TimeUnit timeUnit, Watch watch) {
        AbstractC9979u.m20294g(timeUnit, "timeUnit");
        AbstractC9979u.m20294g(watch, "watch");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j10);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.getMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoCloseDatabase() {
        synchronized (this.lock) {
            try {
                if (this.watch.getMillis() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                InterfaceC9529a interfaceC9529a = this.onAutoCloseCallback;
                if (interfaceC9529a == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                interfaceC9529a.invoke();
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                InterfaceC10045g interfaceC10045g = this.autoCloseJob;
                if (interfaceC10045g != null) {
                    InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                }
                this.autoCloseJob = null;
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        InterfaceC11122i0 interfaceC11122i0;
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.getMillis());
        if (iDecrementAndGet == 0) {
            InterfaceC11122i0 interfaceC11122i02 = this.coroutineScope;
            if (interfaceC11122i02 == null) {
                AbstractC9979u.m20312y("coroutineScope");
                interfaceC11122i0 = null;
            } else {
                interfaceC11122i0 = interfaceC11122i02;
            }
            this.autoCloseJob = AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C45422(null), 3, null);
        }
    }

    public final <V> V executeRefCountingFunction(InterfaceC9540l block) {
        AbstractC9979u.m20294g(block, "block");
        try {
            return (V) block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final InterfaceC9529a getAutoCloseCallbackForTest$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final int getRefCountForTest$room_runtime_release() {
        return this.referenceCount.get();
    }

    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        InterfaceC10045g interfaceC10045g = this.autoCloseJob;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = null;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelper2 = this.delegateOpenHelper;
            if (supportSQLiteOpenHelper2 == null) {
                AbstractC9979u.m20312y("delegateOpenHelper");
            } else {
                supportSQLiteOpenHelper = supportSQLiteOpenHelper2;
            }
            SupportSQLiteDatabase writableDatabase = supportSQLiteOpenHelper.getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void initCoroutineScope(InterfaceC11122i0 coroutineScope) {
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final void initOpenHelper(SupportSQLiteOpenHelper delegateOpenHelper) {
        AbstractC9979u.m20294g(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof AutoClosingRoomOpenHelper) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(InterfaceC9529a onAutoClose) {
        AbstractC9979u.m20294g(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public /* synthetic */ AutoCloser(long j10, TimeUnit timeUnit, Watch watch, int i10, AbstractC9972n abstractC9972n) {
        this(j10, timeUnit, (i10 & 4) != 0 ? new Watch() { // from class: androidx.room.support.a
            @Override // androidx.room.support.AutoCloser.Watch
            public final long getMillis() {
                return SystemClock.uptimeMillis();
            }
        } : watch);
    }
}
