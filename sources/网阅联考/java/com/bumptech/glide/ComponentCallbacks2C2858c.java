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
import com.bumptech.glide.load.engine.C2877f;
import com.bumptech.glide.load.resource.bitmap.C2892a;
import com.bumptech.glide.load.resource.bitmap.C2894c;
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
import p001a0.C0005d;
import p016c0.C2753d;
import p047d0.C3696f;
import p047d0.InterfaceC3698h;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p071i.InterfaceC3771a;
import p076j.InterfaceC3795e;
import p081k.C3850k;
import p081k.C3852m;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;
import p102o.InterfaceC4417h;
import p110q.C4452a;
import p110q.C4453b;
import p110q.C4454c;
import p110q.C4455d;
import p110q.C4456e;
import p110q.C4457f;
import p110q.C4458g;
import p110q.C4462k;
import p110q.C4469r;
import p110q.C4470s;
import p110q.C4471t;
import p110q.C4472u;
import p110q.C4473v;
import p110q.C4474w;
import p114r.C4485a;
import p114r.C4486b;
import p114r.C4487c;
import p114r.C4488d;
import p114r.C4489e;
import p114r.C4492h;
import p122t.C4551a;
import p122t.C4553b;
import p122t.C4554b0;
import p122t.C4555c;
import p122t.C4558d0;
import p122t.C4561g;
import p122t.C4563i;
import p122t.C4574t;
import p122t.C4577w;
import p122t.C4579y;
import p122t.C4580z;
import p126u.C4600a;
import p130v.C4616d;
import p130v.C4617e;
import p134w.C4636a;
import p138x.C4649a;
import p138x.C4651c;
import p138x.C4654f;
import p138x.C4656h;
import p142y.C4675a;
import p142y.C4676b;
import p142y.C4677c;
import p142y.C4678d;
import p146z.C4701m;
import p146z.InterfaceC4692d;

/* renamed from: com.bumptech.glide.c */
/* loaded from: classes2.dex */
public class ComponentCallbacks2C2858c implements ComponentCallbacks2 {

    /* renamed from: l */
    public static volatile ComponentCallbacks2C2858c f561l;

    /* renamed from: m */
    public static volatile boolean f562m;

    /* renamed from: a */
    public final C2877f f563a;

    /* renamed from: b */
    public final InterfaceC4395d f564b;

    /* renamed from: c */
    public final InterfaceC4417h f565c;

    /* renamed from: d */
    public final C2860e f566d;

    /* renamed from: e */
    public final Registry f567e;

    /* renamed from: f */
    public final InterfaceC4393b f568f;

    /* renamed from: g */
    public final C4701m f569g;

    /* renamed from: h */
    public final InterfaceC4692d f570h;

    /* renamed from: j */
    public final a f572j;

    /* renamed from: i */
    public final List f571i = new ArrayList();

    /* renamed from: k */
    public MemoryCategory f573k = MemoryCategory.NORMAL;

    /* renamed from: com.bumptech.glide.c$a */
    public interface a {
        C2753d build();
    }

