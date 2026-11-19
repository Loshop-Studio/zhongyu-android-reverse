package p161s7;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6289c0;
import okhttp3.C6301i0;
import okhttp3.InterfaceC6331s;
import okhttp3.InterfaceC6332t;
import okhttp3.internal.connection.C6305d;
import okhttp3.internal.connection.C6310i;

/* renamed from: s7.e */
/* loaded from: classes4.dex */
public final class C6570e implements InterfaceC6331s {

    /* renamed from: a */
    public final C6310i f10965a;

    /* renamed from: b */
    public final ArrayList f10966b;

    /* renamed from: c */
    public final int f10967c;

    /* renamed from: d */
    public final C6305d f10968d;

    /* renamed from: e */
    public final C6289c0 f10969e;

    /* renamed from: f */
    public final int f10970f;

    /* renamed from: g */
    public final int f10971g;

    /* renamed from: h */
    public final int f10972h;

    /* renamed from: i */
    public int f10973i;

    public C6570e(C6310i c6310i, ArrayList arrayList, int i, C6305d c6305d, C6289c0 request, int i8, int i9, int i10) {
        AbstractC5830k.m5330g(request, "request");
        this.f10965a = c6310i;
        this.f10966b = arrayList;
        this.f10967c = i;
        this.f10968d = c6305d;
        this.f10969e = request;
        this.f10970f = i8;
        this.f10971g = i9;
        this.f10972h = i10;
    }

    /* renamed from: a */
    public static C6570e m6213a(C6570e c6570e, int i, C6305d c6305d, C6289c0 c6289c0, int i8) {
        if ((i8 & 1) != 0) {
            i = c6570e.f10967c;
        }
        int i9 = i;
        if ((i8 & 2) != 0) {
            c6305d = c6570e.f10968d;
        }
        C6305d c6305d2 = c6305d;
        if ((i8 & 4) != 0) {
            c6289c0 = c6570e.f10969e;
        }
        C6289c0 request = c6289c0;
        int i10 = c6570e.f10970f;
        int i11 = c6570e.f10971g;
        int i12 = c6570e.f10972h;
        AbstractC5830k.m5330g(request, "request");
        return new C6570e(c6570e.f10965a, c6570e.f10966b, i9, c6305d2, request, i10, i11, i12);
    }

    /* renamed from: b */
    public final C6301i0 m6214b(C6289c0 request) {
        AbstractC5830k.m5330g(request, "request");
        ArrayList arrayList = this.f10966b;
        int size = arrayList.size();
        int i = this.f10967c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f10973i++;
        C6305d c6305d = this.f10968d;
        if (c6305d != null) {
            if (!c6305d.f10130b.m5908b(request.f10075a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f10973i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i8 = i + 1;
        C6570e c6570eM6213a = m6213a(this, i8, null, request, 58);
        InterfaceC6332t interfaceC6332t = (InterfaceC6332t) arrayList.get(i);
        C6301i0 c6301i0Intercept = interfaceC6332t.intercept(c6570eM6213a);
        if (c6301i0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC6332t + " returned null");
        }
        if (c6305d != null && i8 < arrayList.size() && c6570eM6213a.f10973i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC6332t + " must call proceed() exactly once").toString());
        }
        if (c6301i0Intercept.f10110g != null) {
            return c6301i0Intercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC6332t + " returned a response with no body").toString());
    }
}
