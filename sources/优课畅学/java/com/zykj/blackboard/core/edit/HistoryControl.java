package com.zykj.blackboard.core.edit;

import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.listener.WithdrawListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class HistoryControl {
    public static final Companion Companion = new Companion(null);
    public static final int LIST_SIZE = 10;
    private final GraphControl graphControl;
    private final ArrayList<HistoryData> historyList;
    private final ArrayList<WithdrawListener> listenerList;
    private final ArrayList<HistoryData> recycleList;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public HistoryControl(GraphControl graphControl) {
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.graphControl = graphControl;
        this.historyList = new ArrayList<>();
        this.recycleList = new ArrayList<>();
        this.listenerList = new ArrayList<>();
    }

    public final void addWithdrawListener(WithdrawListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listenerList.add(listener);
    }

    public final void clearHistoryList() {
        this.historyList.clear();
        this.recycleList.clear();
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((WithdrawListener) it.next()).onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
    }

    public final void clearHistoryListWithoutCurrent() {
        while (this.historyList.size() != 1) {
            AbstractC8768a0.m14492N(this.historyList);
        }
        this.recycleList.clear();
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((WithdrawListener) it.next()).onWithdraw(this.historyList.size() > 1, !this.recycleList.isEmpty());
        }
    }

    public final HistoryData recover() {
        if (this.recycleList.isEmpty()) {
            return null;
        }
        HistoryData historyData = (HistoryData) AbstractC8778f0.m14578x0(this.recycleList);
        this.graphControl.init(historyData.getRootGraph().copy());
        this.graphControl.updateBackgroundColor(historyData.getBackgroundColor());
        this.graphControl.updateBackgroundLineConfig(historyData.getBackgroundLineConfig());
        this.graphControl.reDrawFixView();
        this.recycleList.remove(historyData);
        this.historyList.add(historyData);
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((WithdrawListener) it.next()).onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
        return historyData;
    }

    public final void removeWithdrawListener(WithdrawListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listenerList.remove(listener);
    }

    public final void saveSnapshot(Graph rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        this.historyList.add(new HistoryData(rootGraph.copy(), i10, backgroundLineConfig));
        while (this.historyList.size() > 11) {
            AbstractC8768a0.m14491M(this.historyList);
        }
        this.recycleList.clear();
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((WithdrawListener) it.next()).onWithdraw(this.historyList.size() > 1, true ^ this.recycleList.isEmpty());
        }
    }

    public final HistoryData withDraw() {
        if (this.historyList.size() <= 1) {
            return null;
        }
        HistoryData historyData = (HistoryData) AbstractC8778f0.m14578x0(this.historyList);
        this.historyList.remove(historyData);
        this.recycleList.add(historyData);
        HistoryData historyData2 = (HistoryData) AbstractC8778f0.m14579y0(this.historyList);
        if (historyData2 == null) {
            return null;
        }
        this.graphControl.init(historyData2.getRootGraph().copy());
        this.graphControl.updateBackgroundColor(historyData2.getBackgroundColor());
        this.graphControl.updateBackgroundLineConfig(historyData2.getBackgroundLineConfig());
        this.graphControl.reDrawFixView();
        Iterator<T> it = this.listenerList.iterator();
        while (it.hasNext()) {
            ((WithdrawListener) it.next()).onWithdraw(this.historyList.size() > 1, !this.recycleList.isEmpty());
        }
        return historyData2;
    }
}
