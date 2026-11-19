package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.widget.C0216h0;
import androidx.appcompat.widget.InterfaceC0230p;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0358u;
import java.util.ArrayList;
import p088g.WindowCallbackC2627i;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0109j extends ActionBar {

    /* renamed from: a */
    InterfaceC0230p f356a;

    /* renamed from: b */
    boolean f357b;

    /* renamed from: c */
    Window.Callback f358c;

    /* renamed from: d */
    private boolean f359d;

    /* renamed from: e */
    private boolean f360e;

    /* renamed from: f */
    private ArrayList<ActionBar.InterfaceC0068a> f361f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f362g = new a();

    /* renamed from: h */
    private final Toolbar.InterfaceC0199e f363h;

    /* renamed from: androidx.appcompat.app.j$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0109j.this.m293x();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    class b implements Toolbar.InterfaceC0199e {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0199e
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0109j.this.f358c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    private final class c implements InterfaceC0131m.a {

        /* renamed from: a */
        private boolean f366a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        /* renamed from: a */
        public boolean mo252a(C0125g c0125g) {
            Window.Callback callback = C0109j.this.f358c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, c0125g);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        public void onCloseMenu(C0125g c0125g, boolean z3) {
            if (this.f366a) {
                return;
            }
            this.f366a = true;
            C0109j.this.f356a.mo863h();
            Window.Callback callback = C0109j.this.f358c;
            if (callback != null) {
                callback.onPanelClosed(108, c0125g);
            }
            this.f366a = false;
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    private final class d implements C0125g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.C0125g.a
        public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0125g.a
        public void onMenuModeChange(C0125g c0125g) {
            C0109j c0109j = C0109j.this;
            if (c0109j.f358c != null) {
                if (c0109j.f356a.mo857b()) {
                    C0109j.this.f358c.onPanelClosed(108, c0125g);
                } else if (C0109j.this.f358c.onPreparePanel(0, null, c0125g)) {
                    C0109j.this.f358c.onMenuOpened(108, c0125g);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    private class e extends WindowCallbackC2627i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public View onCreatePanelView(int i4) {
            return i4 == 0 ? new View(C0109j.this.f356a.getContext()) : super.onCreatePanelView(i4);
        }

        @Override // p088g.WindowCallbackC2627i, android.view.Window.Callback
        public boolean onPreparePanel(int i4, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i4, view, menu);
            if (zOnPreparePanel) {
                C0109j c0109j = C0109j.this;
                if (!c0109j.f357b) {
                    c0109j.f356a.mo858c();
                    C0109j.this.f357b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    C0109j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f363h = bVar;
        this.f356a = new C0216h0(toolbar, false);
        e eVar = new e(callback);
        this.f358c = eVar;
        this.f356a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f356a.setWindowTitle(charSequence);
    }

    /* renamed from: v */
    private Menu m291v() {
        if (!this.f359d) {
            this.f356a.mo864i(new c(), new d());
            this.f359d = true;
        }
        return this.f356a.mo871p();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo107g() {
        return this.f356a.mo860e();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo108h() {
        if (!this.f356a.mo868m()) {
            return false;
        }
        this.f356a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo109i(boolean z3) {
        if (z3 == this.f360e) {
            return;
        }
        this.f360e = z3;
        int size = this.f361f.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f361f.get(i4).m122a(z3);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo110j() {
        return this.f356a.mo870o();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo111k() {
        return this.f356a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public boolean mo112l() {
        this.f356a.mo866k().removeCallbacks(this.f362g);
        C0358u.m2035i0(this.f356a.mo866k(), this.f362g);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo113m(Configuration configuration) {
        super.mo113m(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    void mo114n() {
        this.f356a.mo866k().removeCallbacks(this.f362g);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo115o(int i4, KeyEvent keyEvent) {
        Menu menuM291v = m291v();
        if (menuM291v == null) {
            return false;
        }
        menuM291v.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM291v.performShortcut(i4, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo116p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo117q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo117q() {
        return this.f356a.mo861f();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo118r(boolean z3) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo119s(boolean z3) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo120t(CharSequence charSequence) {
        this.f356a.setWindowTitle(charSequence);
    }

    /* renamed from: w */
    public Window.Callback m292w() {
        return this.f358c;
    }

    /* renamed from: x */
    void m293x() {
        Menu menuM291v = m291v();
        C0125g c0125g = menuM291v instanceof C0125g ? (C0125g) menuM291v : null;
        if (c0125g != null) {
            c0125g.stopDispatchingItemsChanged();
        }
        try {
            menuM291v.clear();
            if (!this.f358c.onCreatePanelMenu(0, menuM291v) || !this.f358c.onPreparePanel(0, null, menuM291v)) {
                menuM291v.clear();
            }
        } finally {
            if (c0125g != null) {
                c0125g.startDispatchingItemsChanged();
            }
        }
    }
}
