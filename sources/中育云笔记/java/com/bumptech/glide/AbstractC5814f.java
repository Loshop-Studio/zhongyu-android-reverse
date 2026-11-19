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
import com.bumptech.glide.C5811c;
import com.bumptech.glide.load.data.C5831k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C5869a;
import com.bumptech.glide.load.resource.bitmap.C5871c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p109d1.AbstractC8904e;
import p156g0.InterfaceC9253a;
import p168h0.InterfaceC9439f;
import p212k.AbstractC9764r;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;
import p254n0.C10287a;
import p254n0.C10288b;
import p254n0.C10289c;
import p254n0.C10290d;
import p254n0.C10291e;
import p254n0.C10292f;
import p254n0.C10293g;
import p254n0.C10294h;
import p254n0.C10298l;
import p254n0.C10305s;
import p254n0.C10306t;
import p254n0.C10307u;
import p254n0.C10308v;
import p254n0.C10309w;
import p254n0.C10310x;
import p254n0.C10311y;
import p254n0.InterfaceC10301o;
import p267o0.C10417a;
import p267o0.C10418b;
import p267o0.C10419c;
import p267o0.C10420d;
import p267o0.C10423g;
import p298q0.C10691a;
import p298q0.C10693b;
import p298q0.C10694c;
import p298q0.C10699h;
import p298q0.C10700i;
import p298q0.C10708q;
import p298q0.C10711t;
import p298q0.C10713v;
import p298q0.C10714w;
import p298q0.C10717z;
import p313r0.C10832a;
import p328s0.C11028g;
import p328s0.C11032k;
import p328s0.C11033l;
import p339t0.C11198a;
import p353u0.C11313a;
import p353u0.C11315c;
import p353u0.C11318f;
import p353u0.C11320h;
import p368v0.C11403a;
import p368v0.C11404b;
import p368v0.C11405c;
import p368v0.C11406d;
import p397x0.AbstractC11755a;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5814f {

    /* renamed from: com.bumptech.glide.f$a */
    public class a implements AbstractC8904e.b {

        /* renamed from: a */
        public boolean f4626a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C5810b f4627b;

        /* renamed from: c */
        public final /* synthetic */ List f4628c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC11755a f4629d;

        public a(ComponentCallbacks2C5810b componentCallbacks2C5810b, List list, AbstractC11755a abstractC11755a) {
            this.f4627b = componentCallbacks2C5810b;
            this.f4628c = list;
            this.f4629d = abstractC11755a;
        }

        @Override // p109d1.AbstractC8904e.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f4626a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            Trace.beginSection("Glide registry");
            this.f4626a = true;
            try {
                return AbstractC5814f.m3976a(this.f4627b, this.f4628c, this.f4629d);
            } finally {
                this.f4626a = false;
                Trace.endSection();
            }
        }
    }

    /* renamed from: a */
    public static Registry m3976a(ComponentCallbacks2C5810b componentCallbacks2C5810b, List list, AbstractC11755a abstractC11755a) {
        InterfaceC9772d interfaceC9772dM3952f = componentCallbacks2C5810b.m3952f();
        InterfaceC9770b interfaceC9770bM3951e = componentCallbacks2C5810b.m3951e();
        Context applicationContext = componentCallbacks2C5810b.m3955i().getApplicationContext();
        C5813e c5813eM3970g = componentCallbacks2C5810b.m3955i().m3970g();
        Registry registry = new Registry();
        m3977b(applicationContext, registry, interfaceC9772dM3952f, interfaceC9770bM3951e, c5813eM3970g);
        m3978c(applicationContext, componentCallbacks2C5810b, registry, list, abstractC11755a);
        return registry;
    }

    /* renamed from: b */
    public static void m3977b(Context context, Registry registry, InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b, C5813e c5813e) {
        InterfaceC9439f c10699h;
        InterfaceC9439f c5871c;
        String str;
        Registry registry2;
        registry.m3935o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.m3935o(new C10708q());
        }
        Resources resources = context.getResources();
        List listM3927g = registry.m3927g();
        C11313a c11313a = new C11313a(context, listM3927g, interfaceC9772d, interfaceC9770b);
        InterfaceC9439f interfaceC9439fM4264m = VideoDecoder.m4264m(interfaceC9772d);
        C5869a c5869a = new C5869a(registry.m3927g(), resources.getDisplayMetrics(), interfaceC9772d, interfaceC9770b);
        if (i10 < 28 || !c5813e.m3973a(C5811c.b.class)) {
            c10699h = new C10699h(c5869a);
            c5871c = new C5871c(c5869a, interfaceC9770b);
        } else {
            c5871c = new C10711t();
            c10699h = new C10700i();
        }
        if (i10 >= 28) {
            registry.m3925e("Animation", InputStream.class, Drawable.class, C11028g.m24362f(listM3927g, interfaceC9770b));
            registry.m3925e("Animation", ByteBuffer.class, Drawable.class, C11028g.m24361a(listM3927g, interfaceC9770b));
        }
        C11032k c11032k = new C11032k(context);
        C10694c c10694c = new C10694c(interfaceC9770b);
        C11403a c11403a = new C11403a();
        C11406d c11406d = new C11406d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m3921a(ByteBuffer.class, new C10289c()).m3921a(InputStream.class, new C10307u(interfaceC9770b)).m3925e("Bitmap", ByteBuffer.class, Bitmap.class, c10699h).m3925e("Bitmap", InputStream.class, Bitmap.class, c5871c);
        if (ParcelFileDescriptorRewinder.m4045b()) {
            str = "Animation";
            registry.m3925e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C10713v(c5869a));
        } else {
            str = "Animation";
        }
        registry.m3925e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m4256c(interfaceC9772d));
        String str2 = str;
        registry.m3925e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC9439fM4264m).m3924d(Bitmap.class, Bitmap.class, C10309w.a.m21512a()).m3925e("Bitmap", Bitmap.class, Bitmap.class, new C10717z()).m3922b(Bitmap.class, c10694c).m3925e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C10691a(resources, c10699h)).m3925e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C10691a(resources, c5871c)).m3925e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C10691a(resources, interfaceC9439fM4264m)).m3922b(BitmapDrawable.class, new C10693b(interfaceC9772d, c10694c)).m3925e(str2, InputStream.class, GifDrawable.class, new C11320h(listM3927g, c11313a, interfaceC9770b)).m3925e(str2, ByteBuffer.class, GifDrawable.class, c11313a).m3922b(GifDrawable.class, new C11315c()).m3924d(InterfaceC9253a.class, InterfaceC9253a.class, C10309w.a.m21512a()).m3925e("Bitmap", InterfaceC9253a.class, Bitmap.class, new C11318f(interfaceC9772d)).m3923c(Uri.class, Drawable.class, c11032k).m3923c(Uri.class, Bitmap.class, new C10714w(c11032k, interfaceC9772d)).m3936p(new C10832a.a()).m3924d(File.class, ByteBuffer.class, new C10290d.b()).m3924d(File.class, InputStream.class, new C10293g.e()).m3923c(File.class, File.class, new C11198a()).m3924d(File.class, ParcelFileDescriptor.class, new C10293g.b()).m3924d(File.class, File.class, C10309w.a.m21512a()).m3936p(new C5831k.a(interfaceC9770b));
        if (ParcelFileDescriptorRewinder.m4045b()) {
            registry2 = registry;
            registry2.m3936p(new ParcelFileDescriptorRewinder.C5820a());
        } else {
            registry2 = registry;
        }
        InterfaceC10301o interfaceC10301oM21440g = C10292f.m21440g(context);
        InterfaceC10301o interfaceC10301oM21438c = C10292f.m21438c(context);
        InterfaceC10301o interfaceC10301oM21439e = C10292f.m21439e(context);
        Class cls = Integer.TYPE;
        registry2.m3924d(cls, InputStream.class, interfaceC10301oM21440g).m3924d(Integer.class, InputStream.class, interfaceC10301oM21440g).m3924d(cls, AssetFileDescriptor.class, interfaceC10301oM21438c).m3924d(Integer.class, AssetFileDescriptor.class, interfaceC10301oM21438c).m3924d(cls, Drawable.class, interfaceC10301oM21439e).m3924d(Integer.class, Drawable.class, interfaceC10301oM21439e).m3924d(Uri.class, InputStream.class, C10306t.m21501f(context)).m3924d(Uri.class, AssetFileDescriptor.class, C10306t.m21500e(context));
        C10305s.c cVar = new C10305s.c(resources);
        C10305s.a aVar = new C10305s.a(resources);
        C10305s.b bVar = new C10305s.b(resources);
        registry2.m3924d(Integer.class, Uri.class, cVar).m3924d(cls, Uri.class, cVar).m3924d(Integer.class, AssetFileDescriptor.class, aVar).m3924d(cls, AssetFileDescriptor.class, aVar).m3924d(Integer.class, InputStream.class, bVar).m3924d(cls, InputStream.class, bVar);
        registry2.m3924d(String.class, InputStream.class, new C10291e.c()).m3924d(Uri.class, InputStream.class, new C10291e.c()).m3924d(String.class, InputStream.class, new C10308v.c()).m3924d(String.class, ParcelFileDescriptor.class, new C10308v.b()).m3924d(String.class, AssetFileDescriptor.class, new C10308v.a()).m3924d(Uri.class, InputStream.class, new C10287a.c(context.getAssets())).m3924d(Uri.class, AssetFileDescriptor.class, new C10287a.b(context.getAssets())).m3924d(Uri.class, InputStream.class, new C10418b.a(context)).m3924d(Uri.class, InputStream.class, new C10419c.a(context));
        if (i10 >= 29) {
            registry2.m3924d(Uri.class, InputStream.class, new C10420d.c(context));
            registry2.m3924d(Uri.class, ParcelFileDescriptor.class, new C10420d.b(context));
        }
        registry2.m3924d(Uri.class, InputStream.class, new C10310x.d(contentResolver)).m3924d(Uri.class, ParcelFileDescriptor.class, new C10310x.b(contentResolver)).m3924d(Uri.class, AssetFileDescriptor.class, new C10310x.a(contentResolver)).m3924d(Uri.class, InputStream.class, new C10311y.a()).m3924d(URL.class, InputStream.class, new C10423g.a()).m3924d(Uri.class, File.class, new C10298l.a(context)).m3924d(C10294h.class, InputStream.class, new C10417a.a()).m3924d(byte[].class, ByteBuffer.class, new C10288b.a()).m3924d(byte[].class, InputStream.class, new C10288b.d()).m3924d(Uri.class, Uri.class, C10309w.a.m21512a()).m3924d(Drawable.class, Drawable.class, C10309w.a.m21512a()).m3923c(Drawable.class, Drawable.class, new C11033l()).m3937q(Bitmap.class, BitmapDrawable.class, new C11404b(resources)).m3937q(Bitmap.class, byte[].class, c11403a).m3937q(Drawable.class, byte[].class, new C11405c(interfaceC9772d, c11403a, c11406d)).m3937q(GifDrawable.class, byte[].class, c11406d);
        InterfaceC9439f interfaceC9439fM4257d = VideoDecoder.m4257d(interfaceC9772d);
        registry2.m3923c(ByteBuffer.class, Bitmap.class, interfaceC9439fM4257d);
        registry2.m3923c(ByteBuffer.class, BitmapDrawable.class, new C10691a(resources, interfaceC9439fM4257d));
    }

    /* renamed from: c */
    public static void m3978c(Context context, ComponentCallbacks2C5810b componentCallbacks2C5810b, Registry registry, List list, AbstractC11755a abstractC11755a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC9764r.m19682a(it.next());
            throw null;
        }
        if (abstractC11755a != null) {
            abstractC11755a.m26014a(context, componentCallbacks2C5810b, registry);
        }
    }

    /* renamed from: d */
    public static AbstractC8904e.b m3979d(ComponentCallbacks2C5810b componentCallbacks2C5810b, List list, AbstractC11755a abstractC11755a) {
        return new a(componentCallbacks2C5810b, list, abstractC11755a);
    }
}
