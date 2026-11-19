package p194p;

import coil3.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import p137k.InterfaceC7838j;

/* renamed from: p.m */
/* loaded from: classes3.dex */
public final class C8797m implements InterfaceC8794j {

    /* renamed from: a */
    public final InterfaceC7838j f14936a;

    /* renamed from: b */
    public final boolean f14937b;

    /* renamed from: c */
    public final DataSource f14938c;

    public C8797m(InterfaceC7838j interfaceC7838j, boolean z9, DataSource dataSource) {
        this.f14936a = interfaceC7838j;
        this.f14937b = z9;
        this.f14938c = dataSource;
    }

    /* renamed from: a */
    public final DataSource m14691a() {
        return this.f14938c;
    }

    /* renamed from: b */
    public final InterfaceC7838j m14692b() {
        return this.f14936a;
    }

    /* renamed from: c */
    public final boolean m14693c() {
        return this.f14937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8797m)) {
            return false;
        }
        C8797m c8797m = (C8797m) obj;
        return Intrinsics.areEqual(this.f14936a, c8797m.f14936a) && this.f14937b == c8797m.f14937b && this.f14938c == c8797m.f14938c;
    }

    public int hashCode() {
        return (((this.f14936a.hashCode() * 31) + Boolean.hashCode(this.f14937b)) * 31) + this.f14938c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f14936a + ", isSampled=" + this.f14937b + ", dataSource=" + this.f14938c + ')';
    }
}
