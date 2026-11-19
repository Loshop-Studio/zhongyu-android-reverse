package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import coil3.InterfaceC5328e;
import coil3.decode.InterfaceC5319a;
import coil3.decode.StaticImageDecoder;
import coil3.size.Precision;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.sync.Semaphore;
import p090e0.AbstractC7803a;
import p090e0.AbstractC7816n;
import p183n.AbstractC9065j0;
import p183n.C9060h;
import p207p.C9303p;
import p297y.AbstractC9925f;
import p297y.AbstractC9928i;
import p297y.C9932m;

/* loaded from: classes3.dex */
public final class StaticImageDecoder implements InterfaceC5319a {

    /* renamed from: a */
    public final ImageDecoder.Source f2870a;

    /* renamed from: b */
    public final AutoCloseable f2871b;

    /* renamed from: c */
    public final C9932m f2872c;

    /* renamed from: d */
    public final Semaphore f2873d;

    /* renamed from: coil3.decode.StaticImageDecoder$a */
    public static final class C5317a implements InterfaceC5319a.a {

        /* renamed from: a */
        public final Semaphore f2874a;

        public C5317a(Semaphore semaphore) {
            this.f2874a = semaphore;
        }

        @Override // coil3.decode.InterfaceC5319a.a
        /* renamed from: a */
        public InterfaceC5319a mo10a(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            ImageDecoder.Source sourceM14535b;
            if (m2701b(c9932m) && (sourceM14535b = AbstractC9065j0.m14535b(c9303p.m15152c(), c9932m, false)) != null) {
                return new StaticImageDecoder(sourceM14535b, c9303p.m15152c(), c9932m, this.f2874a);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m2701b(C9932m c9932m) {
            Bitmap.Config configM17097j = AbstractC9928i.m17097j(c9932m);
            return configM17097j == Bitmap.Config.ARGB_8888 || configM17097j == Bitmap.Config.HARDWARE;
        }
    }

    /* renamed from: coil3.decode.StaticImageDecoder$b */
    public static final class C5318b implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f2876b;

        public C5318b(Ref.BooleanRef booleanRef) {
            this.f2876b = booleanRef;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jM14525b = C9060h.m14525b(width, height, StaticImageDecoder.this.f2872c.m17116k(), StaticImageDecoder.this.f2872c.m17115j(), AbstractC9925f.m17086d(StaticImageDecoder.this.f2872c));
            int iM12201c = AbstractC7816n.m12201c(jM14525b);
            int iM12202d = AbstractC7816n.m12202d(jM14525b);
            if (width > 0 && height > 0 && (width != iM12201c || height != iM12202d)) {
                double dM14527d = C9060h.m14527d(width, height, iM12201c, iM12202d, StaticImageDecoder.this.f2872c.m17115j());
                Ref.BooleanRef booleanRef = this.f2876b;
                boolean z9 = dM14527d < 1.0d;
                booleanRef.element = z9;
                if (z9 || StaticImageDecoder.this.f2872c.m17114i() == Precision.f3119a) {
                    imageDecoder.setTargetSize(MathKt.roundToInt(width * dM14527d), MathKt.roundToInt(dM14527d * height));
                }
            }
            StaticImageDecoder.this.m2700e(imageDecoder);
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, C9932m c9932m, Semaphore semaphore) {
        this.f2870a = source;
        this.f2871b = autoCloseable;
        this.f2872c = c9932m;
        this.f2873d = semaphore;
    }

    /* renamed from: f */
    public static final boolean m2699f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5319a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.f2880d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2880d = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f2878b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2880d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f2877a
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L46
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Semaphore r8 = r7.f2873d
            r0.f2877a = r8
            r0.f2880d = r3
            java.lang.Object r0 = r8.acquire(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r0 = r8
        L46:
            java.lang.AutoCloseable r8 = r7.f2871b     // Catch: java.lang.Throwable -> L70
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            android.graphics.ImageDecoder$Source r2 = r7.f2870a     // Catch: java.lang.Throwable -> L72
            coil3.decode.StaticImageDecoder$b r4 = new coil3.decode.StaticImageDecoder$b     // Catch: java.lang.Throwable -> L72
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L72
            android.graphics.ImageDecoder$OnHeaderDecodedListener r4 = androidx.core.graphics.AbstractC3414r.m1470a(r4)     // Catch: java.lang.Throwable -> L72
            android.graphics.Bitmap r2 = androidx.core.graphics.AbstractC3416t.m1472a(r2, r4)     // Catch: java.lang.Throwable -> L72
            n.g r4 = new n.g     // Catch: java.lang.Throwable -> L72
            r5 = 0
            r6 = 0
            k.a r2 = p151k.AbstractC8243n.m13271d(r2, r5, r3, r6)     // Catch: java.lang.Throwable -> L72
            boolean r1 = r1.element     // Catch: java.lang.Throwable -> L72
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L72
            kotlin.jdk7.AutoCloseableKt.closeFinally(r8, r6)     // Catch: java.lang.Throwable -> L70
            r0.release()
            return r4
        L70:
            r8 = move-exception
            goto L79
        L72:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L74
        L74:
            r2 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r8, r1)     // Catch: java.lang.Throwable -> L70
            throw r2     // Catch: java.lang.Throwable -> L70
        L79:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.mo9a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public final void m2700e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: n.a0
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return StaticImageDecoder.m2699f(decodeException);
            }
        });
        imageDecoder.setAllocator(AbstractC7803a.m12173d(AbstractC9928i.m17097j(this.f2872c)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!AbstractC9928i.m17095h(this.f2872c) ? 1 : 0);
        if (AbstractC9928i.m17099l(this.f2872c) != null) {
            imageDecoder.setTargetColorSpace(AbstractC9928i.m17099l(this.f2872c));
        }
        imageDecoder.setUnpremultipliedRequired(!AbstractC9928i.m17101n(this.f2872c));
    }
}
