package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ZipKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$a */
    public static final class C10033a implements InterfaceC9529a {

        /* renamed from: c */
        public static final C10033a f23832c = new C10033a();

        @Override // p181hd.InterfaceC9529a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20817b(InterfaceC11594c interfaceC11594c, InterfaceC11594c interfaceC11594c2, InterfaceC11594c interfaceC11594c3, InterfaceC11594c interfaceC11594c4, final InterfaceC9547s interfaceC9547s) {
        final InterfaceC11594c[] interfaceC11594cArr = {interfaceC11594c, interfaceC11594c2, interfaceC11594c3, interfaceC11594c4};
        return new InterfaceC11594c() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m26211f = "Zip.kt", m26212l = {259, 258}, m26213m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
            public static final class C100322 extends SuspendLambda implements InterfaceC9545q {

                /* renamed from: c */
                public int f23828c;

                /* renamed from: d */
                public /* synthetic */ Object f23829d;

                /* renamed from: e */
                public /* synthetic */ Object f23830e;

                /* renamed from: f */
                public final /* synthetic */ InterfaceC9547s f23831f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100322(InterfaceC11588c interfaceC11588c, InterfaceC9547s interfaceC9547s) {
                    super(3, interfaceC11588c);
                    this.f23831f = interfaceC9547s;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
                
                    if (r1.emit(r11, r10) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                    /*
                        r10 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r10.f23828c
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.AbstractC9924b.m20071b(r11)
                        r9 = r10
                        goto L5c
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.f23829d
                        vd.d r1 = (p379vd.InterfaceC11595d) r1
                        kotlin.AbstractC9924b.m20071b(r11)
                        r9 = r10
                        goto L50
                    L24:
                        kotlin.AbstractC9924b.m20071b(r11)
                        java.lang.Object r11 = r10.f23829d
                        r1 = r11
                        vd.d r1 = (p379vd.InterfaceC11595d) r1
                        java.lang.Object r11 = r10.f23830e
                        java.lang.Object[] r11 = (java.lang.Object[]) r11
                        hd.s r4 = r10.f23831f
                        r5 = 0
                        r5 = r11[r5]
                        r6 = r11[r3]
                        r7 = r11[r2]
                        r8 = 3
                        r8 = r11[r8]
                        r10.f23829d = r1
                        r10.f23828c = r3
                        r11 = 6
                        kotlin.jvm.internal.AbstractC9977s.m20287c(r11)
                        r9 = r10
                        java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                        r3 = 7
                        kotlin.jvm.internal.AbstractC9977s.m20287c(r3)
                        if (r11 != r0) goto L50
                        goto L5b
                    L50:
                        r3 = 0
                        r9.f23829d = r3
                        r9.f23828c = r2
                        java.lang.Object r11 = r1.emit(r11, r10)
                        if (r11 != r0) goto L5c
                    L5b:
                        return r0
                    L5c:
                        qc.q r11 = p309qc.C10786q.f26013a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.C100322.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9545q
                public final Object invoke(InterfaceC11595d interfaceC11595d, Object[] objArr, InterfaceC11588c interfaceC11588c) {
                    C100322 c100322 = new C100322(interfaceC11588c, this.f23831f);
                    c100322.f23829d = interfaceC11595d;
                    c100322.f23830e = objArr;
                    return c100322.invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objM20890a = CombineKt.m20890a(interfaceC11595d, interfaceC11594cArr, FlowKt__ZipKt.m20818c(), new C100322(null, interfaceC9547s), interfaceC11588c);
                return objM20890a == AbstractC11725a.m25952f() ? objM20890a : C10786q.f26013a;
            }
        };
    }

    /* renamed from: c */
    public static final InterfaceC9529a m20818c() {
        return C10033a.f23832c;
    }
}
