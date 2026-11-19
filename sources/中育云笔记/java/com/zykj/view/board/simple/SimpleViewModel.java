package com.zykj.view.board.simple;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.board.AbstractC8856r;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import sd.AbstractC11117h;

/* loaded from: classes6.dex */
public final class SimpleViewModel extends ViewModel {

    /* renamed from: a */
    public final InterfaceC11603l f20452a;

    /* renamed from: b */
    public final InterfaceC11612u f20453b;

    /* renamed from: c */
    public final InterfaceC11602k f20454c;

    /* renamed from: d */
    public final InterfaceC11607p f20455d;

    public SimpleViewModel() {
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(new C8887e(false, null, null, null, null, null, null, null, 255, null));
        this.f20452a = interfaceC11603lM25602a;
        this.f20453b = AbstractC11596e.m25552b(interfaceC11603lM25602a);
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f20454c = interfaceC11602kM25592b;
        this.f20455d = AbstractC11596e.m25551a(interfaceC11602kM25592b);
    }

    /* renamed from: i */
    private final void m17291i() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutEraser$1(this, null), 3, null);
    }

    /* renamed from: j */
    private final void m17292j() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutPen$1(this, null), 3, null);
    }

    /* renamed from: r */
    public static /* synthetic */ void m17293r(SimpleViewModel simpleViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !((C8887e) simpleViewModel.f20452a.getValue()).m17329j();
        }
        simpleViewModel.m17306q(z10);
    }

    /* renamed from: c */
    public final void m17294c() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$cleanPage$1(this, null), 3, null);
    }

    /* renamed from: d */
    public final InterfaceC11607p m17295d() {
        return this.f20455d;
    }

    /* renamed from: e */
    public final InterfaceC11612u m17296e() {
        return this.f20453b;
    }

    /* renamed from: f */
    public final void m17297f() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: g */
    public final void m17298g() {
        Object value;
        C8887e c8887e;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20452a;
        do {
            value = interfaceC11603l.getValue();
            c8887e = (C8887e) value;
            AbstractC8856r abstractC8856rM17325f = c8887e.m17325f();
            abstractC8856r = AbstractC8856r.b.f20300e;
            if (AbstractC9979u.m20289b(abstractC8856rM17325f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8887e.m17320b(c8887e, false, null, abstractC8856r, null, null, null, null, null, 251, null)));
    }

    /* renamed from: h */
    public final void m17299h() {
        Object value;
        C8887e c8887e;
        AbstractC8856r abstractC8856r;
        InterfaceC11603l interfaceC11603l = this.f20452a;
        do {
            value = interfaceC11603l.getValue();
            c8887e = (C8887e) value;
            AbstractC8856r abstractC8856rM17325f = c8887e.m17325f();
            abstractC8856r = AbstractC8856r.e.f20303e;
            if (AbstractC9979u.m20289b(abstractC8856rM17325f, abstractC8856r)) {
                abstractC8856r = AbstractC8856r.d.f20302e;
            }
        } while (!interfaceC11603l.mo20870e(value, C8887e.m17320b(c8887e, false, null, abstractC8856r, null, null, null, null, null, 251, null)));
    }

    /* renamed from: k */
    public final void m17300k(int i10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateEraserSizeLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: l */
    public final void m17301l(boolean z10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateExpandState$1(this, z10, null), 3, null);
    }

    /* renamed from: m */
    public final void m17302m(AbstractC8855q mainToolType) {
        AbstractC8855q abstractC8855q;
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        InterfaceC11603l interfaceC11603l = this.f20452a;
        while (true) {
            Object value = interfaceC11603l.getValue();
            abstractC8855q = mainToolType;
            if (interfaceC11603l.mo20870e(value, C8887e.m17320b((C8887e) value, false, abstractC8855q, null, null, null, null, null, null, 253, null))) {
                break;
            } else {
                mainToolType = abstractC8855q;
            }
        }
        if (abstractC8855q instanceof AbstractC8855q.c) {
            m17292j();
        } else if (abstractC8855q instanceof AbstractC8855q.a) {
            m17291i();
        }
    }

    /* renamed from: n */
    public final void m17303n(int i10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenColorLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: o */
    public final void m17304o(int i10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenSizeLevel$1(i10, this, null), 3, null);
    }

    /* renamed from: p */
    public final void m17305p(AbstractC8886d penType) {
        AbstractC9979u.m20294g(penType, "penType");
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: q */
    public final void m17306q(boolean z10) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateTouchable$1(this, z10, null), 3, null);
    }
}
