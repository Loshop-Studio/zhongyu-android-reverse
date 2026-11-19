package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.C4715f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;
import p081j0.InterfaceC6580h;
import p087k.AbstractC6619r;
import p160u0.C7762o;
import p160u0.InterfaceC7750c;
import p167v0.AbstractC7785a;
import p167v0.C7788d;
import p181x0.C7826d;
import p188y0.C7892f;
import p188y0.InterfaceC7894h;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C4678c implements ComponentCallbacks2 {

    /* renamed from: k */
    public static volatile ComponentCallbacks2C4678c f2171k;

    /* renamed from: l */
    public static volatile boolean f2172l;

    /* renamed from: a */
    public final C4715f f2173a;

    /* renamed from: b */
    public final InterfaceC6499d f2174b;

    /* renamed from: c */
    public final InterfaceC6580h f2175c;

    /* renamed from: d */
    public final C4680e f2176d;

    /* renamed from: e */
    public final InterfaceC6497b f2177e;

    /* renamed from: f */
    public final C7762o f2178f;

    /* renamed from: g */
    public final InterfaceC7750c f2179g;

    /* renamed from: i */
    public final a f2181i;

    /* renamed from: h */
    public final List f2180h = new ArrayList();

    /* renamed from: j */
    public MemoryCategory f2182j = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.c$a */
    public interface a {
        C7826d build();
    }

    public ComponentCallbacks2C4678c(Context context, C4715f c4715f, InterfaceC6580h interfaceC6580h, InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b, C7762o c7762o, InterfaceC7750c interfaceC7750c, int i6, a aVar, Map map, List list, List list2, AbstractC7785a abstractC7785a, C4681f c4681f) {
        this.f2173a = c4715f;
        this.f2174b = interfaceC6499d;
        this.f2177e = interfaceC6497b;
        this.f2175c = interfaceC6580h;
        this.f2178f = c7762o;
        this.f2179g = interfaceC7750c;
        this.f2181i = aVar;
        this.f2176d = new C4680e(context, interfaceC6497b, AbstractC4682g.m2508d(this, list2, abstractC7785a), new C7892f(), aVar, map, list, c4715f, c4681f, i6);
    }

    /* renamed from: a */
    public static void m2469a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f2172l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f2172l = true;
        try {
            m2473m(context, generatedAppGlideModule);
        } finally {
            f2172l = false;
        }
    }

    /* renamed from: c */
    public static ComponentCallbacks2C4678c m2470c(Context context) {
        if (f2171k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM2471d = m2471d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C4678c.class) {
                try {
                    if (f2171k == null) {
                        m2469a(context, generatedAppGlideModuleM2471d);
                    }
                } finally {
                }
            }
        }
        return f2171k;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m2471d(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e6) {
            m2475q(e6);
            return null;
        } catch (InstantiationException e7) {
            m2475q(e7);
            return null;
        } catch (NoSuchMethodException e8) {
            m2475q(e8);
            return null;
        } catch (InvocationTargetException e9) {
            m2475q(e9);
            return null;
        }
    }

    /* renamed from: l */
    public static C7762o m2472l(Context context) {
        AbstractC4408j.m1439e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2470c(context).m2486k();
    }

    /* renamed from: m */
    public static void m2473m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m2474n(context, new C4679d(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m2474n(Context context, C4679d c4679d, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listM9324b = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo2446c()) {
            listM9324b = new C7788d(applicationContext).m9324b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo2442d().isEmpty()) {
            generatedAppGlideModule.mo2442d();
            Iterator it = listM9324b.iterator();
            if (it.hasNext()) {
                AbstractC6619r.m7572a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM9324b.iterator();
            if (it2.hasNext()) {
                AbstractC6619r.m7572a(it2.next());
                throw null;
            }
        }
        c4679d.m2492b(generatedAppGlideModule != null ? generatedAppGlideModule.mo2443e() : null);
        Iterator it3 = listM9324b.iterator();
        if (it3.hasNext()) {
            AbstractC6619r.m7572a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo2445b(applicationContext, c4679d);
        }
        ComponentCallbacks2C4678c componentCallbacks2C4678cM2491a = c4679d.m2491a(applicationContext, listM9324b, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C4678cM2491a);
        f2171k = componentCallbacks2C4678cM2491a;
    }

    /* renamed from: q */
    public static void m2475q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C4684i m2476t(Context context) {
        return m2472l(context).m9274f(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C4684i m2477u(View view) {
        return m2472l(view.getContext()).m9275g(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C4684i m2478v(Fragment fragment) {
        return m2472l(fragment.getContext()).m9276h(fragment);
    }

    /* renamed from: b */
    public void m2479b() {
        AbstractC4409k.m1440a();
        this.f2175c.m7454b();
        this.f2174b.mo7196b();
        this.f2177e.mo7189b();
    }

    /* renamed from: e */
    public InterfaceC6497b m2480e() {
        return this.f2177e;
    }

    /* renamed from: f */
    public InterfaceC6499d m2481f() {
        return this.f2174b;
    }

    /* renamed from: g */
    public InterfaceC7750c m2482g() {
        return this.f2179g;
    }

    /* renamed from: h */
    public Context m2483h() {
        return this.f2176d.getBaseContext();
    }

    /* renamed from: i */
    public C4680e m2484i() {
        return this.f2176d;
    }

    /* renamed from: j */
    public Registry m2485j() {
        return this.f2176d.m2501i();
    }

    /* renamed from: k */
    public C7762o m2486k() {
        return this.f2178f;
    }

    /* renamed from: o */
    public void m2487o(ComponentCallbacks2C4684i componentCallbacks2C4684i) {
        synchronized (this.f2180h) {
            try {
                if (this.f2180h.contains(componentCallbacks2C4684i)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f2180h.add(componentCallbacks2C4684i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m2479b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        m2489r(i6);
    }

    /* renamed from: p */
    public boolean m2488p(InterfaceC7894h interfaceC7894h) {
        synchronized (this.f2180h) {
            try {
                Iterator it = this.f2180h.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C4684i) it.next()).m2531A(interfaceC7894h)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r */
    public void m2489r(int i6) {
        AbstractC4409k.m1440a();
        synchronized (this.f2180h) {
            try {
                Iterator it = this.f2180h.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C4684i) it.next()).onTrimMemory(i6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2175c.mo7448a(i6);
        this.f2174b.mo7195a(i6);
        this.f2177e.mo7188a(i6);
    }

    /* renamed from: s */
    public void m2490s(ComponentCallbacks2C4684i componentCallbacks2C4684i) {
        synchronized (this.f2180h) {
            try {
                if (!this.f2180h.contains(componentCallbacks2C4684i)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f2180h.remove(componentCallbacks2C4684i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
