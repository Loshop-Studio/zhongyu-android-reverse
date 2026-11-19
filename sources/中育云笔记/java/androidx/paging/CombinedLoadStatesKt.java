package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class CombinedLoadStatesKt {
    public static final Object awaitNotLoading(InterfaceC11594c interfaceC11594c, InterfaceC11588c<CombinedLoadStates> interfaceC11588c) {
        final InterfaceC11594c interfaceC11594cM25563m = AbstractC11596e.m25563m(interfaceC11594c, 1L);
        return AbstractC11596e.m25576z(new InterfaceC11594c() { // from class: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1

            /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2 */
            public static final class C42182<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2", m26211f = "CombinedLoadStates.kt", m26212l = {50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42182.this.emit(null, this);
                    }
                }

                public C42182(InterfaceC11595d interfaceC11595d) {
                    this.$this_unsafeFlow = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42182.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1 r0 = (androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42182.AnonymousClass1) r0
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
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.AbstractC9924b.m20071b(r7)
                        vd.d r7 = r5.$this_unsafeFlow
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
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.C42182.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c2) {
                Object objCollect = interfaceC11594cM25563m.collect(new C42182(interfaceC11595d), interfaceC11588c2);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, interfaceC11588c);
    }
}
