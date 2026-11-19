package androidx.paging;

import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ConflatedEventBus<T> {
    private final InterfaceC11594c flow;
    private final InterfaceC11603l state;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConflatedEventBus() {
        AbstractC9972n abstractC9972n = null;
        this(abstractC9972n, 1, abstractC9972n);
    }

    public final InterfaceC11594c getFlow() {
        return this.flow;
    }

    public final void send(T data) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC11603l interfaceC11603l = this.state;
        interfaceC11603l.setValue(new Pair(Integer.valueOf(((Number) ((Pair) interfaceC11603l.getValue()).m20051f()).intValue() + 1), data));
    }

    public ConflatedEventBus(T t10) {
        final InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new Pair(Integer.MIN_VALUE, t10));
        this.state = interfaceC11603lM25602a;
        this.flow = new InterfaceC11594c() { // from class: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1

            /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2 */
            public static final class C42192<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", m26211f = "ConflatedEventBus.kt", m26212l = {52}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42192.this.emit(null, this);
                    }
                }

                public C42192(InterfaceC11595d interfaceC11595d) {
                    this.$this_unsafeFlow = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42192.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1 r0 = (androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42192.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1 r0 = new androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9924b.m20071b(r6)
                        vd.d r6 = r4.$this_unsafeFlow
                        kotlin.Pair r5 = (kotlin.Pair) r5
                        java.lang.Object r5 = r5.m20052g()
                        if (r5 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42192.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11603lM25602a.collect(new C42192(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }

    public /* synthetic */ ConflatedEventBus(Object obj, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
