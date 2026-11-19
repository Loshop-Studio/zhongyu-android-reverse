package com.bumptech.glide.load.resource.bitmap;

import p160l.C9229c;

/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f3157a = new C5437a();

    /* renamed from: b */
    public static final DownsampleStrategy f3158b = new C5438b();

    /* renamed from: c */
    public static final DownsampleStrategy f3159c = new C5441e();

    /* renamed from: d */
    public static final DownsampleStrategy f3160d = new C5439c();

    /* renamed from: e */
    public static final DownsampleStrategy f3161e;

    /* renamed from: f */
    public static final DownsampleStrategy f3162f;

    /* renamed from: g */
    public static final DownsampleStrategy f3163g;

    /* renamed from: h */
    public static final C9229c f3164h;

    /* renamed from: i */
    public static final boolean f3165i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C5437a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C5438b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C5439c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return mo3046b(i10, i11, i12, i13) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f3159c.mo3045a(i10, i11, i12, i13);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, DownsampleStrategy.f3159c.mo3046b(i10, i11, i12, i13));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C5440d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C5441e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return DownsampleStrategy.f3165i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            if (DownsampleStrategy.f3165i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C5442f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo3046b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        C5440d c5440d = new C5440d();
        f3161e = c5440d;
        f3162f = new C5442f();
        f3163g = c5440d;
        f3164h = C9229c.m16935f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c5440d);
        f3165i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo3045a(int i10, int i11, int i12, int i13);

    /* renamed from: b */
    public abstract float mo3046b(int i10, int i11, int i12, int i13);
}
