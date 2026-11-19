package com.zykj.blackboard.core.edit;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.Graph;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class HistoryData {
    private final int backgroundColor;
    private final BackgroundLineConfig backgroundLineConfig;
    private final Graph rootGraph;

    public HistoryData(Graph rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        this.rootGraph = rootGraph;
        this.backgroundColor = i10;
        this.backgroundLineConfig = backgroundLineConfig;
    }

    public static /* synthetic */ HistoryData copy$default(HistoryData historyData, Graph graph, int i10, BackgroundLineConfig backgroundLineConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            graph = historyData.rootGraph;
        }
        if ((i11 & 2) != 0) {
            i10 = historyData.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            backgroundLineConfig = historyData.backgroundLineConfig;
        }
        return historyData.copy(graph, i10, backgroundLineConfig);
    }

    public final Graph component1() {
        return this.rootGraph;
    }

    public final int component2() {
        return this.backgroundColor;
    }

    public final BackgroundLineConfig component3() {
        return this.backgroundLineConfig;
    }

    public final HistoryData copy(Graph rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        return new HistoryData(rootGraph, i10, backgroundLineConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryData)) {
            return false;
        }
        HistoryData historyData = (HistoryData) obj;
        return AbstractC9133u.m16128b(this.rootGraph, historyData.rootGraph) && this.backgroundColor == historyData.backgroundColor && AbstractC9133u.m16128b(this.backgroundLineConfig, historyData.backgroundLineConfig);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BackgroundLineConfig getBackgroundLineConfig() {
        return this.backgroundLineConfig;
    }

    public final Graph getRootGraph() {
        return this.rootGraph;
    }

    public int hashCode() {
        return (((this.rootGraph.hashCode() * 31) + Integer.hashCode(this.backgroundColor)) * 31) + this.backgroundLineConfig.hashCode();
    }

    public String toString() {
        return "HistoryData(rootGraph=" + this.rootGraph + ", backgroundColor=" + this.backgroundColor + ", backgroundLineConfig=" + this.backgroundLineConfig + ')';
    }
}
