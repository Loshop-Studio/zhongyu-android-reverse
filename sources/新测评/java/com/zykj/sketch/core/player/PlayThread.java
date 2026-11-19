package com.zykj.sketch.core.player;

import com.zykj.sketch.core.data.PlayStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m13558d2 = {"Lcom/zykj/sketch/core/player/PlayThread;", "Ljava/lang/Thread;", "()V", "playStatus", "Lcom/zykj/sketch/core/data/PlayStatus;", "getPlayStatus", "()Lcom/zykj/sketch/core/data/PlayStatus;", "setPlayStatus", "(Lcom/zykj/sketch/core/data/PlayStatus;)V", "getStatus", "pausePlay", "", "reset", "resumePlay", "shutdown", "startPlay", "stopPlay", "waitPlay", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public abstract class PlayThread extends Thread {
    private PlayStatus playStatus = PlayStatus.RECORD_END;

    public final PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    public final PlayStatus getStatus() {
        return this.playStatus;
    }

    public void pausePlay() {
        this.playStatus = PlayStatus.RECORD_PAUSE;
    }

    public void reset() {
        this.playStatus = PlayStatus.RECORD_END;
    }

    public void resumePlay() {
        this.playStatus = PlayStatus.RECORD_RESUME;
    }

    public final void setPlayStatus(PlayStatus playStatus) {
        Intrinsics.checkNotNullParameter(playStatus, "<set-?>");
        this.playStatus = playStatus;
    }

    public void shutdown() {
        this.playStatus = PlayStatus.RECORD_END;
    }

    public void startPlay() {
        this.playStatus = PlayStatus.RECORD_START;
    }

    public void stopPlay() {
        this.playStatus = PlayStatus.RECORD_END;
    }

    public void waitPlay() {
        this.playStatus = PlayStatus.RECORD_WAIT;
    }
}
