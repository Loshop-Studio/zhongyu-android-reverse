package p000a.p060o.p061b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.b.z */
/* loaded from: classes.dex */
public class C0403z extends C0392o {

    /* renamed from: q */
    public final /* synthetic */ AbstractC0402y f2353q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0403z(AbstractC0402y abstractC0402y, Context context) {
        super(context);
        this.f2353q = abstractC0402y;
    }

    @Override // p000a.p060o.p061b.C0392o, androidx.recyclerview.widget.RecyclerView.AbstractC0548v
    /* renamed from: c */
    public void mo1380c(View view, RecyclerView.C0549w c0549w, RecyclerView.AbstractC0548v.a aVar) {
        AbstractC0402y abstractC0402y = this.f2353q;
        RecyclerView recyclerView = abstractC0402y.f2348a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrMo1384a = abstractC0402y.mo1384a(recyclerView.getLayoutManager(), view);
        int i = iArrMo1384a[0];
        int i2 = iArrMo1384a[1];
        int iCeil = (int) Math.ceil(m1383g(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (iCeil > 0) {
            aVar.m1993b(i, i2, iCeil, this.f2328j);
        }
    }

    @Override // p000a.p060o.p061b.C0392o
    /* renamed from: f */
    public float mo1382f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
