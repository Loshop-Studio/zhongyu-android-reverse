package kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.NotNull;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;

/* renamed from: kotlin.coroutines.jvm.internal.c */
/* loaded from: classes.dex */
public final class C2747c implements InterfaceC3012d<Object> {

    /* renamed from: a */
    @NotNull
    public static final C2747c f10710a = new C2747c();

    private C2747c() {
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p142q2.InterfaceC3012d
    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
