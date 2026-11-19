package coil3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import coil3.C4548a;
import coil3.RealImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.StaticImageDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import p001a0.InterfaceC0005b;
import p087k.C6621t;
import p110n.InterfaceC7431n;
import p124p.C7572a;
import p124p.C7573b;
import p124p.C7578g;
import p124p.C7580i;
import p124p.C7586o;
import p138r.C7631a;
import p145s.C7673a;
import p145s.C7677e;
import p187y.AbstractC7876i;
import p187y.AbstractC7886s;
import p187y.C7872e;
import p187y.C7879l;
import p187y.InterfaceC7870c;
import p194z.InterfaceC7927i;

/* renamed from: coil3.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4578i {
    /* renamed from: a */
    public static final C4548a.a m1900a(C4548a.a aVar, RealImageLoader.C4547a c4547a) {
        aVar.m1694k(new C7673a(), Reflection.getOrCreateKotlinClass(Uri.class));
        aVar.m1694k(new C7677e(), Reflection.getOrCreateKotlinClass(Integer.class));
        aVar.m1693j(new C7631a(), Reflection.getOrCreateKotlinClass(C6621t.class));
        aVar.m1692i(new C7572a.a(), Reflection.getOrCreateKotlinClass(C6621t.class));
        aVar.m1692i(new C7578g.a(), Reflection.getOrCreateKotlinClass(C6621t.class));
        aVar.m1692i(new C7586o.a(), Reflection.getOrCreateKotlinClass(C6621t.class));
        aVar.m1692i(new C7580i.a(), Reflection.getOrCreateKotlinClass(Drawable.class));
        aVar.m1692i(new C7573b.a(), Reflection.getOrCreateKotlinClass(Bitmap.class));
        Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(AbstractC4576g.m1889b(c4547a), 0, 2, null);
        if (m1901b(c4547a)) {
            aVar.m1690g(new StaticImageDecoder.C4563a(semaphoreSemaphore$default));
        }
        aVar.m1690g(new BitmapFactoryDecoder.C4562c(semaphoreSemaphore$default, AbstractC4576g.m1888a(c4547a)));
        return aVar;
    }

    /* renamed from: b */
    public static final boolean m1901b(RealImageLoader.C4547a c4547a) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC4576g.m1890c(c4547a) && Intrinsics.areEqual(AbstractC4576g.m1888a(c4547a), InterfaceC7431n.f9488c);
    }

    /* renamed from: c */
    public static final InterfaceC7870c m1902c(C7872e c7872e, Deferred deferred) {
        return c7872e.m9596y() instanceof InterfaceC0005b ? AbstractC7886s.m9676a(((InterfaceC0005b) c7872e.m9596y()).getView()).m2010b(deferred) : new C7879l(deferred);
    }

    /* renamed from: d */
    public static final boolean m1903d(C7872e c7872e) {
        return (c7872e.m9596y() instanceof InterfaceC0005b) || (c7872e.m9595x() instanceof InterfaceC7927i) || AbstractC7876i.m9654m(c7872e) != null;
    }
}
