package okio;

import kotlin.jvm.internal.C2768k;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p082e3.C2478d;
import p171x2.InterfaceC3459a;

/* renamed from: okio.-Platform, reason: invalid class name */
/* loaded from: classes.dex */
public final class Platform {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String asUtf8ToByteArray) {
        C2769l.m9241e(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(C2478d.f10082b);
        C2769l.m9240d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m10874synchronized(@NotNull Object lock, @NotNull InterfaceC3459a<? extends R> block) {
        R rInvoke;
        C2769l.m9241e(lock, "lock");
        C2769l.m9241e(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                C2768k.m9236b(1);
            } catch (Throwable th) {
                C2768k.m9236b(1);
                C2768k.m9235a(1);
                throw th;
            }
        }
        C2768k.m9235a(1);
        return rInvoke;
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] toUtf8String) {
        C2769l.m9241e(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, C2478d.f10082b);
    }
}
