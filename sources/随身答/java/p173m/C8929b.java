package p173m;

import coil3.InterfaceC5328e;
import kotlin.jvm.internal.Intrinsics;
import p163l.InterfaceC8856b;

/* renamed from: m.b */
/* loaded from: classes3.dex */
public final class C8929b {

    /* renamed from: a */
    public final Object f14959a;

    /* renamed from: b */
    public final InterfaceC8856b f14960b;

    /* renamed from: c */
    public final InterfaceC5328e f14961c;

    public C8929b(Object obj, InterfaceC8856b interfaceC8856b, InterfaceC5328e interfaceC5328e) {
        this.f14959a = obj;
        this.f14960b = interfaceC8856b;
        this.f14961c = interfaceC5328e;
    }

    /* renamed from: a */
    public final InterfaceC5328e m14218a() {
        return this.f14961c;
    }

    /* renamed from: b */
    public final Object m14219b() {
        return this.f14959a;
    }

    /* renamed from: c */
    public final InterfaceC8856b m14220c() {
        return this.f14960b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8929b)) {
            return false;
        }
        C8929b c8929b = (C8929b) obj;
        return Intrinsics.areEqual(this.f14960b, c8929b.f14960b) && this.f14960b.equals(this.f14959a, c8929b.f14959a) && Intrinsics.areEqual(this.f14961c, c8929b.f14961c);
    }

    public int hashCode() {
        return (((this.f14960b.hashCode() * 31) + this.f14960b.hashCode(this.f14959a)) * 31) + this.f14961c.hashCode();
    }
}
