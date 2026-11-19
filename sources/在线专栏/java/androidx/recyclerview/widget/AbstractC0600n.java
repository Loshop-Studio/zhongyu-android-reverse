package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0600n extends RecyclerView.AbstractC0567l {

    /* renamed from: g */
    boolean f3884g = true;

    /* renamed from: A */
    public final void m3424A(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3432I(abstractC0557b0);
        m3072h(abstractC0557b0);
    }

    /* renamed from: B */
    public final void m3425B(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3433J(abstractC0557b0);
    }

    /* renamed from: C */
    public final void m3426C(RecyclerView.AbstractC0557b0 abstractC0557b0, boolean z3) {
        m3434K(abstractC0557b0, z3);
        m3072h(abstractC0557b0);
    }

    /* renamed from: D */
    public final void m3427D(RecyclerView.AbstractC0557b0 abstractC0557b0, boolean z3) {
        m3435L(abstractC0557b0, z3);
    }

    /* renamed from: E */
    public final void m3428E(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3436M(abstractC0557b0);
        m3072h(abstractC0557b0);
    }

    /* renamed from: F */
    public final void m3429F(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3437N(abstractC0557b0);
    }

    /* renamed from: G */
    public final void m3430G(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3438O(abstractC0557b0);
        m3072h(abstractC0557b0);
    }

    /* renamed from: H */
    public final void m3431H(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        m3439P(abstractC0557b0);
    }

    /* renamed from: I */
    public void m3432I(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    /* renamed from: J */
    public void m3433J(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    /* renamed from: K */
    public void m3434K(RecyclerView.AbstractC0557b0 abstractC0557b0, boolean z3) {
    }

    /* renamed from: L */
    public void m3435L(RecyclerView.AbstractC0557b0 abstractC0557b0, boolean z3) {
    }

    /* renamed from: M */
    public void m3436M(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    /* renamed from: N */
    public void m3437N(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    /* renamed from: O */
    public void m3438O(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    /* renamed from: P */
    public void m3439P(RecyclerView.AbstractC0557b0 abstractC0557b0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: a */
    public boolean mo3066a(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2) {
        int i4;
        int i5;
        return (cVar == null || ((i4 = cVar.f3639a) == (i5 = cVar2.f3639a) && cVar.f3640b == cVar2.f3640b)) ? mo3335w(abstractC0557b0) : mo3337y(abstractC0557b0, i4, cVar.f3640b, i5, cVar2.f3640b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: b */
    public boolean mo3067b(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0557b0 abstractC0557b02, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2) {
        int i4;
        int i5;
        int i6 = cVar.f3639a;
        int i7 = cVar.f3640b;
        if (abstractC0557b02.shouldIgnore()) {
            int i8 = cVar.f3639a;
            i5 = cVar.f3640b;
            i4 = i8;
        } else {
            i4 = cVar2.f3639a;
            i5 = cVar2.f3640b;
        }
        return mo3336x(abstractC0557b0, abstractC0557b02, i6, i7, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: c */
    public boolean mo3068c(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2) {
        int i4 = cVar.f3639a;
        int i5 = cVar.f3640b;
        View view = abstractC0557b0.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3639a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3640b;
        if (abstractC0557b0.isRemoved() || (i4 == left && i5 == top)) {
            return mo3338z(abstractC0557b0);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3337y(abstractC0557b0, i4, i5, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: d */
    public boolean mo3069d(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0567l.c cVar, RecyclerView.AbstractC0567l.c cVar2) {
        int i4 = cVar.f3639a;
        int i5 = cVar2.f3639a;
        if (i4 != i5 || cVar.f3640b != cVar2.f3640b) {
            return mo3337y(abstractC0557b0, i4, cVar.f3640b, i5, cVar2.f3640b);
        }
        m3428E(abstractC0557b0);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0567l
    /* renamed from: f */
    public boolean mo3070f(RecyclerView.AbstractC0557b0 abstractC0557b0) {
        return !this.f3884g || abstractC0557b0.isInvalid();
    }

    /* renamed from: w */
    public abstract boolean mo3335w(RecyclerView.AbstractC0557b0 abstractC0557b0);

    /* renamed from: x */
    public abstract boolean mo3336x(RecyclerView.AbstractC0557b0 abstractC0557b0, RecyclerView.AbstractC0557b0 abstractC0557b02, int i4, int i5, int i6, int i7);

    /* renamed from: y */
    public abstract boolean mo3337y(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4, int i5, int i6, int i7);

    /* renamed from: z */
    public abstract boolean mo3338z(RecyclerView.AbstractC0557b0 abstractC0557b0);
}
