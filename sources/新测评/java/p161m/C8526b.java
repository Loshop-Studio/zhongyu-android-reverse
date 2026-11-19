package p161m;

import coil3.InterfaceC5193e;
import kotlin.jvm.internal.Intrinsics;
import p150l.InterfaceC8474b;

/* renamed from: m.b */
/* loaded from: classes3.dex */
public final class C8526b {

    /* renamed from: a */
    public final Object f14157a;

    /* renamed from: b */
    public final InterfaceC8474b f14158b;

    /* renamed from: c */
    public final InterfaceC5193e f14159c;

    public C8526b(Object obj, InterfaceC8474b interfaceC8474b, InterfaceC5193e interfaceC5193e) {
        this.f14157a = obj;
        this.f14158b = interfaceC8474b;
        this.f14159c = interfaceC5193e;
    }

    /* renamed from: a */
    public final InterfaceC5193e m14016a() {
        return this.f14159c;
    }

    /* renamed from: b */
    public final Object m14017b() {
        return this.f14157a;
    }

    /* renamed from: c */
    public final InterfaceC8474b m14018c() {
        return this.f14158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8526b)) {
            return false;
        }
        C8526b c8526b = (C8526b) obj;
        return Intrinsics.areEqual(this.f14158b, c8526b.f14158b) && this.f14158b.equals(this.f14157a, c8526b.f14157a) && Intrinsics.areEqual(this.f14159c, c8526b.f14159c);
    }

    public int hashCode() {
        return (((this.f14158b.hashCode() * 31) + this.f14158b.hashCode(this.f14157a)) * 31) + this.f14159c.hashCode();
    }
}
