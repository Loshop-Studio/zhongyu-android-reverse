package p103m;

import coil3.InterfaceC4574e;
import kotlin.jvm.internal.Intrinsics;
import p096l.InterfaceC7259a;

/* renamed from: m.b */
/* loaded from: classes3.dex */
public final class C7359b {

    /* renamed from: a */
    public final Object f9351a;

    /* renamed from: b */
    public final InterfaceC7259a f9352b;

    /* renamed from: c */
    public final InterfaceC4574e f9353c;

    public C7359b(Object obj, InterfaceC7259a interfaceC7259a, InterfaceC4574e interfaceC4574e) {
        this.f9351a = obj;
        this.f9352b = interfaceC7259a;
        this.f9353c = interfaceC4574e;
    }

    /* renamed from: a */
    public final InterfaceC4574e m8362a() {
        return this.f9353c;
    }

    /* renamed from: b */
    public final Object m8363b() {
        return this.f9351a;
    }

    /* renamed from: c */
    public final InterfaceC7259a m8364c() {
        return this.f9352b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7359b)) {
            return false;
        }
        C7359b c7359b = (C7359b) obj;
        return Intrinsics.areEqual(this.f9352b, c7359b.f9352b) && this.f9352b.equals(this.f9351a, c7359b.f9351a) && Intrinsics.areEqual(this.f9353c, c7359b.f9353c);
    }

    public int hashCode() {
        return (((this.f9352b.hashCode() * 31) + this.f9352b.hashCode(this.f9351a)) * 31) + this.f9353c.hashCode();
    }
}
