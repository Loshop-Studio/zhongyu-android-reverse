package com.bumptech.glide.load.resource.bitmap;

import p162m0.C8538c;

/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f3724a = new C5388a();

    /* renamed from: b */
    public static final DownsampleStrategy f3725b = new C5389b();

    /* renamed from: c */
    public static final DownsampleStrategy f3726c = new C5392e();

    /* renamed from: d */
    public static final DownsampleStrategy f3727d = new C5390c();

    /* renamed from: e */
    public static final DownsampleStrategy f3728e;

    /* renamed from: f */
    public static final DownsampleStrategy f3729f;

    /* renamed from: g */
    public static final DownsampleStrategy f3730g;

    /* renamed from: h */
    public static final C8538c f3731h;

    /* renamed from: i */
    public static final boolean f3732i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C5388a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C5389b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C5390c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return mo3601b(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f3726c.mo3600a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f3726c.mo3601b(i10, i11, i12, i13));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C5391d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C5392e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f3732i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f3732i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C5393f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3601b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        C5391d c5391d = new C5391d();
        f3728e = c5391d;
        f3729f = new C5393f();
        f3730g = c5391d;
        f3731h = C8538c.m14052f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c5391d);
        f3732i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo3600a(int i10, int i11, int i12, int i13);

    /* renamed from: b */
    public abstract float mo3601b(int i10, int i11, int i12, int i13);
}
