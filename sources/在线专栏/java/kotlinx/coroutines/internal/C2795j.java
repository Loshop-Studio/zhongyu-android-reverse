package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes.dex */
public final class C2795j {

    /* renamed from: a */
    @NotNull
    private static final Object f10762a = new C2805t("CONDITION_FALSE");

    /* renamed from: b */
    @NotNull
    private static final Object f10763b = new C2805t("LIST_EMPTY");

    @NotNull
    /* renamed from: a */
    public static final Object m9299a() {
        return f10762a;
    }

    @NotNull
    /* renamed from: b */
    public static final C2796k m9300b(@NotNull Object obj) {
        C2803r c2803r = obj instanceof C2803r ? (C2803r) obj : null;
        return c2803r == null ? (C2796k) obj : c2803r.f10785a;
    }
}
