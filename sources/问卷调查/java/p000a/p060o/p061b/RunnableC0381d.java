package p000a.p060o.p061b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p000a.p060o.p061b.C0388k;

/* renamed from: a.o.b.d */
/* loaded from: classes.dex */
public class RunnableC0381d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2218b;

    /* renamed from: c */
    public final /* synthetic */ C0388k f2219c;

    public RunnableC0381d(C0388k c0388k, ArrayList arrayList) {
        this.f2219c = c0388k;
        this.f2218b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2218b.iterator();
        while (it.hasNext()) {
            C0388k.a aVar = (C0388k.a) it.next();
            C0388k c0388k = this.f2219c;
            Objects.requireNonNull(c0388k);
            RecyclerView.AbstractC0552z abstractC0552z = aVar.f2256a;
            View view = abstractC0552z == null ? null : abstractC0552z.f3428a;
            RecyclerView.AbstractC0552z abstractC0552z2 = aVar.f2257b;
            View view2 = abstractC0552z2 != null ? abstractC0552z2.f3428a : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c0388k.f3344f);
                c0388k.f2255r.add(aVar.f2256a);
                duration.translationX(aVar.f2260e - aVar.f2258c);
                duration.translationY(aVar.f2261f - aVar.f2259d);
                duration.alpha(0.0f).setListener(new C0386i(c0388k, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                c0388k.f2255r.add(aVar.f2257b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c0388k.f3344f).alpha(1.0f).setListener(new C0387j(c0388k, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
        this.f2218b.clear();
        this.f2219c.f2251n.remove(this.f2218b);
    }
}
