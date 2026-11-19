package com.zykj.paint.record;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class AudioEncoder {
    protected String destinationFile;
    protected int SAMPLE_RATE = JosStatusCodes.RTN_CODE_COMMON_ERROR;
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

    public void init(int i10, int i11, int i12) {
        this.SAMPLE_RATE = i10;
        this.BIT_RATE = i11;
        this.CHANNEL_COUNT = i12;
    }
}
