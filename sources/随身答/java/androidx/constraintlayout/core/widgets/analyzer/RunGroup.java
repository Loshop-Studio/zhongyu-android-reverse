package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i9) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i10 = index;
        this.mGroupIndex = i10;
        index = i10 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i9;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i9) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.mWidget.isTerminalWidget[i9]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    ArrayList<WidgetRun> arrayList = ((ChainRun) widgetRun).mWidgets;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        WidgetRun widgetRun4 = arrayList.get(i10);
                        i10++;
                        defineTerminalWidget(widgetRun4, i9);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i9] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i9);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    ArrayList<WidgetRun> arrayList2 = ((ChainRun) widgetRun).mWidgets;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        WidgetRun widgetRun5 = arrayList2.get(i11);
                        i11++;
                        defineTerminalWidget(widgetRun5, i9);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i9] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i9);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j9) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j9;
        }
        int size = dependencyNode.mDependencies.size();
        long jMin = j9;
        for (int i9 = 0; i9 < size; i9++) {
            Dependency dependency = dependencyNode.mDependencies.get(i9);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMin = Math.min(jMin, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j9));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return jMin;
        }
        long wrapDimension = j9 - widgetRun.getWrapDimension();
        return Math.min(Math.min(jMin, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j9) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j9;
        }
        int size = dependencyNode.mDependencies.size();
        long jMax = j9;
        for (int i9 = 0; i9 < size; i9++) {
            Dependency dependency = dependencyNode.mDependencies.get(i9);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    jMax = Math.max(jMax, traverseStart(dependencyNode2, dependencyNode2.mMargin + j9));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return jMax;
        }
        long wrapDimension = j9 + widgetRun.getWrapDimension();
        return Math.max(Math.max(jMax, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i9) {
        long wrapDimension;
        int i10;
        WidgetRun widgetRun = this.mFirstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i9) {
                return 0L;
            }
        } else if (i9 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i9 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).start;
        DependencyNode dependencyNode2 = (i9 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).end;
        boolean zContains = widgetRun.start.mTargets.contains(dependencyNode);
        boolean zContains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension2 = this.mFirstRun.getWrapDimension();
        if (zContains && zContains2) {
            long jTraverseStart = traverseStart(this.mFirstRun.start, 0L);
            long jTraverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j9 = jTraverseStart - wrapDimension2;
            WidgetRun widgetRun2 = this.mFirstRun;
            int i11 = widgetRun2.end.mMargin;
            if (j9 >= (-i11)) {
                j9 += i11;
            }
            int i12 = widgetRun2.start.mMargin;
            long j10 = ((-jTraverseEnd) - wrapDimension2) - i12;
            if (j10 >= i12) {
                j10 -= i12;
            }
            float biasPercent = widgetRun2.mWidget.getBiasPercent(i9);
            float f10 = biasPercent > 0.0f ? (long) ((j10 / biasPercent) + (j9 / (1.0f - biasPercent))) : 0L;
            long j11 = ((long) ((f10 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f10 * (1.0f - biasPercent)) + 0.5f));
            wrapDimension = r12.start.mMargin + j11;
            i10 = this.mFirstRun.end.mMargin;
        } else {
            if (zContains) {
                return Math.max(traverseStart(this.mFirstRun.start, r12.mMargin), this.mFirstRun.start.mMargin + wrapDimension2);
            }
            if (zContains2) {
                return Math.max(-traverseEnd(this.mFirstRun.end, r12.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension2);
            }
            wrapDimension = r12.start.mMargin + this.mFirstRun.getWrapDimension();
            i10 = this.mFirstRun.end.mMargin;
        }
        return wrapDimension - i10;
    }

    public void defineTerminalWidgets(boolean z9, boolean z10) {
        if (z9) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z10) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
