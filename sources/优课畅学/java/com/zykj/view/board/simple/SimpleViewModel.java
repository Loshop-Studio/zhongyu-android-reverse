package com.zykj.view.board.simple;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.view.board.board.AbstractC8221q;
import com.zykj.view.board.board.AbstractC8222r;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;

/* loaded from: classes5.dex */
public final class SimpleViewModel extends ViewModel {

    /* renamed from: a */
    public final InterfaceC9271h f15241a;

    /* renamed from: b */
    public final InterfaceC9280q f15242b;

    /* renamed from: c */
    public final InterfaceC9270g f15243c;

    /* renamed from: d */
    public final InterfaceC9275l f15244d;

    public SimpleViewModel() {
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(new C8254e(false, null, null, null, null, null, null, null, 255, null));
        this.f15241a = interfaceC9271hM17054a;
        this.f15242b = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        InterfaceC9270g interfaceC9270gM17044b = AbstractC9276m.m17044b(0, 0, null, 7, null);
        this.f15243c = interfaceC9270gM17044b;
        this.f15244d = AbstractC9268e.m17011a(interfaceC9270gM17044b);
    }

    /* renamed from: i */
    private final void m13219i() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutEraser$1(this, null), 3, null);
    }

    /* renamed from: j */
    private final void m13220j() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutPen$1(this, null), 3, null);
    }

    /* renamed from: r */
    public static /* synthetic */ void m13221r(SimpleViewModel simpleViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8254e) simpleViewModel.f15241a.getValue()).m13257j();
        }
        simpleViewModel.m13234q(z10);
    }

    /* renamed from: c */
    public final void m13222c() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$cleanPage$1(this, null), 3, null);
    }

    /* renamed from: d */
    public final InterfaceC9275l m13223d() {
        return this.f15244d;
    }

    /* renamed from: e */
    public final InterfaceC9280q m13224e() {
        return this.f15242b;
    }

    /* renamed from: f */
    public final void m13225f() {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: g */
    public final void m13226g() {
        Object value;
        C8254e c8254e;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f15241a;
        do {
            value = interfaceC9271h.getValue();
            c8254e = (C8254e) value;
            AbstractC8222r abstractC8222rM13253f = c8254e.m13253f();
            abstractC8222r = AbstractC8222r.b.f15084e;
            if (AbstractC9133u.m16128b(abstractC8222rM13253f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b(c8254e, false, null, abstractC8222r, null, null, null, null, null, 251, null)));
    }

    /* renamed from: h */
    public final void m13227h() {
        Object value;
        C8254e c8254e;
        AbstractC8222r abstractC8222r;
        InterfaceC9271h interfaceC9271h = this.f15241a;
        do {
            value = interfaceC9271h.getValue();
            c8254e = (C8254e) value;
            AbstractC8222r abstractC8222rM13253f = c8254e.m13253f();
            abstractC8222r = AbstractC8222r.e.f15087e;
            if (AbstractC9133u.m16128b(abstractC8222rM13253f, abstractC8222r)) {
                abstractC8222r = AbstractC8222r.d.f15086e;
            }
        } while (!interfaceC9271h.mo16686e(value, C8254e.m13248b(c8254e, false, null, abstractC8222r, null, null, null, null, null, 251, null)));
    }

    /* renamed from: k */
    public final void m13228k(int i10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateEraserSizeLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: l */
    public final void m13229l(boolean z10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateExpandState$1(this, z10, null), 3, null);
    }

    /* renamed from: m */
    public final void m13230m(AbstractC8221q mainToolType) {
        AbstractC8221q abstractC8221q;
        AbstractC9133u.m16133g(mainToolType, "mainToolType");
        InterfaceC9271h interfaceC9271h = this.f15241a;
        while (true) {
            Object value = interfaceC9271h.getValue();
            abstractC8221q = mainToolType;
            if (interfaceC9271h.mo16686e(value, C8254e.m13248b((C8254e) value, false, abstractC8221q, null, null, null, null, null, null, 253, null))) {
                break;
            } else {
                mainToolType = abstractC8221q;
            }
        }
        if (abstractC8221q instanceof AbstractC8221q.c) {
            m13220j();
        } else if (abstractC8221q instanceof AbstractC8221q.a) {
            m13219i();
        }
    }

    /* renamed from: n */
    public final void m13231n(int i10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenColorLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: o */
    public final void m13232o(int i10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenSizeLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: p */
    public final void m13233p(AbstractC8253d penType) {
        AbstractC9133u.m16133g(penType, "penType");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: q */
    public final void m13234q(boolean z10) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateTouchable$1(this, z10, null), 3, null);
    }
}
