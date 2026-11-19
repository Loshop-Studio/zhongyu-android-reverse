package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class Utils_jvmKt {
    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, InterfaceC9544p interfaceC9544p) {
        AbstractC9979u.m20292e(interfaceC9544p, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((InterfaceC9544p) AbstractC9962d0.m20254e(interfaceC9544p, 2)).invoke(composer, 1);
    }
}
