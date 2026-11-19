package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AbstractC5379p;
import com.bumptech.glide.load.engine.C5428f;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.C0015o;
import p001a0.InterfaceC0003c;
import p020b0.AbstractC5023a;
import p020b0.C5026d;
import p069d0.C8272d;
import p081e0.C8342g;
import p081e0.InterfaceC8344i;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;
import p204p.InterfaceC9631h;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5391b implements ComponentCallbacks2 {

    /* renamed from: k */
    public static volatile ComponentCallbacks2C5391b f2813k;

    /* renamed from: l */
    public static volatile boolean f2814l;

    /* renamed from: a */
    public final C5428f f2815a;

    /* renamed from: b */
    public final InterfaceC9500d f2816b;

    /* renamed from: c */
    public final InterfaceC9631h f2817c;

    /* renamed from: d */
    public final C5393d f2818d;

    /* renamed from: e */
    public final InterfaceC9498b f2819e;

    /* renamed from: f */
    public final C0015o f2820f;

    /* renamed from: g */
    public final InterfaceC0003c f2821g;

    /* renamed from: i */
    public final a f2823i;

    /* renamed from: h */
    public final List f2822h = new ArrayList();

    /* renamed from: j */
    public MemoryCategory f2824j = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    public interface a {
        C8272d build();
    }

    public ComponentCallbacks2C5391b(Context context, C5428f c5428f, InterfaceC9631h interfaceC9631h, InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b, C0015o c0015o, InterfaceC0003c interfaceC0003c, int i10, a aVar, Map map, List list, List list2, AbstractC5023a abstractC5023a, C5394e c5394e) {
        this.f2815a = c5428f;
        this.f2816b = interfaceC9500d;
        this.f2819e = interfaceC9498b;
        this.f2817c = interfaceC9631h;
        this.f2820f = c0015o;
        this.f2821g = interfaceC0003c;
        this.f2823i = aVar;
        this.f2818d = new C5393d(context, interfaceC9498b, AbstractC5395f.m2770d(this, list2, abstractC5023a), new C8342g(), aVar, map, list, c5428f, c5394e, i10);
    }

    /* renamed from: a */
    public static void m2731a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f2814l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f2814l = true;
        try {
            m2735m(context, generatedAppGlideModule);
        } finally {
            f2814l = false;
        }
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5391b m2732c(Context context) {
        if (f2813k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM2733d = m2733d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C5391b.class) {
                try {
                    if (f2813k == null) {
                        m2731a(context, generatedAppGlideModuleM2733d);
                    }
                } finally {
                }
            }
        }
        return f2813k;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m2733d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            m2737q(e10);
            return null;
        } catch (InstantiationException e11) {
            m2737q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            m2737q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            m2737q(e13);
            return null;
        }
    }

    /* renamed from: l */
    public static C0015o m2734l(Context context) {
        AbstractC8706j.m14182e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2732c(context).m2748k();
    }

    /* renamed from: m */
    public static void m2735m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m2736n(context, new C5392c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m2736n(Context context, C5392c c5392c, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listM2068b = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m2063c()) {
            listM2068b = new C5026d(applicationContext).m2068b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m2709d().isEmpty()) {
            generatedAppGlideModule.m2709d();
            Iterator it = listM2068b.iterator();
            if (it.hasNext()) {
                AbstractC5379p.m2596a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM2068b.iterator();
            if (it2.hasNext()) {
                AbstractC5379p.m2596a(it2.next());
                throw null;
            }
        }
        c5392c.m2754b(generatedAppGlideModule != null ? generatedAppGlideModule.m2710e() : null);
        Iterator it3 = listM2068b.iterator();
        if (it3.hasNext()) {
            AbstractC5379p.m2596a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m2062b(applicationContext, c5392c);
        }
        ComponentCallbacks2C5391b componentCallbacks2C5391bM2753a = c5392c.m2753a(applicationContext, listM2068b, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C5391bM2753a);
        f2813k = componentCallbacks2C5391bM2753a;
    }

    /* renamed from: q */
    public static void m2737q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C5397h m2738t(Context context) {
        return m2734l(context).m18f(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C5397h m2739u(View view) {
        return m2734l(view.getContext()).m19g(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C5397h m2740v(Fragment fragment) {
        return m2734l(fragment.getContext()).m20h(fragment);
    }

    /* renamed from: b */
    public void m2741b() {
        AbstractC8707k.m14183a();
        this.f2817c.m18184a();
        this.f2816b.mo17619a();
        this.f2819e.mo17613a();
    }

    /* renamed from: e */
    public InterfaceC9498b m2742e() {
        return this.f2819e;
    }

    /* renamed from: f */
    public InterfaceC9500d m2743f() {
        return this.f2816b;
    }

    /* renamed from: g */
    public InterfaceC0003c m2744g() {
        return this.f2821g;
    }

    /* renamed from: h */
    public Context m2745h() {
        return this.f2818d.getBaseContext();
    }

    /* renamed from: i */
    public C5393d m2746i() {
        return this.f2818d;
    }

    /* renamed from: j */
    public Registry m2747j() {
        return this.f2818d.m2763i();
    }

    /* renamed from: k */
    public C0015o m2748k() {
        return this.f2820f;
    }

    /* renamed from: o */
    public void m2749o(ComponentCallbacks2C5397h componentCallbacks2C5397h) {
        synchronized (this.f2822h) {
            try {
                if (this.f2822h.contains(componentCallbacks2C5397h)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f2822h.add(componentCallbacks2C5397h);
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
        m2741b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        m2751r(i10);
    }

    /* renamed from: p */
    public boolean m2750p(InterfaceC8344i interfaceC8344i) {
        synchronized (this.f2822h) {
            try {
                Iterator it = this.f2822h.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C5397h) it.next()).m2795B(interfaceC8344i)) {
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
    public void m2751r(int i10) {
        AbstractC8707k.m14183a();
        synchronized (this.f2822h) {
            try {
                Iterator it = this.f2822h.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C5397h) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2817c.trimMemory(i10);
        this.f2816b.trimMemory(i10);
        this.f2819e.trimMemory(i10);
    }

    /* renamed from: s */
    public void m2752s(ComponentCallbacks2C5397h componentCallbacks2C5397h) {
        synchronized (this.f2822h) {
            try {
                if (!this.f2822h.contains(componentCallbacks2C5397h)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f2822h.remove(componentCallbacks2C5397h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