    public ComponentCallbacks2C2858c(Context context, C2877f c2877f, InterfaceC4417h interfaceC4417h, InterfaceC4395d interfaceC4395d, InterfaceC4393b interfaceC4393b, C4701m c4701m, InterfaceC4692d interfaceC4692d, int i4, a aVar, Map map, List list, boolean z3, boolean z4) {
        InterfaceC3795e c4561g;
        InterfaceC3795e c2894c;
        Registry registry;
        this.f563a = c2877f;
        this.f564b = interfaceC4395d;
        this.f568f = interfaceC4393b;
        this.f565c = interfaceC4417h;
        this.f569g = c4701m;
        this.f570h = interfaceC4692d;
        this.f572j = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f567e = registry2;
        registry2.m1674o(new DefaultImageHeaderParser());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 27) {
            registry2.m1674o(new C4574t());
        }
        List listM1666g = registry2.m1666g();
        C4649a c4649a = new C4649a(context, listM1666g, interfaceC4395d, interfaceC4393b);
        InterfaceC3795e interfaceC3795eM6272h = C4558d0.m6272h(interfaceC4395d);
        C2892a c2892a = new C2892a(registry2.m1666g(), resources.getDisplayMetrics(), interfaceC4395d, interfaceC4393b);
        if (!z4 || i5 < 28) {
            c4561g = new C4561g(c2892a);
            c2894c = new C2894c(c2892a, interfaceC4393b);
        } else {
            c2894c = new C4577w();
            c4561g = new C4563i();
        }
        C4616d c4616d = new C4616d(context);
        C4469r.c cVar = new C4469r.c(resources);
        C4469r.d dVar = new C4469r.d(resources);
        C4469r.b bVar = new C4469r.b(resources);
        C4469r.a aVar2 = new C4469r.a(resources);
        C4555c c4555c = new C4555c(interfaceC4393b);
        C4675a c4675a = new C4675a();
        C4678d c4678d = new C4678d();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.m1660a(ByteBuffer.class, new C4454c()).m1660a(InputStream.class, new C4470s(interfaceC4393b)).m1664e("Bitmap", ByteBuffer.class, Bitmap.class, c4561g).m1664e("Bitmap", InputStream.class, Bitmap.class, c2894c);
        if (C3852m.m5145c()) {
            registry2.m1664e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C4579y(c2892a));
        }
        registry2.m1664e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC3795eM6272h).m1664e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C4558d0.m6267c(interfaceC4395d)).m1663d(Bitmap.class, Bitmap.class, C4472u.a.m5747a()).m1664e("Bitmap", Bitmap.class, Bitmap.class, new C4554b0()).m1661b(Bitmap.class, c4555c).m1664e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C4551a(resources, c4561g)).m1664e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C4551a(resources, c2894c)).m1664e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C4551a(resources, interfaceC3795eM6272h)).m1661b(BitmapDrawable.class, new C4553b(interfaceC4395d, c4555c)).m1664e("Gif", InputStream.class, GifDrawable.class, new C4656h(listM1666g, c4649a, interfaceC4393b)).m1664e("Gif", ByteBuffer.class, GifDrawable.class, c4649a).m1661b(GifDrawable.class, new C4651c()).m1663d(InterfaceC3771a.class, InterfaceC3771a.class, C4472u.a.m5747a()).m1664e("Bitmap", InterfaceC3771a.class, Bitmap.class, new C4654f(interfaceC4395d)).m1662c(Uri.class, Drawable.class, c4616d).m1662c(Uri.class, Bitmap.class, new C4580z(c4616d, interfaceC4395d)).m1676q(new C4600a.a()).m1663d(File.class, ByteBuffer.class, new C4455d.b()).m1663d(File.class, InputStream.class, new C4457f.e()).m1662c(File.class, File.class, new C4636a()).m1663d(File.class, ParcelFileDescriptor.class, new C4457f.b()).m1663d(File.class, File.class, C4472u.a.m5747a()).m1676q(new C3850k.a(interfaceC4393b));
        if (C3852m.m5145c()) {
            registry = registry2;
            registry.m1676q(new C3852m.a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.m1663d(cls, InputStream.class, cVar).m1663d(cls, ParcelFileDescriptor.class, bVar).m1663d(Integer.class, InputStream.class, cVar).m1663d(Integer.class, ParcelFileDescriptor.class, bVar).m1663d(Integer.class, Uri.class, dVar).m1663d(cls, AssetFileDescriptor.class, aVar2).m1663d(Integer.class, AssetFileDescriptor.class, aVar2).m1663d(cls, Uri.class, dVar).m1663d(String.class, InputStream.class, new C4456e.c()).m1663d(Uri.class, InputStream.class, new C4456e.c()).m1663d(String.class, InputStream.class, new C4471t.c()).m1663d(String.class, ParcelFileDescriptor.class, new C4471t.b()).m1663d(String.class, AssetFileDescriptor.class, new C4471t.a()).m1663d(Uri.class, InputStream.class, new C4486b.a()).m1663d(Uri.class, InputStream.class, new C4452a.c(context.getAssets())).m1663d(Uri.class, ParcelFileDescriptor.class, new C4452a.b(context.getAssets())).m1663d(Uri.class, InputStream.class, new C4487c.a(context)).m1663d(Uri.class, InputStream.class, new C4488d.a(context));
        if (i5 >= 29) {
            registry.m1663d(Uri.class, InputStream.class, new C4489e.c(context));
            registry.m1663d(Uri.class, ParcelFileDescriptor.class, new C4489e.b(context));
        }
        registry.m1663d(Uri.class, InputStream.class, new C4473v.d(contentResolver)).m1663d(Uri.class, ParcelFileDescriptor.class, new C4473v.b(contentResolver)).m1663d(Uri.class, AssetFileDescriptor.class, new C4473v.a(contentResolver)).m1663d(Uri.class, InputStream.class, new C4474w.a()).m1663d(URL.class, InputStream.class, new C4492h.a()).m1663d(Uri.class, File.class, new C4462k.a(context)).m1663d(C4458g.class, InputStream.class, new C4485a.a()).m1663d(byte[].class, ByteBuffer.class, new C4453b.a()).m1663d(byte[].class, InputStream.class, new C4453b.d()).m1663d(Uri.class, Uri.class, C4472u.a.m5747a()).m1663d(Drawable.class, Drawable.class, C4472u.a.m5747a()).m1662c(Drawable.class, Drawable.class, new C4617e()).m1675p(Bitmap.class, BitmapDrawable.class, new C4676b(resources)).m1675p(Bitmap.class, byte[].class, c4675a).m1675p(Drawable.class, byte[].class, new C4677c(interfaceC4395d, c4675a, c4678d)).m1675p(GifDrawable.class, byte[].class, c4678d);
        InterfaceC3795e interfaceC3795eM6268d = C4558d0.m6268d(interfaceC4395d);
        registry.m1662c(ByteBuffer.class, Bitmap.class, interfaceC3795eM6268d);
        registry.m1662c(ByteBuffer.class, BitmapDrawable.class, new C4551a(resources, interfaceC3795eM6268d));
        this.f566d = new C2860e(context, interfaceC4393b, registry, new C3696f(), aVar, map, list, c2877f, z3, i4);
    }

    /* renamed from: a */
    public static void m1679a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (f562m) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f562m = true;
        m1683m(context, generatedAppGlideModule);
        f562m = false;
    }

    /* renamed from: c */
    public static ComponentCallbacks2C2858c m1680c(Context context) {
        if (f561l == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM1681d = m1681d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C2858c.class) {
                if (f561l == null) {
                    m1679a(context, generatedAppGlideModuleM1681d);
                }
            }
        }
        return f561l;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m1681d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e4) {
            m1685q(e4);
            return null;
        } catch (InstantiationException e5) {
            m1685q(e5);
            return null;
        } catch (NoSuchMethodException e6) {
            m1685q(e6);
            return null;
        } catch (InvocationTargetException e7) {
            m1685q(e7);
            return null;
        }
    }

    /* renamed from: l */
    public static C4701m m1682l(Context context) {
        AbstractC3749i.m4769e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m1680c(context).m1696k();
    }

    /* renamed from: m */
    public static void m1683m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m1684n(context, new C2859d(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m1684n(Context context, C2859d c2859d, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.m3c()) {
            listEmptyList = new C0005d(applicationContext).m7a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m1658d().isEmpty()) {
            generatedAppGlideModule.m1658d();
            Iterator it = listEmptyList.iterator();
            if (it.hasNext()) {
                AbstractC2857b.m1678a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listEmptyList.iterator();
            if (it2.hasNext()) {
                AbstractC2857b.m1678a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        c2859d.m1702b(generatedAppGlideModule != null ? generatedAppGlideModule.m1659e() : null);
        Iterator it3 = listEmptyList.iterator();
        if (it3.hasNext()) {
            AbstractC2857b.m1678a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m2b(applicationContext, c2859d);
        }
        ComponentCallbacks2C2858c componentCallbacks2C2858cM1701a = c2859d.m1701a(applicationContext);
        Iterator it4 = listEmptyList.iterator();
        if (it4.hasNext()) {
            AbstractC2857b.m1678a(it4.next());
            try {
                Registry registry = componentCallbacks2C2858cM1701a.f567e;
                throw null;
            } catch (AbstractMethodError unused) {
                new StringBuilder().append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                throw null;
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m4a(applicationContext, componentCallbacks2C2858cM1701a, componentCallbacks2C2858cM1701a.f567e);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C2858cM1701a);
        f561l = componentCallbacks2C2858cM1701a;
    }

    /* renamed from: q */
    public static void m1685q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C2862g m1686t(Context context) {
        return m1682l(context).m6686k(context);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C2862g m1687u(View view) {
        return m1682l(view.getContext()).m6687l(view);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C2862g m1688v(Fragment fragment) {
        return m1682l(fragment.getContext()).m6688m(fragment);
    }

    /* renamed from: b */
    public void m1689b() {
        AbstractC3750j.m4770a();
        this.f565c.m5512b();
        this.f564b.mo5391b();
        this.f568f.mo5384b();
    }

    /* renamed from: e */
    public InterfaceC4393b m1690e() {
        return this.f568f;
    }

    /* renamed from: f */
    public InterfaceC4395d m1691f() {
        return this.f564b;
    }

    /* renamed from: g */
    public InterfaceC4692d m1692g() {
        return this.f570h;
    }

    /* renamed from: h */
    public Context m1693h() {
        return this.f566d.getBaseContext();
    }

    /* renamed from: i */
    public C2860e m1694i() {
        return this.f566d;
    }

    /* renamed from: j */
    public Registry m1695j() {
        return this.f567e;
    }

    /* renamed from: k */
    public C4701m m1696k() {
        return this.f569g;
    }

    /* renamed from: o */
    public void m1697o(ComponentCallbacks2C2862g componentCallbacks2C2862g) {
        synchronized (this.f571i) {
            if (this.f571i.contains(componentCallbacks2C2862g)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f571i.add(componentCallbacks2C2862g);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m1689b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        m1699r(i4);
    }

    /* renamed from: p */
    public boolean m1698p(InterfaceC3698h interfaceC3698h) {
        synchronized (this.f571i) {
            Iterator it = this.f571i.iterator();
            while (it.hasNext()) {
                if (((ComponentCallbacks2C2862g) it.next()).m1749z(interfaceC3698h)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m1699r(int i4) {
        AbstractC3750j.m4770a();
        Iterator it = this.f571i.iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C2862g) it.next()).onTrimMemory(i4);
        }
        this.f565c.mo5506a(i4);
        this.f564b.mo5390a(i4);
        this.f568f.mo5383a(i4);
    }

    /* renamed from: s */
    public void m1700s(ComponentCallbacks2C2862g componentCallbacks2C2862g) {
        synchronized (this.f571i) {
            if (!this.f571i.contains(componentCallbacks2C2862g)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f571i.remove(componentCallbacks2C2862g);
        }
    }
}
