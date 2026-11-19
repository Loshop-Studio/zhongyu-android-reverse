package p000a.p052k.p053b;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.k.b.k0 */
/* loaded from: classes.dex */
public class C0317k0 {

    /* renamed from: a */
    public final ArrayList<ComponentCallbacksC0320m> f1909a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C0315j0> f1910b = new HashMap<>();

    /* renamed from: c */
    public C0307f0 f1911c;

    /* renamed from: a */
    public void m1101a(ComponentCallbacksC0320m componentCallbacksC0320m) {
        if (this.f1909a.contains(componentCallbacksC0320m)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0320m);
        }
        synchronized (this.f1909a) {
            this.f1909a.add(componentCallbacksC0320m);
        }
        componentCallbacksC0320m.f1988m = true;
    }

    /* renamed from: b */
    public void m1102b() {
        this.f1910b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m1103c(String str) {
        return this.f1910b.get(str) != null;
    }

    /* renamed from: d */
    public ComponentCallbacksC0320m m1104d(String str) {
        C0315j0 c0315j0 = this.f1910b.get(str);
        if (c0315j0 != null) {
            return c0315j0.f1904c;
        }
        return null;
    }

    /* renamed from: e */
    public ComponentCallbacksC0320m m1105e(String str) {
        for (C0315j0 c0315j0 : this.f1910b.values()) {
            if (c0315j0 != null) {
                ComponentCallbacksC0320m componentCallbacksC0320mM1105e = c0315j0.f1904c;
                if (!str.equals(componentCallbacksC0320mM1105e.f1982g)) {
                    componentCallbacksC0320mM1105e = componentCallbacksC0320mM1105e.f1997v.f1808c.m1105e(str);
                }
                if (componentCallbacksC0320mM1105e != null) {
                    return componentCallbacksC0320mM1105e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public List<C0315j0> m1106f() {
        ArrayList arrayList = new ArrayList();
        for (C0315j0 c0315j0 : this.f1910b.values()) {
            if (c0315j0 != null) {
                arrayList.add(c0315j0);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<ComponentCallbacksC0320m> m1107g() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0315j0> it = this.f1910b.values().iterator();
        while (it.hasNext()) {
            C0315j0 next = it.next();
            arrayList.add(next != null ? next.f1904c : null);
        }
        return arrayList;
    }

    /* renamed from: h */
    public C0315j0 m1108h(String str) {
        return this.f1910b.get(str);
    }

    /* renamed from: i */
    public List<ComponentCallbacksC0320m> m1109i() {
        ArrayList arrayList;
        if (this.f1909a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1909a) {
            arrayList = new ArrayList(this.f1909a);
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m1110j(C0315j0 c0315j0) {
        ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
        if (m1103c(componentCallbacksC0320m.f1982g)) {
            return;
        }
        this.f1910b.put(componentCallbacksC0320m.f1982g, c0315j0);
        if (AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0320m);
        }
    }

    /* renamed from: k */
    public void m1111k(C0315j0 c0315j0) {
        ComponentCallbacksC0320m componentCallbacksC0320m = c0315j0.f1904c;
        if (componentCallbacksC0320m.f1959C) {
            this.f1911c.m1073b(componentCallbacksC0320m);
        }
        if (this.f1910b.put(componentCallbacksC0320m.f1982g, null) != null && AbstractC0301c0.m1005N(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0320m);
        }
    }

    /* renamed from: l */
    public void m1112l(ComponentCallbacksC0320m componentCallbacksC0320m) {
        synchronized (this.f1909a) {
            this.f1909a.remove(componentCallbacksC0320m);
        }
        componentCallbacksC0320m.f1988m = false;
    }
}
