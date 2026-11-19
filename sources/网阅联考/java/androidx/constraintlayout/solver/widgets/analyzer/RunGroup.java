package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int direction;
    WidgetRun firstRun;
    int groupIndex;
    WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i4) {
        this.firstRun = null;
        this.lastRun = null;
        int i5 = index;
        this.groupIndex = i5;
        index = i5 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i4;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i4) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.widget.isTerminalWidget[i4]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.dependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).run) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).widgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i4);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i4] = false;
                }
                defineTerminalWidget(dependencyNode2.run, i4);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).run) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).widgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i4);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i4] = false;
                }
                defineTerminalWidget(dependencyNode.run, i4);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j4) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j4;
        }
        int size = dependencyNode.dependencies.size();
        long jMin = j4;
        for (int i4 = 0; i4 < size; i4++) {
            Dependency dependency = dependencyNode.dependencies.get(i4);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    jMin = Math.min(jMin, traverseEnd(dependencyNode2, dependencyNode2.margin + j4));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j4 - widgetRun.getWrapDimension();
        return Math.min(Math.min(jMin, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j4) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j4;
        }
        int size = dependencyNode.dependencies.size();
        long jMax = j4;
        for (int i4 = 0; i4 < size; i4++) {
            Dependency dependency = dependencyNode.dependencies.get(i4);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    jMax = Math.max(jMax, traverseStart(dependencyNode2, dependencyNode2.margin + j4));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j4 + widgetRun.getWrapDimension();
        return Math.max(Math.max(jMax, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i4) {
        long wrapDimension;
        int i5;
        WidgetRun widgetRun = this.firstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i4 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).start;
        DependencyNode dependencyNode2 = (i4 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).end;
        boolean zContains = widgetRun.start.targets.contains(dependencyNode);
        boolean zContains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension2 = this.firstRun.getWrapDimension();
        if (zContains && zContains2) {
            long jTraverseStart = traverseStart(this.firstRun.start, 0L);
            long jTraverseEnd = traverseEnd(this.firstRun.end, 0L);
            long j4 = jTraverseStart - wrapDimension2;
            WidgetRun widgetRun2 = this.firstRun;
            int i6 = widgetRun2.end.margin;
            if (j4 >= (-i6)) {
                j4 += i6;
            }
            int i7 = widgetRun2.start.margin;
            long j5 = ((-jTraverseEnd) - wrapDimension2) - i7;
            if (j5 >= i7) {
                j5 -= i7;
            }
            float biasPercent = widgetRun2.widget.getBiasPercent(i4);
            float f4 = biasPercent > 0.0f ? (long) ((j5 / biasPercent) + (j4 / (1.0f - biasPercent))) : 0L;
            long j6 = ((long) ((f4 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f4 * (1.0f - biasPercent)) + 0.5f));
            wrapDimension = r12.start.margin + j6;
            i5 = this.firstRun.end.margin;
        } else {
            if (zContains) {
                return Math.max(traverseStart(this.firstRun.start, r12.margin), this.firstRun.start.margin + wrapDimension2);
            }
            if (zContains2) {
                return Math.max(-traverseEnd(this.firstRun.end, r12.margin), (-this.firstRun.end.margin) + wrapDimension2);
            }
            wrapDimension = r12.start.margin + this.firstRun.getWrapDimension();
            i5 = this.firstRun.end.margin;
        }
        return wrapDimension - i5;
    }

    public void defineTerminalWidgets(boolean z3, boolean z4) {
        if (z3) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z4) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
