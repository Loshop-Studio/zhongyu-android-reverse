package com.zykj.blackboard.core.execute;

import com.zykj.blackboard.bean.PlaySpeed;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.listener.PlayStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public abstract class PlayThread extends Thread {
    private IGraphControl graphControl;
    private MatrixAdapter matrixAdapter;
    private PlaySpeed playSpeed;
    private SourceLoader sourceLoader;
    private PlayStatus playStatus = PlayStatus.RECORD_END;
    private List<PlayStatusListener> playListener = new ArrayList();
    private List<PlayFinishListener> finishListener = new ArrayList();

    public PlayThread() {
        System.out.println((Object) ("PlayThread " + Thread.currentThread().getName()));
    }

    public final List<PlayFinishListener> getFinishListener() {
        return this.finishListener;
    }

    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final List<PlayStatusListener> getPlayListener() {
        return this.playListener;
    }

    public final PlaySpeed getPlaySpeed() {
        return this.playSpeed;
    }

    public final PlayStatus getPlayStatus() {
        return this.playStatus;
    }

    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    public final PlayStatus getStatus() {
        return this.playStatus;
    }

    public final void notifyFinish(boolean z10) {
        Iterator<T> it = this.finishListener.iterator();
        while (it.hasNext()) {
            ((PlayFinishListener) it.next()).finish(this, z10);
        }
    }

    public final void notifyProgress(long j10) {
        Iterator<T> it = this.playListener.iterator();
        while (it.hasNext()) {
            ((PlayStatusListener) it.next()).onProgress(j10);
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

    public final void setFinishListener(List<PlayFinishListener> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.finishListener = list;
    }

    public final void setGraphControl(IGraphControl iGraphControl) {
        this.graphControl = iGraphControl;
    }

    public final void setMatrixAdapter(MatrixAdapter matrixAdapter) {
        this.matrixAdapter = matrixAdapter;
    }

    public final void setPlayListener(List<PlayStatusListener> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.playListener = list;
    }

    public final void setPlaySpeed(PlaySpeed playSpeed) {
        this.playSpeed = playSpeed;
    }

    public final void setPlayStatus(PlayStatus playStatus) {
        AbstractC9133u.m16133g(playStatus, "<set-?>");
        this.playStatus = playStatus;
    }

    public final void setSourceLoader(SourceLoader sourceLoader) {
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
