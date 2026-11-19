package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.C0039h;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.engine.C3417c;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import io.reactivex.internal.operators.observable.C5707c;
import io.reactivex.internal.operators.observable.C5711g;
import io.reactivex.internal.operators.observable.C5712h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C5834o;
import p016b0.C3071g;
import p024c0.C3210g;
import p024c0.C3211h;
import p024c0.InterfaceC3205b;
import p032c8.C3238c;
import p039d0.C5402e;
import p039d0.C5403f;
import p039d0.C5404g;
import p039d0.C5405h;
import p041d2.C5413c;
import p048e0.ExecutorServiceC5452b;
import p048e0.ThreadFactoryC5451a;
import p055f0.C5491a;
import p055f0.C5492a0;
import p055f0.C5496c0;
import p055f0.C5499e;
import p055f0.C5501f;
import p055f0.C5520y;
import p062g0.C5538c;
import p077i0.C5645a;
import p077i0.C5646b;
import p077i0.C5649e;
import p077i0.C5654j;
import p077i0.C5657m;
import p077i0.C5661q;
import p077i0.C5667w;
import p077i0.C5670z;
import p086j0.C5731a;
import p094k0.C5751b;
import p111m0.C6078a;
import p111m0.C6084g;
import p120n0.C6209c;
import p127o0.C6255a;
import p127o0.C6262h;
import p129o2.C6268a;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;
import p195x.C6740d;
import p208z.C6807l;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C3408b implements ComponentCallbacks2 {

    /* renamed from: j */
    public static volatile ComponentCallbacks2C3408b f2196j;

    /* renamed from: k */
    public static volatile boolean f2197k;

    /* renamed from: a */
    public final C3417c f2198a;

    /* renamed from: b */
    public final InterfaceC3205b f2199b;

    /* renamed from: c */
    public final C5403f f2200c;

    /* renamed from: d */
    public final C3409c f2201d;

    /* renamed from: e */
    public final C3410d f2202e;

    /* renamed from: f */
    public final C3210g f2203f;

    /* renamed from: g */
    public final C6262h f2204g;

    /* renamed from: h */
    public final C5711g f2205h;

    /* renamed from: i */
    public final ArrayList f2206i = new ArrayList();

    public ComponentCallbacks2C3408b(Context context, C3417c c3417c, C5403f c5403f, InterfaceC3205b interfaceC3205b, C3210g c3210g, C6262h c6262h, C5711g c5711g, C5712h c5712h, ArrayMap arrayMap, List list) throws Throwable {
        int i;
        this.f2198a = c3417c;
        this.f2199b = interfaceC3205b;
        this.f2203f = c3210g;
        this.f2200c = c5403f;
        this.f2204g = c6262h;
        this.f2205h = c5711g;
        Resources resources = context.getResources();
        C3410d c3410d = new C3410d();
        this.f2202e = c3410d;
        C5654j c5654j = new C5654j();
        C5834o c5834o = c3410d.f2223g;
        synchronized (c5834o) {
            try {
                c5834o.f9224a.add(c5654j);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 27) {
            C5661q c5661q = new C5661q();
            C5834o c5834o2 = c3410d.f2223g;
            synchronized (c5834o2) {
                i = i8;
                c5834o2.f9224a.add(c5661q);
            }
        } else {
            i = i8;
        }
        ArrayList arrayListM2369e = c3410d.m2369e();
        C6078a c6078a = new C6078a(context, arrayListM2369e, interfaceC3205b, c3210g);
        C5670z c5670z = new C5670z(interfaceC3205b, new C5707c());
        C5657m c5657m = new C5657m(c3410d.m2369e(), resources.getDisplayMetrics(), interfaceC3205b, c3210g);
        C5649e c5649e = new C5649e(c5657m, 0);
        C5645a c5645a = new C5645a(2, c5657m, c3210g);
        C5751b c5751b = new C5751b(context);
        C5520y c5520y = new C5520y(resources, 2);
        C5520y c5520y2 = new C5520y(resources, 3);
        C5520y c5520y3 = new C5520y(resources, 1);
        C5520y c5520y4 = new C5520y(resources, 0);
        C5646b c5646b = new C5646b(c3210g);
        C5413c c5413c = new C5413c(2);
        C6209c c6209c = new C6209c(1);
        ContentResolver contentResolver = context.getContentResolver();
        c3410d.m2366b(ByteBuffer.class, new C5492a0(5));
        c3410d.m2366b(InputStream.class, new C6268a(c3210g, 17));
        c3410d.m2368d("Bitmap", ByteBuffer.class, Bitmap.class, c5649e);
        c3410d.m2368d("Bitmap", InputStream.class, Bitmap.class, c5645a);
        c3410d.m2368d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C5649e(c5657m, 1));
        c3410d.m2368d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c5670z);
        c3410d.m2368d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C5670z(interfaceC3205b, new C5711g(5)));
        C5492a0 c5492a0 = C5492a0.f8492b;
        c3410d.m2365a(Bitmap.class, Bitmap.class, c5492a0);
        c3410d.m2368d("Bitmap", Bitmap.class, Bitmap.class, new C5667w(0));
        c3410d.m2367c(Bitmap.class, c5646b);
        c3410d.m2368d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C5645a(resources, c5649e));
        c3410d.m2368d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C5645a(resources, c5645a));
        c3410d.m2368d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C5645a(resources, c5670z));
        c3410d.m2367c(BitmapDrawable.class, new C0039h(11, interfaceC3205b, false, c5646b));
        c3410d.m2368d("Gif", InputStream.class, GifDrawable.class, new C6084g(arrayListM2369e, c6078a, c3210g));
        c3410d.m2368d("Gif", ByteBuffer.class, GifDrawable.class, c6078a);
        c3410d.m2367c(GifDrawable.class, new C3238c());
        c3410d.m2365a(C6740d.class, C6740d.class, c5492a0);
        c3410d.m2368d("Bitmap", C6740d.class, Bitmap.class, new C5751b(interfaceC3205b));
        c3410d.m2368d("legacy_append", Uri.class, Drawable.class, c5751b);
        c3410d.m2368d("legacy_append", Uri.class, Bitmap.class, new C5645a(1, c5751b, interfaceC3205b));
        c3410d.m2372h(new C5731a(0));
        c3410d.m2365a(File.class, ByteBuffer.class, new C5492a0(6));
        c3410d.m2365a(File.class, InputStream.class, new C5499e(new C5492a0(9)));
        c3410d.m2368d("legacy_append", File.class, File.class, new C5667w(2));
        c3410d.m2365a(File.class, ParcelFileDescriptor.class, new C5499e(new C5492a0(8)));
        c3410d.m2365a(File.class, File.class, c5492a0);
        c3410d.m2372h(new C6807l(c3210g));
        c3410d.m2372h(new C5731a(2));
        Class cls = Integer.TYPE;
        c3410d.m2365a(cls, InputStream.class, c5520y);
        c3410d.m2365a(cls, ParcelFileDescriptor.class, c5520y3);
        c3410d.m2365a(Integer.class, InputStream.class, c5520y);
        c3410d.m2365a(Integer.class, ParcelFileDescriptor.class, c5520y3);
        c3410d.m2365a(Integer.class, Uri.class, c5520y2);
        c3410d.m2365a(cls, AssetFileDescriptor.class, c5520y4);
        c3410d.m2365a(Integer.class, AssetFileDescriptor.class, c5520y4);
        c3410d.m2365a(cls, Uri.class, c5520y2);
        c3410d.m2365a(String.class, InputStream.class, new C6268a(15));
        c3410d.m2365a(Uri.class, InputStream.class, new C6268a(15));
        c3410d.m2365a(String.class, InputStream.class, new C5492a0(12));
        c3410d.m2365a(String.class, ParcelFileDescriptor.class, new C5492a0(11));
        c3410d.m2365a(String.class, AssetFileDescriptor.class, new C5492a0(10));
        c3410d.m2365a(Uri.class, InputStream.class, new C5707c());
        c3410d.m2365a(Uri.class, InputStream.class, new C5491a(context.getAssets(), 1));
        c3410d.m2365a(Uri.class, ParcelFileDescriptor.class, new C5491a(context.getAssets(), 0));
        c3410d.m2365a(Uri.class, InputStream.class, new C5402e(context, 2));
        c3410d.m2365a(Uri.class, InputStream.class, new C5402e(context, 3));
        if (i >= 29) {
            c3410d.m2365a(Uri.class, InputStream.class, new C5538c(context, InputStream.class));
            c3410d.m2365a(Uri.class, ParcelFileDescriptor.class, new C5538c(context, ParcelFileDescriptor.class));
        }
        c3410d.m2365a(Uri.class, InputStream.class, new C5496c0(contentResolver, 2));
        c3410d.m2365a(Uri.class, ParcelFileDescriptor.class, new C5496c0(contentResolver, 1));
        c3410d.m2365a(Uri.class, AssetFileDescriptor.class, new C5496c0(contentResolver, 0));
        c3410d.m2365a(Uri.class, InputStream.class, new C5492a0(13));
        c3410d.m2365a(URL.class, InputStream.class, new C5711g(4));
        c3410d.m2365a(Uri.class, File.class, new C5402e(context, 1));
        c3410d.m2365a(C5501f.class, InputStream.class, new C6268a(18));
        c3410d.m2365a(byte[].class, ByteBuffer.class, new C5492a0(2));
        c3410d.m2365a(byte[].class, InputStream.class, new C5492a0(4));
        c3410d.m2365a(Uri.class, Uri.class, c5492a0);
        c3410d.m2365a(Drawable.class, Drawable.class, c5492a0);
        c3410d.m2368d("legacy_append", Drawable.class, Drawable.class, new C5667w(1));
        c3410d.m2371g(Bitmap.class, BitmapDrawable.class, new C5520y(resources, 4));
        c3410d.m2371g(Bitmap.class, byte[].class, c5413c);
        c3410d.m2371g(Drawable.class, byte[].class, new C3071g(interfaceC3205b, c5413c, 9, c6209c));
        c3410d.m2371g(GifDrawable.class, byte[].class, c6209c);
        C5670z c5670z2 = new C5670z(interfaceC3205b, new C5712h(5));
        c3410d.m2368d("legacy_append", ByteBuffer.class, Bitmap.class, c5670z2);
        c3410d.m2368d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C5645a(resources, c5670z2));
        this.f2201d = new C3409c(context, c3210g, c3410d, new C3238c(), c5712h, arrayMap, list, c3417c);
    }

    /* renamed from: a */
    public static void m2359a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws PackageManager.NameNotFoundException, ClassNotFoundException {
        if (f2197k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f2197k = true;
        ArrayMap arrayMap = new ArrayMap();
        C5712h c5712h = new C5712h(2);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC6675d.m6352r(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.m2357A().isEmpty()) {
                generatedAppGlideModule.m2357A();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
            if (ExecutorServiceC5452b.f8421c == 0) {
                ExecutorServiceC5452b.f8421c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = ExecutorServiceC5452b.f8421c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ExecutorServiceC5452b executorServiceC5452b = new ExecutorServiceC5452b(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5451a("source", false)));
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            ExecutorServiceC5452b executorServiceC5452b2 = new ExecutorServiceC5452b(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5451a("disk-cache", true)));
            if (ExecutorServiceC5452b.f8421c == 0) {
                ExecutorServiceC5452b.f8421c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i8 = ExecutorServiceC5452b.f8421c >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            ExecutorServiceC5452b executorServiceC5452b3 = new ExecutorServiceC5452b(new ThreadPoolExecutor(i8, i8, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC5451a("animation", true)));
            C5405h c5405h = new C5405h(new C5404g(applicationContext));
            C5711g c5711g = new C5711g(7);
            int i9 = c5405h.f8361a;
            InterfaceC3205b c3211h = i9 > 0 ? new C3211h(i9) : new C5707c();
            C3210g c3210g = new C3210g(c5405h.f8363c);
            C5403f c5403f = new C5403f(c5405h.f8362b);
            ComponentCallbacks2C3408b componentCallbacks2C3408b = new ComponentCallbacks2C3408b(applicationContext, new C3417c(c5403f, new C6268a(applicationContext), executorServiceC5452b2, executorServiceC5452b, new ExecutorServiceC5452b(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC5452b.f8420b, timeUnit, new SynchronousQueue(), new ThreadFactoryC5451a("source-unlimited", false))), executorServiceC5452b3), c5403f, c3211h, c3210g, new C6262h(), c5711g, c5712h, arrayMap, Collections.EMPTY_LIST);
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
            applicationContext.registerComponentCallbacks(componentCallbacks2C3408b);
            f2196j = componentCallbacks2C3408b;
            f2197k = false;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: c */
    public static ComponentCallbacks2C3408b m2360c(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2196j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (ComponentCallbacks2C3408b.class) {
                try {
                    if (f2196j == null) {
                        m2359a(context, generatedAppGlideModule);
                    }
                } finally {
                }
            }
        }
        return f2196j;
    }

    /* renamed from: d */
    public static C6262h m2361d(Context context) {
        AbstractC6675d.m6344f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m2360c(context).f2204g;
    }

    /* renamed from: e */
    public static ComponentCallbacks2C3414h m2362e(Context context) {
        return m2361d(context).m5862b(context);
    }

    /* renamed from: f */
    public static ComponentCallbacks2C3414h m2363f(Fragment fragment) {
        C6262h c6262hM2361d = m2361d(fragment.getContext());
        c6262hM2361d.getClass();
        AbstractC6675d.m6344f(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = AbstractC6664k.f11243a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c6262hM2361d.m5862b(fragment.getContext().getApplicationContext());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        SupportRequestManagerFragment supportRequestManagerFragmentM5865e = c6262hM2361d.m5865e(childFragmentManager, fragment, fragment.isVisible());
        ComponentCallbacks2C3414h componentCallbacks2C3414h = supportRequestManagerFragmentM5865e.f2329e;
        if (componentCallbacks2C3414h != null) {
            return componentCallbacks2C3414h;
        }
        ComponentCallbacks2C3408b componentCallbacks2C3408bM2360c = m2360c(context);
        C3238c c3238c = c6262hM2361d.f10016e;
        C6255a c6255a = supportRequestManagerFragmentM5865e.f2325a;
        C6268a c6268a = supportRequestManagerFragmentM5865e.f2326b;
        c3238c.getClass();
        ComponentCallbacks2C3414h componentCallbacks2C3414h2 = new ComponentCallbacks2C3414h(componentCallbacks2C3408bM2360c, c6255a, c6268a, context);
        supportRequestManagerFragmentM5865e.f2329e = componentCallbacks2C3414h2;
        return componentCallbacks2C3414h2;
    }

    /* renamed from: b */
    public final void m2364b() {
        char[] cArr = AbstractC6664k.f11243a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f2200c.m6318e(0L);
        this.f2199b.mo2144e();
        C3210g c3210g = this.f2203f;
        synchronized (c3210g) {
            c3210g.m2152b(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m2364b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j7;
        char[] cArr = AbstractC6664k.f11243a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        ArrayList arrayList = this.f2206i;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            ((ComponentCallbacks2C3414h) obj).getClass();
        }
        C5403f c5403f = this.f2200c;
        c5403f.getClass();
        if (i >= 40) {
            c5403f.m6318e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c5403f) {
                j7 = c5403f.f11236b;
            }
            c5403f.m6318e(j7 / 2);
        }
        this.f2199b.mo2143c(i);
        C3210g c3210g = this.f2203f;
        synchronized (c3210g) {
            if (i >= 40) {
                synchronized (c3210g) {
                    c3210g.m2152b(0);
                }
            } else if (i >= 20 || i == 15) {
                c3210g.m2152b(c3210g.f1750a / 2);
            }
        }
    }
}
