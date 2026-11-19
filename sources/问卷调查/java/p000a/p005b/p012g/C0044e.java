package p000a.p005b.p012g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p012g.p013i.MenuC0062o;
import p000a.p005b.p012g.p013i.MenuItemC0057j;
import p000a.p021e.C0136h;
import p000a.p031h.p037e.p038a.InterfaceMenuC0214a;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;

/* renamed from: a.b.g.e */
/* loaded from: classes.dex */
public class C0044e extends ActionMode {

    /* renamed from: a */
    public final Context f298a;

    /* renamed from: b */
    public final AbstractC0040a f299b;

    /* renamed from: a.b.g.e$a */
    public static class a implements AbstractC0040a.a {

        /* renamed from: a */
        public final ActionMode.Callback f300a;

        /* renamed from: b */
        public final Context f301b;

        /* renamed from: c */
        public final ArrayList<C0044e> f302c = new ArrayList<>();

        /* renamed from: d */
        public final C0136h<Menu, Menu> f303d = new C0136h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f301b = context;
            this.f300a = callback;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: a */
        public boolean mo84a(AbstractC0040a abstractC0040a, Menu menu) {
            return this.f300a.onPrepareActionMode(m154e(abstractC0040a), m155f(menu));
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: b */
        public void mo85b(AbstractC0040a abstractC0040a) {
            this.f300a.onDestroyActionMode(m154e(abstractC0040a));
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: c */
        public boolean mo86c(AbstractC0040a abstractC0040a, MenuItem menuItem) {
            return this.f300a.onActionItemClicked(m154e(abstractC0040a), new MenuItemC0057j(this.f301b, (InterfaceMenuItemC0215b) menuItem));
        }

        @Override // p000a.p005b.p012g.AbstractC0040a.a
        /* renamed from: d */
        public boolean mo87d(AbstractC0040a abstractC0040a, Menu menu) {
            return this.f300a.onCreateActionMode(m154e(abstractC0040a), m155f(menu));
        }

        /* renamed from: e */
        public ActionMode m154e(AbstractC0040a abstractC0040a) {
            int size = this.f302c.size();
            for (int i = 0; i < size; i++) {
                C0044e c0044e = this.f302c.get(i);
                if (c0044e != null && c0044e.f299b == abstractC0040a) {
                    return c0044e;
                }
            }
            C0044e c0044e2 = new C0044e(this.f301b, abstractC0040a);
            this.f302c.add(c0044e2);
            return c0044e2;
        }

        /* renamed from: f */
        public final Menu m155f(Menu menu) {
            Menu orDefault = this.f303d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            MenuC0062o menuC0062o = new MenuC0062o(this.f301b, (InterfaceMenuC0214a) menu);
            this.f303d.put(menu, menuC0062o);
            return menuC0062o;
        }
    }

    public C0044e(Context context, AbstractC0040a abstractC0040a) {
        this.f298a = context;
        this.f299b = abstractC0040a;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f299b.mo115c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f299b.mo116d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0062o(this.f298a, (InterfaceMenuC0214a) this.f299b.mo117e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f299b.mo118f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f299b.mo119g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f299b.f285b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f299b.mo120h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f299b.f286c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f299b.mo121i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f299b.mo122j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f299b.mo123k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f299b.mo124l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f299b.mo125m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f299b.f285b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f299b.mo126n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f299b.mo127o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f299b.mo128p(z);
    }
}
