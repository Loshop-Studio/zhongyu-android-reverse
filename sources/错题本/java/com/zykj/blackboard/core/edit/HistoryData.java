package com.zykj.blackboard.core.edit;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.Graph;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/HistoryData;", "", "rootGraph", "Lcom/zykj/blackboard/core/graph/Graph;", "backgroundColor", "", "backgroundLineConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundColor", "()I", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "getRootGraph", "()Lcom/zykj/blackboard/core/graph/Graph;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class HistoryData {
    private final int backgroundColor;

    @NotNull
    private final BackgroundLineConfig backgroundLineConfig;

    @NotNull
    private final Graph rootGraph;

    public HistoryData(@NotNull Graph rootGraph, int i, @NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        this.rootGraph = rootGraph;
        this.backgroundColor = i;
        this.backgroundLineConfig = backgroundLineConfig;
    }

    public static /* synthetic */ HistoryData copy$default(HistoryData historyData, Graph graph, int i, BackgroundLineConfig backgroundLineConfig, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            graph = historyData.rootGraph;
        }
        if ((i8 & 2) != 0) {
            i = historyData.backgroundColor;
        }
        if ((i8 & 4) != 0) {
            backgroundLineConfig = historyData.backgroundLineConfig;
        }
        return historyData.copy(graph, i, backgroundLineConfig);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Graph getRootGraph() {
        return this.rootGraph;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BackgroundLineConfig getBackgroundLineConfig() {
        return this.backgroundLineConfig;
    }

    @NotNull
    public final HistoryData copy(@NotNull Graph rootGraph, int backgroundColor, @NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        return new HistoryData(rootGraph, backgroundColor, backgroundLineConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryData)) {
            return false;
        }
        HistoryData historyData = (HistoryData) other;
        return AbstractC5830k.m5325b(this.rootGraph, historyData.rootGraph) && this.backgroundColor == historyData.backgroundColor && AbstractC5830k.m5325b(this.backgroundLineConfig, historyData.backgroundLineConfig);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BackgroundLineConfig getBackgroundLineConfig() {
        return this.backgroundLineConfig;
    }

    @NotNull
    public final Graph getRootGraph() {
        return this.rootGraph;
    }

    public int hashCode() {
        return this.backgroundLineConfig.hashCode() + AbstractC0584a.m902c(this.backgroundColor, this.rootGraph.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "HistoryData(rootGraph=" + this.rootGraph + ", backgroundColor=" + this.backgroundColor + ", backgroundLineConfig=" + this.backgroundLineConfig + ')';
    }
}
