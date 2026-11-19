package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

/* loaded from: classes3.dex */
public final class ConflatedEventBus<T> {
    private final InterfaceC9266c flow;
    private final InterfaceC9271h state;

    /* JADX WARN: Illegal instructions before constructor call */
    public ConflatedEventBus() {
        AbstractC9126n abstractC9126n = null;
        this(abstractC9126n, 1, abstractC9126n);
    }

    public final InterfaceC9266c getFlow() {
        return this.flow;
    }

    public final void send(T data) {
        AbstractC9133u.m16133g(data, "data");
        InterfaceC9271h interfaceC9271h = this.state;
        interfaceC9271h.setValue(new Pair(Integer.valueOf(((Number) ((Pair) interfaceC9271h.getValue()).m15906e()).intValue() + 1), data));
    }

    public ConflatedEventBus(T t10) {
        final InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(new Pair(Integer.MIN_VALUE, t10));
        this.state = interfaceC9271hM17054a;
        this.flow = new InterfaceC9266c() { // from class: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1

            /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2 */
            public static final class C42942<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", m17801f = "ConflatedEventBus.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR}, m17803m = "emit")
                /* renamed from: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42942.this.emit(null, this);
                    }
                }

                public C42942(InterfaceC9267d interfaceC9267d) {
                    this.$this_unsafeFlow = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42942.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2$1 r0 = (androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42942.AnonymousClass1) r0
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
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9079b.m15926b(r6)
                        l8.d r6 = r4.$this_unsafeFlow
                        kotlin.Pair r5 = (kotlin.Pair) r5
                        java.lang.Object r5 = r5.m15907g()
                        if (r5 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        h7.p r5 = p123h7.C8736p.f16368a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1.C42942.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9271hM17054a.collect(new C42942(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
    }

    public /* synthetic */ ConflatedEventBus(Object obj, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
