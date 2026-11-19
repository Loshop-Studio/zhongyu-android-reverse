package p116l2;

import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2556h;
import p087f3.InterfaceC2557h0;
import p097h3.EnumC2659a;
import p102i3.C2670c;
import p102i3.C2677j;
import p102i3.InterfaceC2672e;
import p102i3.InterfaceC2675h;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: l2.e */
/* loaded from: classes.dex */
public final class C2844e {

    /* renamed from: a */
    @NotNull
    public static final C2844e f10946a = new C2844e();

    /* renamed from: b */
    @NotNull
    private static final InterfaceC2672e<C2925r> f10947b;

    /* renamed from: c */
    @NotNull
    private static final InterfaceC2675h<C2925r> f10948c;

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.utlis.GlobalAppEventBus$emitUnauthorizedEvent$1", m9207f = "GlobalAppEventBus.kt", m9208l = {21}, m9209m = "invokeSuspend")
    /* renamed from: l2.e$a */
    static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f10949b;

        a(InterfaceC3012d<? super a> interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return new a(interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f10949b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                InterfaceC2672e interfaceC2672e = C2844e.f10947b;
                C2925r c2925r = C2925r.f11415a;
                this.f10949b = 1;
                if (interfaceC2672e.mo8120a(c2925r, this) == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return C2925r.f11415a;
        }
    }

    static {
        InterfaceC2672e<C2925r> interfaceC2672eM8990b = C2677j.m8990b(0, 1, EnumC2659a.DROP_OLDEST, 1, null);
        f10947b = interfaceC2672eM8990b;
        f10948c = C2670c.m8949a(interfaceC2672eM8990b);
    }

    private C2844e() {
    }

    /* renamed from: b */
    public final void m9543b() {
        C2556h.m8568b(null, new a(null), 1, null);
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC2675h<C2925r> m9544c() {
        return f10948c;
    }
}
