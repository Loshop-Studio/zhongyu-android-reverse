package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil3.InterfaceC5328e;
import coil3.decode.InterfaceC5319a;
import coil3.size.Precision;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p161io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p090e0.AbstractC7803a;
import p090e0.AbstractC7816n;
import p151k.AbstractC8243n;
import p151k.InterfaceC8239j;
import p183n.AbstractC9071p;
import p183n.C9058g;
import p183n.C9060h;
import p183n.C9062i;
import p183n.C9070o;
import p183n.InterfaceC9069n;
import p183n.InterfaceC9073r;
import p207p.C9303p;
import p297y.AbstractC9925f;
import p297y.AbstractC9928i;
import p297y.C9932m;

/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements InterfaceC5319a {

    /* renamed from: e */
    public static final C5314a f2852e = new C5314a(null);

    /* renamed from: a */
    public final InterfaceC9073r f2853a;

    /* renamed from: b */
    public final C9932m f2854b;

    /* renamed from: c */
    public final Semaphore f2855c;

    /* renamed from: d */
    public final InterfaceC9069n f2856d;

    /* renamed from: coil3.decode.BitmapFactoryDecoder$a */
    public static final class C5314a {
        public /* synthetic */ C5314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5314a() {
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$b */
    public static final class C5315b extends ForwardingSource {

        /* renamed from: a */
        public Exception f2857a;

        public C5315b(Source source) {
            super(source);
        }

        /* renamed from: a */
        public final Exception m2694a() {
            return this.f2857a;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j9) throws Exception {
            try {
                return super.read(buffer, j9);
            } catch (Exception e10) {
                this.f2857a = e10;
                throw e10;
            }
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$c */
    public static final class C5316c implements InterfaceC5319a.a {

        /* renamed from: a */
        public final Semaphore f2858a;

        /* renamed from: b */
        public final InterfaceC9069n f2859b;

        public C5316c(Semaphore semaphore, InterfaceC9069n interfaceC9069n) {
            this.f2858a = semaphore;
            this.f2859b = interfaceC9069n;
        }

        @Override // coil3.decode.InterfaceC5319a.a
        /* renamed from: a */
        public InterfaceC5319a mo10a(C9303p c9303p, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            return new BitmapFactoryDecoder(c9303p.m15152c(), c9932m, this.f2858a, this.f2859b);
        }
    }

    public BitmapFactoryDecoder(InterfaceC9073r interfaceC9073r, C9932m c9932m, Semaphore semaphore, InterfaceC9069n interfaceC9069n) {
        this.f2853a = interfaceC9073r;
        this.f2854b = c9932m;
        this.f2855c = semaphore;
        this.f2856d = interfaceC9069n;
    }

    /* renamed from: f */
    public static final C9058g m2690f(BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.m2693e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5319a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo9a(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.f2863d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2863d = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f2861b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2863d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f2860a
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r7 = move-exception
            goto L71
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            java.lang.Object r2 = r0.f2860a
            kotlinx.coroutines.sync.Semaphore r2 = (kotlinx.coroutines.sync.Semaphore) r2
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r2
            goto L53
        L43:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.Semaphore r7 = r6.f2855c
            r0.f2860a = r7
            r0.f2863d = r4
            java.lang.Object r2 = r7.acquire(r0)
            if (r2 != r1) goto L53
            goto L63
        L53:
            n.d r2 = new n.d     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            r0.f2860a = r7     // Catch: java.lang.Throwable -> L6d
            r0.f2863d = r3     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r3, r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r1) goto L64
        L63:
            return r1
        L64:
            r5 = r0
            r0 = r7
            r7 = r5
        L67:
            n.g r7 = (p183n.C9058g) r7     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r7
        L6d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L71:
            r0.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.mo9a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public final void m2691c(BitmapFactory.Options options, C9062i c9062i) {
        Bitmap.Config configM17097j = AbstractC9928i.m17097j(this.f2854b);
        if (c9062i.m14532b() || AbstractC9071p.m14546a(c9062i)) {
            configM17097j = AbstractC7803a.m12174e(configM17097j);
        }
        if (AbstractC9928i.m17095h(this.f2854b) && configM17097j == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configM17097j = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configM17097j != Bitmap.Config.HARDWARE) {
            configM17097j = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configM17097j;
    }

    /* renamed from: d */
    public final void m2692d(BitmapFactory.Options options, C9062i c9062i) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i9 = AbstractC9071p.m14547b(c9062i) ? options.outHeight : options.outWidth;
        int i10 = AbstractC9071p.m14547b(c9062i) ? options.outWidth : options.outHeight;
        long jM14525b = C9060h.m14525b(i9, i10, this.f2854b.m17116k(), this.f2854b.m17115j(), AbstractC9925f.m17086d(this.f2854b));
        int iM12201c = AbstractC7816n.m12201c(jM14525b);
        int iM12202d = AbstractC7816n.m12202d(jM14525b);
        int iM14524a = C9060h.m14524a(i9, i10, iM12201c, iM12202d, this.f2854b.m17115j());
        options.inSampleSize = iM14524a;
        double dM14526c = C9060h.m14526c(i9 / iM14524a, i10 / iM14524a, iM12201c, iM12202d, this.f2854b.m17115j());
        if (this.f2854b.m17114i() == Precision.f3120b) {
            dM14526c = RangesKt.coerceAtMost(dM14526c, 1.0d);
        }
        boolean z9 = dM14526c == 1.0d;
        options.inScaled = !z9;
        if (z9) {
            return;
        }
        if (dM14526c > 1.0d) {
            options.inDensity = MathKt.roundToInt(Integer.MAX_VALUE / dM14526c);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = MathKt.roundToInt(Integer.MAX_VALUE * dM14526c);
        }
    }

    /* renamed from: e */
    public final C9058g m2693e(BitmapFactory.Options options) throws Exception {
        C5315b c5315b = new C5315b(this.f2853a.source());
        BufferedSource bufferedSourceBuffer = Okio.buffer(c5315b);
        boolean z9 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception excM2694a = c5315b.m2694a();
        if (excM2694a != null) {
            throw excM2694a;
        }
        options.inJustDecodeBounds = false;
        C9070o c9070o = C9070o.f15254a;
        C9062i c9062iM14544a = c9070o.m14544a(options.outMimeType, bufferedSourceBuffer, this.f2856d);
        Exception excM2694a2 = c5315b.m2694a();
        if (excM2694a2 != null) {
            throw excM2694a2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && AbstractC9928i.m17099l(this.f2854b) != null) {
            options.inPreferredColorSpace = AbstractC9928i.m17099l(this.f2854b);
        }
        options.inPremultiplied = AbstractC9928i.m17101n(this.f2854b);
        m2691c(options, c9062iM14544a);
        m2692d(options, c9062iM14544a);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            Exception excM2694a3 = c5315b.m2694a();
            if (excM2694a3 != null) {
                throw excM2694a3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f2854b.m17108c().getResources().getDisplayMetrics().densityDpi);
            InterfaceC8239j interfaceC8239jM13270c = AbstractC8243n.m13270c(new BitmapDrawable(this.f2854b.m17108c().getResources(), c9070o.m14545b(bitmapDecodeStream, c9062iM14544a)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z9 = false;
            }
            return new C9058g(interfaceC8239jM13270c, z9);
        } finally {
        }
    }
}
