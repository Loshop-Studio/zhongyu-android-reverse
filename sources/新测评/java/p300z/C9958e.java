package p300z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p300z.InterfaceC9954a;

/* renamed from: z.e */
/* loaded from: classes3.dex */
public final class C9958e {

    /* renamed from: c */
    public static final a f17799c = new a(null);

    /* renamed from: d */
    public static final C9958e f17800d;

    /* renamed from: a */
    public final InterfaceC9954a f17801a;

    /* renamed from: b */
    public final InterfaceC9954a f17802b;

    /* renamed from: z.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC9954a.b bVar = InterfaceC9954a.b.f17795a;
        f17800d = new C9958e(bVar, bVar);
    }

    public C9958e(InterfaceC9954a interfaceC9954a, InterfaceC9954a interfaceC9954a2) {
        this.f17801a = interfaceC9954a;
        this.f17802b = interfaceC9954a2;
    }

    /* renamed from: a */
    public final InterfaceC9954a m16771a() {
        return this.f17802b;
    }

    /* renamed from: b */
    public final InterfaceC9954a m16772b() {
        return this.f17801a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9958e)) {
            return false;
        }
        C9958e c9958e = (C9958e) obj;
        return Intrinsics.areEqual(this.f17801a, c9958e.f17801a) && Intrinsics.areEqual(this.f17802b, c9958e.f17802b);
    }

    public int hashCode() {
        return (this.f17801a.hashCode() * 31) + this.f17802b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f17801a + ", height=" + this.f17802b + ')';
    }
}
