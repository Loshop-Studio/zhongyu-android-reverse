package com.bumptech.glide.load.resource.bitmap;

import p076j.C3793c;

/* loaded from: classes2.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f866a = new C2886a();

    /* renamed from: b */
    public static final DownsampleStrategy f867b = new C2887b();

    /* renamed from: c */
    public static final DownsampleStrategy f868c = new C2890e();

    /* renamed from: d */
    public static final DownsampleStrategy f869d = new C2888c();

    /* renamed from: e */
    public static final DownsampleStrategy f870e;

    /* renamed from: f */
    public static final DownsampleStrategy f871f;

    /* renamed from: g */
    public static final DownsampleStrategy f872g;

    /* renamed from: h */
    public static final C3793c f873h;

    /* renamed from: i */
    public static final boolean f874i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C2886a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            if (Math.min(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C2887b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            int iCeil = (int) Math.ceil(Math.max(i5 / i7, i4 / i6));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C2888c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return mo1928b(i4, i5, i6, i7) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f868c.mo1927a(i4, i5, i6, i7);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            return Math.min(1.0f, DownsampleStrategy.f868c.mo1928b(i4, i5, i6, i7));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C2889d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            return Math.max(i6 / i4, i7 / i5);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C2890e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return DownsampleStrategy.f874i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            if (DownsampleStrategy.f874i) {
                return Math.min(i6 / i4, i7 / i5);
            }
            if (Math.max(i5 / i7, i4 / i6) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C2891f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo1928b(int i4, int i5, int i6, int i7) {
            return 1.0f;
        }
    }

    static {
        C2889d c2889d = new C2889d();
        f870e = c2889d;
        f871f = new C2891f();
        f872g = c2889d;
        f873h = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c2889d);
        f874i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo1927a(int i4, int i5, int i6, int i7);

    /* renamed from: b */
    public abstract float mo1928b(int i4, int i5, int i6, int i7);
}
