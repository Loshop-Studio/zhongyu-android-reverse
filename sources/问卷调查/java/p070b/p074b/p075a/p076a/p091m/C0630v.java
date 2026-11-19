package p070b.p074b.p075a.p076a.p091m;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0243a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0270s;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.p091m.C0615g;

/* renamed from: b.b.a.a.m.v */
/* loaded from: classes.dex */
public class C0630v extends RecyclerView.AbstractC0530d<a> {

    /* renamed from: c */
    public final C0606a f3808c;

    /* renamed from: d */
    public final InterfaceC0612d<?> f3809d;

    /* renamed from: e */
    public final C0615g.f f3810e;

    /* renamed from: f */
    public final int f3811f;

    /* renamed from: b.b.a.a.m.v$a */
    public static class a extends RecyclerView.AbstractC0552z {

        /* renamed from: t */
        public final TextView f3812t;

        /* renamed from: u */
        public final MaterialCalendarGridView f3813u;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1088R.id.month_title);
            this.f3812t = textView;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            C0270s c0270s = new C0270s(C1088R.id.tag_accessibility_heading, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            if (Build.VERSION.SDK_INT >= 28) {
                c0270s.m883d(textView, bool);
            } else if (c0270s.m884e(c0270s.m879c(textView), bool)) {
                C0243a c0243aM865d = C0266o.m865d(textView);
                C0266o.m875n(textView, c0243aM865d == null ? new C0243a() : c0243aM865d);
                textView.setTag(c0270s.f1620a, bool);
                C0266o.m869h(textView, c0270s.f1623d);
            }
            this.f3813u = (MaterialCalendarGridView) linearLayout.findViewById(C1088R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C0630v(Context context, InterfaceC0612d<?> interfaceC0612d, C0606a c0606a, C0615g.f fVar) {
        C0627s c0627s = c0606a.f3702b;
        C0627s c0627s2 = c0606a.f3703c;
        C0627s c0627s3 = c0606a.f3704d;
        if (c0627s.compareTo(c0627s3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0627s3.compareTo(c0627s2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = C0628t.f3801f;
        int i2 = C0615g.f3738g0;
        this.f3811f = (i * context.getResources().getDimensionPixelSize(C1088R.dimen.mtrl_calendar_day_height)) + (C0623o.m2199B0(context) ? context.getResources().getDimensionPixelSize(C1088R.dimen.mtrl_calendar_day_height) : 0);
        this.f3808c = c0606a;
        this.f3809d = interfaceC0612d;
        this.f3810e = fVar;
        if (this.f3337a.m1895a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3338b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: a */
    public int mo1891a() {
        return this.f3808c.f3707g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: b */
    public long mo1892b(int i) {
        return this.f3808c.f3702b.m2210r(i).f3794b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: c */
    public void mo1893c(RecyclerView.AbstractC0552z abstractC0552z, int i) {
        a aVar = (a) abstractC0552z;
        C0627s c0627sM2210r = this.f3808c.f3702b.m2210r(i);
        aVar.f3812t.setText(c0627sM2210r.f3795c);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f3813u.findViewById(C1088R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !c0627sM2210r.equals(materialCalendarGridView.getAdapter().f3802b)) {
            C0628t c0628t = new C0628t(c0627sM2210r, this.f3809d, this.f3808c);
            materialCalendarGridView.setNumColumns(c0627sM2210r.f3798f);
            materialCalendarGridView.setAdapter((ListAdapter) c0628t);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C0629u(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: d */
    public RecyclerView.AbstractC0552z mo1894d(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1088R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0623o.m2199B0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0539m(-1, this.f3811f));
        return new a(linearLayout, true);
    }

    /* renamed from: e */
    public C0627s m2215e(int i) {
        return this.f3808c.f3702b.m2210r(i);
    }

    /* renamed from: f */
    public int m2216f(C0627s c0627s) {
        return this.f3808c.f3702b.m2211s(c0627s);
    }
}
