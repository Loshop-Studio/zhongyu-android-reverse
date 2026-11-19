package com.zykj.sketch.core.data;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class RenderTask {
    private final List<AudioTask> audioTaskList;
    private final List<GraphTask> graphTask;
    private GraphTask lastSnapshot;
    private long progress;

    public RenderTask(List<GraphTask> graphTask, List<AudioTask> audioTaskList, GraphTask graphTask2, long j10) {
        AbstractC9979u.m20294g(graphTask, "graphTask");
        AbstractC9979u.m20294g(audioTaskList, "audioTaskList");
        this.graphTask = graphTask;
        this.audioTaskList = audioTaskList;
        this.lastSnapshot = graphTask2;
        this.progress = j10;
    }

    public static /* synthetic */ RenderTask copy$default(RenderTask renderTask, List list, List list2, GraphTask graphTask, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = renderTask.graphTask;
        }
        if ((i10 & 2) != 0) {
            list2 = renderTask.audioTaskList;
        }
        if ((i10 & 4) != 0) {
            graphTask = renderTask.lastSnapshot;
        }
        if ((i10 & 8) != 0) {
            j10 = renderTask.progress;
        }
        GraphTask graphTask2 = graphTask;
        return renderTask.copy(list, list2, graphTask2, j10);
    }

    public final List<GraphTask> component1() {
        return this.graphTask;
    }

    public final List<AudioTask> component2() {
        return this.audioTaskList;
    }

    public final GraphTask component3() {
        return this.lastSnapshot;
    }

    public final long component4() {
        return this.progress;
    }

    public final RenderTask copy(List<GraphTask> graphTask, List<AudioTask> audioTaskList, GraphTask graphTask2, long j10) {
        AbstractC9979u.m20294g(graphTask, "graphTask");
        AbstractC9979u.m20294g(audioTaskList, "audioTaskList");
        return new RenderTask(graphTask, audioTaskList, graphTask2, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderTask)) {
            return false;
        }
        RenderTask renderTask = (RenderTask) obj;
        return AbstractC9979u.m20289b(this.graphTask, renderTask.graphTask) && AbstractC9979u.m20289b(this.audioTaskList, renderTask.audioTaskList) && AbstractC9979u.m20289b(this.lastSnapshot, renderTask.lastSnapshot) && this.progress == renderTask.progress;
    }

    public final List<AudioTask> getAudioTaskList() {
        return this.audioTaskList;
    }

    public final List<GraphTask> getGraphTask() {
        return this.graphTask;
    }

    public final GraphTask getLastSnapshot() {
        return this.lastSnapshot;
    }

    public final long getProgress() {
        return this.progress;
    }

    public int hashCode() {
        int iHashCode = ((this.graphTask.hashCode() * 31) + this.audioTaskList.hashCode()) * 31;
        GraphTask graphTask = this.lastSnapshot;
        return ((iHashCode + (graphTask == null ? 0 : graphTask.hashCode())) * 31) + Long.hashCode(this.progress);
    }

    public final void setLastSnapshot(GraphTask graphTask) {
        this.lastSnapshot = graphTask;
    }

    public final void setProgress(long j10) {
        this.progress = j10;
    }

    public String toString() {
        return "RenderTask(graphTask=" + this.graphTask + ", audioTaskList=" + this.audioTaskList + ", lastSnapshot=" + this.lastSnapshot + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ RenderTask(List list, List list2, GraphTask graphTask, long j10, int i10, AbstractC9972n abstractC9972n) {
        this(list, list2, graphTask, (i10 & 8) != 0 ? 0L : j10);
    }
}
