package kotlinx.coroutines.flow;

import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.C11593b;
import p379vd.C11606o;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__BuildersKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    public static final class C10012a implements InterfaceC11594c {

        /* renamed from: c */
        public final /* synthetic */ Object f23617c;

        public C10012a(Object obj) {
            this.f23617c = obj;
        }

        @Override // p379vd.InterfaceC11594c
        public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
            Object objEmit = interfaceC11595d.emit(this.f23617c, interfaceC11588c);
            return objEmit == AbstractC11725a.m25952f() ? objEmit : C10786q.f26013a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC11594c m20759a(InterfaceC9544p interfaceC9544p) {
        return new CallbackFlowBuilder(interfaceC9544p, null, 0, null, 14, null);
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20760b(InterfaceC9544p interfaceC9544p) {
        return new C11593b(interfaceC9544p, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final InterfaceC11594c m20761c(InterfaceC9544p interfaceC9544p) {
        return new C11606o(interfaceC9544p);
    }

    /* renamed from: d */
    public static final InterfaceC11594c m20762d(Object obj) {
        return new C10012a(obj);
    }

    /* renamed from: e */
    public static final InterfaceC11594c m20763e(Object... objArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(objArr);
    }
}
