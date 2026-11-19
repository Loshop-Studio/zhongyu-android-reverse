package p126e2;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;

/* renamed from: e2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9073b {

    /* renamed from: e2.b$a */
    public static final class a implements InterfaceC9540l {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f21244c;

        public a(InterfaceC9540l interfaceC9540l) {
            this.f21244c = interfaceC9540l;
        }

        /* renamed from: a */
        public final void m17877a(C9072a c9072a) {
            Object objM17873a;
            if (c9072a == null || (objM17873a = c9072a.m17873a()) == null) {
                return;
            }
            this.f21244c.invoke(objM17873a);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17877a((C9072a) obj);
            return C10786q.f26013a;
        }
    }

    /* renamed from: e2.b$b */
    public static final class b implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f21245c;

        public b(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f21245c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f21245c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21245c.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final void m17876a(LiveData liveData, LifecycleOwner owner, InterfaceC9540l onEventUnhandled) {
        AbstractC9979u.m20294g(liveData, "<this>");
        AbstractC9979u.m20294g(owner, "owner");
        AbstractC9979u.m20294g(onEventUnhandled, "onEventUnhandled");
        liveData.observe(owner, new b(new a(onEventUnhandled)));
    }
}
