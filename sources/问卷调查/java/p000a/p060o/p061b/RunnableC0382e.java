package p000a.p060o.p061b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: a.o.b.e */
/* loaded from: classes.dex */
public class RunnableC0382e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2220b;

    /* renamed from: c */
    public final /* synthetic */ C0388k f2221c;

    public RunnableC0382e(C0388k c0388k, ArrayList arrayList) {
        this.f2221c = c0388k;
        this.f2220b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f2220b.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC0552z abstractC0552z = (RecyclerView.AbstractC0552z) it.next();
            C0388k c0388k = this.f2221c;
            Objects.requireNonNull(c0388k);
            View view = abstractC0552z.f3428a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c0388k.f2252o.add(abstractC0552z);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c0388k.f3341c).setListener(new C0384g(c0388k, abstractC0552z, view, viewPropertyAnimatorAnimate)).start();
        }
        this.f2220b.clear();
        this.f2221c.f2249l.remove(this.f2220b);
    }
}
