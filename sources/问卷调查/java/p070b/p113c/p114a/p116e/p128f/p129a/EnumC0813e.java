package p070b.p113c.p114a.p116e.p128f.p129a;

import android.graphics.Rect;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: b.c.a.e.f.a.e */
/* loaded from: classes.dex */
public final class EnumC0813e {

    /* renamed from: c */
    public static final EnumC0813e f4533c;

    /* renamed from: d */
    public static final EnumC0813e f4534d;

    /* renamed from: e */
    public static final EnumC0813e f4535e;

    /* renamed from: f */
    public static final EnumC0813e f4536f;

    /* renamed from: g */
    public static final EnumC0813e f4537g;

    /* renamed from: h */
    public static final EnumC0813e f4538h;

    /* renamed from: i */
    public static final EnumC0813e f4539i;

    /* renamed from: j */
    public static final EnumC0813e f4540j;

    /* renamed from: k */
    public static final EnumC0813e f4541k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC0813e[] f4542l;

    /* renamed from: b */
    public AbstractC0814f f4543b;

    static {
        final EnumC0811c enumC0811c = EnumC0811c.TOP;
        final EnumC0811c enumC0811c2 = EnumC0811c.LEFT;
        EnumC0813e enumC0813e = new EnumC0813e("TOP_LEFT", 0, new AbstractC0814f(enumC0811c, enumC0811c2) { // from class: b.c.a.e.f.a.b
            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                EnumC0811c enumC0811c3 = this.f4545b;
                EnumC0811c enumC0811c4 = EnumC0811c.LEFT;
                float f6 = enumC0811c3 == enumC0811c4 ? f2 : enumC0811c4.f4530b;
                EnumC0811c enumC0811c5 = this.f4544a;
                EnumC0811c enumC0811c6 = EnumC0811c.TOP;
                float f7 = enumC0811c5 == enumC0811c6 ? f3 : enumC0811c6.f4530b;
                EnumC0811c enumC0811c7 = EnumC0811c.RIGHT;
                float f8 = enumC0811c3 == enumC0811c7 ? f2 : enumC0811c7.f4530b;
                EnumC0811c enumC0811c8 = EnumC0811c.BOTTOM;
                if ((f8 - f6) / ((enumC0811c5 == enumC0811c8 ? f3 : enumC0811c8.f4530b) - f7) > f4) {
                    C0812d c0812d = this.f4546c;
                    c0812d.f4531a = enumC0811c3;
                    c0812d.f4532b = enumC0811c5;
                } else {
                    C0812d c0812d2 = this.f4546c;
                    c0812d2.f4531a = enumC0811c5;
                    c0812d2.f4532b = enumC0811c3;
                }
                C0812d c0812d3 = this.f4546c;
                EnumC0811c enumC0811c9 = c0812d3.f4531a;
                EnumC0811c enumC0811c10 = c0812d3.f4532b;
                enumC0811c9.m2513b(f2, f3, rect, f5, f4);
                enumC0811c10.m2512a(f4);
                if (enumC0811c10.m2516e(rect, f5)) {
                    enumC0811c10.m2518g(rect);
                    enumC0811c9.m2512a(f4);
                }
            }
        });
        f4533c = enumC0813e;
        final EnumC0811c enumC0811c3 = EnumC0811c.RIGHT;
        EnumC0813e enumC0813e2 = new EnumC0813e("TOP_RIGHT", 1, new AbstractC0814f(enumC0811c, enumC0811c3) { // from class: b.c.a.e.f.a.b
            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                EnumC0811c enumC0811c32 = this.f4545b;
                EnumC0811c enumC0811c4 = EnumC0811c.LEFT;
                float f6 = enumC0811c32 == enumC0811c4 ? f2 : enumC0811c4.f4530b;
                EnumC0811c enumC0811c5 = this.f4544a;
                EnumC0811c enumC0811c6 = EnumC0811c.TOP;
                float f7 = enumC0811c5 == enumC0811c6 ? f3 : enumC0811c6.f4530b;
                EnumC0811c enumC0811c7 = EnumC0811c.RIGHT;
                float f8 = enumC0811c32 == enumC0811c7 ? f2 : enumC0811c7.f4530b;
                EnumC0811c enumC0811c8 = EnumC0811c.BOTTOM;
                if ((f8 - f6) / ((enumC0811c5 == enumC0811c8 ? f3 : enumC0811c8.f4530b) - f7) > f4) {
                    C0812d c0812d = this.f4546c;
                    c0812d.f4531a = enumC0811c32;
                    c0812d.f4532b = enumC0811c5;
                } else {
                    C0812d c0812d2 = this.f4546c;
                    c0812d2.f4531a = enumC0811c5;
                    c0812d2.f4532b = enumC0811c32;
                }
                C0812d c0812d3 = this.f4546c;
                EnumC0811c enumC0811c9 = c0812d3.f4531a;
                EnumC0811c enumC0811c10 = c0812d3.f4532b;
                enumC0811c9.m2513b(f2, f3, rect, f5, f4);
                enumC0811c10.m2512a(f4);
                if (enumC0811c10.m2516e(rect, f5)) {
                    enumC0811c10.m2518g(rect);
                    enumC0811c9.m2512a(f4);
                }
            }
        });
        f4534d = enumC0813e2;
        final EnumC0811c enumC0811c4 = EnumC0811c.BOTTOM;
        EnumC0813e enumC0813e3 = new EnumC0813e("BOTTOM_LEFT", 2, new AbstractC0814f(enumC0811c4, enumC0811c2) { // from class: b.c.a.e.f.a.b
            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                EnumC0811c enumC0811c32 = this.f4545b;
                EnumC0811c enumC0811c42 = EnumC0811c.LEFT;
                float f6 = enumC0811c32 == enumC0811c42 ? f2 : enumC0811c42.f4530b;
                EnumC0811c enumC0811c5 = this.f4544a;
                EnumC0811c enumC0811c6 = EnumC0811c.TOP;
                float f7 = enumC0811c5 == enumC0811c6 ? f3 : enumC0811c6.f4530b;
                EnumC0811c enumC0811c7 = EnumC0811c.RIGHT;
                float f8 = enumC0811c32 == enumC0811c7 ? f2 : enumC0811c7.f4530b;
                EnumC0811c enumC0811c8 = EnumC0811c.BOTTOM;
                if ((f8 - f6) / ((enumC0811c5 == enumC0811c8 ? f3 : enumC0811c8.f4530b) - f7) > f4) {
                    C0812d c0812d = this.f4546c;
                    c0812d.f4531a = enumC0811c32;
                    c0812d.f4532b = enumC0811c5;
                } else {
                    C0812d c0812d2 = this.f4546c;
                    c0812d2.f4531a = enumC0811c5;
                    c0812d2.f4532b = enumC0811c32;
                }
                C0812d c0812d3 = this.f4546c;
                EnumC0811c enumC0811c9 = c0812d3.f4531a;
                EnumC0811c enumC0811c10 = c0812d3.f4532b;
                enumC0811c9.m2513b(f2, f3, rect, f5, f4);
                enumC0811c10.m2512a(f4);
                if (enumC0811c10.m2516e(rect, f5)) {
                    enumC0811c10.m2518g(rect);
                    enumC0811c9.m2512a(f4);
                }
            }
        });
        f4535e = enumC0813e3;
        EnumC0813e enumC0813e4 = new EnumC0813e("BOTTOM_RIGHT", 3, new AbstractC0814f(enumC0811c4, enumC0811c3) { // from class: b.c.a.e.f.a.b
            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                EnumC0811c enumC0811c32 = this.f4545b;
                EnumC0811c enumC0811c42 = EnumC0811c.LEFT;
                float f6 = enumC0811c32 == enumC0811c42 ? f2 : enumC0811c42.f4530b;
                EnumC0811c enumC0811c5 = this.f4544a;
                EnumC0811c enumC0811c6 = EnumC0811c.TOP;
                float f7 = enumC0811c5 == enumC0811c6 ? f3 : enumC0811c6.f4530b;
                EnumC0811c enumC0811c7 = EnumC0811c.RIGHT;
                float f8 = enumC0811c32 == enumC0811c7 ? f2 : enumC0811c7.f4530b;
                EnumC0811c enumC0811c8 = EnumC0811c.BOTTOM;
                if ((f8 - f6) / ((enumC0811c5 == enumC0811c8 ? f3 : enumC0811c8.f4530b) - f7) > f4) {
                    C0812d c0812d = this.f4546c;
                    c0812d.f4531a = enumC0811c32;
                    c0812d.f4532b = enumC0811c5;
                } else {
                    C0812d c0812d2 = this.f4546c;
                    c0812d2.f4531a = enumC0811c5;
                    c0812d2.f4532b = enumC0811c32;
                }
                C0812d c0812d3 = this.f4546c;
                EnumC0811c enumC0811c9 = c0812d3.f4531a;
                EnumC0811c enumC0811c10 = c0812d3.f4532b;
                enumC0811c9.m2513b(f2, f3, rect, f5, f4);
                enumC0811c10.m2512a(f4);
                if (enumC0811c10.m2516e(rect, f5)) {
                    enumC0811c10.m2518g(rect);
                    enumC0811c9.m2512a(f4);
                }
            }
        });
        f4536f = enumC0813e4;
        EnumC0813e enumC0813e5 = new EnumC0813e("LEFT", 4, new AbstractC0814f(enumC0811c2) { // from class: b.c.a.e.f.a.h

            /* renamed from: d */
            public EnumC0811c f4548d;

            {
                super(null, enumC0811c2);
                this.f4548d = enumC0811c2;
            }

            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                this.f4548d.m2513b(f2, f3, rect, f5, f4);
                float f6 = EnumC0811c.LEFT.f4530b;
                EnumC0811c enumC0811c5 = EnumC0811c.TOP;
                float f7 = enumC0811c5.f4530b;
                float f8 = EnumC0811c.RIGHT.f4530b;
                EnumC0811c enumC0811c6 = EnumC0811c.BOTTOM;
                float f9 = enumC0811c6.f4530b;
                float f10 = (((f8 - f6) / f4) - (f9 - f7)) / 2.0f;
                enumC0811c5.f4530b = f7 - f10;
                enumC0811c6.f4530b = f9 + f10;
                if (enumC0811c5.m2516e(rect, f5) && !this.f4548d.m2514c(enumC0811c5, rect, f4)) {
                    enumC0811c6.m2517f(-enumC0811c5.m2518g(rect));
                    this.f4548d.m2512a(f4);
                }
                if (!enumC0811c6.m2516e(rect, f5) || this.f4548d.m2514c(enumC0811c6, rect, f4)) {
                    return;
                }
                enumC0811c5.m2517f(-enumC0811c6.m2518g(rect));
                this.f4548d.m2512a(f4);
            }
        });
        f4537g = enumC0813e5;
        EnumC0813e enumC0813e6 = new EnumC0813e("TOP", 5, new AbstractC0814f(enumC0811c) { // from class: b.c.a.e.f.a.g

            /* renamed from: d */
            public EnumC0811c f4547d;

            {
                super(enumC0811c, null);
                this.f4547d = enumC0811c;
            }

            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                this.f4547d.m2513b(f2, f3, rect, f5, f4);
                EnumC0811c enumC0811c5 = EnumC0811c.LEFT;
                float f6 = enumC0811c5.f4530b;
                float f7 = EnumC0811c.TOP.f4530b;
                EnumC0811c enumC0811c6 = EnumC0811c.RIGHT;
                float f8 = enumC0811c6.f4530b;
                float f9 = (((EnumC0811c.BOTTOM.f4530b - f7) * f4) - (f8 - f6)) / 2.0f;
                enumC0811c5.f4530b = f6 - f9;
                enumC0811c6.f4530b = f8 + f9;
                if (enumC0811c5.m2516e(rect, f5) && !this.f4547d.m2514c(enumC0811c5, rect, f4)) {
                    enumC0811c6.m2517f(-enumC0811c5.m2518g(rect));
                    this.f4547d.m2512a(f4);
                }
                if (!enumC0811c6.m2516e(rect, f5) || this.f4547d.m2514c(enumC0811c6, rect, f4)) {
                    return;
                }
                enumC0811c5.m2517f(-enumC0811c6.m2518g(rect));
                this.f4547d.m2512a(f4);
            }
        });
        f4538h = enumC0813e6;
        EnumC0813e enumC0813e7 = new EnumC0813e("RIGHT", 6, new AbstractC0814f(enumC0811c3) { // from class: b.c.a.e.f.a.h

            /* renamed from: d */
            public EnumC0811c f4548d;

            {
                super(null, enumC0811c3);
                this.f4548d = enumC0811c3;
            }

            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                this.f4548d.m2513b(f2, f3, rect, f5, f4);
                float f6 = EnumC0811c.LEFT.f4530b;
                EnumC0811c enumC0811c5 = EnumC0811c.TOP;
                float f7 = enumC0811c5.f4530b;
                float f8 = EnumC0811c.RIGHT.f4530b;
                EnumC0811c enumC0811c6 = EnumC0811c.BOTTOM;
                float f9 = enumC0811c6.f4530b;
                float f10 = (((f8 - f6) / f4) - (f9 - f7)) / 2.0f;
                enumC0811c5.f4530b = f7 - f10;
                enumC0811c6.f4530b = f9 + f10;
                if (enumC0811c5.m2516e(rect, f5) && !this.f4548d.m2514c(enumC0811c5, rect, f4)) {
                    enumC0811c6.m2517f(-enumC0811c5.m2518g(rect));
                    this.f4548d.m2512a(f4);
                }
                if (!enumC0811c6.m2516e(rect, f5) || this.f4548d.m2514c(enumC0811c6, rect, f4)) {
                    return;
                }
                enumC0811c5.m2517f(-enumC0811c6.m2518g(rect));
                this.f4548d.m2512a(f4);
            }
        });
        f4539i = enumC0813e7;
        EnumC0813e enumC0813e8 = new EnumC0813e("BOTTOM", 7, new AbstractC0814f(enumC0811c4) { // from class: b.c.a.e.f.a.g

            /* renamed from: d */
            public EnumC0811c f4547d;

            {
                super(enumC0811c4, null);
                this.f4547d = enumC0811c4;
            }

            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                this.f4547d.m2513b(f2, f3, rect, f5, f4);
                EnumC0811c enumC0811c5 = EnumC0811c.LEFT;
                float f6 = enumC0811c5.f4530b;
                float f7 = EnumC0811c.TOP.f4530b;
                EnumC0811c enumC0811c6 = EnumC0811c.RIGHT;
                float f8 = enumC0811c6.f4530b;
                float f9 = (((EnumC0811c.BOTTOM.f4530b - f7) * f4) - (f8 - f6)) / 2.0f;
                enumC0811c5.f4530b = f6 - f9;
                enumC0811c6.f4530b = f8 + f9;
                if (enumC0811c5.m2516e(rect, f5) && !this.f4547d.m2514c(enumC0811c5, rect, f4)) {
                    enumC0811c6.m2517f(-enumC0811c5.m2518g(rect));
                    this.f4547d.m2512a(f4);
                }
                if (!enumC0811c6.m2516e(rect, f5) || this.f4547d.m2514c(enumC0811c6, rect, f4)) {
                    return;
                }
                enumC0811c5.m2517f(-enumC0811c6.m2518g(rect));
                this.f4547d.m2512a(f4);
            }
        });
        f4540j = enumC0813e8;
        EnumC0813e enumC0813e9 = new EnumC0813e("CENTER", 8, new AbstractC0814f() { // from class: b.c.a.e.f.a.a
            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: a */
            public void mo2510a(float f2, float f3, float f4, Rect rect, float f5) {
                mo2511b(f2, f3, rect, f5);
            }

            @Override // p070b.p113c.p114a.p116e.p128f.p129a.AbstractC0814f
            /* renamed from: b */
            public void mo2511b(float f2, float f3, Rect rect, float f4) {
                EnumC0811c enumC0811c5 = EnumC0811c.LEFT;
                float f5 = enumC0811c5.f4530b;
                EnumC0811c enumC0811c6 = EnumC0811c.TOP;
                float f6 = enumC0811c6.f4530b;
                EnumC0811c enumC0811c7 = EnumC0811c.RIGHT;
                float f7 = enumC0811c7.f4530b;
                EnumC0811c enumC0811c8 = EnumC0811c.BOTTOM;
                float f8 = f2 - ((f5 + f7) / 2.0f);
                float f9 = f3 - ((f6 + enumC0811c8.f4530b) / 2.0f);
                enumC0811c5.m2517f(f8);
                enumC0811c6.m2517f(f9);
                enumC0811c7.m2517f(f8);
                enumC0811c8.m2517f(f9);
                if (enumC0811c5.m2516e(rect, f4)) {
                    enumC0811c7.m2517f(enumC0811c5.m2518g(rect));
                } else if (enumC0811c7.m2516e(rect, f4)) {
                    enumC0811c5.m2517f(enumC0811c7.m2518g(rect));
                }
                if (enumC0811c6.m2516e(rect, f4)) {
                    enumC0811c8.m2517f(enumC0811c6.m2518g(rect));
                } else if (enumC0811c8.m2516e(rect, f4)) {
                    enumC0811c6.m2517f(enumC0811c8.m2518g(rect));
                }
            }
        });
        f4541k = enumC0813e9;
        f4542l = new EnumC0813e[]{enumC0813e, enumC0813e2, enumC0813e3, enumC0813e4, enumC0813e5, enumC0813e6, enumC0813e7, enumC0813e8, enumC0813e9};
    }

    public EnumC0813e(String str, int i, AbstractC0814f abstractC0814f) {
        this.f4543b = abstractC0814f;
    }

    public static EnumC0813e valueOf(String str) {
        return (EnumC0813e) Enum.valueOf(EnumC0813e.class, str);
    }

    public static EnumC0813e[] values() {
        return (EnumC0813e[]) f4542l.clone();
    }
}
