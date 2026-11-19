package com.zykj.sketch.core.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, m13558d2 = {"Lcom/zykj/sketch/core/data/RenderTask;", "", "graphTask", "", "Lcom/zykj/sketch/core/data/GraphTask;", "audioTaskList", "Lcom/zykj/sketch/core/data/AudioTask;", "lastSnapshot", "progress", "", "(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;J)V", "getAudioTaskList", "()Ljava/util/List;", "getGraphTask", "getLastSnapshot", "()Lcom/zykj/sketch/core/data/GraphTask;", "setLastSnapshot", "(Lcom/zykj/sketch/core/data/GraphTask;)V", "getProgress", "()J", "setProgress", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RenderTask {
    private final List<AudioTask> audioTaskList;
    private final List<GraphTask> graphTask;
    private GraphTask lastSnapshot;
    private long progress;

    public RenderTask(List<GraphTask> graphTask, List<AudioTask> audioTaskList, GraphTask graphTask2, long j10) {
        Intrinsics.checkNotNullParameter(graphTask, "graphTask");
        Intrinsics.checkNotNullParameter(audioTaskList, "audioTaskList");
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

    /* renamed from: component3, reason: from getter */
    public final GraphTask getLastSnapshot() {
        return this.lastSnapshot;
    }

    /* renamed from: component4, reason: from getter */
    public final long getProgress() {
        return this.progress;
    }

    public final RenderTask copy(List<GraphTask> graphTask, List<AudioTask> audioTaskList, GraphTask lastSnapshot, long progress) {
        Intrinsics.checkNotNullParameter(graphTask, "graphTask");
        Intrinsics.checkNotNullParameter(audioTaskList, "audioTaskList");
        return new RenderTask(graphTask, audioTaskList, lastSnapshot, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderTask)) {
            return false;
        }
        RenderTask renderTask = (RenderTask) other;
        return Intrinsics.areEqual(this.graphTask, renderTask.graphTask) && Intrinsics.areEqual(this.audioTaskList, renderTask.audioTaskList) && Intrinsics.areEqual(this.lastSnapshot, renderTask.lastSnapshot) && this.progress == renderTask.progress;
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

    public /* synthetic */ RenderTask(List list, List list2, GraphTask graphTask, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, graphTask, (i10 & 8) != 0 ? 0L : j10);
    }
}
