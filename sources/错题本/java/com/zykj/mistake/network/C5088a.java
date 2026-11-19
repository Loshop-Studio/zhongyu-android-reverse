package com.zykj.mistake.network;

import com.google.gson.C3842h;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6337y;
import okhttp3.C6338z;
import p016b0.C3065d;
import p032c8.C3240e;
import p047d8.C5449a;
import p161s7.C6566a;
import retrofit2.C6513p0;

/* renamed from: com.zykj.mistake.network.a */
/* loaded from: classes3.dex */
public final class C5088a {

    /* renamed from: a */
    public static final C5088a f7986a = new C5088a();

    /* renamed from: b */
    public static String f7987b = "";

    /* renamed from: c */
    public static String f7988c = "";

    /* renamed from: d */
    public static final C6338z f7989d;

    /* renamed from: e */
    public static String f7990e;

    /* renamed from: f */
    public static InterfaceC5090c f7991f;

    static {
        C6337y c6337y = new C6337y();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c6337y.m5980a(10L, timeUnit);
        c6337y.m5982c(10L, timeUnit);
        c6337y.m5981b(10L, timeUnit);
        C6566a c6566a = new C6566a(2);
        ArrayList arrayList = c6337y.f10297c;
        arrayList.add(c6566a);
        arrayList.add(new C6566a(1));
        f7989d = new C6338z(c6337y);
    }

    /* renamed from: a */
    public static C6513p0 m4380a(String str) {
        C3065d c3065d = new C3065d(1);
        C6338z c6338z = f7989d;
        Objects.requireNonNull(c6338z, "client == null");
        c3065d.f1395a = c6338z;
        C3842h c3842h = new C3842h();
        c3842h.f3006j = true;
        ((ArrayList) c3065d.f1397c).add(new C5449a(c3842h.m2790a()));
        ((ArrayList) c3065d.f1398d).add(new C3240e(0));
        c3065d.m2008b(str);
        return c3065d.m2009c();
    }

    /* renamed from: b */
    public static InterfaceC5089b m4381b() {
        Object objM6155b = m4380a(f7987b).m6155b(InterfaceC5089b.class);
        AbstractC5830k.m5329f(objM6155b, "create(...)");
        return (InterfaceC5089b) objM6155b;
    }

    /* renamed from: c */
    public final InterfaceC5090c m4382c() {
        String str = f7987b;
        InterfaceC5090c interfaceC5090c = f7991f;
        if (interfaceC5090c != null && AbstractC5830k.m5325b(f7990e, str)) {
            return interfaceC5090c;
        }
        synchronized (this) {
            InterfaceC5090c interfaceC5090c2 = f7991f;
            if (interfaceC5090c2 != null && AbstractC5830k.m5325b(f7990e, str)) {
                return interfaceC5090c2;
            }
            Object objM6155b = m4380a(str).m6155b(InterfaceC5090c.class);
            f7990e = str;
            f7991f = (InterfaceC5090c) objM6155b;
            AbstractC5830k.m5329f(objM6155b, "also(...)");
            return (InterfaceC5090c) objM6155b;
        }
    }
}
