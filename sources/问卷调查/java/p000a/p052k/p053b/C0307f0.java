package p000a.p052k.p053b;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import p000a.p057m.AbstractC0367p;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0368q;

/* renamed from: a.k.b.f0 */
/* loaded from: classes.dex */
public final class C0307f0 extends AbstractC0367p {

    /* renamed from: h */
    public static final InterfaceC0368q f1866h = new a();

    /* renamed from: e */
    public final boolean f1870e;

    /* renamed from: b */
    public final HashMap<String, ComponentCallbacksC0320m> f1867b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C0307f0> f1868c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, C0371t> f1869d = new HashMap<>();

    /* renamed from: f */
    public boolean f1871f = false;

    /* renamed from: g */
    public boolean f1872g = false;

    /* renamed from: a.k.b.f0$a */
    public class a implements InterfaceC0368q {
        /* renamed from: a */
        public <T extends AbstractC0367p> T m1075a(Class<T> cls) {
            return new C0307f0(true);
        }
    }

    public C0307f0(boolean z) {
        this.f1870e = z;
    }

    @Override // p000a.p057m.AbstractC0367p
    /* renamed from: a */
    public void mo1072a() {
        if (AbstractC0301c0.m1005N(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1871f = true;
    }

    /* renamed from: b */
    public void m1073b(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (this.f1872g) {
            if (AbstractC0301c0.m1005N(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f1867b.remove(componentCallbacksC0320m.f1982g) != null) && AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0320m);
        }
    }

    /* renamed from: c */
    public boolean m1074c(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (this.f1867b.containsKey(componentCallbacksC0320m.f1982g) && this.f1870e) {
            return this.f1871f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0307f0.class != obj.getClass()) {
            return false;
        }
        C0307f0 c0307f0 = (C0307f0) obj;
        return this.f1867b.equals(c0307f0.f1867b) && this.f1868c.equals(c0307f0.f1868c) && this.f1869d.equals(c0307f0.f1869d);
    }

    public int hashCode() {
        return this.f1869d.hashCode() + ((this.f1868c.hashCode() + (this.f1867b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<ComponentCallbacksC0320m> it = this.f1867b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1868c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1869d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
