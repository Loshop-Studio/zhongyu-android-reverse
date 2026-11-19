package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.C5379f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p020b1.C4956o;
import p020b1.InterfaceC4944c;
import p031c1.AbstractC5102a;
import p031c1.C5105d;
import p073e1.C7327d;
import p084f1.C7429f;
import p084f1.InterfaceC7431h;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p137k.AbstractC7846r;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;
import p206q0.InterfaceC8873h;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5342b implements ComponentCallbacks2 {

    /* renamed from: k */
    public static volatile ComponentCallbacks2C5342b f3380k;

    /* renamed from: l */
    public static volatile boolean f3381l;

    /* renamed from: a */
    public final C5379f f3382a;

    /* renamed from: b */
    public final InterfaceC8804d f3383b;

    /* renamed from: c */
    public final InterfaceC8873h f3384c;

    /* renamed from: d */
    public final C5344d f3385d;

    /* renamed from: e */
    public final InterfaceC8802b f3386e;

    /* renamed from: f */
    public final C4956o f3387f;

    /* renamed from: g */
    public final InterfaceC4944c f3388g;

    /* renamed from: i */
    public final a f3390i;

    /* renamed from: h */
    public final List f3389h = new ArrayList();

    /* renamed from: j */
    public MemoryCategory f3391j = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    public interface a {
        C7327d build();
    }

    public ComponentCallbacks2C5342b(Context context, C5379f c5379f, InterfaceC8873h interfaceC8873h, InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b, C4956o c4956o, InterfaceC4944c interfaceC4944c, int i10, a aVar, Map map, List list, List list2, AbstractC5102a abstractC5102a, C5345e c5345e) {
        this.f3382a = c5379f;
        this.f3383b = interfaceC8804d;
        this.f3386e = interfaceC8802b;
        this.f3384c = interfaceC8873h;
        this.f3387f = c4956o;
        this.f3388g = interfaceC4944c;
        this.f3390i = aVar;
        this.f3385d = new C5344d(context, interfaceC8802b, AbstractC5346f.m3329d(this, list2, abstractC5102a), new C7429f(), aVar, map, list, c5379f, c5345e, i10);
    }

    /* renamed from: a */
    public static void m3290a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f3381l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f3381l = true;
        try {
            m3294m(context, generatedAppGlideModule);
        } finally {
            f3381l = false;
        }
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5342b m3291c(Context context) {
        if (f3380k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM3292d = m3292d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C5342b.class) {
                try {
                    if (f3380k == null) {
                        m3290a(context, generatedAppGlideModuleM3292d);
                    }
                } finally {
                }
            }
        }
        return f3380k;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m3292d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            m3296q(e10);
            return null;
        } catch (InstantiationException e11) {
            m3296q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            m3296q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            m3296q(e13);
            return null;
        }
    }

    /* renamed from: l */
    public static C4956o m3293l(Context context) {
        AbstractC7651j.m12684e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3291c(context).m3307k();
    }

    /* renamed from: m */
    public static void m3294m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m3295n(context, new C5343c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m3295n(Context context, C5343c c5343c, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listM2725b = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m2720c()) {
            listM2725b = new C5105d(applicationContext).m2725b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m3268d().isEmpty()) {
            generatedAppGlideModule.m3268d();
            Iterator it = listM2725b.iterator();
            if (it.hasNext()) {
                AbstractC7846r.m13306a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM2725b.iterator();
            if (it2.hasNext()) {
                AbstractC7846r.m13306a(it2.next());
                throw null;
            }
        }
        c5343c.m3313b(generatedAppGlideModule != null ? generatedAppGlideModule.m3269e() : null);
        Iterator it3 = listM2725b.iterator();
        if (it3.hasNext()) {
            AbstractC7846r.m13306a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m2719b(applicationContext, c5343c);
        }
        ComponentCallbacks2C5342b componentCallbacks2C5342bM3312a = c5343c.m3312a(applicationContext, listM2725b, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C5342bM3312a);
        f3380k = componentCallbacks2C5342bM3312a;
    }

    /* renamed from: q */
    public static void m3296q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C5348h m3297t(Context context) {
        return m3293l(context).m2346f(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C5348h m3298u(View view) {
        return m3293l(view.getContext()).m2347g(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C5348h m3299v(Fragment fragment) {
        return m3293l(fragment.getContext()).m2348h(fragment);
    }

    /* renamed from: b */
    public void m3300b() {
        AbstractC7652k.m12685a();
        this.f3384c.m14883b();
        this.f3383b.mo14711b();
        this.f3386e.mo14704b();
    }

    /* renamed from: e */
    public InterfaceC8802b m3301e() {
        return this.f3386e;
    }

    /* renamed from: f */
    public InterfaceC8804d m3302f() {
        return this.f3383b;
    }

    /* renamed from: g */
    public InterfaceC4944c m3303g() {
        return this.f3388g;
    }

    /* renamed from: h */
    public Context m3304h() {
        return this.f3385d.getBaseContext();
    }

    /* renamed from: i */
    public C5344d m3305i() {
        return this.f3385d;
    }

    /* renamed from: j */
    public Registry m3306j() {
        return this.f3385d.m3322i();
    }

    /* renamed from: k */
    public C4956o m3307k() {
        return this.f3387f;
    }

    /* renamed from: o */
    public void m3308o(ComponentCallbacks2C5348h componentCallbacks2C5348h) {
        synchronized (this.f3389h) {
            try {
                if (this.f3389h.contains(componentCallbacks2C5348h)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f3389h.add(componentCallbacks2C5348h);
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
        m3300b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        m3310r(i10);
    }

    /* renamed from: p */
    public boolean m3309p(InterfaceC7431h interfaceC7431h) {
        synchronized (this.f3389h) {
            try {
                Iterator it = this.f3389h.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C5348h) it.next()).m3370z(interfaceC7431h)) {
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
    public void m3310r(int i10) {
        AbstractC7652k.m12685a();
        synchronized (this.f3389h) {
            try {
                Iterator it = this.f3389h.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C5348h) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3384c.mo14877a(i10);
        this.f3383b.mo14710a(i10);
        this.f3386e.mo14703a(i10);
    }

    /* renamed from: s */
    public void m3311s(ComponentCallbacks2C5348h componentCallbacks2C5348h) {
        synchronized (this.f3389h) {
            try {
                if (!this.f3389h.contains(componentCallbacks2C5348h)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f3389h.remove(componentCallbacks2C5348h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
