package p207q1;

import android.content.Context;
import com.liulishuo.okdownload.OkDownloadProvider;
import p218r1.AbstractC8999c;
import p229s1.InterfaceC9129f;
import p229s1.InterfaceC9132i;
import p240t1.InterfaceC9377a;
import p251u1.C9534a;
import p251u1.C9535b;
import p262v1.C9660g;
import p272w1.C9728b;
import p272w1.C9731e;
import p272w1.InterfaceC9727a;

/* renamed from: q1.d */
/* loaded from: classes2.dex */
public class C8879d {

    /* renamed from: i */
    public static volatile C8879d f15105i;

    /* renamed from: a */
    public final C9535b f15106a;

    /* renamed from: b */
    public final C9534a f15107b;

    /* renamed from: c */
    public final InterfaceC9129f f15108c;

    /* renamed from: d */
    public final InterfaceC9377a.b f15109d;

    /* renamed from: e */
    public final InterfaceC9727a.a f15110e;

    /* renamed from: f */
    public final C9731e f15111f;

    /* renamed from: g */
    public final C9660g f15112g;

    /* renamed from: h */
    public final Context f15113h;

    /* renamed from: q1.d$a */
    public static class a {

        /* renamed from: a */
        public C9535b f15114a;

        /* renamed from: b */
        public C9534a f15115b;

        /* renamed from: c */
        public InterfaceC9132i f15116c;

        /* renamed from: d */
        public InterfaceC9377a.b f15117d;

        /* renamed from: e */
        public C9731e f15118e;

        /* renamed from: f */
        public C9660g f15119f;

        /* renamed from: g */
        public InterfaceC9727a.a f15120g;

        /* renamed from: h */
        public final Context f15121h;

        public a(Context context) {
            this.f15121h = context.getApplicationContext();
        }

        /* renamed from: a */
        public C8879d m14916a() {
            if (this.f15114a == null) {
                this.f15114a = new C9535b();
            }
            if (this.f15115b == null) {
                this.f15115b = new C9534a();
            }
            if (this.f15116c == null) {
                this.f15116c = AbstractC8999c.m15123g(this.f15121h);
            }
            if (this.f15117d == null) {
                this.f15117d = AbstractC8999c.m15122f();
            }
            if (this.f15120g == null) {
                this.f15120g = new C9728b.a();
            }
            if (this.f15118e == null) {
                this.f15118e = new C9731e();
            }
            if (this.f15119f == null) {
                this.f15119f = new C9660g();
            }
            C8879d c8879d = new C8879d(this.f15121h, this.f15114a, this.f15115b, this.f15116c, this.f15117d, this.f15120g, this.f15118e, this.f15119f);
            c8879d.m14915j(null);
            AbstractC8999c.m15125i("OkDownload", "downloadStore[" + this.f15116c + "] connectionFactory[" + this.f15117d);
            return c8879d;
        }
    }

    public C8879d(Context context, C9535b c9535b, C9534a c9534a, InterfaceC9132i interfaceC9132i, InterfaceC9377a.b bVar, InterfaceC9727a.a aVar, C9731e c9731e, C9660g c9660g) {
        this.f15113h = context;
        this.f15106a = c9535b;
        this.f15107b = c9534a;
        this.f15108c = interfaceC9132i;
        this.f15109d = bVar;
        this.f15110e = aVar;
        this.f15111f = c9731e;
        this.f15112g = c9660g;
        c9535b.m15935s(AbstractC8999c.m15124h(interfaceC9132i));
    }

    /* renamed from: k */
    public static C8879d m14905k() {
        if (f15105i == null) {
            synchronized (C8879d.class) {
                try {
                    if (f15105i == null) {
                        Context context = OkDownloadProvider.f4656a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f15105i = new a(context).m14916a();
                    }
                } finally {
                }
            }
        }
        return f15105i;
    }

    /* renamed from: a */
    public InterfaceC9129f m14906a() {
        return this.f15108c;
    }

    /* renamed from: b */
    public C9534a m14907b() {
        return this.f15107b;
    }

    /* renamed from: c */
    public InterfaceC9377a.b m14908c() {
        return this.f15109d;
    }

    /* renamed from: d */
    public Context m14909d() {
        return this.f15113h;
    }

    /* renamed from: e */
    public C9535b m14910e() {
        return this.f15106a;
    }

    /* renamed from: f */
    public C9660g m14911f() {
        return this.f15112g;
    }

    /* renamed from: g */
    public InterfaceC8877b m14912g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC9727a.a m14913h() {
        return this.f15110e;
    }

    /* renamed from: i */
    public C9731e m14914i() {
        return this.f15111f;
    }

    /* renamed from: j */
    public void m14915j(InterfaceC8877b interfaceC8877b) {
    }
}
