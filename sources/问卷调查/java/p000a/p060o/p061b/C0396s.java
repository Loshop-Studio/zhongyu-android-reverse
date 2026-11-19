package p000a.p060o.p061b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.s */
/* loaded from: classes.dex */
public final class C0396s extends AbstractC0397t {
    public C0396s(RecyclerView.AbstractC0538l abstractC0538l) {
        super(abstractC0538l, null);
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: b */
    public int mo1391b(View view) {
        return this.f2338a.m1911B(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0539m) view.getLayoutParams())).bottomMargin;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: c */
    public int mo1392c(View view) {
        RecyclerView.C0539m c0539m = (RecyclerView.C0539m) view.getLayoutParams();
        return this.f2338a.m1915E(view) + ((ViewGroup.MarginLayoutParams) c0539m).topMargin + ((ViewGroup.MarginLayoutParams) c0539m).bottomMargin;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: d */
    public int mo1393d(View view) {
        RecyclerView.C0539m c0539m = (RecyclerView.C0539m) view.getLayoutParams();
        return this.f2338a.m1917F(view) + ((ViewGroup.MarginLayoutParams) c0539m).leftMargin + ((ViewGroup.MarginLayoutParams) c0539m).rightMargin;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: e */
    public int mo1394e(View view) {
        return this.f2338a.m1921H(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0539m) view.getLayoutParams())).topMargin;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: f */
    public int mo1395f() {
        return this.f2338a.f3364q;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: g */
    public int mo1396g() {
        RecyclerView.AbstractC0538l abstractC0538l = this.f2338a;
        return abstractC0538l.f3364q - abstractC0538l.m1932N();
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: h */
    public int mo1397h() {
        return this.f2338a.m1932N();
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: i */
    public int mo1398i() {
        return this.f2338a.f3362o;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: j */
    public int mo1399j() {
        return this.f2338a.f3361n;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: k */
    public int mo1400k() {
        return this.f2338a.m1936Q();
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: l */
    public int mo1401l() {
        RecyclerView.AbstractC0538l abstractC0538l = this.f2338a;
        return (abstractC0538l.f3364q - abstractC0538l.m1936Q()) - this.f2338a.m1932N();
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: n */
    public int mo1402n(View view) {
        this.f2338a.m1943V(view, true, this.f2340c);
        return this.f2340c.bottom;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: o */
    public int mo1403o(View view) {
        this.f2338a.m1943V(view, true, this.f2340c);
        return this.f2340c.top;
    }

    @Override // p000a.p060o.p061b.AbstractC0397t
    /* renamed from: p */
    public void mo1404p(int i) {
        this.f2338a.mo1954e0(i);
    }
}
