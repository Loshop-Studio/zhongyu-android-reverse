package p070b.p074b.p075a.p076a.p091m;

import android.view.View;

/* renamed from: b.b.a.a.m.l */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0620l implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0630v f3765b;

    /* renamed from: c */
    public final /* synthetic */ C0615g f3766c;

    public ViewOnClickListenerC0620l(C0615g c0615g, C0630v c0630v) {
        this.f3766c = c0615g;
        this.f3765b = c0630v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM1798l1 = this.f3766c.m2195x0().m1798l1() + 1;
        if (iM1798l1 < this.f3766c.f3746d0.getAdapter().mo1891a()) {
            this.f3766c.m2197z0(this.f3765b.m2215e(iM1798l1));
        }
    }
}
