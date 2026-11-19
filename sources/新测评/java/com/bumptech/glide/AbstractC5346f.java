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
import com.bumptech.glide.C5343c;
import com.bumptech.glide.load.data.C5363k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C5401a;
import com.bumptech.glide.load.resource.bitmap.C5403c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p003a1.C0008a;
import p003a1.C0009b;
import p003a1.C0010c;
import p003a1.C0011d;
import p031c1.AbstractC5102a;
import p117i1.AbstractC7646e;
import p137k.AbstractC7846r;
import p151l0.InterfaceC8482a;
import p162m0.InterfaceC8540e;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;
import p228s0.C9099a;
import p228s0.C9100b;
import p228s0.C9101c;
import p228s0.C9102d;
import p228s0.C9103e;
import p228s0.C9104f;
import p228s0.C9105g;
import p228s0.C9106h;
import p228s0.C9110l;
import p228s0.C9117s;
import p228s0.C9118t;
import p228s0.C9119u;
import p228s0.C9120v;
import p228s0.C9121w;
import p228s0.C9122x;
import p228s0.C9123y;
import p228s0.InterfaceC9113o;
import p239t0.C9370a;
import p239t0.C9371b;
import p239t0.C9372c;
import p239t0.C9373d;
import p239t0.C9376g;
import p261v0.C9627a;
import p261v0.C9629b;
import p261v0.C9630c;
import p261v0.C9635h;
import p261v0.C9636i;
import p261v0.C9645r;
import p261v0.C9648u;
import p261v0.C9650w;
import p261v0.C9651x;
import p261v0.C9653z;
import p271w0.C9725a;
import p281x0.C9833g;
import p281x0.C9837k;
import p281x0.C9838l;
import p291y0.C9899a;
import p301z0.C9964a;
import p301z0.C9966c;
import p301z0.C9969f;
import p301z0.C9971h;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5346f {

    /* renamed from: com.bumptech.glide.f$a */
    public class a implements AbstractC7646e.b {

        /* renamed from: a */
        public boolean f3423a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C5342b f3424b;

        /* renamed from: c */
        public final /* synthetic */ List f3425c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC5102a f3426d;

        public a(ComponentCallbacks2C5342b componentCallbacks2C5342b, List list, AbstractC5102a abstractC5102a) {
            this.f3424b = componentCallbacks2C5342b;
            this.f3425c = list;
            this.f3426d = abstractC5102a;
        }

        @Override // p117i1.AbstractC7646e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f3423a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            Trace.beginSection("Glide registry");
            this.f3423a = true;
            try {
                return AbstractC5346f.m3326a(this.f3424b, this.f3425c, this.f3426d);
            } finally {
                this.f3423a = false;
                Trace.endSection();
            }
        }
    }

    /* renamed from: a */
    public static Registry m3326a(ComponentCallbacks2C5342b componentCallbacks2C5342b, List list, AbstractC5102a abstractC5102a) {
        InterfaceC8804d interfaceC8804dM3302f = componentCallbacks2C5342b.m3302f();
        InterfaceC8802b interfaceC8802bM3301e = componentCallbacks2C5342b.m3301e();
        Context applicationContext = componentCallbacks2C5342b.m3305i().getApplicationContext();
        C5345e c5345eM3320g = componentCallbacks2C5342b.m3305i().m3320g();
        Registry registry = new Registry();
        m3327b(applicationContext, registry, interfaceC8804dM3302f, interfaceC8802bM3301e, c5345eM3320g);
        m3328c(applicationContext, componentCallbacks2C5342b, registry, list, abstractC5102a);
        return registry;
    }

    /* renamed from: b */
    public static void m3327b(Context context, Registry registry, InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b, C5345e c5345e) {
        InterfaceC8540e c9635h;
        InterfaceC8540e c5403c;
        String str;
        Registry registry2;
        registry.m3286o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.m3286o(new C9645r());
        }
        Resources resources = context.getResources();
        List listM3278g = registry.m3278g();
        C9964a c9964a = new C9964a(context, listM3278g, interfaceC8804d, interfaceC8802b);
        InterfaceC8540e interfaceC8540eM3615m = VideoDecoder.m3615m(interfaceC8804d);
        C5401a c5401a = new C5401a(registry.m3278g(), resources.getDisplayMetrics(), interfaceC8804d, interfaceC8802b);
        if (i10 < 28 || !c5345e.m3323a(C5343c.b.class)) {
            c9635h = new C9635h(c5401a);
            c5403c = new C5403c(c5401a, interfaceC8802b);
        } else {
            c5403c = new C9648u();
            c9635h = new C9636i();
        }
        if (i10 >= 28) {
            registry.m3276e("Animation", InputStream.class, Drawable.class, C9833g.m16456f(listM3278g, interfaceC8802b));
            registry.m3276e("Animation", ByteBuffer.class, Drawable.class, C9833g.m16455a(listM3278g, interfaceC8802b));
        }
        C9837k c9837k = new C9837k(context);
        C9630c c9630c = new C9630c(interfaceC8802b);
        C0008a c0008a = new C0008a();
        C0011d c0011d = new C0011d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m3274c(ByteBuffer.class, new C9101c()).m3274c(InputStream.class, new C9119u(interfaceC8802b)).m3276e("Bitmap", ByteBuffer.class, Bitmap.class, c9635h).m3276e("Bitmap", InputStream.class, Bitmap.class, c5403c);
        if (ParcelFileDescriptorRewinder.m3392c()) {
            str = "Animation";
            registry.m3276e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C9650w(c5401a));
        } else {
            str = "Animation";
        }
        registry.m3276e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m3607c(interfaceC8804d));
        String str2 = str;
        registry.m3276e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC8540eM3615m).m3273b(Bitmap.class, Bitmap.class, C9121w.a.m15450a()).m3276e("Bitmap", Bitmap.class, Bitmap.class, new C9653z()).m3275d(Bitmap.class, c9630c).m3276e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C9627a(resources, c9635h)).m3276e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C9627a(resources, c5403c)).m3276e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C9627a(resources, interfaceC8540eM3615m)).m3275d(BitmapDrawable.class, new C9629b(interfaceC8804d, c9630c)).m3276e(str2, InputStream.class, GifDrawable.class, new C9971h(listM3278g, c9964a, interfaceC8802b)).m3276e(str2, ByteBuffer.class, GifDrawable.class, c9964a).m3275d(GifDrawable.class, new C9966c()).m3273b(InterfaceC8482a.class, InterfaceC8482a.class, C9121w.a.m15450a()).m3276e("Bitmap", InterfaceC8482a.class, Bitmap.class, new C9969f(interfaceC8804d)).m3272a(Uri.class, Drawable.class, c9837k).m3272a(Uri.class, Bitmap.class, new C9651x(c9837k, interfaceC8804d)).m3287p(new C9725a.a()).m3273b(File.class, ByteBuffer.class, new C9102d.b()).m3273b(File.class, InputStream.class, new C9105g.e()).m3272a(File.class, File.class, new C9899a()).m3273b(File.class, ParcelFileDescriptor.class, new C9105g.b()).m3273b(File.class, File.class, C9121w.a.m15450a()).m3287p(new C5363k.a(interfaceC8802b));
        if (ParcelFileDescriptorRewinder.m3392c()) {
            registry2 = registry;
            registry2.m3287p(new ParcelFileDescriptorRewinder.C5352a());
        } else {
            registry2 = registry;
        }
        InterfaceC9113o interfaceC9113oM15375g = C9104f.m15375g(context);
        InterfaceC9113o interfaceC9113oM15373c = C9104f.m15373c(context);
        InterfaceC9113o interfaceC9113oM15374e = C9104f.m15374e(context);
        Class cls = Integer.TYPE;
        registry2.m3273b(cls, InputStream.class, interfaceC9113oM15375g).m3273b(Integer.class, InputStream.class, interfaceC9113oM15375g).m3273b(cls, AssetFileDescriptor.class, interfaceC9113oM15373c).m3273b(Integer.class, AssetFileDescriptor.class, interfaceC9113oM15373c).m3273b(cls, Drawable.class, interfaceC9113oM15374e).m3273b(Integer.class, Drawable.class, interfaceC9113oM15374e).m3273b(Uri.class, InputStream.class, C9118t.m15439f(context)).m3273b(Uri.class, AssetFileDescriptor.class, C9118t.m15438e(context));
        C9117s.c cVar = new C9117s.c(resources);
        C9117s.a aVar = new C9117s.a(resources);
        C9117s.b bVar = new C9117s.b(resources);
        registry2.m3273b(Integer.class, Uri.class, cVar).m3273b(cls, Uri.class, cVar).m3273b(Integer.class, AssetFileDescriptor.class, aVar).m3273b(cls, AssetFileDescriptor.class, aVar).m3273b(Integer.class, InputStream.class, bVar).m3273b(cls, InputStream.class, bVar);
        registry2.m3273b(String.class, InputStream.class, new C9103e.c()).m3273b(Uri.class, InputStream.class, new C9103e.c()).m3273b(String.class, InputStream.class, new C9120v.c()).m3273b(String.class, ParcelFileDescriptor.class, new C9120v.b()).m3273b(String.class, AssetFileDescriptor.class, new C9120v.a()).m3273b(Uri.class, InputStream.class, new C9099a.c(context.getAssets())).m3273b(Uri.class, AssetFileDescriptor.class, new C9099a.b(context.getAssets())).m3273b(Uri.class, InputStream.class, new C9371b.a(context)).m3273b(Uri.class, InputStream.class, new C9372c.a(context));
        if (i10 >= 29) {
            registry2.m3273b(Uri.class, InputStream.class, new C9373d.c(context));
            registry2.m3273b(Uri.class, ParcelFileDescriptor.class, new C9373d.b(context));
        }
        registry2.m3273b(Uri.class, InputStream.class, new C9122x.d(contentResolver)).m3273b(Uri.class, ParcelFileDescriptor.class, new C9122x.b(contentResolver)).m3273b(Uri.class, AssetFileDescriptor.class, new C9122x.a(contentResolver)).m3273b(Uri.class, InputStream.class, new C9123y.a()).m3273b(URL.class, InputStream.class, new C9376g.a()).m3273b(Uri.class, File.class, new C9110l.a(context)).m3273b(C9106h.class, InputStream.class, new C9370a.a()).m3273b(byte[].class, ByteBuffer.class, new C9100b.a()).m3273b(byte[].class, InputStream.class, new C9100b.d()).m3273b(Uri.class, Uri.class, C9121w.a.m15450a()).m3273b(Drawable.class, Drawable.class, C9121w.a.m15450a()).m3272a(Drawable.class, Drawable.class, new C9838l()).m3288q(Bitmap.class, BitmapDrawable.class, new C0009b(resources)).m3288q(Bitmap.class, byte[].class, c0008a).m3288q(Drawable.class, byte[].class, new C0010c(interfaceC8804d, c0008a, c0011d)).m3288q(GifDrawable.class, byte[].class, c0011d);
        InterfaceC8540e interfaceC8540eM3608d = VideoDecoder.m3608d(interfaceC8804d);
        registry2.m3272a(ByteBuffer.class, Bitmap.class, interfaceC8540eM3608d);
        registry2.m3272a(ByteBuffer.class, BitmapDrawable.class, new C9627a(resources, interfaceC8540eM3608d));
    }

    /* renamed from: c */
    public static void m3328c(Context context, ComponentCallbacks2C5342b componentCallbacks2C5342b, Registry registry, List list, AbstractC5102a abstractC5102a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC7846r.m13306a(it.next());
            throw null;
        }
        if (abstractC5102a != null) {
            abstractC5102a.m2721a(context, componentCallbacks2C5342b, registry);
        }
    }

    /* renamed from: d */
    public static AbstractC7646e.b m3329d(ComponentCallbacks2C5342b componentCallbacks2C5342b, List list, AbstractC5102a abstractC5102a) {
        return new a(componentCallbacks2C5342b, list, abstractC5102a);
    }
}
