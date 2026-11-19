package com.bumptech.glide.load.resource.bitmap;

import p168h0.C9437d;

/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f4927a = new C5856a();

    /* renamed from: b */
    public static final DownsampleStrategy f4928b = new C5857b();

    /* renamed from: c */
    public static final DownsampleStrategy f4929c = new C5860e();

    /* renamed from: d */
    public static final DownsampleStrategy f4930d = new C5858c();

    /* renamed from: e */
    public static final DownsampleStrategy f4931e;

    /* renamed from: f */
    public static final DownsampleStrategy f4932f;

    /* renamed from: g */
    public static final DownsampleStrategy f4933g;

    /* renamed from: h */
    public static final C9437d f4934h;

    /* renamed from: i */
    public static final boolean f4935i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C5856a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C5857b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C5858c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return mo4250b(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f4929c.mo4249a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f4929c.mo4250b(i10, i11, i12, i13));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C5859d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C5860e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f4935i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f4935i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C5861f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo4250b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        C5859d c5859d = new C5859d();
        f4931e = c5859d;
        f4932f = new C5861f();
        f4933g = c5859d;
        f4934h = C9437d.m18621f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c5859d);
        f4935i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo4249a(int i10, int i11, int i12, int i13);

    /* renamed from: b */
    public abstract float mo4250b(int i10, int i11, int i12, int i13);
}
