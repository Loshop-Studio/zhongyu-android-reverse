package p017c1;

import java.util.ArrayList;
import java.util.List;
import p012b1.InterfaceC1026a;
import p075d1.AbstractC2448d;
import p085f1.C2520r;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1056c<T> implements InterfaceC1026a<T> {

    /* renamed from: a */
    private final List<String> f6239a = new ArrayList();

    /* renamed from: b */
    private T f6240b;

    /* renamed from: c */
    private AbstractC2448d<T> f6241c;

    /* renamed from: d */
    private a f6242d;

    /* renamed from: c1.c$a */
    public interface a {
        /* renamed from: a */
        void mo4790a(List<String> list);

        /* renamed from: b */
        void mo4791b(List<String> list);
    }

    AbstractC1056c(AbstractC2448d<T> abstractC2448d) {
        this.f6241c = abstractC2448d;
    }

    /* renamed from: h */
    private void m4936h(a aVar, T t3) {
        if (this.f6239a.isEmpty() || aVar == null) {
            return;
        }
        if (t3 == null || mo4933c(t3)) {
            aVar.mo4791b(this.f6239a);
        } else {
            aVar.mo4790a(this.f6239a);
        }
    }

    @Override // p012b1.InterfaceC1026a
    /* renamed from: a */
    public void mo4785a(T t3) {
        this.f6240b = t3;
        m4936h(this.f6242d, t3);
    }

    /* renamed from: b */
    abstract boolean mo4932b(C2520r c2520r);

    /* renamed from: c */
    abstract boolean mo4933c(T t3);

    /* renamed from: d */
    public boolean m4937d(String str) {
        T t3 = this.f6240b;
        return t3 != null && mo4933c(t3) && this.f6239a.contains(str);
    }

    /* renamed from: e */
    public void m4938e(Iterable<C2520r> iterable) {
        this.f6239a.clear();
        for (C2520r c2520r : iterable) {
            if (mo4932b(c2520r)) {
                this.f6239a.add(c2520r.f10165a);
            }
        }
        if (this.f6239a.isEmpty()) {
            this.f6241c.m8183c(this);
        } else {
            this.f6241c.m8182a(this);
        }
        m4936h(this.f6242d, this.f6240b);
    }

    /* renamed from: f */
    public void m4939f() {
        if (this.f6239a.isEmpty()) {
            return;
        }
        this.f6239a.clear();
        this.f6241c.m8183c(this);
    }

    /* renamed from: g */
    public void m4940g(a aVar) {
        if (this.f6242d != aVar) {
            this.f6242d = aVar;
            m4936h(aVar, this.f6240b);
        }
    }
}
