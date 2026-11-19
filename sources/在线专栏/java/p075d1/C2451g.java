package p075d1;

import android.content.Context;
import p095h1.InterfaceC2654a;

/* renamed from: d1.g */
/* loaded from: classes.dex */
public class C2451g {

    /* renamed from: e */
    private static C2451g f10025e;

    /* renamed from: a */
    private C2445a f10026a;

    /* renamed from: b */
    private C2446b f10027b;

    /* renamed from: c */
    private C2449e f10028c;

    /* renamed from: d */
    private C2450f f10029d;

    private C2451g(Context context, InterfaceC2654a interfaceC2654a) {
        Context applicationContext = context.getApplicationContext();
        this.f10026a = new C2445a(applicationContext, interfaceC2654a);
        this.f10027b = new C2446b(applicationContext, interfaceC2654a);
        this.f10028c = new C2449e(applicationContext, interfaceC2654a);
        this.f10029d = new C2450f(applicationContext, interfaceC2654a);
    }

    /* renamed from: c */
    public static synchronized C2451g m8190c(Context context, InterfaceC2654a interfaceC2654a) {
        if (f10025e == null) {
            f10025e = new C2451g(context, interfaceC2654a);
        }
        return f10025e;
    }

    /* renamed from: a */
    public C2445a m8191a() {
        return this.f10026a;
    }

    /* renamed from: b */
    public C2446b m8192b() {
        return this.f10027b;
    }

    /* renamed from: d */
    public C2449e m8193d() {
        return this.f10028c;
    }

    /* renamed from: e */
    public C2450f m8194e() {
        return this.f10029d;
    }
}
