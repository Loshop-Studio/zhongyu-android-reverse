package p128o2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2919l;

/* renamed from: o2.m */
/* loaded from: classes.dex */
public final class C2920m {
    @NotNull
    /* renamed from: a */
    public static final Object m9993a(@NotNull Throwable exception) {
        C2769l.m9241e(exception, "exception");
        return new C2919l.b(exception);
    }

    /* renamed from: b */
    public static final void m9994b(@NotNull Object obj) throws Throwable {
        if (obj instanceof C2919l.b) {
            throw ((C2919l.b) obj).f11410a;
        }
    }
}
