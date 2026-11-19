package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.C8786j0;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.CachedPageEventFlow$job$1", m17801f = "CachedPageEventFlow.kt", m17802l = {76}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC9266c $src;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1(InterfaceC9266c interfaceC9266c, CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC9324c<? super CachedPageEventFlow$job$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$src = interfaceC9266c;
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((CachedPageEventFlow$job$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interfaceC9266cM17010V = AbstractC9268e.m17010V(this.$src);
            C42871 c42871 = new C42871(this.this$0);
            this.label = 1;
            if (interfaceC9266cM17010V.collect(c42871, this) == objM17291f) {
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

    /* renamed from: androidx.paging.CachedPageEventFlow$job$1$1 */
    public static final class C42871<T> implements InterfaceC9267d {
        final /* synthetic */ CachedPageEventFlow<T> this$0;

        public C42871(CachedPageEventFlow<T> cachedPageEventFlow) {
            this.this$0 = cachedPageEventFlow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        
            if (r7.record(r6, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(p134i7.C8786j0 r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.CachedPageEventFlow$job$1$1$emit$1 r0 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9079b.m15926b(r7)
                goto L6b
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$1
                i7.j0 r6 = (p134i7.C8786j0) r6
                java.lang.Object r2 = r0.L$0
                androidx.paging.CachedPageEventFlow$job$1$1 r2 = (androidx.paging.CachedPageEventFlow$job$1.C42871) r2
                kotlin.AbstractC9079b.m15926b(r7)
                goto L57
            L40:
                kotlin.AbstractC9079b.m15926b(r7)
                androidx.paging.CachedPageEventFlow<T> r7 = r5.this$0
                l8.g r7 = androidx.paging.CachedPageEventFlow.access$getMutableSharedSrc$p(r7)
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = r7.emit(r6, r0)
                if (r7 != r1) goto L56
                goto L6a
            L56:
                r2 = r5
            L57:
                androidx.paging.CachedPageEventFlow<T> r7 = r2.this$0
                androidx.paging.FlattenedPageController r7 = androidx.paging.CachedPageEventFlow.access$getPageController$p(r7)
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r6 = r7.record(r6, r0)
                if (r6 != r1) goto L6b
            L6a:
                return r1
            L6b:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$job$1.C42871.emit(i7.j0, m7.c):java.lang.Object");
        }

        @Override // p169l8.InterfaceC9267d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
            return emit((C8786j0) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
        }
    }
}
