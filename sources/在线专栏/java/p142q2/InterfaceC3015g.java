package p142q2;

import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3013e;
import p171x2.InterfaceC3474p;

/* renamed from: q2.g */
/* loaded from: classes.dex */
public interface InterfaceC3015g {

    /* renamed from: q2.g$a */
    public static final class a {

        /* renamed from: q2.g$a$a, reason: collision with other inner class name */
        static final class C3539a extends AbstractC2770m implements InterfaceC3474p<InterfaceC3015g, b, InterfaceC3015g> {

            /* renamed from: a */
            public static final C3539a f11677a = new C3539a();

            C3539a() {
                super(2);
            }

            @Override // p171x2.InterfaceC3474p
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3015g mo2812d(@NotNull InterfaceC3015g acc, @NotNull b element) {
                C3011c c3011c;
                C2769l.m9241e(acc, "acc");
                C2769l.m9241e(element, "element");
                InterfaceC3015g interfaceC3015gMinusKey = acc.minusKey(element.getKey());
                C3016h c3016h = C3016h.f11678a;
                if (interfaceC3015gMinusKey == c3016h) {
                    return element;
                }
                InterfaceC3013e.b bVar = InterfaceC3013e.f11675R;
                InterfaceC3013e interfaceC3013e = (InterfaceC3013e) interfaceC3015gMinusKey.get(bVar);
                if (interfaceC3013e == null) {
                    c3011c = new C3011c(interfaceC3015gMinusKey, element);
                } else {
                    InterfaceC3015g interfaceC3015gMinusKey2 = interfaceC3015gMinusKey.minusKey(bVar);
                    if (interfaceC3015gMinusKey2 == c3016h) {
                        return new C3011c(element, interfaceC3013e);
                    }
                    c3011c = new C3011c(new C3011c(interfaceC3015gMinusKey2, element), interfaceC3013e);
                }
                return c3011c;
            }
        }

        @NotNull
        /* renamed from: a */
        public static InterfaceC3015g m10119a(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3015g context) {
            C2769l.m9241e(interfaceC3015g, "this");
            C2769l.m9241e(context, "context");
            return context == C3016h.f11678a ? interfaceC3015g : (InterfaceC3015g) context.fold(interfaceC3015g, C3539a.f11677a);
        }
    }

    /* renamed from: q2.g$b */
    public interface b extends InterfaceC3015g {

        /* renamed from: q2.g$b$a */
        public static final class a {
            /* renamed from: a */
            public static <R> R m10121a(@NotNull b bVar, R r3, @NotNull InterfaceC3474p<? super R, ? super b, ? extends R> operation) {
                C2769l.m9241e(bVar, "this");
                C2769l.m9241e(operation, "operation");
                return operation.mo2812d(r3, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* renamed from: b */
            public static <E extends b> E m10122b(@NotNull b bVar, @NotNull c<E> key) {
                C2769l.m9241e(bVar, "this");
                C2769l.m9241e(key, "key");
                if (C2769l.m9237a(bVar.getKey(), key)) {
                    return bVar;
                }
                return null;
            }

            @NotNull
            /* renamed from: c */
            public static InterfaceC3015g m10123c(@NotNull b bVar, @NotNull c<?> key) {
                C2769l.m9241e(bVar, "this");
                C2769l.m9241e(key, "key");
                return C2769l.m9237a(bVar.getKey(), key) ? C3016h.f11678a : bVar;
            }

            @NotNull
            /* renamed from: d */
            public static InterfaceC3015g m10124d(@NotNull b bVar, @NotNull InterfaceC3015g context) {
                C2769l.m9241e(bVar, "this");
                C2769l.m9241e(context, "context");
                return a.m10119a(bVar, context);
            }
        }

        @Override // p142q2.InterfaceC3015g
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();
    }

    /* renamed from: q2.g$c */
    public interface c<E extends b> {
    }

    <R> R fold(R r3, @NotNull InterfaceC3474p<? super R, ? super b, ? extends R> interfaceC3474p);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    InterfaceC3015g minusKey(@NotNull c<?> cVar);

    @NotNull
    InterfaceC3015g plus(@NotNull InterfaceC3015g interfaceC3015g);
}
