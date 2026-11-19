package p070b.p113c.p114a.p116e.p118b.p119a.p122b;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import p000a.p052k.p053b.AbstractC0311h0;
import p000a.p068t.p069a.AbstractC0445a;

/* renamed from: b.c.a.e.b.a.b.a */
/* loaded from: classes.dex */
public class C0796a extends AbstractC0445a {

    /* renamed from: c */
    public AbstractC0445a f4490c;

    /* renamed from: d */
    public SparseArray<a> f4491d = new SparseArray<>();

    /* renamed from: e */
    public boolean f4492e;

    /* renamed from: b.c.a.e.b.a.b.a$a */
    public static class a {

        /* renamed from: a */
        public Object f4493a;

        public a(ViewGroup viewGroup, int i, Object obj) {
            this.f4493a = obj;
        }
    }

    public C0796a(AbstractC0445a abstractC0445a) {
        this.f4490c = abstractC0445a;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: a */
    public void mo1524a(ViewGroup viewGroup, int i, Object obj) {
        int iM2501j = (m2501j() + 1) - 1;
        int iM2502k = !(this.f4490c instanceof AbstractC0311h0) ? m2502k(i) : i;
        if (this.f4492e && (i == 1 || i == iM2501j)) {
            this.f4491d.put(i, new a(viewGroup, iM2502k, obj));
        } else {
            this.f4490c.mo1524a(viewGroup, iM2502k, obj);
        }
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: b */
    public void mo1077b(ViewGroup viewGroup) {
        this.f4490c.mo1077b(viewGroup);
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: c */
    public int mo1525c() {
        return this.f4490c.mo1525c() + 2;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: d */
    public Object mo1078d(ViewGroup viewGroup, int i) {
        a aVar;
        int iM2502k = !(this.f4490c instanceof AbstractC0311h0) ? m2502k(i) : i;
        if (!this.f4492e || (aVar = this.f4491d.get(i)) == null) {
            return this.f4490c.mo1078d(viewGroup, iM2502k);
        }
        this.f4491d.remove(i);
        return aVar.f4493a;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: e */
    public boolean mo1079e(View view, Object obj) {
        return this.f4490c.mo1079e(view, obj);
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: f */
    public void mo1080f(Parcelable parcelable, ClassLoader classLoader) {
        this.f4490c.mo1080f(parcelable, classLoader);
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: g */
    public Parcelable mo1081g() {
        return this.f4490c.mo1081g();
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: h */
    public void mo1082h(ViewGroup viewGroup, int i, Object obj) {
        this.f4490c.mo1082h(viewGroup, i, obj);
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: i */
    public void mo1083i(ViewGroup viewGroup) {
        this.f4490c.mo1083i(viewGroup);
    }

    /* renamed from: j */
    public int m2501j() {
        return this.f4490c.mo1525c();
    }

    /* renamed from: k */
    public int m2502k(int i) {
        int iM2501j = m2501j();
        if (iM2501j == 0) {
            return 0;
        }
        int i2 = (i - 1) % iM2501j;
        return i2 < 0 ? i2 + iM2501j : i2;
    }
}
