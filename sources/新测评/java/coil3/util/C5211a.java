package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.AbstractC5195g;
import coil3.RealImageLoader;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p030c0.InterfaceC5081f;
import p030c0.InterfaceC5099x;
import p238t.InterfaceC9363d;

/* renamed from: coil3.util.a */
/* loaded from: classes3.dex */
public final class C5211a implements InterfaceC5099x {

    /* renamed from: f */
    public static final b f3266f = new b(null);

    /* renamed from: a */
    public final WeakReference f3267a;

    /* renamed from: b */
    public final a f3268b;

    /* renamed from: c */
    public final c f3269c = new c();

    /* renamed from: d */
    public Context f3270d;

    /* renamed from: e */
    public boolean f3271e;

    /* renamed from: coil3.util.a$a */
    public final class a implements InterfaceC5081f {

        /* renamed from: a */
        public final double f3272a;

        public a(RealImageLoader realImageLoader) {
            this.f3272a = AbstractC5195g.m3065d(realImageLoader.m2823i());
        }

        /* renamed from: a */
        public final void m3203a(Context context) {
            if (this.f3272a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            C5211a c5211a = C5211a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c5211a.m3201c().get();
            if (realImageLoader == null) {
                c5211a.m3202d();
                return;
            }
            InterfaceC9363d interfaceC9363dMo2821f = realImageLoader.mo2821f();
            if (interfaceC9363dMo2821f != null) {
                interfaceC9363dMo2821f.mo15621b((long) (this.f3272a * interfaceC9363dMo2821f.mo15622d()));
                realImageLoader.m2823i().m2832f();
            }
        }

        /* renamed from: b */
        public final void m3204b(Context context) {
            if (this.f3272a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            C5211a c5211a = C5211a.this;
            RealImageLoader realImageLoader = (RealImageLoader) c5211a.m3201c().get();
            if (realImageLoader == null) {
                c5211a.m3202d();
                return;
            }
            InterfaceC9363d interfaceC9363dMo2821f = realImageLoader.mo2821f();
            if (interfaceC9363dMo2821f != null) {
                interfaceC9363dMo2821f.mo15621b(interfaceC9363dMo2821f.mo15622d());
                realImageLoader.m2823i().m2832f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            m3204b(activity);
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
            C5211a c5211a = C5211a.this;
            synchronized (c5211a) {
                if (((RealImageLoader) c5211a.m3201c().get()) == null) {
                    c5211a.m3202d();
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            InterfaceC9363d interfaceC9363dMo2821f;
            C5211a c5211a = C5211a.this;
            synchronized (c5211a) {
                try {
                    RealImageLoader realImageLoader = (RealImageLoader) c5211a.m3201c().get();
                    if (realImageLoader != null) {
                        realImageLoader.m2823i().m2832f();
                        if (i10 >= 40) {
                            InterfaceC9363d interfaceC9363dMo2821f2 = realImageLoader.mo2821f();
                            if (interfaceC9363dMo2821f2 != null) {
                                interfaceC9363dMo2821f2.clear();
                            }
                        } else if (i10 >= 20) {
                            c5211a.m3200b().m3203a(realImageLoader.m2823i().m2827a());
                        } else if (i10 >= 10 && (interfaceC9363dMo2821f = realImageLoader.mo2821f()) != null) {
                            interfaceC9363dMo2821f.mo15623f(interfaceC9363dMo2821f.getSize() / 2);
                        }
                    } else {
                        c5211a.m3202d();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C5211a(RealImageLoader realImageLoader) {
        this.f3267a = new WeakReference(realImageLoader);
        this.f3268b = new a(realImageLoader);
    }

    @Override // p030c0.InterfaceC5099x
    /* renamed from: a */
    public synchronized void mo2717a() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) m3201c().get();
            if (realImageLoader == null) {
                m3202d();
            } else if (this.f3270d == null) {
                Context contextM2827a = realImageLoader.m2823i().m2827a();
                this.f3270d = contextM2827a;
                contextM2827a.registerComponentCallbacks(this.f3269c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final a m3200b() {
        return this.f3268b;
    }

    /* renamed from: c */
    public final WeakReference m3201c() {
        return this.f3267a;
    }

    /* renamed from: d */
    public synchronized void m3202d() {
        try {
            if (this.f3271e) {
                return;
            }
            this.f3271e = true;
            Context context = this.f3270d;
            if (context != null) {
                this.f3268b.m3204b(context);
                context.unregisterComponentCallbacks(this.f3269c);
            }
            this.f3267a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
