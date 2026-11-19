package com.zykj.blackboard.core.play;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.bean.PlaySpeed;
import com.zykj.blackboard.core.action.ActionManager;
import com.zykj.blackboard.core.action.ITouchAction;
import com.zykj.blackboard.core.action.SeeAction;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.core.edit.BasePageControl;
import com.zykj.blackboard.core.edit.PageControlExtKt;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.CacheSourceLoader;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.blackboard.exception.HighVersionException;
import com.zykj.blackboard.exception.LowVersionException;
import com.zykj.blackboard.listener.PlayStatusListener;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import com.zykj.board.EzyHeader$Header;
import com.zykj.board.EzyHeader$MoveConfig;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyModeEnum$ModeEnum;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001c\u0010\u0012J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\"\u0010-\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\fR\"\u00102\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u00100\"\u0004\b4\u0010\fR\u001a\u00106\u001a\u0002058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020U8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\"\u0010k\u001a\u00020j8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010qR\u001c\u0010t\u001a\n s*\u0004\u0018\u00010r0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006v"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/BasePlayPageControl;", "Lcom/zykj/blackboard/core/play/IPlayPageControl;", "Lcom/zykj/blackboard/core/play/IPlayControl;", "playControl", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "<init>", "(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V", "", "pageName", "Ld6/s;", "loadPath", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "callBack", "show", "(Lr6/a;)V", "hide", "()V", "Lcom/zykj/blackboard/enums/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/blackboard/enums/PlayStatus;", "Lcom/zykj/blackboard/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/blackboard/listener/PlayStatusListener;)V", "removePlayActionListener", "release", "initExecute", "Lcom/zykj/blackboard/bean/MoveActionConfig;", "moveActionConfig", "Lcom/zykj/board/EzyHeader$MoveConfig;", "moveConfig", "copyMoveConfig", "(Lcom/zykj/blackboard/bean/MoveActionConfig;Lcom/zykj/board/EzyHeader$MoveConfig;)V", "", "isPlay", "setSeeActionIsPlay", "(Z)V", "Lcom/zykj/blackboard/core/play/IPlayControl;", "getPlayControl", "()Lcom/zykj/blackboard/core/play/IPlayControl;", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "getRenderLayer", "()Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "mPageDirPath", "Ljava/lang/String;", "getMPageDirPath", "()Ljava/lang/String;", "setMPageDirPath", "mPageDirName", "getMPageDirName", "setMPageDirName", "Lcom/zykj/blackboard/core/loader/CacheSourceLoader;", "cacheSourceLoad", "Lcom/zykj/blackboard/core/loader/CacheSourceLoader;", "getCacheSourceLoad", "()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "Lcom/zykj/blackboard/bean/BoardConfig;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "Lcom/zykj/blackboard/bean/PlaySpeed;", "playSpeed", "Lcom/zykj/blackboard/bean/PlaySpeed;", "getPlaySpeed", "()Lcom/zykj/blackboard/bean/PlaySpeed;", "setPlaySpeed", "(Lcom/zykj/blackboard/bean/PlaySpeed;)V", "Lcom/zykj/blackboard/core/play/CommandThread;", "commandThread", "Lcom/zykj/blackboard/core/play/CommandThread;", "getCommandThread", "()Lcom/zykj/blackboard/core/play/CommandThread;", "Lcom/zykj/blackboard/core/play/AudioCommandThread;", "audioCommandThread", "Lcom/zykj/blackboard/core/play/AudioCommandThread;", "getAudioCommandThread", "()Lcom/zykj/blackboard/core/play/AudioCommandThread;", "Ljava/util/concurrent/ScheduledExecutorService;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "", "totalDuration", "J", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "", "lastBackgroundColor", "I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "lastBackgroundLineConfig", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "Lcom/zykj/blackboard/core/action/ActionManager;", "actionManager", "Lcom/zykj/blackboard/core/action/ActionManager;", "getActionManager", "()Lcom/zykj/blackboard/core/action/ActionManager;", "setActionManager", "(Lcom/zykj/blackboard/core/action/ActionManager;)V", "Lcom/zykj/blackboard/listener/PlayStatusListener;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BasePlayPageControl implements IPlayPageControl {

    @NotNull
    private ActionManager actionManager;

    @NotNull
    private final AudioCommandThread audioCommandThread;

    @NotNull
    private final BoardConfig boardConfig;

    @NotNull
    private final CacheSourceLoader cacheSourceLoad;

    @NotNull
    private final CommandThread commandThread;

    @NotNull
    private ScheduledExecutorService execute;
    private final ExecutorService executor;

    @NotNull
    private final GraphControl graphControl;
    private int lastBackgroundColor;

    @NotNull
    private BackgroundLineConfig lastBackgroundLineConfig;

    @NotNull
    private final PlayStatusListener listener;

    @NotNull
    private String mPageDirName;

    @NotNull
    private String mPageDirPath;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final IPlayControl playControl;

    @NotNull
    private PlaySpeed playSpeed;

    @NotNull
    private final RenderLayer renderLayer;
    private long totalDuration;

    public BasePlayPageControl(@NotNull IPlayControl playControl, @NotNull RenderLayer renderLayer) {
        AbstractC5830k.m5330g(playControl, "playControl");
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.playControl = playControl;
        this.renderLayer = renderLayer;
        this.mPageDirPath = "";
        this.mPageDirName = "";
        CacheSourceLoader cacheSourceLoader = new CacheSourceLoader();
        this.cacheSourceLoad = cacheSourceLoader;
        MatrixAdapter matrixAdapter = new MatrixAdapter();
        this.matrixAdapter = matrixAdapter;
        BoardConfig boardConfig = new BoardConfig(renderLayer.getRenderRect().width(), renderLayer.getRenderRect().height());
        boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_SEE);
        this.boardConfig = boardConfig;
        GraphControl graphControl = new GraphControl(matrixAdapter, renderLayer, boardConfig);
        this.graphControl = graphControl;
        this.playSpeed = new PlaySpeed();
        CommandThread commandThread = new CommandThread();
        this.commandThread = commandThread;
        AudioCommandThread audioCommandThread = new AudioCommandThread();
        this.audioCommandThread = audioCommandThread;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        AbstractC5830k.m5329f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
        this.execute = scheduledExecutorServiceNewScheduledThreadPool;
        this.lastBackgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        this.actionManager = new ActionManager(graphControl, boardConfig, matrixAdapter, cacheSourceLoader, null, null, 48, null);
        commandThread.setPlaySpeed(this.playSpeed);
        audioCommandThread.setPlaySpeed(this.playSpeed);
        this.listener = new PlayStatusListener() { // from class: com.zykj.blackboard.core.play.BasePlayPageControl.1
            @Override // com.zykj.blackboard.listener.PlayStatusListener
            public void onPlayEnd() {
                BasePlayPageControl.this.setSeeActionIsPlay(false);
            }

            @Override // com.zykj.blackboard.listener.PlayStatusListener
            public void onPlayPause() {
                BasePlayPageControl.this.setSeeActionIsPlay(false);
            }

            @Override // com.zykj.blackboard.listener.PlayStatusListener
            public void onPlayResume() {
                BasePlayPageControl.this.setSeeActionIsPlay(true);
            }

            @Override // com.zykj.blackboard.listener.PlayStatusListener
            public void onPlayStart() {
                BasePlayPageControl.this.setSeeActionIsPlay(true);
            }

            @Override // com.zykj.blackboard.listener.PlayStatusListener
            public void onProgress(long progress) {
            }
        };
        this.executor = Executors.newSingleThreadExecutor();
    }

    private final void copyMoveConfig(MoveActionConfig moveActionConfig, EzyHeader$MoveConfig moveConfig) {
        moveActionConfig.setMoveActionEnable(moveConfig.getIsEnable());
        moveActionConfig.setVerticalTranslate(moveConfig.getVerticalTranslate());
        moveActionConfig.setHorizontalTranslate(moveConfig.getHorizontalTranslate());
        moveActionConfig.setScale(moveConfig.getScale());
        moveActionConfig.setRotate(moveConfig.getRotate());
        moveActionConfig.setMaxWidthTimes(moveConfig.getMaxWidthTimes());
        moveActionConfig.setMaxHeightTimes(moveConfig.getMaxHeightTimes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeeActionIsPlay(boolean isPlay) {
        ITouchAction currentAction = this.actionManager.getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).setPlay(isPlay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-4, reason: not valid java name */
    public static final void m13785show$lambda4(BasePlayPageControl this$0, InterfaceC6469a callBack) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callBack, "$callBack");
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " show"));
        GraphUtils graphUtils = GraphUtils.INSTANCE;
        String absolutePath = new File(this$0.mPageDirPath, BasePageControl.SNAPSHOT_FILE_NAME).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "File(mPageDirPath, BaseP…T_FILE_NAME).absolutePath");
        EzyPageSnapshot$PageSnapshot ezyPageSnapshot$PageSnapshotSnapshotGraphToGraph = graphUtils.snapshotGraphToGraph(absolutePath);
        if (ezyPageSnapshot$PageSnapshotSnapshotGraphToGraph != null) {
            MatrixAdapter matrixAdapter = this$0.matrixAdapter;
            EzyMatrix$Matrix cameraMatrix = ezyPageSnapshot$PageSnapshotSnapshotGraphToGraph.getCameraMatrix();
            AbstractC5830k.m5329f(cameraMatrix, "this.cameraMatrix");
            matrixAdapter.setCameraMatrix(MatrixExtKt.toMatrix(cameraMatrix));
            CacheSourceLoader cacheSourceLoader = this$0.cacheSourceLoad;
            EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshot = ezyPageSnapshot$PageSnapshotSnapshotGraphToGraph.getGraphSnapshot();
            AbstractC5830k.m5329f(graphSnapshot, "this.graphSnapshot");
            Graph graphBuildGraph = graphUtils.buildGraph(cacheSourceLoader, graphSnapshot);
            if (graphBuildGraph != null) {
                this$0.graphControl.init(graphBuildGraph);
            }
        }
        this$0.graphControl.updateBackgroundColor(this$0.lastBackgroundColor);
        this$0.graphControl.updateBackgroundLineConfig(this$0.lastBackgroundLineConfig);
        this$0.graphControl.updateBackgroundMatrix();
        this$0.graphControl.reDrawFixView();
        callBack.invoke();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void addPlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.commandThread.getPlayListener().add(listener);
    }

    @NotNull
    public final ActionManager getActionManager() {
        return this.actionManager;
    }

    @NotNull
    public final AudioCommandThread getAudioCommandThread() {
        return this.audioCommandThread;
    }

    @NotNull
    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    @NotNull
    public final CacheSourceLoader getCacheSourceLoad() {
        return this.cacheSourceLoad;
    }

    @NotNull
    public final CommandThread getCommandThread() {
        return this.commandThread;
    }

    @NotNull
    public final GraphControl getGraphControl() {
        return this.graphControl;
    }

    @NotNull
    public final String getMPageDirName() {
        return this.mPageDirName;
    }

    @NotNull
    public final String getMPageDirPath() {
        return this.mPageDirPath;
    }

    @NotNull
    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    @NotNull
    public final IPlayControl getPlayControl() {
        return this.playControl;
    }

    @NotNull
    public final PlaySpeed getPlaySpeed() {
        return this.playSpeed;
    }

    @NotNull
    public final RenderLayer getRenderLayer() {
        return this.renderLayer;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void hide() {
        this.graphControl.release();
    }

    public final void initExecute() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        if (this.execute.isShutdown()) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            AbstractC5830k.m5329f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            Executors.…edThreadPool(2)\n        }");
        } else {
            this.execute.shutdown();
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            AbstractC5830k.m5329f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            execute.sh…edThreadPool(2)\n        }");
        }
        ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
        this.execute = scheduledExecutorService;
        CommandThread commandThread = this.commandThread;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleAtFixedRate(commandThread, 0L, 16L, timeUnit);
        this.execute.scheduleAtFixedRate(this.audioCommandThread, 0L, 16L, timeUnit);
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void loadPath(@NotNull String pageName) throws Exception {
        AbstractC5830k.m5330g(pageName, "pageName");
        String absolutePath = new File(this.playControl.getRootPath(), pageName).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "File(playControl.getRoot…), pageName).absolutePath");
        this.mPageDirPath = absolutePath;
        this.mPageDirName = pageName;
        this.cacheSourceLoad.initPath(absolutePath);
        EzyHeader$Header header = SourceLoad.INSTANCE.getHeader(this.mPageDirPath);
        if (header.getVersion() > 6) {
            throw new HighVersionException("version=" + header.getVersion() + " supportLastVersion=6");
        }
        if (header.getVersion() < 6) {
            throw new LowVersionException("version=" + header.getVersion() + " supportLastVersion=6");
        }
        this.totalDuration = header.getDuration();
        ITouchAction currentAction = this.actionManager.getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).setPlay(this.totalDuration > 0);
        }
        Rect renderRect = this.renderLayer.getRenderRect();
        this.matrixAdapter.setScreenMatrix(PageControlExtKt.getScreenMatrix(header.getWidth(), header.getHeight(), renderRect.width(), renderRect.height(), this.totalDuration > 0, header.getMoveConfig().getMaxWidthTimes(), header.getMoveConfig().getMaxHeightTimes()));
        this.commandThread.setVersion(header.getVersion());
        this.graphControl.setDefaultBackgroundColor(header.getDefaultBackgroundColor());
        this.lastBackgroundColor = header.getLastBackgroundColor();
        GraphControl graphControl = this.graphControl;
        EzyHeader$BackgroundLineConfig defaultBackgroundLineConfig = header.getDefaultBackgroundLineConfig();
        AbstractC5830k.m5329f(defaultBackgroundLineConfig, "header.defaultBackgroundLineConfig");
        graphControl.setDefaultBackgroundLineConfig(ConvertExtKt.toConfig(defaultBackgroundLineConfig));
        EzyHeader$BackgroundLineConfig lastBackgroundLineConfig = header.getLastBackgroundLineConfig();
        AbstractC5830k.m5329f(lastBackgroundLineConfig, "header.lastBackgroundLineConfig");
        this.lastBackgroundLineConfig = ConvertExtKt.toConfig(lastBackgroundLineConfig);
        MoveActionConfig moveActionConfig = this.actionManager.getBoardConfig().getMoveActionConfig();
        EzyHeader$MoveConfig moveConfig = header.getMoveConfig();
        AbstractC5830k.m5329f(moveConfig, "header.moveConfig");
        copyMoveConfig(moveActionConfig, moveConfig);
        this.graphControl.setOldPageRectF(new RectF(0.0f, 0.0f, header.getWidth(), header.getHeight()));
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void release() throws IllegalStateException {
        if (!this.execute.isShutdown()) {
            this.execute.shutdown();
        }
        this.commandThread.shutdown();
        this.audioCommandThread.shutdown();
        this.graphControl.release();
        this.cacheSourceLoad.release();
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public void removePlayActionListener(@NotNull PlayStatusListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.commandThread.getPlayListener().remove(listener);
    }

    public final void setActionManager(@NotNull ActionManager actionManager) {
        AbstractC5830k.m5330g(actionManager, "<set-?>");
        this.actionManager = actionManager;
    }

    public final void setMPageDirName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.mPageDirName = str;
    }

    public final void setMPageDirPath(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.mPageDirPath = str;
    }

    public final void setPlaySpeed(@NotNull PlaySpeed playSpeed) {
        AbstractC5830k.m5330g(playSpeed, "<set-?>");
        this.playSpeed = playSpeed;
    }

    public final void setTotalDuration(long j7) {
        this.totalDuration = j7;
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void show(@NotNull InterfaceC6469a callBack) {
        AbstractC5830k.m5330g(callBack, "callBack");
        this.executor.submit(new RunnableC4335f(1, this, callBack));
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    @NotNull
    public PlayStatus status() {
        return this.commandThread.getStatus();
    }
}
