package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.base.BaseViewModel;
import com.zykj.study.viewmodels.AbstractC8154b;
import javax.inject.Inject;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class WebViewControlViewModel extends BaseViewModel {

    /* renamed from: a */
    public final InterfaceC9271h f14524a;

    /* renamed from: b */
    public final InterfaceC9280q f14525b;

    @Inject
    public WebViewControlViewModel() {
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(AbstractC8154b.c.f14530a);
        this.f14524a = interfaceC9271hM17054a;
        this.f14525b = AbstractC9268e.m17012b(interfaceC9271hM17054a);
    }

    /* renamed from: a */
    public final InterfaceC9280q m12317a() {
        return this.f14525b;
    }

    /* renamed from: b */
    public final void m12318b() {
        Object value;
        InterfaceC9271h interfaceC9271h = this.f14524a;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, AbstractC8154b.c.f14530a));
    }

    /* renamed from: c */
    public final void m12319c() {
        Object value;
        InterfaceC9271h interfaceC9271h = this.f14524a;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, AbstractC8154b.b.f14529a));
    }

    /* renamed from: d */
    public final void m12320d() {
        Object value;
        InterfaceC9271h interfaceC9271h = this.f14524a;
        do {
            value = interfaceC9271h.getValue();
        } while (!interfaceC9271h.mo16686e(value, AbstractC8154b.a.f14528a));
    }
}
