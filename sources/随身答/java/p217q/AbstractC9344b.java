package p217q;

import android.graphics.Bitmap;
import coil3.size.Precision;
import coil3.util.AbstractC5349d;
import coil3.util.Logger;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import p090e0.AbstractC7803a;
import p090e0.C7808f;
import p151k.AbstractC8243n;
import p151k.C8230a;
import p151k.InterfaceC8239j;
import p297y.AbstractC9928i;
import p297y.C9932m;

/* renamed from: q.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9344b {
    /* renamed from: a */
    public static final Bitmap m15286a(InterfaceC8239j interfaceC8239j, C9932m c9932m, List list, Logger logger) {
        if (interfaceC8239j instanceof C8230a) {
            Bitmap bitmapM13266b = ((C8230a) interfaceC8239j).m13266b();
            Bitmap.Config configM12172c = AbstractC7803a.m12172c(bitmapM13266b);
            if (ArraysKt.contains(AbstractC5349d.m2946f(), configM12172c)) {
                return bitmapM13266b;
            }
            if (logger != null) {
                Logger.Level level = Logger.Level.f3148c;
                if (logger.m2917a().compareTo(level) <= 0) {
                    logger.m2918b("EngineInterceptor", level, "Converting bitmap with config " + configM12172c + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (logger != null) {
            Logger.Level level2 = Logger.Level.f3148c;
            if (logger.m2917a().compareTo(level2) <= 0) {
                logger.m2918b("EngineInterceptor", level2, "Converting image of type " + Reflection.getOrCreateKotlinClass(interfaceC8239j.getClass()).getQualifiedName() + " to apply transformations: " + list + '.', null);
            }
        }
        return C7808f.f13124a.m12187a(AbstractC8243n.m13268a(interfaceC8239j, c9932m.m17108c().getResources()), AbstractC9928i.m17097j(c9932m), c9932m.m17116k(), c9932m.m17115j(), c9932m.m17114i() == Precision.f3120b);
    }
}
