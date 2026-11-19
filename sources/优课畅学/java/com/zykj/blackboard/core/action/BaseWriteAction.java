package com.zykj.blackboard.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.zykj.blackboard.core.action.BaseWriteAction;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public abstract class BaseWriteAction extends MoveAction {
    public static final Companion Companion = new Companion(null);
    public static final int INTERVAL_TIME = 5000;
    private IGraph groupGraph;
    private boolean isCreateNewGroup;
    private boolean isForceNeedNewGroup;
    private boolean isSingleHandling;
    private IGraph lastGroupGraph;
    private long lastWriteUpTime;
    private float mFirstX;
    private float mFirstY;
    private final ThreadPoolExecutor service;
    private final List<EzyTouchEvent.TouchEvent> eventList = new ArrayList();
    private Path tempPath = new Path();
    private Paint paint = new Paint();
    private float paintItemLength = 30.0f;
    private float paintSpacing = 15.0f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchUp$1 */
    public static final class C70481 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ EzyTouchEvent.TouchEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70481(EzyTouchEvent.TouchEvent touchEvent) {
            super(0);
            this.$event = touchEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m27405invoke$lambda0(IActionListener actionListener, BaseWriteAction this$0, List list, IGraph groupGraph, String graphId, Graph graph) {
            AbstractC9133u.m16133g(actionListener, "$actionListener");
            AbstractC9133u.m16133g(this$0, "this$0");
            AbstractC9133u.m16133g(list, "$list");
            AbstractC9133u.m16133g(groupGraph, "$groupGraph");
            AbstractC9133u.m16133g(graphId, "$graphId");
            AbstractC9133u.m16133g(graph, "$graph");
            Graph graphWritingGraphEvent = actionListener.writingGraphEvent(this$0.getGraphEnum(), list, GraphUtilsKt.covertEzyPaint(this$0.getPaint(), this$0.getPaintItemLength(), this$0.getPaintSpacing()), groupGraph.getId(), graphId);
            if ((graph instanceof WritingGraph) && (graphWritingGraphEvent instanceof WritingGraph)) {
                WritingGraph writingGraph = (WritingGraph) graph;
                writingGraph.setSourceLoader(actionListener.getSourceLoader());
                WritingGraph writingGraph2 = (WritingGraph) graphWritingGraphEvent;
                writingGraph.setSourceFileName(writingGraph2.getSourceFileName());
                writingGraph.setSourceId(writingGraph2.getSourceId());
            }
            IActionListener listener = this$0.getListener();
            if (listener != null) {
                listener.saveSnapshot();
            }
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27406invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27406invoke() {
            final IActionListener listener;
            BaseWriteAction.this.isSingleHandling = false;
            BaseWriteAction.this.handleTouchUp(this.$event);
            BaseWriteAction.this.lastWriteUpTime = System.currentTimeMillis();
            final IGraph iGraph = BaseWriteAction.this.groupGraph;
            if (iGraph == null || (listener = BaseWriteAction.this.getListener()) == null) {
                return;
            }
            if (BaseWriteAction.this.getEventList().isEmpty()) {
                BaseWriteAction.this.singleTouchCancel(this.$event);
                return;
            }
            final String string = UUID.randomUUID().toString();
            AbstractC9133u.m16132f(string, "randomUUID().toString()");
            final Graph graphBuildSimpleGraph = BaseWriteAction.this.buildSimpleGraph(string);
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(BaseWriteAction.this.getEventList());
            IGraphControl graphControl = BaseWriteAction.this.getGraphControl();
            if (graphControl != null) {
                graphControl.addGraph(iGraph.getId(), graphBuildSimpleGraph);
            }
            ThreadPoolExecutor threadPoolExecutor = BaseWriteAction.this.service;
            final BaseWriteAction baseWriteAction = BaseWriteAction.this;
            threadPoolExecutor.submit(new Runnable() { // from class: com.zykj.blackboard.core.action.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseWriteAction.C70481.m27405invoke$lambda0(listener, baseWriteAction, arrayList, iGraph, string, graphBuildSimpleGraph);
                }
            });
        }
    }

    public BaseWriteAction() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC9133u.m16131e(executorServiceNewCachedThreadPool, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
        this.service = (ThreadPoolExecutor) executorServiceNewCachedThreadPool;
    }

    public abstract Graph buildSimpleGraph(String str);

    public final boolean executorsTaskDone() {
        return this.service.getCompletedTaskCount() == this.service.getTaskCount();
    }

    public final List<EzyTouchEvent.TouchEvent> getEventList() {
        return this.eventList;
    }

    public abstract EzyGraphEnum.GraphEnum getGraphEnum();

    public final float getMFirstX() {
        return this.mFirstX;
    }

    public final float getMFirstY() {
        return this.mFirstY;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final float getPaintItemLength() {
        return this.paintItemLength;
    }

    public final float getPaintSpacing() {
        return this.paintSpacing;
    }

    public final Path getTempPath() {
        return this.tempPath;
    }

    public abstract void handleTouchDown(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void handleTouchMove(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void handleTouchUp(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void initPaint();

    public final boolean isForceNeedNewGroup() {
        return this.isForceNeedNewGroup;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.eventList.clear();
        this.tempPath.reset();
        this.mFirstX = 0.0f;
        this.mFirstY = 0.0f;
    }

    public final void setForceNeedNewGroup(boolean z10) {
        this.isForceNeedNewGroup = z10;
    }

    public final void setMFirstX(float f10) {
        this.mFirstX = f10;
    }

    public final void setMFirstY(float f10) {
        this.mFirstY = f10;
    }

    public final void setPaint(Paint paint) {
        AbstractC9133u.m16133g(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setPaintItemLength(float f10) {
        this.paintItemLength = f10;
    }

    public final void setPaintSpacing(float f10) {
        this.paintSpacing = f10;
    }

    public final void setTempPath(Path path) {
        AbstractC9133u.m16133g(path, "<set-?>");
        this.tempPath = path;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (this.isSingleHandling && this.isCreateNewGroup) {
            IGraph iGraph = this.groupGraph;
            if (iGraph != null) {
                IActionListener listener = getListener();
                if (listener != null) {
                    listener.deleteGraphEvent(AbstractC8809v.m14776s(iGraph), System.currentTimeMillis());
                }
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null) {
                    graphControl.delete(AbstractC8809v.m14776s(iGraph));
                }
            }
            this.groupGraph = this.lastGroupGraph;
        }
        this.isSingleHandling = false;
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.reDrawFixView();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(final EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction.singleTouchDown.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27403invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27403invoke() {
                IGraph iGraphRootGraph;
                List<IGraph> childGraph;
                BaseWriteAction.this.isSingleHandling = true;
                BaseWriteAction.this.initPaint();
                EventBus eventBus = EventBus.INSTANCE;
                eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                BaseWriteAction.this.handleTouchDown(event);
                boolean z10 = BaseWriteAction.this.isForceNeedNewGroup() || System.currentTimeMillis() - BaseWriteAction.this.lastWriteUpTime > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                Log.i("BaseWriteAction", BaseWriteAction.this.hashCode() + "isNeedNewGroup--> " + z10);
                IGraphControl graphControl = BaseWriteAction.this.getGraphControl();
                if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null && (childGraph = iGraphRootGraph.getChildGraph()) != null && !AbstractC8778f0.m14556d0(childGraph, BaseWriteAction.this.groupGraph)) {
                    BaseWriteAction.this.groupGraph = null;
                    z10 = true;
                }
                if (!z10) {
                    BaseWriteAction.this.isCreateNewGroup = false;
                    return;
                }
                BaseWriteAction.this.setForceNeedNewGroup(false);
                BaseWriteAction baseWriteAction = BaseWriteAction.this;
                baseWriteAction.lastGroupGraph = baseWriteAction.groupGraph;
                BaseWriteAction baseWriteAction2 = BaseWriteAction.this;
                IActionListener listener = baseWriteAction2.getListener();
                if (listener != null) {
                    IGraphControl graphControl2 = BaseWriteAction.this.getGraphControl();
                    iGraphRootGraph = graphControl2 != null ? graphControl2.rootGraph() : null;
                    AbstractC9133u.m16130d(iGraphRootGraph);
                    iGraphRootGraph = listener.groupGraphEvent(iGraphRootGraph.getId());
                }
                baseWriteAction2.groupGraph = iGraphRootGraph;
                BaseWriteAction.this.isCreateNewGroup = true;
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(final EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction.singleTouchMove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27404invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27404invoke() {
                BaseWriteAction.this.handleTouchMove(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new C70481(event));
    }
}
