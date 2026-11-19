package p023b5;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b5.j */
/* loaded from: classes4.dex */
public final class C5120j {

    /* renamed from: a */
    public final InterfaceC5113c f2241a;

    /* renamed from: b */
    public final InterfaceC5114d f2242b;

    /* renamed from: c */
    public final InterfaceC5111a f2243c;

    /* renamed from: d */
    public final InterfaceC5116f f2244d;

    public C5120j(InterfaceC5113c backgroundLayer, InterfaceC5114d fixLayer, InterfaceC5111a interfaceC5111a, InterfaceC5116f interfaceC5116f) {
        Intrinsics.checkNotNullParameter(backgroundLayer, "backgroundLayer");
        Intrinsics.checkNotNullParameter(fixLayer, "fixLayer");
        this.f2241a = backgroundLayer;
        this.f2242b = fixLayer;
        this.f2243c = interfaceC5111a;
        this.f2244d = interfaceC5116f;
    }

    /* renamed from: a */
    public final InterfaceC5111a m2182a() {
        return this.f2243c;
    }

    /* renamed from: b */
    public final InterfaceC5113c m2183b() {
        return this.f2241a;
    }

    /* renamed from: c */
    public final InterfaceC5114d m2184c() {
        return this.f2242b;
    }

    /* renamed from: d */
    public final InterfaceC5116f m2185d() {
        return this.f2244d;
    }

    /* renamed from: e */
    public final Rect m2186e() {
        return this.f2242b.mo2175b();
    }

    /* renamed from: f */
    public final void m2187f() {
        this.f2242b.reset();
        InterfaceC5111a interfaceC5111a = this.f2243c;
        if (interfaceC5111a != null) {
            interfaceC5111a.clear();
        }
    }
}
