package com.caverock.androidsvg;

/* loaded from: classes3.dex */
public class PreserveAspectRatio {

    /* renamed from: c */
    public static final PreserveAspectRatio f4067c = new PreserveAspectRatio(null, null);

    /* renamed from: d */
    public static final PreserveAspectRatio f4068d = new PreserveAspectRatio(Alignment.none, null);

    /* renamed from: e */
    public static final PreserveAspectRatio f4069e;

    /* renamed from: f */
    public static final PreserveAspectRatio f4070f;

    /* renamed from: g */
    public static final PreserveAspectRatio f4071g;

    /* renamed from: h */
    public static final PreserveAspectRatio f4072h;

    /* renamed from: i */
    public static final PreserveAspectRatio f4073i;

    /* renamed from: j */
    public static final PreserveAspectRatio f4074j;

    /* renamed from: k */
    public static final PreserveAspectRatio f4075k;

    /* renamed from: a */
    public Alignment f4076a;

    /* renamed from: b */
    public Scale f4077b;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        f4069e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f4070f = new PreserveAspectRatio(alignment2, scale);
        f4071g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f4072h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f4073i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f4074j = new PreserveAspectRatio(alignment, scale2);
        f4075k = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f4076a = alignment;
        this.f4077b = scale;
    }

    /* renamed from: a */
    public Alignment m3666a() {
        return this.f4076a;
    }

    /* renamed from: b */
    public Scale m3667b() {
        return this.f4077b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f4076a == preserveAspectRatio.f4076a && this.f4077b == preserveAspectRatio.f4077b;
    }

    public String toString() {
        return this.f4076a + " " + this.f4077b;
    }
}
