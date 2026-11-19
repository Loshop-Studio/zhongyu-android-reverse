package com.zykj.sketch.core.player;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.sketch.core.GraphControl;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.PlayActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010\u001c\u001a\u00020\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010 \u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m13558d2 = {"Lcom/zykj/sketch/core/player/PaintThread;", "Lcom/zykj/sketch/core/player/PlayThread;", "graphControl", "Lcom/zykj/sketch/core/GraphControl;", "(Lcom/zykj/sketch/core/GraphControl;)V", "graphTaskList", "", "Lcom/zykj/sketch/core/data/GraphTask;", "iterator", "", "lastTask", "maxProgress", "", "playActionListener", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "playTime", "startTime", "getTotalDuration", "initSeekTo", "", "notifyProgress", "progress", "pausePlay", "resumePlay", "run", "seekTo", RequestParameters.POSITION, "", "setData", "setLastTask", "lastGraphTask", "setMaxProgress", "setProgressListener", "shutdown", "startPlay", "stopPlay", "waitPlay", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class PaintThread extends PlayThread {
    public static final long PERIOD = 40;
    private final GraphControl graphControl;
    private List<GraphTask> graphTaskList;
    private ListIterator<GraphTask> iterator;
    private GraphTask lastTask;
    private long maxProgress;
    private List<PlayActionListener> playActionListener;
    private long playTime;
    private long startTime;

    public PaintThread(GraphControl graphControl) {
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.graphControl = graphControl;
        this.graphTaskList = new ArrayList();
        this.startTime = System.nanoTime();
    }

    private final long getTotalDuration() {
        if (this.graphTaskList.isEmpty()) {
            return 0L;
        }
        return ((GraphTask) CollectionsKt.last((List) this.graphTaskList)).getStartTime();
    }

    private final void notifyProgress(long progress) {
        long totalDuration = getPlayStatus() == PlayStatus.RECORD_END ? getTotalDuration() : progress;
        if (getTotalDuration() < progress) {
            totalDuration = getTotalDuration();
        }
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayActionListener) it.next()).onProgress(totalDuration);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void initSeekTo() {
        Function0<Unit> snapshotVoid;
        if (this.playTime == 0) {
            this.playTime = 1L;
        }
        ListIterator<GraphTask> listIterator = this.graphTaskList.listIterator();
        this.iterator = listIterator;
        if (listIterator != null) {
            while (listIterator.hasNext()) {
                if (this.playTime < listIterator.next().getStartTime()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    while (listIterator.hasPrevious()) {
                        GraphTask graphTaskPrevious = listIterator.previous();
                        if (graphTaskPrevious.getHasSnapshot()) {
                            graphTaskPrevious.getSnapshotVoid().invoke();
                            this.graphControl.isRender(false);
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            while (true) {
                                if (!listIterator.hasNext()) {
                                    break;
                                }
                                GraphTask next = listIterator.next();
                                if (this.playTime <= next.getStartTime()) {
                                    listIterator.previous();
                                    break;
                                }
                                next.getExecuteVoid().invoke();
                            }
                            this.graphControl.isRender(true);
                            return;
                        }
                    }
                    listIterator.next();
                    this.graphControl.isRender(false);
                    while (listIterator.hasNext()) {
                        GraphTask next2 = listIterator.next();
                        if (this.playTime <= next2.getStartTime()) {
                            break;
                        } else {
                            next2.getExecuteVoid().invoke();
                        }
                    }
                    this.graphControl.isRender(true);
                    return;
                }
            }
            GraphTask graphTask = this.lastTask;
            if (graphTask == null || (snapshotVoid = graphTask.getSnapshotVoid()) == null) {
                return;
            }
            snapshotVoid.invoke();
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void pausePlay() {
        super.pausePlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayPause();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void resumePlay() {
        super.resumePlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayStart();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Function0<Unit> snapshotVoid;
        try {
            if (getPlayStatus() != PlayStatus.RECORD_PAUSE && getPlayStatus() != PlayStatus.RECORD_WAIT) {
                if (getPlayStatus() == PlayStatus.RECORD_END) {
                    this.playTime = 0L;
                    return;
                }
                ListIterator<GraphTask> listIterator = this.iterator;
                if (listIterator != null) {
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        if (getPlayStatus() != PlayStatus.RECORD_PAUSE && getPlayStatus() != PlayStatus.RECORD_WAIT && getPlayStatus() != PlayStatus.RECORD_END) {
                            GraphTask next = listIterator.next();
                            if (next.getStartTime() <= this.playTime) {
                                this.startTime = System.nanoTime();
                                next.getExecuteVoid().invoke();
                            } else if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                        }
                        return;
                    }
                    if (!listIterator.hasNext() && this.playTime > this.maxProgress) {
                        GraphTask graphTask = this.lastTask;
                        if (graphTask != null && (snapshotVoid = graphTask.getSnapshotVoid()) != null) {
                            snapshotVoid.invoke();
                        }
                        stopPlay();
                        this.playTime = 0L;
                        this.graphControl.resetStatus();
                        notifyProgress(this.maxProgress);
                        return;
                    }
                }
                long j10 = this.playTime + 40;
                this.playTime = j10;
                notifyProgress(j10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void seekTo(int position) {
        this.playTime = position;
    }

    public final void setData(List<GraphTask> graphTaskList) {
        Intrinsics.checkNotNullParameter(graphTaskList, "graphTaskList");
        this.graphTaskList.clear();
        this.graphTaskList.addAll(graphTaskList);
        this.iterator = this.graphTaskList.listIterator();
    }

    public final void setLastTask(GraphTask lastGraphTask) {
        this.lastTask = lastGraphTask;
    }

    public final void setMaxProgress(long maxProgress) {
        this.maxProgress = maxProgress;
    }

    public final void setProgressListener(List<PlayActionListener> playActionListener) {
        Intrinsics.checkNotNullParameter(playActionListener, "playActionListener");
        this.playActionListener = playActionListener;
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void shutdown() {
        super.shutdown();
        this.graphTaskList.clear();
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void startPlay() {
        super.startPlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayStart();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void stopPlay() {
        super.stopPlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onPlayEnd();
            }
        }
    }

    @Override // com.zykj.sketch.core.player.PlayThread
    public void waitPlay() {
        super.waitPlay();
        List<PlayActionListener> list = this.playActionListener;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((PlayActionListener) it.next()).onWaitPlay();
            }
        }
    }
}
