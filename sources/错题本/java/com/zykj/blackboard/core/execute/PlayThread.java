package com.zykj.blackboard.core.execute;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.PlaySpeed;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.PlayStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010@\u001a\b\u0012\u0004\u0012\u00020?078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>¨\u0006C"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/PlayThread;", "Ljava/lang/Thread;", "<init>", "()V", "Ld6/s;", "startPlay", "resumePlay", "pausePlay", "stopPlay", "Lcom/zykj/blackboard/enums/PlayStatus;", "getStatus", "()Lcom/zykj/blackboard/enums/PlayStatus;", "reset", "shutdown", "", "playTime", "notifyProgress", "(J)V", "", "isCompleted", "notifyFinish", "(Z)V", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "setGraphControl", "(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "getSourceLoader", "()Lcom/zykj/blackboard/core/loader/SourceLoader;", "setSourceLoader", "(Lcom/zykj/blackboard/core/loader/SourceLoader;)V", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "setMatrixAdapter", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V", "playStatus", "Lcom/zykj/blackboard/enums/PlayStatus;", "getPlayStatus", "setPlayStatus", "(Lcom/zykj/blackboard/enums/PlayStatus;)V", "Lcom/zykj/blackboard/bean/PlaySpeed;", "playSpeed", "Lcom/zykj/blackboard/bean/PlaySpeed;", "getPlaySpeed", "()Lcom/zykj/blackboard/bean/PlaySpeed;", "setPlaySpeed", "(Lcom/zykj/blackboard/bean/PlaySpeed;)V", "", "Lcom/zykj/blackboard/listener/PlayStatusListener;", "playListener", "Ljava/util/List;", "getPlayListener", "()Ljava/util/List;", "setPlayListener", "(Ljava/util/List;)V", "Lcom/zykj/blackboard/core/execute/PlayFinishListener;", "finishListener", "getFinishListener", "setFinishListener", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class PlayThread extends Thread {

    @Nullable
    private IGraphControl graphControl;

    @Nullable
    private MatrixAdapter matrixAdapter;

    @Nullable
    private PlaySpeed playSpeed;

    @Nullable
    private SourceLoader sourceLoader;

    @NotNull
    private PlayStatus playStatus = PlayStatus.RECORD_END;

    @NotNull
    private List<PlayStatusListener> playListener = new ArrayList();

    @NotNull
    private List<PlayFinishListener> finishListener = new ArrayList();

    public PlayThread() {
        System.out.println((Object) ("PlayThread " + Thread.currentThread().getName()));
    }

    @NotNull
    public final List<PlayFinishListener> getFinishListener() {
        return this.finishListener;
    }

    @Nullable
    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    @Nullable
    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    @NotNull
    public final List<PlayStatusListener> getPlayListener() {
        return this.playListener;
    }

    @Nullable
    public final PlaySpeed getPlaySpeed() {
        return this.playSpeed;
    }

    @NotNull
    public final PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    @Nullable
    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    @NotNull
    public final PlayStatus getStatus() {
        return this.playStatus;
    }

    public final void notifyFinish(boolean isCompleted) {
        Iterator<T> it = this.finishListener.iterator();
        while (it.hasNext()) {
            ((PlayFinishListener) it.next()).finish(this, isCompleted);
        }
    }

    public final void notifyProgress(long playTime) {
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onProgress(playTime);
        }
    }

    public void pausePlay() {
        this.playStatus = PlayStatus.RECORD_PAUSE;
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onPlayPause();
        }
    }

    public void reset() {
        this.playStatus = PlayStatus.RECORD_END;
    }

    public void resumePlay() {
        this.playStatus = PlayStatus.RECORD_RESUME;
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onPlayResume();
        }
    }

    public final void setFinishListener(@NotNull List<PlayFinishListener> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.finishListener = list;
    }

    public final void setGraphControl(@Nullable IGraphControl iGraphControl) {
        this.graphControl = iGraphControl;
    }

    public final void setMatrixAdapter(@Nullable MatrixAdapter matrixAdapter) {
        this.matrixAdapter = matrixAdapter;
    }

    public final void setPlayListener(@NotNull List<PlayStatusListener> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.playListener = list;
    }

    public final void setPlaySpeed(@Nullable PlaySpeed playSpeed) {
        this.playSpeed = playSpeed;
    }

    public final void setPlayStatus(@NotNull PlayStatus playStatus) {
        AbstractC5830k.m5330g(playStatus, "<set-?>");
        this.playStatus = playStatus;
    }

    public final void setSourceLoader(@Nullable SourceLoader sourceLoader) {
        this.sourceLoader = sourceLoader;
    }

    public void shutdown() {
        this.playStatus = PlayStatus.RECORD_END;
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onPlayEnd();
        }
        this.playListener.clear();
    }

    public void startPlay() {
        this.playStatus = PlayStatus.RECORD_START;
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onPlayStart();
        }
    }

    public void stopPlay() {
        this.playStatus = PlayStatus.RECORD_END;
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onPlayEnd();
        }
    }
}
