package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2559h2;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: classes.dex */
public final class C2809x {

    /* renamed from: a */
    @NotNull
    public static final C2805t f10789a = new C2805t("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    @NotNull
    private static final InterfaceC3474p<Object, InterfaceC3015g.b, Object> f10790b = a.f10793a;

    /* renamed from: c */
    @NotNull
    private static final InterfaceC3474p<InterfaceC2559h2<?>, InterfaceC3015g.b, InterfaceC2559h2<?>> f10791c = b.f10794a;

    /* renamed from: d */
    @NotNull
    private static final InterfaceC3474p<C2786a0, InterfaceC3015g.b, C2786a0> f10792d = c.f10795a;

    /* renamed from: kotlinx.coroutines.internal.x$a */
    static final class a extends AbstractC2770m implements InterfaceC3474p<Object, InterfaceC3015g.b, Object> {

        /* renamed from: a */
        public static final a f10793a = new a();

        a() {
            super(2);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@Nullable Object obj, @NotNull InterfaceC3015g.b bVar) {
            if (!(bVar instanceof InterfaceC2559h2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num == null ? 1 : num.intValue();
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$b */
    static final class b extends AbstractC2770m implements InterfaceC3474p<InterfaceC2559h2<?>, InterfaceC3015g.b, InterfaceC2559h2<?>> {

        /* renamed from: a */
        public static final b f10794a = new b();

        b() {
            super(2);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2559h2<?> mo2812d(@Nullable InterfaceC2559h2<?> interfaceC2559h2, @NotNull InterfaceC3015g.b bVar) {
            if (interfaceC2559h2 != null) {
                return interfaceC2559h2;
            }
            if (bVar instanceof InterfaceC2559h2) {
                return (InterfaceC2559h2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$c */
    static final class c extends AbstractC2770m implements InterfaceC3474p<C2786a0, InterfaceC3015g.b, C2786a0> {

        /* renamed from: a */
        public static final c f10795a = new c();

        c() {
            super(2);
        }

        @Override // p171x2.InterfaceC3474p
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2786a0 mo2812d(@NotNull C2786a0 c2786a0, @NotNull InterfaceC3015g.b bVar) {
            if (bVar instanceof InterfaceC2559h2) {
                InterfaceC2559h2<?> interfaceC2559h2 = (InterfaceC2559h2) bVar;
                c2786a0.m9275a(interfaceC2559h2, interfaceC2559h2.m8569m(c2786a0.f10745a));
            }
            return c2786a0;
        }
    }

    /* renamed from: a */
    public static final void m9357a(@NotNull InterfaceC3015g interfaceC3015g, @Nullable Object obj) {
        if (obj == f10789a) {
            return;
        }
        if (obj instanceof C2786a0) {
            ((C2786a0) obj).m9276b(interfaceC3015g);
            return;
        }
        Object objFold = interfaceC3015g.fold(null, f10791c);
        Objects.requireNonNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC2559h2) objFold).m8570o(interfaceC3015g, obj);
    }

    @NotNull
    /* renamed from: b */
    public static final Object m9358b(@NotNull InterfaceC3015g interfaceC3015g) {
        Object objFold = interfaceC3015g.fold(0, f10790b);
        C2769l.m9239c(objFold);
        return objFold;
    }

    @Nullable
    /* renamed from: c */
    public static final Object m9359c(@NotNull InterfaceC3015g interfaceC3015g, @Nullable Object obj) {
        if (obj == null) {
            obj = m9358b(interfaceC3015g);
        }
        return obj == 0 ? f10789a : obj instanceof Integer ? interfaceC3015g.fold(new C2786a0(interfaceC3015g, ((Number) obj).intValue()), f10792d) : ((InterfaceC2559h2) obj).m8569m(interfaceC3015g);
    }
}
