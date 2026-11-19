package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0496f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p093h.C2650a;
import p098i.C2660a;
import p098i.C2661b;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public class C0506n extends AbstractC0496f {

    /* renamed from: b */
    private C2660a<InterfaceC0503k, a> f3432b;

    /* renamed from: c */
    private AbstractC0496f.c f3433c;

    /* renamed from: d */
    private final WeakReference<InterfaceC0504l> f3434d;

    /* renamed from: e */
    private int f3435e;

    /* renamed from: f */
    private boolean f3436f;

    /* renamed from: g */
    private boolean f3437g;

    /* renamed from: h */
    private ArrayList<AbstractC0496f.c> f3438h;

    /* renamed from: i */
    private final boolean f3439i;

    /* renamed from: androidx.lifecycle.n$a */
    static class a {

        /* renamed from: a */
        AbstractC0496f.c f3440a;

        /* renamed from: b */
        InterfaceC0501i f3441b;

        a(InterfaceC0503k interfaceC0503k, AbstractC0496f.c cVar) {
            this.f3441b = C0508p.m2900f(interfaceC0503k);
            this.f3440a = cVar;
        }

        /* renamed from: a */
        void m2894a(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
            AbstractC0496f.c cVarM2873b = bVar.m2873b();
            this.f3440a = C0506n.m2886k(this.f3440a, cVarM2873b);
            this.f3441b.mo63d(interfaceC0504l, bVar);
            this.f3440a = cVarM2873b;
        }
    }

    public C0506n(InterfaceC0504l interfaceC0504l) {
        this(interfaceC0504l, true);
    }

    /* renamed from: d */
    private void m2881d(InterfaceC0504l interfaceC0504l) {
        Iterator<Map.Entry<InterfaceC0503k, a>> itDescendingIterator = this.f3432b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f3437g) {
            Map.Entry<InterfaceC0503k, a> next = itDescendingIterator.next();
            a value = next.getValue();
            while (value.f3440a.compareTo(this.f3433c) > 0 && !this.f3437g && this.f3432b.contains(next.getKey())) {
                AbstractC0496f.b bVarM2870a = AbstractC0496f.b.m2870a(value.f3440a);
                if (bVarM2870a == null) {
                    throw new IllegalStateException("no event down from " + value.f3440a);
                }
                m2889n(bVarM2870a.m2873b());
                value.m2894a(interfaceC0504l, bVarM2870a);
                m2888m();
            }
        }
    }

    /* renamed from: e */
    private AbstractC0496f.c m2882e(InterfaceC0503k interfaceC0503k) {
        Map.Entry<InterfaceC0503k, a> entryM8934h = this.f3432b.m8934h(interfaceC0503k);
        AbstractC0496f.c cVar = null;
        AbstractC0496f.c cVar2 = entryM8934h != null ? entryM8934h.getValue().f3440a : null;
        if (!this.f3438h.isEmpty()) {
            cVar = this.f3438h.get(r0.size() - 1);
        }
        return m2886k(m2886k(this.f3433c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m2883f(String str) {
        if (!this.f3439i || C2650a.m8861f().mo8863c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private void m2884g(InterfaceC0504l interfaceC0504l) {
        C2661b<InterfaceC0503k, a>.d dVarM8936c = this.f3432b.m8936c();
        while (dVarM8936c.hasNext() && !this.f3437g) {
            Map.Entry next = dVarM8936c.next();
            a aVar = (a) next.getValue();
            while (aVar.f3440a.compareTo(this.f3433c) < 0 && !this.f3437g && this.f3432b.contains(next.getKey())) {
                m2889n(aVar.f3440a);
                AbstractC0496f.b bVarM2871c = AbstractC0496f.b.m2871c(aVar.f3440a);
                if (bVarM2871c == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3440a);
                }
                aVar.m2894a(interfaceC0504l, bVarM2871c);
                m2888m();
            }
        }
    }

    /* renamed from: i */
    private boolean m2885i() {
        if (this.f3432b.size() == 0) {
            return true;
        }
        AbstractC0496f.c cVar = this.f3432b.m8935a().getValue().f3440a;
        AbstractC0496f.c cVar2 = this.f3432b.m8937d().getValue().f3440a;
        return cVar == cVar2 && this.f3433c == cVar2;
    }

    /* renamed from: k */
    static AbstractC0496f.c m2886k(AbstractC0496f.c cVar, AbstractC0496f.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m2887l(AbstractC0496f.c cVar) {
        if (this.f3433c == cVar) {
            return;
        }
        this.f3433c = cVar;
        if (this.f3436f || this.f3435e != 0) {
            this.f3437g = true;
            return;
        }
        this.f3436f = true;
        m2890p();
        this.f3436f = false;
    }

    /* renamed from: m */
    private void m2888m() {
        this.f3438h.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private void m2889n(AbstractC0496f.c cVar) {
        this.f3438h.add(cVar);
    }

    /* renamed from: p */
    private void m2890p() {
        InterfaceC0504l interfaceC0504l = this.f3434d.get();
        if (interfaceC0504l == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!m2885i()) {
            this.f3437g = false;
            if (this.f3433c.compareTo(this.f3432b.m8935a().getValue().f3440a) < 0) {
                m2881d(interfaceC0504l);
            }
            Map.Entry<InterfaceC0503k, a> entryM8937d = this.f3432b.m8937d();
            if (!this.f3437g && entryM8937d != null && this.f3433c.compareTo(entryM8937d.getValue().f3440a) > 0) {
                m2884g(interfaceC0504l);
            }
        }
        this.f3437g = false;
    }

    @Override // androidx.lifecycle.AbstractC0496f
    /* renamed from: a */
    public void mo2867a(InterfaceC0503k interfaceC0503k) {
        InterfaceC0504l interfaceC0504l;
        m2883f("addObserver");
        AbstractC0496f.c cVar = this.f3433c;
        AbstractC0496f.c cVar2 = AbstractC0496f.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0496f.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0503k, cVar2);
        if (this.f3432b.mo8932f(interfaceC0503k, aVar) == null && (interfaceC0504l = this.f3434d.get()) != null) {
            boolean z3 = this.f3435e != 0 || this.f3436f;
            AbstractC0496f.c cVarM2882e = m2882e(interfaceC0503k);
            this.f3435e++;
            while (aVar.f3440a.compareTo(cVarM2882e) < 0 && this.f3432b.contains(interfaceC0503k)) {
                m2889n(aVar.f3440a);
                AbstractC0496f.b bVarM2871c = AbstractC0496f.b.m2871c(aVar.f3440a);
                if (bVarM2871c == null) {
                    throw new IllegalStateException("no event up from " + aVar.f3440a);
                }
                aVar.m2894a(interfaceC0504l, bVarM2871c);
                m2888m();
                cVarM2882e = m2882e(interfaceC0503k);
            }
            if (!z3) {
                m2890p();
            }
            this.f3435e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0496f
    /* renamed from: b */
    public AbstractC0496f.c mo2868b() {
        return this.f3433c;
    }

    @Override // androidx.lifecycle.AbstractC0496f
    /* renamed from: c */
    public void mo2869c(InterfaceC0503k interfaceC0503k) {
        m2883f("removeObserver");
        this.f3432b.mo8933g(interfaceC0503k);
    }

    /* renamed from: h */
    public void m2891h(AbstractC0496f.b bVar) {
        m2883f("handleLifecycleEvent");
        m2887l(bVar.m2873b());
    }

    @Deprecated
    /* renamed from: j */
    public void m2892j(AbstractC0496f.c cVar) {
        m2883f("markState");
        m2893o(cVar);
    }

    /* renamed from: o */
    public void m2893o(AbstractC0496f.c cVar) {
        m2883f("setCurrentState");
        m2887l(cVar);
    }

    private C0506n(InterfaceC0504l interfaceC0504l, boolean z3) {
        this.f3432b = new C2660a<>();
        this.f3435e = 0;
        this.f3436f = false;
        this.f3437g = false;
        this.f3438h = new ArrayList<>();
        this.f3434d = new WeakReference<>(interfaceC0504l);
        this.f3433c = AbstractC0496f.c.INITIALIZED;
        this.f3439i = z3;
    }
}
