package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2573l0;

/* renamed from: kotlinx.coroutines.internal.q */
/* loaded from: classes.dex */
public abstract class AbstractC2802q {
    @Nullable
    /* renamed from: a */
    public abstract AbstractC2788c<?> mo9277a();

    /* renamed from: b */
    public final boolean m9341b(@NotNull AbstractC2802q abstractC2802q) {
        AbstractC2788c<?> abstractC2788cMo9277a;
        AbstractC2788c<?> abstractC2788cMo9277a2 = mo9277a();
        return (abstractC2788cMo9277a2 == null || (abstractC2788cMo9277a = abstractC2802q.mo9277a()) == null || abstractC2788cMo9277a2.m9281f() >= abstractC2788cMo9277a.m9281f()) ? false : true;
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo9278c(@Nullable Object obj);

    @NotNull
    public String toString() {
        return C2573l0.m8591a(this) + '@' + C2573l0.m8592b(this);
    }
}
