package p070b.p074b.p075a.p076a.p091m;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p060o.p061b.C0392o;

/* renamed from: b.b.a.a.m.y */
/* loaded from: classes.dex */
public class C0633y extends LinearLayoutManager {

    /* renamed from: b.b.a.a.m.y$a */
    public class a extends C0392o {
        public a(C0633y c0633y, Context context) {
            super(context);
        }

        @Override // p000a.p060o.p061b.C0392o
        /* renamed from: f */
        public float mo1382f(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public C0633y(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: X0 */
    public void mo1778X0(RecyclerView recyclerView, RecyclerView.C0549w c0549w, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f3391a = i;
        m1946Y0(aVar);
    }
}
