package p070b.p074b.p075a.p076a.p081d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;

/* renamed from: b.b.a.a.d.d */
/* loaded from: classes.dex */
public class C0583d implements InterfaceC0247d {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f3563a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3564b;

    public C0583d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f3563a = appBarLayout;
        this.f3564b = z;
    }

    @Override // p000a.p031h.p043j.p044a0.InterfaceC0247d
    /* renamed from: a */
    public boolean mo832a(View view, InterfaceC0247d.a aVar) {
        this.f3563a.setExpanded(this.f3564b);
        return true;
    }
}
