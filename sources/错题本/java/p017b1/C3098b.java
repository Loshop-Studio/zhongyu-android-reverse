package p017b1;

import android.animation.TypeEvaluator;
import android.support.v4.media.AbstractC0037f;

/* renamed from: b1.b */
/* loaded from: classes2.dex */
public final class C3098b implements TypeEvaluator {

    /* renamed from: a */
    public final /* synthetic */ int f1533a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.f1533a) {
            case 0:
                C3097a c3097a = (C3097a) obj;
                C3097a c3097a2 = (C3097a) obj2;
                float f7 = c3097a.f1531a;
                float fM77b = AbstractC0037f.m77b(c3097a2.f1531a, f7, f, f7);
                float f8 = c3097a.f1532b;
                float fM77b2 = AbstractC0037f.m77b(c3097a2.f1532b, f8, f, f8);
                C3097a c3097a3 = new C3097a();
                c3097a3.f1531a = fM77b;
                c3097a3.f1532b = fM77b2;
                return c3097a3;
            default:
                C3100d c3100d = (C3100d) obj;
                C3100d c3100d2 = (C3100d) obj2;
                float f9 = c3100d.f1536a;
                float fM77b3 = AbstractC0037f.m77b(c3100d2.f1536a, f9, f, f9);
                float f10 = c3100d.f1537b;
                float fM77b4 = AbstractC0037f.m77b(c3100d2.f1537b, f10, f, f10);
                C3100d c3100d3 = new C3100d();
                c3100d3.f1536a = fM77b3;
                c3100d3.f1537b = fM77b4;
                return c3100d3;
        }
    }
}
