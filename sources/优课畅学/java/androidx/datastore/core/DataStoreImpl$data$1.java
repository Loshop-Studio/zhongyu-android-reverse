package androidx.datastore.core;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$data$1", m17801f = "DataStoreImpl.kt", m17802l = {72, 74, 100}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DataStoreImpl$data$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$data$1$1", m17801f = "DataStoreImpl.kt", m17802l = {102}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1 */
    public static final class C37251 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37251(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37251> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C37251(this.this$0, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C37251) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$data$1$2", m17801f = "DataStoreImpl.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2 */
    public static final class C37262 extends SuspendLambda implements InterfaceC10574p {
        /* synthetic */ Object L$0;
        int label;

        public C37262(InterfaceC9324c<? super C37262> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37262 c37262 = new C37262(interfaceC9324c);
            c37262.L$0 = obj;
            return c37262;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(State<T> state, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37262) create(state, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(!(((State) this.L$0) instanceof Final));
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$data$1$3", m17801f = "DataStoreImpl.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3 */
    public static final class C37273 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37273(State<T> state, InterfaceC9324c<? super C37273> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37273 c37273 = new C37273(this.$startState, interfaceC9324c);
            c37273.L$0 = obj;
            return c37273;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(State<T> state, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            return ((C37273) create(state, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            State state = (State) this.L$0;
            return AbstractC9536a.m17796a((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.DataStoreImpl$data$1$5", m17801f = "DataStoreImpl.kt", m17802l = {116}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5 */
    public static final class C37285 extends SuspendLambda implements InterfaceC10575q {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37285(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super C37285> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(InterfaceC9267d interfaceC9267d, Throwable th, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return new C37285(this.this$0, interfaceC9324c).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, InterfaceC9324c<? super DataStoreImpl$data$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, interfaceC9324c);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (p169l8.AbstractC9268e.m17031u(r1, r9, r8) == r0) goto L33;
     */
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
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.AbstractC9079b.m15926b(r9)
            goto Lbe
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$1
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            java.lang.Object r3 = r8.L$0
            l8.d r3 = (p169l8.InterfaceC9267d) r3
            kotlin.AbstractC9079b.m15926b(r9)
            goto L67
        L2a:
            java.lang.Object r1 = r8.L$0
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r9)
            goto L4b
        L32:
            kotlin.AbstractC9079b.m15926b(r9)
            java.lang.Object r9 = r8.L$0
            l8.d r9 = (p169l8.InterfaceC9267d) r9
            androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
            r8.L$0 = r9
            r8.label = r4
            r4 = 0
            java.lang.Object r1 = androidx.datastore.core.DataStoreImpl.access$readState(r1, r4, r8)
            if (r1 != r0) goto L48
            goto Lbd
        L48:
            r7 = r1
            r1 = r9
            r9 = r7
        L4b:
            androidx.datastore.core.State r9 = (androidx.datastore.core.State) r9
            boolean r4 = r9 instanceof androidx.datastore.core.Data
            if (r4 == 0) goto L6a
            r4 = r9
            androidx.datastore.core.Data r4 = (androidx.datastore.core.Data) r4
            java.lang.Object r4 = r4.getValue()
            r8.L$0 = r1
            r8.L$1 = r9
            r8.label = r3
            java.lang.Object r3 = r1.emit(r4, r8)
            if (r3 != r0) goto L65
            goto Lbd
        L65:
            r3 = r1
            r1 = r9
        L67:
            r9 = r1
            r1 = r3
            goto L79
        L6a:
            boolean r3 = r9 instanceof androidx.datastore.core.UnInitialized
            if (r3 != 0) goto Lc8
            boolean r3 = r9 instanceof androidx.datastore.core.ReadException
            if (r3 != 0) goto Lc1
            boolean r3 = r9 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L79
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        L79:
            androidx.datastore.core.DataStoreImpl<T> r3 = r8.this$0
            androidx.datastore.core.DataStoreInMemoryCache r3 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r3)
            l8.c r3 = r3.getFlow()
            androidx.datastore.core.DataStoreImpl$data$1$1 r4 = new androidx.datastore.core.DataStoreImpl$data$1$1
            androidx.datastore.core.DataStoreImpl<T> r5 = r8.this$0
            r6 = 0
            r4.<init>(r5, r6)
            l8.c r3 = p169l8.AbstractC9268e.m17001M(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$2 r4 = new androidx.datastore.core.DataStoreImpl$data$1$2
            r4.<init>(r6)
            l8.c r3 = p169l8.AbstractC9268e.m17008T(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$3 r4 = new androidx.datastore.core.DataStoreImpl$data$1$3
            r4.<init>(r9, r6)
            l8.c r9 = p169l8.AbstractC9268e.m17029s(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 r3 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1
            r3.<init>()
            androidx.datastore.core.DataStoreImpl$data$1$5 r9 = new androidx.datastore.core.DataStoreImpl$data$1$5
            androidx.datastore.core.DataStoreImpl<T> r4 = r8.this$0
            r9.<init>(r4, r6)
            l8.c r9 = p169l8.AbstractC9268e.m16999K(r3, r9)
            r8.L$0 = r6
            r8.L$1 = r6
            r8.label = r2
            java.lang.Object r9 = p169l8.AbstractC9268e.m17031u(r1, r9, r8)
            if (r9 != r0) goto Lbe
        Lbd:
            return r0
        Lbe:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        Lc1:
            androidx.datastore.core.ReadException r9 = (androidx.datastore.core.ReadException) r9
            java.lang.Throwable r9 = r9.getReadException()
            throw r9
        Lc8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((DataStoreImpl$data$1) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
