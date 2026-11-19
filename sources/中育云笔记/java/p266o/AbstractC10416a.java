package p266o;

import android.graphics.Bitmap;
import coil3.size.Precision;
import coil3.util.AbstractC5491d;
import coil3.util.Logger;
import java.util.List;
import kotlin.jvm.internal.AbstractC9983y;
import p001a0.AbstractC0003a;
import p001a0.C0010g;
import p212k.AbstractC9761o;
import p212k.C9747a;
import p212k.InterfaceC9756j;
import p325rc.AbstractC10968r;
import p380w.AbstractC11630j;
import p380w.C11634n;

/* renamed from: o.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10416a {
    /* renamed from: a */
    public static final Bitmap m21806a(InterfaceC9756j interfaceC9756j, C11634n c11634n, List list, Logger logger) {
        if (interfaceC9756j instanceof C9747a) {
            Bitmap bitmapM19676b = ((C9747a) interfaceC9756j).m19676b();
            Bitmap.Config configM5c = AbstractC0003a.m5c(bitmapM19676b);
            if (AbstractC10968r.m24090m0(AbstractC5491d.m3323f(), configM5c)) {
                return bitmapM19676b;
            }
            if (logger != null) {
                Logger.Level level = Logger.Level.f3936e;
                if (logger.m3291a().compareTo(level) <= 0) {
                    logger.m3292b("EngineInterceptor", level, "Converting bitmap with config " + configM5c + " to apply transformations: " + list + '.', null);
                }
            }
        } else if (logger != null) {
            Logger.Level level2 = Logger.Level.f3936e;
            if (logger.m3291a().compareTo(level2) <= 0) {
                logger.m3292b("EngineInterceptor", level2, "Converting image of type " + AbstractC9983y.m20315b(interfaceC9756j.getClass()).mo20276e() + " to apply transformations: " + list + '.', null);
            }
        }
        return C0010g.f2a.m20a(AbstractC9761o.m19678a(interfaceC9756j, c11634n.m25743c().getResources()), AbstractC11630j.m25733j(c11634n), c11634n.m25751k(), c11634n.m25750j(), c11634n.m25749i() == Precision.f3907d);
    }
}
