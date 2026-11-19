package p070b.p074b.p075a.p076a.p081d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;

/* renamed from: b.b.a.a.d.c */
/* loaded from: classes.dex */
public class C0582c implements InterfaceC0247d {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f3558a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f3559b;

    /* renamed from: c */
    public final /* synthetic */ View f3560c;

    /* renamed from: d */
    public final /* synthetic */ int f3561d;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3562e;

    public C0582c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f3562e = baseBehavior;
        this.f3558a = coordinatorLayout;
        this.f3559b = appBarLayout;
        this.f3560c = view;
        this.f3561d = i;
    }

    @Override // p000a.p031h.p043j.p044a0.InterfaceC0247d
    /* renamed from: a */
    public boolean mo832a(View view, InterfaceC0247d.a aVar) {
        this.f3562e.m2603L(this.f3558a, this.f3559b, this.f3560c, this.f3561d, new int[]{0, 0});
        return true;
    }
}
