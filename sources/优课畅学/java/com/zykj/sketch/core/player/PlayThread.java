package com.zykj.sketch.core.player;

import com.zykj.sketch.core.data.PlayStatus;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
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
        AbstractC9133u.m16133g(playStatus, "<set-?>");
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
