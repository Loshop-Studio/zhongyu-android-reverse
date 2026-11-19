package coil3.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil3.RealImageLoader;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p090e0.InterfaceC7825w;
import p247t.InterfaceC9595d;

/* renamed from: coil3.util.a */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C5346a implements InterfaceC7825w, ComponentCallbacks2 {

    /* renamed from: d */
    public static final a f3153d = new a(null);

    /* renamed from: a */
    public final WeakReference f3154a;

    /* renamed from: b */
    public Context f3155b;

    /* renamed from: c */
    public boolean f3156c;

    /* renamed from: coil3.util.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public ComponentCallbacks2C5346a(RealImageLoader realImageLoader) {
        this.f3154a = new WeakReference(realImageLoader);
    }

    @Override // p090e0.InterfaceC7825w
    /* renamed from: a */
    public synchronized void mo2920a() {
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f3154a.get();
            if (realImageLoader == null) {
                m2921b();
            } else if (this.f3155b == null) {
                Context contextM2556a = realImageLoader.m2552i().m2556a();
                this.f3155b = contextM2556a;
                contextM2556a.registerComponentCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m2921b() {
        try {
            if (this.f3156c) {
                return;
            }
            this.f3156c = true;
            Context context = this.f3155b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f3154a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.f3154a.get()) == null) {
            m2921b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int i9) {
        InterfaceC9595d interfaceC9595dMo2550f;
        try {
            RealImageLoader realImageLoader = (RealImageLoader) this.f3154a.get();
            if (realImageLoader != null) {
                realImageLoader.m2552i().m2561f();
                if (i9 >= 40) {
                    InterfaceC9595d interfaceC9595dMo2550f2 = realImageLoader.mo2550f();
                    if (interfaceC9595dMo2550f2 != null) {
                        interfaceC9595dMo2550f2.clear();
                    }
                } else if (i9 >= 10 && (interfaceC9595dMo2550f = realImageLoader.mo2550f()) != null) {
                    interfaceC9595dMo2550f.mo15795d(interfaceC9595dMo2550f.getSize() / 2);
                }
            } else {
                m2921b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
