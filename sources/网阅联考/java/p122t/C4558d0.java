package p122t;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p076j.C3793c;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;

/* renamed from: t.d0 */
/* loaded from: classes2.dex */
public class C4558d0 implements InterfaceC3795e {

    /* renamed from: d */
    public static final C3793c f5727d = C3793c.m4942a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final C3793c f5728e = C3793c.m4942a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    public static final e f5729f = new e();

    /* renamed from: a */
    public final f f5730a;

    /* renamed from: b */
    public final InterfaceC4395d f5731b;

    /* renamed from: c */
    public final e f5732c;

    /* renamed from: t.d0$a */
    public class a implements C3793c.b {

        /* renamed from: a */
        public final ByteBuffer f5733a = ByteBuffer.allocate(8);

        @Override // p076j.C3793c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4949a(byte[] bArr, Long l4, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f5733a) {
                this.f5733a.position(0);
                messageDigest.update(this.f5733a.putLong(l4.longValue()).array());
            }
        }
    }

    /* renamed from: t.d0$b */
    public class b implements C3793c.b {

        /* renamed from: a */
        public final ByteBuffer f5734a = ByteBuffer.allocate(4);

        @Override // p076j.C3793c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4949a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f5734a) {
                this.f5734a.position(0);
                messageDigest.update(this.f5734a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: t.d0$c */
    public static final class c implements f {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        @Override // p122t.C4558d0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6275a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: t.d0$d */
    public static final class d implements f {

        /* renamed from: t.d0$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f5735a;

            public a(ByteBuffer byteBuffer) {
                this.f5735a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f5735a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j4, byte[] bArr, int i4, int i5) {
                if (j4 >= this.f5735a.limit()) {
                    return -1;
                }
                this.f5735a.position((int) j4);
                int iMin = Math.min(i5, this.f5735a.remaining());
                this.f5735a.get(bArr, i4, iMin);
                return iMin;
            }
        }

        @Override // p122t.C4558d0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6275a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* renamed from: t.d0$e */
    public static class e {
        /* renamed from: a */
        public MediaMetadataRetriever m6278a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: t.d0$f */
    public interface f {
        /* renamed from: a */
        void mo6275a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: t.d0$g */
    public static final class g implements f {
        @Override // p122t.C4558d0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6275a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public C4558d0(InterfaceC4395d interfaceC4395d, f fVar) {
        this(interfaceC4395d, fVar, f5729f);
    }

    /* renamed from: c */
    public static InterfaceC3795e m6267c(InterfaceC4395d interfaceC4395d) {
        return new C4558d0(interfaceC4395d, new c(null));
    }

    /* renamed from: d */
    public static InterfaceC3795e m6268d(InterfaceC4395d interfaceC4395d) {
        return new C4558d0(interfaceC4395d, new d());
    }

    /* renamed from: e */
    public static Bitmap m6269e(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmapM6271g = (Build.VERSION.SDK_INT < 27 || i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f871f) ? null : m6271g(mediaMetadataRetriever, j4, i4, i5, i6, downsampleStrategy);
        return bitmapM6271g == null ? m6270f(mediaMetadataRetriever, j4, i4) : bitmapM6271g;
    }

    /* renamed from: f */
    public static Bitmap m6270f(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4) {
        return mediaMetadataRetriever.getFrameAtTime(j4, i4);
    }

    /* renamed from: g */
    public static Bitmap m6271g(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        try {
            int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i9 == 90 || i9 == 270) {
                i8 = i7;
                i7 = i8;
            }
            float fMo1928b = downsampleStrategy.mo1928b(i7, i8, i5, i6);
            return mediaMetadataRetriever.getScaledFrameAtTime(j4, i4, Math.round(i7 * fMo1928b), Math.round(fMo1928b * i8));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: h */
    public static InterfaceC3795e m6272h(InterfaceC4395d interfaceC4395d) {
        return new C4558d0(interfaceC4395d, new g());
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: a */
    public boolean mo1965a(Object obj, C3794d c3794d) {
        return true;
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: b */
    public InterfaceC4361j mo1966b(Object obj, int i4, int i5, C3794d c3794d) throws IOException {
        long jLongValue = ((Long) c3794d.m4951c(f5727d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c3794d.m4951c(f5728e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c3794d.m4951c(DownsampleStrategy.f873h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f872g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM6278a = this.f5732c.m6278a();
        try {
            try {
                this.f5730a.mo6275a(mediaMetadataRetrieverM6278a, obj);
                Bitmap bitmapM6269e = m6269e(mediaMetadataRetrieverM6278a, jLongValue, num.intValue(), i4, i5, downsampleStrategy2);
                mediaMetadataRetrieverM6278a.release();
                return C4559e.m6280d(bitmapM6269e, this.f5731b);
            } catch (RuntimeException e4) {
                throw new IOException(e4);
            }
        } catch (Throwable th) {
            mediaMetadataRetrieverM6278a.release();
            throw th;
        }
    }

    public C4558d0(InterfaceC4395d interfaceC4395d, f fVar, e eVar) {
        this.f5731b = interfaceC4395d;
        this.f5730a = fVar;
        this.f5732c = eVar;
    }
}
