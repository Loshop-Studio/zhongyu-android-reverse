package p088g;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0336a0;
import androidx.core.view.C0362y;
import androidx.core.view.InterfaceC0363z;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.h */
/* loaded from: classes.dex */
public class C2626h {

    /* renamed from: c */
    private Interpolator f10388c;

    /* renamed from: d */
    InterfaceC0363z f10389d;

    /* renamed from: e */
    private boolean f10390e;

    /* renamed from: b */
    private long f10387b = -1;

    /* renamed from: f */
    private final C0336a0 f10391f = new a();

    /* renamed from: a */
    final ArrayList<C0362y> f10386a = new ArrayList<>();

    /* renamed from: g.h$a */
    class a extends C0336a0 {

        /* renamed from: a */
        private boolean f10392a = false;

        /* renamed from: b */
        private int f10393b = 0;

        a() {
        }

        /* renamed from: a */
        void m8809a() {
            this.f10393b = 0;
            this.f10392a = false;
            C2626h.this.m8802b();
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationEnd(View view) {
            int i4 = this.f10393b + 1;
            this.f10393b = i4;
            if (i4 == C2626h.this.f10386a.size()) {
                InterfaceC0363z interfaceC0363z = C2626h.this.f10389d;
                if (interfaceC0363z != null) {
                    interfaceC0363z.onAnimationEnd(null);
                }
                m8809a();
            }
        }

        @Override // androidx.core.view.C0336a0, androidx.core.view.InterfaceC0363z
        public void onAnimationStart(View view) {
            if (this.f10392a) {
                return;
            }
            this.f10392a = true;
            InterfaceC0363z interfaceC0363z = C2626h.this.f10389d;
            if (interfaceC0363z != null) {
                interfaceC0363z.onAnimationStart(null);
            }
        }
    }

    /* renamed from: a */
    public void m8801a() {
        if (this.f10390e) {
            Iterator<C0362y> it = this.f10386a.iterator();
            while (it.hasNext()) {
                it.next().m2122b();
            }
            this.f10390e = false;
        }
    }

    /* renamed from: b */
    void m8802b() {
        this.f10390e = false;
    }

    /* renamed from: c */
    public C2626h m8803c(C0362y c0362y) {
        if (!this.f10390e) {
            this.f10386a.add(c0362y);
        }
        return this;
    }

    /* renamed from: d */
    public C2626h m8804d(C0362y c0362y, C0362y c0362y2) {
        this.f10386a.add(c0362y);
        c0362y2.m2127h(c0362y.m2123c());
        this.f10386a.add(c0362y2);
        return this;
    }

    /* renamed from: e */
    public C2626h m8805e(long j4) {
        if (!this.f10390e) {
            this.f10387b = j4;
        }
        return this;
    }

    /* renamed from: f */
    public C2626h m8806f(Interpolator interpolator) {
        if (!this.f10390e) {
            this.f10388c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C2626h m8807g(InterfaceC0363z interfaceC0363z) {
        if (!this.f10390e) {
            this.f10389d = interfaceC0363z;
        }
        return this;
    }

    /* renamed from: h */
    public void m8808h() {
        if (this.f10390e) {
            return;
        }
        Iterator<C0362y> it = this.f10386a.iterator();
        while (it.hasNext()) {
            C0362y next = it.next();
            long j4 = this.f10387b;
            if (j4 >= 0) {
                next.m2124d(j4);
            }
            Interpolator interpolator = this.f10388c;
            if (interpolator != null) {
                next.m2125e(interpolator);
            }
            if (this.f10389d != null) {
                next.m2126f(this.f10391f);
            }
            next.m2129j();
        }
        this.f10390e = true;
    }
}
