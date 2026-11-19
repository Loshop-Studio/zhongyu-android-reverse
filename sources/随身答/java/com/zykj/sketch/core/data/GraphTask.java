package com.zykj.sketch.core.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m13413d2 = {"Lcom/zykj/sketch/core/data/GraphTask;", "", "startTime", "", "actionContent", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "executeVoid", "Lkotlin/Function0;", "", "hasSnapshot", "", "snapshotVoid", "(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V", "getActionContent", "()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "getExecuteVoid", "()Lkotlin/jvm/functions/Function0;", "getHasSnapshot", "()Z", "getSnapshotVoid", "getStartTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class GraphTask {
    private final EzyDrawBoard.ActionContent actionContent;
    private final Function0<Unit> executeVoid;
    private final boolean hasSnapshot;
    private final Function0<Unit> snapshotVoid;
    private final long startTime;

    public GraphTask(long j9, EzyDrawBoard.ActionContent actionContent, Function0<Unit> executeVoid, boolean z9, Function0<Unit> snapshotVoid) {
        Intrinsics.checkNotNullParameter(actionContent, "actionContent");
        Intrinsics.checkNotNullParameter(executeVoid, "executeVoid");
        Intrinsics.checkNotNullParameter(snapshotVoid, "snapshotVoid");
        this.startTime = j9;
        this.actionContent = actionContent;
        this.executeVoid = executeVoid;
        this.hasSnapshot = z9;
        this.snapshotVoid = snapshotVoid;
    }

    public static /* synthetic */ GraphTask copy$default(GraphTask graphTask, long j9, EzyDrawBoard.ActionContent actionContent, Function0 function0, boolean z9, Function0 function02, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = graphTask.startTime;
        }
        long j10 = j9;
        if ((i9 & 2) != 0) {
            actionContent = graphTask.actionContent;
        }
        EzyDrawBoard.ActionContent actionContent2 = actionContent;
        if ((i9 & 4) != 0) {
            function0 = graphTask.executeVoid;
        }
        Function0 function03 = function0;
        if ((i9 & 8) != 0) {
            z9 = graphTask.hasSnapshot;
        }
        boolean z10 = z9;
        if ((i9 & 16) != 0) {
            function02 = graphTask.snapshotVoid;
        }
        return graphTask.copy(j10, actionContent2, function03, z10, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final EzyDrawBoard.ActionContent getActionContent() {
        return this.actionContent;
    }

    public final Function0<Unit> component3() {
        return this.executeVoid;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasSnapshot() {
        return this.hasSnapshot;
    }

    public final Function0<Unit> component5() {
        return this.snapshotVoid;
    }

    public final GraphTask copy(long startTime, EzyDrawBoard.ActionContent actionContent, Function0<Unit> executeVoid, boolean hasSnapshot, Function0<Unit> snapshotVoid) {
        Intrinsics.checkNotNullParameter(actionContent, "actionContent");
        Intrinsics.checkNotNullParameter(executeVoid, "executeVoid");
        Intrinsics.checkNotNullParameter(snapshotVoid, "snapshotVoid");
        return new GraphTask(startTime, actionContent, executeVoid, hasSnapshot, snapshotVoid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphTask)) {
            return false;
        }
        GraphTask graphTask = (GraphTask) other;
        return this.startTime == graphTask.startTime && Intrinsics.areEqual(this.actionContent, graphTask.actionContent) && Intrinsics.areEqual(this.executeVoid, graphTask.executeVoid) && this.hasSnapshot == graphTask.hasSnapshot && Intrinsics.areEqual(this.snapshotVoid, graphTask.snapshotVoid);
    }

    public final EzyDrawBoard.ActionContent getActionContent() {
        return this.actionContent;
    }

    public final Function0<Unit> getExecuteVoid() {
        return this.executeVoid;
    }

    public final boolean getHasSnapshot() {
        return this.hasSnapshot;
    }

    public final Function0<Unit> getSnapshotVoid() {
        return this.snapshotVoid;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.startTime) * 31) + this.actionContent.hashCode()) * 31) + this.executeVoid.hashCode()) * 31;
        boolean z9 = this.hasSnapshot;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        return ((iHashCode + i9) * 31) + this.snapshotVoid.hashCode();
    }

    public String toString() {
        return "GraphTask(startTime=" + this.startTime + ", actionContent=" + this.actionContent + ", executeVoid=" + this.executeVoid + ", hasSnapshot=" + this.hasSnapshot + ", snapshotVoid=" + this.snapshotVoid + ')';
    }

    public /* synthetic */ GraphTask(long j9, EzyDrawBoard.ActionContent actionContent, Function0 function0, boolean z9, Function0 function02, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, actionContent, function0, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? new Function0<Unit>() { // from class: com.zykj.sketch.core.data.GraphTask.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02);
    }
}
