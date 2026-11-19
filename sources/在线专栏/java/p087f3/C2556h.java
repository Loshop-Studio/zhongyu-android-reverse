package p087f3;

import org.jetbrains.annotations.NotNull;
import p142q2.C3016h;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f3.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C2556h {
    /* renamed from: a */
    public static final <T> T m8567a(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3474p<? super InterfaceC2557h0, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p) throws InterruptedException {
        AbstractC2617z0 abstractC2617z0M8578a;
        InterfaceC3015g interfaceC3015gM8538c;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC3013e interfaceC3013e = (InterfaceC3013e) interfaceC3015g.get(InterfaceC3013e.f11675R);
        if (interfaceC3013e == null) {
            abstractC2617z0M8578a = C2563i2.f10245a.m8579b();
            interfaceC3015gM8538c = C2541d0.m8538c(C2550f1.f10242a, interfaceC3015g.plus(abstractC2617z0M8578a));
        } else {
            AbstractC2617z0 abstractC2617z0 = null;
            AbstractC2617z0 abstractC2617z02 = interfaceC3013e instanceof AbstractC2617z0 ? (AbstractC2617z0) interfaceC3013e : null;
            if (abstractC2617z02 != null && abstractC2617z02.m8770W()) {
                abstractC2617z0 = abstractC2617z02;
            }
            abstractC2617z0M8578a = abstractC2617z0 == null ? C2563i2.f10245a.m8578a() : abstractC2617z0;
            interfaceC3015gM8538c = C2541d0.m8538c(C2550f1.f10242a, interfaceC3015g);
        }
        C2544e c2544e = new C2544e(interfaceC3015gM8538c, threadCurrentThread, abstractC2617z0M8578a);
        c2544e.m8501w0(EnumC2565j0.DEFAULT, c2544e, interfaceC3474p);
        return (T) c2544e.m8547x0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m8568b(InterfaceC3015g interfaceC3015g, InterfaceC3474p interfaceC3474p, int i4, Object obj) throws InterruptedException {
        if ((i4 & 1) != 0) {
            interfaceC3015g = C3016h.f11678a;
        }
        return C2552g.m8558e(interfaceC3015g, interfaceC3474p);
    }
}
