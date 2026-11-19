package p111m0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.C4185b;
import io.reactivex.internal.operators.observable.C5712h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;
import p039d0.C5400c;
import p094k0.C5750a;
import p180v0.AbstractC6659f;
import p195x.C6738b;
import p195x.C6739c;
import p195x.C6740d;
import p202y.C6763f;
import p202y.InterfaceC6759b;
import p202y.InterfaceC6764g;

/* renamed from: m0.a */
/* loaded from: classes2.dex */
public final class C6078a implements InterfaceC6764g {

    /* renamed from: f */
    public static final C5712h f9680f = new C5712h(6);

    /* renamed from: g */
    public static final C5400c f9681g = new C5400c(1);

    /* renamed from: a */
    public final Context f9682a;

    /* renamed from: b */
    public final ArrayList f9683b;

    /* renamed from: e */
    public final C0039h f9686e;

    /* renamed from: d */
    public final C5712h f9685d = f9680f;

    /* renamed from: c */
    public final C5400c f9684c = f9681g;

    public C6078a(Context context, ArrayList arrayList, InterfaceC3205b interfaceC3205b, C3210g c3210g) {
        this.f9682a = context.getApplicationContext();
        this.f9683b = arrayList;
        this.f9686e = new C0039h(14, interfaceC3205b, false, c3210g);
    }

    /* renamed from: d */
    public static int m5795d(C6738b c6738b, int i, int i8) {
        int iMin = Math.min(c6738b.f11372g / i8, c6738b.f11371f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbM99x = AbstractC0037f.m99x("Downsampling GIF, sampleSize: ", ", target dimens: [", iMax, "x", i);
            sbM99x.append(i8);
            sbM99x.append("], actual dimens: [");
            sbM99x.append(c6738b.f11371f);
            sbM99x.append("x");
            sbM99x.append(c6738b.f11372g);
            sbM99x.append("]");
            Log.v("BufferGifDecoder", sbM99x.toString());
        }
        return iMax;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) c6763f.m6436c(AbstractC6083f.f9709b)).booleanValue()) {
            if (byteBuffer == null) {
                imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                ArrayList arrayList = this.f9683b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
                        break;
                    }
                    ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo4982a = ((InterfaceC6759b) arrayList.get(i)).mo4982a(byteBuffer);
                    if (imageHeaderParser$ImageTypeMo4982a != ImageHeaderParser$ImageType.UNKNOWN) {
                        imageHeaderParser$ImageType = imageHeaderParser$ImageTypeMo4982a;
                        break;
                    }
                    i++;
                }
            }
            if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final p016b0.InterfaceC3072g0 mo4971b(java.lang.Object r8, int r9, int r10, p202y.C6763f r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            d0.c r8 = r7.f9684c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f8347a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            x.c r0 = (p195x.C6739c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            x.c r0 = new x.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f11378b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f11377a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            x.b r0 = new x.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f11379c = r0     // Catch: java.lang.Throwable -> L54
            r5.f11380d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f11378b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f11378b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            k0.a r8 = r1.m5796c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            d0.c r9 = r1.f9684c
            r9.m4795a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            d0.c r9 = r1.f9684c
            r9.m4795a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: p111m0.C6078a.mo4971b(java.lang.Object, int, int, y.f):b0.g0");
    }

    /* renamed from: c */
    public final C5750a m5796c(ByteBuffer byteBuffer, int i, int i8, C6739c c6739c, C6763f c6763f) {
        StringBuilder sb;
        int i9 = AbstractC6659f.f11234b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C6738b c6738bM6418b = c6739c.m6418b();
            C5750a c5750a = null;
            if (c6738bM6418b.f11368c > 0 && c6738bM6418b.f11367b == 0) {
                Bitmap.Config config = c6763f.m6436c(AbstractC6083f.f9708a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM5795d = m5795d(c6738bM6418b, i, i8);
                C5712h c5712h = this.f9685d;
                C0039h c0039h = this.f9686e;
                c5712h.getClass();
                C6740d c6740d = new C6740d(c0039h, c6738bM6418b, byteBuffer, iM5795d);
                c6740d.m6425c(config);
                c6740d.f11391k = (c6740d.f11391k + 1) % c6740d.f11392l.f11368c;
                Bitmap bitmapM6424b = c6740d.m6424b();
                if (bitmapM6424b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                c5750a = new C5750a(new GifDrawable(new C4185b(new C6082e(ComponentCallbacks2C3408b.m2360c(this.f9682a), c6740d, i, i8, bitmapM6424b))), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return c5750a;
                }
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC6659f.m6315a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c5750a;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(AbstractC6659f.m6315a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return c5750a;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC6659f.m6315a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
