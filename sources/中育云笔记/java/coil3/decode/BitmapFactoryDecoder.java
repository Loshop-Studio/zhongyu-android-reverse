package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import be.InterfaceC5195g;
import cd.AbstractC5423b;
import coil3.InterfaceC5470e;
import coil3.decode.InterfaceC5461a;
import coil3.size.Precision;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p001a0.AbstractC0003a;
import p001a0.AbstractC0018o;
import p211jd.AbstractC9719c;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p228l.AbstractC10083p;
import p228l.C10070g;
import p228l.C10072h;
import p228l.C10074i;
import p228l.C10082o;
import p228l.InterfaceC10081n;
import p228l.InterfaceC10085r;
import p253n.C10286p;
import p265nd.AbstractC10410o;
import p380w.AbstractC11628h;
import p380w.AbstractC11630j;
import p380w.C11634n;

/* loaded from: classes3.dex */
public final class BitmapFactoryDecoder implements InterfaceC5461a {

    /* renamed from: e */
    public static final C5456a f3596e = new C5456a(null);

    /* renamed from: a */
    public final InterfaceC10085r f3597a;

    /* renamed from: b */
    public final C11634n f3598b;

    /* renamed from: c */
    public final InterfaceC5195g f3599c;

    /* renamed from: d */
    public final InterfaceC10081n f3600d;

