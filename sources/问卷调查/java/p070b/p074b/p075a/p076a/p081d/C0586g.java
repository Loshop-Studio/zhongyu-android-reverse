package p070b.p074b.p075a.p076a.p081d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: b.b.a.a.d.g */
/* loaded from: classes.dex */
public class C0586g<V extends View> extends CoordinatorLayout.AbstractC0503c<V> {

    /* renamed from: a */
    public C0587h f3579a;

    /* renamed from: b */
    public int f3580b;

    public C0586g() {
        this.f3580b = 0;
    }

    public C0586g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3580b = 0;
    }

    /* renamed from: B */
    public int m2115B() {
        C0587h c0587h = this.f3579a;
        if (c0587h != null) {
            return c0587h.f3584d;
        }
        return 0;
    }

    /* renamed from: C */
    public void mo2113C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m1655r(v, i);
    }

    /* renamed from: D */
    public boolean m2116D(int i) {
        C0587h c0587h = this.f3579a;
        if (c0587h == null) {
            this.f3580b = i;
            return false;
        }
        if (c0587h.f3584d == i) {
            return false;
        }
        c0587h.f3584d = i;
        c0587h.m2117a();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: k */
    public boolean mo1674k(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo2113C(coordinatorLayout, v, i);
        if (this.f3579a == null) {
            this.f3579a = new C0587h(v);
        }
        C0587h c0587h = this.f3579a;
        c0587h.f3582b = c0587h.f3581a.getTop();
        c0587h.f3583c = c0587h.f3581a.getLeft();
        this.f3579a.m2117a();
        int i2 = this.f3580b;
        if (i2 == 0) {
            return true;
        }
        C0587h c0587h2 = this.f3579a;
        if (c0587h2.f3584d != i2) {
            c0587h2.f3584d = i2;
            c0587h2.m2117a();
        }
        this.f3580b = 0;
        return true;
    }
}
