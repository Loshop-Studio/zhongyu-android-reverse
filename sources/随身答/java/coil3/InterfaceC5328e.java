package coil3;

import android.content.Context;
import androidx.camera.video.AudioStats;
import coil3.AbstractC5303b;
import coil3.C5304c;
import coil3.InterfaceC5328e;
import coil3.RealImageLoader;
import coil3.disk.AbstractC5327c;
import coil3.disk.InterfaceC5325a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import p090e0.AbstractC7805c;
import p247t.InterfaceC9595d;
import p297y.C9924e;
import p297y.InterfaceC9922c;

/* renamed from: coil3.e */
/* loaded from: classes3.dex */
public interface InterfaceC5328e {

    /* renamed from: coil3.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f2935a;

        /* renamed from: b */
        public C9924e.b f2936b = C9924e.b.f17808p;

        /* renamed from: c */
        public Lazy f2937c = null;

        /* renamed from: d */
        public Lazy f2938d = null;

        /* renamed from: e */
        public AbstractC5303b.c f2939e = null;

        /* renamed from: f */
        public C5302a f2940f = null;

        /* renamed from: g */
        public final C5304c.a f2941g = new C5304c.a();

        public a(Context context) {
            this.f2935a = AbstractC7805c.m12180b(context);
        }

        /* renamed from: d */
        public static final InterfaceC9595d m2778d(a aVar) {
            return InterfaceC9595d.a.m15798d(new InterfaceC9595d.a(), aVar.f2935a, AudioStats.AUDIO_AMPLITUDE_NONE, 2, null).m15800b();
        }

        /* renamed from: e */
        public static final InterfaceC5325a m2779e() {
            return AbstractC5327c.m2775d();
        }

        /* renamed from: c */
        public final InterfaceC5328e m2780c() {
            Context context = this.f2935a;
            C9924e.b bVar = this.f2936b;
            C9924e.b bVarM17055a = bVar.m17055a((8191 & 1) != 0 ? bVar.f17809a : null, (8191 & 2) != 0 ? bVar.f17810b : null, (8191 & 4) != 0 ? bVar.f17811c : null, (8191 & 8) != 0 ? bVar.f17812d : null, (8191 & 16) != 0 ? bVar.f17813e : null, (8191 & 32) != 0 ? bVar.f17814f : null, (8191 & 64) != 0 ? bVar.f17815g : null, (8191 & 128) != 0 ? bVar.f17816h : null, (8191 & 256) != 0 ? bVar.f17817i : null, (8191 & 512) != 0 ? bVar.f17818j : null, (8191 & 1024) != 0 ? bVar.f17819k : null, (8191 & 2048) != 0 ? bVar.f17820l : null, (8191 & 4096) != 0 ? bVar.f17821m : null, (8191 & 8192) != 0 ? bVar.f17822n : this.f2941g.m2619a());
            Lazy lazy = this.f2937c;
            if (lazy == null) {
                lazy = LazyKt.lazy(new Function0() { // from class: k.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC5328e.a.m2778d(this.f14310a);
                    }
                });
            }
            Lazy lazy2 = this.f2938d;
            if (lazy2 == null) {
                lazy2 = LazyKt.lazy(new Function0() { // from class: k.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC5328e.a.m2779e();
                    }
                });
            }
            AbstractC5303b.c cVar = this.f2939e;
            if (cVar == null) {
                cVar = AbstractC5303b.c.f2752b;
            }
            C5302a c5302a = this.f2940f;
            if (c5302a == null) {
                c5302a = new C5302a();
            }
            return new RealImageLoader(new RealImageLoader.C5301a(context, bVarM17055a, lazy, lazy2, cVar, c5302a, null));
        }

        /* renamed from: f */
        public final C5304c.a m2781f() {
            return this.f2941g;
        }
    }

    /* renamed from: a */
    InterfaceC5325a mo2545a();

    /* renamed from: b */
    C9924e.b mo2546b();

    /* renamed from: c */
    Object mo2547c(C9924e c9924e, Continuation continuation);

    /* renamed from: d */
    InterfaceC9922c mo2548d(C9924e c9924e);

    /* renamed from: e */
    C5302a mo2549e();

    /* renamed from: f */
    InterfaceC9595d mo2550f();
}
