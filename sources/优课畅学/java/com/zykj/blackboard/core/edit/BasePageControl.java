package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import android.media.MediaPlayer;
import com.blankj.utilcode.util.AbstractC5380q;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.bean.Author;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.ActionManager;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.loader.LocalSourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.ProtoFileUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRectF;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public abstract class BasePageControl implements IEditPageControl {
    public static final Companion Companion = new Companion(null);
    public static final String SCREENSHOT_FILE_NAME = "screenshot.png";
    public static final String SNAPSHOT_FILE_NAME = "snapshot.bin";
    private ActionManager actionManager;
    private final AudioControl audioControl;
    private final BoardControl boardControl;
    private final GraphControl graphControl;
    private final HistoryControl historyControl;
    private final MatrixAdapter matrixAdapter;
    private final ArrayList<String> noRecordingImageList;
    public PageEntity pageEntity;
    private final ArrayList<String> recordingImageList;
    private final SourceRouterRecord routerRecord;
    private final LocalSourceLoader sourceLoad;
    private final TimeRecord timeRecord;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public BasePageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(boardControl, "boardControl");
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        this.boardControl = boardControl;
        TimeRecord timeRecord = new TimeRecord();
        this.timeRecord = timeRecord;
        SourceRouterRecord sourceRouterRecord = new SourceRouterRecord(timeRecord);
        this.routerRecord = sourceRouterRecord;
        LocalSourceLoader localSourceLoader = new LocalSourceLoader();
        this.sourceLoad = localSourceLoader;
        MatrixAdapter matrixAdapter = new MatrixAdapter();
        this.matrixAdapter = matrixAdapter;
        GraphControl graphControl = new GraphControl(matrixAdapter, renderLayer, boardControl.getConfig());
        graphControl.setDeleteCallback(new InterfaceC10570l() { // from class: com.zykj.blackboard.core.edit.BasePageControl$graphControl$1$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IGraph) obj);
                return C8736p.f16368a;
            }

            public final void invoke(IGraph deleteGraph) {
                AbstractC9133u.m16133g(deleteGraph, "deleteGraph");
                if (!(deleteGraph instanceof ImageGraph) || this.this$0.isRecording()) {
                    return;
                }
                ImageGraph imageGraph = (ImageGraph) deleteGraph;
                if (imageGraph.getFilePath() == null) {
                    imageGraph.initPath();
                }
                String filePath = imageGraph.getFilePath();
                if (filePath != null) {
                    this.this$0.getNoRecordingImageList().remove(filePath);
                }
            }
        });
        this.graphControl = graphControl;
        HistoryControl historyControl = new HistoryControl(graphControl);
        this.historyControl = historyControl;
        this.audioControl = new AudioControl();
        this.actionManager = new ActionManager(graphControl, boardControl.getConfig(), matrixAdapter, localSourceLoader, sourceRouterRecord, historyControl);
        this.recordingImageList = new ArrayList<>();
        this.noRecordingImageList = new ArrayList<>();
        if (pageEntity == null) {
            init(initPageEntity());
            addRootGraph();
        } else {
            setPageEntity(pageEntity);
            init(pageEntity);
        }
    }

    private final void addRootGraph() {
        CommandRecord commandRecord = this.routerRecord.getCommandRecord();
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m8548h().m8569s(-3.4028235E38f).m8572v(-3.4028235E38f).m8571u(Float.MAX_VALUE).m8567q(Float.MAX_VALUE).build();
        AbstractC9133u.m16132f(rectFBuild, "newBuilder().setLeft(-Fl…(Float.MAX_VALUE).build()");
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandRecord.addCommand("", graphEnum, rectFBuild, System.currentTimeMillis()).getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoad);
        if (graph != null) {
            this.graphControl.addGraph(graphData.m7764w(), graph);
        }
    }

    private final long calculateAudioCommandTime(PageEntity pageEntity) {
        Iterator<AudioRecordEntity> it = ((RecordEntity) pageEntity.getRecordEntity().m15511c()).getAudioList().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (AudioInfoEntity audioInfoEntity : it.next().getAudioInfoEntity()) {
                if (audioInfoEntity.isPlay()) {
                    delayTime += audioInfoEntity.getDelayTime() + audioInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    private final long calculateCommandTime(PageEntity pageEntity) {
        Iterator<CommandRecordEntity> it = ((RecordEntity) pageEntity.getRecordEntity().m15511c()).getCommandList().iterator();
        long delayTime = 0;
        while (it.hasNext()) {
            for (CommandInfoEntity commandInfoEntity : it.next().getCommandInfoEntity()) {
                if (commandInfoEntity.isPlay()) {
                    delayTime += commandInfoEntity.getDelayTime() + commandInfoEntity.getDuration();
                }
            }
        }
        return delayTime;
    }

    private final PageEntity createPageEntity(BlackBoardEntity blackBoardEntity) throws IllegalAccessException, IllegalArgumentException {
        AuthorEntity entity;
        String string = UUID.randomUUID().toString();
        AbstractC9133u.m16132f(string, "randomUUID().toString()");
        AbstractC5380q.m2623s("BasePageControl:createPageEntity [" + string + "]:创建新Entity");
        setPageEntity(new PageEntity(0L, string, false, null, 0, 28, null));
        ToOne<HeaderEntity> headerEntity = getPageEntity().getHeaderEntity();
        HeaderEntity headerEntity2 = new HeaderEntity(0L, 6, 0, 0, 0L, 0L, 0L, null, 0, 0, 1020, null);
        headerEntity2.setCreateDate(System.currentTimeMillis());
        headerEntity2.setDuration(0L);
        BoardConfig config = this.boardControl.getConfig();
        headerEntity2.setWidth(config.getWidth());
        headerEntity2.setHeight(config.getHeight());
        headerEntity2.setDefaultBackgroundColor(config.getBackgroundColor());
        headerEntity2.setLastBackgroundColor(config.getBackgroundColor());
        ToOne<MoveConfigEntity> moveConfig = headerEntity2.getMoveConfig();
        MoveConfigEntity entity2 = ConvertExtKt.toEntity(config.getMoveActionConfig());
        entity2.put();
        moveConfig.m15518k(entity2);
        ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig = headerEntity2.getDefaultBackgroundLineConfig();
        BackgroundLineConfigEntity entity3 = ConvertExtKt.toEntity(config.getBackgroundLineConfig());
        entity3.put();
        defaultBackgroundLineConfig.m15518k(entity3);
        ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = headerEntity2.getLastBackgroundLineConfig();
        BackgroundLineConfigEntity entity4 = ConvertExtKt.toEntity(config.getBackgroundLineConfig());
        entity4.put();
        lastBackgroundLineConfig.m15518k(entity4);
        ToOne<AuthorEntity> author = headerEntity2.getAuthor();
        Author author2 = config.getAuthor();
        if (author2 == null || (entity = ConvertExtKt.toEntity(author2)) == null) {
            entity = null;
        } else {
            entity.put();
        }
        author.m15518k(entity);
        headerEntity2.getPage().m15518k(getPageEntity());
        headerEntity2.put();
        headerEntity.m15518k(headerEntity2);
        ToOne<RecordEntity> recordEntity = getPageEntity().getRecordEntity();
        RecordEntity recordEntity2 = new RecordEntity(0L, 1, null);
        recordEntity2.getPage().m15518k(getPageEntity());
        recordEntity2.put();
        recordEntity.m15518k(recordEntity2);
        getPageEntity().getBlackBoardEntity().m15518k(blackBoardEntity);
        getPageEntity().put();
        AbstractC5380q.m2623s("BasePageControl:createPageEntity [" + string + "]:创建完成,id:" + getPageEntity().getId());
        return getPageEntity();
    }

    private final void initCommonSetting(PageEntity pageEntity) {
        BackgroundLineConfig config;
        BackgroundLineConfig config2;
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.getHeaderEntity().m15511c();
        if (headerEntity == null) {
            return;
        }
        this.graphControl.setDefaultBackgroundColor(headerEntity.getDefaultBackgroundColor());
        this.graphControl.updateBackgroundColor(headerEntity.getLastBackgroundColor());
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.getDefaultBackgroundLineConfig().m15511c();
        if (backgroundLineConfigEntity != null && (config2 = ConvertExtKt.toConfig(backgroundLineConfigEntity)) != null) {
            this.graphControl.setDefaultBackgroundLineConfig(config2);
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.getLastBackgroundLineConfig().m15511c();
        if (backgroundLineConfigEntity2 != null && (config = ConvertExtKt.toConfig(backgroundLineConfigEntity2)) != null) {
            this.graphControl.updateBackgroundLineConfig(config);
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.getMoveConfig().m15511c();
        if (moveConfigEntity != null) {
            this.boardControl.getConfig().getMoveActionConfig().set(moveConfigEntity);
        }
        this.matrixAdapter.setScreenMatrix(PageControlExtKt.getScreenMatrix$default(headerEntity.getWidth(), headerEntity.getHeight(), this.boardControl.getConfig().getWidth(), this.boardControl.getConfig().getHeight(), false, 0, 0, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, null));
    }

    private final PageEntity initPageEntity() {
        C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(BlackBoardEntity.class);
        AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c8957aM15370d.m15416n();
        AbstractC9133u.m16132f(builder, "builder");
        builder.m15488c(BlackBoardEntity_.dir, this.boardControl.getBoardDirPath());
        Query queryM15486a = builder.m15486a();
        AbstractC9133u.m16132f(queryM15486a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM15486a.m15480l();
        if (blackBoardEntity != null) {
            return createPageEntity(blackBoardEntity);
        }
        AbstractC5380q.m2623s("BasePageControl:initPageEntity [" + getFileName() + "] 没找到boardEntity:" + this.boardControl.getBoardDirPath());
        throw new NullPointerException("empty boardEntity: " + this.boardControl.getBoardDirPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: release$lambda-23, reason: not valid java name */
    public static final void m27432release$lambda23(BasePageControl this$0) throws IllegalAccessException, IllegalArgumentException {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (this$0.isRecording()) {
            this$0.stopRecord();
        }
        HeaderEntity headerEntity = (HeaderEntity) this$0.getPageEntity().getHeaderEntity().m15511c();
        if (headerEntity == null) {
            return;
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.getMoveConfig().m15511c();
        if (moveConfigEntity != null) {
            moveConfigEntity.set(this$0.boardControl.getConfig().getMoveActionConfig());
            moveConfigEntity.put();
        } else {
            MoveConfigEntity entity = ConvertExtKt.toEntity(this$0.boardControl.getConfig().getMoveActionConfig());
            entity.put();
            headerEntity.getMoveConfig().m15518k(entity);
            headerEntity.put();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /* renamed from: show$lambda-34, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27433show$lambda34(com.zykj.blackboard.core.edit.BasePageControl r12, p300x7.InterfaceC10559a r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BasePageControl.m27433show$lambda34(com.zykj.blackboard.core.edit.BasePageControl, x7.a):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/edit/BasePageControl.smali:2099
    }

    private final void updateAudioRecord(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ToMany<AudioInfoEntity> audioInfoEntity;
        AudioInfoEntity audioInfoEntity2;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) AbstractC8778f0.m14579y0(((RecordEntity) pageEntity.getRecordEntity().m15511c()).getAudioList());
        if (audioRecordEntity == null || (audioInfoEntity = audioRecordEntity.getAudioInfoEntity()) == null || (audioInfoEntity2 = (AudioInfoEntity) AbstractC8778f0.m14579y0(audioInfoEntity)) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.AudioStart audioStartM7464o = EzyCommand.CommandSource.CommandInfo.AudioStart.m7464o(audioInfoEntity2.getData());
        File file = new File(SourceRouterRecord.Companion.getResPath(getPagePath(), DocumentType.AUDIO), audioStartM7464o.getFileName());
        if (file.exists()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            long duration = mediaPlayer.getDuration();
            if (audioStartM7464o.m7466i() != duration) {
                EzyCommand.CommandSource.CommandInfo.AudioStart.C7182b c7182bM7462k = EzyCommand.CommandSource.CommandInfo.AudioStart.m7462k();
                c7182bM7462k.m7487s(audioStartM7464o.getFileName());
                c7182bM7462k.m7485q(duration);
                byte[] byteArray = c7182bM7462k.build().toByteArray();
                AbstractC9133u.m16132f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity2.setData(byteArray);
                audioInfoEntity2.setDuration(duration);
                audioInfoEntity2.put();
            }
        }
    }

    private final void updateTimeRecord(PageEntity pageEntity) {
        long duration = ((HeaderEntity) pageEntity.getHeaderEntity().m15511c()).getDuration();
        long jCalculateCommandTime = calculateCommandTime(pageEntity);
        long jCalculateAudioCommandTime = calculateAudioCommandTime(pageEntity);
        if (duration >= jCalculateCommandTime && duration >= jCalculateAudioCommandTime) {
            this.timeRecord.init(duration);
            this.timeRecord.setOffsetForAudio(duration - jCalculateAudioCommandTime);
            this.timeRecord.setOffsetForCommand(duration - jCalculateCommandTime);
        } else if (jCalculateCommandTime > jCalculateAudioCommandTime) {
            this.timeRecord.init(jCalculateCommandTime);
            this.timeRecord.setOffsetForAudio(jCalculateCommandTime - jCalculateAudioCommandTime);
        } else if (jCalculateAudioCommandTime > jCalculateCommandTime) {
            this.timeRecord.init(jCalculateAudioCommandTime);
            this.routerRecord.getCommandRecord().stopRecord(jCalculateAudioCommandTime - jCalculateCommandTime);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public long duration() {
        return this.timeRecord.getTime(System.currentTimeMillis());
    }

    public final ActionManager getActionManager() {
        return this.actionManager;
    }

    public final AudioControl getAudioControl() {
        return this.audioControl;
    }

    public final BoardControl getBoardControl() {
        return this.boardControl;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public String getFileName() {
        return getPageEntity().getDirName();
    }

    public final GraphControl getGraphControl() {
        return this.graphControl;
    }

    public final HistoryControl getHistoryControl() {
        return this.historyControl;
    }

    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final ArrayList<String> getNoRecordingImageList() {
        return this.noRecordingImageList;
    }

    public final PageEntity getPageEntity() {
        PageEntity pageEntity = this.pageEntity;
        if (pageEntity != null) {
            return pageEntity;
        }
        AbstractC9133u.m16151y("pageEntity");
        return null;
    }

    public final String getPagePath() {
        String absolutePath = new File(this.boardControl.getBoardDirPath(), getPageEntity().getDirName()).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "File(boardControl.getBoa…ity.dirName).absolutePath");
        return absolutePath;
    }

    public final ArrayList<String> getRecordingImageList() {
        return this.recordingImageList;
    }

    public final SourceRouterRecord getRouterRecord() {
        return this.routerRecord;
    }

    public final LocalSourceLoader getSourceLoad() {
        return this.sourceLoad;
    }

    public final TimeRecord getTimeRecord() {
        return this.timeRecord;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void hide() throws Throwable {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotSnapshot = this.graphControl.snapshot();
        if (graphSnapshotSnapshot != null) {
            EzyPageSnapshot.PageSnapshot.C7230b c7230bM8345k = EzyPageSnapshot.PageSnapshot.m8345k();
            c7230bM8345k.m8463z(graphSnapshotSnapshot);
            c7230bM8345k.m8461x(MatrixExtKt.toEzyMatrix(this.matrixAdapter.getCameraMatrix(), 0L));
            ProtoFileUtils.Companion companion = ProtoFileUtils.Companion;
            String pagePath = getPagePath();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7230bM8345k.build();
            AbstractC9133u.m16132f(pageSnapshotBuild, "builder.build()");
            companion.createPageSnapshotFile(pagePath, SNAPSHOT_FILE_NAME, pageSnapshotBuild);
            if (getPageEntity().isChange()) {
                getPageEntity().setChange(false);
                getPageEntity().setCommandFileName("");
                getPageEntity().setCommandIndex(-1);
                getPageEntity().put();
            }
        }
        this.graphControl.release();
    }

    public final void init(final PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9133u.m16133g(pageEntity, "pageEntity");
        initCommonSetting(pageEntity);
        addEventListener(this.actionManager.getModeFactory());
        addEventListener(new EventListener() { // from class: com.zykj.blackboard.core.edit.BasePageControl.init.1
            @Override // com.zykj.blackboard.listener.EventListener
            public void onEvent(CommandInfoEntity entity) {
                AbstractC9133u.m16133g(entity, "entity");
                if (pageEntity.isChange()) {
                    return;
                }
                pageEntity.setCommandFileName(((CommandRecordEntity) entity.getRecord().m15511c()).getFileName());
                pageEntity.setChange(true);
                pageEntity.setCommandIndex(((CommandRecordEntity) entity.getRecord().m15511c()).getCommandInfoEntity().m15499i(entity.getId()));
                pageEntity.put();
            }
        });
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        Object objM15511c = pageEntity.getRecordEntity().m15511c();
        AbstractC9133u.m16132f(objM15511c, "pageEntity.recordEntity.target");
        sourceRouterRecord.initRecord((RecordEntity) objM15511c);
        this.sourceLoad.initPath(getPagePath());
        this.audioControl.initDirPath(SourceRouterRecord.Companion.getResPath(getPagePath(), DocumentType.AUDIO));
        updateAudioRecord(pageEntity);
        updateTimeRecord(pageEntity);
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void onDelete() {
        BoardBox.INSTANCE.clearPageData(getPageEntity());
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void refresh() {
        this.graphControl.reDrawFixView();
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void release() {
        new Thread(new Runnable() { // from class: com.zykj.blackboard.core.edit.b
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException {
                BasePageControl.m27432release$lambda23(this.f8766a);
            }
        }).start();
        removeEventListener(this.actionManager.getModeFactory());
        this.graphControl.release();
    }

    public final void saveSnapshot() {
        IGraph iGraphRootGraph = this.graphControl.rootGraph();
        if (iGraphRootGraph != null) {
            this.historyControl.saveSnapshot((Graph) iGraphRootGraph, this.graphControl.getBackgroundColor(), this.graphControl.getBackgroundLineConfig());
        }
    }

    public final void setActionManager(ActionManager actionManager) {
        AbstractC9133u.m16133g(actionManager, "<set-?>");
        this.actionManager = actionManager;
    }

    public final void setCameraEvent(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix) {
        AbstractC9133u.m16133g(originMatrix, "originMatrix");
        AbstractC9133u.m16133g(lastMatrix, "lastMatrix");
        this.routerRecord.getCommandRecord().addCamera(originMatrix, lastMatrix, System.currentTimeMillis());
    }

    public final void setPageEntity(PageEntity pageEntity) {
        AbstractC9133u.m16133g(pageEntity, "<set-?>");
        this.pageEntity = pageEntity;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void show(final InterfaceC10559a callback) {
        AbstractC9133u.m16133g(callback, "callback");
        new Thread(new Runnable() { // from class: com.zykj.blackboard.core.edit.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                BasePageControl.m27433show$lambda34(this.f8764a, callback);
            }
        }).start();
    }

    public /* synthetic */ BasePageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity, int i10, AbstractC9126n abstractC9126n) {
        this(boardControl, renderLayer, (i10 & 4) != 0 ? null : pageEntity);
    }
}
