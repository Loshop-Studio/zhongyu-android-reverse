package com.zykj.sketch.core.player;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.data.PlayStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/sketch/core/player/PlayThread;", "Ljava/lang/Thread;", "<init>", "()V", "Ld6/s;", "startPlay", "resumePlay", "pausePlay", "waitPlay", "stopPlay", "Lcom/zykj/sketch/core/data/PlayStatus;", "getStatus", "()Lcom/zykj/sketch/core/data/PlayStatus;", "reset", "shutdown", "playStatus", "Lcom/zykj/sketch/core/data/PlayStatus;", "getPlayStatus", "setPlayStatus", "(Lcom/zykj/sketch/core/data/PlayStatus;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class PlayThread extends Thread {

    @NotNull
    private PlayStatus playStatus = PlayStatus.RECORD_END;

    @NotNull
    public final PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    @NotNull
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

    public final void setPlayStatus(@NotNull PlayStatus playStatus) {
        AbstractC5830k.m5330g(playStatus, "<set-?>");
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
