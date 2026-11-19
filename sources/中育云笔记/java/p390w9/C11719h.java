package p390w9;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: w9.h */
/* loaded from: classes5.dex */
public final class C11719h {

    /* renamed from: a */
    public final InterfaceC11713b f27878a;

    /* renamed from: b */
    public final InterfaceC11714c f27879b;

    /* renamed from: c */
    public final InterfaceC11712a f27880c;

    /* renamed from: d */
    public final InterfaceC11716e f27881d;

    public C11719h(InterfaceC11713b backgroundLayer, InterfaceC11714c fixLayer, InterfaceC11712a interfaceC11712a, InterfaceC11716e interfaceC11716e) {
        AbstractC9979u.m20294g(backgroundLayer, "backgroundLayer");
        AbstractC9979u.m20294g(fixLayer, "fixLayer");
        this.f27878a = backgroundLayer;
        this.f27879b = fixLayer;
        this.f27880c = interfaceC11712a;
        this.f27881d = interfaceC11716e;
    }

    /* renamed from: a */
    public final InterfaceC11712a m25944a() {
        return this.f27880c;
    }

    /* renamed from: b */
    public final InterfaceC11713b m25945b() {
        return this.f27878a;
    }

    /* renamed from: c */
    public final InterfaceC11714c m25946c() {
        return this.f27879b;
    }

    /* renamed from: d */
    public final InterfaceC11716e m25947d() {
        return this.f27881d;
    }

    /* renamed from: e */
    public final Rect m25948e() {
        return this.f27879b.mo13968b();
    }

    /* renamed from: f */
    public final void m25949f() {
        this.f27879b.reset();
        InterfaceC11712a interfaceC11712a = this.f27880c;
        if (interfaceC11712a != null) {
            interfaceC11712a.clear();
        }
    }
}
