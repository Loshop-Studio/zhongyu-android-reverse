package com.zykj.blackboard.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import android.view.CoroutineLiveDataKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.BaseWriteAction;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.proxy.CustomColorView;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 P2\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\"\u00109\u001a\u00020/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\"\u0010<\u001a\u00020/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u00101\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010G\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u001c\u0010N\u001a\n M*\u0004\u0018\u00010L0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/BaseWriteAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "handleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "handleTouchMove", "handleTouchUp", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "getGraphEnum", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "", "graphId", "Lcom/zykj/blackboard/core/graph/Graph;", "buildSimpleGraph", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "initPaint", "reset", "singleTouchDown", "singleTouchMove", "singleTouchUp", "", "executorsTaskDone", "()Z", "singleTouchCancel", "", "eventList", "Ljava/util/List;", "getEventList", "()Ljava/util/List;", "Landroid/graphics/Path;", "tempPath", "Landroid/graphics/Path;", "getTempPath", "()Landroid/graphics/Path;", "setTempPath", "(Landroid/graphics/Path;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "", "paintItemLength", "F", "getPaintItemLength", "()F", "setPaintItemLength", "(F)V", "paintSpacing", "getPaintSpacing", "setPaintSpacing", "mFirstX", "getMFirstX", "setMFirstX", "mFirstY", "getMFirstY", "setMFirstY", "Lcom/zykj/blackboard/core/graph/IGraph;", "groupGraph", "Lcom/zykj/blackboard/core/graph/IGraph;", "lastGroupGraph", "", "lastWriteUpTime", "J", "isCreateNewGroup", "Z", "isForceNeedNewGroup", "setForceNeedNewGroup", "(Z)V", "isSingleHandling", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_SERVICE, "Ljava/util/concurrent/ExecutorService;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseWriteAction extends MoveAction {
    public static final int INTERVAL_TIME = 5000;

    @Nullable
    private IGraph groupGraph;
    private boolean isCreateNewGroup;
    private boolean isForceNeedNewGroup;
    private boolean isSingleHandling;

    @Nullable
    private IGraph lastGroupGraph;
    private long lastWriteUpTime;
    private float mFirstX;
    private float mFirstY;
    private static final ExecutorService sharedService = Executors.newSingleThreadExecutor();

    @NotNull
    private final List<EzyTouchEvent$TouchEvent> eventList = new ArrayList();

    @NotNull
    private Path tempPath = new Path();

    @NotNull
    private Paint paint = new Paint();
    private float paintItemLength = 30.0f;
    private float paintSpacing = 15.0f;
    private final ExecutorService service = sharedService;

    @Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m5110d2 = {"Ld6/s;", "invoke", "()V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 7, 1})
    /* renamed from: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchUp$1 */
    public static final class C42321 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ EzyTouchEvent$TouchEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42321(EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent) {
            super(0);
            this.$event = ezyTouchEvent$TouchEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m13734invoke$lambda0(IActionListener actionListener, BaseWriteAction this$0, List eventsSnapshot, EzyPaint$Paint ezyPaint, IGraph groupGraph, String graphId, Graph graph) {
            AbstractC5830k.m5330g(actionListener, "$actionListener");
            AbstractC5830k.m5330g(this$0, "this$0");
            AbstractC5830k.m5330g(eventsSnapshot, "$eventsSnapshot");
            AbstractC5830k.m5330g(ezyPaint, "$ezyPaint");
            AbstractC5830k.m5330g(groupGraph, "$groupGraph");
            AbstractC5830k.m5330g(graphId, "$graphId");
            AbstractC5830k.m5330g(graph, "$graph");
            Graph graphWritingGraphEvent = actionListener.writingGraphEvent(this$0.getGraphEnum(), eventsSnapshot, ezyPaint, groupGraph.getId(), graphId);
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

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13735invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13735invoke() {
            final IActionListener listener;
            CustomColorView selectCustomColorView;
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
            AbstractC5830k.m5329f(string, "randomUUID().toString()");
            final Graph graphBuildSimpleGraph = BaseWriteAction.this.buildSimpleGraph(string);
            final List listM5217D0 = AbstractC5805t.m5217D0(BaseWriteAction.this.getEventList());
            final EzyPaint$Paint ezyPaint$PaintCovertEzyPaint = GraphUtilsKt.covertEzyPaint(BaseWriteAction.this.getPaint(), BaseWriteAction.this.getPaintItemLength(), BaseWriteAction.this.getPaintSpacing());
            IGraphControl graphControl = BaseWriteAction.this.getGraphControl();
            if (graphControl != null) {
                graphControl.addGraph(iGraph.getId(), graphBuildSimpleGraph);
            }
            BoardConfig boardConfig = BaseWriteAction.this.getBoardConfig();
            if (boardConfig != null && (selectCustomColorView = boardConfig.getSelectCustomColorView()) != null) {
                selectCustomColorView.onColorUsed(Integer.valueOf(BaseWriteAction.this.getPaint().getColor()));
            }
            ExecutorService executorService = BaseWriteAction.this.service;
            final BaseWriteAction baseWriteAction = BaseWriteAction.this;
            executorService.submit(new Runnable() { // from class: com.zykj.blackboard.core.action.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseWriteAction.C42321.m13734invoke$lambda0(listener, baseWriteAction, listM5217D0, ezyPaint$PaintCovertEzyPaint, iGraph, string, graphBuildSimpleGraph);
                }
            });
        }
    }

    @NotNull
    public abstract Graph buildSimpleGraph(@NotNull String graphId);

    public final boolean executorsTaskDone() {
        ExecutorService executorService = this.service;
        ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor.getCompletedTaskCount() == threadPoolExecutor.getTaskCount();
        }
        AbstractC3387g.f2159c.m2021e();
        AbstractC3387g.m2343f(5, "", "页面BaseWriteAction.kt -> ExecutorCheck没有完成");
        return true;
    }

    @NotNull
    public final List<EzyTouchEvent$TouchEvent> getEventList() {
        return this.eventList;
    }

    @NotNull
    public abstract EzyGraphEnum$GraphEnum getGraphEnum();

    public final float getMFirstX() {
        return this.mFirstX;
    }

    public final float getMFirstY() {
        return this.mFirstY;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    public final float getPaintItemLength() {
        return this.paintItemLength;
    }

    public final float getPaintSpacing() {
        return this.paintSpacing;
    }

    @NotNull
    public final Path getTempPath() {
        return this.tempPath;
    }

    public abstract void handleTouchDown(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void handleTouchMove(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void handleTouchUp(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void initPaint();

    /* renamed from: isForceNeedNewGroup, reason: from getter */
    public final boolean getIsForceNeedNewGroup() {
        return this.isForceNeedNewGroup;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.eventList.clear();
        this.tempPath.reset();
        this.mFirstX = 0.0f;
        this.mFirstY = 0.0f;
    }

    public final void setForceNeedNewGroup(boolean z8) {
        this.isForceNeedNewGroup = z8;
    }

    public final void setMFirstX(float f) {
        this.mFirstX = f;
    }

    public final void setMFirstY(float f) {
        this.mFirstY = f;
    }

    public final void setPaint(@NotNull Paint paint) {
        AbstractC5830k.m5330g(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setPaintItemLength(float f) {
        this.paintItemLength = f;
    }

    public final void setPaintSpacing(float f) {
        this.paintSpacing = f;
    }

    public final void setTempPath(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "<set-?>");
        this.tempPath = path;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (this.isSingleHandling && this.isCreateNewGroup) {
            IGraph iGraph = this.groupGraph;
            if (iGraph != null) {
                IActionListener listener = getListener();
                if (listener != null) {
                    listener.deleteGraphEvent(AbstractC5806u.m5247A(iGraph), System.currentTimeMillis());
                }
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null) {
                    graphControl.delete(AbstractC5806u.m5247A(iGraph));
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
    public void singleTouchDown(@NotNull final EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction.singleTouchDown.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13732invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13732invoke() {
                IGraph rootGraph;
                String id;
                IGraph rootGraph2;
                List<IGraph> childGraph;
                BaseWriteAction.this.isSingleHandling = true;
                BaseWriteAction.this.initPaint();
                EventBus eventBus = EventBus.INSTANCE;
                eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                BaseWriteAction.this.handleTouchDown(event);
                boolean z8 = BaseWriteAction.this.getIsForceNeedNewGroup() || System.currentTimeMillis() - BaseWriteAction.this.lastWriteUpTime > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                Log.i("BaseWriteAction", BaseWriteAction.this.hashCode() + "isNeedNewGroup--> " + z8);
                IGraphControl graphControl = BaseWriteAction.this.getGraphControl();
                if (graphControl != null && (rootGraph2 = graphControl.getRootGraph()) != null && (childGraph = rootGraph2.getChildGraph()) != null && !AbstractC5805t.m5224d0(childGraph, BaseWriteAction.this.groupGraph)) {
                    BaseWriteAction.this.groupGraph = null;
                    z8 = true;
                }
                if (!z8) {
                    BaseWriteAction.this.isCreateNewGroup = false;
                    return;
                }
                BaseWriteAction.this.setForceNeedNewGroup(false);
                BaseWriteAction baseWriteAction = BaseWriteAction.this;
                baseWriteAction.lastGroupGraph = baseWriteAction.groupGraph;
                IGraphControl graphControl2 = BaseWriteAction.this.getGraphControl();
                if (graphControl2 == null || (rootGraph = graphControl2.getRootGraph()) == null || (id = rootGraph.getId()) == null) {
                    return;
                }
                BaseWriteAction baseWriteAction2 = BaseWriteAction.this;
                IActionListener listener = baseWriteAction2.getListener();
                baseWriteAction2.groupGraph = listener != null ? listener.groupGraphEvent(id) : null;
                BaseWriteAction.this.isCreateNewGroup = true;
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull final EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction.singleTouchMove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13733invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13733invoke() {
                BaseWriteAction.this.handleTouchMove(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new C42321(event));
    }
}
