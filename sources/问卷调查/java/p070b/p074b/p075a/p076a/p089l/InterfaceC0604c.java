package p070b.p074b.p075a.p076a.p089l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p070b.p074b.p075a.p076a.C0562a;

/* renamed from: b.b.a.a.l.c */
/* loaded from: classes.dex */
public interface InterfaceC0604c {

    /* renamed from: b.b.a.a.l.c$b */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b */
        public static final TypeEvaluator<e> f3695b = new b();

        /* renamed from: a */
        public final e f3696a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f2, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f3696a;
            float fM2091l = C0562a.m2091l(eVar3.f3699a, eVar4.f3699a, f2);
            float fM2091l2 = C0562a.m2091l(eVar3.f3700b, eVar4.f3700b, f2);
            float fM2091l3 = C0562a.m2091l(eVar3.f3701c, eVar4.f3701c, f2);
            eVar5.f3699a = fM2091l;
            eVar5.f3700b = fM2091l2;
            eVar5.f3701c = fM2091l3;
            return this.f3696a;
        }
    }

    /* renamed from: b.b.a.a.l.c$c */
    public static class c extends Property<InterfaceC0604c, e> {

        /* renamed from: a */
        public static final Property<InterfaceC0604c, e> f3697a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(InterfaceC0604c interfaceC0604c) {
            return interfaceC0604c.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(InterfaceC0604c interfaceC0604c, e eVar) {
            interfaceC0604c.setRevealInfo(eVar);
        }
    }

    /* renamed from: b.b.a.a.l.c$d */
    public static class d extends Property<InterfaceC0604c, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC0604c, Integer> f3698a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(InterfaceC0604c interfaceC0604c) {
            return Integer.valueOf(interfaceC0604c.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(InterfaceC0604c interfaceC0604c, Integer num) {
            interfaceC0604c.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: b.b.a.a.l.c$e */
    public static class e {

        /* renamed from: a */
        public float f3699a;

        /* renamed from: b */
        public float f3700b;

        /* renamed from: c */
        public float f3701c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.f3699a = f2;
            this.f3700b = f3;
            this.f3701c = f4;
        }

        public e(a aVar) {
        }
    }

    /* renamed from: a */
    void mo2174a();

    /* renamed from: b */
    void mo2175b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
