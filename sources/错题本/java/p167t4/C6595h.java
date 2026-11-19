package p167t4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: t4.h */
/* loaded from: classes3.dex */
public final class C6595h {

    /* renamed from: a */
    public static final C6595h f11010a = new C6595h();

    /* renamed from: b */
    public static final LinkedHashMap f11011b = new LinkedHashMap();

    /* renamed from: a */
    public final synchronized void m6229a(String key) {
        AbstractC5830k.m5330g(key, "key");
        if (key.length() > 0) {
            f11011b.remove(key);
        }
    }
}
