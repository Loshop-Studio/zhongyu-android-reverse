package p077i0;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding;
import p202y.C6762e;

/* renamed from: i0.k */
/* loaded from: classes2.dex */
public final class C5655k {

    /* renamed from: b */
    public static final C5655k f8794b = new C5655k(2);

    /* renamed from: c */
    public static final C5655k f8795c = new C5655k(0);

    /* renamed from: d */
    public static final C5655k f8796d;

    /* renamed from: e */
    public static final C5655k f8797e;

    /* renamed from: f */
    public static final C5655k f8798f;

    /* renamed from: g */
    public static final C6762e f8799g;

    /* renamed from: h */
    public static final boolean f8800h;

    /* renamed from: a */
    public final /* synthetic */ int f8801a;

    static {
        C5655k c5655k = new C5655k(1);
        f8796d = c5655k;
        f8797e = new C5655k(3);
        f8798f = c5655k;
        f8799g = C6762e.m6435a(c5655k, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f8800h = true;
    }

    public /* synthetic */ C5655k(int i) {
        this.f8801a = i;
    }

    /* renamed from: a */
    public final DownsampleStrategy$SampleSizeRounding m4985a(int i, int i8, int i9, int i10) {
        switch (this.f8801a) {
            case 0:
                return m4986b(i, i8, i9, i10) == 1.0f ? DownsampleStrategy$SampleSizeRounding.QUALITY : f8794b.m4985a(i, i8, i9, i10);
            case 1:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
            case 2:
                return f8800h ? DownsampleStrategy$SampleSizeRounding.QUALITY : DownsampleStrategy$SampleSizeRounding.MEMORY;
            default:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: b */
    public final float m4986b(int i, int i8, int i9, int i10) {
        switch (this.f8801a) {
            case 0:
                return Math.min(1.0f, f8794b.m4986b(i, i8, i9, i10));
            case 1:
                return Math.max(i9 / i, i10 / i8);
            case 2:
                if (f8800h) {
                    return Math.min(i9 / i, i10 / i8);
                }
                if (Math.max(i8 / i10, i / i9) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
