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
import androidx.documentfile.provider.AbstractC3881a;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p160l.C9229c;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;
import p259u.C10142f;

/* loaded from: classes3.dex */
public class VideoDecoder implements InterfaceC9231e {

    /* renamed from: d */
    public static final C9229c f3175d = C9229c.m16932a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C5443a());

    /* renamed from: e */
    public static final C9229c f3176e = C9229c.m16932a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C5444b());

    /* renamed from: f */
    public static final C5448f f3177f = new C5448f();

    /* renamed from: g */
    public static final List f3178g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC5447e f3179a;

    /* renamed from: b */
    public final InterfaceC9500d f3180b;

    /* renamed from: c */
    public final C5448f f3181c;

    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C5443a implements C9229c.b {

        /* renamed from: a */
        public final ByteBuffer f3182a = ByteBuffer.allocate(8);

        @Override // p160l.C9229c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3065a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f3182a) {
                this.f3182a.position(0);
                messageDigest.update(this.f3182a.putLong(l10.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C5444b implements C9229c.b {

        /* renamed from: a */
        public final ByteBuffer f3183a = ByteBuffer.allocate(4);

        @Override // p160l.C9229c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3065a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f3183a) {
                this.f3183a.position(0);
                messageDigest.update(this.f3183a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C5445c implements InterfaceC5447e {
        public C5445c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3068a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3069b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C5445c(C5443a c5443a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C5446d implements InterfaceC5447e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f3184a;

            public a(ByteBuffer byteBuffer) {
                this.f3184a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f3184a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f3184a.limit()) {
                    return -1;
                }
                this.f3184a.position((int) j10);
                int iMin = Math.min(i11, this.f3184a.remaining());
                this.f3184a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        /* renamed from: c */
        public final MediaDataSource m3072c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3068a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m3072c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo3069b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(m3072c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public interface InterfaceC5447e {
        /* renamed from: a */
        void mo3068a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo3069b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public static class C5448f {
        /* renamed from: a */
        public MediaMetadataRetriever m3075a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C5449g implements InterfaceC5447e {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo3068a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC5447e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo3069b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(InterfaceC9500d interfaceC9500d, InterfaceC5447e interfaceC5447e) {
        this(interfaceC9500d, interfaceC5447e, f3177f);
    }

    /* renamed from: c */
    public static InterfaceC9231e m3052c(InterfaceC9500d interfaceC9500d) {
        return new VideoDecoder(interfaceC9500d, new C5445c(null));
    }

    /* renamed from: d */
    public static InterfaceC9231e m3053d(InterfaceC9500d interfaceC9500d) {
        return new VideoDecoder(interfaceC9500d, new C5446d());
    }

    /* renamed from: e */
    public static Bitmap m3054e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (m3058j()) {
            try {
                if (m3057i(mediaMetadataRetriever)) {
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
    public static Bitmap m3055g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    /* renamed from: h */
    public static Bitmap m3056h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fMo3046b = downsampleStrategy.mo3046b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fMo3046b), Math.round(fMo3046b * i14));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m3057i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* renamed from: j */
    public static boolean m3058j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m3059k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    /* renamed from: k */
    public static boolean m3059k() {
        Iterator it = f3178g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC9231e m3060m(InterfaceC9500d interfaceC9500d) {
        return new VideoDecoder(interfaceC9500d, new C5449g());
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: a */
    public InterfaceC9357j mo3061a(Object obj, int i10, int i11, C9230d c9230d) throws Exception {
        long jLongValue = ((Long) c9230d.m16940c(f3175d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c9230d.m16940c(f3176e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c9230d.m16940c(DownsampleStrategy.f3164h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f3163g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM3075a = this.f3181c.m3075a();
        try {
            this.f3179a.mo3069b(mediaMetadataRetrieverM3075a, obj);
            try {
                Bitmap bitmapM3063f = m3063f(obj, mediaMetadataRetrieverM3075a, jLongValue, num.intValue(), i10, i11, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3881a.m1684a(mediaMetadataRetrieverM3075a);
                } else {
                    mediaMetadataRetrieverM3075a.release();
                }
                return C10142f.m18997c(bitmapM3063f, this.f3180b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3881a.m1684a(mediaMetadataRetrieverM3075a);
                    throw th2;
                }
                mediaMetadataRetrieverM3075a.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: b */
    public boolean mo3062b(Object obj, C9230d c9230d) {
        return true;
    }

    /* renamed from: f */
    public final Bitmap m3063f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        if (m3064l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapM3056h = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f3162f) ? null : m3056h(mediaMetadataRetriever, j10, i10, i11, i12, downsampleStrategy);
        if (bitmapM3056h == null) {
            bitmapM3056h = m3055g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapM3054e = m3054e(mediaMetadataRetriever, bitmapM3056h);
        if (bitmapM3054e != null) {
            return bitmapM3054e;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: l */
    public final boolean m3064l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
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
            this.f3179a.mo3068a(mediaExtractor2, obj);
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

    public VideoDecoder(InterfaceC9500d interfaceC9500d, InterfaceC5447e interfaceC5447e, C5448f c5448f) {
        this.f3180b = interfaceC9500d;
        this.f3179a = interfaceC5447e;
        this.f3181c = c5448f;
    }
}
