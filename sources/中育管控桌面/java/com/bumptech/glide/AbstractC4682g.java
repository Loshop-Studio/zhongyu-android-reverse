package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.tracing.Trace;
import com.bumptech.glide.C4679d;
import com.bumptech.glide.load.data.C4699k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C4737a;
import com.bumptech.glide.load.resource.bitmap.C4739c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p016b1.AbstractC4403e;
import p046e0.InterfaceC6256a;
import p053f0.InterfaceC6286e;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;
import p087k.AbstractC6619r;
import p097l0.C7267a;
import p097l0.C7268b;
import p097l0.C7269c;
import p097l0.C7270d;
import p097l0.C7271e;
import p097l0.C7272f;
import p097l0.C7273g;
import p097l0.C7274h;
import p097l0.C7278l;
import p097l0.C7285s;
import p097l0.C7286t;
import p097l0.C7287u;
import p097l0.C7288v;
import p097l0.C7289w;
import p097l0.C7290x;
import p097l0.C7291y;
import p097l0.InterfaceC7281o;
import p104m0.C7367a;
import p104m0.C7368b;
import p104m0.C7369c;
import p104m0.C7370d;
import p104m0.C7373g;
import p118o0.C7489a;
import p118o0.C7491b;
import p118o0.C7492c;
import p118o0.C7497h;
import p118o0.C7498i;
import p118o0.C7507r;
import p118o0.C7510u;
import p118o0.C7512w;
import p118o0.C7513x;
import p118o0.C7515z;
import p125p0.C7588a;
import p132q0.C7612g;
import p132q0.C7616k;
import p132q0.C7617l;
import p139r0.C7635a;
import p146s0.C7679a;
import p146s0.C7681c;
import p146s0.C7684f;
import p146s0.C7686h;
import p153t0.C7715a;
import p153t0.C7716b;
import p153t0.C7717c;
import p153t0.C7718d;
import p167v0.AbstractC7785a;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes3.dex */
public abstract class AbstractC4682g {

    /* renamed from: com.bumptech.glide.g$a */
    public class a implements AbstractC4403e.b {

        /* renamed from: a */
        public boolean f2214a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C4678c f2215b;

        /* renamed from: c */
        public final /* synthetic */ List f2216c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC7785a f2217d;

        public a(ComponentCallbacks2C4678c componentCallbacks2C4678c, List list, AbstractC7785a abstractC7785a) {
            this.f2215b = componentCallbacks2C4678c;
            this.f2216c = list;
            this.f2217d = abstractC7785a;
        }

