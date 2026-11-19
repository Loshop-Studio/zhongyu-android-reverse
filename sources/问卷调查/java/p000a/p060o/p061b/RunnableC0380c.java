package p000a.p060o.p061b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p000a.p060o.p061b.C0388k;

/* renamed from: a.o.b.c */
/* loaded from: classes.dex */
public class RunnableC0380c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2216b;

    /* renamed from: c */
    public final /* synthetic */ C0388k f2217c;

    public RunnableC0380c(C0388k c0388k, ArrayList arrayList) {
        this.f2217c = c0388k;
        this.f2216b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2216b.iterator();
        while (it.hasNext()) {
            C0388k.b bVar = (C0388k.b) it.next();
            C0388k c0388k = this.f2217c;
            RecyclerView.AbstractC0552z abstractC0552z = bVar.f2262a;
            int i = bVar.f2263b;
            int i2 = bVar.f2264c;
            int i3 = bVar.f2265d;
            int i4 = bVar.f2266e;
            Objects.requireNonNull(c0388k);
            View view = abstractC0552z.f3428a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c0388k.f2253p.add(abstractC0552z);
            viewPropertyAnimatorAnimate.setDuration(c0388k.f3343e).setListener(new C0385h(c0388k, abstractC0552z, i5, view, i6, viewPropertyAnimatorAnimate)).start();
        }
        this.f2216b.clear();
        this.f2217c.f2250m.remove(this.f2216b);
    }
}
