package p070b.p074b.p075a.p076a.p091m;

import android.view.View;

/* renamed from: b.b.a.a.m.p */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0624p implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0623o f3790b;

    public ViewOnClickListenerC0624p(C0623o c0623o) {
        this.f3790b = c0623o;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0623o c0623o = this.f3790b;
        c0623o.f3770A0.setEnabled(c0623o.f3776p0.m2187b());
        this.f3790b.f3785y0.toggle();
        C0623o c0623o2 = this.f3790b;
        c0623o2.m2202E0(c0623o2.f3785y0);
        this.f3790b.m2200C0();
    }
}
