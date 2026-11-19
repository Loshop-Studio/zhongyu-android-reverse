package p070b.p074b.p075a.p076a.p091m;

import android.view.View;
import p070b.p074b.p075a.p076a.p091m.C0615g;

/* renamed from: b.b.a.a.m.k */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0619k implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0615g f3764b;

    public ViewOnClickListenerC0619k(C0615g c0615g) {
        this.f3764b = c0615g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0615g c0615g = this.f3764b;
        C0615g.e eVar = C0615g.e.DAY;
        C0615g.e eVar2 = c0615g.f3743a0;
        C0615g.e eVar3 = C0615g.e.YEAR;
        if (eVar2 == eVar3) {
            c0615g.m2194A0(eVar);
        } else if (eVar2 == eVar) {
            c0615g.m2194A0(eVar3);
        }
    }
}
