package p000a.p060o.p061b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.t */
/* loaded from: classes.dex */
public abstract class AbstractC0397t {

    /* renamed from: a */
    public final RecyclerView.AbstractC0538l f2338a;

    /* renamed from: b */
    public int f2339b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f2340c = new Rect();

    public AbstractC0397t(RecyclerView.AbstractC0538l abstractC0538l, C0395r c0395r) {
        this.f2338a = abstractC0538l;
    }

    /* renamed from: a */
    public static AbstractC0397t m1405a(RecyclerView.AbstractC0538l abstractC0538l, int i) {
        if (i == 0) {
            return new C0395r(abstractC0538l);
        }
        if (i == 1) {
            return new C0396s(abstractC0538l);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1391b(View view);

    /* renamed from: c */
    public abstract int mo1392c(View view);

    /* renamed from: d */
    public abstract int mo1393d(View view);

    /* renamed from: e */
    public abstract int mo1394e(View view);

    /* renamed from: f */
    public abstract int mo1395f();

    /* renamed from: g */
    public abstract int mo1396g();

    /* renamed from: h */
    public abstract int mo1397h();

    /* renamed from: i */
    public abstract int mo1398i();

    /* renamed from: j */
    public abstract int mo1399j();

    /* renamed from: k */
    public abstract int mo1400k();

    /* renamed from: l */
    public abstract int mo1401l();

    /* renamed from: m */
    public int m1406m() {
        if (Integer.MIN_VALUE == this.f2339b) {
            return 0;
        }
        return mo1401l() - this.f2339b;
    }

    /* renamed from: n */
    public abstract int mo1402n(View view);

    /* renamed from: o */
    public abstract int mo1403o(View view);

    /* renamed from: p */
    public abstract void mo1404p(int i);
}
