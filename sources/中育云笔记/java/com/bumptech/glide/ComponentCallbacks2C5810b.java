package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.engine.C5847f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002a1.C0035f;
import p002a1.InterfaceC0037h;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p212k.AbstractC9764r;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;
import p229l0.InterfaceC10101h;
import p381w0.C11655o;
import p381w0.InterfaceC11643c;
import p397x0.AbstractC11755a;
import p397x0.C11758d;
import p428z0.C11955d;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5810b implements ComponentCallbacks2 {

    /* renamed from: m */
    public static volatile ComponentCallbacks2C5810b f4583m;

    /* renamed from: n */
    public static volatile boolean f4584n;

    /* renamed from: c */
    public final C5847f f4585c;

    /* renamed from: d */
    public final InterfaceC9772d f4586d;

    /* renamed from: e */
    public final InterfaceC10101h f4587e;

    /* renamed from: f */
    public final C5812d f4588f;

    /* renamed from: g */
    public final InterfaceC9770b f4589g;

    /* renamed from: h */
    public final C11655o f4590h;

    /* renamed from: i */
    public final InterfaceC11643c f4591i;

    /* renamed from: k */
    public final a f4593k;

    /* renamed from: j */
    public final List f4592j = new ArrayList();

    /* renamed from: l */
    public MemoryCategory f4594l = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    public interface a {
        C11955d build();
    }

    public ComponentCallbacks2C5810b(Context context, C5847f c5847f, InterfaceC10101h interfaceC10101h, InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b, C11655o c11655o, InterfaceC11643c interfaceC11643c, int i10, a aVar, Map map, List list, List list2, AbstractC11755a abstractC11755a, C5813e c5813e) {
        this.f4585c = c5847f;
        this.f4586d = interfaceC9772d;
        this.f4589g = interfaceC9770b;
        this.f4587e = interfaceC10101h;
        this.f4590h = c11655o;
        this.f4591i = interfaceC11643c;
        this.f4593k = aVar;
        this.f4588f = new C5812d(context, interfaceC9770b, AbstractC5814f.m3979d(this, list2, abstractC11755a), new C0035f(), aVar, map, list, c5847f, c5813e, i10);
    }

    /* renamed from: a */
    public static void m3939a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f4584n) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f4584n = true;
        try {
            m3943m(context, generatedAppGlideModule);
        } finally {
            f4584n = false;
        }
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5810b m3940c(Context context) {
        if (f4583m == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM3941d = m3941d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C5810b.class) {
                try {
                    if (f4583m == null) {
                        m3939a(context, generatedAppGlideModuleM3941d);
                    }
                } finally {
                }
            }
        }
        return f4583m;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m3941d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            m3945q(e10);
            return null;
        } catch (InstantiationException e11) {
            m3945q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            m3945q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            m3945q(e13);
            return null;
        }
    }

    /* renamed from: l */
    public static C11655o m3942l(Context context) {
        AbstractC8909j.m17469e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3940c(context).m3957k();
    }

    /* renamed from: m */
    public static void m3943m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m3944n(context, new C5811c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m3944n(Context context, C5811c c5811c, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listM26018b = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m26013c()) {
            listM26018b = new C11758d(applicationContext).m26018b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m3917d().isEmpty()) {
            generatedAppGlideModule.m3917d();
            Iterator it = listM26018b.iterator();
            if (it.hasNext()) {
                AbstractC9764r.m19682a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM26018b.iterator();
            if (it2.hasNext()) {
                AbstractC9764r.m19682a(it2.next());
                throw null;
            }
        }
        c5811c.m3963b(generatedAppGlideModule != null ? generatedAppGlideModule.m3918e() : null);
        Iterator it3 = listM26018b.iterator();
        if (it3.hasNext()) {
            AbstractC9764r.m19682a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m26012b(applicationContext, c5811c);
        }
        ComponentCallbacks2C5810b componentCallbacks2C5810bM3962a = c5811c.m3962a(applicationContext, listM26018b, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C5810bM3962a);
        f4583m = componentCallbacks2C5810bM3962a;
    }

    /* renamed from: q */
    public static void m3945q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C5816h m3946t(Context context) {
        return m3942l(context).m25775f(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C5816h m3947u(View view) {
        return m3942l(view.getContext()).m25776g(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C5816h m3948v(Fragment fragment) {
        return m3942l(fragment.getContext()).m25777h(fragment);
    }

    /* renamed from: w */
    public static ComponentCallbacks2C5816h m3949w(FragmentActivity fragmentActivity) {
        return m3942l(fragmentActivity).m25778i(fragmentActivity);
    }

    /* renamed from: b */
    public void m3950b() {
        AbstractC8910k.m17470a();
        this.f4587e.m21121b();
        this.f4586d.mo19709b();
        this.f4589g.mo19702b();
    }

    /* renamed from: e */
    public InterfaceC9770b m3951e() {
        return this.f4589g;
    }

    /* renamed from: f */
    public InterfaceC9772d m3952f() {
        return this.f4586d;
    }

    /* renamed from: g */
    public InterfaceC11643c m3953g() {
        return this.f4591i;
    }

    /* renamed from: h */
    public Context m3954h() {
        return this.f4588f.getBaseContext();
    }

    /* renamed from: i */
    public C5812d m3955i() {
        return this.f4588f;
    }

    /* renamed from: j */
    public Registry m3956j() {
        return this.f4588f.m3972i();
    }

    /* renamed from: k */
    public C11655o m3957k() {
        return this.f4590h;
    }

    /* renamed from: o */
    public void m3958o(ComponentCallbacks2C5816h componentCallbacks2C5816h) {
        synchronized (this.f4592j) {
            try {
                if (this.f4592j.contains(componentCallbacks2C5816h)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f4592j.add(componentCallbacks2C5816h);
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
        m3950b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        m3960r(i10);
    }

    /* renamed from: p */
    public boolean m3959p(InterfaceC0037h interfaceC0037h) {
        synchronized (this.f4592j) {
            try {
                Iterator it = this.f4592j.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C5816h) it.next()).m4003A(interfaceC0037h)) {
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
    public void m3960r(int i10) {
        AbstractC8910k.m17470a();
        synchronized (this.f4592j) {
            try {
                Iterator it = this.f4592j.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C5816h) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4587e.mo21115a(i10);
        this.f4586d.mo19708a(i10);
        this.f4589g.mo19701a(i10);
    }

    /* renamed from: s */
    public void m3961s(ComponentCallbacks2C5816h componentCallbacks2C5816h) {
        synchronized (this.f4592j) {
            try {
                if (!this.f4592j.contains(componentCallbacks2C5816h)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f4592j.remove(componentCallbacks2C5816h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
