package p088g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC0133o;
import androidx.appcompat.view.menu.MenuItemC0128j;
import androidx.collection.C0253g;
import java.util.ArrayList;
import p088g.AbstractC2620b;
import p160v.InterfaceMenuC3414a;
import p160v.InterfaceMenuItemC3415b;

/* renamed from: g.f */
/* loaded from: classes.dex */
public class C2624f extends ActionMode {

    /* renamed from: a */
    final Context f10339a;

    /* renamed from: b */
    final AbstractC2620b f10340b;

    /* renamed from: g.f$a */
    public static class a implements AbstractC2620b.a {

        /* renamed from: a */
        final ActionMode.Callback f10341a;

        /* renamed from: b */
        final Context f10342b;

        /* renamed from: c */
        final ArrayList<C2624f> f10343c = new ArrayList<>();

        /* renamed from: d */
        final C0253g<Menu, Menu> f10344d = new C0253g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f10342b = context;
            this.f10341a = callback;
        }

        /* renamed from: f */
        private Menu m8787f(Menu menu) {
            Menu menu2 = this.f10344d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0133o menuC0133o = new MenuC0133o(this.f10342b, (InterfaceMenuC3414a) menu);
            this.f10344d.put(menu, menuC0133o);
            return menuC0133o;
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: a */
        public boolean mo253a(AbstractC2620b abstractC2620b, Menu menu) {
            return this.f10341a.onPrepareActionMode(m8788e(abstractC2620b), m8787f(menu));
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: b */
        public boolean mo254b(AbstractC2620b abstractC2620b, Menu menu) {
            return this.f10341a.onCreateActionMode(m8788e(abstractC2620b), m8787f(menu));
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: c */
        public boolean mo255c(AbstractC2620b abstractC2620b, MenuItem menuItem) {
            return this.f10341a.onActionItemClicked(m8788e(abstractC2620b), new MenuItemC0128j(this.f10342b, (InterfaceMenuItemC3415b) menuItem));
        }

        @Override // p088g.AbstractC2620b.a
        /* renamed from: d */
        public void mo256d(AbstractC2620b abstractC2620b) {
            this.f10341a.onDestroyActionMode(m8788e(abstractC2620b));
        }

        /* renamed from: e */
        public ActionMode m8788e(AbstractC2620b abstractC2620b) {
            int size = this.f10343c.size();
            for (int i4 = 0; i4 < size; i4++) {
                C2624f c2624f = this.f10343c.get(i4);
                if (c2624f != null && c2624f.f10340b == abstractC2620b) {
                    return c2624f;
                }
            }
            C2624f c2624f2 = new C2624f(this.f10342b, abstractC2620b);
            this.f10343c.add(c2624f2);
            return c2624f2;
        }
    }

    public C2624f(Context context, AbstractC2620b abstractC2620b) {
        this.f10339a = context;
        this.f10340b = abstractC2620b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f10340b.mo327a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f10340b.mo328b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0133o(this.f10339a, (InterfaceMenuC3414a) this.f10340b.mo329c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f10340b.mo330d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f10340b.mo331e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f10340b.m8779f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f10340b.mo332g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f10340b.m8780h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f10340b.mo333i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f10340b.mo334j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f10340b.mo335k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f10340b.mo337m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f10340b.m8781n(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f10340b.mo339p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z3) {
        this.f10340b.mo340q(z3);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i4) {
        this.f10340b.mo336l(i4);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i4) {
        this.f10340b.mo338o(i4);
    }
}
