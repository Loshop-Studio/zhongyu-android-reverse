package p228r0;

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
import p122h0.C8083c;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;

/* renamed from: r0.a0 */
/* loaded from: classes3.dex */
public class C9391a0 implements InterfaceC8085e {

    /* renamed from: d */
    public static final C8083c f16371d = C8083c.m12899a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final C8083c f16372e = C8083c.m12899a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    public static final e f16373f = new e();

    /* renamed from: a */
    public final f f16374a;

    /* renamed from: b */
    public final InterfaceC8867d f16375b;

    /* renamed from: c */
    public final e f16376c;

    /* renamed from: r0.a0$a */
    public class a implements C8083c.b {

        /* renamed from: a */
        public final ByteBuffer f16377a = ByteBuffer.allocate(8);

        @Override // p122h0.C8083c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12906a(byte[] bArr, Long l9, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f16377a) {
                this.f16377a.position(0);
                messageDigest.update(this.f16377a.putLong(l9.longValue()).array());
            }
        }
    }

    /* renamed from: r0.a0$b */
    public class b implements C8083c.b {

        /* renamed from: a */
        public final ByteBuffer f16378a = ByteBuffer.allocate(4);

        @Override // p122h0.C8083c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12906a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f16378a) {
                this.f16378a.position(0);
                messageDigest.update(this.f16378a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: r0.a0$c */
    public static final class c implements f {
        public c() {
        }

        @Override // p228r0.C9391a0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15456a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: r0.a0$e */
    public static class e {
        /* renamed from: a */
        public MediaMetadataRetriever m15459a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: r0.a0$f */
    public interface f {
        /* renamed from: a */
        void mo15456a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: r0.a0$g */
    public static final class g implements f {
        @Override // p228r0.C9391a0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15456a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public C9391a0(InterfaceC8867d interfaceC8867d, f fVar) {
        this(interfaceC8867d, fVar, f16373f);
    }

    /* renamed from: c */
    public static InterfaceC8085e m15448c(InterfaceC8867d interfaceC8867d) {
        return new C9391a0(interfaceC8867d, new c(null));
    }

    /* renamed from: d */
    public static InterfaceC8085e m15449d(InterfaceC8867d interfaceC8867d) {
        return new C9391a0(interfaceC8867d, new d());
    }

    /* renamed from: e */
    public static Bitmap m15450e(MediaMetadataRetriever mediaMetadataRetriever, long j9, int i9, int i10, int i11, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmapM15452g = (Build.VERSION.SDK_INT < 27 || i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f3525f) ? null : m15452g(mediaMetadataRetriever, j9, i9, i10, i11, downsampleStrategy);
        return bitmapM15452g == null ? m15451f(mediaMetadataRetriever, j9, i9) : bitmapM15452g;
    }

    /* renamed from: f */
    public static Bitmap m15451f(MediaMetadataRetriever mediaMetadataRetriever, long j9, int i9) {
        return mediaMetadataRetriever.getFrameAtTime(j9, i9);
    }

    /* renamed from: g */
    public static Bitmap m15452g(MediaMetadataRetriever mediaMetadataRetriever, long j9, int i9, int i10, int i11, DownsampleStrategy downsampleStrategy) {
        try {
            int i12 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i14 == 90 || i14 == 270) {
                i13 = i12;
                i12 = i13;
            }
            float fMo3252b = downsampleStrategy.mo3252b(i12, i13, i10, i11);
            return mediaMetadataRetriever.getScaledFrameAtTime(j9, i9, Math.round(i12 * fMo3252b), Math.round(fMo3252b * i13));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: h */
    public static InterfaceC8085e m15453h(InterfaceC8867d interfaceC8867d) {
        return new C9391a0(interfaceC8867d, new g());
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: a */
    public boolean mo3289a(Object obj, C8084d c8084d) {
        return true;
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: b */
    public InterfaceC8259j mo3290b(Object obj, int i9, int i10, C8084d c8084d) throws IOException {
        long jLongValue = ((Long) c8084d.m12908c(f16371d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c8084d.m12908c(f16372e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8084d.m12908c(DownsampleStrategy.f3527h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f3526g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM15459a = this.f16376c.m15459a();
        try {
            try {
                this.f16374a.mo15456a(mediaMetadataRetrieverM15459a, obj);
                Bitmap bitmapM15450e = m15450e(mediaMetadataRetrieverM15459a, jLongValue, num.intValue(), i9, i10, downsampleStrategy2);
                mediaMetadataRetrieverM15459a.release();
                return C9395e.m15464c(bitmapM15450e, this.f16375b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th) {
            mediaMetadataRetrieverM15459a.release();
            throw th;
        }
    }

    public C9391a0(InterfaceC8867d interfaceC8867d, f fVar, e eVar) {
        this.f16375b = interfaceC8867d;
        this.f16374a = fVar;
        this.f16376c = eVar;
    }

    /* renamed from: r0.a0$d */
    public static final class d implements f {
        @Override // p228r0.C9391a0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15456a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }

        /* renamed from: r0.a0$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f16379a;

            public a(ByteBuffer byteBuffer) {
                this.f16379a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f16379a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j9, byte[] bArr, int i9, int i10) {
                if (j9 >= this.f16379a.limit()) {
                    return -1;
                }
                this.f16379a.position((int) j9);
                int iMin = Math.min(i10, this.f16379a.remaining());
                this.f16379a.get(bArr, i9, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