    /* renamed from: coil3.decode.BitmapFactoryDecoder$a */
    public static final class C5456a {
        public /* synthetic */ C5456a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5456a() {
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$b */
    public static final class C5457b extends ForwardingSource {

        /* renamed from: c */
        public Exception f3601c;

        public C5457b(Source source) {
            super(source);
        }

        /* renamed from: e */
        public final Exception m3062e() {
            return this.f3601c;
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j10) throws Exception {
            try {
                return super.read(buffer, j10);
            } catch (Exception e10) {
                this.f3601c = e10;
                throw e10;
            }
        }
    }

    /* renamed from: coil3.decode.BitmapFactoryDecoder$c */
    public static final class C5458c implements InterfaceC5461a.a {

        /* renamed from: a */
        public final InterfaceC5195g f3602a;

        /* renamed from: b */
        public final InterfaceC10081n f3603b;

        public C5458c(InterfaceC5195g interfaceC5195g, InterfaceC10081n interfaceC10081n) {
            this.f3602a = interfaceC5195g;
            this.f3603b = interfaceC10081n;
        }

        @Override // coil3.decode.InterfaceC5461a.a
        /* renamed from: a */
        public InterfaceC5461a mo3063a(C10286p c10286p, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            return new BitmapFactoryDecoder(c10286p.m21419b(), c11634n, this.f3602a, this.f3603b);
        }
    }

    public BitmapFactoryDecoder(InterfaceC10085r interfaceC10085r, C11634n c11634n, InterfaceC5195g interfaceC5195g, InterfaceC10081n interfaceC10081n) {
        this.f3597a = interfaceC10085r;
        this.f3598b = c11634n;
        this.f3599c = interfaceC5195g;
        this.f3600d = interfaceC10081n;
    }

    /* renamed from: f */
    public static final C10070g m3057f(BitmapFactoryDecoder bitmapFactoryDecoder) {
        return bitmapFactoryDecoder.m3061e(new BitmapFactory.Options());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC5461a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3058a(vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r9
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.f3609h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3609h = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3607f
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3609h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f3604c
            be.g r0 = (be.InterfaceC5195g) r0
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L31
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
            int r2 = r0.f3605d
            java.lang.Object r6 = r0.f3604c
            be.g r6 = (be.InterfaceC5195g) r6
            kotlin.AbstractC9924b.m20071b(r9)
            r9 = r6
            goto L59
        L46:
            kotlin.AbstractC9924b.m20071b(r9)
            be.g r9 = r8.f3599c
            r0.f3604c = r9
            r0.f3605d = r3
            r0.f3609h = r5
            java.lang.Object r2 = r9.m2749b(r0)
            if (r2 != r1) goto L58
            goto L6d
        L58:
            r2 = r3
        L59:
            l.d r6 = new l.d     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r0.f3604c = r9     // Catch: java.lang.Throwable -> L77
            r0.f3605d = r2     // Catch: java.lang.Throwable -> L77
            r0.f3606e = r3     // Catch: java.lang.Throwable -> L77
            r0.f3609h = r4     // Catch: java.lang.Throwable -> L77
            r2 = 0
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.m20381c(r2, r6, r0, r5, r2)     // Catch: java.lang.Throwable -> L77
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r7 = r0
            r0 = r9
            r9 = r7
        L71:
            l.g r9 = (p228l.C10070g) r9     // Catch: java.lang.Throwable -> L31
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.BitmapFactoryDecoder.mo3058a(vc.c):java.lang.Object");
    }

    /* renamed from: c */
    public final void m3059c(BitmapFactory.Options options, C10074i c10074i) {
        Bitmap.Config configM25733j = AbstractC11630j.m25733j(this.f3598b);
        if (c10074i.m21074b() || AbstractC10083p.m21088a(c10074i)) {
            configM25733j = AbstractC0003a.m7e(configM25733j);
        }
        if (AbstractC11630j.m25731h(this.f3598b) && configM25733j == Bitmap.Config.ARGB_8888 && AbstractC9979u.m20289b(options.outMimeType, "image/jpeg")) {
            configM25733j = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configM25733j != Bitmap.Config.HARDWARE) {
            configM25733j = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configM25733j;
    }

    /* renamed from: d */
    public final void m3060d(BitmapFactory.Options options, C10074i c10074i) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = AbstractC10083p.m21089b(c10074i) ? options.outHeight : options.outWidth;
        int i11 = AbstractC10083p.m21089b(c10074i) ? options.outWidth : options.outHeight;
        long jM21068b = C10072h.m21068b(i10, i11, this.f3598b.m25751k(), this.f3598b.m25750j(), AbstractC11628h.m25722d(this.f3598b));
        int iM34c = AbstractC0018o.m34c(jM21068b);
        int iM35d = AbstractC0018o.m35d(jM21068b);
        int iM21067a = C10072h.m21067a(i10, i11, iM34c, iM35d, this.f3598b.m25750j());
        options.inSampleSize = iM21067a;
        double dM21069c = C10072h.m21069c(i10 / iM21067a, i11 / iM21067a, iM34c, iM35d, this.f3598b.m25750j());
        if (this.f3598b.m25749i() == Precision.f3907d) {
            dM21069c = AbstractC10410o.m21754g(dM21069c, 1.0d);
        }
        boolean z10 = dM21069c == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dM21069c > 1.0d) {
            options.inDensity = AbstractC9719c.m19281c(Integer.MAX_VALUE / dM21069c);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = AbstractC9719c.m19281c(Integer.MAX_VALUE * dM21069c);
        }
    }

    /* renamed from: e */
    public final C10070g m3061e(BitmapFactory.Options options) throws Exception {
        C5457b c5457b = new C5457b(this.f3597a.source());
        BufferedSource bufferedSourceBuffer = Okio.buffer(c5457b);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception excM3062e = c5457b.m3062e();
        if (excM3062e != null) {
            throw excM3062e;
        }
        options.inJustDecodeBounds = false;
        C10082o c10082o = C10082o.f24096a;
        C10074i c10074iM21086a = c10082o.m21086a(options.outMimeType, bufferedSourceBuffer, this.f3600d);
        Exception excM3062e2 = c5457b.m3062e();
        if (excM3062e2 != null) {
            throw excM3062e2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && AbstractC11630j.m25735l(this.f3598b) != null) {
            options.inPreferredColorSpace = AbstractC11630j.m25735l(this.f3598b);
        }
        options.inPremultiplied = AbstractC11630j.m25737n(this.f3598b);
        m3059c(options, c10074iM21086a);
        m3060d(options, c10074iM21086a);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            AbstractC5423b.m2902a(bufferedSourceBuffer, null);
            Exception excM3062e3 = c5457b.m3062e();
            if (excM3062e3 != null) {
                throw excM3062e3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f3598b.m25743c().getResources().getDisplayMetrics().densityDpi);
            InterfaceC9756j interfaceC9756jM19680c = AbstractC9761o.m19680c(new BitmapDrawable(this.f3598b.m25743c().getResources(), c10082o.m21087b(bitmapDecodeStream, c10074iM21086a)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new C10070g(interfaceC9756jM19680c, z10);
        } finally {
        }
    }
}
