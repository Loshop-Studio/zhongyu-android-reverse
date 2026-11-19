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
import androidx.documentfile.provider.AbstractC3242a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p053f0.C6284c;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;
import p118o0.C7495f;

/* loaded from: classes3.dex */
public class VideoDecoder implements InterfaceC6286e {

    /* renamed from: d */
    public static final C6284c f2533d = C6284c.m6412a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C4730a());

    /* renamed from: e */
    public static final C6284c f2534e = C6284c.m6412a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C4731b());

    /* renamed from: f */
    public static final C4735f f2535f = new C4735f();

    /* renamed from: g */
    public static final List f2536g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC4734e f2537a;

    /* renamed from: b */
    public final InterfaceC6499d f2538b;

    /* renamed from: c */
    public final C4735f f2539c;

    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C4730a implements C6284c.b {

        /* renamed from: a */
        public final ByteBuffer f2540a = ByteBuffer.allocate(8);

        @Override // p053f0.C6284c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2800a(byte[] bArr, Long l6, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f2540a) {
                this.f2540a.position(0);
                messageDigest.update(this.f2540a.putLong(l6.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C4731b implements C6284c.b {

        /* renamed from: a */
        public final ByteBuffer f2541a = ByteBuffer.allocate(4);

        @Override // p053f0.C6284c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2800a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f2541a) {
                this.f2541a.position(0);
                messageDigest.update(this.f2541a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C4732c implements InterfaceC4734e {
        public C4732c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo2803a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2804b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C4732c(C4730a c4730a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C4733d implements InterfaceC4734e {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f2542a;

            public a(ByteBuffer byteBuffer) {
                this.f2542a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f2542a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j6, byte[] bArr, int i6, int i7) {
                if (j6 >= this.f2542a.limit()) {
                    return -1;
                }
                this.f2542a.position((int) j6);
                int iMin = Math.min(i7, this.f2542a.remaining());
                this.f2542a.get(bArr, i6, iMin);
                return iMin;
            }
        }

        /* renamed from: c */
        public final MediaDataSource m2807c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2803a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m2807c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo2804b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(m2807c(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public interface InterfaceC4734e {
        /* renamed from: a */
        void mo2803a(MediaExtractor mediaExtractor, Object obj);

        /* renamed from: b */
        void mo2804b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public static class C4735f {
        /* renamed from: a */
        public MediaMetadataRetriever m2810a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C4736g implements InterfaceC4734e {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo2803a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC4734e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2804b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(InterfaceC6499d interfaceC6499d, InterfaceC4734e interfaceC4734e) {
        this(interfaceC6499d, interfaceC4734e, f2535f);
    }

    /* renamed from: c */
    public static InterfaceC6286e m2787c(InterfaceC6499d interfaceC6499d) {
        return new VideoDecoder(interfaceC6499d, new C4732c(null));
    }

    /* renamed from: d */
    public static InterfaceC6286e m2788d(InterfaceC6499d interfaceC6499d) {
        return new VideoDecoder(interfaceC6499d, new C4733d());
    }

    /* renamed from: e */
    public static Bitmap m2789e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (m2793j()) {
            try {
                if (m2792i(mediaMetadataRetriever)) {
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
    public static Bitmap m2790g(MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6) {
        return mediaMetadataRetriever.getFrameAtTime(j6, i6);
    }

    /* renamed from: h */
    public static Bitmap m2791h(MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6, int i7, int i8, DownsampleStrategy downsampleStrategy) {
        try {
            int i9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i11 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i11 == 90 || i11 == 270) {
                i10 = i9;
                i9 = i10;
            }
            float fMo2781b = downsampleStrategy.mo2781b(i9, i10, i7, i8);
            return mediaMetadataRetriever.getScaledFrameAtTime(j6, i6, Math.round(i9 * fMo2781b), Math.round(fMo2781b * i10));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m2792i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i6 = Integer.parseInt(strExtractMetadata);
        return (i6 == 7 || i6 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    /* renamed from: j */
    public static boolean m2793j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m2794k();
        }
        int i6 = Build.VERSION.SDK_INT;
        return i6 >= 30 && i6 < 33;
    }

    /* renamed from: k */
    public static boolean m2794k() {
        Iterator it = f2536g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static InterfaceC6286e m2795m(InterfaceC6499d interfaceC6499d) {
        return new VideoDecoder(interfaceC6499d, new C4736g());
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: a */
    public InterfaceC6440j mo2796a(Object obj, int i6, int i7, C6285d c6285d) throws Exception {
        long jLongValue = ((Long) c6285d.m6420c(f2533d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c6285d.m6420c(f2534e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c6285d.m6420c(DownsampleStrategy.f2522h);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f2521g;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetrieverM2810a = this.f2539c.m2810a();
        try {
            this.f2537a.mo2804b(mediaMetadataRetrieverM2810a, obj);
            try {
                Bitmap bitmapM2798f = m2798f(obj, mediaMetadataRetrieverM2810a, jLongValue, num.intValue(), i6, i7, downsampleStrategy2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3242a.m980a(mediaMetadataRetrieverM2810a);
                } else {
                    mediaMetadataRetrieverM2810a.release();
                }
                return C7495f.m8619c(bitmapM2798f, this.f2538b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3242a.m980a(mediaMetadataRetrieverM2810a);
                    throw th2;
                }
                mediaMetadataRetrieverM2810a.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: b */
    public boolean mo2797b(Object obj, C6285d c6285d) {
        return true;
    }

    /* renamed from: f */
    public final Bitmap m2798f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j6, int i6, int i7, int i8, DownsampleStrategy downsampleStrategy) {
        if (m2799l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapM2791h = (Build.VERSION.SDK_INT < 27 || i7 == Integer.MIN_VALUE || i8 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f2520f) ? null : m2791h(mediaMetadataRetriever, j6, i6, i7, i8, downsampleStrategy);
        if (bitmapM2791h == null) {
            bitmapM2791h = m2790g(mediaMetadataRetriever, j6, i6);
        }
        Bitmap bitmapM2789e = m2789e(mediaMetadataRetriever, bitmapM2791h);
        if (bitmapM2789e != null) {
            return bitmapM2789e;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: l */
    public final boolean m2799l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
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
            this.f2537a.mo2803a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i6 = 0; i6 < trackCount; i6++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i6).getString("mime"))) {
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

    public VideoDecoder(InterfaceC6499d interfaceC6499d, InterfaceC4734e interfaceC4734e, C4735f c4735f) {
        this.f2538b = interfaceC6499d;
        this.f2537a = interfaceC4734e;
        this.f2539c = c4735f;
    }
}
