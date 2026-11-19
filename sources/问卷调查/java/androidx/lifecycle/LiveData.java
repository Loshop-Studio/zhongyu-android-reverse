package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import java.util.Map;
import java.util.Objects;
import p000a.p015c.p016a.p017a.C0121a;
import p000a.p015c.p016a.p018b.C0125b;
import p000a.p052k.p053b.AbstractC0301c0;
import p000a.p052k.p053b.DialogInterfaceOnCancelListenerC0318l;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;
import p000a.p057m.InterfaceC0364m;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j */
    public static final Object f3189j = new Object();

    /* renamed from: a */
    public final Object f3190a = new Object();

    /* renamed from: b */
    public C0125b<InterfaceC0364m<? super T>, LiveData<T>.AbstractC0517b> f3191b = new C0125b<>();

    /* renamed from: c */
    public int f3192c = 0;

    /* renamed from: d */
    public boolean f3193d;

    /* renamed from: e */
    public volatile Object f3194e;

    /* renamed from: f */
    public volatile Object f3195f;

    /* renamed from: g */
    public int f3196g;

    /* renamed from: h */
    public boolean f3197h;

    /* renamed from: i */
    public boolean f3198i;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0517b implements InterfaceC0356e {

        /* renamed from: e */
        public final InterfaceC0358g f3199e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f3200f;

        @Override // p000a.p057m.InterfaceC0356e
        /* renamed from: g */
        public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
            AbstractC0355d.b bVar = ((C0359h) this.f3199e.mo1151a()).f2171b;
            if (bVar == AbstractC0355d.b.DESTROYED) {
                this.f3200f.mo1300f(this.f3201a);
                return;
            }
            AbstractC0355d.b bVar2 = null;
            while (bVar2 != bVar) {
                m1726h(mo1725j());
                bVar2 = bVar;
                bVar = ((C0359h) this.f3199e.mo1151a()).f2171b;
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0517b
        /* renamed from: i */
        public void mo1724i() {
            C0359h c0359h = (C0359h) this.f3199e.mo1151a();
            c0359h.m1281c("removeObserver");
            c0359h.f2170a.mo464e(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0517b
        /* renamed from: j */
        public boolean mo1725j() {
            return ((C0359h) this.f3199e.mo1151a()).f2171b.compareTo(AbstractC0355d.b.STARTED) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0516a extends LiveData<T>.AbstractC0517b {
        public C0516a(LiveData liveData, InterfaceC0364m<? super T> interfaceC0364m) {
            super(interfaceC0364m);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0517b
        /* renamed from: j */
        public boolean mo1725j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class AbstractC0517b {

        /* renamed from: a */
        public final InterfaceC0364m<? super T> f3201a;

        /* renamed from: b */
        public boolean f3202b;

        /* renamed from: c */
        public int f3203c = -1;

        public AbstractC0517b(InterfaceC0364m<? super T> interfaceC0364m) {
            this.f3201a = interfaceC0364m;
        }

        /* renamed from: h */
        public void m1726h(boolean z) {
            if (z == this.f3202b) {
                return;
            }
            this.f3202b = z;
            LiveData liveData = LiveData.this;
            int i = z ? 1 : -1;
            int i2 = liveData.f3192c;
            liveData.f3192c = i + i2;
            if (!liveData.f3193d) {
                liveData.f3193d = true;
                while (true) {
                    try {
                        int i3 = liveData.f3192c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.mo1298d();
                        } else if (z3) {
                            liveData.mo1299e();
                        }
                        i2 = i3;
                    } finally {
                        liveData.f3193d = false;
                    }
                }
            }
            if (this.f3202b) {
                LiveData.this.m1723c(this);
            }
        }

        /* renamed from: i */
        public void mo1724i() {
        }

        /* renamed from: j */
        public abstract boolean mo1725j();
    }

    public LiveData() {
        Object obj = f3189j;
        this.f3195f = obj;
        this.f3194e = obj;
        this.f3196g = -1;
    }

    /* renamed from: a */
    public static void m1721a(String str) {
        if (!C0121a.m460b().mo461a()) {
            throw new IllegalStateException(C0561a.m2077e("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1722b(LiveData<T>.AbstractC0517b abstractC0517b) {
        if (abstractC0517b.f3202b) {
            if (!abstractC0517b.mo1725j()) {
                abstractC0517b.m1726h(false);
                return;
            }
            int i = abstractC0517b.f3203c;
            int i2 = this.f3196g;
            if (i >= i2) {
                return;
            }
            abstractC0517b.f3203c = i2;
            InterfaceC0364m<? super T> interfaceC0364m = abstractC0517b.f3201a;
            Object obj = this.f3194e;
            DialogInterfaceOnCancelListenerC0318l.d dVar = (DialogInterfaceOnCancelListenerC0318l.d) interfaceC0364m;
            Objects.requireNonNull(dVar);
            if (((InterfaceC0358g) obj) != null) {
                DialogInterfaceOnCancelListenerC0318l dialogInterfaceOnCancelListenerC0318l = DialogInterfaceOnCancelListenerC0318l.this;
                if (dialogInterfaceOnCancelListenerC0318l.f1919c0) {
                    View viewM1167l0 = dialogInterfaceOnCancelListenerC0318l.m1167l0();
                    if (viewM1167l0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (DialogInterfaceOnCancelListenerC0318l.this.f1923g0 != null) {
                        if (AbstractC0301c0.m1005N(3)) {
                            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + DialogInterfaceOnCancelListenerC0318l.this.f1923g0);
                        }
                        DialogInterfaceOnCancelListenerC0318l.this.f1923g0.setContentView(viewM1167l0);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m1723c(LiveData<T>.AbstractC0517b abstractC0517b) {
        if (this.f3197h) {
            this.f3198i = true;
            return;
        }
        this.f3197h = true;
        do {
            this.f3198i = false;
            if (abstractC0517b != null) {
                m1722b(abstractC0517b);
                abstractC0517b = null;
            } else {
                C0125b<InterfaceC0364m<? super T>, LiveData<T>.AbstractC0517b>.d dVarM465b = this.f3191b.m465b();
                while (dVarM465b.hasNext()) {
                    m1722b((AbstractC0517b) ((Map.Entry) dVarM465b.next()).getValue());
                    if (this.f3198i) {
                        break;
                    }
                }
            }
        } while (this.f3198i);
        this.f3197h = false;
    }

    /* renamed from: d */
    public void mo1298d() {
    }

    /* renamed from: e */
    public void mo1299e() {
    }

    /* renamed from: f */
    public void mo1300f(InterfaceC0364m<? super T> interfaceC0364m) {
        m1721a("removeObserver");
        LiveData<T>.AbstractC0517b abstractC0517bMo464e = this.f3191b.mo464e(interfaceC0364m);
        if (abstractC0517bMo464e == null) {
            return;
        }
        abstractC0517bMo464e.mo1724i();
        abstractC0517bMo464e.m1726h(false);
    }
}
