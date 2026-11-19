package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.core.util.Preconditions;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class DebugUtils {
    private static final String AUDIO_CAPS_PREFIX = "[AudioCaps] ";
    private static final String CODEC_CAPS_PREFIX = "[CodecCaps] ";
    private static final String ENCODER_CAPS_PREFIX = "[EncoderCaps] ";
    private static final String TAG = "DebugUtils";
    private static final String VIDEO_CAPS_PREFIX = "[VideoCaps] ";

    private DebugUtils() {
    }

    private static void dumpAudioCapabilities(@NonNull StringBuilder sb, @NonNull MediaCodecInfo.AudioCapabilities audioCapabilities, @NonNull MediaFormat mediaFormat) {
        logToString(sb, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        logToString(sb, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            logToString(sb, "[AudioCaps] getMinInputChannelCount = " + Api31Impl.getMinInputChannelCount(audioCapabilities));
            logToString(sb, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(Api31Impl.getInputChannelCountRanges(audioCapabilities)));
        }
        logToString(sb, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        logToString(sb, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            logToString(sb, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    @NonNull
    public static String dumpCodecCapabilities(@NonNull String str, @NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            Preconditions.checkArgument(capabilitiesForType != null);
            dumpCodecCapabilities(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            logToString(sb, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb.toString();
    }

    private static void dumpEncoderCapabilities(@NonNull StringBuilder sb, @NonNull MediaCodecInfo.EncoderCapabilities encoderCapabilities, @NonNull MediaFormat mediaFormat) {
        logToString(sb, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            logToString(sb, "[EncoderCaps] getQualityRange = " + Api28Impl.getQualityRange(encoderCapabilities));
        }
        try {
            logToString(sb, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    @NonNull
    public static String dumpMediaCodecListForFormat(@NonNull MediaCodecList mediaCodecList, @NonNull MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        logToString(sb, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z9 = true;
                try {
                    Preconditions.checkArgument(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z9 = false;
                    }
                    Preconditions.checkArgument(z9);
                    logToString(sb, "[Start] [" + mediaCodecInfo.getName() + "]");
                    dumpCodecCapabilities(sb, capabilitiesForType, mediaFormat);
                    logToString(sb, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    logToString(sb, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        logToString(sb, "[End] Dump MediaCodecList");
        String string2 = sb.toString();
        stringToLog(string2);
        return string2;
    }

    private static void dumpVideoCapabilities(@NonNull StringBuilder sb, @NonNull MediaCodecInfo.VideoCapabilities videoCapabilities, @NonNull MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z9;
        logToString(sb, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        logToString(sb, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        logToString(sb, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i10 = 0;
        boolean z10 = true;
        try {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
            Preconditions.checkArgument(integer > 0 && integer2 > 0);
            z9 = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            integer = 0;
            integer2 = 0;
            z9 = false;
        }
        if (z9) {
            try {
                logToString(sb, "[VideoCaps] getSupportedHeightsFor " + integer + " = " + videoCapabilities.getSupportedHeightsFor(integer));
            } catch (IllegalArgumentException unused2) {
                logToString(sb, "[VideoCaps] could not getSupportedHeightsFor " + integer);
            }
            try {
                logToString(sb, "[VideoCaps] getSupportedWidthsFor " + integer2 + " = " + videoCapabilities.getSupportedWidthsFor(integer2));
            } catch (IllegalArgumentException unused3) {
                logToString(sb, "[VideoCaps] could not getSupportedWidthsFor " + integer2);
            }
            logToString(sb, "[VideoCaps] isSizeSupported for " + integer + "x" + integer2 + " = " + videoCapabilities.isSizeSupported(integer, integer2));
        }
        logToString(sb, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer3 = mediaFormat.getInteger("frame-rate");
            if (integer3 <= 0) {
                z10 = false;
            }
            Preconditions.checkArgument(z10);
            i10 = integer3;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            logToString(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z9) {
            logToString(sb, "[VideoCaps] getSupportedFrameRatesFor " + integer + "x" + integer2 + " = " + videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
        }
        if (!z9 || i10 <= 0) {
            return;
        }
        logToString(sb, "[VideoCaps] areSizeAndRateSupported for " + integer + "x" + integer2 + ", " + i10 + " = " + videoCapabilities.areSizeAndRateSupported(integer, integer2, i10));
    }

    private static String formatInterval(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j10);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j10 - timeUnit2.toMillis(hours));
        long millis = j10 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    private static void logToString(@NonNull StringBuilder sb, @NonNull String str) {
        sb.append(str);
        sb.append(SignParameters.NEW_LINE);
    }

    @NonNull
    public static String readableBufferInfo(@NonNull MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dump BufferInfo: " + bufferInfo.toString() + SignParameters.NEW_LINE);
        sb.append("\toffset: " + bufferInfo.offset + SignParameters.NEW_LINE);
        sb.append("\tsize: " + bufferInfo.size + SignParameters.NEW_LINE);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tflag: ");
        sb2.append(bufferInfo.flags);
        sb.append(sb2.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb.append(" (");
            sb.append(TextUtils.join(" | ", arrayList));
            sb.append(")");
        }
        sb.append(SignParameters.NEW_LINE);
        sb.append("\tpresentationTime: " + bufferInfo.presentationTimeUs + " (" + readableUs(bufferInfo.presentationTimeUs) + ")\n");
        return sb.toString();
    }

    @NonNull
    public static String readableMs(long j10) {
        return formatInterval(j10);
    }

    @NonNull
    public static String readableUs(long j10) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j10));
    }

    private static void stringToLog(@NonNull String str) {
        if (Logger.isInfoEnabled(TAG)) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                Logger.m727i(TAG, scanner.nextLine());
            }
        }
    }

    @NonNull
    private static String toString(@Nullable MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        return codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }

    private static void dumpCodecCapabilities(@NonNull StringBuilder sb, @NonNull MediaCodecInfo.CodecCapabilities codecCapabilities, @NonNull MediaFormat mediaFormat) {
        try {
            logToString(sb, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            logToString(sb, "[CodecCaps] isFormatSupported=false");
        }
        logToString(sb, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(toString(codecProfileLevel));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            logToString(sb, "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            logToString(sb, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            dumpVideoCapabilities(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            dumpAudioCapabilities(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            dumpEncoderCapabilities(sb, encoderCapabilities, mediaFormat);
        }
    }
}
