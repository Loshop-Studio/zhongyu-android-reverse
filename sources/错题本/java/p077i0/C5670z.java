package p077i0;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.collection.AbstractC0584a;
import java.io.IOException;
import p016b0.InterfaceC3072g0;
import p024c0.InterfaceC3205b;
import p032c8.C3238c;
import p202y.C6762e;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: i0.z */
/* loaded from: classes2.dex */
public final class C5670z implements InterfaceC6764g {

    /* renamed from: d */
    public static final C6762e f8832d = new C6762e("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5652h(1));

    /* renamed from: e */
    public static final C6762e f8833e = new C6762e("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5652h(2));

    /* renamed from: f */
    public static final C3238c f8834f = new C3238c();

    /* renamed from: a */
    public final InterfaceC5669y f8835a;

    /* renamed from: b */
    public final InterfaceC3205b f8836b;

    /* renamed from: c */
    public final C3238c f8837c = f8834f;

    public C5670z(InterfaceC3205b interfaceC3205b, InterfaceC5669y interfaceC5669y) {
        this.f8836b = interfaceC3205b;
        this.f8835a = interfaceC5669y;
    }

    /* renamed from: c */
    public static Bitmap m5000c(MediaMetadataRetriever mediaMetadataRetriever, long j7, int i, int i8, int i9, C5655k c5655k) {
        Bitmap scaledFrameAtTime = null;
        if (Build.VERSION.SDK_INT >= 27 && i8 != Integer.MIN_VALUE && i9 != Integer.MIN_VALUE && c5655k != C5655k.f8797e) {
            try {
                int i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i12 == 90 || i12 == 270) {
                    i11 = i10;
                    i10 = i11;
                }
                float fM4986b = c5655k.m4986b(i10, i11, i8, i9);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j7, i, Math.round(i10 * fM4986b), Math.round(fM4986b * i11));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                }
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j7, i) : scaledFrameAtTime;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        return true;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) throws IOException {
        long jLongValue = ((Long) c6763f.m6436c(f8832d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) c6763f.m6436c(f8833e);
        if (num == null) {
            num = 2;
        }
        C5655k c5655k = (C5655k) c6763f.m6436c(C5655k.f8799g);
        if (c5655k == null) {
            c5655k = C5655k.f8798f;
        }
        C5655k c5655k2 = c5655k;
        this.f8837c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f8835a.mo4999g(mediaMetadataRetriever, obj);
                Bitmap bitmapM5000c = m5000c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i8, c5655k2);
                mediaMetadataRetriever.release();
                return C5647c.m4972b(bitmapM5000c, this.f8836b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
