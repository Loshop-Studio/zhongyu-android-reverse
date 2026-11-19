package com.zykj.paint.record;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class AudioEncoder {
    protected String destinationFile;
    protected int SAMPLE_RATE = 8000;
    protected int BIT_RATE = 64;
    protected int CHANNEL_COUNT = 1;

    public abstract void encode(String str);

    public String getDestFile() {
        return this.destinationFile;
    }

    @NonNull
    @TargetApi(16)
    public MediaFormat getMediaFormat(String str) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        return mediaExtractor.getTrackFormat(0);
    }

    public void init(int i, int i8, int i9) {
        this.SAMPLE_RATE = i;
        this.BIT_RATE = i8;
        this.CHANNEL_COUNT = i9;
    }
}
