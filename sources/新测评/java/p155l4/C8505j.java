package p155l4;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l4.j */
/* loaded from: classes4.dex */
public final class C8505j {

    /* renamed from: a */
    public final InterfaceC8498c f14103a;

    /* renamed from: b */
    public final InterfaceC8499d f14104b;

    /* renamed from: c */
    public final InterfaceC8496a f14105c;

    /* renamed from: d */
    public final InterfaceC8501f f14106d;

    public C8505j(InterfaceC8498c backgroundLayer, InterfaceC8499d fixLayer, InterfaceC8496a interfaceC8496a, InterfaceC8501f interfaceC8501f) {
        Intrinsics.checkNotNullParameter(backgroundLayer, "backgroundLayer");
        Intrinsics.checkNotNullParameter(fixLayer, "fixLayer");
        this.f14103a = backgroundLayer;
        this.f14104b = fixLayer;
        this.f14105c = interfaceC8496a;
        this.f14106d = interfaceC8501f;
    }

    /* renamed from: a */
    public final InterfaceC8496a m13975a() {
        return this.f14105c;
    }

    /* renamed from: b */
    public final InterfaceC8498c m13976b() {
        return this.f14103a;
    }

    /* renamed from: c */
    public final InterfaceC8499d m13977c() {
        return this.f14104b;
    }

    /* renamed from: d */
    public final InterfaceC8501f m13978d() {
        return this.f14106d;
    }

    /* renamed from: e */
    public final Rect m13979e() {
        return this.f14104b.mo13968b();
    }

    /* renamed from: f */
    public final void m13980f() {
        this.f14104b.reset();
        InterfaceC8496a interfaceC8496a = this.f14105c;
        if (interfaceC8496a != null) {
            interfaceC8496a.clear();
        }
    }
}
