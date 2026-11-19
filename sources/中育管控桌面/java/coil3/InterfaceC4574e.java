package coil3;

import android.content.Context;
import coil3.AbstractC4549b;
import coil3.C4550c;
import coil3.InterfaceC4574e;
import coil3.RealImageLoader;
import coil3.disk.AbstractC4573c;
import coil3.disk.InterfaceC4571a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p023c0.AbstractC4458c;
import p152t.InterfaceC7708d;
import p187y.C7872e;
import p187y.InterfaceC7870c;

/* renamed from: coil3.e */
/* loaded from: classes3.dex */
public interface InterfaceC4574e {

    /* renamed from: coil3.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f1691a;

        /* renamed from: b */
        public C7872e.b f1692b = C7872e.b.f10547p;

        /* renamed from: c */
        public Lazy f1693c = null;

        /* renamed from: d */
        public Lazy f1694d = null;

        /* renamed from: e */
        public Lazy f1695e = null;

        /* renamed from: f */
        public AbstractC4549b.c f1696f = null;

        /* renamed from: g */
        public C4548a f1697g = null;

        /* renamed from: h */
        public final C4550c.a f1698h = new C4550c.a();

        public a(Context context) {
            this.f1691a = AbstractC4458c.m1529b(context);
        }

        /* renamed from: e */
        public static final MainCoroutineDispatcher m1882e() {
            return Dispatchers.getMain().getImmediate();
        }

        /* renamed from: f */
        public static final InterfaceC7708d m1883f(a aVar) {
            return InterfaceC7708d.a.m9175d(new InterfaceC7708d.a(), aVar.f1691a, 0.0d, 2, null).m9177b();
        }

        /* renamed from: g */
        public static final InterfaceC4571a m1884g() {
            return AbstractC4573c.m1878d();
        }

        /* renamed from: d */
        public final InterfaceC4574e m1885d() {
            Context context = this.f1691a;
            C7872e.b bVar = this.f1692b;
            C7872e.b bVarM9609a = bVar.m9609a((8191 & 1) != 0 ? bVar.f10548a : null, (8191 & 2) != 0 ? bVar.f10549b : null, (8191 & 4) != 0 ? bVar.f10550c : null, (8191 & 8) != 0 ? bVar.f10551d : null, (8191 & 16) != 0 ? bVar.f10552e : null, (8191 & 32) != 0 ? bVar.f10553f : null, (8191 & 64) != 0 ? bVar.f10554g : null, (8191 & 128) != 0 ? bVar.f10555h : null, (8191 & 256) != 0 ? bVar.f10556i : null, (8191 & 512) != 0 ? bVar.f10557j : null, (8191 & 1024) != 0 ? bVar.f10558k : null, (8191 & 2048) != 0 ? bVar.f10559l : null, (8191 & 4096) != 0 ? bVar.f10560m : null, (8191 & 8192) != 0 ? bVar.f10561n : this.f1698h.m1725a());
            Lazy lazy = this.f1693c;
            if (lazy == null) {
                lazy = LazyKt.lazy(new Function0() { // from class: k.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC4574e.a.m1882e();
                    }
                });
            }
            Lazy lazy2 = this.f1694d;
            if (lazy2 == null) {
                lazy2 = LazyKt.lazy(new Function0() { // from class: k.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC4574e.a.m1883f(this.f8652a);
                    }
                });
            }
            Lazy lazy3 = this.f1695e;
            if (lazy3 == null) {
                lazy3 = LazyKt.lazy(new Function0() { // from class: k.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC4574e.a.m1884g();
                    }
                });
            }
            AbstractC4549b.c cVar = this.f1696f;
            if (cVar == null) {
                cVar = AbstractC4549b.c.f1501b;
            }
            C4548a c4548a = this.f1697g;
            if (c4548a == null) {
                c4548a = new C4548a();
            }
            return new RealImageLoader(new RealImageLoader.C4547a(context, bVarM9609a, lazy, lazy2, lazy3, cVar, c4548a, null));
        }

        /* renamed from: h */
        public final C4550c.a m1886h() {
            return this.f1698h;
        }
    }

    /* renamed from: a */
    InterfaceC4571a mo1650a();

    /* renamed from: b */
    C7872e.b mo1651b();

    /* renamed from: c */
    Object mo1652c(C7872e c7872e, Continuation continuation);

    /* renamed from: d */
    InterfaceC7870c mo1653d(C7872e c7872e);

    /* renamed from: e */
    C4548a mo1654e();

    /* renamed from: f */
    InterfaceC7708d mo1655f();
}
