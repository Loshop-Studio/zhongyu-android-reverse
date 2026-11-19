package androidx.paging.compose;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", m17801f = "LazyPagingItems.kt", m17802l = {TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.COPY_FAIL}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyPagingItemsKt$collectAsLazyPagingItems$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC9100d $context;
    final /* synthetic */ LazyPagingItems<T> $lazyPagingItems;
    int label;

    @InterfaceC9539d(m17800c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", m17801f = "LazyPagingItems.kt", m17802l = {TbsListener.ErrorCode.COPY_SRCDIR_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1 */
    public static final class C44071 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ LazyPagingItems<T> $lazyPagingItems;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44071(LazyPagingItems<T> lazyPagingItems, InterfaceC9324c<? super C44071> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$lazyPagingItems = lazyPagingItems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C44071(this.$lazyPagingItems, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C44071) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                LazyPagingItems<T> lazyPagingItems = this.$lazyPagingItems;
                this.label = 1;
                if (lazyPagingItems.collectPagingData$paging_compose_release(this) == objM17291f) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItemsKt$collectAsLazyPagingItems$1$1(InterfaceC9100d interfaceC9100d, LazyPagingItems<T> lazyPagingItems, InterfaceC9324c<? super LazyPagingItemsKt$collectAsLazyPagingItems$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$context = interfaceC9100d;
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(this.$context, this.$lazyPagingItems, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((LazyPagingItemsKt$collectAsLazyPagingItems$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r6.collectPagingData$paging_compose_release(r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L46
        L1b:
            kotlin.AbstractC9079b.m15926b(r6)
            kotlin.coroutines.d r6 = r5.$context
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f17438a
            boolean r6 = kotlin.jvm.internal.AbstractC9133u.m16128b(r6, r1)
            if (r6 == 0) goto L33
            androidx.paging.compose.LazyPagingItems<T> r6 = r5.$lazyPagingItems
            r5.label = r3
            java.lang.Object r6 = r6.collectPagingData$paging_compose_release(r5)
            if (r6 != r0) goto L46
            goto L45
        L33:
            kotlin.coroutines.d r6 = r5.$context
            androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1 r1 = new androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1
            androidx.paging.compose.LazyPagingItems<T> r3 = r5.$lazyPagingItems
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            java.lang.Object r6 = p135i8.AbstractC8833f.m14848g(r6, r1, r5)
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
