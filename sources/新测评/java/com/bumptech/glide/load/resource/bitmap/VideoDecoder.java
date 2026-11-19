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
import androidx.documentfile.provider.AbstractC3757a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p162m0.C8538c;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;
import p261v0.C9633f;

/* loaded from: classes3.dex */
public class VideoDecoder implements InterfaceC8540e {

    /* renamed from: d */
    public static final C8538c f3742d = C8538c.m14049a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5394a());

    /* renamed from: e */
    public static final C8538c f3743e = C8538c.m14049a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5395b());

    /* renamed from: f */
    public static final C5399f f3744f = new C5399f();

    /* renamed from: g */
    public static final List f3745g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC5398e f3746a;

    /* renamed from: b */
    public final InterfaceC8804d f3747b;

    /* renamed from: c */
    public final C5399f f3748c;

    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C5394a implements C8538c.b {

        /* renamed from: a */
        public final ByteBuffer f3749a = ByteBuffer.allocate(8);

        @Override // p162m0.C8538c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3620a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f3749a) {
                this.f3749a.position(0);
                messageDigest.update(this.f3749a.putLong(l10.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C5395b implements C8538c.b {

        /* renamed from: a */
        public final ByteBuffer f3750a = ByteBuffer.allocate(4);

        @Override // p162m0.C8538c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3620a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f3750a) {
                this.f3750a.position(0);
                messageDigest.update(this.f3750a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C5396c implements InterfaceC5398e {
        public C5396c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3623a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3624b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C5396c(C5394a c5394a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C5397d implements InterfaceC5398e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f3751a;

            public a(ByteBuffer byteBuffer) {
                this.f3751a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f3751a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f3751a.limit()) {
                    return -1;
                }
                this.f3751a.position((int) j10);
                int iMin = Math.min(i11, this.f3751a.remaining());
                this.f3751a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        /* renamed from: c */
        public final MediaDataSource m3627c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3623a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m3627c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo3624b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(m3627c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public interface InterfaceC5398e {
        /* renamed from: a */
        void mo3623a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo3624b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public static class C5399f {
        /* renamed from: a */
        public MediaMetadataRetriever m3630a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C5400g implements InterfaceC5398e {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3623a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5398e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3624b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(InterfaceC8804d interfaceC8804d, InterfaceC5398e interfaceC5398e) {
        this(interfaceC8804d, interfaceC5398e, f3744f);
    }

    /* renamed from: c */
    public static InterfaceC8540e m3607c(InterfaceC8804d interfaceC8804d) {
        return new VideoDecoder(interfaceC8804d, new C5396c(null));
    }

    /* renamed from: d */
    public static InterfaceC8540e m3608d(InterfaceC8804d interfaceC8804d) {
        return new VideoDecoder(interfaceC8804d, new C5397d());
    }

    /* renamed from: e */
    public static Bitmap m3609e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (m3613j()) {
            try {
                if (m3612i(mediaMetadataRetriever)) {
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
    public static Bitmap m3610g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    /* renamed from: h */
    public static Bitmap m3611h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fMo3601b = downsampleStrategy.mo3601b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fMo3601b), Math.round(fMo3601b * i14));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m3612i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* renamed from: j */
    public static boolean m3613j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m3614k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    /* renamed from: k */
    public static boolean m3614k() {
        Iterator it = f3745g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC8540e m3615m(InterfaceC8804d interfaceC8804d) {
        return new VideoDecoder(interfaceC8804d, new C5400g());
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: a */
    public boolean mo3616a(Object obj, C8539d c8539d) {
        return true;
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: b */
    public InterfaceC8690j mo3617b(Object obj, int i10, int i11, C8539d c8539d) throws Exception {
        long jLongValue = ((Long) c8539d.m14057c(f3742d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c8539d.m14057c(f3743e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8539d.m14057c(DownsampleStrategy.f3731h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f3730g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM3630a = this.f3748c.m3630a();
        try {
            this.f3746a.mo3624b(mediaMetadataRetrieverM3630a, obj);
            try {
                Bitmap bitmapM3618f = m3618f(obj, mediaMetadataRetrieverM3630a, jLongValue, num.intValue(), i10, i11, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3757a.m1902a(mediaMetadataRetrieverM3630a);
                } else {
                    mediaMetadataRetrieverM3630a.release();
                }
                return C9633f.m16002c(bitmapM3618f, this.f3747b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3757a.m1902a(mediaMetadataRetrieverM3630a);
                    throw th2;
                }
                mediaMetadataRetrieverM3630a.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: f */
    public final Bitmap m3618f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        if (m3619l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapM3611h = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f3729f) ? null : m3611h(mediaMetadataRetriever, j10, i10, i11, i12, downsampleStrategy);
        if (bitmapM3611h == null) {
            bitmapM3611h = m3610g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapM3609e = m3609e(mediaMetadataRetriever, bitmapM3611h);
        if (bitmapM3609e != null) {
            return bitmapM3609e;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: l */
    public final boolean m3619l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
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
            this.f3746a.mo3623a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
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

    public VideoDecoder(InterfaceC8804d interfaceC8804d, InterfaceC5398e interfaceC5398e, C5399f c5399f) {
        this.f3747b = interfaceC8804d;
        this.f3746a = interfaceC5398e;
        this.f3748c = c5399f;
    }
}
