package coil3;

import coil3.C5454c;
import p380w.C11627g;
import p380w.C11634n;

/* renamed from: coil3.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5455d {
    /* renamed from: a */
    public static final Object m3053a(C11627g c11627g, C5454c.c cVar) {
        Object objM3048c = c11627g.m25655k().m3048c(cVar);
        if (objM3048c != null) {
            return objM3048c;
        }
        Object objM3048c2 = c11627g.m25651g().m25695f().m3048c(cVar);
        return objM3048c2 == null ? cVar.m3052a() : objM3048c2;
    }

    /* renamed from: b */
    public static final Object m3054b(C11634n c11634n, C5454c.c cVar) {
        Object objM3048c = c11634n.m25746f().m3048c(cVar);
        return objM3048c == null ? cVar.m3052a() : objM3048c;
    }

    /* renamed from: c */
    public static final Object m3055c(C5454c c5454c, C5454c.c cVar) {
        Object objM3048c = c5454c.m3048c(cVar);
        return objM3048c == null ? cVar.m3052a() : objM3048c;
    }
}
