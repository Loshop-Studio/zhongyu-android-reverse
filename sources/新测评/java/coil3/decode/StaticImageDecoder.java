package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import coil3.InterfaceC5193e;
import coil3.decode.InterfaceC5184a;
import coil3.decode.StaticImageDecoder;
import coil3.size.Precision;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.sync.Semaphore;
import p030c0.AbstractC5075a;
import p030c0.AbstractC5090o;
import p172n.AbstractC8595j0;
import p172n.C8590h;
import p194p.C8800p;
import p290y.AbstractC9887f;
import p290y.AbstractC9888g;
import p290y.C9892k;

/* loaded from: classes3.dex */
public final class StaticImageDecoder implements InterfaceC5184a {

    /* renamed from: a */
    public final ImageDecoder.Source f2941a;

    /* renamed from: b */
    public final AutoCloseable f2942b;

    /* renamed from: c */
    public final C9892k f2943c;

    /* renamed from: d */
    public final Semaphore f2944d;

    /* renamed from: coil3.decode.StaticImageDecoder$a */
    public static final class C5182a implements InterfaceC5184a.a {

        /* renamed from: a */
        public final Semaphore f2945a;

        public C5182a(Semaphore semaphore) {
            this.f2945a = semaphore;
        }

        @Override // coil3.decode.InterfaceC5184a.a
        /* renamed from: a */
        public InterfaceC5184a mo2969a(C8800p c8800p, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            ImageDecoder.Source sourceM14144b;
            if (m2976b(c9892k) && (sourceM14144b = AbstractC8595j0.m14144b(c8800p.m14700b(), c9892k, false)) != null) {
                return new StaticImageDecoder(sourceM14144b, c8800p.m14700b(), c9892k, this.f2945a);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m2976b(C9892k c9892k) {
            Bitmap.Config configM16692f = AbstractC9888g.m16692f(c9892k);
            return configM16692f == Bitmap.Config.ARGB_8888 || configM16692f == Bitmap.Config.HARDWARE;
        }
    }

    /* renamed from: coil3.decode.StaticImageDecoder$b */
    public static final class C5183b implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f2947b;

        public C5183b(Ref.BooleanRef booleanRef) {
            this.f2947b = booleanRef;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jM14135b = C8590h.m14135b(width, height, StaticImageDecoder.this.f2943c.m16708k(), StaticImageDecoder.this.f2943c.m16707j(), AbstractC9887f.m16685d(StaticImageDecoder.this.f2943c));
            int iM2693c = AbstractC5090o.m2693c(jM14135b);
            int iM2694d = AbstractC5090o.m2694d(jM14135b);
            if (width > 0 && height > 0 && (width != iM2693c || height != iM2694d)) {
                double dM14137d = C8590h.m14137d(width, height, iM2693c, iM2694d, StaticImageDecoder.this.f2943c.m16707j());
                Ref.BooleanRef booleanRef = this.f2947b;
                boolean z9 = dM14137d < 1.0d;
                booleanRef.element = z9;
                if (z9 || StaticImageDecoder.this.f2943c.m16706i() == Precision.f3231a) {
                    imageDecoder.setTargetSize(MathKt.roundToInt(width * dM14137d), MathKt.roundToInt(dM14137d * height));
                }
            }
            StaticImageDecoder.this.m2975e(imageDecoder);
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, C9892k c9892k, Semaphore semaphore) {
        this.f2941a = source;
        this.f2942b = autoCloseable;
        this.f2943c = c9892k;
        this.f2944d = semaphore;
    }

    /* renamed from: f */
    public static final boolean m2974f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5184a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2964a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.f2952e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2952e = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2950c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2952e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f2948a
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Semaphore r8 = r7.f2944d
            r0.f2948a = r8
            r0.f2949b = r3
            r0.f2952e = r4
            java.lang.Object r0 = r8.acquire(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r8
        L49:
            java.lang.AutoCloseable r8 = r7.f2942b     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$Source r2 = r7.f2941a     // Catch: java.lang.Throwable -> L74
            coil3.decode.StaticImageDecoder$b r5 = new coil3.decode.StaticImageDecoder$b     // Catch: java.lang.Throwable -> L74
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$OnHeaderDecodedListener r5 = androidx.core.graphics.AbstractC3426r.m1692a(r5)     // Catch: java.lang.Throwable -> L74
            android.graphics.Bitmap r2 = androidx.core.graphics.AbstractC3428t.m1694a(r2, r5)     // Catch: java.lang.Throwable -> L74
            n.g r5 = new n.g     // Catch: java.lang.Throwable -> L74
            r6 = 0
            k.a r2 = p137k.AbstractC7843o.m13302d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.element     // Catch: java.lang.Throwable -> L74
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L74
            kotlin.jdk7.AutoCloseableKt.closeFinally(r8, r6)     // Catch: java.lang.Throwable -> L72
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
            kotlin.jdk7.AutoCloseableKt.closeFinally(r8, r1)     // Catch: java.lang.Throwable -> L72
            throw r2     // Catch: java.lang.Throwable -> L72
        L7b:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.mo2964a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public final void m2975e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: n.a0
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return StaticImageDecoder.m2974f(decodeException);
            }
        });
        imageDecoder.setAllocator(AbstractC5075a.m2665d(AbstractC9888g.m16692f(this.f2943c)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!AbstractC9888g.m16690d(this.f2943c) ? 1 : 0);
        if (AbstractC9888g.m16694h(this.f2943c) != null) {
            imageDecoder.setTargetColorSpace(AbstractC9888g.m16694h(this.f2943c));
        }
        imageDecoder.setUnpremultipliedRequired(!AbstractC9888g.m16696j(this.f2943c));
    }
}
