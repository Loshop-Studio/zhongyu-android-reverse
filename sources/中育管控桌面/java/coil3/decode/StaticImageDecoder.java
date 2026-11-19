package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import coil3.InterfaceC4574e;
import coil3.decode.InterfaceC4565a;
import coil3.decode.StaticImageDecoder;
import coil3.size.Precision;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.sync.Semaphore;
import p023c0.AbstractC4455a;
import p023c0.AbstractC4470o;
import p110n.AbstractC7427j0;
import p110n.C7422h;
import p124p.C7587p;
import p187y.AbstractC7873f;
import p187y.AbstractC7876i;
import p187y.C7880m;

/* loaded from: classes3.dex */
public final class StaticImageDecoder implements InterfaceC4565a {

    /* renamed from: a */
    public final ImageDecoder.Source f1625a;

    /* renamed from: b */
    public final AutoCloseable f1626b;

    /* renamed from: c */
    public final C7880m f1627c;

    /* renamed from: d */
    public final Semaphore f1628d;

    /* renamed from: coil3.decode.StaticImageDecoder$a */
    public static final class C4563a implements InterfaceC4565a.a {

        /* renamed from: a */
        public final Semaphore f1629a;

        public C4563a(Semaphore semaphore) {
            this.f1629a = semaphore;
        }

        @Override // coil3.decode.InterfaceC4565a.a
        /* renamed from: a */
        public InterfaceC4565a mo1796a(C7587p c7587p, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            ImageDecoder.Source sourceM8465b;
            if (m1803b(c7880m) && (sourceM8465b = AbstractC7427j0.m8465b(c7587p.m8992b(), c7880m, false)) != null) {
                return new StaticImageDecoder(sourceM8465b, c7587p.m8992b(), c7880m, this.f1629a);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m1803b(C7880m c7880m) {
            Bitmap.Config configM9651j = AbstractC7876i.m9651j(c7880m);
            return configM9651j == Bitmap.Config.ARGB_8888 || configM9651j == Bitmap.Config.HARDWARE;
        }
    }

    /* renamed from: coil3.decode.StaticImageDecoder$b */
    public static final class C4564b implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f1631b;

        public C4564b(Ref.BooleanRef booleanRef) {
            this.f1631b = booleanRef;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jM8456b = C7422h.m8456b(width, height, StaticImageDecoder.this.f1627c.m9669k(), StaticImageDecoder.this.f1627c.m9668j(), AbstractC7873f.m9640d(StaticImageDecoder.this.f1627c));
            int iM1551c = AbstractC4470o.m1551c(jM8456b);
            int iM1552d = AbstractC4470o.m1552d(jM8456b);
            if (width > 0 && height > 0 && (width != iM1551c || height != iM1552d)) {
                double dM8458d = C7422h.m8458d(width, height, iM1551c, iM1552d, StaticImageDecoder.this.f1627c.m9668j());
                Ref.BooleanRef booleanRef = this.f1631b;
                boolean z6 = dM8458d < 1.0d;
                booleanRef.element = z6;
                if (z6 || StaticImageDecoder.this.f1627c.m9667i() == Precision.f1915a) {
                    imageDecoder.setTargetSize(MathKt.roundToInt(width * dM8458d), MathKt.roundToInt(dM8458d * height));
                }
            }
            StaticImageDecoder.this.m1802e(imageDecoder);
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, C7880m c7880m, Semaphore semaphore) {
        this.f1625a = source;
        this.f1626b = autoCloseable;
        this.f1627c = c7880m;
        this.f1628d = semaphore;
    }

    /* renamed from: f */
    public static final boolean m1801f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC4565a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1791a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r8
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.f1636e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1636e = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1634c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1636e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f1632a
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
            kotlinx.coroutines.sync.Semaphore r8 = r7.f1628d
            r0.f1632a = r8
            r0.f1633b = r3
            r0.f1636e = r4
            java.lang.Object r0 = r8.acquire(r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r8
        L49:
            java.lang.AutoCloseable r8 = r7.f1626b     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$Source r2 = r7.f1625a     // Catch: java.lang.Throwable -> L74
            coil3.decode.StaticImageDecoder$b r5 = new coil3.decode.StaticImageDecoder$b     // Catch: java.lang.Throwable -> L74
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L74
            android.graphics.ImageDecoder$OnHeaderDecodedListener r5 = androidx.core.graphics.AbstractC2751r.m754a(r5)     // Catch: java.lang.Throwable -> L74
            android.graphics.Bitmap r2 = androidx.core.graphics.AbstractC2753t.m756a(r2, r5)     // Catch: java.lang.Throwable -> L74
            n.g r5 = new n.g     // Catch: java.lang.Throwable -> L74
            r6 = 0
            k.a r2 = p087k.AbstractC6616o.m7571d(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.StaticImageDecoder.mo1791a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e */
    public final void m1802e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: n.a0
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return StaticImageDecoder.m1801f(decodeException);
            }
        });
        imageDecoder.setAllocator(AbstractC4455a.m1522d(AbstractC7876i.m9651j(this.f1627c)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!AbstractC7876i.m9649h(this.f1627c) ? 1 : 0);
        if (AbstractC7876i.m9653l(this.f1627c) != null) {
            imageDecoder.setTargetColorSpace(AbstractC7876i.m9653l(this.f1627c));
        }
        imageDecoder.setUnpremultipliedRequired(!AbstractC7876i.m9655n(this.f1627c));
    }
}
