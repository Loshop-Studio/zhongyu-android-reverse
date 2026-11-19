package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public class C0493d0 {

    /* renamed from: a */
    private final HashMap<String, AbstractC0489b0> f3416a = new HashMap<>();

    /* renamed from: a */
    public final void m2862a() {
        Iterator<AbstractC0489b0> it = this.f3416a.values().iterator();
        while (it.hasNext()) {
            it.next().m2839a();
        }
        this.f3416a.clear();
    }

    /* renamed from: b */
    final AbstractC0489b0 m2863b(String str) {
        return this.f3416a.get(str);
    }

    /* renamed from: c */
    Set<String> m2864c() {
        return new HashSet(this.f3416a.keySet());
    }

    /* renamed from: d */
    final void m2865d(String str, AbstractC0489b0 abstractC0489b0) {
        AbstractC0489b0 abstractC0489b0Put = this.f3416a.put(str, abstractC0489b0);
        if (abstractC0489b0Put != null) {
            abstractC0489b0Put.mo2639d();
        }
    }
}
