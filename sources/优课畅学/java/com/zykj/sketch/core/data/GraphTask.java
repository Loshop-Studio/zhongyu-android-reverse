package com.zykj.sketch.core.data;

import com.zykj.sketch.EzyDrawBoard;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class GraphTask {
    private final EzyDrawBoard.ActionContent actionContent;
    private final InterfaceC10559a executeVoid;
    private final boolean hasSnapshot;
    private final InterfaceC10559a snapshotVoid;
    private final long startTime;

    public GraphTask(long j10, EzyDrawBoard.ActionContent actionContent, InterfaceC10559a executeVoid, boolean z10, InterfaceC10559a snapshotVoid) {
        AbstractC9133u.m16133g(actionContent, "actionContent");
        AbstractC9133u.m16133g(executeVoid, "executeVoid");
        AbstractC9133u.m16133g(snapshotVoid, "snapshotVoid");
        this.startTime = j10;
        this.actionContent = actionContent;
        this.executeVoid = executeVoid;
        this.hasSnapshot = z10;
        this.snapshotVoid = snapshotVoid;
    }

    public static /* synthetic */ GraphTask copy$default(GraphTask graphTask, long j10, EzyDrawBoard.ActionContent actionContent, InterfaceC10559a interfaceC10559a, boolean z10, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = graphTask.startTime;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            actionContent = graphTask.actionContent;
        }
        EzyDrawBoard.ActionContent actionContent2 = actionContent;
        if ((i10 & 4) != 0) {
            interfaceC10559a = graphTask.executeVoid;
        }
        InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
        if ((i10 & 8) != 0) {
            z10 = graphTask.hasSnapshot;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            interfaceC10559a2 = graphTask.snapshotVoid;
        }
        return graphTask.copy(j11, actionContent2, interfaceC10559a3, z11, interfaceC10559a2);
    }

    public final long component1() {
        return this.startTime;
    }

    public final EzyDrawBoard.ActionContent component2() {
        return this.actionContent;
    }

    public final InterfaceC10559a component3() {
        return this.executeVoid;
    }

    public final boolean component4() {
        return this.hasSnapshot;
    }

    public final InterfaceC10559a component5() {
        return this.snapshotVoid;
    }

    public final GraphTask copy(long j10, EzyDrawBoard.ActionContent actionContent, InterfaceC10559a executeVoid, boolean z10, InterfaceC10559a snapshotVoid) {
        AbstractC9133u.m16133g(actionContent, "actionContent");
        AbstractC9133u.m16133g(executeVoid, "executeVoid");
        AbstractC9133u.m16133g(snapshotVoid, "snapshotVoid");
        return new GraphTask(j10, actionContent, executeVoid, z10, snapshotVoid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphTask)) {
            return false;
        }
        GraphTask graphTask = (GraphTask) obj;
        return this.startTime == graphTask.startTime && AbstractC9133u.m16128b(this.actionContent, graphTask.actionContent) && AbstractC9133u.m16128b(this.executeVoid, graphTask.executeVoid) && this.hasSnapshot == graphTask.hasSnapshot && AbstractC9133u.m16128b(this.snapshotVoid, graphTask.snapshotVoid);
    }

    public final EzyDrawBoard.ActionContent getActionContent() {
        return this.actionContent;
    }

    public final InterfaceC10559a getExecuteVoid() {
        return this.executeVoid;
    }

    public final boolean getHasSnapshot() {
        return this.hasSnapshot;
    }

    public final InterfaceC10559a getSnapshotVoid() {
        return this.snapshotVoid;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.startTime) * 31) + this.actionContent.hashCode()) * 31) + this.executeVoid.hashCode()) * 31;
        boolean z10 = this.hasSnapshot;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((iHashCode + i10) * 31) + this.snapshotVoid.hashCode();
    }

    public String toString() {
        return "GraphTask(startTime=" + this.startTime + ", actionContent=" + this.actionContent + ", executeVoid=" + this.executeVoid + ", hasSnapshot=" + this.hasSnapshot + ", snapshotVoid=" + this.snapshotVoid + ')';
    }

    public /* synthetic */ GraphTask(long j10, EzyDrawBoard.ActionContent actionContent, InterfaceC10559a interfaceC10559a, boolean z10, InterfaceC10559a interfaceC10559a2, int i10, AbstractC9126n abstractC9126n) {
        this(j10, actionContent, interfaceC10559a, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? new InterfaceC10559a() { // from class: com.zykj.sketch.core.data.GraphTask.1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27510invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27510invoke();
                return C8736p.f16368a;
            }
        } : interfaceC10559a2);
    }
}
