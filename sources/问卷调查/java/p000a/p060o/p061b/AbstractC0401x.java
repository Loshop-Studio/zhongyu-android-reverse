package p000a.p060o.p061b;

import androidx.recyclerview.widget.RecyclerView;
import p000a.p060o.p061b.C0388k;

/* renamed from: a.o.b.x */
/* loaded from: classes.dex */
public abstract class AbstractC0401x extends RecyclerView.AbstractC0535i {

    /* renamed from: g */
    public boolean f2347g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0535i
    /* renamed from: a */
    public boolean mo1416a(RecyclerView.AbstractC0552z abstractC0552z, RecyclerView.AbstractC0552z abstractC0552z2, RecyclerView.AbstractC0535i.c cVar, RecyclerView.AbstractC0535i.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3345a;
        int i4 = cVar.f3346b;
        if (abstractC0552z2.m2018t()) {
            int i5 = cVar.f3345a;
            i2 = cVar.f3346b;
            i = i5;
        } else {
            i = cVar2.f3345a;
            i2 = cVar2.f3346b;
        }
        C0388k c0388k = (C0388k) this;
        if (abstractC0552z == abstractC0552z2) {
            return c0388k.mo1357i(abstractC0552z, i3, i4, i, i2);
        }
        float translationX = abstractC0552z.f3428a.getTranslationX();
        float translationY = abstractC0552z.f3428a.getTranslationY();
        float alpha = abstractC0552z.f3428a.getAlpha();
        c0388k.m1362n(abstractC0552z);
        abstractC0552z.f3428a.setTranslationX(translationX);
        abstractC0552z.f3428a.setTranslationY(translationY);
        abstractC0552z.f3428a.setAlpha(alpha);
        c0388k.m1362n(abstractC0552z2);
        abstractC0552z2.f3428a.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC0552z2.f3428a.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC0552z2.f3428a.setAlpha(0.0f);
        c0388k.f2248k.add(new C0388k.a(abstractC0552z, abstractC0552z2, i3, i4, i, i2));
        return true;
    }

    /* renamed from: i */
    public abstract boolean mo1357i(RecyclerView.AbstractC0552z abstractC0552z, int i, int i2, int i3, int i4);
}
