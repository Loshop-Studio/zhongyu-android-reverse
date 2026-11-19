package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__ZipKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$a */
    public static final class C9191a implements InterfaceC9266c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9266c f17913a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9266c f17914b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10575q f17915c;

        public C9191a(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC10575q interfaceC10575q) {
            this.f17913a = interfaceC9266c;
            this.f17914b = interfaceC9266c2;
            this.f17915c = interfaceC10575q;
        }

        @Override // p169l8.InterfaceC9266c
        public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
            Object objM16706a = CombineKt.m16706a(interfaceC9267d, new InterfaceC9266c[]{this.f17913a, this.f17914b}, FlowKt__ZipKt.m16634e(), new FlowKt__ZipKt$combine$1$1(this.f17915c, null), interfaceC9324c);
            return objM16706a == AbstractC9434a.m17291f() ? objM16706a : C8736p.f16368a;
        }
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16631b(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC9266c interfaceC9266c3, final InterfaceC10576r interfaceC10576r) {
        final InterfaceC9266c[] interfaceC9266cArr = {interfaceC9266c, interfaceC9266c2, interfaceC9266c3};
        return new InterfaceC9266c() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m17801f = "Zip.kt", m17802l = {TbsListener.ErrorCode.ERROR_GETSTRINGARRAY_JARFILE, 258}, m17803m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 */
            public static final class C91902 extends SuspendLambda implements InterfaceC10575q {

                /* renamed from: a */
                public int f17909a;

                /* renamed from: b */
                public /* synthetic */ Object f17910b;

                /* renamed from: c */
                public /* synthetic */ Object f17911c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC10576r f17912d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C91902(InterfaceC9324c interfaceC9324c, InterfaceC10576r interfaceC10576r) {
                    super(3, interfaceC9324c);
                    this.f17912d = interfaceC10576r;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                        int r1 = r7.f17909a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.AbstractC9079b.m15926b(r8)
                        goto L56
                    L12:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L1a:
                        java.lang.Object r1 = r7.f17910b
                        l8.d r1 = (p169l8.InterfaceC9267d) r1
                        kotlin.AbstractC9079b.m15926b(r8)
                        goto L4a
                    L22:
                        kotlin.AbstractC9079b.m15926b(r8)
                        java.lang.Object r8 = r7.f17910b
                        r1 = r8
                        l8.d r1 = (p169l8.InterfaceC9267d) r1
                        java.lang.Object r8 = r7.f17911c
                        java.lang.Object[] r8 = (java.lang.Object[]) r8
                        x7.r r4 = r7.f17912d
                        r5 = 0
                        r5 = r8[r5]
                        r6 = r8[r3]
                        r8 = r8[r2]
                        r7.f17910b = r1
                        r7.f17909a = r3
                        r3 = 6
                        kotlin.jvm.internal.AbstractC9131s.m16126c(r3)
                        java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                        r3 = 7
                        kotlin.jvm.internal.AbstractC9131s.m16126c(r3)
                        if (r8 != r0) goto L4a
                        goto L55
                    L4a:
                        r3 = 0
                        r7.f17910b = r3
                        r7.f17909a = r2
                        java.lang.Object r8 = r1.emit(r8, r7)
                        if (r8 != r0) goto L56
                    L55:
                        return r0
                    L56:
                        h7.p r8 = p123h7.C8736p.f16368a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.C91902.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p300x7.InterfaceC10575q
                public final Object invoke(InterfaceC9267d interfaceC9267d, Object[] objArr, InterfaceC9324c interfaceC9324c) {
                    C91902 c91902 = new C91902(interfaceC9324c, this.f17912d);
                    c91902.f17910b = interfaceC9267d;
                    c91902.f17911c = objArr;
                    return c91902.invokeSuspend(C8736p.f16368a);
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objM16706a = CombineKt.m16706a(interfaceC9267d, interfaceC9266cArr, FlowKt__ZipKt.m16634e(), new C91902(null, interfaceC10576r), interfaceC9324c);
                return objM16706a == AbstractC9434a.m17291f() ? objM16706a : C8736p.f16368a;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16632c(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC10575q interfaceC10575q) {
        return AbstractC9268e.m16991C(interfaceC9266c, interfaceC9266c2, interfaceC10575q);
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16633d(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC10575q interfaceC10575q) {
        return new C9191a(interfaceC9266c, interfaceC9266c2, interfaceC10575q);
    }

    /* renamed from: e */
    public static final InterfaceC10559a m16634e() {
        return new InterfaceC10559a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // p300x7.InterfaceC10559a
            public final Void invoke() {
                return null;
            }
        };
    }
}
