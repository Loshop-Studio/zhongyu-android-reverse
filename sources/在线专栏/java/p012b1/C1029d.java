package p012b1;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p017c1.AbstractC1056c;
import p017c1.C1054a;
import p017c1.C1055b;
import p017c1.C1057d;
import p017c1.C1058e;
import p017c1.C1059f;
import p017c1.C1060g;
import p017c1.C1061h;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;

/* renamed from: b1.d */
/* loaded from: classes.dex */
public class C1029d implements AbstractC1056c.a {

    /* renamed from: d */
    private static final String f5707d = AbstractC3445n.m10503f("WorkConstraintsTracker");

    /* renamed from: a */
    private final InterfaceC1028c f5708a;

    /* renamed from: b */
    private final AbstractC1056c<?>[] f5709b;

    /* renamed from: c */
    private final Object f5710c;

    public C1029d(Context context, InterfaceC2654a interfaceC2654a, InterfaceC1028c interfaceC1028c) {
        Context applicationContext = context.getApplicationContext();
        this.f5708a = interfaceC1028c;
        this.f5709b = new AbstractC1056c[]{new C1054a(applicationContext, interfaceC2654a), new C1055b(applicationContext, interfaceC2654a), new C1061h(applicationContext, interfaceC2654a), new C1057d(applicationContext, interfaceC2654a), new C1060g(applicationContext, interfaceC2654a), new C1059f(applicationContext, interfaceC2654a), new C1058e(applicationContext, interfaceC2654a)};
        this.f5710c = new Object();
    }

    @Override // p017c1.AbstractC1056c.a
    /* renamed from: a */
    public void mo4790a(List<String> list) {
        synchronized (this.f5710c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m4792c(str)) {
                    AbstractC3445n.m10501c().mo10504a(f5707d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            InterfaceC1028c interfaceC1028c = this.f5708a;
            if (interfaceC1028c != null) {
                interfaceC1028c.mo4214d(arrayList);
            }
        }
    }

    @Override // p017c1.AbstractC1056c.a
    /* renamed from: b */
    public void mo4791b(List<String> list) {
        synchronized (this.f5710c) {
            InterfaceC1028c interfaceC1028c = this.f5708a;
            if (interfaceC1028c != null) {
                interfaceC1028c.mo4213c(list);
            }
        }
    }

    /* renamed from: c */
    public boolean m4792c(String str) {
        synchronized (this.f5710c) {
            for (AbstractC1056c<?> abstractC1056c : this.f5709b) {
                if (abstractC1056c.m4937d(str)) {
                    AbstractC3445n.m10501c().mo10504a(f5707d, String.format("Work %s constrained by %s", str, abstractC1056c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m4793d(Iterable<C2520r> iterable) {
        synchronized (this.f5710c) {
            for (AbstractC1056c<?> abstractC1056c : this.f5709b) {
                abstractC1056c.m4940g(null);
            }
            for (AbstractC1056c<?> abstractC1056c2 : this.f5709b) {
                abstractC1056c2.m4938e(iterable);
            }
            for (AbstractC1056c<?> abstractC1056c3 : this.f5709b) {
                abstractC1056c3.m4940g(this);
            }
        }
    }

    /* renamed from: e */
    public void m4794e() {
        synchronized (this.f5710c) {
            for (AbstractC1056c<?> abstractC1056c : this.f5709b) {
                abstractC1056c.m4939f();
            }
        }
    }
}
