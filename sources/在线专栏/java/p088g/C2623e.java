package p088g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p088g.AbstractC2620b;

/* renamed from: g.e */
/* loaded from: classes.dex */
public class C2623e extends AbstractC2620b implements C0125g.a {

    /* renamed from: c */
    private Context f10332c;

    /* renamed from: d */
    private ActionBarContextView f10333d;

    /* renamed from: e */
    private AbstractC2620b.a f10334e;

    /* renamed from: f */
    private WeakReference<View> f10335f;

    /* renamed from: g */
    private boolean f10336g;

    /* renamed from: h */
    private boolean f10337h;

    /* renamed from: i */
    private C0125g f10338i;

    public C2623e(Context context, ActionBarContextView actionBarContextView, AbstractC2620b.a aVar, boolean z3) {
        this.f10332c = context;
        this.f10333d = actionBarContextView;
        this.f10334e = aVar;
        C0125g defaultShowAsAction = new C0125g(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f10338i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f10337h = z3;
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: a */
    public void mo327a() {
        if (this.f10336g) {
            return;
        }
        this.f10336g = true;
        this.f10333d.sendAccessibilityEvent(32);
        this.f10334e.mo256d(this);
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: b */
    public View mo328b() {
        WeakReference<View> weakReference = this.f10335f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: c */
    public Menu mo329c() {
        return this.f10338i;
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: d */
    public MenuInflater mo330d() {
        return new C2625g(this.f10333d.getContext());
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: e */
    public CharSequence mo331e() {
        return this.f10333d.getSubtitle();
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: g */
    public CharSequence mo332g() {
        return this.f10333d.getTitle();
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: i */
    public void mo333i() {
        this.f10334e.mo253a(this, this.f10338i);
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: j */
    public boolean mo334j() {
        return this.f10333d.m540j();
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: k */
    public void mo335k(View view) {
        this.f10333d.setCustomView(view);
        this.f10335f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: l */
    public void mo336l(int i4) {
        mo337m(this.f10332c.getString(i4));
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: m */
    public void mo337m(CharSequence charSequence) {
        this.f10333d.setSubtitle(charSequence);
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: o */
    public void mo338o(int i4) {
        mo339p(this.f10332c.getString(i4));
    }

    @Override // androidx.appcompat.view.menu.C0125g.a
    public boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
        return this.f10334e.mo255c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0125g.a
    public void onMenuModeChange(C0125g c0125g) {
        mo333i();
        this.f10333d.m542l();
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: p */
    public void mo339p(CharSequence charSequence) {
        this.f10333d.setTitle(charSequence);
    }

    @Override // p088g.AbstractC2620b
    /* renamed from: q */
    public void mo340q(boolean z3) {
        super.mo340q(z3);
        this.f10333d.setTitleOptional(z3);
    }
}
