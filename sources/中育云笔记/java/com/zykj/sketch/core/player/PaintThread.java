package com.zykj.sketch.core.player;

import com.zykj.sketch.core.GraphControl;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.PlayStatus;
import com.zykj.sketch.core.listener.PlayActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10947g0;

/* loaded from: classes6.dex */
public final class PaintThread extends PlayThread {
    public static final Companion Companion = new Companion(null);
    public static final long PERIOD = 40;
    private final GraphControl graphControl;
    private List<GraphTask> graphTaskList;
    private ListIterator<GraphTask> iterator;
    private GraphTask lastTask;
    private long maxProgress;
    private List<PlayActionListener> playActionListener;
    private long playTime;
    private long startTime;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public PaintThread(GraphControl graphControl) {
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.graphControl = graphControl;
        this.graphTaskList = new ArrayList();
        this.startTime = System.nanoTime();
    }

    private final long getTotalDuration() {
        if (this.graphTaskList.isEmpty()) {
            return 0L;
        }
        return ((GraphTask) AbstractC10947g0.m23956y0(this.graphTaskList)).getStartTime();
    }

    private final void notifyProgress(long j10) {
        long totalDuration = getPlayStatus() == PlayStatus.RECORD_END ? getTotalDuration() : j10;
        if (getTotalDuration() < j10) {
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
        InterfaceC9529a snapshotVoid;
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
        InterfaceC9529a snapshotVoid;
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

    public final void seekTo(int i10) {
        this.playTime = i10;
    }

    public final void setData(List<GraphTask> graphTaskList) {
        AbstractC9979u.m20294g(graphTaskList, "graphTaskList");
        this.graphTaskList.clear();
        this.graphTaskList.addAll(graphTaskList);
        this.iterator = this.graphTaskList.listIterator();
    }

    public final void setLastTask(GraphTask graphTask) {
        this.lastTask = graphTask;
    }

    public final void setMaxProgress(long j10) {
        this.maxProgress = j10;
    }

    public final void setProgressListener(List<PlayActionListener> playActionListener) {
        AbstractC9979u.m20294g(playActionListener, "playActionListener");
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
