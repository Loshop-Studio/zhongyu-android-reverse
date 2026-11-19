package p131q;

import android.graphics.Bitmap;
import coil3.size.Precision;
import coil3.util.AbstractC4595d;
import coil3.util.Logger;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import p023c0.AbstractC4455a;
import p023c0.C4462g;
import p087k.AbstractC6616o;
import p087k.C6602a;
import p087k.InterfaceC6611j;
import p187y.AbstractC7876i;
import p187y.C7880m;

/* renamed from: q.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7605a {
    /* renamed from: a */
    public static final Bitmap m9022a(InterfaceC6611j interfaceC6611j, C7880m c7880m, List list, Logger logger) {
        if (interfaceC6611j instanceof C6602a) {
            Bitmap bitmapM7566b = ((C6602a) interfaceC6611j).m7566b();
            Bitmap.Config configM1521c = AbstractC4455a.m1521c(bitmapM7566b);
            if (ArraysKt.contains(AbstractC4595d.m2055f(), configM1521c)) {
                return bitmapM7566b;
            }
            if (logger != null) {
                Logger.Level level = Logger.Level.f1945c;
                if (logger.m2023a().compareTo(level) <= 0) {
                    logger.m2024b("EngineInterceptor", level, "Converting bitmap with config " + configM1521c + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (logger != null) {
            Logger.Level level2 = Logger.Level.f1945c;
            if (logger.m2023a().compareTo(level2) <= 0) {
                logger.m2024b("EngineInterceptor", level2, "Converting image of type " + Reflection.getOrCreateKotlinClass(interfaceC6611j.getClass()).getQualifiedName() + " to apply transformations: " + list + '.', null);
            }
        }
        return C4462g.f1332a.m1536a(AbstractC6616o.m7568a(interfaceC6611j, c7880m.m9661c().getResources()), AbstractC7876i.m9651j(c7880m), c7880m.m9669k(), c7880m.m9668j(), c7880m.m9667i() == Precision.f1916b);
    }
}
