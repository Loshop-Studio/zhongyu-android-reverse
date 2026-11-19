package p070b.p074b.p075a.p076a.p091m;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: b.b.a.a.m.j */
/* loaded from: classes.dex */
public class C0618j extends RecyclerView.AbstractC0542p {

    /* renamed from: a */
    public final /* synthetic */ C0630v f3761a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f3762b;

    /* renamed from: c */
    public final /* synthetic */ C0615g f3763c;

    public C0618j(C0615g c0615g, C0630v c0630v, MaterialButton materialButton) {
        this.f3763c = c0615g;
        this.f3761a = c0630v;
        this.f3762b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
    /* renamed from: a */
    public void mo1418a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3762b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0542p
    /* renamed from: b */
    public void mo1373b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManagerM2195x0 = this.f3763c.m2195x0();
        int iM1798l1 = i < 0 ? linearLayoutManagerM2195x0.m1798l1() : linearLayoutManagerM2195x0.m1801n1();
        this.f3763c.f3742Z = this.f3761a.m2215e(iM1798l1);
        this.f3762b.setText(this.f3761a.f3808c.f3702b.m2210r(iM1798l1).f3795c);
    }
}
