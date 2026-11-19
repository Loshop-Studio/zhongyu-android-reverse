package p000a.p021e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: a.e.b */
/* loaded from: classes.dex */
public class C0130b<E> extends AbstractC0135g<E, E> {

    /* renamed from: d */
    public final /* synthetic */ C0131c f903d;

    public C0130b(C0131c c0131c) {
        this.f903d = c0131c;
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: a */
    public void mo471a() {
        this.f903d.clear();
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: b */
    public Object mo472b(int i, int i2) {
        return this.f903d.f911c[i];
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: c */
    public Map<E, E> mo473c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: d */
    public int mo474d() {
        return this.f903d.f912d;
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: e */
    public int mo475e(Object obj) {
        return this.f903d.indexOf(obj);
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: f */
    public int mo476f(Object obj) {
        return this.f903d.indexOf(obj);
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: g */
    public void mo477g(E e2, E e3) {
        this.f903d.add(e2);
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: h */
    public void mo478h(int i) {
        this.f903d.m484e(i);
    }

    @Override // p000a.p021e.AbstractC0135g
    /* renamed from: i */
    public E mo479i(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }
}
