package p070b.p074b.p075a.p076a.p091m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import p070b.p074b.p075a.p076a.p091m.C0615g;

/* renamed from: b.b.a.a.m.u */
/* loaded from: classes.dex */
public class C0629u implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f3806b;

    /* renamed from: c */
    public final /* synthetic */ C0630v f3807c;

    public C0629u(C0630v c0630v, MaterialCalendarGridView materialCalendarGridView) {
        this.f3807c = c0630v;
        this.f3806b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0628t adapter = this.f3806b.getAdapter();
        if (i >= adapter.m2212a() && i <= adapter.m2214c()) {
            C0615g.f fVar = this.f3807c.f3810e;
            long jLongValue = this.f3806b.getAdapter().getItem(i).longValue();
            C0615g.d dVar = (C0615g.d) fVar;
            if (C0615g.this.f3741Y.f3705e.mo2176k(jLongValue)) {
                C0615g.this.f3740X.m2188d(jLongValue);
                Iterator it = C0615g.this.f3814V.iterator();
                while (it.hasNext()) {
                    ((AbstractC0631w) it.next()).mo2203a(C0615g.this.f3740X.m2186a());
                }
                C0615g.this.f3746d0.getAdapter().f3337a.m1896b();
                RecyclerView recyclerView = C0615g.this.f3745c0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f3337a.m1896b();
                }
            }
        }
    }
}
