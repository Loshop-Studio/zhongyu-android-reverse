package p000a.p060o.p061b;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.y */
/* loaded from: classes.dex */
public abstract class AbstractC0402y extends RecyclerView.AbstractC0540n {

    /* renamed from: a */
    public RecyclerView f2348a;

    /* renamed from: b */
    public Scroller f2349b;

    /* renamed from: c */
    public final RecyclerView.AbstractC0542p f2350c = new a();

    /* renamed from: a.o.b.y$a */
    public class a extends RecyclerView.AbstractC0542p {

        /* renamed from: a */
        public boolean f2351a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
        /* renamed from: a */
        public void mo1418a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f2351a) {
                this.f2351a = false;
                AbstractC0402y.this.m1417c();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
        /* renamed from: b */
        public void mo1373b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2351a = true;
        }
    }

    /* renamed from: a */
    public abstract int[] mo1384a(RecyclerView.AbstractC0538l abstractC0538l, View view);

    /* renamed from: b */
    public abstract View mo1385b(RecyclerView.AbstractC0538l abstractC0538l);

    /* renamed from: c */
    public void m1417c() {
        RecyclerView.AbstractC0538l layoutManager;
        View viewMo1385b;
        RecyclerView recyclerView = this.f2348a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo1385b = mo1385b(layoutManager)) == null) {
            return;
        }
        int[] iArrMo1384a = mo1384a(layoutManager, viewMo1385b);
        if (iArrMo1384a[0] == 0 && iArrMo1384a[1] == 0) {
            return;
        }
        this.f2348a.m1866k0(iArrMo1384a[0], iArrMo1384a[1], null);
    }
}
