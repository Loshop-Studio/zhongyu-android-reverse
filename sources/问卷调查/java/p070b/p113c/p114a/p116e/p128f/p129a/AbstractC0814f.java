package p070b.p113c.p114a.p116e.p128f.p129a;

import android.graphics.Rect;

/* renamed from: b.c.a.e.f.a.f */
/* loaded from: classes.dex */
public abstract class AbstractC0814f {

    /* renamed from: a */
    public EnumC0811c f4544a;

    /* renamed from: b */
    public EnumC0811c f4545b;

    /* renamed from: c */
    public C0812d f4546c;

    public AbstractC0814f(EnumC0811c enumC0811c, EnumC0811c enumC0811c2) {
        this.f4544a = enumC0811c;
        this.f4545b = enumC0811c2;
        this.f4546c = new C0812d(enumC0811c, enumC0811c2);
    }

    /* renamed from: a */
    public abstract void mo2510a(float f2, float f3, float f4, Rect rect, float f5);

    /* renamed from: b */
    public void mo2511b(float f2, float f3, Rect rect, float f4) {
        C0812d c0812d = this.f4546c;
        EnumC0811c enumC0811c = c0812d.f4531a;
        EnumC0811c enumC0811c2 = c0812d.f4532b;
        if (enumC0811c != null) {
            enumC0811c.m2513b(f2, f3, rect, f4, 1.0f);
        }
        if (enumC0811c2 != null) {
            enumC0811c2.m2513b(f2, f3, rect, f4, 1.0f);
        }
    }
}
