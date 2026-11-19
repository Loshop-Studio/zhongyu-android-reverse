package coil3;

import android.content.Context;
import androidx.camera.video.AudioStats;
import coil3.AbstractC5168b;
import coil3.C5169c;
import coil3.InterfaceC5193e;
import coil3.RealImageLoader;
import coil3.disk.AbstractC5192c;
import coil3.disk.InterfaceC5190a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p030c0.AbstractC5078c;
import p238t.InterfaceC9363d;
import p290y.C9886e;
import p290y.InterfaceC9884c;

/* renamed from: coil3.e */
/* loaded from: classes3.dex */
public interface InterfaceC5193e {

    /* renamed from: coil3.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f3007a;

        /* renamed from: b */
        public C9886e.b f3008b = C9886e.b.f17574p;

        /* renamed from: c */
        public Lazy f3009c = null;

        /* renamed from: d */
        public Lazy f3010d = null;

        /* renamed from: e */
        public Lazy f3011e = null;

        /* renamed from: f */
        public AbstractC5168b.c f3012f = null;

        /* renamed from: g */
        public C5167a f3013g = null;

        /* renamed from: h */
        public final C5169c.a f3014h = new C5169c.a();

        public a(Context context) {
            this.f3007a = AbstractC5078c.m2672b(context);
        }

        /* renamed from: e */
        public static final MainCoroutineDispatcher m3054e() {
            return Dispatchers.getMain().getImmediate();
        }

        /* renamed from: f */
        public static final InterfaceC9363d m3055f(a aVar) {
            return InterfaceC9363d.a.m15626d(new InterfaceC9363d.a(), aVar.f3007a, AudioStats.AUDIO_AMPLITUDE_NONE, 2, null).m15628b();
        }

        /* renamed from: g */
        public static final InterfaceC5190a m3056g() {
            return AbstractC5192c.m3050d();
        }

        /* renamed from: d */
        public final InterfaceC5193e m3057d() {
            Context context = this.f3007a;
            C9886e.b bVar = this.f3008b;
            C9886e.b bVarM16654a = bVar.m16654a((8191 & 1) != 0 ? bVar.f17575a : null, (8191 & 2) != 0 ? bVar.f17576b : null, (8191 & 4) != 0 ? bVar.f17577c : null, (8191 & 8) != 0 ? bVar.f17578d : null, (8191 & 16) != 0 ? bVar.f17579e : null, (8191 & 32) != 0 ? bVar.f17580f : null, (8191 & 64) != 0 ? bVar.f17581g : null, (8191 & 128) != 0 ? bVar.f17582h : null, (8191 & 256) != 0 ? bVar.f17583i : null, (8191 & 512) != 0 ? bVar.f17584j : null, (8191 & 1024) != 0 ? bVar.f17585k : null, (8191 & 2048) != 0 ? bVar.f17586l : null, (8191 & 4096) != 0 ? bVar.f17587m : null, (8191 & 8192) != 0 ? bVar.f17588n : this.f3014h.m2891a());
            Lazy lazy = this.f3009c;
            if (lazy == null) {
                lazy = LazyKt.lazy(new Function0() { // from class: k.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC5193e.a.m3054e();
                    }
                });
            }
            Lazy lazy2 = this.f3010d;
            if (lazy2 == null) {
                lazy2 = LazyKt.lazy(new Function0() { // from class: k.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC5193e.a.m3055f(this.f13575a);
                    }
                });
            }
            Lazy lazy3 = this.f3011e;
            if (lazy3 == null) {
                lazy3 = LazyKt.lazy(new Function0() { // from class: k.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC5193e.a.m3056g();
                    }
                });
            }
            AbstractC5168b.c cVar = this.f3012f;
            if (cVar == null) {
                cVar = AbstractC5168b.c.f2817b;
            }
            C5167a c5167a = this.f3013g;
            if (c5167a == null) {
                c5167a = new C5167a();
            }
            return new RealImageLoader(new RealImageLoader.C5166a(context, bVarM16654a, lazy, lazy2, lazy3, cVar, c5167a, null));
        }

        /* renamed from: h */
        public final a m3058h(C5167a c5167a) {
            this.f3013g = c5167a;
            return this;
        }

        /* renamed from: i */
        public final C5169c.a m3059i() {
            return this.f3014h;
        }
    }

    /* renamed from: a */
    InterfaceC5190a mo2816a();

    /* renamed from: b */
    C9886e.b mo2817b();

    /* renamed from: c */
    Object mo2818c(C9886e c9886e, Continuation continuation);

    /* renamed from: d */
    InterfaceC9884c mo2819d(C9886e c9886e);

    /* renamed from: e */
    C5167a mo2820e();

    /* renamed from: f */
    InterfaceC9363d mo2821f();
}
