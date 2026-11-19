package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.documentfile.provider.AbstractC3754a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p168h0.C9437d;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;
import p298q0.C10697f;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes3.dex */
public class VideoDecoder implements InterfaceC9439f {

    /* renamed from: d */
    public static final C9437d f4945d = C9437d.m18618a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5862a());

    /* renamed from: e */
    public static final C9437d f4946e = C9437d.m18618a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5863b());

    /* renamed from: f */
    public static final C5867f f4947f = new C5867f();

    /* renamed from: g */
    public static final List f4948g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC5866e f4949a;

    /* renamed from: b */
    public final InterfaceC9772d f4950b;

    /* renamed from: c */
    public final C5867f f4951c;

    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C5862a implements C9437d.b {

        /* renamed from: a */
        public final ByteBuffer f4952a = ByteBuffer.allocate(8);

        @Override // p168h0.C9437d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4269a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f4952a) {
                this.f4952a.position(0);
                messageDigest.update(this.f4952a.putLong(l10.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C5863b implements C9437d.b {

        /* renamed from: a */
        public final ByteBuffer f4953a = ByteBuffer.allocate(4);

        @Override // p168h0.C9437d.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4269a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f4953a) {
                this.f4953a.position(0);
                messageDigest.update(this.f4953a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C5864c implements InterfaceC5866e {
        public C5864c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo4272a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo4273b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C5864c(C5862a c5862a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C5865d implements InterfaceC5866e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class a extends MediaDataSource {

            /* renamed from: c */
            public final /* synthetic */ ByteBuffer f4954c;

            public a(ByteBuffer byteBuffer) {
                this.f4954c = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f4954c.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f4954c.limit()) {
                    return -1;
                }
                this.f4954c.position((int) j10);
                int iMin = Math.min(i11, this.f4954c.remaining());
                this.f4954c.get(bArr, i10, iMin);
                return iMin;
            }
        }

        /* renamed from: c */
        public final MediaDataSource m4276c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo4272a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m4276c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo4273b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(m4276c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public interface InterfaceC5866e {
        /* renamed from: a */
        void mo4272a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo4273b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public static class C5867f {
        /* renamed from: a */
        public MediaMetadataRetriever m4279a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C5868g implements InterfaceC5866e {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo4272a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5866e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo4273b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(InterfaceC9772d interfaceC9772d, InterfaceC5866e interfaceC5866e) {
        this(interfaceC9772d, interfaceC5866e, f4947f);
    }

    /* renamed from: c */
    public static InterfaceC9439f m4256c(InterfaceC9772d interfaceC9772d) {
        return new VideoDecoder(interfaceC9772d, new C5864c(null));
    }

    /* renamed from: d */
    public static InterfaceC9439f m4257d(InterfaceC9772d interfaceC9772d) {
        return new VideoDecoder(interfaceC9772d, new C5865d());
    }

    /* renamed from: e */
    public static Bitmap m4258e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (m4262j()) {
            try {
                if (m4261i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    Log.isLoggable("VideoDecoder", 3);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                Log.isLoggable("VideoDecoder", 3);
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: g */
    public static Bitmap m4259g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    /* renamed from: h */
    public static Bitmap m4260h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fMo4250b = downsampleStrategy.mo4250b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fMo4250b), Math.round(fMo4250b * i14));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m4261i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* renamed from: j */
    public static boolean m4262j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m4263k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    /* renamed from: k */
    public static boolean m4263k() {
        Iterator it = f4948g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC9439f m4264m(InterfaceC9772d interfaceC9772d) {
        return new VideoDecoder(interfaceC9772d, new C5868g());
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: a */
    public boolean mo4265a(Object obj, C9438e c9438e) {
        return true;
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: b */
    public InterfaceC9657j mo4266b(Object obj, int i10, int i11, C9438e c9438e) throws Exception {
        long jLongValue = ((Long) c9438e.m18626c(f4945d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c9438e.m18626c(f4946e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c9438e.m18626c(DownsampleStrategy.f4934h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f4933g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM4279a = this.f4951c.m4279a();
        try {
            this.f4949a.mo4273b(mediaMetadataRetrieverM4279a, obj);
            try {
                Bitmap bitmapM4267f = m4267f(obj, mediaMetadataRetrieverM4279a, jLongValue, num.intValue(), i10, i11, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3754a.m1748a(mediaMetadataRetrieverM4279a);
                } else {
                    mediaMetadataRetrieverM4279a.release();
                }
                return C10697f.m22659c(bitmapM4267f, this.f4950b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3754a.m1748a(mediaMetadataRetrieverM4279a);
                    throw th2;
                }
                mediaMetadataRetrieverM4279a.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public final Bitmap m4267f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        if (m4268l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapM4260h = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f4932f) ? null : m4260h(mediaMetadataRetriever, j10, i10, i11, i12, downsampleStrategy);
        if (bitmapM4260h == null) {
            bitmapM4260h = m4259g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapM4258e = m4258e(mediaMetadataRetriever, bitmapM4260h);
        if (bitmapM4258e != null) {
            return bitmapM4258e;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: l */
    public final boolean m4268l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f4949a.mo4272a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString(IMediaFormat.KEY_MIME))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable unused) {
            mediaExtractor = mediaExtractor2;
            try {
                Log.isLoggable("VideoDecoder", 3);
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public VideoDecoder(InterfaceC9772d interfaceC9772d, InterfaceC5866e interfaceC5866e, C5867f c5867f) {
        this.f4950b = interfaceC9772d;
        this.f4949a = interfaceC5866e;
        this.f4951c = c5867f;
    }
}
