package com.bumptech.glide.load.resource.bitmap;

import p053f0.C6284c;

/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f2515a = new C4724a();

    /* renamed from: b */
    public static final DownsampleStrategy f2516b = new C4725b();

    /* renamed from: c */
    public static final DownsampleStrategy f2517c = new C4728e();

    /* renamed from: d */
    public static final DownsampleStrategy f2518d = new C4726c();

    /* renamed from: e */
    public static final DownsampleStrategy f2519e;

    /* renamed from: f */
    public static final DownsampleStrategy f2520f;

    /* renamed from: g */
    public static final DownsampleStrategy f2521g;

    /* renamed from: h */
    public static final C6284c f2522h;

    /* renamed from: i */
    public static final boolean f2523i;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C4724a extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            if (Math.min(i7 / i9, i6 / i8) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C4725b extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            int iCeil = (int) Math.ceil(Math.max(i7 / i9, i6 / i8));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C4726c extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return mo2781b(i6, i7, i8, i9) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f2517c.mo2780a(i6, i7, i8, i9);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            return Math.min(1.0f, DownsampleStrategy.f2517c.mo2781b(i6, i7, i8, i9));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C4727d extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            return Math.max(i8 / i6, i9 / i7);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C4728e extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return DownsampleStrategy.f2523i ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            if (DownsampleStrategy.f2523i) {
                return Math.min(i8 / i6, i9 / i7);
            }
            if (Math.max(i7 / i9, i6 / i8) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C4729f extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: a */
        public SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        /* renamed from: b */
        public float mo2781b(int i6, int i7, int i8, int i9) {
            return 1.0f;
        }
    }

    static {
        C4727d c4727d = new C4727d();
        f2519e = c4727d;
        f2520f = new C4729f();
        f2521g = c4727d;
        f2522h = C6284c.m6415f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c4727d);
        f2523i = true;
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo2780a(int i6, int i7, int i8, int i9);

    /* renamed from: b */
    public abstract float mo2781b(int i6, int i7, int i8, int i9);
}
