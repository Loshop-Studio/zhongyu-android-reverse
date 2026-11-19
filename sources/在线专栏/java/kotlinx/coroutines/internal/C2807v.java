package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.v */
/* loaded from: classes.dex */
final /* synthetic */ class C2807v {

    /* renamed from: a */
    private static final int f10788a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m9350a() {
        return f10788a;
    }

    @Nullable
    /* renamed from: b */
    public static final String m9351b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
