package coil3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import be.AbstractC5198j;
import be.InterfaceC5195g;
import coil3.C5452a;
import coil3.RealImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.StaticImageDecoder;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p212k.C9766t;
import p228l.InterfaceC10081n;
import p253n.C10271a;
import p253n.C10272b;
import p253n.C10277g;
import p253n.C10279i;
import p253n.C10285o;
import p283p.C10590a;
import p297q.C10685a;
import p297q.C10689e;
import p380w.AbstractC11640t;
import p380w.C11627g;
import p380w.C11633m;
import p380w.InterfaceC11623c;
import p412y.InterfaceC11880b;
import sd.InterfaceC11138m0;

/* renamed from: coil3.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5474i {
    /* renamed from: a */
    public static final C5452a.a m3166a(C5452a.a aVar, RealImageLoader.C5451a c5451a) {
        aVar.m3019k(new C10685a(), AbstractC9983y.m20315b(Uri.class));
        aVar.m3019k(new C10689e(), AbstractC9983y.m20315b(Integer.class));
        aVar.m3018j(new C10590a(), AbstractC9983y.m20315b(C9766t.class));
        aVar.m3017i(new C10271a.a(), AbstractC9983y.m20315b(C9766t.class));
        aVar.m3017i(new C10277g.a(), AbstractC9983y.m20315b(C9766t.class));
        aVar.m3017i(new C10285o.a(), AbstractC9983y.m20315b(C9766t.class));
        aVar.m3017i(new C10279i.a(), AbstractC9983y.m20315b(Drawable.class));
        aVar.m3017i(new C10272b.a(), AbstractC9983y.m20315b(Bitmap.class));
        InterfaceC5195g interfaceC5195gM2751b = AbstractC5198j.m2751b(AbstractC5472g.m3155b(c5451a), 0, 2, null);
        if (m3167b(c5451a)) {
            aVar.m3015g(new StaticImageDecoder.C5459a(interfaceC5195gM2751b));
        }
        aVar.m3015g(new BitmapFactoryDecoder.C5458c(interfaceC5195gM2751b, AbstractC5472g.m3154a(c5451a)));
        return aVar;
    }

    /* renamed from: b */
    public static final boolean m3167b(RealImageLoader.C5451a c5451a) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5472g.m3156c(c5451a) && AbstractC9979u.m20289b(AbstractC5472g.m3154a(c5451a), InterfaceC10081n.f24093c);
    }

    /* renamed from: c */
    public static final InterfaceC11623c m3168c(C11627g c11627g, InterfaceC11138m0 interfaceC11138m0) {
        return c11627g.m25669y() instanceof InterfaceC11880b ? AbstractC11640t.m25757a(((InterfaceC11880b) c11627g.m25669y()).getView()).m3275b(interfaceC11138m0) : new C11633m(interfaceC11138m0);
    }
}
