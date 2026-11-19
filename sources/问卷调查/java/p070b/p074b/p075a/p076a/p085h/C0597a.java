package p070b.p074b.p075a.p076a.p085h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;
import p070b.p074b.p075a.p076a.p101w.InterfaceC0682n;

/* renamed from: b.b.a.a.h.a */
/* loaded from: classes.dex */
public class C0597a {

    /* renamed from: a */
    public final MaterialButton f3604a;

    /* renamed from: b */
    public C0678j f3605b;

    /* renamed from: c */
    public int f3606c;

    /* renamed from: d */
    public int f3607d;

    /* renamed from: e */
    public int f3608e;

    /* renamed from: f */
    public int f3609f;

    /* renamed from: g */
    public int f3610g;

    /* renamed from: h */
    public int f3611h;

    /* renamed from: i */
    public PorterDuff.Mode f3612i;

    /* renamed from: j */
    public ColorStateList f3613j;

    /* renamed from: k */
    public ColorStateList f3614k;

    /* renamed from: l */
    public ColorStateList f3615l;

    /* renamed from: m */
    public Drawable f3616m;

    /* renamed from: n */
    public boolean f3617n = false;

    /* renamed from: o */
    public boolean f3618o = false;

    /* renamed from: p */
    public boolean f3619p = false;

    /* renamed from: q */
    public boolean f3620q;

    /* renamed from: r */
    public LayerDrawable f3621r;

    public C0597a(MaterialButton materialButton, C0678j c0678j) {
        this.f3604a = materialButton;
        this.f3605b = c0678j;
    }

    /* renamed from: a */
    public InterfaceC0682n m2120a() {
        LayerDrawable layerDrawable = this.f3621r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC0682n) (this.f3621r.getNumberOfLayers() > 2 ? this.f3621r.getDrawable(2) : this.f3621r.getDrawable(1));
    }

    /* renamed from: b */
    public C0675g m2121b() {
        return m2122c(false);
    }

    /* renamed from: c */
    public final C0675g m2122c(boolean z) {
        LayerDrawable layerDrawable = this.f3621r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0675g) ((LayerDrawable) ((InsetDrawable) this.f3621r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: d */
    public final C0675g m2123d() {
        return m2122c(true);
    }

    /* renamed from: e */
    public void m2124e(C0678j c0678j) {
        this.f3605b = c0678j;
        if (m2121b() != null) {
            C0675g c0675gM2121b = m2121b();
            c0675gM2121b.f3998b.f4021a = c0678j;
            c0675gM2121b.invalidateSelf();
        }
        if (m2123d() != null) {
            C0675g c0675gM2123d = m2123d();
            c0675gM2123d.f3998b.f4021a = c0678j;
            c0675gM2123d.invalidateSelf();
        }
        if (m2120a() != null) {
            m2120a().setShapeAppearanceModel(c0678j);
        }
    }

    /* renamed from: f */
    public final void m2125f() {
        C0675g c0675gM2121b = m2121b();
        C0675g c0675gM2123d = m2123d();
        if (c0675gM2121b != null) {
            c0675gM2121b.m2299s(this.f3611h, this.f3614k);
            if (c0675gM2123d != null) {
                c0675gM2123d.m2298r(this.f3611h, this.f3617n ? C0562a.m2085f(this.f3604a, C1088R.attr.colorSurface) : 0);
            }
        }
    }
}
