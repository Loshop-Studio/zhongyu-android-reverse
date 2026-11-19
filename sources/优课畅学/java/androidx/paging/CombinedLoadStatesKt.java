package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

/* loaded from: classes3.dex */
public final class CombinedLoadStatesKt {
    public static final Object awaitNotLoading(InterfaceC9266c interfaceC9266c, InterfaceC9324c<CombinedLoadStates> interfaceC9324c) {
        final InterfaceC9266c interfaceC9266cM17024n = AbstractC9268e.m17024n(interfaceC9266c, 1L);
        return AbstractC9268e.m17036z(new InterfaceC9266c() { // from class: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1

            /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2 */
            public static final class C42932<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2", m17801f = "CombinedLoadStates.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42932.this.emit(null, this);
                    }
                }

                public C42932(InterfaceC9267d interfaceC9267d) {
                    this.$this_unsafeFlow = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42932.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1 r0 = (androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42932.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1 r0 = new androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.AbstractC9079b.m15926b(r7)
                        l8.d r7 = r5.$this_unsafeFlow
                        r2 = r6
                        androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                        boolean r4 = r2.isIdle()
                        if (r4 != 0) goto L45
                        boolean r2 = r2.hasError()
                        if (r2 == 0) goto L4e
                    L45:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        h7.p r6 = p123h7.C8736p.f16368a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42932.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c2) {
                Object objCollect = interfaceC9266cM17024n.collect(new C42932(interfaceC9267d), interfaceC9324c2);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, interfaceC9324c);
    }
}
