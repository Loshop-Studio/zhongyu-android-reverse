package com.zykj.sketch.core.player;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010*\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u000eJ\u001b\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\nJ\u001b\u0010%\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0019¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010)¨\u00062"}, m5110d2 = {"Lcom/zykj/sketch/core/player/PaintThread;", "Lcom/zykj/sketch/core/player/PlayThread;", "Lcom/zykj/sketch/core/GraphControl;", "graphControl", "<init>", "(Lcom/zykj/sketch/core/GraphControl;)V", "", "progress", "Ld6/s;", "notifyProgress", "(J)V", "getTotalDuration", "()J", "run", "()V", "", RequestParameters.POSITION, "seekTo", "(I)V", "startPlay", "resumePlay", "waitPlay", "pausePlay", "stopPlay", "initSeekTo", "", "Lcom/zykj/sketch/core/data/GraphTask;", "graphTaskList", "setData", "(Ljava/util/List;)V", "lastGraphTask", "setLastTask", "(Lcom/zykj/sketch/core/data/GraphTask;)V", "maxProgress", "setMaxProgress", "Lcom/zykj/sketch/core/listener/PlayActionListener;", "playActionListener", "setProgressListener", "shutdown", "Lcom/zykj/sketch/core/GraphControl;", "Ljava/util/List;", "J", "lastTask", "Lcom/zykj/sketch/core/data/GraphTask;", "", "iterator", "Ljava/util/ListIterator;", "playTime", "startTime", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PaintThread extends PlayThread {
    public static final long PERIOD = 40;

    @NotNull
    private final GraphControl graphControl;

    @NotNull
    private List<GraphTask> graphTaskList;

    @Nullable
    private ListIterator<GraphTask> iterator;

    @Nullable
    private GraphTask lastTask;
    private long maxProgress;

    @Nullable
    private List<PlayActionListener> playActionListener;
    private long playTime;
    private long startTime;

    public PaintThread(@NotNull GraphControl graphControl) {
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.graphControl = graphControl;
        this.graphTaskList = new ArrayList();
        this.startTime = System.nanoTime();
    }

    private final long getTotalDuration() {
        if (this.graphTaskList.isEmpty()) {
            return 0L;
        }
        return ((GraphTask) AbstractC5805t.m5235o0(this.graphTaskList)).getStartTime();
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
        InterfaceC6469a snapshotVoid;
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
        InterfaceC6469a snapshotVoid;
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
                long j7 = this.playTime + 40;
                this.playTime = j7;
                notifyProgress(j7);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void seekTo(int position) {
        this.playTime = position;
    }

    public final void setData(@NotNull List<GraphTask> graphTaskList) {
        AbstractC5830k.m5330g(graphTaskList, "graphTaskList");
        this.graphTaskList.clear();
        this.graphTaskList.addAll(graphTaskList);
        this.iterator = this.graphTaskList.listIterator();
    }

    public final void setLastTask(@Nullable GraphTask lastGraphTask) {
        this.lastTask = lastGraphTask;
    }

    public final void setMaxProgress(long maxProgress) {
        this.maxProgress = maxProgress;
    }

    public final void setProgressListener(@NotNull List<PlayActionListener> playActionListener) {
        AbstractC5830k.m5330g(playActionListener, "playActionListener");
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
