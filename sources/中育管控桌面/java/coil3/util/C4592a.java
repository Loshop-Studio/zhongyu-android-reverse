package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.AbstractC4576g;
import coil3.RealImageLoader;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p023c0.InterfaceC4461f;
import p023c0.InterfaceC4479x;
import p152t.InterfaceC7708d;

/* renamed from: coil3.util.a */
/* loaded from: classes3.dex */
public final class C4592a implements InterfaceC4479x {

    /* renamed from: f */
    public static final b f1950f = new b(null);

    /* renamed from: a */
    public final WeakReference f1951a;

    /* renamed from: b */
    public final a f1952b;

    /* renamed from: c */
    public final c f1953c = new c();

    /* renamed from: d */
    public Context f1954d;

    /* renamed from: e */
    public boolean f1955e;

    /* renamed from: coil3.util.a$a */
    public final class a implements InterfaceC4461f {

        /* renamed from: a */
        public final double f1956a;

        public a(RealImageLoader realImageLoader) {
            this.f1956a = AbstractC4576g.m1891d(realImageLoader.m1657i());
        }

        /* renamed from: a */
        public final void m2029a(Context context) {
            if (this.f1956a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            C4592a c4592a = C4592a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c4592a.m2027c().get();
            if (realImageLoader == null) {
                c4592a.m2028d();
                return;
            }
            InterfaceC7708d interfaceC7708dMo1655f = realImageLoader.mo1655f();
            if (interfaceC7708dMo1655f != null) {
                interfaceC7708dMo1655f.mo9170b((long) (this.f1956a * interfaceC7708dMo1655f.mo9171d()));
                realImageLoader.m1657i().m1666f();
            }
        }

        /* renamed from: b */
        public final void m2030b(Context context) {
            if (this.f1956a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            C4592a c4592a = C4592a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c4592a.m2027c().get();
            if (realImageLoader == null) {
                c4592a.m2028d();
                return;
            }
            InterfaceC7708d interfaceC7708dMo1655f = realImageLoader.mo1655f();
            if (interfaceC7708dMo1655f != null) {
                interfaceC7708dMo1655f.mo9170b(interfaceC7708dMo1655f.mo9171d());
                realImageLoader.m1657i().m1666f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            m2030b(activity);
        }
    }

    /* renamed from: coil3.util.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: coil3.util.a$c */
    public final class c implements ComponentCallbacks2 {
        public c() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            C4592a c4592a = C4592a.this;
            synchronized (c4592a) {
                if (((RealImageLoader) c4592a.m2027c().get()) == null) {
                    c4592a.m2028d();
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i6) {
            InterfaceC7708d interfaceC7708dMo1655f;
            C4592a c4592a = C4592a.this;
            synchronized (c4592a) {
                try {
                    RealImageLoader realImageLoader = (RealImageLoader) c4592a.m2027c().get();
                    if (realImageLoader != null) {
                        realImageLoader.m1657i().m1666f();
                        if (i6 >= 40) {
                            InterfaceC7708d interfaceC7708dMo1655f2 = realImageLoader.mo1655f();
                            if (interfaceC7708dMo1655f2 != null) {
                                interfaceC7708dMo1655f2.clear();
                            }
                        } else if (i6 >= 20) {
                            c4592a.m2026b().m2029a(realImageLoader.m1657i().m1661a());
                        } else if (i6 >= 10 && (interfaceC7708dMo1655f = realImageLoader.mo1655f()) != null) {
                            interfaceC7708dMo1655f.mo9172f(interfaceC7708dMo1655f.getSize() / 2);
                        }
                    } else {
                        c4592a.m2028d();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4592a(RealImageLoader realImageLoader) {
        this.f1951a = new WeakReference(realImageLoader);
        this.f1952b = new a(realImageLoader);
    }

    @Override // p023c0.InterfaceC4479x
    /* renamed from: a */
    public synchronized void mo1575a() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) m2027c().get();
            if (realImageLoader == null) {
                m2028d();
            } else if (this.f1954d == null) {
                Context contextM1661a = realImageLoader.m1657i().m1661a();
                this.f1954d = contextM1661a;
                contextM1661a.registerComponentCallbacks(this.f1953c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final a m2026b() {
        return this.f1952b;
    }

    /* renamed from: c */
    public final WeakReference m2027c() {
        return this.f1951a;
    }

    /* renamed from: d */
    public synchronized void m2028d() {
        try {
            if (this.f1955e) {
                return;
            }
            this.f1955e = true;
            Context context = this.f1954d;
            if (context != null) {
                this.f1952b.m2030b(context);
                context.unregisterComponentCallbacks(this.f1953c);
            }
            this.f1951a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
