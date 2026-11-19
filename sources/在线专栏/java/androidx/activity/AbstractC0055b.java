package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public abstract class AbstractC0055b {

    /* renamed from: a */
    private boolean f84a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0054a> f85b = new CopyOnWriteArrayList<>();

    public AbstractC0055b(boolean z3) {
        this.f84a = z3;
    }

    /* renamed from: a */
    void m70a(InterfaceC0054a interfaceC0054a) {
        this.f85b.add(interfaceC0054a);
    }

    /* renamed from: b */
    public abstract void mo71b();

    /* renamed from: c */
    public final boolean m72c() {
        return this.f84a;
    }

    /* renamed from: d */
    public final void m73d() {
        Iterator<InterfaceC0054a> it = this.f85b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    void m74e(InterfaceC0054a interfaceC0054a) {
        this.f85b.remove(interfaceC0054a);
    }

    /* renamed from: f */
    public final void m75f(boolean z3) {
        this.f84a = z3;
    }
}
