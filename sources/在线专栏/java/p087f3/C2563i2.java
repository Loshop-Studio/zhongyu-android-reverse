package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.i2 */
/* loaded from: classes.dex */
public final class C2563i2 {

    /* renamed from: a */
    @NotNull
    public static final C2563i2 f10245a = new C2563i2();

    /* renamed from: b */
    @NotNull
    private static final ThreadLocal<AbstractC2617z0> f10246b = new ThreadLocal<>();

    private C2563i2() {
    }

    @Nullable
    /* renamed from: a */
    public final AbstractC2617z0 m8578a() {
        return f10246b.get();
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC2617z0 m8579b() {
        ThreadLocal<AbstractC2617z0> threadLocal = f10246b;
        AbstractC2617z0 abstractC2617z0 = threadLocal.get();
        if (abstractC2617z0 != null) {
            return abstractC2617z0;
        }
        AbstractC2617z0 abstractC2617z0M8535a = C2538c1.m8535a();
        threadLocal.set(abstractC2617z0M8535a);
        return abstractC2617z0M8535a;
    }

    /* renamed from: c */
    public final void m8580c() {
        f10246b.set(null);
    }

    /* renamed from: d */
    public final void m8581d(@NotNull AbstractC2617z0 abstractC2617z0) {
        f10246b.set(abstractC2617z0);
    }
}
