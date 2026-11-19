package io.microshow.rxffmpeg;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* loaded from: classes5.dex */
public class AudioVideoUtils {
    public static long getDuration(String str) throws IOException {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(selectVideoTrack(mediaExtractor));
            long j10 = trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : 0L;
            mediaExtractor.release();
            return j10;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int getFitBitRate(int i10) {
        if (i10 <= 230400) {
            return 1024000;
        }
        if (i10 <= 307200) {
            return 1536000;
        }
        if (i10 <= 384000) {
            return 1843200;
        }
        if (i10 <= 522240) {
            return 2097152;
        }
        if (i10 <= 921600) {
            return 2621440;
        }
        return i10 <= 2088960 ? 3145728 : 3584000;
    }

    public static int getVideoDuration(String str) throws IOException, IllegalArgumentException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        return Integer.parseInt(strExtractMetadata) / 1000;
    }

    public static int getVideoHeight(String str) throws IOException, IllegalArgumentException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        if (!"90".equals(strExtractMetadata3) && !"270".equals(strExtractMetadata3)) {
            strExtractMetadata = strExtractMetadata2;
        }
        mediaMetadataRetriever.release();
        return Integer.parseInt(strExtractMetadata);
    }

    public static int getVideoRotation(String str) throws IOException, IllegalArgumentException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
        mediaMetadataRetriever.release();
        return Integer.parseInt(strExtractMetadata);
    }

    public static int getVideoWidth(String str) throws IOException, IllegalArgumentException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        if ("90".equals(strExtractMetadata3) || "270".equals(strExtractMetadata3)) {
            strExtractMetadata = strExtractMetadata2;
        }
        mediaMetadataRetriever.release();
        return Integer.parseInt(strExtractMetadata);
    }

    public static boolean isHorizontalVideo(String str) {
        return getVideoWidth(str) >= getVideoHeight(str);
    }

    public static int selectAudioTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("audio/")) {
                return i10;
            }
        }
        return -1;
    }

    public static int selectVideoTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }
}
