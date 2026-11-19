package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import coil3.InterfaceC4574e;
import coil3.decode.InterfaceC4565a;
import coil3.size.Precision;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p094io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.Semaphore;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p023c0.AbstractC4455a;
import p023c0.AbstractC4470o;
import p087k.AbstractC6616o;
import p087k.InterfaceC6611j;
import p110n.AbstractC7433p;
import p110n.C7420g;
import p110n.C7422h;
import p110n.C7424i;
import p110n.C7432o;
import p110n.InterfaceC7431n;
import p110n.InterfaceC7435r;
import p124p.C7587p;
import p187y.AbstractC7873f;
import p187y.AbstractC7876i;
import p187y.C7880m;

/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements InterfaceC4565a {

    /* renamed from: e */
    public static final C4560a f1605e = new C4560a(null);

    /* renamed from: a */
    public final InterfaceC7435r f1606a;

    /* renamed from: b */
    public final C7880m f1607b;

    /* renamed from: c */
    public final Semaphore f1608c;

    /* renamed from: d */
    public final InterfaceC7431n f1609d;

    /* renamed from: coil3.decode.BitmapFactoryDecoder$a */
    public static final class C4560a {
        public /* synthetic */ C4560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C4560a() {
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$b */
    public static final class C4561b extends ForwardingSource {

        /* renamed from: a */
        public Exception f1610a;

        public C4561b(Source source) {
            super(source);
        }

        /* renamed from: a */
        public final Exception m1795a() {
            return this.f1610a;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j6) throws Exception {
            try {
                return super.read(buffer, j6);
            } catch (Exception e6) {
                this.f1610a = e6;
                throw e6;
            }
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$c */
    public static final class C4562c implements InterfaceC4565a.a {

        /* renamed from: a */
        public final Semaphore f1611a;

        /* renamed from: b */
        public final InterfaceC7431n f1612b;

        public C4562c(Semaphore semaphore, InterfaceC7431n interfaceC7431n) {
            this.f1611a = semaphore;
            this.f1612b = interfaceC7431n;
        }

        @Override // coil3.decode.InterfaceC4565a.a
        /* renamed from: a */
        public InterfaceC4565a mo1796a(C7587p c7587p, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            return new BitmapFactoryDecoder(c7587p.m8992b(), c7880m, this.f1611a, this.f1612b);
        }
    }

    public BitmapFactoryDecoder(InterfaceC7435r interfaceC7435r, C7880m c7880m, Semaphore semaphore, InterfaceC7431n interfaceC7431n) {
        this.f1606a = interfaceC7435r;
        this.f1607b = c7880m;
        this.f1608c = semaphore;
        this.f1609d = interfaceC7431n;
    }

    /* renamed from: f */
    public static final C7420g m1790f(BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.m1794e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC4565a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1791a(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r9
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.f1618f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1618f = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f1616d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1618f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f1613a
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
            int r2 = r0.f1614b
            java.lang.Object r6 = r0.f1613a
            kotlinx.coroutines.sync.Semaphore r6 = (kotlinx.coroutines.sync.Semaphore) r6
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r6
            goto L59
        L46:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.Semaphore r9 = r8.f1608c
            r0.f1613a = r9
            r0.f1614b = r3
            r0.f1618f = r5
            java.lang.Object r2 = r9.acquire(r0)
            if (r2 != r1) goto L58
            goto L6d
        L58:
            r2 = r3
        L59:
            n.d r6 = new n.d     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r0.f1613a = r9     // Catch: java.lang.Throwable -> L77
            r0.f1614b = r2     // Catch: java.lang.Throwable -> L77
            r0.f1615c = r3     // Catch: java.lang.Throwable -> L77
            r0.f1618f = r4     // Catch: java.lang.Throwable -> L77
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
            n.g r9 = (p110n.C7420g) r9     // Catch: java.lang.Throwable -> L31
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.mo1791a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public final void m1792c(BitmapFactory.Options options, C7424i c7424i) {
        Bitmap.Config configM9651j = AbstractC7876i.m9651j(this.f1607b);
        if (c7424i.m8462b() || AbstractC7433p.m8476a(c7424i)) {
            configM9651j = AbstractC4455a.m1523e(configM9651j);
        }
        if (AbstractC7876i.m9649h(this.f1607b) && configM9651j == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configM9651j = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configM9651j != Bitmap.Config.HARDWARE) {
            configM9651j = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configM9651j;
    }

    /* renamed from: d */
    public final void m1793d(BitmapFactory.Options options, C7424i c7424i) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i6 = AbstractC7433p.m8477b(c7424i) ? options.outHeight : options.outWidth;
        int i7 = AbstractC7433p.m8477b(c7424i) ? options.outWidth : options.outHeight;
        long jM8456b = C7422h.m8456b(i6, i7, this.f1607b.m9669k(), this.f1607b.m9668j(), AbstractC7873f.m9640d(this.f1607b));
        int iM1551c = AbstractC4470o.m1551c(jM8456b);
        int iM1552d = AbstractC4470o.m1552d(jM8456b);
        int iM8455a = C7422h.m8455a(i6, i7, iM1551c, iM1552d, this.f1607b.m9668j());
        options.inSampleSize = iM8455a;
        double dM8457c = C7422h.m8457c(i6 / iM8455a, i7 / iM8455a, iM1551c, iM1552d, this.f1607b.m9668j());
        if (this.f1607b.m9667i() == Precision.f1916b) {
            dM8457c = RangesKt.coerceAtMost(dM8457c, 1.0d);
        }
        boolean z6 = dM8457c == 1.0d;
        options.inScaled = !z6;
        if (z6) {
            return;
        }
        if (dM8457c > 1.0d) {
            options.inDensity = MathKt.roundToInt(Integer.MAX_VALUE / dM8457c);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = MathKt.roundToInt(Integer.MAX_VALUE * dM8457c);
        }
    }

    /* renamed from: e */
    public final C7420g m1794e(BitmapFactory.Options options) throws Exception {
        C4561b c4561b = new C4561b(this.f1606a.source());
        BufferedSource bufferedSourceBuffer = Okio.buffer(c4561b);
        boolean z6 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception excM1795a = c4561b.m1795a();
        if (excM1795a != null) {
            throw excM1795a;
        }
        options.inJustDecodeBounds = false;
        C7432o c7432o = C7432o.f9491a;
        C7424i c7424iM8474a = c7432o.m8474a(options.outMimeType, bufferedSourceBuffer, this.f1609d);
        Exception excM1795a2 = c4561b.m1795a();
        if (excM1795a2 != null) {
            throw excM1795a2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && AbstractC7876i.m9653l(this.f1607b) != null) {
            options.inPreferredColorSpace = AbstractC7876i.m9653l(this.f1607b);
        }
        options.inPremultiplied = AbstractC7876i.m9655n(this.f1607b);
        m1792c(options, c7424iM8474a);
        m1793d(options, c7424iM8474a);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            Exception excM1795a3 = c4561b.m1795a();
            if (excM1795a3 != null) {
                throw excM1795a3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f1607b.m9661c().getResources().getDisplayMetrics().densityDpi);
            InterfaceC6611j interfaceC6611jM7570c = AbstractC6616o.m7570c(new BitmapDrawable(this.f1607b.m9661c().getResources(), c7432o.m8475b(bitmapDecodeStream, c7424iM8474a)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z6 = false;
            }
            return new C7420g(interfaceC6611jM7570c, z6);
        } finally {
        }
    }
}
