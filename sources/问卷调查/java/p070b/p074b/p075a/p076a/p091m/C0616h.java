package p070b.p074b.p075a.p076a.p091m;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Objects;
import p000a.p031h.p042i.C0240b;

/* renamed from: b.b.a.a.m.h */
/* loaded from: classes.dex */
public class C0616h extends RecyclerView.AbstractC0537k {

    /* renamed from: a */
    public final Calendar f3757a = C0607a0.m2181e();

    /* renamed from: b */
    public final Calendar f3758b = C0607a0.m2181e();

    /* renamed from: c */
    public final /* synthetic */ C0615g f3759c;

    public C0616h(C0615g c0615g) {
        this.f3759c = c0615g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0537k
    /* renamed from: d */
    public void mo1905d(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0549w c0549w) {
        if ((recyclerView.getAdapter() instanceof C0611c0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<C0240b<Long, Long>> it = this.f3759c.f3740X.m2192i().iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
        }
    }
}
