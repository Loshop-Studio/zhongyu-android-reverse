package p024b5;

/* renamed from: b5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC4982a {
    /* renamed from: a */
    public static final float m2461a(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: b */
    public static final float m2462b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM2461a = m2461a(f10, f11, f12, f13);
        float fM2461a2 = m2461a(f10, f11, f14, f15);
        float fM2461a3 = m2461a(f12, f13, f14, f15);
        if (fM2461a3 + fM2461a2 == fM2461a) {
            return 0.0f;
        }
        double d10 = fM2461a;
        if (d10 <= 1.0E-6d) {
            return fM2461a2;
        }
        float f16 = fM2461a3 * fM2461a3;
        float f17 = fM2461a * fM2461a;
        float f18 = fM2461a2 * fM2461a2;
        if (f16 >= f17 + f18) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x1,y1)为直角或钝角  ");
            return fM2461a2;
        }
        if (f18 >= f17 + f16) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x2,y2)为直角或钝角 ");
            return fM2461a3;
        }
        System.out.println((Object) "组成锐角三角形，则求三角形的高  ");
        float f19 = ((fM2461a + fM2461a2) + fM2461a3) / 2;
        return (float) ((2 * Math.sqrt((((f19 - fM2461a) * f19) * (f19 - fM2461a2)) * (f19 - fM2461a3))) / d10);
    }
}
