package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.C5490f;
import com.bumptech.glide.load.resource.bitmap.C5505a;
import com.bumptech.glide.load.resource.bitmap.C5507c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002a1.C0012d;
import p019b1.C5095f;
import p019b1.InterfaceC5097h;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p112g0.InterfaceC7983a;
import p122h0.InterfaceC8085e;
import p132i0.C8122k;
import p132i0.C8124m;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;
import p174m0.InterfaceC8946h;
import p194o0.C9134a;
import p194o0.C9135b;
import p194o0.C9136c;
import p194o0.C9137d;
import p194o0.C9138e;
import p194o0.C9139f;
import p194o0.C9140g;
import p194o0.C9144k;
import p194o0.C9151r;
import p194o0.C9152s;
import p194o0.C9153t;
import p194o0.C9154u;
import p194o0.C9155v;
import p194o0.C9156w;
import p208p0.C9304a;
import p208p0.C9305b;
import p208p0.C9306c;
import p208p0.C9307d;
import p208p0.C9308e;
import p208p0.C9311h;
import p217q.AbstractC9343a;
import p228r0.C9390a;
import p228r0.C9391a0;
import p228r0.C9392b;
import p228r0.C9393c;
import p228r0.C9397g;
import p228r0.C9398h;
import p228r0.C9407q;
import p228r0.C9410t;
import p228r0.C9412v;
import p228r0.C9413w;
import p228r0.C9415y;
import p238s0.C9463a;
import p248t0.C9605d;
import p248t0.C9606e;
import p258u0.C9657a;
import p268v0.C9740a;
import p268v0.C9742c;
import p268v0.C9745f;
import p268v0.C9747h;
import p278w0.C9789a;
import p278w0.C9790b;
import p278w0.C9791c;
import p278w0.C9792d;
import p288x0.C9860m;
import p288x0.InterfaceC9851d;
import p298y0.C9942d;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5471b implements ComponentCallbacks2 {

    /* renamed from: l */
    public static volatile ComponentCallbacks2C5471b f3215l;

    /* renamed from: m */
    public static volatile boolean f3216m;

    /* renamed from: a */
    public final C5490f f3217a;

    /* renamed from: b */
    public final InterfaceC8867d f3218b;

    /* renamed from: c */
    public final InterfaceC8946h f3219c;

    /* renamed from: d */
    public final C5473d f3220d;

    /* renamed from: e */
    public final Registry f3221e;

    /* renamed from: f */
    public final InterfaceC8865b f3222f;

    /* renamed from: g */
    public final C9860m f3223g;

    /* renamed from: h */
    public final InterfaceC9851d f3224h;

    /* renamed from: j */
    public final a f3226j;

    /* renamed from: i */
    public final List f3225i = new ArrayList();

    /* renamed from: k */
    public MemoryCategory f3227k = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.b$a */
    public interface a {
        C0012d build();
    }

    public ComponentCallbacks2C5471b(Context context, C5490f c5490f, InterfaceC8946h interfaceC8946h, InterfaceC8867d interfaceC8867d, InterfaceC8865b interfaceC8865b, C9860m c9860m, InterfaceC9851d interfaceC9851d, int i9, a aVar, Map map, List list, boolean z9, boolean z10) {
        InterfaceC8085e c9397g;
        InterfaceC8085e c5507c;
        Registry registry;
        this.f3217a = c5490f;
        this.f3218b = interfaceC8867d;
        this.f3222f = interfaceC8865b;
        this.f3219c = interfaceC8946h;
        this.f3223g = c9860m;
        this.f3224h = interfaceC9851d;
        this.f3226j = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f3221e = registry2;
        registry2.m3001o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry2.m3001o(new C9407q());
        }
        List listM2993g = registry2.m2993g();
        C9740a c9740a = new C9740a(context, listM2993g, interfaceC8867d, interfaceC8865b);
        InterfaceC8085e interfaceC8085eM15453h = C9391a0.m15453h(interfaceC8867d);
        C5505a c5505a = new C5505a(registry2.m2993g(), resources.getDisplayMetrics(), interfaceC8867d, interfaceC8865b);
        if (!z10 || i10 < 28) {
            c9397g = new C9397g(c5505a);
            c5507c = new C5507c(c5505a, interfaceC8865b);
        } else {
            c5507c = new C9410t();
            c9397g = new C9398h();
        }
        C9605d c9605d = new C9605d(context);
        C9151r.c cVar = new C9151r.c(resources);
        C9151r.d dVar = new C9151r.d(resources);
        C9151r.b bVar = new C9151r.b(resources);
        C9151r.a aVar2 = new C9151r.a(resources);
        C9393c c9393c = new C9393c(interfaceC8865b);
        C9789a c9789a = new C9789a();
        C9792d c9792d = new C9792d();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.m2987a(ByteBuffer.class, new C9136c()).m2987a(InputStream.class, new C9152s(interfaceC8865b)).m2991e("Bitmap", ByteBuffer.class, Bitmap.class, c9397g).m2991e("Bitmap", InputStream.class, Bitmap.class, c5507c);
        if (C8124m.m13009c()) {
            registry2.m2991e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C9412v(c5505a));
        }
        registry2.m2991e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC8085eM15453h).m2991e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C9391a0.m15448c(interfaceC8867d)).m2990d(Bitmap.class, Bitmap.class, C9154u.a.m14731a()).m2991e("Bitmap", Bitmap.class, Bitmap.class, new C9415y()).m2988b(Bitmap.class, c9393c).m2991e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C9390a(resources, c9397g)).m2991e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C9390a(resources, c5507c)).m2991e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C9390a(resources, interfaceC8085eM15453h)).m2988b(BitmapDrawable.class, new C9392b(interfaceC8867d, c9393c)).m2991e("Gif", InputStream.class, GifDrawable.class, new C9747h(listM2993g, c9740a, interfaceC8865b)).m2991e("Gif", ByteBuffer.class, GifDrawable.class, c9740a).m2988b(GifDrawable.class, new C9742c()).m2990d(InterfaceC7983a.class, InterfaceC7983a.class, C9154u.a.m14731a()).m2991e("Bitmap", InterfaceC7983a.class, Bitmap.class, new C9745f(interfaceC8867d)).m2989c(Uri.class, Drawable.class, c9605d).m2989c(Uri.class, Bitmap.class, new C9413w(c9605d, interfaceC8867d)).m3002p(new C9463a.a()).m2990d(File.class, ByteBuffer.class, new C9137d.b()).m2990d(File.class, InputStream.class, new C9139f.e()).m2989c(File.class, File.class, new C9657a()).m2990d(File.class, ParcelFileDescriptor.class, new C9139f.b()).m2990d(File.class, File.class, C9154u.a.m14731a()).m3002p(new C8122k.a(interfaceC8865b));
        if (C8124m.m13009c()) {
            registry = registry2;
            registry.m3002p(new C8124m.a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.m2990d(cls, InputStream.class, cVar).m2990d(cls, ParcelFileDescriptor.class, bVar).m2990d(Integer.class, InputStream.class, cVar).m2990d(Integer.class, ParcelFileDescriptor.class, bVar).m2990d(Integer.class, Uri.class, dVar).m2990d(cls, AssetFileDescriptor.class, aVar2).m2990d(Integer.class, AssetFileDescriptor.class, aVar2).m2990d(cls, Uri.class, dVar).m2990d(String.class, InputStream.class, new C9138e.c()).m2990d(Uri.class, InputStream.class, new C9138e.c()).m2990d(String.class, InputStream.class, new C9153t.c()).m2990d(String.class, ParcelFileDescriptor.class, new C9153t.b()).m2990d(String.class, AssetFileDescriptor.class, new C9153t.a()).m2990d(Uri.class, InputStream.class, new C9305b.a()).m2990d(Uri.class, InputStream.class, new C9134a.c(context.getAssets())).m2990d(Uri.class, ParcelFileDescriptor.class, new C9134a.b(context.getAssets())).m2990d(Uri.class, InputStream.class, new C9306c.a(context)).m2990d(Uri.class, InputStream.class, new C9307d.a(context));
        if (i10 >= 29) {
            registry.m2990d(Uri.class, InputStream.class, new C9308e.c(context));
            registry.m2990d(Uri.class, ParcelFileDescriptor.class, new C9308e.b(context));
        }
        registry.m2990d(Uri.class, InputStream.class, new C9155v.d(contentResolver)).m2990d(Uri.class, ParcelFileDescriptor.class, new C9155v.b(contentResolver)).m2990d(Uri.class, AssetFileDescriptor.class, new C9155v.a(contentResolver)).m2990d(Uri.class, InputStream.class, new C9156w.a()).m2990d(URL.class, InputStream.class, new C9311h.a()).m2990d(Uri.class, File.class, new C9144k.a(context)).m2990d(C9140g.class, InputStream.class, new C9304a.a()).m2990d(byte[].class, ByteBuffer.class, new C9135b.a()).m2990d(byte[].class, InputStream.class, new C9135b.d()).m2990d(Uri.class, Uri.class, C9154u.a.m14731a()).m2990d(Drawable.class, Drawable.class, C9154u.a.m14731a()).m2989c(Drawable.class, Drawable.class, new C9606e()).m3003q(Bitmap.class, BitmapDrawable.class, new C9790b(resources)).m3003q(Bitmap.class, byte[].class, c9789a).m3003q(Drawable.class, byte[].class, new C9791c(interfaceC8867d, c9789a, c9792d)).m3003q(GifDrawable.class, byte[].class, c9792d);
        InterfaceC8085e interfaceC8085eM15449d = C9391a0.m15449d(interfaceC8867d);
        registry.m2989c(ByteBuffer.class, Bitmap.class, interfaceC8085eM15449d);
        registry.m2989c(ByteBuffer.class, BitmapDrawable.class, new C9390a(resources, interfaceC8085eM15449d));
        this.f3220d = new C5473d(context, interfaceC8865b, registry, new C5095f(), aVar, map, list, c5490f, z9, i9);
    }

    /* renamed from: a */
    public static void m3005a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (f3216m) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3216m = true;
        m3009m(context, generatedAppGlideModule);
        f3216m = false;
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5471b m3006c(Context context) {
        if (f3215l == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM3007d = m3007d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C5471b.class) {
                try {
                    if (f3215l == null) {
                        m3005a(context, generatedAppGlideModuleM3007d);
                    }
                } finally {
                }
            }
        }
        return f3215l;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m3007d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            m3011q(e10);
            return null;
        } catch (InstantiationException e11) {
            m3011q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            m3011q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            m3011q(e13);
            return null;
        }
    }

    /* renamed from: l */
    public static C9860m m3008l(Context context) {
        AbstractC7837i.m12257e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3006c(context).m3022k();
    }

    /* renamed from: m */
    public static void m3009m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m3010n(context, new C5472c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m3010n(Context context, C5472c c5472c, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listM17128a = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m17124c()) {
            listM17128a = new C9942d(applicationContext).m17128a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m2985d().isEmpty()) {
            generatedAppGlideModule.m2985d();
            Iterator it = listM17128a.iterator();
            if (it.hasNext()) {
                AbstractC9343a.m15285a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listM17128a.iterator();
            if (it2.hasNext()) {
                AbstractC9343a.m15285a(it2.next());
                throw null;
            }
        }
        c5472c.m3028b(generatedAppGlideModule != null ? generatedAppGlideModule.m2986e() : null);
        Iterator it3 = listM17128a.iterator();
        if (it3.hasNext()) {
            AbstractC9343a.m15285a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m17123b(applicationContext, c5472c);
        }
        ComponentCallbacks2C5471b componentCallbacks2C5471bM3027a = c5472c.m3027a(applicationContext);
        Iterator it4 = listM17128a.iterator();
        if (it4.hasNext()) {
            AbstractC9343a.m15285a(it4.next());
            try {
                Registry registry = componentCallbacks2C5471bM3027a.f3221e;
                throw null;
            } catch (AbstractMethodError unused) {
                new StringBuilder().append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                throw null;
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m17125a(applicationContext, componentCallbacks2C5471bM3027a, componentCallbacks2C5471bM3027a.f3221e);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C5471bM3027a);
        f3215l = componentCallbacks2C5471bM3027a;
    }

    /* renamed from: q */
    public static void m3011q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C5475f m3012t(Context context) {
        return m3008l(context).m16819k(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C5475f m3013u(View view) {
        return m3008l(view.getContext()).m16820l(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C5475f m3014v(Fragment fragment) {
        return m3008l(fragment.getContext()).m16821m(fragment);
    }

    /* renamed from: b */
    public void m3015b() {
        AbstractC7838j.m12258a();
        this.f3219c.m14265b();
        this.f3218b.mo13731b();
        this.f3222f.mo13724b();
    }

    /* renamed from: e */
    public InterfaceC8865b m3016e() {
        return this.f3222f;
    }

    /* renamed from: f */
    public InterfaceC8867d m3017f() {
        return this.f3218b;
    }

    /* renamed from: g */
    public InterfaceC9851d m3018g() {
        return this.f3224h;
    }

    /* renamed from: h */
    public Context m3019h() {
        return this.f3220d.getBaseContext();
    }

    /* renamed from: i */
    public C5473d m3020i() {
        return this.f3220d;
    }

    /* renamed from: j */
    public Registry m3021j() {
        return this.f3221e;
    }

    /* renamed from: k */
    public C9860m m3022k() {
        return this.f3223g;
    }

    /* renamed from: o */
    public void m3023o(ComponentCallbacks2C5475f componentCallbacks2C5475f) {
        synchronized (this.f3225i) {
            try {
                if (this.f3225i.contains(componentCallbacks2C5475f)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f3225i.add(componentCallbacks2C5475f);
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
        m3015b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i9) {
        m3025r(i9);
    }

    /* renamed from: p */
    public boolean m3024p(InterfaceC5097h interfaceC5097h) {
        synchronized (this.f3225i) {
            try {
                Iterator it = this.f3225i.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C5475f) it.next()).m3073y(interfaceC5097h)) {
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
    public void m3025r(int i9) {
        AbstractC7838j.m12258a();
        Iterator it = this.f3225i.iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C5475f) it.next()).onTrimMemory(i9);
        }
        this.f3219c.mo14259a(i9);
        this.f3218b.mo13730a(i9);
        this.f3222f.mo13723a(i9);
    }

    /* renamed from: s */
    public void m3026s(ComponentCallbacks2C5475f componentCallbacks2C5475f) {
        synchronized (this.f3225i) {
            try {
                if (!this.f3225i.contains(componentCallbacks2C5475f)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f3225i.remove(componentCallbacks2C5475f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
