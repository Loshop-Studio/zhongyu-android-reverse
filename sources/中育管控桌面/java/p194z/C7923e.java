package p194z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p194z.InterfaceC7919a;

/* renamed from: z.e */
/* loaded from: classes3.dex */
public final class C7923e {

    /* renamed from: c */
    public static final a f10642c = new a(null);

    /* renamed from: d */
    public static final C7923e f10643d;

    /* renamed from: a */
    public final InterfaceC7919a f10644a;

    /* renamed from: b */
    public final InterfaceC7919a f10645b;

    /* renamed from: z.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC7919a.b bVar = InterfaceC7919a.b.f10638a;
        f10643d = new C7923e(bVar, bVar);
    }

    public C7923e(InterfaceC7919a interfaceC7919a, InterfaceC7919a interfaceC7919a2) {
        this.f10644a = interfaceC7919a;
        this.f10645b = interfaceC7919a2;
    }

    /* renamed from: a */
    public final InterfaceC7919a m9719a() {
        return this.f10645b;
    }

    /* renamed from: b */
    public final InterfaceC7919a m9720b() {
        return this.f10644a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7923e)) {
            return false;
        }
        C7923e c7923e = (C7923e) obj;
        return Intrinsics.areEqual(this.f10644a, c7923e.f10644a) && Intrinsics.areEqual(this.f10645b, c7923e.f10645b);
    }

    public int hashCode() {
        return (this.f10644a.hashCode() * 31) + this.f10645b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f10644a + ", height=" + this.f10645b + ')';
    }
}
