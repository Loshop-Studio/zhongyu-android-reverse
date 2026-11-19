package p000a.p005b.p012g;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;
import p000a.p031h.p043j.InterfaceC0274w;

/* renamed from: a.b.g.g */
/* loaded from: classes.dex */
public class C0046g {

    /* renamed from: c */
    public Interpolator f347c;

    /* renamed from: d */
    public InterfaceC0274w f348d;

    /* renamed from: e */
    public boolean f349e;

    /* renamed from: b */
    public long f346b = -1;

    /* renamed from: f */
    public final C0275x f350f = new a();

    /* renamed from: a */
    public final ArrayList<C0273v> f345a = new ArrayList<>();

    /* renamed from: a.b.g.g$a */
    public class a extends C0275x {

        /* renamed from: a */
        public boolean f351a = false;

        /* renamed from: b */
        public int f352b = 0;

        public a() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            int i = this.f352b + 1;
            this.f352b = i;
            if (i == C0046g.this.f345a.size()) {
                InterfaceC0274w interfaceC0274w = C0046g.this.f348d;
                if (interfaceC0274w != null) {
                    interfaceC0274w.mo88a(null);
                }
                this.f352b = 0;
                this.f351a = false;
                C0046g.this.f349e = false;
            }
        }

        @Override // p000a.p031h.p043j.C0275x, p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: b */
        public void mo97b(View view) {
            if (this.f351a) {
                return;
            }
            this.f351a = true;
            InterfaceC0274w interfaceC0274w = C0046g.this.f348d;
            if (interfaceC0274w != null) {
                interfaceC0274w.mo97b(null);
            }
        }
    }

    /* renamed from: a */
    public void m161a() {
        if (this.f349e) {
            Iterator<C0273v> it = this.f345a.iterator();
            while (it.hasNext()) {
                it.next().m887b();
            }
            this.f349e = false;
        }
    }

    /* renamed from: b */
    public void m162b() {
        View view;
        if (this.f349e) {
            return;
        }
        Iterator<C0273v> it = this.f345a.iterator();
        while (it.hasNext()) {
            C0273v next = it.next();
            long j = this.f346b;
            if (j >= 0) {
                next.m888c(j);
            }
            Interpolator interpolator = this.f347c;
            if (interpolator != null && (view = next.f1632a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f348d != null) {
                next.m889d(this.f350f);
            }
            View view2 = next.f1632a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f349e = true;
    }
}
