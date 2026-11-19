package io.microshow.rxffmpeg;

/* loaded from: classes5.dex */
public class RxFFmpegProgress {
    public int progress;
    public long progressTime;
    public int state;

    public RxFFmpegProgress(int i9, int i10, long j9) {
        this.state = i9;
        this.progress = i10;
        this.progressTime = j9;
    }

    public RxFFmpegProgress(int i9) {
        this(i9, 0, 0L);
    }
}
