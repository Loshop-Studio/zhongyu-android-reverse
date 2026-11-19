package kotlinx.coroutines.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p087f3.AbstractC2612x1;
import p128o2.C2911d;

/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes.dex */
public final class C2800o {

    /* renamed from: a */
    private static final boolean f10782a = true;

    /* renamed from: a */
    private static final C2801p m9334a(Throwable th, String str) throws Throwable {
        if (f10782a) {
            return new C2801p(th, str);
        }
        if (th != null) {
            throw th;
        }
        m9336c();
        throw new C2911d();
    }

    /* renamed from: b */
    static /* synthetic */ C2801p m9335b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return m9334a(th, str);
    }

    @NotNull
    /* renamed from: c */
    public static final Void m9336c() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    /* renamed from: d */
    public static final AbstractC2612x1 m9337d(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m9334a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
