package coil3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import coil3.C5302a;
import coil3.RealImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.StaticImageDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import p029c0.InterfaceC5218b;
import p151k.C8247r;
import p183n.InterfaceC9069n;
import p207p.C9288a;
import p207p.C9289b;
import p207p.C9294g;
import p207p.C9296i;
import p207p.C9302o;
import p227r.C9386a;
import p237s.C9457a;
import p237s.C9461e;
import p297y.AbstractC9928i;
import p297y.AbstractC9938s;
import p297y.C9924e;
import p297y.C9931l;
import p297y.InterfaceC9922c;
import p307z.InterfaceC9979i;

/* renamed from: coil3.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5332i {
    /* renamed from: a */
    public static final C5302a.a m2794a(C5302a.a aVar, RealImageLoader.C5301a c5301a) {
        aVar.m2588k(new C9457a(), Reflection.getOrCreateKotlinClass(Uri.class));
        aVar.m2588k(new C9461e(), Reflection.getOrCreateKotlinClass(Integer.class));
        aVar.m2587j(new C9386a(), Reflection.getOrCreateKotlinClass(C8247r.class));
        aVar.m2586i(new C9288a.a(), Reflection.getOrCreateKotlinClass(C8247r.class));
        aVar.m2586i(new C9294g.a(), Reflection.getOrCreateKotlinClass(C8247r.class));
        aVar.m2586i(new C9302o.a(), Reflection.getOrCreateKotlinClass(C8247r.class));
        aVar.m2586i(new C9296i.a(), Reflection.getOrCreateKotlinClass(Drawable.class));
        aVar.m2586i(new C9289b.a(), Reflection.getOrCreateKotlinClass(Bitmap.class));
        Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(AbstractC5330g.m2784b(c5301a), 0, 2, null);
        if (m2795b(c5301a)) {
            aVar.m2584g(new StaticImageDecoder.C5317a(semaphoreSemaphore$default));
        }
        aVar.m2584g(new BitmapFactoryDecoder.C5316c(semaphoreSemaphore$default, AbstractC5330g.m2783a(c5301a)));
        return aVar;
    }

    /* renamed from: b */
    public static final boolean m2795b(RealImageLoader.C5301a c5301a) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5330g.m2785c(c5301a) && Intrinsics.areEqual(AbstractC5330g.m2783a(c5301a), InterfaceC9069n.f15251c);
    }

    /* renamed from: c */
    public static final InterfaceC9922c m2796c(C9924e c9924e, Deferred deferred) {
        return c9924e.m17041y() instanceof InterfaceC5218b ? AbstractC9938s.m17122a(((InterfaceC5218b) c9924e.m17041y()).getView()).m2904b(deferred) : new C9931l(deferred);
    }

    /* renamed from: d */
    public static final boolean m2797d(C9924e c9924e) {
        return (c9924e.m17041y() instanceof InterfaceC5218b) || (c9924e.m17040x() instanceof InterfaceC9979i) || AbstractC9928i.m17100m(c9924e) != null;
    }
}
