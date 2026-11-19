package p070b.p074b.p075a.p076a.p091m;

import android.view.View;

/* renamed from: b.b.a.a.m.m */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0621m implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0630v f3767b;

    /* renamed from: c */
    public final /* synthetic */ C0615g f3768c;

    public ViewOnClickListenerC0621m(C0615g c0615g, C0630v c0630v) {
        this.f3768c = c0615g;
        this.f3767b = c0630v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iM1801n1 = this.f3768c.m2195x0().m1801n1() - 1;
        if (iM1801n1 >= 0) {
            this.f3768c.m2197z0(this.f3767b.m2215e(iM1801n1));
        }
    }
}
