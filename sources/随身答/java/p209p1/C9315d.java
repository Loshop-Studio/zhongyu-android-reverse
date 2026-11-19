package p209p1;

import android.content.Context;
import com.liulishuo.okdownload.OkDownloadProvider;
import p219q1.AbstractC9353c;
import p229r1.InterfaceC9422f;
import p229r1.InterfaceC9425i;
import p239s1.InterfaceC9465a;
import p249t1.C9607a;
import p249t1.C9608b;
import p259u1.C9665g;
import p269v1.C9749b;
import p269v1.C9752e;
import p269v1.InterfaceC9748a;

/* renamed from: p1.d */
/* loaded from: classes4.dex */
public class C9315d {

    /* renamed from: i */
    public static volatile C9315d f16138i;

    /* renamed from: a */
    public final C9608b f16139a;

    /* renamed from: b */
    public final C9607a f16140b;

    /* renamed from: c */
    public final InterfaceC9422f f16141c;

    /* renamed from: d */
    public final InterfaceC9465a.b f16142d;

    /* renamed from: e */
    public final InterfaceC9748a.a f16143e;

    /* renamed from: f */
    public final C9752e f16144f;

    /* renamed from: g */
    public final C9665g f16145g;

    /* renamed from: h */
    public final Context f16146h;

    /* renamed from: p1.d$a */
    public static class a {

        /* renamed from: a */
        public C9608b f16147a;

        /* renamed from: b */
        public C9607a f16148b;

        /* renamed from: c */
        public InterfaceC9425i f16149c;

        /* renamed from: d */
        public InterfaceC9465a.b f16150d;

        /* renamed from: e */
        public C9752e f16151e;

        /* renamed from: f */
        public C9665g f16152f;

        /* renamed from: g */
        public InterfaceC9748a.a f16153g;

        /* renamed from: h */
        public final Context f16154h;

        public a(Context context) {
            this.f16154h = context.getApplicationContext();
        }

        /* renamed from: a */
        public C9315d m15193a() {
            if (this.f16147a == null) {
                this.f16147a = new C9608b();
            }
            if (this.f16148b == null) {
                this.f16148b = new C9607a();
            }
            if (this.f16149c == null) {
                this.f16149c = AbstractC9353c.m15304g(this.f16154h);
            }
            if (this.f16150d == null) {
                this.f16150d = AbstractC9353c.m15303f();
            }
            if (this.f16153g == null) {
                this.f16153g = new C9749b.a();
            }
            if (this.f16151e == null) {
                this.f16151e = new C9752e();
            }
            if (this.f16152f == null) {
                this.f16152f = new C9665g();
            }
            C9315d c9315d = new C9315d(this.f16154h, this.f16147a, this.f16148b, this.f16149c, this.f16150d, this.f16153g, this.f16151e, this.f16152f);
            c9315d.m15192j(null);
            AbstractC9353c.m15306i("OkDownload", "downloadStore[" + this.f16149c + "] connectionFactory[" + this.f16150d);
            return c9315d;
        }
    }

    public C9315d(Context context, C9608b c9608b, C9607a c9607a, InterfaceC9425i interfaceC9425i, InterfaceC9465a.b bVar, InterfaceC9748a.a aVar, C9752e c9752e, C9665g c9665g) {
        this.f16146h = context;
        this.f16139a = c9608b;
        this.f16140b = c9607a;
        this.f16141c = interfaceC9425i;
        this.f16142d = bVar;
        this.f16143e = aVar;
        this.f16144f = c9752e;
        this.f16145g = c9665g;
        c9608b.m15867t(AbstractC9353c.m15305h(interfaceC9425i));
    }

    /* renamed from: k */
    public static C9315d m15182k() {
        if (f16138i == null) {
            synchronized (C9315d.class) {
                try {
                    if (f16138i == null) {
                        Context context = OkDownloadProvider.f5264a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        f16138i = new a(context).m15193a();
                    }
                } finally {
                }
            }
        }
        return f16138i;
    }

    /* renamed from: a */
    public InterfaceC9422f m15183a() {
        return this.f16141c;
    }

    /* renamed from: b */
    public C9607a m15184b() {
        return this.f16140b;
    }

    /* renamed from: c */
    public InterfaceC9465a.b m15185c() {
        return this.f16142d;
    }

    /* renamed from: d */
    public Context m15186d() {
        return this.f16146h;
    }

    /* renamed from: e */
    public C9608b m15187e() {
        return this.f16139a;
    }

    /* renamed from: f */
    public C9665g m15188f() {
        return this.f16145g;
    }

    /* renamed from: g */
    public InterfaceC9313b m15189g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC9748a.a m15190h() {
        return this.f16143e;
    }

    /* renamed from: i */
    public C9752e m15191i() {
        return this.f16144f;
    }

    /* renamed from: j */
    public void m15192j(InterfaceC9313b interfaceC9313b) {
    }
}
