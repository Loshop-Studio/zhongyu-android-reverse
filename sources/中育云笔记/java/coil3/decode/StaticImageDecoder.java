package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import be.InterfaceC5195g;
import coil3.InterfaceC5470e;
import coil3.decode.InterfaceC5461a;
import coil3.decode.StaticImageDecoder;
import coil3.size.Precision;
import kotlin.jvm.internal.Ref$BooleanRef;
import p001a0.AbstractC0003a;
import p001a0.AbstractC0018o;
import p211jd.AbstractC9719c;
import p228l.AbstractC10077j0;
import p228l.C10072h;
import p253n.C10286p;
import p380w.AbstractC11628h;
import p380w.AbstractC11630j;
import p380w.C11634n;

/* loaded from: classes3.dex */
public final class StaticImageDecoder implements InterfaceC5461a {

    /* renamed from: a */
    public final ImageDecoder.Source f3616a;

    /* renamed from: b */
    public final AutoCloseable f3617b;

    /* renamed from: c */
    public final C11634n f3618c;

    /* renamed from: d */
    public final InterfaceC5195g f3619d;

    /* renamed from: coil3.decode.StaticImageDecoder$a */
    public static final class C5459a implements InterfaceC5461a.a {

        /* renamed from: a */
        public final InterfaceC5195g f3620a;

        public C5459a(InterfaceC5195g interfaceC5195g) {
            this.f3620a = interfaceC5195g;
        }

        @Override // coil3.decode.InterfaceC5461a.a
        /* renamed from: a */
        public InterfaceC5461a mo3063a(C10286p c10286p, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            ImageDecoder.Source sourceM21077b;
            if (m3070b(c11634n) && (sourceM21077b = AbstractC10077j0.m21077b(c10286p.m21419b(), c11634n, false)) != null) {
                return new StaticImageDecoder(sourceM21077b, c10286p.m21419b(), c11634n, this.f3620a);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m3070b(C11634n c11634n) {
            Bitmap.Config configM25733j = AbstractC11630j.m25733j(c11634n);
            return configM25733j == Bitmap.Config.ARGB_8888 || configM25733j == Bitmap.Config.HARDWARE;
        }
    }

    /* renamed from: coil3.decode.StaticImageDecoder$b */
    public static final class C5460b implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: b */
        public final /* synthetic */ Ref$BooleanRef f3622b;

        public C5460b(Ref$BooleanRef ref$BooleanRef) {
            this.f3622b = ref$BooleanRef;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jM21068b = C10072h.m21068b(width, height, StaticImageDecoder.this.f3618c.m25751k(), StaticImageDecoder.this.f3618c.m25750j(), AbstractC11628h.m25722d(StaticImageDecoder.this.f3618c));
            int iM34c = AbstractC0018o.m34c(jM21068b);
            int iM35d = AbstractC0018o.m35d(jM21068b);
            if (width > 0 && height > 0 && (width != iM34c || height != iM35d)) {
                double dM21070d = C10072h.m21070d(width, height, iM34c, iM35d, StaticImageDecoder.this.f3618c.m25750j());
                Ref$BooleanRef ref$BooleanRef = this.f3622b;
                boolean z10 = dM21070d < 1.0d;
                ref$BooleanRef.f23398c = z10;
                if (z10 || StaticImageDecoder.this.f3618c.m25749i() == Precision.f3906c) {
                    imageDecoder.setTargetSize(AbstractC9719c.m19281c(width * dM21070d), AbstractC9719c.m19281c(dM21070d * height));
                }
            }
            StaticImageDecoder.this.m3069e(imageDecoder);
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, C11634n c11634n, InterfaceC5195g interfaceC5195g) {
        this.f3616a = source;
        this.f3617b = autoCloseable;
        this.f3618c = c11634n;
        this.f3619d = interfaceC5195g;
    }

    /* renamed from: f */
    public static final boolean m3068f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5461a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3058a(vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.f3627g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3627g = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3625e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3627g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f3623c
            be.g r0 = (be.InterfaceC5195g) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.AbstractC9924b.m20071b(r8)
            be.g r8 = r7.f3619d
            r0.f3623c = r8
            r0.f3624d = r3
            r0.f3627g = r4
            java.lang.Object r0 = r8.m2749b(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r8
        L49:
            java.lang.AutoCloseable r8 = r7.f3617b     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$Source r2 = r7.f3616a     // Catch: java.lang.Throwable -> L74
            coil3.decode.StaticImageDecoder$b r5 = new coil3.decode.StaticImageDecoder$b     // Catch: java.lang.Throwable -> L74
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$OnHeaderDecodedListener r5 = androidx.core.graphics.AbstractC3423r.m1538a(r5)     // Catch: java.lang.Throwable -> L74
            android.graphics.Bitmap r2 = androidx.core.graphics.AbstractC3425t.m1540a(r2, r5)     // Catch: java.lang.Throwable -> L74
            l.g r5 = new l.g     // Catch: java.lang.Throwable -> L74
            r6 = 0
            k.a r2 = p212k.AbstractC9761o.m19681d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.f23398c     // Catch: java.lang.Throwable -> L74
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L74
            p152fd.AbstractC9223a.m18142a(r8, r6)     // Catch: java.lang.Throwable -> L72
            r0.release()
            return r5
        L72:
            r8 = move-exception
            goto L7b
        L74:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r2 = move-exception
            p152fd.AbstractC9223a.m18142a(r8, r1)     // Catch: java.lang.Throwable -> L72
            throw r2     // Catch: java.lang.Throwable -> L72
        L7b:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.mo3058a(vc.c):java.lang.Object");
    }

    /* renamed from: e */
    public final void m3069e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: l.a0
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return StaticImageDecoder.m3068f(decodeException);
            }
        });
        imageDecoder.setAllocator(AbstractC0003a.m6d(AbstractC11630j.m25733j(this.f3618c)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!AbstractC11630j.m25731h(this.f3618c) ? 1 : 0);
        if (AbstractC11630j.m25735l(this.f3618c) != null) {
            imageDecoder.setTargetColorSpace(AbstractC11630j.m25735l(this.f3618c));
        }
        imageDecoder.setUnpremultipliedRequired(!AbstractC11630j.m25737n(this.f3618c));
    }
}
