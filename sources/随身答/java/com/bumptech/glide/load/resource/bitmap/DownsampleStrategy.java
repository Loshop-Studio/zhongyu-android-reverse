package com.bumptech.glide.load.resource.bitmap;

import p122h0.C8083c;

/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f3520a = new C5499a();

    /* renamed from: b */
    public static final DownsampleStrategy f3521b = new C5500b();

    /* renamed from: c */
    public static final DownsampleStrategy f3522c = new C5503e();

    /* renamed from: d */
    public static final DownsampleStrategy f3523d = new C5501c();

    /* renamed from: e */
    public static final DownsampleStrategy f3524e;

    /* renamed from: f */
    public static final DownsampleStrategy f3525f;

    /* renamed from: g */
    public static final DownsampleStrategy f3526g;

    /* renamed from: h */
    public static final C8083c f3527h;

    /* renamed from: i */
    public static final boolean f3528i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C5499a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            if (Math.min(i10 / i12, i9 / i11) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C5500b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            int iCeil = (int) Math.ceil(Math.max(i10 / i12, i9 / i11));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C5501c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return mo3252b(i9, i10, i11, i12) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f3522c.mo3251a(i9, i10, i11, i12);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            return Math.min(1.0f, DownsampleStrategy.f3522c.mo3252b(i9, i10, i11, i12));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C5502d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            return Math.max(i11 / i9, i12 / i10);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C5503e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return DownsampleStrategy.f3528i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            if (DownsampleStrategy.f3528i) {
                return Math.min(i11 / i9, i12 / i10);
            }
            if (Math.max(i10 / i12, i9 / i11) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C5504f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3252b(int i9, int i10, int i11, int i12) {
            return 1.0f;
        }
    }

    static {
        C5502d c5502d = new C5502d();
        f3524e = c5502d;
        f3525f = new C5504f();
        f3526g = c5502d;
        f3527h = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c5502d);
        f3528i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo3251a(int i9, int i10, int i11, int i12);

    /* renamed from: b */
    public abstract float mo3252b(int i9, int i10, int i11, int i12);
}
