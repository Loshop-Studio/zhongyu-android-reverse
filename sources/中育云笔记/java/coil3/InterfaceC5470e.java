package coil3;

import android.content.Context;
import androidx.camera.video.AudioStats;
import coil3.AbstractC5453b;
import coil3.C5454c;
import coil3.InterfaceC5470e;
import coil3.RealImageLoader;
import coil3.disk.AbstractC5469c;
import coil3.disk.InterfaceC5467a;
import kotlin.AbstractC9923a;
import p001a0.AbstractC0006c;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p312r.InterfaceC10825d;
import p380w.C11627g;
import p380w.InterfaceC11623c;
import sd.AbstractC11164t1;
import sd.C11157r0;

/* renamed from: coil3.e */
/* loaded from: classes3.dex */
public interface InterfaceC5470e {

    /* renamed from: coil3.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f3682a;

        /* renamed from: b */
        public C11627g.b f3683b = C11627g.b.f27584p;

        /* renamed from: c */
        public InterfaceC10773d f3684c = null;

        /* renamed from: d */
        public InterfaceC10773d f3685d = null;

        /* renamed from: e */
        public InterfaceC10773d f3686e = null;

        /* renamed from: f */
        public AbstractC5453b.c f3687f = null;

        /* renamed from: g */
        public C5452a f3688g = null;

        /* renamed from: h */
        public final C5454c.a f3689h = new C5454c.a();

        public a(Context context) {
            this.f3682a = AbstractC0006c.m13b(context);
        }

        /* renamed from: e */
        public static final AbstractC11164t1 m3148e() {
            return C11157r0.m24800c().mo24804i();
        }

        /* renamed from: f */
        public static final InterfaceC10825d m3149f(a aVar) {
            return InterfaceC10825d.a.m23289d(new InterfaceC10825d.a(), aVar.f3682a, AudioStats.AUDIO_AMPLITUDE_NONE, 2, null).m23291b();
        }

        /* renamed from: g */
        public static final InterfaceC5467a m3150g() {
            return AbstractC5469c.m3144d();
        }

        /* renamed from: d */
        public final InterfaceC5470e m3151d() {
            Context context = this.f3682a;
            C11627g.b bVar = this.f3683b;
            C11627g.b bVarM25691a = bVar.m25691a((8191 & 1) != 0 ? bVar.f27585a : null, (8191 & 2) != 0 ? bVar.f27586b : null, (8191 & 4) != 0 ? bVar.f27587c : null, (8191 & 8) != 0 ? bVar.f27588d : null, (8191 & 16) != 0 ? bVar.f27589e : null, (8191 & 32) != 0 ? bVar.f27590f : null, (8191 & 64) != 0 ? bVar.f27591g : null, (8191 & 128) != 0 ? bVar.f27592h : null, (8191 & 256) != 0 ? bVar.f27593i : null, (8191 & 512) != 0 ? bVar.f27594j : null, (8191 & 1024) != 0 ? bVar.f27595k : null, (8191 & 2048) != 0 ? bVar.f27596l : null, (8191 & 4096) != 0 ? bVar.f27597m : null, (8191 & 8192) != 0 ? bVar.f27598n : this.f3689h.m3050a());
            InterfaceC10773d interfaceC10773dM20068a = this.f3684c;
            if (interfaceC10773dM20068a == null) {
                interfaceC10773dM20068a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k.l
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return InterfaceC5470e.a.m3148e();
                    }
                });
            }
            InterfaceC10773d interfaceC10773dM20068a2 = this.f3685d;
            if (interfaceC10773dM20068a2 == null) {
                interfaceC10773dM20068a2 = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k.m
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return InterfaceC5470e.a.m3149f(this.f22923c);
                    }
                });
            }
            InterfaceC10773d interfaceC10773dM20068a3 = this.f3686e;
            if (interfaceC10773dM20068a3 == null) {
                interfaceC10773dM20068a3 = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k.n
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return InterfaceC5470e.a.m3150g();
                    }
                });
            }
            AbstractC5453b.c cVar = this.f3687f;
            if (cVar == null) {
                cVar = AbstractC5453b.c.f3588b;
            }
            C5452a c5452a = this.f3688g;
            if (c5452a == null) {
                c5452a = new C5452a();
            }
            return new RealImageLoader(new RealImageLoader.C5451a(context, bVarM25691a, interfaceC10773dM20068a, interfaceC10773dM20068a2, interfaceC10773dM20068a3, cVar, c5452a, null));
        }

        /* renamed from: h */
        public final C5454c.a m3152h() {
            return this.f3689h;
        }
    }

    /* renamed from: a */
    InterfaceC5467a mo2976a();

    /* renamed from: b */
    C11627g.b mo2977b();

    /* renamed from: c */
    InterfaceC11623c mo2978c(C11627g c11627g);

    /* renamed from: d */
    C5452a mo2979d();

    /* renamed from: e */
    InterfaceC10825d mo2980e();
}
