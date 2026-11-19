.class public abstract Lcom/zykj/blackboard/core/action/BaseWriteAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 P2\u00020\u0001:\u0001PB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u000f\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0008J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0008J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0008J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0008R \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\"\u00100\u001a\u00020/8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\"\u00106\u001a\u00020/8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00101\u001a\u0004\u00087\u00103\"\u0004\u00088\u00105R\"\u00109\u001a\u00020/8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00089\u00101\u001a\u0004\u0008:\u00103\"\u0004\u0008;\u00105R\"\u0010<\u001a\u00020/8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u00101\u001a\u0004\u0008=\u00103\"\u0004\u0008>\u00105R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010AR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\"\u0010H\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010G\u001a\u0004\u0008H\u0010\u001a\"\u0004\u0008I\u0010JR\u0016\u0010K\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010GR\u001c\u0010N\u001a\n M*\u0004\u0018\u00010L0L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010O\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/BaseWriteAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "Ld6/s;",
        "handleTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "handleTouchMove",
        "handleTouchUp",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "getGraphEnum",
        "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "",
        "graphId",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "buildSimpleGraph",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;",
        "initPaint",
        "reset",
        "singleTouchDown",
        "singleTouchMove",
        "singleTouchUp",
        "",
        "executorsTaskDone",
        "()Z",
        "singleTouchCancel",
        "",
        "eventList",
        "Ljava/util/List;",
        "getEventList",
        "()Ljava/util/List;",
        "Landroid/graphics/Path;",
        "tempPath",
        "Landroid/graphics/Path;",
        "getTempPath",
        "()Landroid/graphics/Path;",
        "setTempPath",
        "(Landroid/graphics/Path;)V",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "getPaint",
        "()Landroid/graphics/Paint;",
        "setPaint",
        "(Landroid/graphics/Paint;)V",
        "",
        "paintItemLength",
        "F",
        "getPaintItemLength",
        "()F",
        "setPaintItemLength",
        "(F)V",
        "paintSpacing",
        "getPaintSpacing",
        "setPaintSpacing",
        "mFirstX",
        "getMFirstX",
        "setMFirstX",
        "mFirstY",
        "getMFirstY",
        "setMFirstY",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "groupGraph",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "lastGroupGraph",
        "",
        "lastWriteUpTime",
        "J",
        "isCreateNewGroup",
        "Z",
        "isForceNeedNewGroup",
        "setForceNeedNewGroup",
        "(Z)V",
        "isSingleHandling",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "service",
        "Ljava/util/concurrent/ExecutorService;",
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
.field public static final Companion:Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INTERVAL_TIME:I = 0x1388

.field private static final sharedService:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final eventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isCreateNewGroup:Z

.field private isForceNeedNewGroup:Z

.field private isSingleHandling:Z

.field private lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastWriteUpTime:J

.field private mFirstX:F

.field private mFirstY:F

.field private paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private paintItemLength:F

.field private paintSpacing:F

.field private final service:Ljava/util/concurrent/ExecutorService;

.field private tempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Companion:Lcom/zykj/blackboard/core/action/BaseWriteAction$Companion;

    .line 8
    .line 9
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->sharedService:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/high16 v0, 0x41f00000    # 30.0f

    .line 26
    .line 27
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 28
    .line 29
    const/high16 v0, 0x41700000    # 15.0f

    .line 30
    .line 31
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 32
    .line 33
    sget-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->sharedService:Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    return-void
.end method

.method public static final synthetic access$getGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lcom/zykj/blackboard/core/graph/IGraph;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLastWriteUpTime$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastWriteUpTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getService$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setCreateNewGroup$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isCreateNewGroup:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastGroupGraph$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setLastWriteUpTime$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastWriteUpTime:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setSingleHandling$p(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public abstract buildSimpleGraph(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final executorsTaskDone()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->service:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getCompletedTaskCount()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    cmp-long v0, v2, v4

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_2
    const-string v0, "\u9875\u9762BaseWriteAction.kt -> ExecutorCheck\u6ca1\u6709\u5b8c\u6210"

    .line 30
    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v2, Lcom/blankj/utilcode/util/g;->c:Lb0/g;

    .line 36
    .line 37
    invoke-virtual {v2}, Lb0/g;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    const/4 v3, 0x5

    .line 43
    invoke-static {v3, v2, v0}, Lcom/blankj/utilcode/util/g;->f(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return v1
.end method

.method public final getEventList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getMFirstX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMFirstY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPaintItemLength()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 2
    .line 3
    return v0
.end method

.method public final getPaintSpacing()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTempPath()Landroid/graphics/Path;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract handleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract handleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract handleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract initPaint()V
.end method

.method public final isForceNeedNewGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isForceNeedNewGroup:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->eventList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 15
    .line 16
    return-void
.end method

.method public final setForceNeedNewGroup(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isForceNeedNewGroup:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMFirstX(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstX:F

    .line 2
    .line 3
    return-void
.end method

.method public final setMFirstY(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->mFirstY:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPaint(Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Paint;
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paint:Landroid/graphics/Paint;

    .line 7
    .line 8
    return-void
.end method

.method public final setPaintItemLength(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintItemLength:F

    .line 2
    .line 3
    return-void
.end method

.method public final setPaintSpacing(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->paintSpacing:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTempPath(Landroid/graphics/Path;)V
    .locals 1
    .param p1    # Landroid/graphics/Path;
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->tempPath:Landroid/graphics/Path;

    .line 7
    .line 8
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isCreateNewGroup:Z

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-array v3, v2, [Lcom/zykj/blackboard/core/graph/IGraph;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    invoke-static {v3}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-interface {v1, v3, v4, v5}, Lcom/zykj/blackboard/core/action/IActionListener;->deleteGraphEvent(Ljava/util/List;J)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    new-array v2, v2, [Lcom/zykj/blackboard/core/graph/IGraph;

    .line 48
    .line 49
    aput-object p1, v2, v0

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->lastGroupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 59
    .line 60
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->groupGraph:Lcom/zykj/blackboard/core/graph/IGraph;

    .line 61
    .line 62
    :cond_2
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->isSingleHandling:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
