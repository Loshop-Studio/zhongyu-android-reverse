package p154s;

import android.content.Context;
import coil3.C3298i;
import coil3.C3304j;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.C3347k;
import java.util.Map;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import okio.FileSystem;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p162t.InterfaceC6577g;
import p169t6.AbstractC6600a;
import p171u.InterfaceC6608a;

/* renamed from: s.c */
/* loaded from: classes2.dex */
public final class C6529c {

    /* renamed from: a */
    public final Context f10818a;

    /* renamed from: b */
    public C6530d f10819b;

    /* renamed from: c */
    public Object f10820c;

    /* renamed from: d */
    public InterfaceC6608a f10821d;

    /* renamed from: e */
    public final Map f10822e;

    /* renamed from: f */
    public InterfaceC5636h f10823f;

    /* renamed from: g */
    public InterfaceC5636h f10824g;

    /* renamed from: h */
    public InterfaceC5636h f10825h;

    /* renamed from: i */
    public CachePolicy f10826i;

    /* renamed from: j */
    public CachePolicy f10827j;

    /* renamed from: k */
    public final InterfaceC6471c f10828k;

    /* renamed from: l */
    public final InterfaceC6471c f10829l;

    /* renamed from: m */
    public final InterfaceC6471c f10830m;

    /* renamed from: n */
    public InterfaceC6577g f10831n;

    /* renamed from: o */
    public Scale f10832o;

    /* renamed from: p */
    public Precision f10833p;

    /* renamed from: q */
    public Object f10834q;

    public C6529c(Context context) {
        this.f10818a = context;
        this.f10819b = C6530d.f10835o;
        this.f10820c = null;
        this.f10821d = null;
        this.f10822e = AbstractC5785e0.m5147A();
        this.f10823f = null;
        this.f10824g = null;
        this.f10825h = null;
        this.f10826i = null;
        this.f10827j = null;
        C3347k c3347k = C3347k.f2082a;
        this.f10828k = c3347k;
        this.f10829l = c3347k;
        this.f10830m = c3347k;
        this.f10831n = null;
        this.f10832o = null;
        this.f10833p = null;
        this.f10834q = C3304j.f1995b;
    }

    /* renamed from: a */
    public final C6532f m6182a() {
        C3304j c3304j;
        Object obj = this.f10820c;
        if (obj == null) {
            obj = C6536j.f10892a;
        }
        Object obj2 = obj;
        InterfaceC6608a interfaceC6608a = this.f10821d;
        Boolean bool = Boolean.FALSE;
        Map mapM6246x = this.f10822e;
        if (AbstractC5830k.m5325b(mapM6246x, bool)) {
            AbstractC5830k.m5328e(mapM6246x, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapM6246x = AbstractC6600a.m6246x(AbstractC5835p.m5353b(mapM6246x));
        } else if (mapM6246x == null) {
            throw new AssertionError();
        }
        Map map = mapM6246x;
        AbstractC5830k.m5328e(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        C6530d c6530d = this.f10819b;
        FileSystem fileSystem = c6530d.f10836a;
        CachePolicy cachePolicy = this.f10826i;
        if (cachePolicy == null) {
            cachePolicy = c6530d.f10840e;
        }
        CachePolicy cachePolicy2 = cachePolicy;
        CachePolicy cachePolicy3 = this.f10827j;
        if (cachePolicy3 == null) {
            cachePolicy3 = c6530d.f10841f;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        CachePolicy cachePolicy5 = c6530d.f10842g;
        InterfaceC5636h interfaceC5636h = this.f10823f;
        if (interfaceC5636h == null) {
            interfaceC5636h = c6530d.f10837b;
        }
        InterfaceC5636h interfaceC5636h2 = interfaceC5636h;
        InterfaceC5636h interfaceC5636h3 = this.f10824g;
        if (interfaceC5636h3 == null) {
            interfaceC5636h3 = c6530d.f10838c;
        }
        InterfaceC5636h interfaceC5636h4 = interfaceC5636h3;
        InterfaceC5636h interfaceC5636h5 = this.f10825h;
        if (interfaceC5636h5 == null) {
            interfaceC5636h5 = c6530d.f10839d;
        }
        InterfaceC5636h interfaceC5636h6 = interfaceC5636h5;
        InterfaceC6471c interfaceC6471c = this.f10828k;
        if (interfaceC6471c == null) {
            interfaceC6471c = c6530d.f10843h;
        }
        InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
        InterfaceC6471c interfaceC6471c3 = this.f10829l;
        if (interfaceC6471c3 == null) {
            interfaceC6471c3 = c6530d.f10844i;
        }
        InterfaceC6471c interfaceC6471c4 = interfaceC6471c3;
        InterfaceC6471c interfaceC6471c5 = this.f10830m;
        if (interfaceC6471c5 == null) {
            interfaceC6471c5 = c6530d.f10845j;
        }
        InterfaceC6471c interfaceC6471c6 = interfaceC6471c5;
        InterfaceC6577g interfaceC6577g = this.f10831n;
        if (interfaceC6577g == null) {
            interfaceC6577g = c6530d.f10846k;
        }
        InterfaceC6577g interfaceC6577g2 = interfaceC6577g;
        Scale scale = this.f10832o;
        if (scale == null) {
            scale = c6530d.f10847l;
        }
        Scale scale2 = scale;
        Precision precision = this.f10833p;
        if (precision == null) {
            precision = c6530d.f10848m;
        }
        Precision precision2 = precision;
        Object obj3 = this.f10834q;
        if (obj3 instanceof C3298i) {
            C3298i c3298i = (C3298i) obj3;
            c3298i.getClass();
            c3304j = new C3304j(AbstractC6600a.m6246x(c3298i.f1979a));
        } else {
            if (!(obj3 instanceof C3304j)) {
                throw new AssertionError();
            }
            c3304j = (C3304j) obj3;
        }
        return new C6532f(this.f10818a, obj2, interfaceC6608a, map, fileSystem, interfaceC5636h2, interfaceC5636h4, interfaceC5636h6, cachePolicy2, cachePolicy4, cachePolicy5, interfaceC6471c2, interfaceC6471c4, interfaceC6471c6, interfaceC6577g2, scale2, precision2, c3304j, new C6531e(this.f10823f, this.f10824g, this.f10825h, this.f10826i, this.f10827j, this.f10828k, this.f10829l, this.f10830m, this.f10831n, this.f10832o, this.f10833p), this.f10819b);
    }

    public C6529c(C6532f c6532f, Context context) {
        this.f10818a = context;
        this.f10819b = c6532f.f10880t;
        this.f10820c = c6532f.f10862b;
        this.f10821d = c6532f.f10863c;
        this.f10822e = c6532f.f10864d;
        C6531e c6531e = c6532f.f10879s;
        this.f10823f = c6531e.f10850a;
        this.f10824g = c6531e.f10851b;
        this.f10825h = c6531e.f10852c;
        this.f10826i = c6531e.f10853d;
        this.f10827j = c6531e.f10854e;
        this.f10828k = c6531e.f10855f;
        this.f10829l = c6531e.f10856g;
        this.f10830m = c6531e.f10857h;
        this.f10831n = c6531e.f10858i;
        this.f10832o = c6531e.f10859j;
        this.f10833p = c6531e.f10860k;
        this.f10834q = c6532f.f10878r;
    }
}
