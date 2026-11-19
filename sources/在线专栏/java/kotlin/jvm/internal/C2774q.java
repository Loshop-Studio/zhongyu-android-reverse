package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes.dex */
public final class C2774q implements InterfaceC2761d {

    /* renamed from: a */
    @NotNull
    private final Class<?> f10732a;

    /* renamed from: b */
    @NotNull
    private final String f10733b;

    public C2774q(@NotNull Class<?> jClass, @NotNull String moduleName) {
        C2769l.m9241e(jClass, "jClass");
        C2769l.m9241e(moduleName, "moduleName");
        this.f10732a = jClass;
        this.f10733b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC2761d
    @NotNull
    /* renamed from: a */
    public Class<?> mo9231a() {
        return this.f10732a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C2774q) && C2769l.m9237a(mo9231a(), ((C2774q) obj).mo9231a());
    }

    public int hashCode() {
        return mo9231a().hashCode();
    }

    @NotNull
    public String toString() {
        return C2769l.m9248l(mo9231a().toString(), " (Kotlin reflection is not available)");
    }
}
