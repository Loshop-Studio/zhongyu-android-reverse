package kotlinx.coroutines.flow.internal;

import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.C11732g;
import p409xc.AbstractC11831f;
import p426yd.AbstractC11945b;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class FlowCoroutineKt {

    /* renamed from: kotlinx.coroutines.flow.internal.FlowCoroutineKt$a */
    public static final class C10044a implements InterfaceC11594c {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9545q f23958c;

        public C10044a(InterfaceC9545q interfaceC9545q) {
            this.f23958c = interfaceC9545q;
        }

        @Override // p379vd.InterfaceC11594c
        public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
            Object objM20891a = FlowCoroutineKt.m20891a(new FlowCoroutineKt$scopedFlow$1$1(this.f23958c, interfaceC11595d, null), interfaceC11588c);
            return objM20891a == AbstractC11725a.m25952f() ? objM20891a : C10786q.f26013a;
        }
    }

    /* renamed from: a */
    public static final Object m20891a(InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        C11732g c11732g = new C11732g(interfaceC11588c.getContext(), interfaceC11588c);
        Object objM26507d = AbstractC11945b.m26507d(c11732g, c11732g, interfaceC9544p);
        if (objM26507d == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM26507d;
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20892b(InterfaceC9545q interfaceC9545q) {
        return new C10044a(interfaceC9545q);
    }
}
