package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.C2806u;
import kotlinx.coroutines.internal.C2808w;
import org.jetbrains.annotations.NotNull;
import p014b3.C1037f;
import p087f3.AbstractC2545e0;

/* renamed from: kotlinx.coroutines.scheduling.b */
/* loaded from: classes.dex */
public final class C2813b extends C2814c {

    /* renamed from: h */
    @NotNull
    public static final C2813b f10824h;

    /* renamed from: i */
    @NotNull
    private static final AbstractC2545e0 f10825i;

    static {
        C2813b c2813b = new C2813b();
        f10824h = c2813b;
        f10825i = new ExecutorC2816e(c2813b, C2808w.m9355d("kotlinx.coroutines.io.parallelism", C1037f.m4821b(64, C2806u.m9343a()), 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    private C2813b() {
        super(0, 0, null, 7, null);
    }

    @NotNull
    /* renamed from: N */
    public final AbstractC2545e0 m9415N() {
        return f10825i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
