package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil3.InterfaceC5193e;
import coil3.decode.InterfaceC5184a;
import coil3.size.Precision;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p148io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p030c0.AbstractC5075a;
import p030c0.AbstractC5090o;
import p137k.AbstractC7843o;
import p137k.InterfaceC7838j;
import p172n.AbstractC8601p;
import p172n.C8588g;
import p172n.C8590h;
import p172n.C8592i;
import p172n.C8600o;
import p172n.InterfaceC8599n;
import p172n.InterfaceC8603r;
import p194p.C8800p;
import p290y.AbstractC9887f;
import p290y.AbstractC9888g;
import p290y.C9892k;

/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements InterfaceC5184a {

    /* renamed from: e */
    public static final C5179a f2921e = new C5179a(null);

    /* renamed from: a */
    public final InterfaceC8603r f2922a;

    /* renamed from: b */
    public final C9892k f2923b;

    /* renamed from: c */
    public final Semaphore f2924c;

    /* renamed from: d */
    public final InterfaceC8599n f2925d;

    /* renamed from: coil3.decode.BitmapFactoryDecoder$a */
    public static final class C5179a {
        public /* synthetic */ C5179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5179a() {
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$b */
    public static final class C5180b extends ForwardingSource {

        /* renamed from: a */
        public Exception f2926a;

        public C5180b(Source source) {
            super(source);
        }

        /* renamed from: a */
        public final Exception m2968a() {
            return this.f2926a;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j10) throws Exception {
            try {
                return super.read(buffer, j10);
            } catch (Exception e10) {
                this.f2926a = e10;
                throw e10;
            }
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$c */
    public static final class C5181c implements InterfaceC5184a.a {

        /* renamed from: a */
        public final Semaphore f2927a;

        /* renamed from: b */
        public final InterfaceC8599n f2928b;

        public C5181c(Semaphore semaphore, InterfaceC8599n interfaceC8599n) {
            this.f2927a = semaphore;
            this.f2928b = interfaceC8599n;
        }

        @Override // coil3.decode.InterfaceC5184a.a
        /* renamed from: a */
        public InterfaceC5184a mo2969a(C8800p c8800p, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            return new BitmapFactoryDecoder(c8800p.m14700b(), c9892k, this.f2927a, this.f2928b);
        }
    }

    public BitmapFactoryDecoder(InterfaceC8603r interfaceC8603r, C9892k c9892k, Semaphore semaphore, InterfaceC8599n interfaceC8599n) {
        this.f2922a = interfaceC8603r;
        this.f2923b = c9892k;
        this.f2924c = semaphore;
        this.f2925d = interfaceC8599n;
    }

    /* renamed from: f */
    public static final C8588g m2963f(BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.m2967e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5184a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2964a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r9
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.f2934f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2934f = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f2932d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2934f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f2929a
            kotlinx.coroutines.sync.Semaphore r0 = (kotlinx.coroutines.sync.Semaphore) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L71
        L31:
            r9 = move-exception
            goto L7b
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            int r2 = r0.f2930b
            java.lang.Object r6 = r0.f2929a
            kotlinx.coroutines.sync.Semaphore r6 = (kotlinx.coroutines.sync.Semaphore) r6
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r6
            goto L59
        L46:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.Semaphore r9 = r8.f2924c
            r0.f2929a = r9
            r0.f2930b = r3
            r0.f2934f = r5
            java.lang.Object r2 = r9.acquire(r0)
            if (r2 != r1) goto L58
            goto L6d
        L58:
            r2 = r3
        L59:
            n.d r6 = new n.d     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r0.f2929a = r9     // Catch: java.lang.Throwable -> L77
            r0.f2930b = r2     // Catch: java.lang.Throwable -> L77
            r0.f2931c = r3     // Catch: java.lang.Throwable -> L77
            r0.f2934f = r4     // Catch: java.lang.Throwable -> L77
            r2 = 0
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r2, r6, r0, r5, r2)     // Catch: java.lang.Throwable -> L77
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r7 = r0
            r0 = r9
            r9 = r7
        L71:
            n.g r9 = (p172n.C8588g) r9     // Catch: java.lang.Throwable -> L31
            r0.release()
            return r9
        L77:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            r0.release()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.mo2964a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public final void m2965c(BitmapFactory.Options options, C8592i c8592i) {
        Bitmap.Config configM16692f = AbstractC9888g.m16692f(this.f2923b);
        if (c8592i.m14141b() || AbstractC8601p.m14155a(c8592i)) {
            configM16692f = AbstractC5075a.m2666e(configM16692f);
        }
        if (AbstractC9888g.m16690d(this.f2923b) && configM16692f == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configM16692f = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configM16692f != Bitmap.Config.HARDWARE) {
            configM16692f = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configM16692f;
    }

    /* renamed from: d */
    public final void m2966d(BitmapFactory.Options options, C8592i c8592i) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = AbstractC8601p.m14156b(c8592i) ? options.outHeight : options.outWidth;
        int i11 = AbstractC8601p.m14156b(c8592i) ? options.outWidth : options.outHeight;
        long jM14135b = C8590h.m14135b(i10, i11, this.f2923b.m16708k(), this.f2923b.m16707j(), AbstractC9887f.m16685d(this.f2923b));
        int iM2693c = AbstractC5090o.m2693c(jM14135b);
        int iM2694d = AbstractC5090o.m2694d(jM14135b);
        int iM14134a = C8590h.m14134a(i10, i11, iM2693c, iM2694d, this.f2923b.m16707j());
        options.inSampleSize = iM14134a;
        double dM14136c = C8590h.m14136c(i10 / iM14134a, i11 / iM14134a, iM2693c, iM2694d, this.f2923b.m16707j());
        if (this.f2923b.m16706i() == Precision.f3232b) {
            dM14136c = RangesKt.coerceAtMost(dM14136c, 1.0d);
        }
        boolean z9 = dM14136c == 1.0d;
        options.inScaled = !z9;
        if (z9) {
            return;
        }
        if (dM14136c > 1.0d) {
            options.inDensity = MathKt.roundToInt(Integer.MAX_VALUE / dM14136c);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = MathKt.roundToInt(Integer.MAX_VALUE * dM14136c);
        }
    }

    /* renamed from: e */
    public final C8588g m2967e(BitmapFactory.Options options) throws Exception {
        C5180b c5180b = new C5180b(this.f2922a.source());
        BufferedSource bufferedSourceBuffer = Okio.buffer(c5180b);
        boolean z9 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception excM2968a = c5180b.m2968a();
        if (excM2968a != null) {
            throw excM2968a;
        }
        options.inJustDecodeBounds = false;
        C8600o c8600o = C8600o.f14238a;
        C8592i c8592iM14153a = c8600o.m14153a(options.outMimeType, bufferedSourceBuffer, this.f2925d);
        Exception excM2968a2 = c5180b.m2968a();
        if (excM2968a2 != null) {
            throw excM2968a2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && AbstractC9888g.m16694h(this.f2923b) != null) {
            options.inPreferredColorSpace = AbstractC9888g.m16694h(this.f2923b);
        }
        options.inPremultiplied = AbstractC9888g.m16696j(this.f2923b);
        m2965c(options, c8592iM14153a);
        m2966d(options, c8592iM14153a);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            Exception excM2968a3 = c5180b.m2968a();
            if (excM2968a3 != null) {
                throw excM2968a3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f2923b.m16700c().getResources().getDisplayMetrics().densityDpi);
            InterfaceC7838j interfaceC7838jM13301c = AbstractC7843o.m13301c(new BitmapDrawable(this.f2923b.m16700c().getResources(), c8600o.m14154b(bitmapDecodeStream, c8592iM14153a)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z9 = false;
            }
            return new C8588g(interfaceC7838jM13301c, z9);
        } finally {
        }
    }
}
