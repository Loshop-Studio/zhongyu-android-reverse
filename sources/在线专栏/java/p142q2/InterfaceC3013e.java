package p142q2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;

/* renamed from: q2.e */
/* loaded from: classes.dex */
public interface InterfaceC3013e extends InterfaceC3015g.b {

    /* renamed from: R */
    @NotNull
    public static final b f11675R = b.f11676a;

    /* renamed from: q2.e$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static <E extends InterfaceC3015g.b> E m10116a(@NotNull InterfaceC3013e interfaceC3013e, @NotNull InterfaceC3015g.c<E> key) {
            C2769l.m9241e(interfaceC3013e, "this");
            C2769l.m9241e(key, "key");
            if (!(key instanceof AbstractC3010b)) {
                if (InterfaceC3013e.f11675R == key) {
                    return interfaceC3013e;
                }
                return null;
            }
            AbstractC3010b abstractC3010b = (AbstractC3010b) key;
            if (!abstractC3010b.m10110a(interfaceC3013e.getKey())) {
                return null;
            }
            E e4 = (E) abstractC3010b.m10111b(interfaceC3013e);
            if (e4 instanceof InterfaceC3015g.b) {
                return e4;
            }
            return null;
        }

        @NotNull
        /* renamed from: b */
        public static InterfaceC3015g m10117b(@NotNull InterfaceC3013e interfaceC3013e, @NotNull InterfaceC3015g.c<?> key) {
            C2769l.m9241e(interfaceC3013e, "this");
            C2769l.m9241e(key, "key");
            if (!(key instanceof AbstractC3010b)) {
                return InterfaceC3013e.f11675R == key ? C3016h.f11678a : interfaceC3013e;
            }
            AbstractC3010b abstractC3010b = (AbstractC3010b) key;
            return (!abstractC3010b.m10110a(interfaceC3013e.getKey()) || abstractC3010b.m10111b(interfaceC3013e) == null) ? interfaceC3013e : C3016h.f11678a;
        }
    }

    /* renamed from: q2.e$b */
    public static final class b implements InterfaceC3015g.c<InterfaceC3013e> {

        /* renamed from: a */
        static final /* synthetic */ b f11676a = new b();

        private b() {
        }
    }

    @NotNull
    /* renamed from: d */
    <T> InterfaceC3012d<T> mo8548d(@NotNull InterfaceC3012d<? super T> interfaceC3012d);

    /* renamed from: t */
    void mo8549t(@NotNull InterfaceC3012d<?> interfaceC3012d);
}
