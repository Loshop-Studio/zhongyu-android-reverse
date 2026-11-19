package p087f3;

import kotlinx.coroutines.internal.C2805t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.u1 */
/* loaded from: classes.dex */
public final class C2603u1 {

    /* renamed from: a */
    @NotNull
    private static final C2805t f10293a = new C2805t("COMPLETING_ALREADY");

    /* renamed from: b */
    @NotNull
    public static final C2805t f10294b = new C2805t("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    @NotNull
    private static final C2805t f10295c = new C2805t("COMPLETING_RETRY");

    /* renamed from: d */
    @NotNull
    private static final C2805t f10296d = new C2805t("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    @NotNull
    private static final C2805t f10297e = new C2805t("SEALED");

    /* renamed from: f */
    @NotNull
    private static final C2614y0 f10298f = new C2614y0(false);

    /* renamed from: g */
    @NotNull
    private static final C2614y0 f10299g = new C2614y0(true);

    @Nullable
    /* renamed from: g */
    public static final Object m8739g(@Nullable Object obj) {
        return obj instanceof InterfaceC2558h1 ? new C2562i1((InterfaceC2558h1) obj) : obj;
    }

    @Nullable
    /* renamed from: h */
    public static final Object m8740h(@Nullable Object obj) {
        C2562i1 c2562i1 = obj instanceof C2562i1 ? (C2562i1) obj : null;
        return c2562i1 == null ? obj : c2562i1.f10244a;
    }
}
