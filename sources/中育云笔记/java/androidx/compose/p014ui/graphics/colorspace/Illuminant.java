package androidx.compose.p014ui.graphics.colorspace;

/* loaded from: classes2.dex */
public final class Illuminant {
    public static final Illuminant INSTANCE = new Illuminant();

    /* renamed from: A */
    private static final WhitePoint f1146A = new WhitePoint(0.44757f, 0.40745f);

    /* renamed from: B */
    private static final WhitePoint f1147B = new WhitePoint(0.34842f, 0.35161f);

    /* renamed from: C */
    private static final WhitePoint f1148C = new WhitePoint(0.31006f, 0.31616f);
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* renamed from: E */
    private static final WhitePoint f1149E = new WhitePoint(0.33333f, 0.33333f);
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private Illuminant() {
    }

    public final WhitePoint getA() {
        return f1146A;
    }

    public final WhitePoint getB() {
        return f1147B;
    }

    public final WhitePoint getC() {
        return f1148C;
    }

    public final WhitePoint getD50() {
        return D50;
    }

    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    public final WhitePoint getD55() {
        return D55;
    }

    public final WhitePoint getD60() {
        return D60;
    }

    public final WhitePoint getD65() {
        return D65;
    }

    public final WhitePoint getD75() {
        return D75;
    }

    public final WhitePoint getE() {
        return f1149E;
    }

    public final float[] newD50Xyz$ui_graphics_release() {
        return new float[]{0.964212f, 1.0f, 0.825188f};
    }
}
