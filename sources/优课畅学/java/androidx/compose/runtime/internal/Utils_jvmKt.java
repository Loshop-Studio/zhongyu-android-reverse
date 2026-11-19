package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class Utils_jvmKt {
    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, InterfaceC10574p interfaceC10574p) {
        AbstractC9133u.m16131e(interfaceC10574p, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((InterfaceC10574p) AbstractC9116d0.m16096e(interfaceC10574p, 2)).invoke(composer, 1);
    }
}
