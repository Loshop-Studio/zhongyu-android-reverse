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
import com.blankj.utilcode.util.AbstractC5379p;
import com.bumptech.glide.C5392c;
import com.bumptech.glide.load.data.C5412k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C5450a;
import com.bumptech.glide.load.resource.bitmap.C5452c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p020b0.AbstractC5023a;
import p116h0.AbstractC8701e;
import p148k.InterfaceC9042a;
import p160l.InterfaceC9231e;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;
import p226r.C9875a;
import p226r.C9876b;
import p226r.C9877c;
import p226r.C9878d;
import p226r.C9879e;
import p226r.C9880f;
import p226r.C9881g;
import p226r.C9882h;
import p226r.C9886l;
import p226r.C9893s;
import p226r.C9894t;
import p226r.C9895u;
import p226r.C9896v;
import p226r.C9897w;
import p226r.C9898x;
import p226r.C9899y;
import p226r.InterfaceC9889o;
import p237s.C9955a;
import p237s.C9956b;
import p237s.C9957c;
import p237s.C9958d;
import p237s.C9961g;
import p259u.C10132a;
import p259u.C10133a0;
import p259u.C10134b;
import p259u.C10136c;
import p259u.C10139d0;
import p259u.C10144h;
import p259u.C10146j;
import p259u.C10157u;
import p259u.C10160x;
import p259u.C10162z;
import p270v.C10236a;
import p281w.C10265g;
import p281w.C10269k;
import p281w.C10270l;
import p292x.C10480a;
import p303y.C10591a;
import p303y.C10593c;
import p303y.C10596f;
import p303y.C10598h;
import p314z.C10684a;
import p314z.C10685b;
import p314z.C10686c;
import p314z.C10687d;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5395f {

    /* renamed from: com.bumptech.glide.f$a */
    public class a implements AbstractC8701e.b {

        /* renamed from: a */
        public boolean f2856a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C5391b f2857b;

        /* renamed from: c */
        public final /* synthetic */ List f2858c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC5023a f2859d;

        public a(ComponentCallbacks2C5391b componentCallbacks2C5391b, List list, AbstractC5023a abstractC5023a) {
            this.f2857b = componentCallbacks2C5391b;
            this.f2858c = list;
            this.f2859d = abstractC5023a;
        }

        @Override // p116h0.AbstractC8701e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f2856a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            Trace.beginSection("Glide registry");
            this.f2856a = true;
            try {
                return AbstractC5395f.m2767a(this.f2857b, this.f2858c, this.f2859d);
            } finally {
                this.f2856a = false;
                Trace.endSection();
            }
        }
    }

    /* renamed from: a */
    public static Registry m2767a(ComponentCallbacks2C5391b componentCallbacks2C5391b, List list, AbstractC5023a abstractC5023a) {
        InterfaceC9500d interfaceC9500dM2743f = componentCallbacks2C5391b.m2743f();
        InterfaceC9498b interfaceC9498bM2742e = componentCallbacks2C5391b.m2742e();
        Context applicationContext = componentCallbacks2C5391b.m2746i().getApplicationContext();
        C5394e c5394eM2761g = componentCallbacks2C5391b.m2746i().m2761g();
        Registry registry = new Registry();
        m2768b(applicationContext, registry, interfaceC9500dM2743f, interfaceC9498bM2742e, c5394eM2761g);
        m2769c(applicationContext, componentCallbacks2C5391b, registry, list, abstractC5023a);
        return registry;
    }

    /* renamed from: b */
    public static void m2768b(Context context, Registry registry, InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b, C5394e c5394e) {
        InterfaceC9231e c10144h;
        InterfaceC9231e c5452c;
        String str;
        Registry registry2;
        registry.m2727o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.m2727o(new C10157u());
        }
        Resources resources = context.getResources();
        List listM2719g = registry.m2719g();
        C10591a c10591a = new C10591a(context, listM2719g, interfaceC9500d, interfaceC9498b);
        InterfaceC9231e interfaceC9231eM3060m = VideoDecoder.m3060m(interfaceC9500d);
        C5450a c5450a = new C5450a(registry.m2719g(), resources.getDisplayMetrics(), interfaceC9500d, interfaceC9498b);
        if (i10 < 28 || !c5394e.m2764a(C5392c.b.class)) {
            c10144h = new C10144h(c5450a);
            c5452c = new C5452c(c5450a, interfaceC9498b);
        } else {
            c5452c = new C10160x();
            c10144h = new C10146j();
        }
        if (i10 >= 28) {
            registry.m2717e("Animation", InputStream.class, Drawable.class, C10265g.m19223f(listM2719g, interfaceC9498b));
            registry.m2717e("Animation", ByteBuffer.class, Drawable.class, C10265g.m19222a(listM2719g, interfaceC9498b));
        }
        C10269k c10269k = new C10269k(context);
        C10136c c10136c = new C10136c(interfaceC9498b);
        C10684a c10684a = new C10684a();
        C10687d c10687d = new C10687d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m2715c(ByteBuffer.class, new C9877c()).m2715c(InputStream.class, new C9895u(interfaceC9498b)).m2717e("Bitmap", ByteBuffer.class, Bitmap.class, c10144h).m2717e("Bitmap", InputStream.class, Bitmap.class, c5452c);
        if (ParcelFileDescriptorRewinder.m2839c()) {
            str = "Animation";
            registry.m2717e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C10162z(c5450a));
        } else {
            str = "Animation";
        }
        registry.m2717e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m3052c(interfaceC9500d));
        String str2 = str;
        registry.m2717e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC9231eM3060m).m2714b(Bitmap.class, Bitmap.class, C9897w.a.m18541a()).m2717e("Bitmap", Bitmap.class, Bitmap.class, new C10139d0()).m2716d(Bitmap.class, c10136c).m2717e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C10132a(resources, c10144h)).m2717e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C10132a(resources, c5452c)).m2717e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C10132a(resources, interfaceC9231eM3060m)).m2716d(BitmapDrawable.class, new C10134b(interfaceC9500d, c10136c)).m2717e(str2, InputStream.class, GifDrawable.class, new C10598h(listM2719g, c10591a, interfaceC9498b)).m2717e(str2, ByteBuffer.class, GifDrawable.class, c10591a).m2716d(GifDrawable.class, new C10593c()).m2714b(InterfaceC9042a.class, InterfaceC9042a.class, C9897w.a.m18541a()).m2717e("Bitmap", InterfaceC9042a.class, Bitmap.class, new C10596f(interfaceC9500d)).m2713a(Uri.class, Drawable.class, c10269k).m2713a(Uri.class, Bitmap.class, new C10133a0(c10269k, interfaceC9500d)).m2728p(new C10236a.a()).m2714b(File.class, ByteBuffer.class, new C9878d.b()).m2714b(File.class, InputStream.class, new C9881g.e()).m2713a(File.class, File.class, new C10480a()).m2714b(File.class, ParcelFileDescriptor.class, new C9881g.b()).m2714b(File.class, File.class, C9897w.a.m18541a()).m2728p(new C5412k.a(interfaceC9498b));
        if (ParcelFileDescriptorRewinder.m2839c()) {
            registry2 = registry;
            registry2.m2728p(new ParcelFileDescriptorRewinder.C5401a());
        } else {
            registry2 = registry;
        }
        InterfaceC9889o interfaceC9889oM18466g = C9880f.m18466g(context);
        InterfaceC9889o interfaceC9889oM18464c = C9880f.m18464c(context);
        InterfaceC9889o interfaceC9889oM18465e = C9880f.m18465e(context);
        Class cls = Integer.TYPE;
        registry2.m2714b(cls, InputStream.class, interfaceC9889oM18466g).m2714b(Integer.class, InputStream.class, interfaceC9889oM18466g).m2714b(cls, AssetFileDescriptor.class, interfaceC9889oM18464c).m2714b(Integer.class, AssetFileDescriptor.class, interfaceC9889oM18464c).m2714b(cls, Drawable.class, interfaceC9889oM18465e).m2714b(Integer.class, Drawable.class, interfaceC9889oM18465e).m2714b(Uri.class, InputStream.class, C9894t.m18530f(context)).m2714b(Uri.class, AssetFileDescriptor.class, C9894t.m18529e(context));
        C9893s.c cVar = new C9893s.c(resources);
        C9893s.a aVar = new C9893s.a(resources);
        C9893s.b bVar = new C9893s.b(resources);
        registry2.m2714b(Integer.class, Uri.class, cVar).m2714b(cls, Uri.class, cVar).m2714b(Integer.class, AssetFileDescriptor.class, aVar).m2714b(cls, AssetFileDescriptor.class, aVar).m2714b(Integer.class, InputStream.class, bVar).m2714b(cls, InputStream.class, bVar);
        registry2.m2714b(String.class, InputStream.class, new C9879e.c()).m2714b(Uri.class, InputStream.class, new C9879e.c()).m2714b(String.class, InputStream.class, new C9896v.c()).m2714b(String.class, ParcelFileDescriptor.class, new C9896v.b()).m2714b(String.class, AssetFileDescriptor.class, new C9896v.a()).m2714b(Uri.class, InputStream.class, new C9875a.c(context.getAssets())).m2714b(Uri.class, AssetFileDescriptor.class, new C9875a.b(context.getAssets())).m2714b(Uri.class, InputStream.class, new C9956b.a(context)).m2714b(Uri.class, InputStream.class, new C9957c.a(context));
        if (i10 >= 29) {
            registry2.m2714b(Uri.class, InputStream.class, new C9958d.c(context));
            registry2.m2714b(Uri.class, ParcelFileDescriptor.class, new C9958d.b(context));
        }
        registry2.m2714b(Uri.class, InputStream.class, new C9898x.d(contentResolver)).m2714b(Uri.class, ParcelFileDescriptor.class, new C9898x.b(contentResolver)).m2714b(Uri.class, AssetFileDescriptor.class, new C9898x.a(contentResolver)).m2714b(Uri.class, InputStream.class, new C9899y.a()).m2714b(URL.class, InputStream.class, new C9961g.a()).m2714b(Uri.class, File.class, new C9886l.a(context)).m2714b(C9882h.class, InputStream.class, new C9955a.a()).m2714b(byte[].class, ByteBuffer.class, new C9876b.a()).m2714b(byte[].class, InputStream.class, new C9876b.d()).m2714b(Uri.class, Uri.class, C9897w.a.m18541a()).m2714b(Drawable.class, Drawable.class, C9897w.a.m18541a()).m2713a(Drawable.class, Drawable.class, new C10270l()).m2729q(Bitmap.class, BitmapDrawable.class, new C10685b(resources)).m2729q(Bitmap.class, byte[].class, c10684a).m2729q(Drawable.class, byte[].class, new C10686c(interfaceC9500d, c10684a, c10687d)).m2729q(GifDrawable.class, byte[].class, c10687d);
        InterfaceC9231e interfaceC9231eM3053d = VideoDecoder.m3053d(interfaceC9500d);
        registry2.m2713a(ByteBuffer.class, Bitmap.class, interfaceC9231eM3053d);
        registry2.m2713a(ByteBuffer.class, BitmapDrawable.class, new C10132a(resources, interfaceC9231eM3053d));
    }

    /* renamed from: c */
    public static void m2769c(Context context, ComponentCallbacks2C5391b componentCallbacks2C5391b, Registry registry, List list, AbstractC5023a abstractC5023a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            throw null;
        }
        if (abstractC5023a != null) {
            abstractC5023a.m2064a(context, componentCallbacks2C5391b, registry);
        }
    }

    /* renamed from: d */
    public static AbstractC8701e.b m2770d(ComponentCallbacks2C5391b componentCallbacks2C5391b, List list, AbstractC5023a abstractC5023a) {
        return new a(componentCallbacks2C5391b, list, abstractC5023a);
    }
}
