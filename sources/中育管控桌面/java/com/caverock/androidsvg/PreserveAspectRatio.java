package com.caverock.androidsvg;

/* loaded from: classes3.dex */
public class PreserveAspectRatio {

    /* renamed from: c */
    public static final PreserveAspectRatio f2746c = new PreserveAspectRatio(null, null);

    /* renamed from: d */
    public static final PreserveAspectRatio f2747d = new PreserveAspectRatio(Alignment.none, null);

    /* renamed from: e */
    public static final PreserveAspectRatio f2748e;

    /* renamed from: f */
    public static final PreserveAspectRatio f2749f;

    /* renamed from: g */
    public static final PreserveAspectRatio f2750g;

    /* renamed from: h */
    public static final PreserveAspectRatio f2751h;

    /* renamed from: i */
    public static final PreserveAspectRatio f2752i;

    /* renamed from: j */
    public static final PreserveAspectRatio f2753j;

    /* renamed from: k */
    public static final PreserveAspectRatio f2754k;

    /* renamed from: a */
    public Alignment f2755a;

    /* renamed from: b */
    public Scale f2756b;

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
        f2748e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f2749f = new PreserveAspectRatio(alignment2, scale);
        f2750g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f2751h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f2752i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f2753j = new PreserveAspectRatio(alignment, scale2);
        f2754k = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f2755a = alignment;
        this.f2756b = scale;
    }

    /* renamed from: a */
    public Alignment m2979a() {
        return this.f2755a;
    }

    /* renamed from: b */
    public Scale m2980b() {
        return this.f2756b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f2755a == preserveAspectRatio.f2755a && this.f2756b == preserveAspectRatio.f2756b;
    }

    public String toString() {
        return this.f2755a + " " + this.f2756b;
    }
}