        @Override // p016b1.AbstractC4403e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f2214a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            Trace.beginSection("Glide registry");
            this.f2214a = true;
            try {
                return AbstractC4682g.m2505a(this.f2215b, this.f2216c, this.f2217d);
            } finally {
                this.f2214a = false;
                Trace.endSection();
            }
        }
    }

    /* renamed from: a */
    public static Registry m2505a(ComponentCallbacks2C4678c componentCallbacks2C4678c, List list, AbstractC7785a abstractC7785a) {
        InterfaceC6499d interfaceC6499dM2481f = componentCallbacks2C4678c.m2481f();
        InterfaceC6497b interfaceC6497bM2480e = componentCallbacks2C4678c.m2480e();
        Context applicationContext = componentCallbacks2C4678c.m2484i().getApplicationContext();
        C4681f c4681fM2499g = componentCallbacks2C4678c.m2484i().m2499g();
        Registry registry = new Registry();
        m2506b(applicationContext, registry, interfaceC6499dM2481f, interfaceC6497bM2480e, c4681fM2499g);
        m2507c(applicationContext, componentCallbacks2C4678c, registry, list, abstractC7785a);
        return registry;
    }

    /* renamed from: b */
    public static void m2506b(Context context, Registry registry, InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b, C4681f c4681f) {
        InterfaceC6286e c7497h;
        InterfaceC6286e c4739c;
        String str;
        Registry registry2;
        registry.m2464o(new DefaultImageHeaderParser());
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 27) {
            registry.m2464o(new C7507r());
        }
        Resources resources = context.getResources();
        List listM2456g = registry.m2456g();
        C7679a c7679a = new C7679a(context, listM2456g, interfaceC6499d, interfaceC6497b);
        InterfaceC6286e interfaceC6286eM2795m = VideoDecoder.m2795m(interfaceC6499d);
        C4737a c4737a = new C4737a(registry.m2456g(), resources.getDisplayMetrics(), interfaceC6499d, interfaceC6497b);
        if (i6 < 28 || !c4681f.m2502a(C4679d.b.class)) {
            c7497h = new C7497h(c4737a);
            c4739c = new C4739c(c4737a, interfaceC6497b);
        } else {
            c4739c = new C7510u();
            c7497h = new C7498i();
        }
        if (i6 >= 28) {
            registry.m2454e("Animation", InputStream.class, Drawable.class, C7612g.m9030f(listM2456g, interfaceC6497b));
            registry.m2454e("Animation", ByteBuffer.class, Drawable.class, C7612g.m9029a(listM2456g, interfaceC6497b));
        }
        C7616k c7616k = new C7616k(context);
        C7492c c7492c = new C7492c(interfaceC6497b);
        C7715a c7715a = new C7715a();
        C7718d c7718d = new C7718d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m2450a(ByteBuffer.class, new C7269c()).m2450a(InputStream.class, new C7287u(interfaceC6497b)).m2454e("Bitmap", ByteBuffer.class, Bitmap.class, c7497h).m2454e("Bitmap", InputStream.class, Bitmap.class, c4739c);
        if (ParcelFileDescriptorRewinder.m2573c()) {
            str = "Animation";
            registry.m2454e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C7512w(c4737a));
        } else {
            str = "Animation";
        }
        registry.m2454e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m2787c(interfaceC6499d));
        String str2 = str;
        registry.m2454e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC6286eM2795m).m2453d(Bitmap.class, Bitmap.class, C7289w.a.m8286a()).m2454e("Bitmap", Bitmap.class, Bitmap.class, new C7515z()).m2451b(Bitmap.class, c7492c).m2454e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C7489a(resources, c7497h)).m2454e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C7489a(resources, c4739c)).m2454e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C7489a(resources, interfaceC6286eM2795m)).m2451b(BitmapDrawable.class, new C7491b(interfaceC6499d, c7492c)).m2454e(str2, InputStream.class, GifDrawable.class, new C7686h(listM2456g, c7679a, interfaceC6497b)).m2454e(str2, ByteBuffer.class, GifDrawable.class, c7679a).m2451b(GifDrawable.class, new C7681c()).m2453d(InterfaceC6256a.class, InterfaceC6256a.class, C7289w.a.m8286a()).m2454e("Bitmap", InterfaceC6256a.class, Bitmap.class, new C7684f(interfaceC6499d)).m2452c(Uri.class, Drawable.class, c7616k).m2452c(Uri.class, Bitmap.class, new C7513x(c7616k, interfaceC6499d)).m2465p(new C7588a.a()).m2453d(File.class, ByteBuffer.class, new C7270d.b()).m2453d(File.class, InputStream.class, new C7273g.e()).m2452c(File.class, File.class, new C7635a()).m2453d(File.class, ParcelFileDescriptor.class, new C7273g.b()).m2453d(File.class, File.class, C7289w.a.m8286a()).m2465p(new C4699k.a(interfaceC6497b));
        if (ParcelFileDescriptorRewinder.m2573c()) {
            registry2 = registry;
            registry2.m2465p(new ParcelFileDescriptorRewinder.C4688a());
        } else {
            registry2 = registry;
        }
        InterfaceC7281o interfaceC7281oM8211g = C7272f.m8211g(context);
        InterfaceC7281o interfaceC7281oM8209c = C7272f.m8209c(context);
        InterfaceC7281o interfaceC7281oM8210e = C7272f.m8210e(context);
        Class cls = Integer.TYPE;
        registry2.m2453d(cls, InputStream.class, interfaceC7281oM8211g).m2453d(Integer.class, InputStream.class, interfaceC7281oM8211g).m2453d(cls, AssetFileDescriptor.class, interfaceC7281oM8209c).m2453d(Integer.class, AssetFileDescriptor.class, interfaceC7281oM8209c).m2453d(cls, Drawable.class, interfaceC7281oM8210e).m2453d(Integer.class, Drawable.class, interfaceC7281oM8210e).m2453d(Uri.class, InputStream.class, C7286t.m8275f(context)).m2453d(Uri.class, AssetFileDescriptor.class, C7286t.m8274e(context));
        C7285s.c cVar = new C7285s.c(resources);
        C7285s.a aVar = new C7285s.a(resources);
        C7285s.b bVar = new C7285s.b(resources);
        registry2.m2453d(Integer.class, Uri.class, cVar).m2453d(cls, Uri.class, cVar).m2453d(Integer.class, AssetFileDescriptor.class, aVar).m2453d(cls, AssetFileDescriptor.class, aVar).m2453d(Integer.class, InputStream.class, bVar).m2453d(cls, InputStream.class, bVar);
        registry2.m2453d(String.class, InputStream.class, new C7271e.c()).m2453d(Uri.class, InputStream.class, new C7271e.c()).m2453d(String.class, InputStream.class, new C7288v.c()).m2453d(String.class, ParcelFileDescriptor.class, new C7288v.b()).m2453d(String.class, AssetFileDescriptor.class, new C7288v.a()).m2453d(Uri.class, InputStream.class, new C7267a.c(context.getAssets())).m2453d(Uri.class, AssetFileDescriptor.class, new C7267a.b(context.getAssets())).m2453d(Uri.class, InputStream.class, new C7368b.a(context)).m2453d(Uri.class, InputStream.class, new C7369c.a(context));
        if (i6 >= 29) {
            registry2.m2453d(Uri.class, InputStream.class, new C7370d.c(context));
            registry2.m2453d(Uri.class, ParcelFileDescriptor.class, new C7370d.b(context));
        }
        registry2.m2453d(Uri.class, InputStream.class, new C7290x.d(contentResolver)).m2453d(Uri.class, ParcelFileDescriptor.class, new C7290x.b(contentResolver)).m2453d(Uri.class, AssetFileDescriptor.class, new C7290x.a(contentResolver)).m2453d(Uri.class, InputStream.class, new C7291y.a()).m2453d(URL.class, InputStream.class, new C7373g.a()).m2453d(Uri.class, File.class, new C7278l.a(context)).m2453d(C7274h.class, InputStream.class, new C7367a.a()).m2453d(byte[].class, ByteBuffer.class, new C7268b.a()).m2453d(byte[].class, InputStream.class, new C7268b.d()).m2453d(Uri.class, Uri.class, C7289w.a.m8286a()).m2453d(Drawable.class, Drawable.class, C7289w.a.m8286a()).m2452c(Drawable.class, Drawable.class, new C7617l()).m2466q(Bitmap.class, BitmapDrawable.class, new C7716b(resources)).m2466q(Bitmap.class, byte[].class, c7715a).m2466q(Drawable.class, byte[].class, new C7717c(interfaceC6499d, c7715a, c7718d)).m2466q(GifDrawable.class, byte[].class, c7718d);
        InterfaceC6286e interfaceC6286eM2788d = VideoDecoder.m2788d(interfaceC6499d);
        registry2.m2452c(ByteBuffer.class, Bitmap.class, interfaceC6286eM2788d);
        registry2.m2452c(ByteBuffer.class, BitmapDrawable.class, new C7489a(resources, interfaceC6286eM2788d));
    }

    /* renamed from: c */
    public static void m2507c(Context context, ComponentCallbacks2C4678c componentCallbacks2C4678c, Registry registry, List list, AbstractC7785a abstractC7785a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC6619r.m7572a(it.next());
            throw null;
        }
        if (abstractC7785a != null) {
            abstractC7785a.mo2444a(context, componentCallbacks2C4678c, registry);
        }
    }

    /* renamed from: d */
    public static AbstractC4403e.b m2508d(ComponentCallbacks2C4678c componentCallbacks2C4678c, List list, AbstractC7785a abstractC7785a) {
        return new a(componentCallbacks2C4678c, list, abstractC7785a);
    }
}
