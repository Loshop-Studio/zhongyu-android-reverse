package p000a.p005b.p012g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p014h.C0073c;

/* renamed from: a.b.g.d */
/* loaded from: classes.dex */
public class C0043d extends AbstractC0040a implements C0054g.a {

    /* renamed from: d */
    public Context f292d;

    /* renamed from: e */
    public ActionBarContextView f293e;

    /* renamed from: f */
    public AbstractC0040a.a f294f;

    /* renamed from: g */
    public WeakReference<View> f295g;

    /* renamed from: h */
    public boolean f296h;

    /* renamed from: i */
    public C0054g f297i;

    public C0043d(Context context, ActionBarContextView actionBarContextView, AbstractC0040a.a aVar, boolean z) {
        this.f292d = context;
        this.f293e = actionBarContextView;
        this.f294f = aVar;
        C0054g c0054g = new C0054g(actionBarContextView.getContext());
        c0054g.f444l = 1;
        this.f297i = c0054g;
        c0054g.f437e = this;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.a
    /* renamed from: a */
    public void mo79a(C0054g c0054g) {
        mo121i();
        C0073c c0073c = this.f293e.f544e;
        if (c0073c != null) {
            c0073c.m290n();
        }
    }

    @Override // p000a.p005b.p012g.p013i.C0054g.a
    /* renamed from: b */
    public boolean mo80b(C0054g c0054g, MenuItem menuItem) {
        return this.f294f.mo86c(this, menuItem);
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: c */
    public void mo115c() {
        if (this.f296h) {
            return;
        }
        this.f296h = true;
        this.f293e.sendAccessibilityEvent(32);
        this.f294f.mo85b(this);
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: d */
    public View mo116d() {
        WeakReference<View> weakReference = this.f295g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: e */
    public Menu mo117e() {
        return this.f297i;
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: f */
    public MenuInflater mo118f() {
        return new C0045f(this.f293e.getContext());
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: g */
    public CharSequence mo119g() {
        return this.f293e.getSubtitle();
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: h */
    public CharSequence mo120h() {
        return this.f293e.getTitle();
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: i */
    public void mo121i() {
        this.f294f.mo84a(this, this.f297i);
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: j */
    public boolean mo122j() {
        return this.f293e.f2789t;
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: k */
    public void mo123k(View view) {
        this.f293e.setCustomView(view);
        this.f295g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: l */
    public void mo124l(int i) {
        this.f293e.setSubtitle(this.f292d.getString(i));
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: m */
    public void mo125m(CharSequence charSequence) {
        this.f293e.setSubtitle(charSequence);
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: n */
    public void mo126n(int i) {
        this.f293e.setTitle(this.f292d.getString(i));
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: o */
    public void mo127o(CharSequence charSequence) {
        this.f293e.setTitle(charSequence);
    }

    @Override // p000a.p005b.p012g.AbstractC0040a
    /* renamed from: p */
    public void mo128p(boolean z) {
        this.f286c = z;
        this.f293e.setTitleOptional(z);
    }
}
