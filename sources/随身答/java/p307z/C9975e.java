package p307z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p307z.InterfaceC9971a;

/* renamed from: z.e */
/* loaded from: classes3.dex */
public final class C9975e {

    /* renamed from: c */
    public static final a f17943c = new a(null);

    /* renamed from: d */
    public static final C9975e f17944d;

    /* renamed from: a */
    public final InterfaceC9971a f17945a;

    /* renamed from: b */
    public final InterfaceC9971a f17946b;

    /* renamed from: z.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC9971a.b bVar = InterfaceC9971a.b.f17939a;
        f17944d = new C9975e(bVar, bVar);
    }

    public C9975e(InterfaceC9971a interfaceC9971a, InterfaceC9971a interfaceC9971a2) {
        this.f17945a = interfaceC9971a;
        this.f17946b = interfaceC9971a2;
    }

    /* renamed from: a */
    public final InterfaceC9971a m17258a() {
        return this.f17946b;
    }

    /* renamed from: b */
    public final InterfaceC9971a m17259b() {
        return this.f17945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9975e)) {
            return false;
        }
        C9975e c9975e = (C9975e) obj;
        return Intrinsics.areEqual(this.f17945a, c9975e.f17945a) && Intrinsics.areEqual(this.f17946b, c9975e.f17946b);
    }

    public int hashCode() {
        return (this.f17945a.hashCode() * 31) + this.f17946b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f17945a + ", height=" + this.f17946b + ')';
    }
}
