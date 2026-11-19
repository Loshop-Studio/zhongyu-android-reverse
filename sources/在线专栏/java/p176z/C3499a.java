package p176z;

import android.graphics.Typeface;
import android.os.Handler;
import p176z.C3503e;
import p176z.C3504f;

/* renamed from: z.a */
/* loaded from: classes.dex */
class C3499a {

    /* renamed from: a */
    private final C3504f.c f12241a;

    /* renamed from: b */
    private final Handler f12242b;

    /* renamed from: z.a$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3504f.c f12243a;

        /* renamed from: b */
        final /* synthetic */ Typeface f12244b;

        a(C3504f.c cVar, Typeface typeface) {
            this.f12243a = cVar;
            this.f12244b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12243a.mo10332b(this.f12244b);
        }
    }

    /* renamed from: z.a$b */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3504f.c f12246a;

        /* renamed from: b */
        final /* synthetic */ int f12247b;

        b(C3504f.c cVar, int i4) {
            this.f12246a = cVar;
            this.f12247b = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12246a.mo10331a(this.f12247b);
        }
    }

    C3499a(C3504f.c cVar, Handler handler) {
        this.f12241a = cVar;
        this.f12242b = handler;
    }

    /* renamed from: a */
    private void m10639a(int i4) {
        this.f12242b.post(new b(this.f12241a, i4));
    }

    /* renamed from: c */
    private void m10640c(Typeface typeface) {
        this.f12242b.post(new a(this.f12241a, typeface));
    }

    /* renamed from: b */
    void m10641b(C3503e.e eVar) {
        if (eVar.m10666a()) {
            m10640c(eVar.f12270a);
        } else {
            m10639a(eVar.f12271b);
        }
    }
}
