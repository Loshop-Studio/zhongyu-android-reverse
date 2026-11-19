# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public abstract Lcom/zykj/blackboard/core/edit/BasePageControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/edit/IEditPageControl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;

.field public static final SCREENSHOT_FILE_NAME:Ljava/lang/String; = "screenshot.png"

.field public static final SNAPSHOT_FILE_NAME:Ljava/lang/String; = "snapshot.bin"


# instance fields
.field private actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

.field private final audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;

.field private final boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

.field private final historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

.field private final noRecordingImageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

.field private final recordingImageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

.field private final sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

.field private final timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->Companion:Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8

    const-string v0, "boardControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 3
    new-instance v0, Lcom/zykj/blackboard/core/record/TimeRecord;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;-><init>()V

    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 4
    new-instance v6, Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    invoke-direct {v6, v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    iput-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 5
    new-instance v5, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    invoke-direct {v5}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;-><init>()V

    iput-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 6
    new-instance v4, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    invoke-direct {v4}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;-><init>()V

    iput-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 7
    new-instance v2, Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 8
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v0

    .line 9
    invoke-direct {v2, v4, p2, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;-><init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 10
    new-instance p2, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;

    invoke-direct {p2, p0}, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    invoke-virtual {v2, p2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDeleteCallback(Lx7/l;)V

    .line 11
    iput-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 12
    new-instance v7, Lcom/zykj/blackboard/core/edit/HistoryControl;

    invoke-direct {v7, v2}, Lcom/zykj/blackboard/core/edit/HistoryControl;-><init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;)V

    iput-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 13
    new-instance p2, Lcom/zykj/blackboard/core/edit/AudioControl;

    invoke-direct {p2}, Lcom/zykj/blackboard/core/edit/AudioControl;-><init>()V

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 14
    new-instance v1, Lcom/zykj/blackboard/core/action/ActionManager;

    .line 15
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    move-result-object v3

    .line 16
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/ActionManager;-><init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;)V

    iput-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->recordingImageList:Ljava/util/ArrayList;

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->noRecordingImageList:Ljava/util/ArrayList;

    if-nez p3, :cond_0

    .line 19
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->initPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->init(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 20
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->addRootGraph()V

    return-void

    .line 21
    :cond_0
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->setPageEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 22
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->init(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 23
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->show$lambda-34(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V

    return-void
.end method

.method private final addRootGraph()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->h()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v2, -0x800001

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->s(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->v(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->u(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->q(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF$b;->e()Lcom/zykj/board/EzyRectF$RectF;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v0, "newBuilder().setLeft(-Fl\u2026(Float.MAX_VALUE).build()"

    .line 40
    .line 41
    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    const-string v2, ""

    .line 49
    .line 50
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 63
    .line 64
    const-string v2, "graphData"

    .line 65
    .line 66
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->w()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v2, v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->release$lambda-23(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    return-void
.end method

.method private final calculateAudioCommandTime(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v4, v6

    .line 68
    add-long/2addr v0, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-wide v0
.end method

.method private final calculateCommandTime(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v4, v6

    .line 68
    add-long/2addr v0, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-wide v0
.end method

.method private final createPageEntity(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    const-string v1, "randomUUID().toString()"

    .line 12
    .line 13
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v11, "BasePageControl:createPageEntity ["

    .line 22
    .line 23
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "]:\u521b\u5efa\u65b0Entity"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 46
    .line 47
    const/16 v9, 0x1c

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->setPageEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v12, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 70
    .line 71
    const/16 v27, 0x3fc

    .line 72
    .line 73
    const/16 v28, 0x0

    .line 74
    .line 75
    const-wide/16 v13, 0x0

    .line 76
    .line 77
    const/4 v15, 0x6

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    const-wide/16 v20, 0x0

    .line 85
    .line 86
    const-wide/16 v22, 0x0

    .line 87
    .line 88
    const/16 v24, 0x0

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    const/16 v26, 0x0

    .line 93
    .line 94
    invoke-direct/range {v12 .. v28}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;-><init>(JIIIJJJLjava/lang/String;IIILkotlin/jvm/internal/n;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setCreateDate(J)V

    .line 102
    .line 103
    .line 104
    const-wide/16 v2, 0x0

    .line 105
    .line 106
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDuration(J)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setWidth(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setHeight(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDefaultBackgroundColor(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->put()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getAuthor()Lio/objectbox/relation/ToOne;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getAuthor()Lcom/zykj/blackboard/bean/Author;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const/4 v7, 0x0

    .line 206
    if-eqz v4, :cond_0

    .line 207
    .line 208
    invoke-static {v4}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-eqz v4, :cond_0

    .line 213
    .line 214
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->put()V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_0
    move-object v4, v7

    .line 219
    :goto_0
    invoke-virtual {v6, v4}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getPage()Lio/objectbox/relation/ToOne;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    invoke-virtual {v4, v6}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v12}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 248
    .line 249
    const/4 v6, 0x1

    .line 250
    invoke-direct {v4, v2, v3, v6, v7}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(JILkotlin/jvm/internal/n;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getPage()Lio/objectbox/relation/ToOne;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->put()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v4}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getBlackBoardEntity()Lio/objectbox/relation/ToOne;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object/from16 v2, p1

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 288
    .line 289
    .line 290
    new-instance v1, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v2, "]:\u521b\u5efa\u5b8c\u6210,id:"

    .line 302
    .line 303
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getId()J

    .line 311
    .line 312
    .line 313
    move-result-wide v2

    .line 314
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    return-object v1
.end method

.method private final initCommonSetting(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundColor()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundColor(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundColor()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-static {v0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->set(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const/16 v9, 0x70

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static/range {v2 .. v10}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getScreenMatrix$default(IIIIZIIILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setScreenMatrix(Landroid/graphics/Matrix;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method private final initPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->d(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lio/objectbox/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "builder"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Lio/objectbox/query/QueryBuilder;->c(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "builder.build()"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/objectbox/query/Query;->l()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->createPageEntity(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "BasePageControl:initPageEntity ["

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, "] \u6ca1\u627e\u5230boardEntity:"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/NullPointerException;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "empty boardEntity: "

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method

.method private static final release$lambda-23(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isRecording()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IPageControl;->stopRecord()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->set(Lcom/zykj/blackboard/bean/MoveActionConfig;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->put()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->put()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, p0}, Lio/objectbox/relation/ToOne;->k(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method private static final show$lambda-34(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V
    .locals 12

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "[BasePageControl]["

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "]:show -> start}"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->setCacheAble(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw(Z)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 57
    .line 58
    new-instance v4, Ljava/io/File;

    .line 59
    .line 60
    new-instance v5, Ljava/io/File;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 63
    .line 64
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v6, "snapshot.bin"

    .line 76
    .line 77
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    const-string v5, "File(\n                  \u2026           ).absolutePath"

    .line 85
    .line 86
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v4}, Lcom/zykj/blackboard/utils/GraphUtils;->snapshotGraphToGraph(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const-string v5, "info"

    .line 94
    .line 95
    const/4 v6, 0x6

    .line 96
    if-eqz v4, :cond_7

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->i()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v7}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-lez v7, :cond_0

    .line 107
    .line 108
    move v7, v2

    .line 109
    goto :goto_0

    .line 110
    :cond_0
    move v7, v3

    .line 111
    :goto_0
    xor-int/lit8 v8, v7, 0x1

    .line 112
    .line 113
    if-eqz v7, :cond_8

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v7}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    const/4 v9, 0x0

    .line 124
    cmpg-float v7, v7, v9

    .line 125
    .line 126
    if-nez v7, :cond_1

    .line 127
    .line 128
    move v7, v2

    .line 129
    goto :goto_1

    .line 130
    :cond_1
    move v7, v3

    .line 131
    :goto_1
    if-eqz v7, :cond_2

    .line 132
    .line 133
    new-instance v9, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v10, "]:show -> \u76f8\u673a\u77e9\u9635\u5f02\u5e38}"

    .line 149
    .line 150
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-static {v9}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v9, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 165
    .line 166
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/edit/BoardControl;->getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    if-eqz v9, :cond_2

    .line 171
    .line 172
    new-instance v10, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    iget-object v11, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 178
    .line 179
    invoke-virtual {v11}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v11, ": \u76f8\u673a\u77e9\u9635\u5f02\u5e38"

    .line 187
    .line 188
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-interface {v9, v10}, Lcom/zykj/blackboard/listener/ErrorListener;->reportError(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_2
    if-nez v7, :cond_8

    .line 199
    .line 200
    new-instance v7, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v8, "]:show -> \u4ece\u5feb\u7167\u8fdb\u884c\u52a0\u8f7d}"

    .line 216
    .line 217
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-static {v7}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 232
    .line 233
    invoke-virtual {v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    const-string v9, "localGraphSnapshot.cameraMatrix"

    .line 238
    .line 239
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v8}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-virtual {v7, v8}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 247
    .line 248
    .line 249
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 250
    .line 251
    invoke-virtual {v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->i()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    const-string v8, "localGraphSnapshot.graphSnapshot"

    .line 256
    .line 257
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v7, v4}, Lcom/zykj/blackboard/utils/GraphUtils;->buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-eqz v0, :cond_3

    .line 265
    .line 266
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 267
    .line 268
    invoke-virtual {v4, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 269
    .line 270
    .line 271
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_c

    .line 280
    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string v4, "]:show -> \u5b58\u5728\u672a\u4fdd\u5b58\u6570\u636e\u5e93\u6570\u636e\uff0c\u7ee7\u7eed\u4ece\u6570\u636e\u5e93\u52a0\u8f7d}"

    .line 297
    .line 298
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 313
    .line 314
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 315
    .line 316
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 317
    .line 318
    iget-object v8, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 319
    .line 320
    invoke-virtual {v0, v6, v4, v7, v8}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 337
    .line 338
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    move v6, v3

    .line 347
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-eqz v7, :cond_c

    .line 352
    .line 353
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 358
    .line 359
    if-eqz v6, :cond_5

    .line 360
    .line 361
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v8

    .line 373
    if-eqz v8, :cond_4

    .line 374
    .line 375
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 380
    .line 381
    invoke-static {v8, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v8}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 385
    .line 386
    .line 387
    goto :goto_3

    .line 388
    :cond_5
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandFileName()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-eqz v8, :cond_4

    .line 405
    .line 406
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandIndex()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    invoke-static {v8}, Li7/v;->p(Ljava/util/List;)I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-gt v6, v8, :cond_6

    .line 423
    .line 424
    :goto_4
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-virtual {v9, v6}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v9

    .line 432
    const-string v10, "it.commandInfoEntity[i]"

    .line 433
    .line 434
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    check-cast v9, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 438
    .line 439
    invoke-virtual {v0, v9}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 440
    .line 441
    .line 442
    if-eq v6, v8, :cond_6

    .line 443
    .line 444
    add-int/lit8 v6, v6, 0x1

    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_6
    move v6, v2

    .line 448
    goto :goto_2

    .line 449
    :cond_7
    move v8, v3

    .line 450
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    const-string v4, "]:show -> \u4ece\u547d\u4ee4\u884c\u52a0\u8f7d}"

    .line 466
    .line 467
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    sget-object v0, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 482
    .line 483
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 484
    .line 485
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 486
    .line 487
    iget-object v9, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 488
    .line 489
    invoke-virtual {v0, v6, v4, v7, v9}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 506
    .line 507
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-eqz v6, :cond_a

    .line 520
    .line 521
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 526
    .line 527
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 536
    .line 537
    .line 538
    move-result v7

    .line 539
    if-eqz v7, :cond_9

    .line 540
    .line 541
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 546
    .line 547
    invoke-static {v7, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v7}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 551
    .line 552
    .line 553
    goto :goto_5

    .line 554
    :cond_a
    if-eqz v8, :cond_c

    .line 555
    .line 556
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 557
    .line 558
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    if-eqz v0, :cond_b

    .line 563
    .line 564
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    if-eqz v0, :cond_b

    .line 569
    .line 570
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    goto :goto_6

    .line 575
    :cond_b
    move v0, v3

    .line 576
    :goto_6
    if-lez v0, :cond_c

    .line 577
    .line 578
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 579
    .line 580
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    if-eqz v0, :cond_c

    .line 585
    .line 586
    new-instance v4, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    .line 590
    .line 591
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 592
    .line 593
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    const-string v5, ": \u5feb\u7167\u5f02\u5e38"

    .line 601
    .line 602
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    invoke-interface {v0, v4}, Lcom/zykj/blackboard/listener/ErrorListener;->reportError(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    const-string v4, "]:show -> \u521d\u59cb\u5316\u5b8c\u6bd5, g:"

    .line 628
    .line 629
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 633
    .line 634
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    if-eqz v4, :cond_d

    .line 639
    .line 640
    invoke-interface {v4}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    if-eqz v4, :cond_d

    .line 645
    .line 646
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 647
    .line 648
    .line 649
    move-result v4

    .line 650
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    goto :goto_7

    .line 655
    :cond_d
    const/4 v4, 0x0

    .line 656
    :goto_7
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 671
    .line 672
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw(Z)V

    .line 673
    .line 674
    .line 675
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 676
    .line 677
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 678
    .line 679
    .line 680
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 681
    .line 682
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundMatrix()V

    .line 683
    .line 684
    .line 685
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 686
    .line 687
    .line 688
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 689
    .line 690
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->setCacheAble(Z)V

    .line 691
    .line 692
    .line 693
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 694
    .line 695
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cleanCache()V

    .line 696
    .line 697
    .line 698
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    new-instance p1, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object p0

    .line 713
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    const-string p0, "]:show -> end}"

    .line 717
    .line 718
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    invoke-static {p0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    return-void
.end method

.method private final updateAudioRecord(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Li7/f0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Li7/f0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->o([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    sget-object v2, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, Lcom/zykj/blackboard/enums/DocumentType;->AUDIO:Lcom/zykj/blackboard/enums/DocumentType;

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v2, Landroid/media/MediaPlayer;

    .line 74
    .line 75
    invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v2, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    int-to-long v1, v1

    .line 93
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->i()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    cmp-long v3, v3, v1

    .line 98
    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v3, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->s(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->q(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v3, "builder.build().toByteArray()"

    .line 124
    .line 125
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setData([B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1, v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setDuration(J)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->put()V

    .line 135
    .line 136
    .line 137
    :cond_1
    :goto_0
    return-void
.end method

.method private final updateTimeRecord(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDuration()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->calculateCommandTime(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->calculateAudioCommandTime(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long p1, v0, v2

    .line 24
    .line 25
    if-ltz p1, :cond_0

    .line 26
    .line 27
    cmp-long p1, v0, v4

    .line 28
    .line 29
    if-ltz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/record/TimeRecord;->init(J)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 37
    .line 38
    sub-long v4, v0, v4

    .line 39
    .line 40
    invoke-virtual {p1, v4, v5}, Lcom/zykj/blackboard/core/record/TimeRecord;->setOffsetForAudio(J)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 44
    .line 45
    sub-long/2addr v0, v2

    .line 46
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/record/TimeRecord;->setOffsetForCommand(J)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    cmp-long p1, v2, v4

    .line 51
    .line 52
    if-lez p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v3}, Lcom/zykj/blackboard/core/record/TimeRecord;->init(J)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 60
    .line 61
    sub-long/2addr v2, v4

    .line 62
    invoke-virtual {p1, v2, v3}, Lcom/zykj/blackboard/core/record/TimeRecord;->setOffsetForAudio(J)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    cmp-long p1, v4, v2

    .line 67
    .line 68
    if-lez p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 71
    .line 72
    invoke-virtual {p1, v4, v5}, Lcom/zykj/blackboard/core/record/TimeRecord;->init(J)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sub-long/2addr v4, v2

    .line 82
    invoke-virtual {p1, v4, v5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->stopRecord(J)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method


# virtual methods
.method public duration()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/TimeRecord;->getTime(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public final getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNoRecordingImageList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->noRecordingImageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "pageEntity"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final getPagePath()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "File(boardControl.getBoa\u2026ity.dirName).absolutePath"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final getRecordingImageList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->recordingImageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourceLoad()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public hide()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->k()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->z(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v2, v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->x(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/zykj/blackboard/utils/ProtoFileUtils;->Companion:Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->e()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "builder.build()"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "snapshot.bin"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3, v1}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createPageSnapshotFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setChange(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, ""

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandFileName(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v1, -0x1

    .line 83
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandIndex(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final init(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 4

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->initCommonSetting(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getModeFactory()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;-><init>(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->c()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "pageEntity.recordEntity.target"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->initRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->initPath(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 56
    .line 57
    sget-object v1, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->AUDIO:Lcom/zykj/blackboard/enums/DocumentType;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/edit/AudioControl;->initDirPath(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->updateAudioRecord(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->updateTimeRecord(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public onDelete()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/BoardBox;->clearPageData(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/blackboard/core/edit/b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/b;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getModeFactory()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final saveSnapshot()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 10
    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/graph/Graph;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v0, v2, v3}, Lcom/zykj/blackboard/core/edit/HistoryControl;->saveSnapshot(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final setActionManager(Lcom/zykj/blackboard/core/action/ActionManager;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    return-void
.end method

.method public final setCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 3

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getCommandRecord()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCamera(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setPageEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 7
    .line 8
    return-void
.end method

.method public show(Lx7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/edit/a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/zykj/blackboard/core/edit/a;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    return-void
.end method
