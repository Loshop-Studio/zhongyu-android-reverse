package p155t2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p151s2.C3379a;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public class C3402a extends C3379a {
    @Override // p151s2.C3379a
    /* renamed from: a */
    public void mo10291a(@NotNull Throwable cause, @NotNull Throwable exception) {
        C2769l.m9241e(cause, "cause");
        C2769l.m9241e(exception, "exception");
        cause.addSuppressed(exception);
    }
}
