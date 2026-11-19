package p290w8;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: w8.o */
/* loaded from: classes5.dex */
public abstract class AbstractC10427o {

    /* renamed from: a */
    public static final boolean f20746a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f20746a = z10;
    }

    /* renamed from: a */
    public static final InterfaceC10430o2 m19480a(InterfaceC10570l factory) {
        AbstractC9133u.m16133g(factory, "factory");
        return f20746a ? new C10447t(factory) : new C10467y(factory);
    }

    /* renamed from: b */
    public static final InterfaceC10457v1 m19481b(InterfaceC10574p factory) {
        AbstractC9133u.m16133g(factory, "factory");
        return f20746a ? new C10451u(factory) : new C10471z(factory);
    }
}
