package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.AbstractC5472g;
import coil3.RealImageLoader;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.InterfaceC0009f;
import p001a0.InterfaceC0027x;
import p309qc.C10786q;
import p312r.InterfaceC10825d;

/* renamed from: coil3.util.a */
/* loaded from: classes3.dex */
public final class C5488a implements InterfaceC0027x {

    /* renamed from: f */
    public static final b f3941f = new b(null);

    /* renamed from: a */
    public final WeakReference f3942a;

    /* renamed from: b */
    public final a f3943b;

    /* renamed from: c */
    public final c f3944c = new c();

    /* renamed from: d */
    public Context f3945d;

    /* renamed from: e */
    public boolean f3946e;

    /* renamed from: coil3.util.a$a */
    public final class a implements InterfaceC0009f {

        /* renamed from: a */
        public final double f3947a;

        public a(RealImageLoader realImageLoader) {
            this.f3947a = AbstractC5472g.m3157d(realImageLoader.m2982h());
        }

        /* renamed from: a */
        public final void m3297a(Context context) {
            if (this.f3947a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            AbstractC9979u.m20292e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            C5488a c5488a = C5488a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c5488a.m3295c().get();
            if (realImageLoader == null) {
                c5488a.m3296d();
                return;
            }
            InterfaceC10825d interfaceC10825dMo2980e = realImageLoader.mo2980e();
            if (interfaceC10825dMo2980e != null) {
                interfaceC10825dMo2980e.mo23284b((long) (this.f3947a * interfaceC10825dMo2980e.mo23285c()));
                realImageLoader.m2982h().m2991f();
            }
        }

        /* renamed from: b */
        public final void m3298b(Context context) {
            if (this.f3947a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            AbstractC9979u.m20292e(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            C5488a c5488a = C5488a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c5488a.m3295c().get();
            if (realImageLoader == null) {
                c5488a.m3296d();
                return;
            }
            InterfaceC10825d interfaceC10825dMo2980e = realImageLoader.mo2980e();
            if (interfaceC10825dMo2980e != null) {
                interfaceC10825dMo2980e.mo23284b(interfaceC10825dMo2980e.mo23285c());
                realImageLoader.m2982h().m2991f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            m3298b(activity);
        }
    }

    /* renamed from: coil3.util.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
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
            C5488a c5488a = C5488a.this;
            synchronized (c5488a) {
                if (((RealImageLoader) c5488a.m3295c().get()) == null) {
                    c5488a.m3296d();
                }
                C10786q c10786q = C10786q.f26013a;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            InterfaceC10825d interfaceC10825dMo2980e;
            C5488a c5488a = C5488a.this;
            synchronized (c5488a) {
                try {
                    RealImageLoader realImageLoader = (RealImageLoader) c5488a.m3295c().get();
                    if (realImageLoader != null) {
                        realImageLoader.m2982h().m2991f();
                        if (i10 >= 40) {
                            InterfaceC10825d interfaceC10825dMo2980e2 = realImageLoader.mo2980e();
                            if (interfaceC10825dMo2980e2 != null) {
                                interfaceC10825dMo2980e2.clear();
                            }
                        } else if (i10 >= 20) {
                            c5488a.m3294b().m3297a(realImageLoader.m2982h().m2986a());
                        } else if (i10 >= 10 && (interfaceC10825dMo2980e = realImageLoader.mo2980e()) != null) {
                            interfaceC10825dMo2980e.mo23286e(interfaceC10825dMo2980e.getSize() / 2);
                        }
                    } else {
                        c5488a.m3296d();
                    }
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C5488a(RealImageLoader realImageLoader) {
        this.f3942a = new WeakReference(realImageLoader);
        this.f3943b = new a(realImageLoader);
    }

    @Override // p001a0.InterfaceC0027x
    /* renamed from: a */
    public synchronized void mo58a() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) m3295c().get();
            if (realImageLoader == null) {
                m3296d();
            } else if (this.f3945d == null) {
                Context contextM2986a = realImageLoader.m2982h().m2986a();
                this.f3945d = contextM2986a;
                contextM2986a.registerComponentCallbacks(this.f3944c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final a m3294b() {
        return this.f3943b;
    }

    /* renamed from: c */
    public final WeakReference m3295c() {
        return this.f3942a;
    }

    /* renamed from: d */
    public synchronized void m3296d() {
        try {
            if (this.f3946e) {
                return;
            }
            this.f3946e = true;
            Context context = this.f3945d;
            if (context != null) {
                this.f3943b.m3298b(context);
                context.unregisterComponentCallbacks(this.f3944c);
            }
            this.f3942a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
