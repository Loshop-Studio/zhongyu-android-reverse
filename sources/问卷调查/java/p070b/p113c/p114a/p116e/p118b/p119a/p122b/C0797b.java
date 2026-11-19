package p070b.p113c.p114a.p116e.p118b.p119a.p122b;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000a.p068t.p069a.AbstractC0445a;
import p000a.p068t.p069a.C0446b;

/* renamed from: b.c.a.e.b.a.b.b */
/* loaded from: classes.dex */
public class C0797b extends C0446b {

    /* renamed from: d0 */
    public C0796a f4494d0;

    /* renamed from: e0 */
    public boolean f4495e0;

    /* renamed from: f0 */
    public List<C0446b.i> f4496f0;

    /* renamed from: g0 */
    public C0446b.i f4497g0;

    /* renamed from: b.c.a.e.b.a.b.b$a */
    public class a implements C0446b.i {

        /* renamed from: b */
        public float f4498b = -1.0f;

        /* renamed from: c */
        public float f4499c = -1.0f;

        public a() {
        }

        @Override // p000a.p068t.p069a.C0446b.i
        /* renamed from: a */
        public void mo1551a(int i) {
            int iM2502k = C0797b.this.f4494d0.m2502k(i);
            float f2 = iM2502k;
            if (this.f4499c != f2) {
                this.f4499c = f2;
                if (C0797b.this.f4496f0 != null) {
                    for (int i2 = 0; i2 < C0797b.this.f4496f0.size(); i2++) {
                        C0446b.i iVar = C0797b.this.f4496f0.get(i2);
                        if (iVar != null) {
                            iVar.mo1551a(iM2502k);
                        }
                    }
                }
            }
        }

        @Override // p000a.p068t.p069a.C0446b.i
        /* renamed from: b */
        public void mo1552b(int i, float f2, int i2) throws Resources.NotFoundException {
            C0796a c0796a = C0797b.this.f4494d0;
            if (c0796a != null) {
                int iM2502k = c0796a.m2502k(i);
                if (f2 == 0.0f && this.f4498b == 0.0f && (i == 0 || i == C0797b.this.f4494d0.mo1525c() - 1)) {
                    C0797b.this.mo1549x(iM2502k, false);
                }
                i = iM2502k;
            }
            this.f4498b = f2;
            int iM2501j = C0797b.this.f4494d0 != null ? r0.m2501j() - 1 : -1;
            if (C0797b.this.f4496f0 != null) {
                for (int i3 = 0; i3 < C0797b.this.f4496f0.size(); i3++) {
                    C0446b.i iVar = C0797b.this.f4496f0.get(i3);
                    if (iVar != null) {
                        if (i != iM2501j) {
                            iVar.mo1552b(i, f2, i2);
                        } else if (f2 > 0.5d) {
                            iVar.mo1552b(0, 0.0f, 0);
                        } else {
                            iVar.mo1552b(i, 0.0f, 0);
                        }
                    }
                }
            }
        }

        @Override // p000a.p068t.p069a.C0446b.i
        /* renamed from: c */
        public void mo1553c(int i) throws Resources.NotFoundException {
            C0797b c0797b = C0797b.this;
            if (c0797b.f4494d0 != null) {
                int currentItem = C0797b.super.getCurrentItem();
                int iM2502k = C0797b.this.f4494d0.m2502k(currentItem);
                if (i == 0 && (currentItem == 0 || currentItem == C0797b.this.f4494d0.mo1525c() - 1)) {
                    C0797b.this.mo1549x(iM2502k, false);
                }
            }
            if (C0797b.this.f4496f0 != null) {
                for (int i2 = 0; i2 < C0797b.this.f4496f0.size(); i2++) {
                    C0446b.i iVar = C0797b.this.f4496f0.get(i2);
                    if (iVar != null) {
                        iVar.mo1553c(i);
                    }
                }
            }
        }
    }

    public C0797b(Context context) {
        super(context);
        this.f4495e0 = false;
        this.f4497g0 = new a();
        m2504A();
    }

    /* renamed from: A */
    public final void m2504A() {
        List<C0446b.i> list;
        C0446b.i iVar = this.f4497g0;
        if (iVar != null && (list = this.f2606S) != null) {
            list.remove(iVar);
        }
        super.mo1527b(this.f4497g0);
    }

    @Override // p000a.p068t.p069a.C0446b
    /* renamed from: b */
    public void mo1527b(C0446b.i iVar) {
        if (this.f4496f0 == null) {
            this.f4496f0 = new ArrayList();
        }
        this.f4496f0.add(iVar);
    }

    @Override // p000a.p068t.p069a.C0446b
    public AbstractC0445a getAdapter() {
        C0796a c0796a = this.f4494d0;
        return c0796a != null ? c0796a.f4490c : c0796a;
    }

    @Override // p000a.p068t.p069a.C0446b
    public int getCurrentItem() {
        C0796a c0796a = this.f4494d0;
        if (c0796a != null) {
            return c0796a.m2502k(super.getCurrentItem());
        }
        return 0;
    }

    public AbstractC0445a getPageAdapterWrapper() {
        return this.f4494d0;
    }

    @Override // p000a.p068t.p069a.C0446b
    public void setAdapter(AbstractC0445a abstractC0445a) throws Resources.NotFoundException {
        C0796a c0796a = new C0796a(abstractC0445a);
        this.f4494d0 = c0796a;
        c0796a.f4492e = this.f4495e0;
        super.setAdapter(c0796a);
        mo1549x(0, false);
    }

    public void setBoundaryCaching(boolean z) {
        this.f4495e0 = z;
        C0796a c0796a = this.f4494d0;
        if (c0796a != null) {
            c0796a.f4492e = z;
        }
    }

    @Override // p000a.p068t.p069a.C0446b
    public void setCurrentItem(int i) throws Resources.NotFoundException {
        if (getCurrentItem() != i) {
            Objects.requireNonNull(this.f4494d0);
            super.mo1549x(i + 1, true);
        }
    }

    @Override // p000a.p068t.p069a.C0446b
    public void setOnPageChangeListener(C0446b.i iVar) {
        mo1527b(iVar);
    }

    @Override // p000a.p068t.p069a.C0446b
    /* renamed from: x */
    public void mo1549x(int i, boolean z) throws Resources.NotFoundException {
        Objects.requireNonNull(this.f4494d0);
        super.mo1549x(i + 1, z);
    }
}
