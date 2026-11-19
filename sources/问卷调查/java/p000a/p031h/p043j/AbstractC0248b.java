package p000a.p031h.p043j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.h.j.b */
/* loaded from: classes.dex */
public abstract class AbstractC0248b {

    /* renamed from: a */
    public a f1582a;

    /* renamed from: a.h.j.b$a */
    public interface a {
    }

    public AbstractC0248b(Context context) {
    }

    /* renamed from: a */
    public boolean mo234a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo238b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo235c();

    /* renamed from: d */
    public View mo239d(MenuItem menuItem) {
        return mo235c();
    }

    /* renamed from: e */
    public boolean mo236e() {
        return false;
    }

    /* renamed from: f */
    public void mo237f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo240g() {
        return false;
    }

    /* renamed from: h */
    public void mo241h(a aVar) {
        if (this.f1582a != null) {
            StringBuilder sbM2079g = C0561a.m2079g("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sbM2079g.append(getClass().getSimpleName());
            sbM2079g.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sbM2079g.toString());
        }
        this.f1582a = aVar;
    }
}
