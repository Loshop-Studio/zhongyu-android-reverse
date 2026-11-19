package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
class C0242a implements InterfaceC0244c {
    C0242a() {
    }

    /* renamed from: p */
    private C0245d m1059p(InterfaceC0243b interfaceC0243b) {
        return (C0245d) interfaceC0243b.mo1058e();
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: a */
    public float mo1060a(InterfaceC0243b interfaceC0243b) {
        return m1059p(interfaceC0243b).m1079c();
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: b */
    public ColorStateList mo1061b(InterfaceC0243b interfaceC0243b) {
        return m1059p(interfaceC0243b).m1078b();
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: c */
    public void mo1062c(InterfaceC0243b interfaceC0243b, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        interfaceC0243b.mo1055b(new C0245d(colorStateList, f4));
        View viewMo1054a = interfaceC0243b.mo1054a();
        viewMo1054a.setClipToOutline(true);
        viewMo1054a.setElevation(f5);
        mo1074o(interfaceC0243b, f6);
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: d */
    public void mo1063d(InterfaceC0243b interfaceC0243b, float f4) {
        m1059p(interfaceC0243b).m1083h(f4);
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: e */
    public float mo1064e(InterfaceC0243b interfaceC0243b) {
        return interfaceC0243b.mo1054a().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: f */
    public void mo1065f(InterfaceC0243b interfaceC0243b) {
        if (!interfaceC0243b.mo1057d()) {
            interfaceC0243b.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fMo1060a = mo1060a(interfaceC0243b);
        float fMo1067h = mo1067h(interfaceC0243b);
        int iCeil = (int) Math.ceil(C0246e.m1084a(fMo1060a, fMo1067h, interfaceC0243b.mo1056c()));
        int iCeil2 = (int) Math.ceil(C0246e.m1085b(fMo1060a, fMo1067h, interfaceC0243b.mo1056c()));
        interfaceC0243b.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: g */
    public void mo1066g() {
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: h */
    public float mo1067h(InterfaceC0243b interfaceC0243b) {
        return m1059p(interfaceC0243b).m1080d();
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: i */
    public float mo1068i(InterfaceC0243b interfaceC0243b) {
        return mo1067h(interfaceC0243b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: j */
    public float mo1069j(InterfaceC0243b interfaceC0243b) {
        return mo1067h(interfaceC0243b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: k */
    public void mo1070k(InterfaceC0243b interfaceC0243b) {
        mo1074o(interfaceC0243b, mo1060a(interfaceC0243b));
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: l */
    public void mo1071l(InterfaceC0243b interfaceC0243b, float f4) {
        interfaceC0243b.mo1054a().setElevation(f4);
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: m */
    public void mo1072m(InterfaceC0243b interfaceC0243b) {
        mo1074o(interfaceC0243b, mo1060a(interfaceC0243b));
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: n */
    public void mo1073n(InterfaceC0243b interfaceC0243b, ColorStateList colorStateList) {
        m1059p(interfaceC0243b).m1081f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0244c
    /* renamed from: o */
    public void mo1074o(InterfaceC0243b interfaceC0243b, float f4) {
        m1059p(interfaceC0243b).m1082g(f4, interfaceC0243b.mo1057d(), interfaceC0243b.mo1056c());
        mo1065f(interfaceC0243b);
    }
}
