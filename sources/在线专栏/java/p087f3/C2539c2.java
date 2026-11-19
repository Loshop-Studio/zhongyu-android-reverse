package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;

/* renamed from: f3.c2 */
/* loaded from: classes.dex */
final class C2539c2<T> extends AbstractC2597s1 {

    /* renamed from: e */
    @NotNull
    private final C2576m<T> f10229e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2539c2(@NotNull C2576m<? super T> c2576m) {
        this.f10229e = c2576m;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8502s(th);
        return C2925r.f11415a;
    }

    @Override // p087f3.AbstractC2529a0
    /* renamed from: s */
    public void mo8502s(@Nullable Throwable th) {
        Object objM8700O = m8666t().m8700O();
        if (objM8700O instanceof C2613y) {
            C2576m<T> c2576m = this.f10229e;
            Throwable th2 = ((C2613y) objM8700O).f10316a;
            C2919l.a aVar = C2919l.f11409a;
            c2576m.resumeWith(C2919l.m9989a(C2920m.m9993a(th2)));
            return;
        }
        C2576m<T> c2576m2 = this.f10229e;
        Object objM8740h = C2603u1.m8740h(objM8700O);
        C2919l.a aVar2 = C2919l.f11409a;
        c2576m2.resumeWith(C2919l.m9989a(objM8740h));
    }
}
