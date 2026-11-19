package p102i3;

import kotlinx.coroutines.internal.C2805t;
import org.jetbrains.annotations.NotNull;

/* renamed from: i3.l */
/* loaded from: classes.dex */
public final class C2679l {

    /* renamed from: a */
    @NotNull
    private static final C2805t f10630a = new C2805t("NONE");

    /* renamed from: b */
    @NotNull
    private static final C2805t f10631b = new C2805t("PENDING");

    /* renamed from: a */
    public static final void m8999a(@NotNull InterfaceC2673f<Integer> interfaceC2673f, int i4) {
        Integer value;
        do {
            value = interfaceC2673f.getValue();
        } while (!interfaceC2673f.m8951b(value, Integer.valueOf(value.intValue() + i4)));
    }
}
