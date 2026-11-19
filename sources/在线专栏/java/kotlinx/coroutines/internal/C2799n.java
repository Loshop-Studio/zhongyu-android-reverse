package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;
import p077d3.C2461h;
import p077d3.C2463j;
import p087f3.AbstractC2612x1;

/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: classes.dex */
public final class C2799n {

    /* renamed from: a */
    @NotNull
    public static final C2799n f10779a;

    /* renamed from: b */
    private static final boolean f10780b;

    /* renamed from: c */
    @NotNull
    public static final AbstractC2612x1 f10781c;

    static {
        C2799n c2799n = new C2799n();
        f10779a = c2799n;
        f10780b = C2806u.m9347e("kotlinx.coroutines.fast.service.loader", true);
        f10781c = c2799n.m9333a();
    }

    private C2799n() {
    }

    /* renamed from: a */
    private final AbstractC2612x1 m9333a() {
        Object next;
        try {
            List<MainDispatcherFactory> listM9295c = f10780b ? C2792g.f10760a.m9295c() : C2463j.m8219j(C2461h.m8210a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator<T> it = listM9295c.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return mainDispatcherFactory == null ? C2800o.m9335b(null, null, 3, null) : C2800o.m9337d(mainDispatcherFactory, listM9295c);
        } catch (Throwable th) {
            return C2800o.m9335b(th, null, 2, null);
        }
    }
}
