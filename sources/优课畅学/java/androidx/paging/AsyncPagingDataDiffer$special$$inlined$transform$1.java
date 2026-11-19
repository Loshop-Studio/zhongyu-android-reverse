package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", m17801f = "AsyncPagingDataDiffer.kt", m17802l = {40}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$special$$inlined$transform$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC9266c $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer this$0;

    /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 */
    public static final class C42821<T> implements InterfaceC9267d {
        final /* synthetic */ InterfaceC9267d $$this$flow;
        final /* synthetic */ AsyncPagingDataDiffer this$0;

        @InterfaceC9539d(m17800c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", m17801f = "AsyncPagingDataDiffer.kt", m17802l = {TbsListener.ErrorCode.EXCEED_INCR_UPDATE, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 229}, m17803m = "emit")
        /* renamed from: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C42821.this.emit(null, this);
            }
        }

        public C42821(InterfaceC9267d interfaceC9267d, AsyncPagingDataDiffer asyncPagingDataDiffer) {
            this.this$0 = asyncPagingDataDiffer;
            this.$$this$flow = interfaceC9267d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            if (p169l8.AbstractC9268e.m16989A(r9, r5, r0) == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        
            if (r9.emit(r8, r0) != r1) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p169l8.InterfaceC9267d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42821.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42821.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1 r0 = new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L45
                if (r2 == r4) goto L39
                if (r2 != r3) goto L31
                kotlin.AbstractC9079b.m15926b(r9)
                goto La9
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                java.lang.Object r8 = r0.L$1
                l8.d r8 = (p169l8.InterfaceC9267d) r8
                java.lang.Object r2 = r0.L$0
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                kotlin.AbstractC9079b.m15926b(r9)
                goto L9a
            L45:
                java.lang.Object r8 = r0.L$2
                l8.d r8 = (p169l8.InterfaceC9267d) r8
                java.lang.Object r2 = r0.L$1
                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                java.lang.Object r5 = r0.L$0
                androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1 r5 = (androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42821) r5
                kotlin.AbstractC9079b.m15926b(r9)
                goto L80
            L55:
                kotlin.AbstractC9079b.m15926b(r9)
                l8.d r9 = r7.$$this$flow
                androidx.paging.CombinedLoadStates r8 = (androidx.paging.CombinedLoadStates) r8
                androidx.paging.AsyncPagingDataDiffer r2 = r7.this$0
                l8.h r2 = r2.getInGetItem$paging_runtime_release()
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L9c
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r5
                java.lang.Object r2 = p135i8.AbstractC8820a2.m14803a(r0)
                if (r2 != r1) goto L7d
                goto La8
            L7d:
                r5 = r7
                r2 = r8
                r8 = r9
            L80:
                androidx.paging.AsyncPagingDataDiffer r9 = r5.this$0
                l8.h r9 = r9.getInGetItem$paging_runtime_release()
                androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1 r5 = new androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1
                r5.<init>(r6)
                r0.L$0 = r2
                r0.L$1 = r8
                r0.L$2 = r6
                r0.label = r4
                java.lang.Object r9 = p169l8.AbstractC9268e.m16989A(r9, r5, r0)
                if (r9 != r1) goto L9a
                goto La8
            L9a:
                r9 = r8
                r8 = r2
            L9c:
                r0.L$0 = r6
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto La9
            La8:
                return r1
            La9:
                h7.p r8 = p123h7.C8736p.f16368a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1.C42821.emit(java.lang.Object, m7.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$special$$inlined$transform$1(InterfaceC9266c interfaceC9266c, InterfaceC9324c interfaceC9324c, AsyncPagingDataDiffer asyncPagingDataDiffer) {
        super(2, interfaceC9324c);
        this.$this_transform = interfaceC9266c;
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        AsyncPagingDataDiffer$special$$inlined$transform$1 asyncPagingDataDiffer$special$$inlined$transform$1 = new AsyncPagingDataDiffer$special$$inlined$transform$1(this.$this_transform, interfaceC9324c, this.this$0);
        asyncPagingDataDiffer$special$$inlined$transform$1.L$0 = obj;
        return asyncPagingDataDiffer$special$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
            InterfaceC9266c interfaceC9266c = this.$this_transform;
            C42821 c42821 = new C42821(interfaceC9267d, this.this$0);
            this.label = 1;
            if (interfaceC9266c.collect(c42821, this) == objM17291f) {
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
        return ((AsyncPagingDataDiffer$special$$inlined$transform$1) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
