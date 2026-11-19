package la;

/* renamed from: la.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10163a {
    /* renamed from: a */
    public static final float m21210a(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: b */
    public static final float m21211b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM21210a = m21210a(f10, f11, f12, f13);
        float fM21210a2 = m21210a(f10, f11, f14, f15);
        float fM21210a3 = m21210a(f12, f13, f14, f15);
        if (fM21210a3 + fM21210a2 == fM21210a) {
            return 0.0f;
        }
        double d10 = fM21210a;
        if (d10 <= 1.0E-6d) {
            return fM21210a2;
        }
        float f16 = fM21210a3 * fM21210a3;
        float f17 = fM21210a * fM21210a;
        float f18 = fM21210a2 * fM21210a2;
        if (f16 >= f17 + f18) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x1,y1)为直角或钝角  ");
            return fM21210a2;
        }
        if (f18 >= f17 + f16) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x2,y2)为直角或钝角 ");
            return fM21210a3;
        }
        System.out.println((Object) "组成锐角三角形，则求三角形的高  ");
        float f19 = ((fM21210a + fM21210a2) + fM21210a3) / 2;
        return (float) ((2 * Math.sqrt((((f19 - fM21210a) * f19) * (f19 - fM21210a2)) * (f19 - fM21210a3))) / d10);
    }
}
