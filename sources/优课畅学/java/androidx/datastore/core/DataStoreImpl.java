package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8874s1;
import p135i8.AbstractC8875t;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8869r;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private int collectorCounter;
    private InterfaceC9212n collectorJob;
    private final InterfaceC9942a collectorMutex;
    private final InterfaceC8724d coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final InterfaceC9266c data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final InterfaceC8822b0 scope;
    private final Storage<T> storage;
    private final InterfaceC8724d storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public final class InitDataStore extends RunOnce {
        private List<? extends InterfaceC10574p> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends InterfaceC10574p> initTasksList) {
            AbstractC9133u.m16133g(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = AbstractC8778f0.m14544U0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object doRun(p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.AbstractC9079b.m15926b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.AbstractC9079b.m15926b(r7)
                goto L7d
            L40:
                kotlin.AbstractC9079b.m15926b(r7)
                java.util.List<? extends x7.p> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.AbstractC9133u.m16130d(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7f
            L6e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7f:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(m7.c):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {544}, m17803m = "decrementCollector")
    /* renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    public static final class C37291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37291(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37291> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m17801f = "DataStoreImpl.kt", m17802l = {416}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 */
    public static final class C37303 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10570l $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37303(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C37303> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$block = interfaceC10570l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C37303(this.$block, interfaceC9324c);
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
            InterfaceC10570l interfaceC10570l = this.$block;
            this.label = 1;
            Object objInvoke = interfaceC10570l.invoke(this);
            return objInvoke == objM17291f ? objM17291f : objInvoke;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C37303) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {237, 243, 246}, m17803m = "handleUpdate")
    /* renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    public static final class C37311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37311(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37311> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {544}, m17803m = "incrementCollector")
    /* renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    public static final class C37321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37321(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37321> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {264, 266}, m17803m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    public static final class C37341 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37341(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37341> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {287, 296, 304}, m17803m = "readDataAndUpdateCache")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    public static final class C37351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37351(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37351> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m17801f = "DataStoreImpl.kt", m17802l = {298, 300}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    public static final class C37363 extends SuspendLambda implements InterfaceC10570l {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37363(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37363> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C37363(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            State readException;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
            } catch (Throwable th2) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th2;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != objM17291f) {
                    th = th2;
                    obj = version;
                }
            }
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    readException = new ReadException(th, ((Number) obj).intValue());
                    return AbstractC8726f.m14230a(readException, AbstractC9536a.m17796a(true));
                }
                AbstractC9079b.m15926b(obj);
            }
            readException = (State) obj;
            return AbstractC8726f.m14230a(readException, AbstractC9536a.m17796a(true));
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super Pair<? extends State<T>, Boolean>> interfaceC9324c) {
            return ((C37363) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m17801f = "DataStoreImpl.kt", m17802l = {306, 309}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    public static final class C37374 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37374(DataStoreImpl<T> dataStoreImpl, int i10, InterfaceC9324c<? super C37374> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37374 c37374 = new C37374(this.this$0, this.$cachedVersion, interfaceC9324c);
            c37374.Z$0 = ((Boolean) obj).booleanValue();
            return c37374;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            int iIntValue;
            boolean z10;
            State state;
            boolean z11;
            Object objM17291f = AbstractC9434a.m17291f();
            boolean z12 = this.label;
            try {
            } catch (Throwable th2) {
                if (z12 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th2;
                    this.Z$0 = z12;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != objM17291f) {
                        z10 = z12;
                        th = th2;
                        obj = version;
                    }
                } else {
                    boolean z13 = z12;
                    th = th2;
                    iIntValue = this.$cachedVersion;
                    z10 = z13;
                }
            }
            if (z12 == 0) {
                AbstractC9079b.m15926b(obj);
                boolean z14 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z14;
                this.label = 1;
                obj = dataStoreImpl.readDataOrHandleCorruption(z14, this);
                z12 = z14;
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (z12 != 1) {
                    if (z12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = this.Z$0;
                    th = (Throwable) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    iIntValue = ((Number) obj).intValue();
                    ReadException readException = new ReadException(th, iIntValue);
                    z11 = z10;
                    state = readException;
                    return AbstractC8726f.m14230a(state, AbstractC9536a.m17796a(z11));
                }
                boolean z15 = this.Z$0;
                AbstractC9079b.m15926b(obj);
                z12 = z15;
            }
            state = (State) obj;
            z11 = z12;
            return AbstractC8726f.m14230a(state, AbstractC9536a.m17796a(z11));
        }

        public final Object invoke(boolean z10, InterfaceC9324c<? super Pair<? extends State<T>, Boolean>> interfaceC9324c) {
            return ((C37374) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl", m17801f = "DataStoreImpl.kt", m17802l = {365, 366, 368, 369, 380, 384}, m17803m = "readDataOrHandleCorruption")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    public static final class C37381 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37381(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37381> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m17801f = "DataStoreImpl.kt", m17802l = {370, 371}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    public static final class C37392 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37392(DataStoreImpl<T> dataStoreImpl, int i10, InterfaceC9324c<? super C37392> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37392 c37392 = new C37392(this.this$0, this.$preLockVersion, interfaceC9324c);
            c37392.Z$0 = ((Boolean) obj).booleanValue();
            return c37392;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.L$0
                kotlin.AbstractC9079b.m15926b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.Z$0
                kotlin.AbstractC9079b.m15926b(r6)
                goto L34
            L22:
                kotlin.AbstractC9079b.m15926b(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r1
                r5.label = r3
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C37392.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(boolean z10, InterfaceC9324c<? super Data<T>> interfaceC9324c) {
            return ((C37392) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m17801f = "DataStoreImpl.kt", m17802l = {387, 388, 390}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    public static final class C37403 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ Ref$ObjectRef<T> $newData;
        final /* synthetic */ Ref$IntRef $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37403(Ref$ObjectRef<T> ref$ObjectRef, DataStoreImpl<T> dataStoreImpl, Ref$IntRef ref$IntRef, InterfaceC9324c<? super C37403> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.$newData = ref$ObjectRef;
            this.this$0 = dataStoreImpl;
            this.$version = ref$IntRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C37403(this.$newData, this.this$0, this.$version, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$IntRef ref$IntRef;
            Ref$ObjectRef<T> ref$ObjectRef;
            Ref$IntRef ref$IntRef2;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
            } catch (CorruptionException unused) {
                Ref$IntRef ref$IntRef3 = this.$version;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                Object obj2 = this.$newData.f17473a;
                this.L$0 = ref$IntRef3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release(obj2, true, this);
                if (objWriteData$datastore_core_release != objM17291f) {
                    ref$IntRef = ref$IntRef3;
                    obj = objWriteData$datastore_core_release;
                }
            }
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ref$ObjectRef = this.$newData;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                this.L$0 = ref$ObjectRef;
                this.label = 1;
                obj = dataStoreImpl2.readDataFromFileOrDefault(this);
                if (obj == objM17291f) {
                }
                return objM17291f;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    ref$IntRef2 = (Ref$IntRef) this.L$0;
                    AbstractC9079b.m15926b(obj);
                    ref$IntRef2.f17471a = ((Number) obj).intValue();
                    return C8736p.f16368a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$IntRef = (Ref$IntRef) this.L$0;
                AbstractC9079b.m15926b(obj);
                ref$IntRef.f17471a = ((Number) obj).intValue();
                return C8736p.f16368a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            AbstractC9079b.m15926b(obj);
            ref$ObjectRef.f17473a = obj;
            ref$IntRef2 = this.$version;
            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
            this.L$0 = ref$IntRef2;
            this.label = 2;
            obj = coordinator.getVersion(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
            ref$IntRef2.f17471a = ((Number) obj).intValue();
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C37403) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$readState$2", m17801f = "DataStoreImpl.kt", m17802l = {TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, TbsListener.ErrorCode.DEXOAT_EXCEPTION}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    public static final class C37412 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37412(DataStoreImpl<T> dataStoreImpl, boolean z10, InterfaceC9324c<? super C37412> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37412(this.this$0, this.$requireLock, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super State<T>> interfaceC9324c) {
            return ((C37412) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.AbstractC9079b.m15926b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                kotlin.AbstractC9079b.m15926b(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3c
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3c:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                r4.label = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L57:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C37412.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m17801f = "DataStoreImpl.kt", m17802l = {TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE, 337}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    public static final class C37422 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC9100d $callerContext;
        final /* synthetic */ InterfaceC10574p $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37422(DataStoreImpl<T> dataStoreImpl, InterfaceC9100d interfaceC9100d, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C37422> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = dataStoreImpl;
            this.$callerContext = interfaceC9100d;
            this.$transform = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C37422(this.this$0, this.$callerContext, this.$transform, interfaceC9324c);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.L$0
                kotlin.AbstractC9079b.m15926b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.AbstractC9079b.m15926b(r9)
                goto L51
            L27:
                kotlin.AbstractC9079b.m15926b(r9)
                goto L39
            L2b:
                kotlin.AbstractC9079b.m15926b(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.coroutines.d r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                x7.p r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = p135i8.AbstractC8833f.m14848g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = kotlin.jvm.internal.AbstractC9133u.m16128b(r1, r9)
                if (r1 != 0) goto L6b
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C37422.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super T> interfaceC9324c) {
            return ((C37422) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$updateData$2", m17801f = "DataStoreImpl.kt", m17802l = {169}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    public static final class C37432 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37432(DataStoreImpl<T> dataStoreImpl, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C37432> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = dataStoreImpl;
            this.$transform = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37432 c37432 = new C37432(this.this$0, this.$transform, interfaceC9324c);
            c37432.L$0 = obj;
            return c37432;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super T> interfaceC9324c) {
            return ((C37432) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
            InterfaceC8869r interfaceC8869rM14913b = AbstractC8875t.m14913b(null, 1, null);
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, interfaceC8869rM14913b, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), interfaceC8822b0.getCoroutineContext()));
            this.label = 1;
            Object objMo14833u = interfaceC8869rM14913b.mo14833u(this);
            return objMo14833u == objM17291f ? objM17291f : objMo14833u;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends InterfaceC10574p> initTasksList, CorruptionHandler<T> corruptionHandler, InterfaceC8822b0 scope) {
        AbstractC9133u.m16133g(storage, "storage");
        AbstractC9133u.m16133g(initTasksList, "initTasksList");
        AbstractC9133u.m16133g(corruptionHandler, "corruptionHandler");
        AbstractC9133u.m16133g(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = AbstractC9268e.m16990B(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = AbstractC9943b.m18571b(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = AbstractC9078a.m15924b(new InterfaceC10559a(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final StorageConnection<T> invoke() {
                return ((DataStoreImpl) this.this$0).storage.createConnection();
            }
        });
        this.coordinator$delegate = AbstractC9078a.m15924b(new InterfaceC10559a(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }
        });
        this.writeActor = new SimpleActor<>(scope, new InterfaceC10570l(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th));
                }
                if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new InterfaceC10574p() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Message.Update) obj, (Throwable) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(Message.Update<T> msg, Throwable th) {
                AbstractC9133u.m16133g(msg, "msg");
                InterfaceC8869r ack = msg.getAck();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.mo14904a(th);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object decrementCollector(p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C37291
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C37291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            r8.a r1 = (p235r8.InterfaceC9942a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.AbstractC9079b.m15926b(r6)
            r8.a r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            kotlinx.coroutines.n r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            kotlinx.coroutines.InterfaceC9212n.a.m16777a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            h7.p r6 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L5e
            r1.unlock(r4)
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L6a:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.decrementCollector(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super R> interfaceC9324c) {
        return z10 ? interfaceC10570l.invoke(interfaceC9324c) : getCoordinator().lock(new C37303(interfaceC10570l, null), interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v7, types: [i8.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [i8.r] */
    /* JADX WARN: Type inference failed for: r9v3, types: [i8.r] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, p179m7.InterfaceC9324c<? super p123h7.C8736p> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementCollector(p179m7.InterfaceC9324c<? super p123h7.C8736p> r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl.C37321
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C37321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            r8.a r1 = (p235r8.InterfaceC9942a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.AbstractC9079b.m15926b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.AbstractC9079b.m15926b(r12)
            r8.a r12 = r11.collectorMutex
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            i8.b0 r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r8 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.n r12 = p135i8.AbstractC8833f.m14845d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            h7.p r12 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L67
            r1.unlock(r4)
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        L72:
            r1.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.incrementCollector(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C37341
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C37341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.AbstractC9079b.m15926b(r6)
            goto L57
        L44:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, p179m7.InterfaceC9324c<? super androidx.datastore.core.State<T>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(InterfaceC9324c<? super T> interfaceC9324c) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r10, p179m7.InterfaceC9324c<? super androidx.datastore.core.Data<T>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z10, InterfaceC9324c<? super State<T>> interfaceC9324c) {
        return AbstractC8833f.m14848g(this.scope.getCoroutineContext(), new C37412(this, z10, null), interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(InterfaceC10574p interfaceC10574p, InterfaceC9100d interfaceC9100d, InterfaceC9324c<? super T> interfaceC9324c) {
        return getCoordinator().lock(new C37422(this, interfaceC9100d, interfaceC10574p, null), interfaceC9324c);
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC9266c getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) interfaceC9324c.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return AbstractC8833f.m14848g(new UpdatingDataContextElement(updatingDataContextElement, this), new C37432(this, interfaceC10574p, null), interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, p179m7.InterfaceC9324c<? super java.lang.Integer> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref$IntRef) r11
            kotlin.AbstractC9079b.m15926b(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.AbstractC9079b.m15926b(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f17471a
            java.lang.Integer r11 = p201o7.AbstractC9536a.m17798c(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, m7.c):java.lang.Object");
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, InterfaceC8822b0 interfaceC8822b0, int i10, AbstractC9126n abstractC9126n) {
        this(storage, (i10 & 2) != 0 ? AbstractC8809v.m14771n() : list, (i10 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i10 & 8) != 0 ? AbstractC9165e.m16552a(Actual_jvmKt.ioDispatcher().plus(AbstractC8874s1.m14910b(null, 1, null))) : interfaceC8822b0);
    }
}
