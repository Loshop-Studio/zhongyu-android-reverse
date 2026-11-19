package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0337b {

    /* renamed from: a */
    private final Context f2686a;

    /* renamed from: b */
    private a f2687b;

    /* renamed from: c */
    private b f2688c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
        /* renamed from: a */
        void mo577a(boolean z3);
    }

    /* renamed from: androidx.core.view.b$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z3);
    }

    public AbstractC0337b(Context context) {
        this.f2686a = context;
    }

    /* renamed from: a */
    public boolean mo503a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo507b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo504c();

    /* renamed from: d */
    public View mo508d(MenuItem menuItem) {
        return mo504c();
    }

    /* renamed from: e */
    public boolean mo505e() {
        return false;
    }

    /* renamed from: f */
    public void mo506f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo509g() {
        return false;
    }

    /* renamed from: h */
    public void m1848h() {
        this.f2688c = null;
        this.f2687b = null;
    }

    /* renamed from: i */
    public void m1849i(a aVar) {
        this.f2687b = aVar;
    }

    /* renamed from: j */
    public void mo510j(b bVar) {
        if (this.f2688c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2688c = bVar;
    }

    /* renamed from: k */
    public void m1850k(boolean z3) {
        a aVar = this.f2687b;
        if (aVar != null) {
            aVar.mo577a(z3);
        }
    }
}
