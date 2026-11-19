.class public final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;
.super Lcom/zykj/blackboard/core/record/DataRecorder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 ~2\u00020\u0001:\u0001~B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JG\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0017JO\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u000f\u0010\u001fJ=\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\"\u0010#JK\u0010\'\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020 2\u0006\u0010$\u001a\u00020\u001a2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\'\u0010(Jg\u00100\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00082\u0008\u0010*\u001a\u0004\u0018\u00010\n2\u0008\u0010!\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00112\u0008\u0010.\u001a\u0004\u0018\u00010-2\u0008\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u00080\u00101J3\u00106\u001a\u0004\u0018\u00010\u000e2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u0002020\u00112\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020-042\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u00086\u00107J5\u0010:\u001a\u0004\u0018\u00010\u000e2\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020-2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020-042\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008:\u0010;J%\u0010<\u001a\u00020\u000e2\u0006\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020-2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008<\u0010=J5\u0010C\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008C\u0010DJ#\u0010E\u001a\u00020\u000e2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u0002020\u00112\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008E\u0010FJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020\u000c\u00a2\u0006\u0004\u0008I\u0010JJ-\u0010K\u001a\u0004\u0018\u00010\u000e2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008K\u0010LJ%\u0010P\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008P\u0010QJ\u0015\u0010T\u001a\u00020H2\u0006\u0010S\u001a\u00020R\u00a2\u0006\u0004\u0008T\u0010UJ\u0015\u0010X\u001a\u00020H2\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008X\u0010YJ\u0015\u0010Z\u001a\u00020H2\u0006\u0010W\u001a\u00020V\u00a2\u0006\u0004\u0008Z\u0010YJ\u0017\u0010\\\u001a\u00020H2\u0006\u0010[\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u000f\u0010^\u001a\u00020HH\u0002\u00a2\u0006\u0004\u0008^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0002\u00a2\u0006\u0004\u0008a\u0010bJ\u0011\u0010c\u001a\u0004\u0018\u00010`H\u0002\u00a2\u0006\u0004\u0008c\u0010bJ\u0017\u0010d\u001a\u00020H2\u0006\u0010[\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008d\u0010]R\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008f\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u001a\u0010q\u001a\u0008\u0012\u0004\u0012\u00020V048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0011\u0010|\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008|\u0010}\u00a8\u0006\u007f"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;",
        "Lcom/zykj/blackboard/core/record/DataRecorder;",
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "timeRecord",
        "<init>",
        "(Lcom/zykj/blackboard/core/record/TimeRecord;)V",
        "",
        "parentGraphId",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "Lcom/zykj/board/EzyRectF$RectF;",
        "rectF",
        "",
        "currentTime",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "addCommand",
        "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "eventList",
        "Lcom/zykj/board/EzyPaint$Paint;",
        "paint",
        "graphId",
        "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "fileName",
        "validate",
        "",
        "width",
        "height",
        "",
        "imageBackground",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "",
        "content",
        "addTextGraphCommand",
        "(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "geometryType",
        "Landroid/graphics/PointF;",
        "pointList",
        "addGeometryGraphCommand",
        "(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "graphEnum",
        "originRectF",
        "Lcom/zykj/board/EzyPointF$PointF;",
        "points",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "renderMatrix",
        "filePath",
        "changeGraph",
        "(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
        "graphIdList",
        "",
        "matrixList",
        "addGraphMatrix",
        "(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "originMatrix",
        "lastMatrix",
        "addCameraMatrix",
        "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "addCamera",
        "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "originBackgroundColor",
        "lastBackgroundColor",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "originBackgroundLineConfig",
        "lastBackgroundLineConfig",
        "addConfigCommand",
        "(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "removeGraphList",
        "(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "delayTime",
        "Ld6/s;",
        "stopRecord",
        "(J)V",
        "moveCursor",
        "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "rootGraph",
        "backgroundColor",
        "rebuild",
        "(Lcom/zykj/blackboard/core/graph/Graph;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "recordEntity",
        "setRecord",
        "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V",
        "Lcom/zykj/blackboard/listener/EventListener;",
        "listener",
        "registerEventListener",
        "(Lcom/zykj/blackboard/listener/EventListener;)V",
        "unRegisterEventListener",
        "entity",
        "updateEntity",
        "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V",
        "checkLength",
        "()V",
        "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
        "initRecordEntity",
        "()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
        "buildRecordEntity",
        "notifyEvent",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
        "commandRecordEntity",
        "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;",
        "touchSourceRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;",
        "matrixSourceRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;",
        "fileSourceRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;",
        "eventListenerList",
        "Ljava/util/List;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;",
        "textSourceRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;",
        "Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;",
        "geometrySourceRecord",
        "Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;",
        "Ljava/util/concurrent/ThreadPoolExecutor;",
        "service",
        "Ljava/util/concurrent/ThreadPoolExecutor;",
        "isExecutorsTaskDone",
        "()Z",
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
.field public static final Companion:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final SOURCE_FILE_NAME_SUFFIX:Ljava/lang/String; = "_command.bin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final eventListenerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/listener/EventListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fileSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final geometrySourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final service:Ljava/util/concurrent/ThreadPoolExecutor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final textSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final touchSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Companion:Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/record/TimeRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "timeRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/record/DataRecorder;-><init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->touchSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;

    .line 15
    .line 16
    new-instance p1, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    .line 17
    .line 18
    invoke-direct {p1}, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->matrixSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    .line 22
    .line 23
    new-instance p1, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->fileSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->eventListenerList:Ljava/util/List;

    .line 36
    .line 37
    new-instance p1, Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;

    .line 38
    .line 39
    invoke-direct {p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->textSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;

    .line 43
    .line 44
    new-instance p1, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;

    .line 45
    .line 46
    invoke-direct {p1}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->geometrySourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 63
    .line 64
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGeometryGraphCommand$lambda-9(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFileSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->fileSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getGeometrySourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->geometrySourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getMatrixSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->matrixSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTextSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->textSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTouchSourceRecord$p(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->touchSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final addCamera$lambda-17(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$originMatrix"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastMatrix"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-wide v2, p1

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    :goto_0
    move-wide v1, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 36
    .line 37
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCamera$1$1;

    .line 38
    .line 39
    invoke-direct {v6, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCamera$1$1;-><init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 40
    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method private static final addCameraMatrix$lambda-15(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$matrixList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastMatrix"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$originMatrix"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    const-wide/16 v0, 0x0

    .line 35
    .line 36
    :goto_0
    move-wide v5, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {p0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    sub-long/2addr v0, v2

    .line 59
    goto :goto_0

    .line 60
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lcom/zykj/blackboard/core/record/DataRecorder;->getStartEventTime(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CAMERA_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 65
    .line 66
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;

    .line 67
    .line 68
    invoke-direct {v8, p4, p5, p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCameraMatrix$1$1;-><init>(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    move-object v2, p1

    .line 72
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_1
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static synthetic addCommand$default(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;JILjava/lang/Object;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p5

    invoke-virtual {p5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p5

    const-string v0, "randomUUID().toString()"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide v7, p6

    .line 2
    invoke-virtual/range {v1 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addCommand$default(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZILjava/lang/Object;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v10, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    goto :goto_1

    :cond_0
    move/from16 v10, p9

    goto :goto_0

    .line 3
    :goto_1
    invoke-virtual/range {v1 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final addCommand$lambda-1(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$rectF"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$parentGraphId"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;

    .line 43
    .line 44
    invoke-direct {v6, p3, p4, p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$1$1;-><init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v3, 0x0

    .line 48
    .line 49
    move-object v0, p0

    .line 50
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method private static final addCommand$lambda-3(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "$eventList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphId"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$graphType"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$parentGraphId"

    .line 22
    .line 23
    move-object/from16 v5, p6

    .line 24
    .line 25
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "$paint"

    .line 29
    .line 30
    move-object/from16 v7, p7

    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x1

    .line 46
    if-ne v0, v1, :cond_0

    .line 47
    .line 48
    const-wide/16 v0, 0x0

    .line 49
    .line 50
    :goto_0
    move-wide v8, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-static {p0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    sub-long/2addr v0, v8

    .line 73
    goto :goto_0

    .line 74
    :goto_1
    invoke-virtual {p1, v8, v9, p2, p3}, Lcom/zykj/blackboard/core/record/DataRecorder;->getStartEventTime(JJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide p2

    .line 78
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 79
    .line 80
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;

    .line 81
    .line 82
    move-object v4, p0

    .line 83
    move-object v6, p1

    .line 84
    move-object v2, p4

    .line 85
    move-object v3, p5

    .line 86
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$2$1;-><init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Ljava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 87
    .line 88
    .line 89
    move-wide v3, p2

    .line 90
    move-object v7, v0

    .line 91
    move-object v2, v6

    .line 92
    move-wide v5, v8

    .line 93
    move-object v8, v1

    .line 94
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-direct {p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_1
    const/4 p0, 0x0

    .line 103
    return-object p0
.end method

.method private static final addCommand$lambda-5(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 14

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphType"

    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "$parentGraphId"

    .line 14
    .line 15
    move-object/from16 v4, p6

    .line 16
    .line 17
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "$fileName"

    .line 21
    .line 22
    move-object/from16 v6, p7

    .line 23
    .line 24
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "$validate"

    .line 28
    .line 29
    move-object/from16 v7, p8

    .line 30
    .line 31
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    const/4 v12, 0x2

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    move-wide v9, p1

    .line 44
    invoke-static/range {v8 .. v13}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    :goto_0
    move-wide v9, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget-object v11, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 54
    .line 55
    new-instance v0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;

    .line 56
    .line 57
    move-object v5, p0

    .line 58
    move/from16 v2, p4

    .line 59
    .line 60
    move/from16 v3, p5

    .line 61
    .line 62
    move/from16 v8, p9

    .line 63
    .line 64
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addCommand$3$1;-><init>(Lcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v1, 0x0

    .line 68
    .line 69
    move-object p1, p0

    .line 70
    move-object/from16 p7, v0

    .line 71
    .line 72
    move-wide/from16 p4, v1

    .line 73
    .line 74
    move-wide/from16 p2, v9

    .line 75
    .line 76
    move-object/from16 p6, v11

    .line 77
    .line 78
    invoke-virtual/range {p1 .. p7}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method private static final addConfigCommand$lambda-19(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$originBackgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$lastBackgroundLineConfig"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-wide v2, p1

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    :goto_0
    move-wide v1, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const-wide/16 p1, 0x0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CONFIG:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 36
    .line 37
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;

    .line 38
    .line 39
    invoke-direct {v6, p3, p4, p5, p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;-><init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 40
    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    move-object v0, p0

    .line 45
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method private static final addGeometryGraphCommand$lambda-9(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$parentGraphId"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$pointList"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$paint"

    .line 17
    .line 18
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;

    .line 43
    .line 44
    move p1, p3

    .line 45
    move p2, p4

    .line 46
    move-object p3, p5

    .line 47
    move p5, p6

    .line 48
    move-object p6, p7

    .line 49
    move-object p7, p8

    .line 50
    move-object p4, p0

    .line 51
    move-object p0, v6

    .line 52
    invoke-direct/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGeometryGraphCommand$1$1;-><init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0x0

    .line 56
    .line 57
    move-object v0, p4

    .line 58
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {p4, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method private static final addGraphMatrix$lambda-13(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$matrixList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphIdList"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :goto_0
    move-wide v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {p0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    sub-long/2addr v0, v2

    .line 54
    goto :goto_0

    .line 55
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lcom/zykj/blackboard/core/record/DataRecorder;->getStartEventTime(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_MATRIX:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 60
    .line 61
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;

    .line 62
    .line 63
    invoke-direct {v8, p4, p1, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addGraphMatrix$1$1;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method private static final addTextGraphCommand$lambda-7(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$parentGraphId"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$content"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$paint"

    .line 17
    .line 18
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    move-wide v2, p1

    .line 31
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    :goto_0
    move-wide v1, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_ADD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;

    .line 43
    .line 44
    move p1, p3

    .line 45
    move p2, p4

    .line 46
    move-object p3, p5

    .line 47
    move-object p5, p6

    .line 48
    move-object p6, p7

    .line 49
    move-object p4, p0

    .line 50
    move-object p0, v6

    .line 51
    invoke-direct/range {p0 .. p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addTextGraphCommand$1$1;-><init>(FFLjava/lang/String;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    move-object v0, p4

    .line 57
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-direct {p4, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 62
    .line 63
    .line 64
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand$lambda-1(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private final buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, "_command.bin"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, ""

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->put()V

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_0
    const/4 v0, 0x0

    .line 47
    return-object v0
.end method

.method public static synthetic c(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->moveCursor$lambda-25(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final changeGraph$lambda-11(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphId"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$graphEnum"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    move-wide v5, p1

    .line 26
    invoke-static/range {v4 .. v9}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-wide/16 p1, 0x0

    .line 32
    .line 33
    :goto_0
    sget-object v0, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_CHANGE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 34
    .line 35
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;

    .line 36
    .line 37
    move-object v2, p3

    .line 38
    move-object v3, p4

    .line 39
    move-object v4, p5

    .line 40
    move-object/from16 v5, p6

    .line 41
    .line 42
    move-object/from16 v6, p7

    .line 43
    .line 44
    move-object/from16 v7, p8

    .line 45
    .line 46
    move-object/from16 v8, p9

    .line 47
    .line 48
    move-object/from16 v9, p10

    .line 49
    .line 50
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$changeGraph$1$1;-><init>(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    move-object p3, p0

    .line 56
    move-wide p4, p1

    .line 57
    move-object/from16 p8, v0

    .line 58
    .line 59
    move-object/from16 p9, v1

    .line 60
    .line 61
    move-wide/from16 p6, v2

    .line 62
    .line 63
    invoke-virtual/range {p3 .. p9}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method private final declared-synchronized checkLength()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0x64

    .line 27
    .line 28
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    :cond_1
    :goto_0
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0
.end method

.method public static synthetic d(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addGraphMatrix$lambda-13(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand$lambda-5(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->stopRecord$lambda-23(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addConfigCommand$lambda-19(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->changeGraph$lambda-11(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCamera$lambda-17(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private final initRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lio/objectbox/relation/ToMany;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/16 v2, 0x64

    .line 28
    .line 29
    if-ge v1, v2, :cond_0

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->buildRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method public static synthetic j(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->removeGraphList$lambda-21(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->rebuild$lambda-27(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCommand$lambda-3(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addTextGraphCommand$lambda-7(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final moveCursor$lambda-25(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9

    .line 1
    const-string v0, "$eventList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$paint"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    :goto_0
    move-wide v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {p0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    sub-long/2addr v0, v2

    .line 54
    goto :goto_0

    .line 55
    :goto_1
    invoke-virtual {p1, v5, v6, p2, p3}, Lcom/zykj/blackboard/core/record/DataRecorder;->getStartEventTime(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    sget-object v7, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_CURSOR_MOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 60
    .line 61
    new-instance v8, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;

    .line 62
    .line 63
    invoke-direct {v8, p1, p0, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$moveCursor$1$1;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 64
    .line 65
    .line 66
    move-object v2, p1

    .line 67
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method public static synthetic n(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addCameraMatrix$lambda-15(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    move-result-object p0

    return-object p0
.end method

.method private final notifyEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->eventListenerList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/blackboard/listener/EventListener;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/listener/EventListener;->onEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method private static final rebuild$lambda-27(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$rootGraph"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-wide v2, p1

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    move-wide v1, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_REBUILD:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 31
    .line 32
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;

    .line 33
    .line 34
    invoke-direct {v6, p3, p4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$rebuild$1$1;-><init>(Lcom/zykj/blackboard/core/graph/Graph;I)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method private static final removeGraphList$lambda-21(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$graphIdList"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/DataRecorder;->getTimeRecord()Lcom/zykj/blackboard/core/record/TimeRecord;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-wide v2, p1

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;->getDelayTime$default(Lcom/zykj/blackboard/core/record/ITimeRecord;JZILjava/lang/Object;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    :goto_0
    move-wide v1, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    sget-object v5, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_GRAPH_REMOVE:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 31
    .line 32
    new-instance v6, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;

    .line 33
    .line 34
    invoke-direct {v6, p3}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$removeGraphList$1$1;-><init>(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/record/DataRecorder;->buildCommandInfoEntity(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lr6/a;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

.method private static final stopRecord$lambda-23(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 7
    .line 8
    sget-object v9, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_RECORD_STOP:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/protobuf/Any;->newBuilder()Lcom/google/protobuf/Any$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 19
    .line 20
    .line 21
    move-result-object v10

    .line 22
    const-string v0, "newBuilder().build().toByteArray()"

    .line 23
    .line 24
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    move-wide v4, p0

    .line 33
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p2, v1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method private final updateEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lio/objectbox/relation/ToOne;->setTarget(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->put()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->put()V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "CommandRecord:updateEntity -> "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->checkLength()V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->notifyEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final addCamera(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/g;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move-object v5, p1

    .line 17
    move-object v6, p2

    .line 18
    move-wide v3, p3

    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/g;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 36
    .line 37
    return-object p1
.end method

.method public final addCameraMatrix(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    const-string v0, "matrixList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/d;

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    move-object v7, p1

    .line 22
    move-object v6, p2

    .line 23
    move-object v2, p3

    .line 24
    move-wide v4, p4

    .line 25
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/d;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 37
    .line 38
    return-object p1
.end method

.method public final addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyRectF$RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parentGraphId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rectF"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/d;

    move-object v2, p0

    move-object v7, p1

    move-object v5, p2

    move-object v6, p3

    move-wide v3, p4

    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/d;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    return-object p1
.end method

.method public final addCommand(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "Ljava/lang/String;",
            "J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "parentGraphId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paint"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/c;

    move-object v3, p0

    move-object v8, p1

    move-object v7, p2

    move-object v2, p3

    move-object v9, p4

    move-object v6, p5

    move-wide/from16 v4, p6

    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/c;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 4
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    return-object p1
.end method

.method public final addCommand(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parentGraphId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validate"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/b;

    move-object v2, p0

    move-object v8, p1

    move-object v9, p2

    move-object v5, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v3, p7

    move/from16 v11, p9

    invoke-direct/range {v1 .. v11}, Lcom/zykj/blackboard/core/record/dataRecorder/b;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/board/EzyGraphEnum$GraphEnum;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 6
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    return-object p1
.end method

.method public final addConfigCommand(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 9
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "originBackgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastBackgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/f;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move v5, p1

    .line 17
    move v6, p2

    .line 18
    move-object v7, p3

    .line 19
    move-object v8, p4

    .line 20
    move-wide v3, p5

    .line 21
    invoke-direct/range {v1 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/f;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 38
    .line 39
    return-object p1
.end method

.method public final addGeometryGraphCommand(Ljava/lang/String;FFILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "FFI",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pointList"

    .line 7
    .line 8
    move-object/from16 v9, p5

    .line 9
    .line 10
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "paint"

    .line 14
    .line 15
    move-object/from16 v10, p6

    .line 16
    .line 17
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 21
    .line 22
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/e;

    .line 23
    .line 24
    move-object v2, p0

    .line 25
    move-object v7, p1

    .line 26
    move v5, p2

    .line 27
    move v6, p3

    .line 28
    move v8, p4

    .line 29
    move-wide/from16 v3, p7

    .line 30
    .line 31
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/e;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;ILjava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 43
    .line 44
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 48
    .line 49
    return-object p1
.end method

.method public final addGraphMatrix(Ljava/util/List;Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/g;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v3, p0

    .line 17
    move-object v6, p1

    .line 18
    move-object v2, p2

    .line 19
    move-wide v4, p3

    .line 20
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/g;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 32
    .line 33
    return-object p1
.end method

.method public final addTextGraphCommand(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "parentGraphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "content"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/h;

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    move-object v7, p1

    .line 22
    move v5, p2

    .line 23
    move v6, p3

    .line 24
    move-object v9, p4

    .line 25
    move-object v8, p5

    .line 26
    move-wide/from16 v3, p6

    .line 27
    .line 28
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/h;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JFFLjava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 45
    .line 46
    return-object p1
.end method

.method public final changeGraph(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyRectF$RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Lcom/zykj/board/EzyRectF$RectF;",
            "Ljava/lang/String;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyPointF$PointF;",
            ">;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Ljava/lang/String;",
            "J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphEnum"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/j;

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    move-object v5, p1

    .line 17
    move-object v6, p2

    .line 18
    move-object/from16 v7, p3

    .line 19
    .line 20
    move-object/from16 v8, p4

    .line 21
    .line 22
    move-object/from16 v9, p5

    .line 23
    .line 24
    move-object/from16 v10, p6

    .line 25
    .line 26
    move-object/from16 v11, p7

    .line 27
    .line 28
    move-object/from16 v12, p8

    .line 29
    .line 30
    move-wide/from16 v3, p9

    .line 31
    .line 32
    invoke-direct/range {v1 .. v12}, Lcom/zykj/blackboard/core/record/dataRecorder/j;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;Ljava/util/List;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 44
    .line 45
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 49
    .line 50
    return-object p1
.end method

.method public final isExecutorsTaskDone()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getCompletedTaskCount()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "eventList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/g;

    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    move-object v3, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v6, p2

    .line 19
    move-wide v4, p3

    .line 20
    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/record/dataRecorder/g;-><init>(Ljava/util/List;Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 32
    .line 33
    return-object p1
.end method

.method public final rebuild(Lcom/zykj/blackboard/core/graph/Graph;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 7
    .param p1    # Lcom/zykj/blackboard/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/i;

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    move-object v5, p1

    .line 12
    move v6, p2

    .line 13
    move-wide v3, p3

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/i;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLcom/zykj/blackboard/core/graph/Graph;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 31
    .line 32
    return-object p1
.end method

.method public final registerEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/EventListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->eventListenerList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final removeGraphList(Ljava/util/List;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;J)",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 7
    .line 8
    new-instance v1, Landroidx/camera/core/impl/utils/futures/f;

    .line 9
    .line 10
    invoke-direct {v1, p0, p2, p3, p1}, Landroidx/camera/core/impl/utils/futures/f;-><init>(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JLjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "service.submit<CommandIn\u2026        }\n        }.get()"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 27
    .line 28
    return-object p1
.end method

.method public final setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/data/dao/RecordEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "recordEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->recordEntity:Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->touchSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->matrixSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->fileSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->textSourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->geometrySourceRecord:Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord;->setRecord(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->initRecordEntity()Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->commandRecordEntity:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 38
    .line 39
    return-void
.end method

.method public final stopRecord(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->service:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/blackboard/core/record/dataRecorder/a;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p0}, Lcom/zykj/blackboard/core/record/dataRecorder/a;-><init>(JLcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final unRegisterEventListener(Lcom/zykj/blackboard/listener/EventListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/EventListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->eventListenerList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
