package p000a.p060o.p061b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p060o.p061b.C0378b;

/* renamed from: a.o.b.u */
/* loaded from: classes.dex */
public class C0398u implements C0378b.b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2341a;

    public C0398u(RecyclerView recyclerView) {
        this.f2341a = recyclerView;
    }

    /* renamed from: a */
    public View m1407a(int i) {
        return this.f2341a.getChildAt(i);
    }

    /* renamed from: b */
    public int m1408b() {
        return this.f2341a.getChildCount();
    }

    /* renamed from: c */
    public void m1409c(int i) {
        View childAt = this.f2341a.getChildAt(i);
        if (childAt != null) {
            this.f2341a.m1875p(childAt);
            childAt.clearAnimation();
        }
        this.f2341a.removeViewAt(i);
    }
}
