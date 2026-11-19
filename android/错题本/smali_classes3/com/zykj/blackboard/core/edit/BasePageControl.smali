# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、Protobuf。
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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u0000 g2\u00020\u0001:\u0001gB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\n2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\n0\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0004\u00a2\u0006\u0004\u0008\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008)\u0010\u000cJ\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008*\u0010\u000cJ\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010\u000cJ\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008.\u0010-J\u000f\u0010/\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008/\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u00102R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010$\"\u0004\u00085\u0010\u000cR\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u001a\u0010<\u001a\u00020;8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R\u001a\u0010A\u001a\u00020@8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u001a\u0010F\u001a\u00020E8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u001a\u0010K\u001a\u00020J8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR\u001a\u0010P\u001a\u00020O8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR\u001a\u0010U\u001a\u00020T8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010XR\"\u0010Z\u001a\u00020Y8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R \u0010a\u001a\u0008\u0012\u0004\u0012\u00020\r0`8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010dR \u0010e\u001a\u0008\u0012\u0004\u0012\u00020\r0`8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008e\u0010b\u001a\u0004\u0008f\u0010d\u00a8\u0006h"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/BasePageControl;",
        "Lcom/zykj/blackboard/core/edit/IEditPageControl;",
        "Lcom/zykj/blackboard/core/edit/BoardControl;",
        "boardControl",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "pageEntity",
        "<init>",
        "(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V",
        "Ld6/s;",
        "init",
        "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V",
        "",
        "getPagePath",
        "()Ljava/lang/String;",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "originMatrix",
        "lastMatrix",
        "setCameraEvent",
        "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V",
        "getFileName",
        "refresh",
        "()V",
        "onDelete",
        "release",
        "hide",
        "Lkotlin/Function0;",
        "callback",
        "show",
        "(Lr6/a;)V",
        "",
        "duration",
        "()J",
        "saveSnapshot",
        "initPageEntity",
        "()Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
        "blackBoardEntity",
        "createPageEntity",
        "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "initCommonSetting",
        "updateAudioRecord",
        "updateTimeRecord",
        "calculateCommandTime",
        "(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J",
        "calculateAudioCommandTime",
        "addRootGraph",
        "Lcom/zykj/blackboard/core/edit/BoardControl;",
        "getBoardControl",
        "()Lcom/zykj/blackboard/core/edit/BoardControl;",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "getPageEntity",
        "setPageEntity",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "timeRecord",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "getTimeRecord",
        "()Lcom/zykj/blackboard/core/record/TimeRecord;",
        "Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "routerRecord",
        "Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "getRouterRecord",
        "()Lcom/zykj/blackboard/core/record/SourceRouterRecord;",
        "Lcom/zykj/blackboard/core/loader/LocalSourceLoader;",
        "sourceLoad",
        "Lcom/zykj/blackboard/core/loader/LocalSourceLoader;",
        "getSourceLoad",
        "()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "historyControl",
        "Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "getHistoryControl",
        "()Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "Lcom/zykj/blackboard/core/edit/AudioControl;",
        "audioControl",
        "Lcom/zykj/blackboard/core/edit/AudioControl;",
        "getAudioControl",
        "()Lcom/zykj/blackboard/core/edit/AudioControl;",
        "Lcom/zykj/blackboard/core/action/ActionManager;",
        "actionManager",
        "Lcom/zykj/blackboard/core/action/ActionManager;",
        "getActionManager",
        "()Lcom/zykj/blackboard/core/action/ActionManager;",
        "setActionManager",
        "(Lcom/zykj/blackboard/core/action/ActionManager;)V",
        "Ljava/util/ArrayList;",
        "recordingImageList",
        "Ljava/util/ArrayList;",
        "getRecordingImageList",
        "()Ljava/util/ArrayList;",
        "noRecordingImageList",
        "getNoRecordingImageList",
        "Companion",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SCREENSHOT_FILE_NAME:Ljava/lang/String; = "screenshot.png"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SNAPSHOT_FILE_NAME:Ljava/lang/String; = "snapshot.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private actionManager:Lcom/zykj/blackboard/core/action/ActionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final noRecordingImageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final timeRecord:Lcom/zykj/blackboard/core/record/TimeRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->Companion:Lcom/zykj/blackboard/core/edit/BasePageControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8
    .param p1    # Lcom/zykj/blackboard/core/edit/BoardControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "boardControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-virtual {v2, p2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDeleteCallback(Lr6/c;)V

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

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 23
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/edit/BasePageControl;Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->show$lambda-34(Lcom/zykj/blackboard/core/edit/BasePageControl;Lr6/a;)V

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
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BOUNDED_CONTAINER_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->newBuilder()Lb4/b1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v2, -0x800001

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lb4/b1;->j(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lb4/b1;->l(F)V

    .line 20
    .line 21
    .line 22
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lb4/b1;->k(F)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lb4/b1;->i(F)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lb4/b1;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    const-string v2, ""

    .line 40
    .line 41
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget-object v1, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->INSTANCE:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 54
    .line 55
    const-string v2, "graphData"

    .line 56
    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 61
    .line 62
    invoke-virtual {v1, v0, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getParentGraphId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v2, v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->addGraph(Ljava/lang/String;Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 75
    .line 76
    .line 77
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
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    add-long/2addr v6, v4

    .line 68
    add-long/2addr v0, v6

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
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    add-long/2addr v6, v4

    .line 68
    add-long/2addr v0, v6

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
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "]:\u521b\u5efa\u65b0Entity"

    .line 17
    .line 18
    const-string v11, "BasePageControl:createPageEntity ["

    .line 19
    .line 20
    invoke-static {v11, v5, v1}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 32
    .line 33
    const/16 v9, 0x1c

    .line 34
    .line 35
    const/4 v10, 0x0

    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/e;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->setPageEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v12, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 56
    .line 57
    const/16 v27, 0x3fc

    .line 58
    .line 59
    const/16 v28, 0x0

    .line 60
    .line 61
    const-wide/16 v13, 0x0

    .line 62
    .line 63
    const/4 v15, 0x6

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const-wide/16 v18, 0x0

    .line 69
    .line 70
    const-wide/16 v20, 0x0

    .line 71
    .line 72
    const-wide/16 v22, 0x0

    .line 73
    .line 74
    const/16 v24, 0x0

    .line 75
    .line 76
    const/16 v25, 0x0

    .line 77
    .line 78
    const/16 v26, 0x0

    .line 79
    .line 80
    invoke-direct/range {v12 .. v28}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;-><init>(JIIIJJJLjava/lang/String;IIILkotlin/jvm/internal/e;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setCreateDate(J)V

    .line 88
    .line 89
    .line 90
    const-wide/16 v2, 0x0

    .line 91
    .line 92
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDuration(J)V

    .line 93
    .line 94
    .line 95
    iget-object v4, v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setWidth(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setHeight(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDefaultBackgroundColor(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getMoveConfig()Lio/objectbox/relation/ToOne;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->put()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-static {v7}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->put()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getAuthor()Lio/objectbox/relation/ToOne;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getAuthor()Lcom/zykj/blackboard/bean/Author;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    const/4 v7, 0x0

    .line 192
    if-eqz v4, :cond_0

    .line 193
    .line 194
    invoke-static {v4}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEntity(Lcom/zykj/blackboard/bean/Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    if-eqz v4, :cond_0

    .line 199
    .line 200
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->put()V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_0
    move-object v4, v7

    .line 205
    :goto_0
    invoke-virtual {v6, v4}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getPage()Lio/objectbox/relation/ToOne;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-virtual {v4, v6}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v12}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 234
    .line 235
    const/4 v6, 0x1

    .line 236
    invoke-direct {v4, v2, v3, v6, v7}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(JILkotlin/jvm/internal/e;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getPage()Lio/objectbox/relation/ToOne;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->put()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v4}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getBlackBoardEntity()Lio/objectbox/relation/ToOne;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    move-object/from16 v2, p1

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 274
    .line 275
    .line 276
    new-instance v1, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v2, "]:\u521b\u5efa\u5b8c\u6210,id:"

    .line 285
    .line 286
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getId()J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
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
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

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
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v1, v2}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->createPageEntity(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "BasePageControl:initPageEntity ["

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, "] \u6ca1\u627e\u5230boardEntity:"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "empty boardEntity: "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0
.end method

.method private static final release$lambda-23(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-virtual {v1, p0}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->put()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method private static final show$lambda-34(Lcom/zykj/blackboard/core/edit/BasePageControl;Lr6/a;)V
    .locals 10

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "\u9875\u9762BasePageControl=>show():\u5f00\u59cb\u52a0\u8f7d\u753b\u677f----["

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "]:show -> start}"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->setCacheAble(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw(Z)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 54
    .line 55
    new-instance v3, Ljava/io/File;

    .line 56
    .line 57
    new-instance v4, Ljava/io/File;

    .line 58
    .line 59
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 60
    .line 61
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v5, "snapshot.bin"

    .line 73
    .line 74
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "File(\n                  \u2026           ).absolutePath"

    .line 82
    .line 83
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Lcom/zykj/blackboard/utils/GraphUtils;->snapshotGraphToGraph(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v4, "\u9875\u9762BasePageControl["

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getGraphSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v5}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-lez v5, :cond_0

    .line 103
    .line 104
    move v5, v1

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move v5, v2

    .line 107
    :goto_0
    xor-int/lit8 v6, v5, 0x1

    .line 108
    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getCameraMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    const/4 v7, 0x0

    .line 120
    cmpg-float v5, v5, v7

    .line 121
    .line 122
    if-nez v5, :cond_1

    .line 123
    .line 124
    move v5, v1

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    move v5, v2

    .line 127
    :goto_1
    if-eqz v5, :cond_2

    .line 128
    .line 129
    new-instance v7, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v8, "]:show -> \u76f8\u673a\u77e9\u9635\u5f02\u5e38}"

    .line 142
    .line 143
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v7}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 158
    .line 159
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/edit/BoardControl;->getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    if-eqz v7, :cond_2

    .line 164
    .line 165
    new-instance v8, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-object v9, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 171
    .line 172
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v9, ": \u76f8\u673a\u77e9\u9635\u5f02\u5e38"

    .line 180
    .line 181
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-interface {v7, v8}, Lcom/zykj/blackboard/listener/ErrorListener;->reportError(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_2
    if-nez v5, :cond_4

    .line 192
    .line 193
    move v5, v1

    .line 194
    goto :goto_2

    .line 195
    :cond_3
    move v6, v2

    .line 196
    :cond_4
    move v5, v2

    .line 197
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v8, " \u9875\u9762BasePageControl=>show():\u5f53\u65f6\u662f\u5426\u5b58\u5728\u5feb\u7167"

    .line 200
    .line 201
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {v7}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const-string v7, "info"

    .line 219
    .line 220
    const/4 v8, 0x6

    .line 221
    if-eqz v5, :cond_9

    .line 222
    .line 223
    new-instance v5, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    const-string v4, "]:show -> \u4ece\u5feb\u7167\u8fdb\u884c\u52a0\u8f7d}"

    .line 236
    .line 237
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-static {v4}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 252
    .line 253
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getCameraMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    const-string v6, "localGraphSnapshot!!.cameraMatrix"

    .line 261
    .line 262
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v5}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v4, v5}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 270
    .line 271
    .line 272
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getGraphSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    const-string v5, "localGraphSnapshot.graphSnapshot"

    .line 279
    .line 280
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v4, v3}, Lcom/zykj/blackboard/utils/GraphUtils;->buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_5

    .line 288
    .line 289
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 290
    .line 291
    invoke-virtual {v3, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 292
    .line 293
    .line 294
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_d

    .line 303
    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    const-string v3, "\u9875\u9762BasePageControl ["

    .line 307
    .line 308
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v3, "]:show -> \u5b58\u5728\u672a\u4fdd\u5b58\u6570\u636e\u5e93\u6570\u636e\uff0c\u7ee7\u7eed\u4ece\u6570\u636e\u5e93\u52a0\u8f7d}"

    .line 319
    .line 320
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    sget-object v0, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 335
    .line 336
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 337
    .line 338
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 339
    .line 340
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 341
    .line 342
    invoke-virtual {v0, v8, v3, v4, v5}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 359
    .line 360
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    move v4, v2

    .line 369
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_d

    .line 374
    .line 375
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 380
    .line 381
    if-eqz v4, :cond_7

    .line 382
    .line 383
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-eqz v6, :cond_6

    .line 396
    .line 397
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 402
    .line 403
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v6}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_7
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandFileName()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-eqz v6, :cond_6

    .line 427
    .line 428
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandIndex()I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-static {v6}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    .line 441
    .line 442
    .line 443
    move-result v6

    .line 444
    if-gt v4, v6, :cond_8

    .line 445
    .line 446
    :goto_5
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-virtual {v8, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    const-string v9, "it.commandInfoEntity[i]"

    .line 455
    .line 456
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 460
    .line 461
    invoke-virtual {v0, v8}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 462
    .line 463
    .line 464
    if-eq v4, v6, :cond_8

    .line 465
    .line 466
    add-int/lit8 v4, v4, 0x1

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_8
    move v4, v1

    .line 470
    goto :goto_3

    .line 471
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    const-string v3, "]:show -> \u4ece\u547d\u4ee4\u884c\u52a0\u8f7d}"

    .line 484
    .line 485
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    sget-object v0, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 500
    .line 501
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 502
    .line 503
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 504
    .line 505
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 506
    .line 507
    invoke-virtual {v0, v8, v3, v4, v5}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 524
    .line 525
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    if-eqz v4, :cond_b

    .line 538
    .line 539
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 544
    .line 545
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    if-eqz v5, :cond_a

    .line 558
    .line 559
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 564
    .line 565
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, v5}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 569
    .line 570
    .line 571
    goto :goto_6

    .line 572
    :cond_b
    if-eqz v6, :cond_d

    .line 573
    .line 574
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 575
    .line 576
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-eqz v0, :cond_c

    .line 581
    .line 582
    invoke-interface {v0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    if-eqz v0, :cond_c

    .line 587
    .line 588
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    goto :goto_7

    .line 593
    :cond_c
    move v0, v2

    .line 594
    :goto_7
    if-lez v0, :cond_d

    .line 595
    .line 596
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 597
    .line 598
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    if-eqz v0, :cond_d

    .line 603
    .line 604
    new-instance v3, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 607
    .line 608
    .line 609
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 610
    .line 611
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v4, ": \u5feb\u7167\u5f02\u5e38"

    .line 619
    .line 620
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    invoke-interface {v0, v3}, Lcom/zykj/blackboard/listener/ErrorListener;->reportError(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 631
    .line 632
    const-string v3, "\u9875\u9762BasePageControl.kt -> ["

    .line 633
    .line 634
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v3, "]:show -> \u521d\u59cb\u5316\u5b8c\u6bd5, g:"

    .line 645
    .line 646
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 650
    .line 651
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    if-eqz v3, :cond_e

    .line 656
    .line 657
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    if-eqz v3, :cond_e

    .line 662
    .line 663
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    goto :goto_8

    .line 672
    :cond_e
    const/4 v3, 0x0

    .line 673
    :goto_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 688
    .line 689
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->isDraw(Z)V

    .line 690
    .line 691
    .line 692
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 693
    .line 694
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 695
    .line 696
    .line 697
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 698
    .line 699
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundMatrix()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->saveSnapshot()V

    .line 703
    .line 704
    .line 705
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 706
    .line 707
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->setCacheAble(Z)V

    .line 708
    .line 709
    .line 710
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 711
    .line 712
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/loader/LocalSourceLoader;->cleanCache()V

    .line 713
    .line 714
    .line 715
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    new-instance p1, Ljava/lang/StringBuilder;

    .line 719
    .line 720
    const-string v0, "\u9875\u9762BasePageControl.kt-> ["

    .line 721
    .line 722
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const-string p0, "]:show -> end}"

    .line 733
    .line 734
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object p0

    .line 745
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
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
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

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
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getDuration()J

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->newBuilder()Lcom/zykj/board/d;

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
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iput-object v0, v3, Lcom/zykj/board/d;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iget v0, v3, Lcom/zykj/board/d;->a:I

    .line 118
    .line 119
    or-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    iput v0, v3, Lcom/zykj/board/d;->a:I

    .line 122
    .line 123
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v1, v2}, Lcom/zykj/board/d;->i(J)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/zykj/board/d;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v3, "builder.build().toByteArray()"

    .line 138
    .line 139
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setData([B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v1, v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setDuration(J)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->put()V

    .line 149
    .line 150
    .line 151
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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAudioControl()Lcom/zykj/blackboard/core/edit/AudioControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->audioControl:Lcom/zykj/blackboard/core/edit/AudioControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHistoryControl()Lcom/zykj/blackboard/core/edit/HistoryControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->historyControl:Lcom/zykj/blackboard/core/edit/HistoryControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->noRecordingImageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getPagePath()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->recordingImageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->routerRecord:Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourceLoad()Lcom/zykj/blackboard/core/loader/LocalSourceLoader;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->sourceLoad:Lcom/zykj/blackboard/core/loader/LocalSourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->newBuilder()Lcom/zykj/board/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/board/b0;->k(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

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
    invoke-virtual {v1, v0}, Lcom/zykj/board/b0;->j(Lcom/zykj/board/EzyMatrix$Matrix;)V

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
    const-string v3, "snapshot.bin"

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/zykj/board/b0;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v2, v3, v1}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createPageSnapshotFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setChange(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, ""

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandFileName(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/4 v1, -0x1

    .line 78
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandIndex(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPageEntity()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 86
    .line 87
    .line 88
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final init(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 4
    .param p1    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "pageEntity.recordEntity.target"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, La8/a;

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getModeFactory()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p0, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->removeEventListener(Lcom/zykj/blackboard/listener/EventListener;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 28
    .line 29
    .line 30
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
    .param p1    # Lcom/zykj/blackboard/core/action/ActionManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/core/data/dao/PageEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 7
    .line 8
    return-void
.end method

.method public show(Lr6/a;)V
    .locals 3
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Landroidx/camera/core/impl/utils/a;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-direct {v1, v2, p0, p1}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
