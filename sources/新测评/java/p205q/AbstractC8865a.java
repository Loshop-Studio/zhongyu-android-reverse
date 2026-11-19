package p205q;

import android.graphics.Bitmap;
import coil3.size.Precision;
import coil3.util.AbstractC5214d;
import coil3.util.Logger;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import p030c0.AbstractC5075a;
import p030c0.C5082g;
import p137k.AbstractC7843o;
import p137k.C7829a;
import p137k.InterfaceC7838j;
import p290y.AbstractC9888g;
import p290y.C9892k;

/* renamed from: q.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8865a {
    /* renamed from: a */
    public static final Bitmap m14867a(InterfaceC7838j interfaceC7838j, C9892k c9892k, List list, Logger logger) {
        if (interfaceC7838j instanceof C7829a) {
            Bitmap bitmapM13297b = ((C7829a) interfaceC7838j).m13297b();
            Bitmap.Config configM2664c = AbstractC5075a.m2664c(bitmapM13297b);
            if (ArraysKt.contains(AbstractC5214d.m3229f(), configM2664c)) {
                return bitmapM13297b;
            }
            if (logger != null) {
                Logger.Level level = Logger.Level.f3261c;
                if (logger.m3197a().compareTo(level) <= 0) {
                    logger.m3198b("EngineInterceptor", level, "Converting bitmap with config " + configM2664c + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (logger != null) {
            Logger.Level level2 = Logger.Level.f3261c;
            if (logger.m3197a().compareTo(level2) <= 0) {
                logger.m3198b("EngineInterceptor", level2, "Converting image of type " + Reflection.getOrCreateKotlinClass(interfaceC7838j.getClass()).getQualifiedName() + " to apply transformations: " + list + '.', null);
            }
        }
        return C5082g.f2652a.m2679a(AbstractC7843o.m13299a(interfaceC7838j, c9892k.m16700c().getResources()), AbstractC9888g.m16692f(c9892k), c9892k.m16708k(), c9892k.m16707j(), c9892k.m16706i() == Precision.f3232b);
    }
}
