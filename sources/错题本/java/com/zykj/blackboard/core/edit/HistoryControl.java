package com.zykj.blackboard.core.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.listener.WithdrawListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001cj\b\u0012\u0004\u0012\u00020\u000f`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001cj\b\u0012\u0004\u0012\u00020\u000f`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u001cj\b\u0012\u0004\u0012\u00020\u0016`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/HistoryControl;", "", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/canvas/control/GraphControl;)V", "Lcom/zykj/blackboard/core/graph/Graph;", "rootGraph", "", "backgroundColor", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "Ld6/s;", "saveSnapshot", "(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "Lcom/zykj/blackboard/core/edit/HistoryData;", "withDraw", "()Lcom/zykj/blackboard/core/edit/HistoryData;", "recover", "clearHistoryList", "()V", "clearHistoryListWithoutCurrent", "Lcom/zykj/blackboard/listener/WithdrawListener;", "listener", "addWithdrawListener", "(Lcom/zykj/blackboard/listener/WithdrawListener;)V", "removeWithdrawListener", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "historyList", "Ljava/util/ArrayList;", "recycleList", "listenerList", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class HistoryControl {
    public static final int LIST_SIZE = 10;

    @NotNull
    private final GraphControl graphControl;

    @NotNull
    private final ArrayList<HistoryData> historyList;

    @NotNull
    private final ArrayList<WithdrawListener> listenerList;

    @NotNull
    private final ArrayList<HistoryData> recycleList;

    public HistoryControl(@NotNull GraphControl graphControl) {
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.graphControl = graphControl;
        this.historyList = new ArrayList<>();
        this.recycleList = new ArrayList<>();
        this.listenerList = new ArrayList<>();
    }

    public final void addWithdrawListener(@NotNull WithdrawListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listenerList.add(listener);
    }

    public final void clearHistoryList() {
        this.historyList.clear();
        this.recycleList.clear();
        ArrayList<WithdrawListener> arrayList = this.listenerList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WithdrawListener withdrawListener = arrayList.get(i);
            i++;
            withdrawListener.onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
    }

    public final void clearHistoryListWithoutCurrent() {
        while (this.historyList.size() != 1) {
            ArrayList<HistoryData> arrayList = this.historyList;
            AbstractC5830k.m5330g(arrayList, "<this>");
            if (!arrayList.isEmpty()) {
                arrayList.remove(0);
            }
        }
        this.recycleList.clear();
        ArrayList<WithdrawListener> arrayList2 = this.listenerList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            WithdrawListener withdrawListener = arrayList2.get(i);
            i++;
            withdrawListener.onWithdraw(this.historyList.size() > 1, !this.recycleList.isEmpty());
        }
    }

    @Nullable
    public final HistoryData recover() {
        if (this.recycleList.isEmpty()) {
            return null;
        }
        HistoryData historyData = (HistoryData) AbstractC5805t.m5235o0(this.recycleList);
        this.graphControl.init(historyData.getRootGraph().copy());
        this.graphControl.updateBackgroundColor(historyData.getBackgroundColor());
        this.graphControl.updateBackgroundLineConfig(historyData.getBackgroundLineConfig());
        this.graphControl.reDrawFixView();
        this.recycleList.remove(historyData);
        this.historyList.add(historyData);
        ArrayList<WithdrawListener> arrayList = this.listenerList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WithdrawListener withdrawListener = arrayList.get(i);
            i++;
            withdrawListener.onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
        return historyData;
    }

    public final void removeWithdrawListener(@NotNull WithdrawListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listenerList.remove(listener);
    }

    public final void saveSnapshot(@NotNull Graph rootGraph, int backgroundColor, @NotNull BackgroundLineConfig backgroundLineConfig) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        this.historyList.add(new HistoryData(rootGraph.copy(), backgroundColor, backgroundLineConfig));
        while (this.historyList.size() > 11) {
            AbstractC5810y.m5299a0(this.historyList);
        }
        this.recycleList.clear();
        ArrayList<WithdrawListener> arrayList = this.listenerList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WithdrawListener withdrawListener = arrayList.get(i);
            i++;
            withdrawListener.onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
    }

    @Nullable
    public final HistoryData withDraw() {
        if (this.historyList.size() <= 1) {
            return null;
        }
        HistoryData historyData = (HistoryData) AbstractC5805t.m5235o0(this.historyList);
        this.historyList.remove(historyData);
        this.recycleList.add(historyData);
        HistoryData historyData2 = (HistoryData) AbstractC5805t.m5236p0(this.historyList);
        if (historyData2 == null) {
            return null;
        }
        this.graphControl.init(historyData2.getRootGraph().copy());
        this.graphControl.updateBackgroundColor(historyData2.getBackgroundColor());
        this.graphControl.updateBackgroundLineConfig(historyData2.getBackgroundLineConfig());
        this.graphControl.reDrawFixView();
        ArrayList<WithdrawListener> arrayList = this.listenerList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            WithdrawListener withdrawListener = arrayList.get(i);
            i++;
            withdrawListener.onWithdraw(this.historyList.size() > 1, !this.recycleList.isEmpty());
        }
        return historyData2;
    }
}
