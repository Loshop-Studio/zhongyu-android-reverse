package com.zykj.blackboard.core.play;

import android.graphics.Rect;
import android.graphics.RectF;
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
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPageSnapshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public abstract class BasePlayPageControl implements IPlayPageControl {
    private ActionManager actionManager;
    private final AudioCommandThread audioCommandThread;
    private final BoardConfig boardConfig;
    private final CacheSourceLoader cacheSourceLoad;
    private final CommandThread commandThread;
    private ScheduledExecutorService execute;
    private final ExecutorService executor;
    private final GraphControl graphControl;
    private int lastBackgroundColor;
    private BackgroundLineConfig lastBackgroundLineConfig;
    private final PlayStatusListener listener;
    private String mPageDirName;
    private String mPageDirPath;
    private final MatrixAdapter matrixAdapter;
    private final IPlayControl playControl;
    private PlaySpeed playSpeed;
    private final RenderLayer renderLayer;
    private long totalDuration;

    public BasePlayPageControl(IPlayControl playControl, RenderLayer renderLayer) {
        AbstractC9133u.m16133g(playControl, "playControl");
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.playControl = playControl;
        this.renderLayer = renderLayer;
        this.mPageDirPath = "";
        this.mPageDirName = "";
        CacheSourceLoader cacheSourceLoader = new CacheSourceLoader();
        this.cacheSourceLoad = cacheSourceLoader;
        MatrixAdapter matrixAdapter = new MatrixAdapter();
        this.matrixAdapter = matrixAdapter;
        BoardConfig boardConfig = new BoardConfig(renderLayer.getRenderRect().width(), renderLayer.getRenderRect().height());
        boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_SEE);
        this.boardConfig = boardConfig;
        GraphControl graphControl = new GraphControl(matrixAdapter, renderLayer, boardConfig);
        this.graphControl = graphControl;
        this.playSpeed = new PlaySpeed();
        CommandThread commandThread = new CommandThread();
        this.commandThread = commandThread;
        AudioCommandThread audioCommandThread = new AudioCommandThread();
        this.audioCommandThread = audioCommandThread;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        AbstractC9133u.m16132f(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(1)");
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
            public void onProgress(long j10) {
            }
        };
        this.executor = Executors.newSingleThreadExecutor();
    }

    private final void copyMoveConfig(MoveActionConfig moveActionConfig, EzyHeader.MoveConfig moveConfig) {
        moveActionConfig.setMoveActionEnable(moveConfig.m8179l());
        moveActionConfig.setVerticalTranslate(moveConfig.m8184q());
        moveActionConfig.setHorizontalTranslate(moveConfig.m8178k());
        moveActionConfig.setScale(moveConfig.m8183p());
        moveActionConfig.setRotate(moveConfig.m8182o());
        moveActionConfig.setMaxWidthTimes(moveConfig.m8181n());
        moveActionConfig.setMaxHeightTimes(moveConfig.m8180m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeeActionIsPlay(boolean z10) {
        ITouchAction currentAction = this.actionManager.getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).setPlay(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show$lambda-4, reason: not valid java name */
    public static final void m27449show$lambda4(BasePlayPageControl this$0, InterfaceC10559a callBack) throws IOException {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callBack, "$callBack");
        System.out.println((Object) ("playThread = " + Thread.currentThread().getName() + " show"));
        GraphUtils graphUtils = GraphUtils.INSTANCE;
        String absolutePath = new File(this$0.mPageDirPath, BasePageControl.SNAPSHOT_FILE_NAME).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "File(mPageDirPath, BaseP…T_FILE_NAME).absolutePath");
        EzyPageSnapshot.PageSnapshot pageSnapshotSnapshotGraphToGraph = graphUtils.snapshotGraphToGraph(absolutePath);
        if (pageSnapshotSnapshotGraphToGraph != null) {
            MatrixAdapter matrixAdapter = this$0.matrixAdapter;
            EzyMatrix.Matrix matrixM8347e = pageSnapshotSnapshotGraphToGraph.m8347e();
            AbstractC9133u.m16132f(matrixM8347e, "this.cameraMatrix");
            matrixAdapter.setCameraMatrix(MatrixExtKt.toMatrix(matrixM8347e));
            CacheSourceLoader cacheSourceLoader = this$0.cacheSourceLoad;
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM8349i = pageSnapshotSnapshotGraphToGraph.m8349i();
            AbstractC9133u.m16132f(graphSnapshotM8349i, "this.graphSnapshot");
            Graph graphBuildGraph = graphUtils.buildGraph(cacheSourceLoader, graphSnapshotM8349i);
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
    public void addPlayActionListener(PlayStatusListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.commandThread.getPlayListener().add(listener);
    }

    public final ActionManager getActionManager() {
        return this.actionManager;
    }

    public final AudioCommandThread getAudioCommandThread() {
        return this.audioCommandThread;
    }

    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    public final CacheSourceLoader getCacheSourceLoad() {
        return this.cacheSourceLoad;
    }

    public final CommandThread getCommandThread() {
        return this.commandThread;
    }

    public final GraphControl getGraphControl() {
        return this.graphControl;
    }

    public final String getMPageDirName() {
        return this.mPageDirName;
    }

    public final String getMPageDirPath() {
        return this.mPageDirPath;
    }

    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final IPlayControl getPlayControl() {
        return this.playControl;
    }

    public final PlaySpeed getPlaySpeed() {
        return this.playSpeed;
    }

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
            AbstractC9133u.m16132f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            Executors.…edThreadPool(2)\n        }");
        } else {
            this.execute.shutdown();
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
            AbstractC9133u.m16132f(scheduledExecutorServiceNewScheduledThreadPool, "{\n            execute.sh…edThreadPool(2)\n        }");
        }
        ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
        this.execute = scheduledExecutorService;
        CommandThread commandThread = this.commandThread;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        scheduledExecutorService.scheduleAtFixedRate(commandThread, 0L, 16L, timeUnit);
        this.execute.scheduleAtFixedRate(this.audioCommandThread, 0L, 16L, timeUnit);
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void loadPath(String pageName) throws HighVersionException, IOException, LowVersionException {
        AbstractC9133u.m16133g(pageName, "pageName");
        String absolutePath = new File(this.playControl.getRootPath(), pageName).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "File(playControl.getRoot…), pageName).absolutePath");
        this.mPageDirPath = absolutePath;
        this.mPageDirName = pageName;
        this.cacheSourceLoad.initPath(absolutePath);
        EzyHeader.Header header = SourceLoad.INSTANCE.getHeader(this.mPageDirPath);
        if (header.getVersion() > 6) {
            throw new HighVersionException("version=" + header.getVersion() + " supportLastVersion=6");
        }
        if (header.getVersion() < 6) {
            throw new LowVersionException("version=" + header.getVersion() + " supportLastVersion=6");
        }
        this.totalDuration = header.m8117z();
        ITouchAction currentAction = this.actionManager.getCurrentAction();
        if (currentAction instanceof SeeAction) {
            ((SeeAction) currentAction).setPlay(this.totalDuration > 0);
        }
        Rect renderRect = this.renderLayer.getRenderRect();
        this.matrixAdapter.setScreenMatrix(PageControlExtKt.getScreenMatrix(header.getWidth(), header.getHeight(), renderRect.width(), renderRect.height(), this.totalDuration > 0, header.m8102C().m8181n(), header.m8102C().m8180m()));
        this.commandThread.setVersion(header.getVersion());
        this.graphControl.setDefaultBackgroundColor(header.m8114v());
        this.lastBackgroundColor = header.m8100A();
        GraphControl graphControl = this.graphControl;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM8115w = header.m8115w();
        AbstractC9133u.m16132f(backgroundLineConfigM8115w, "header.defaultBackgroundLineConfig");
        graphControl.setDefaultBackgroundLineConfig(ConvertExtKt.toConfig(backgroundLineConfigM8115w));
        EzyHeader.BackgroundLineConfig backgroundLineConfigM8101B = header.m8101B();
        AbstractC9133u.m16132f(backgroundLineConfigM8101B, "header.lastBackgroundLineConfig");
        this.lastBackgroundLineConfig = ConvertExtKt.toConfig(backgroundLineConfigM8101B);
        MoveActionConfig moveActionConfig = this.actionManager.getBoardConfig().getMoveActionConfig();
        EzyHeader.MoveConfig moveConfigM8102C = header.m8102C();
        AbstractC9133u.m16132f(moveConfigM8102C, "header.moveConfig");
        copyMoveConfig(moveActionConfig, moveConfigM8102C);
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
    public void removePlayActionListener(PlayStatusListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.commandThread.getPlayListener().remove(listener);
    }

    public final void setActionManager(ActionManager actionManager) {
        AbstractC9133u.m16133g(actionManager, "<set-?>");
        this.actionManager = actionManager;
    }

    public final void setMPageDirName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.mPageDirName = str;
    }

    public final void setMPageDirPath(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.mPageDirPath = str;
    }

    public final void setPlaySpeed(PlaySpeed playSpeed) {
        AbstractC9133u.m16133g(playSpeed, "<set-?>");
        this.playSpeed = playSpeed;
    }

    public final void setTotalDuration(long j10) {
        this.totalDuration = j10;
    }

    @Override // com.zykj.blackboard.core.play.IEditPlayPageControl
    public void show(final InterfaceC10559a callBack) {
        AbstractC9133u.m16133g(callBack, "callBack");
        this.executor.submit(new Runnable() { // from class: com.zykj.blackboard.core.play.e
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BasePlayPageControl.m27449show$lambda4(this.f8785a, callBack);
            }
        });
    }

    @Override // com.zykj.blackboard.core.play.IPlayPageControl
    public PlayStatus status() {
        return this.commandThread.getStatus();
    }
}
