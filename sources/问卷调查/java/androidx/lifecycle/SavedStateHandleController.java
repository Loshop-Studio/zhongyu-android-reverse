package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.AbstractC0367p;
import p000a.p057m.C0359h;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0372u;
import p000a.p062p.C0404a;
import p000a.p062p.InterfaceC0406c;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0356e {

    /* renamed from: a */
    public boolean f3207a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    public class C05181 implements InterfaceC0356e {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0355d f3208a;

        /* renamed from: b */
        public final /* synthetic */ C0404a f3209b;

        @Override // p000a.p057m.InterfaceC0356e
        /* renamed from: g */
        public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) throws NoSuchMethodException, SecurityException {
            if (aVar == AbstractC0355d.a.ON_START) {
                C0359h c0359h = (C0359h) this.f3208a;
                c0359h.m1281c("removeObserver");
                c0359h.f2170a.mo464e(this);
                this.f3209b.m1421c(C0519a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0519a implements C0404a.a {
        @Override // p000a.p062p.C0404a.a
        /* renamed from: a */
        public void mo1422a(InterfaceC0406c interfaceC0406c) throws NoSuchMethodException, SecurityException {
            Object obj;
            boolean z;
            if (!(interfaceC0406c instanceof InterfaceC0372u)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0371t c0371tMo1154e = ((InterfaceC0372u) interfaceC0406c).mo1154e();
            C0404a c0404aMo1153d = interfaceC0406c.mo1153d();
            Objects.requireNonNull(c0371tMo1154e);
            Iterator it = new HashSet(c0371tMo1154e.f2183a.keySet()).iterator();
            while (it.hasNext()) {
                AbstractC0367p abstractC0367p = c0371tMo1154e.f2183a.get((String) it.next());
                AbstractC0355d abstractC0355dMo1151a = interfaceC0406c.mo1151a();
                Map<String, Object> map = abstractC0367p.f2182a;
                if (map == null) {
                    obj = null;
                } else {
                    synchronized (map) {
                        obj = abstractC0367p.f2182a.get("androidx.lifecycle.savedstate.vm.tag");
                    }
                }
                SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                if (savedStateHandleController != null && !(z = savedStateHandleController.f3207a)) {
                    if (z) {
                        throw new IllegalStateException("Already attached to lifecycleOwner");
                    }
                    savedStateHandleController.f3207a = true;
                    abstractC0355dMo1151a.mo1275a(savedStateHandleController);
                    throw null;
                }
            }
            if (new HashSet(c0371tMo1154e.f2183a.keySet()).isEmpty()) {
                return;
            }
            c0404aMo1153d.m1421c(C0519a.class);
        }
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
        if (aVar == AbstractC0355d.a.ON_DESTROY) {
            this.f3207a = false;
            C0359h c0359h = (C0359h) interfaceC0358g.mo1151a();
            c0359h.m1281c("removeObserver");
            c0359h.f2170a.mo464e(this);
        }
    }
}
