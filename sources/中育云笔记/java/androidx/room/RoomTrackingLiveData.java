package androidx.room;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9924b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final InterfaceC9945d launchContext;
    private final InvalidationTracker.Observer observer;
    private final AtomicBoolean registeredObserver;

    @InterfaceC11829d(m26210c = "androidx.room.RoomTrackingLiveData$invalidated$1", m26211f = "RoomTrackingLiveData.android.kt", m26212l = {113}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomTrackingLiveData$invalidated$1 */
    public static final class C44791 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44791(RoomTrackingLiveData<T> roomTrackingLiveData, InterfaceC11588c<? super C44791> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44791(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44791) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.RoomTrackingLiveData$onActive$1", m26211f = "RoomTrackingLiveData.android.kt", m26212l = {PatchStatus.CODE_LOAD_RES_ADDASSERTPATH}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomTrackingLiveData$onActive$1 */
    public static final class C44801 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44801(RoomTrackingLiveData<T> roomTrackingLiveData, InterfaceC11588c<? super C44801> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44801(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                RoomTrackingLiveData<T> roomTrackingLiveData = this.this$0;
                this.label = 1;
                if (roomTrackingLiveData.refresh(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44801) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.RoomTrackingLiveData", m26211f = "RoomTrackingLiveData.android.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "refresh")
    /* renamed from: androidx.room.RoomTrackingLiveData$refresh$1 */
    public static final class C44811 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44811(RoomTrackingLiveData<T> roomTrackingLiveData, InterfaceC11588c<? super C44811> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.refresh(this);
        }
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z10, String[] strArr, AbstractC9972n abstractC9972n) {
        this(roomDatabase, invalidationLiveDataContainer, z10, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void invalidated() {
        boolean zHasActiveObservers = hasActiveObservers();
        if (this.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            AbstractC11117h.m24726d(this.database.getCoroutineScope(), this.launchContext, null, new C44791(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0033, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002c, B:29:0x0069), top: B:49:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:12:0x002c, B:27:0x0061, B:29:0x0069, B:36:0x0083, B:33:0x0079, B:34:0x0080), top: B:48:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:27:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0092 -> B:41:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.room.RoomTrackingLiveData.C44811
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = (androidx.room.RoomTrackingLiveData.C44811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = new androidx.room.RoomTrackingLiveData$refresh$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r2 = r0.I$0
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomTrackingLiveData r5 = (androidx.room.RoomTrackingLiveData) r5
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r7 = r2
            r2 = r9
            r9 = r7
            goto L61
        L33:
            r9 = move-exception
            goto L8c
        L35:
            r9 = move-exception
            goto L79
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            kotlin.AbstractC9924b.m20071b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.registeredObserver
            boolean r9 = r9.compareAndSet(r3, r4)
            if (r9 == 0) goto L55
            androidx.room.RoomDatabase r9 = r8.database
            androidx.room.InvalidationTracker r9 = r9.getInvalidationTracker()
            androidx.room.InvalidationTracker$Observer r2 = r8.observer
            r9.addWeakObserver(r2)
        L55:
            r9 = r8
        L56:
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.computing
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L92
            r2 = 0
            r5 = r9
            r9 = r3
        L61:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.invalid     // Catch: java.lang.Throwable -> L33
            boolean r6 = r6.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L81
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.label = r4     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.Object r9 = r5.compute(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r9 != r1) goto L76
            return r1
        L76:
            r2 = r9
            r9 = r4
            goto L61
        L79:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Exception while computing database live data."
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L81:
            if (r9 == 0) goto L86
            r5.postValue(r2)     // Catch: java.lang.Throwable -> L33
        L86:
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.computing
            r2.set(r3)
            goto L94
        L8c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r3)
            throw r9
        L92:
            r5 = r9
            r9 = r3
        L94:
            if (r9 == 0) goto La1
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.invalid
            boolean r9 = r9.get()
            if (r9 != 0) goto L9f
            goto La1
        L9f:
            r9 = r5
            goto L56
        La1:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomTrackingLiveData.refresh(vc.c):java.lang.Object");
    }

    public abstract Object compute(InterfaceC11588c<? super T> interfaceC11588c);

    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.container.onActive(this);
        AbstractC11117h.m24726d(this.database.getCoroutineScope(), this.launchContext, null, new C44801(this, null), 2, null);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.container.onInactive(this);
    }

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z10, String[] strArr) {
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z10;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = roomDatabase.inCompatibilityMode$room_runtime_release() ? z10 ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : EmptyCoroutineContext.f23351c;
    }
}
