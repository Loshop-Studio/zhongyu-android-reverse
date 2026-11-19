package p396x;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p396x.InterfaceC11745a;

/* renamed from: x.e */
/* loaded from: classes3.dex */
public final class C11749e {

    /* renamed from: c */
    public static final a f27922c = new a(null);

    /* renamed from: d */
    public static final C11749e f27923d;

    /* renamed from: a */
    public final InterfaceC11745a f27924a;

    /* renamed from: b */
    public final InterfaceC11745a f27925b;

    /* renamed from: x.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC11745a.b bVar = InterfaceC11745a.b.f27918a;
        f27923d = new C11749e(bVar, bVar);
    }

    public C11749e(InterfaceC11745a interfaceC11745a, InterfaceC11745a interfaceC11745a2) {
        this.f27924a = interfaceC11745a;
        this.f27925b = interfaceC11745a2;
    }

    /* renamed from: a */
    public final InterfaceC11745a m25999a() {
        return this.f27925b;
    }

    /* renamed from: b */
    public final InterfaceC11745a m26000b() {
        return this.f27924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11749e)) {
            return false;
        }
        C11749e c11749e = (C11749e) obj;
        return AbstractC9979u.m20289b(this.f27924a, c11749e.f27924a) && AbstractC9979u.m20289b(this.f27925b, c11749e.f27925b);
    }

    public int hashCode() {
        return (this.f27924a.hashCode() * 31) + this.f27925b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f27924a + ", height=" + this.f27925b + ')';
    }
}
