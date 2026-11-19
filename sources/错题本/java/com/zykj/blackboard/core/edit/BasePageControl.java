package com.zykj.blackboard.core.edit;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、Protobuf。

import android.media.MediaPlayer;
import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.impl.utils.RunnableC0377a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import com.blankj.utilcode.util.AbstractC3387g;
import com.google.protobuf.InvalidProtocolBufferException;
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
import com.zykj.board.C4355b0;
import com.zykj.board.C4360d;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import com.zykj.board.EzyRectF$RectF;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p020b4.C3116b1;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 g2\u00020\u0001:\u0001gB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0004¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\fJ\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\fJ\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\fJ\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010$\"\u0004\b5\u0010\fR\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010K\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010P\u001a\u00020O8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010U\u001a\u00020T8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R \u0010a\u001a\b\u0012\u0004\u0012\u00020\r0`8\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010e\u001a\b\u0012\u0004\u0012\u00020\r0`8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010b\u001a\u0004\bf\u0010d¨\u0006h"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/BasePageControl;", "Lcom/zykj/blackboard/core/edit/IEditPageControl;", "Lcom/zykj/blackboard/core/edit/BoardControl;", "boardControl", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "<init>", "(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V", "Ld6/s;", "init", "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V", "", "getPagePath", "()Ljava/lang/String;", "Lcom/zykj/board/EzyMatrix$Matrix;", "originMatrix", "lastMatrix", "setCameraEvent", "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V", "getFileName", "refresh", "()V", "onDelete", "release", "hide", "Lkotlin/Function0;", "callback", "show", "(Lr6/a;)V", "", TypedValues.TransitionType.S_DURATION, "()J", "saveSnapshot", "initPageEntity", "()Lcom/zykj/blackboard/core/data/dao/PageEntity;", "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;", "blackBoardEntity", "createPageEntity", "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;", "initCommonSetting", "updateAudioRecord", "updateTimeRecord", "calculateCommandTime", "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J", "calculateAudioCommandTime", "addRootGraph", "Lcom/zykj/blackboard/core/edit/BoardControl;", "getBoardControl", "()Lcom/zykj/blackboard/core/edit/BoardControl;", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "getPageEntity", "setPageEntity", "Lcom/zykj/blackboard/core/record/TimeRecord;", "timeRecord", "Lcom/zykj/blackboard/core/record/TimeRecord;", "getTimeRecord", "()Lcom/zykj/blackboard/core/record/TimeRecord;", "Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "routerRecord", "Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "getRouterRecord", "()Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "Lcom/zykj/blackboard/core/loader/LocalSourceLoader;", "sourceLoad", "Lcom/zykj/blackboard/core/loader/LocalSourceLoader;", "getSourceLoad", "()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "Lcom/zykj/blackboard/core/edit/HistoryControl;", "historyControl", "Lcom/zykj/blackboard/core/edit/HistoryControl;", "getHistoryControl", "()Lcom/zykj/blackboard/core/edit/HistoryControl;", "Lcom/zykj/blackboard/core/edit/AudioControl;", "audioControl", "Lcom/zykj/blackboard/core/edit/AudioControl;", "getAudioControl", "()Lcom/zykj/blackboard/core/edit/AudioControl;", "Lcom/zykj/blackboard/core/action/ActionManager;", "actionManager", "Lcom/zykj/blackboard/core/action/ActionManager;", "getActionManager", "()Lcom/zykj/blackboard/core/action/ActionManager;", "setActionManager", "(Lcom/zykj/blackboard/core/action/ActionManager;)V", "Ljava/util/ArrayList;", "recordingImageList", "Ljava/util/ArrayList;", "getRecordingImageList", "()Ljava/util/ArrayList;", "noRecordingImageList", "getNoRecordingImageList", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BasePageControl implements IEditPageControl {

    @NotNull
    public static final String SCREENSHOT_FILE_NAME = "screenshot.png";

    @NotNull
    public static final String SNAPSHOT_FILE_NAME = "snapshot.bin";

    @NotNull
    private ActionManager actionManager;

    @NotNull
    private final AudioControl audioControl;

    @NotNull
    private final BoardControl boardControl;

    @NotNull
    private final GraphControl graphControl;

    @NotNull
    private final HistoryControl historyControl;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final ArrayList<String> noRecordingImageList;
    public PageEntity pageEntity;

    @NotNull
    private final ArrayList<String> recordingImageList;

    @NotNull
    private final SourceRouterRecord routerRecord;

    @NotNull
    private final LocalSourceLoader sourceLoad;

    @NotNull
    private final TimeRecord timeRecord;

    public BasePageControl(@NotNull BoardControl boardControl, @NotNull RenderLayer renderLayer, @Nullable PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC5830k.m5330g(boardControl, "boardControl");
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.boardControl = boardControl;
        TimeRecord timeRecord = new TimeRecord();
        this.timeRecord = timeRecord;
        SourceRouterRecord sourceRouterRecord = new SourceRouterRecord(timeRecord);
        this.routerRecord = sourceRouterRecord;
        LocalSourceLoader localSourceLoader = new LocalSourceLoader();
        this.sourceLoad = localSourceLoader;
        MatrixAdapter matrixAdapter = new MatrixAdapter();
        this.matrixAdapter = matrixAdapter;
        GraphControl graphControl = new GraphControl(matrixAdapter, renderLayer, boardControl.getBoardConfig());
        graphControl.setDeleteCallback(new InterfaceC6471c() { // from class: com.zykj.blackboard.core.edit.BasePageControl$graphControl$1$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IGraph) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull IGraph deleteGraph) {
                AbstractC5830k.m5330g(deleteGraph, "deleteGraph");
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
        this.actionManager = new ActionManager(graphControl, boardControl.getBoardConfig(), matrixAdapter, localSourceLoader, sourceRouterRecord, historyControl);
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

    private final void addRootGraph() throws InvalidProtocolBufferException {
        CommandRecord commandRecord = this.routerRecord.getCommandRecord();
        EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum = EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH;
        C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
        c3116b1NewBuilder.m2091j(-3.4028235E38f);
        c3116b1NewBuilder.m2093l(-3.4028235E38f);
        c3116b1NewBuilder.m2092k(Float.MAX_VALUE);
        c3116b1NewBuilder.m2090i(Float.MAX_VALUE);
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandRecord.addCommand("", ezyGraphEnum$GraphEnum, c3116b1NewBuilder.build(), System.currentTimeMillis()).getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoad);
        if (graph != null) {
            this.graphControl.addGraph(graphData.getParentGraphId(), graph);
        }
    }

    private final long calculateAudioCommandTime(PageEntity pageEntity) {
        Iterator<AudioRecordEntity> it = pageEntity.getRecordEntity().getTarget().getAudioList().iterator();
        long duration = 0;
        while (it.hasNext()) {
            for (AudioInfoEntity audioInfoEntity : it.next().getAudioInfoEntity()) {
                if (audioInfoEntity.isPlay()) {
                    duration += audioInfoEntity.getDuration() + audioInfoEntity.getDelayTime();
                }
            }
        }
        return duration;
    }

    private final long calculateCommandTime(PageEntity pageEntity) {
        Iterator<CommandRecordEntity> it = pageEntity.getRecordEntity().getTarget().getCommandList().iterator();
        long duration = 0;
        while (it.hasNext()) {
            for (CommandInfoEntity commandInfoEntity : it.next().getCommandInfoEntity()) {
                if (commandInfoEntity.isPlay()) {
                    duration += commandInfoEntity.getDuration() + commandInfoEntity.getDelayTime();
                }
            }
        }
        return duration;
    }

    private final PageEntity createPageEntity(BlackBoardEntity blackBoardEntity) {
        AuthorEntity entity;
        String string = UUID.randomUUID().toString();
        AbstractC5830k.m5329f(string, "randomUUID().toString()");
        AbstractC3387g.m2342e(AbstractC0037f.m86k("BasePageControl:createPageEntity [", string, "]:创建新Entity"));
        setPageEntity(new PageEntity(0L, string, false, null, 0, 28, null));
        ToOne<HeaderEntity> headerEntity = getPageEntity().getHeaderEntity();
        HeaderEntity headerEntity2 = new HeaderEntity(0L, 6, 0, 0, 0L, 0L, 0L, null, 0, 0, PointerIconCompat.TYPE_GRAB, null);
        headerEntity2.setCreateDate(System.currentTimeMillis());
        long j7 = 0;
        headerEntity2.setDuration(0L);
        BoardConfig boardConfig = this.boardControl.getBoardConfig();
        headerEntity2.setWidth(boardConfig.getWidth());
        headerEntity2.setHeight(boardConfig.getHeight());
        headerEntity2.setDefaultBackgroundColor(boardConfig.getBackgroundColor());
        headerEntity2.setLastBackgroundColor(boardConfig.getBackgroundColor());
        ToOne<MoveConfigEntity> moveConfig = headerEntity2.getMoveConfig();
        MoveConfigEntity entity2 = ConvertExtKt.toEntity(boardConfig.getMoveActionConfig());
        entity2.put();
        moveConfig.setTarget(entity2);
        ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig = headerEntity2.getDefaultBackgroundLineConfig();
        BackgroundLineConfigEntity entity3 = ConvertExtKt.toEntity(boardConfig.getBackgroundLineConfig());
        entity3.put();
        defaultBackgroundLineConfig.setTarget(entity3);
        ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = headerEntity2.getLastBackgroundLineConfig();
        BackgroundLineConfigEntity entity4 = ConvertExtKt.toEntity(boardConfig.getBackgroundLineConfig());
        entity4.put();
        lastBackgroundLineConfig.setTarget(entity4);
        ToOne<AuthorEntity> author = headerEntity2.getAuthor();
        Author author2 = boardConfig.getAuthor();
        AbstractC5824e abstractC5824e = null;
        if (author2 == null || (entity = ConvertExtKt.toEntity(author2)) == null) {
            entity = null;
        } else {
            entity.put();
        }
        author.setTarget(entity);
        headerEntity2.getPage().setTarget(getPageEntity());
        headerEntity2.put();
        headerEntity.setTarget(headerEntity2);
        ToOne<RecordEntity> recordEntity = getPageEntity().getRecordEntity();
        RecordEntity recordEntity2 = new RecordEntity(j7, 1, abstractC5824e);
        recordEntity2.getPage().setTarget(getPageEntity());
        recordEntity2.put();
        recordEntity.setTarget(recordEntity2);
        getPageEntity().getBlackBoardEntity().setTarget(blackBoardEntity);
        getPageEntity().put();
        AbstractC3387g.m2342e("BasePageControl:createPageEntity [" + string + "]:创建完成,id:" + getPageEntity().getId());
        return getPageEntity();
    }

    private final void initCommonSetting(PageEntity pageEntity) {
        BackgroundLineConfig config;
        BackgroundLineConfig config2;
        HeaderEntity target = pageEntity.getHeaderEntity().getTarget();
        if (target == null) {
            return;
        }
        this.graphControl.setDefaultBackgroundColor(target.getDefaultBackgroundColor());
        this.graphControl.updateBackgroundColor(target.getLastBackgroundColor());
        BackgroundLineConfigEntity target2 = target.getDefaultBackgroundLineConfig().getTarget();
        if (target2 != null && (config2 = ConvertExtKt.toConfig(target2)) != null) {
            this.graphControl.setDefaultBackgroundLineConfig(config2);
        }
        BackgroundLineConfigEntity target3 = target.getLastBackgroundLineConfig().getTarget();
        if (target3 != null && (config = ConvertExtKt.toConfig(target3)) != null) {
            this.graphControl.updateBackgroundLineConfig(config);
        }
        MoveConfigEntity target4 = target.getMoveConfig().getTarget();
        if (target4 != null) {
            this.boardControl.getBoardConfig().getMoveActionConfig().set(target4);
        }
        this.matrixAdapter.setScreenMatrix(PageControlExtKt.getScreenMatrix$default(target.getWidth(), target.getHeight(), this.boardControl.getBoardConfig().getWidth(), this.boardControl.getBoardConfig().getHeight(), false, 0, 0, 112, null));
    }

    private final PageEntity initPageEntity() throws NullPointerException {
        QueryBuilder queryBuilderM5036g = BoardBox.INSTANCE.getBoxStore().m5018c(BlackBoardEntity.class).m5036g();
        queryBuilderM5036g.m5064b(BlackBoardEntity_.dir, this.boardControl.getBoardDirPath());
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryBuilderM5036g.m5063a().m5062c();
        if (blackBoardEntity != null) {
            return createPageEntity(blackBoardEntity);
        }
        AbstractC3387g.m2342e("BasePageControl:initPageEntity [" + getFileName() + "] 没找到boardEntity:" + this.boardControl.getBoardDirPath());
        throw new NullPointerException("empty boardEntity: " + this.boardControl.getBoardDirPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: release$lambda-23, reason: not valid java name */
    public static final void m13762release$lambda23(BasePageControl this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        if (this$0.isRecording()) {
            this$0.stopRecord();
        }
        HeaderEntity target = this$0.getPageEntity().getHeaderEntity().getTarget();
        if (target == null) {
            return;
        }
        MoveConfigEntity target2 = target.getMoveConfig().getTarget();
        if (target2 != null) {
            target2.set(this$0.boardControl.getBoardConfig().getMoveActionConfig());
            target2.put();
        } else {
            MoveConfigEntity entity = ConvertExtKt.toEntity(this$0.boardControl.getBoardConfig().getMoveActionConfig());
            entity.put();
            target.getMoveConfig().setTarget(entity);
            target.put();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029f  */
    /* renamed from: show$lambda-34, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m13763show$lambda34(com.zykj.blackboard.core.edit.BasePageControl r10, p152r6.InterfaceC6469a r11) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.edit.BasePageControl.m13763show$lambda34(com.zykj.blackboard.core.edit.BasePageControl, r6.a):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/edit/BasePageControl.smali:2191
    }

    private final void updateAudioRecord(PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        ToMany<AudioInfoEntity> audioInfoEntity;
        AudioInfoEntity audioInfoEntity2;
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) AbstractC5805t.m5236p0(pageEntity.getRecordEntity().getTarget().getAudioList());
        if (audioRecordEntity == null || (audioInfoEntity = audioRecordEntity.getAudioInfoEntity()) == null || (audioInfoEntity2 = (AudioInfoEntity) AbstractC5805t.m5236p0(audioInfoEntity)) == null) {
            return;
        }
        EzyCommand$CommandSource.CommandInfo.AudioStart from = EzyCommand$CommandSource.CommandInfo.AudioStart.parseFrom(audioInfoEntity2.getData());
        File file = new File(SourceRouterRecord.INSTANCE.getResPath(getPagePath(), DocumentType.AUDIO), from.getFileName());
        if (file.exists()) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            long duration = mediaPlayer.getDuration();
            if (from.getDuration() != duration) {
                C4360d c4360dNewBuilder = EzyCommand$CommandSource.CommandInfo.AudioStart.newBuilder();
                String fileName = from.getFileName();
                c4360dNewBuilder.getClass();
                fileName.getClass();
                c4360dNewBuilder.f5455b = fileName;
                c4360dNewBuilder.f5454a |= 1;
                c4360dNewBuilder.onChanged();
                c4360dNewBuilder.m3708i(duration);
                byte[] byteArray = c4360dNewBuilder.build().toByteArray();
                AbstractC5830k.m5329f(byteArray, "builder.build().toByteArray()");
                audioInfoEntity2.setData(byteArray);
                audioInfoEntity2.setDuration(duration);
                audioInfoEntity2.put();
            }
        }
    }

    // RE: 重开时会比较页头、画面和音频的时长。把普通加笔误写为 isPlay 会让下一次保存延长录制。
    private final void updateTimeRecord(PageEntity pageEntity) {
        long duration = pageEntity.getHeaderEntity().getTarget().getDuration();
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

    @NotNull
    public final ActionManager getActionManager() {
        return this.actionManager;
    }

    @NotNull
    public final AudioControl getAudioControl() {
        return this.audioControl;
    }

    @NotNull
    public final BoardControl getBoardControl() {
        return this.boardControl;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    @NotNull
    public String getFileName() {
        return getPageEntity().getDirName();
    }

    @NotNull
    public final GraphControl getGraphControl() {
        return this.graphControl;
    }

    @NotNull
    public final HistoryControl getHistoryControl() {
        return this.historyControl;
    }

    @NotNull
    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    @NotNull
    public final ArrayList<String> getNoRecordingImageList() {
        return this.noRecordingImageList;
    }

    @NotNull
    public final PageEntity getPageEntity() {
        PageEntity pageEntity = this.pageEntity;
        if (pageEntity != null) {
            return pageEntity;
        }
        AbstractC5830k.m5339p("pageEntity");
        throw null;
    }

    @NotNull
    public final String getPagePath() {
        String absolutePath = new File(this.boardControl.getBoardDirPath(), getPageEntity().getDirName()).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "File(boardControl.getBoa…ity.dirName).absolutePath");
        return absolutePath;
    }

    @NotNull
    public final ArrayList<String> getRecordingImageList() {
        return this.recordingImageList;
    }

    @NotNull
    public final SourceRouterRecord getRouterRecord() {
        return this.routerRecord;
    }

    @NotNull
    public final LocalSourceLoader getSourceLoad() {
        return this.sourceLoad;
    }

    @NotNull
    public final TimeRecord getTimeRecord() {
        return this.timeRecord;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void hide() {
        EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshotSnapshot = this.graphControl.snapshot();
        if (graphSnapshotSnapshot != null) {
            C4355b0 c4355b0NewBuilder = EzyPageSnapshot$PageSnapshot.newBuilder();
            c4355b0NewBuilder.m3699k(graphSnapshotSnapshot);
            c4355b0NewBuilder.m3698j(MatrixExtKt.toEzyMatrix(this.matrixAdapter.getCameraMatrix(), 0L));
            ProtoFileUtils.INSTANCE.createPageSnapshotFile(getPagePath(), SNAPSHOT_FILE_NAME, c4355b0NewBuilder.build());
            if (getPageEntity().isChange()) {
                getPageEntity().setChange(false);
                getPageEntity().setCommandFileName("");
                getPageEntity().setCommandIndex(-1);
                getPageEntity().put();
            }
        }
        this.graphControl.release();
    }

    public final void init(@NotNull final PageEntity pageEntity) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC5830k.m5330g(pageEntity, "pageEntity");
        initCommonSetting(pageEntity);
        addEventListener(this.actionManager.getModeFactory());
        addEventListener(new EventListener() { // from class: com.zykj.blackboard.core.edit.BasePageControl.init.1
            @Override // com.zykj.blackboard.listener.EventListener
            public void onEvent(@NotNull CommandInfoEntity entity) {
                AbstractC5830k.m5330g(entity, "entity");
                if (pageEntity.isChange()) {
                    return;
                }
                pageEntity.setCommandFileName(entity.getRecord().getTarget().getFileName());
                pageEntity.setChange(true);
                pageEntity.setCommandIndex(entity.getRecord().getTarget().getCommandInfoEntity().indexOfId(entity.getId()));
                pageEntity.put();
            }
        });
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        RecordEntity target = pageEntity.getRecordEntity().getTarget();
        AbstractC5830k.m5329f(target, "pageEntity.recordEntity.target");
        sourceRouterRecord.initRecord(target);
        this.sourceLoad.initPath(getPagePath());
        this.audioControl.initDirPath(SourceRouterRecord.INSTANCE.getResPath(getPagePath(), DocumentType.AUDIO));
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
        new Thread(new RunnableC0023a(this, 17)).start();
        removeEventListener(this.actionManager.getModeFactory());
        this.graphControl.release();
    }

    public final void saveSnapshot() {
        IGraph iGraphRootGraph = this.graphControl.getRootGraph();
        if (iGraphRootGraph != null) {
            this.historyControl.saveSnapshot((Graph) iGraphRootGraph, this.graphControl.getBackgroundColor(), this.graphControl.getBackgroundLineConfig());
        }
    }

    public final void setActionManager(@NotNull ActionManager actionManager) {
        AbstractC5830k.m5330g(actionManager, "<set-?>");
        this.actionManager = actionManager;
    }

    public final void setCameraEvent(@NotNull EzyMatrix$Matrix originMatrix, @NotNull EzyMatrix$Matrix lastMatrix) {
        AbstractC5830k.m5330g(originMatrix, "originMatrix");
        AbstractC5830k.m5330g(lastMatrix, "lastMatrix");
        this.routerRecord.getCommandRecord().addCamera(originMatrix, lastMatrix, System.currentTimeMillis());
    }

    public final void setPageEntity(@NotNull PageEntity pageEntity) {
        AbstractC5830k.m5330g(pageEntity, "<set-?>");
        this.pageEntity = pageEntity;
    }

    @Override // com.zykj.blackboard.core.edit.IEditPageControl
    public void show(@NotNull InterfaceC6469a callback) {
        AbstractC5830k.m5330g(callback, "callback");
        new Thread(new RunnableC0377a(9, this, callback)).start();
    }

    public /* synthetic */ BasePageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity, int i, AbstractC5824e abstractC5824e) {
        this(boardControl, renderLayer, (i & 4) != 0 ? null : pageEntity);
    }
}
