package coil3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import coil3.C5167a;
import coil3.RealImageLoader;
import coil3.decode.BitmapFactoryDecoder;
import coil3.decode.StaticImageDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import p002a0.InterfaceC0007b;
import p137k.C7848t;
import p172n.InterfaceC8599n;
import p194p.C8785a;
import p194p.C8786b;
import p194p.C8791g;
import p194p.C8793i;
import p194p.C8799o;
import p216r.C8991a;
import p227s.C9093a;
import p227s.C9097e;
import p290y.AbstractC9888g;
import p290y.AbstractC9898q;
import p290y.C9886e;
import p290y.C9891j;
import p290y.InterfaceC9884c;
import p300z.InterfaceC9962i;

/* renamed from: coil3.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5197i {
    /* renamed from: a */
    public static final C5167a.a m3074a(C5167a.a aVar, RealImageLoader.C5166a c5166a) {
        aVar.m2860k(new C9093a(), Reflection.getOrCreateKotlinClass(Uri.class));
        aVar.m2860k(new C9097e(), Reflection.getOrCreateKotlinClass(Integer.class));
        aVar.m2859j(new C8991a(), Reflection.getOrCreateKotlinClass(C7848t.class));
        aVar.m2858i(new C8785a.a(), Reflection.getOrCreateKotlinClass(C7848t.class));
        aVar.m2858i(new C8791g.a(), Reflection.getOrCreateKotlinClass(C7848t.class));
        aVar.m2858i(new C8799o.a(), Reflection.getOrCreateKotlinClass(C7848t.class));
        aVar.m2858i(new C8793i.a(), Reflection.getOrCreateKotlinClass(Drawable.class));
        aVar.m2858i(new C8786b.a(), Reflection.getOrCreateKotlinClass(Bitmap.class));
        Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(AbstractC5195g.m3063b(c5166a), 0, 2, null);
        if (m3075b(c5166a)) {
            aVar.m2856g(new StaticImageDecoder.C5182a(semaphoreSemaphore$default));
        }
        aVar.m2856g(new BitmapFactoryDecoder.C5181c(semaphoreSemaphore$default, AbstractC5195g.m3062a(c5166a)));
        return aVar;
    }

    /* renamed from: b */
    public static final boolean m3075b(RealImageLoader.C5166a c5166a) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC5195g.m3064c(c5166a) && Intrinsics.areEqual(AbstractC5195g.m3062a(c5166a), InterfaceC8599n.f14235c);
    }

    /* renamed from: c */
    public static final InterfaceC9884c m3076c(C9886e c9886e, Deferred deferred) {
        return c9886e.m16639y() instanceof InterfaceC0007b ? AbstractC9898q.m16713a(((InterfaceC0007b) c9886e.m16639y()).getView()).m3184b(deferred) : new C9891j(deferred);
    }

    /* renamed from: d */
    public static final boolean m3077d(C9886e c9886e) {
        return (c9886e.m16639y() instanceof InterfaceC0007b) || (c9886e.m16638x() instanceof InterfaceC9962i) || AbstractC9888g.m16695i(c9886e) != null;
    }
}
