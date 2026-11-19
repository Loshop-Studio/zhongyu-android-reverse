package p107j3;

import kotlin.jvm.internal.AbstractC2770m;
import kotlinx.coroutines.internal.C2804s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2578m1;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: j3.h */
/* loaded from: classes.dex */
public final class C2701h {

    /* renamed from: j3.h$a */
    static final class a extends AbstractC2770m implements InterfaceC3474p<Integer, InterfaceC3015g.b, Integer> {

        /* renamed from: a */
        final /* synthetic */ C2699f<?> f10672a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2699f<?> c2699f) {
            super(2);
            this.f10672a = c2699f;
        }

        /* renamed from: a */
        public final int m9028a(int i4, @NotNull InterfaceC3015g.b bVar) {
            InterfaceC3015g.c<?> key = bVar.getKey();
            InterfaceC3015g.b bVar2 = this.f10672a.f10665b.get(key);
            if (key != InterfaceC2578m1.f10268P) {
                if (bVar != bVar2) {
                    return Integer.MIN_VALUE;
                }
                return i4 + 1;
            }
            InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) bVar2;
            InterfaceC2578m1 interfaceC2578m1M9027b = C2701h.m9027b((InterfaceC2578m1) bVar, interfaceC2578m1);
            if (interfaceC2578m1M9027b == interfaceC2578m1) {
                return interfaceC2578m1 == null ? i4 : i4 + 1;
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC2578m1M9027b + ", expected child of " + interfaceC2578m1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Integer mo2812d(Integer num, InterfaceC3015g.b bVar) {
            return Integer.valueOf(m9028a(num.intValue(), bVar));
        }
    }

    /* renamed from: a */
    public static final void m9026a(@NotNull C2699f<?> c2699f, @NotNull InterfaceC3015g interfaceC3015g) {
        if (((Number) interfaceC3015g.fold(0, new a(c2699f))).intValue() == c2699f.f10666c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c2699f.f10665b + ",\n\t\tbut emission happened in " + interfaceC3015g + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @Nullable
    /* renamed from: b */
    public static final InterfaceC2578m1 m9027b(@Nullable InterfaceC2578m1 interfaceC2578m1, @Nullable InterfaceC2578m1 interfaceC2578m12) {
        while (interfaceC2578m1 != null) {
            if (interfaceC2578m1 == interfaceC2578m12 || !(interfaceC2578m1 instanceof C2804s)) {
                return interfaceC2578m1;
            }
            interfaceC2578m1 = ((C2804s) interfaceC2578m1).m9342x0();
        }
        return null;
    }
}
