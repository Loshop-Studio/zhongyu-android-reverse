package p233r5;

/* renamed from: r5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9430a {
    /* renamed from: a */
    public static final float m15572a(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: b */
    public static final float m15573b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM15572a = m15572a(f10, f11, f12, f13);
        float fM15572a2 = m15572a(f10, f11, f14, f15);
        float fM15572a3 = m15572a(f12, f13, f14, f15);
        if (fM15572a3 + fM15572a2 == fM15572a) {
            return 0.0f;
        }
        double d10 = fM15572a;
        if (d10 <= 1.0E-6d) {
            return fM15572a2;
        }
        float f16 = fM15572a3 * fM15572a3;
        float f17 = fM15572a * fM15572a;
        float f18 = fM15572a2 * fM15572a2;
        if (f16 >= f17 + f18) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x1,y1)为直角或钝角  ");
            return fM15572a2;
        }
        if (f18 >= f17 + f16) {
            System.out.println((Object) "组成直角三角形或钝角三角形，(x2,y2)为直角或钝角 ");
            return fM15572a3;
        }
        System.out.println((Object) "组成锐角三角形，则求三角形的高  ");
        float f19 = ((fM15572a + fM15572a2) + fM15572a3) / 2;
        return (float) ((2 * Math.sqrt((((f19 - fM15572a) * f19) * (f19 - fM15572a2)) * (f19 - fM15572a3))) / d10);
    }
}
