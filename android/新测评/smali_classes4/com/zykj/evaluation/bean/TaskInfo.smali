.class public final Lcom/zykj/evaluation/bean/TaskInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008K\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00df\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\r\u00a2\u0006\u0004\u0008 \u0010!J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\rH\u00c6\u0003J\t\u0010E\u001a\u00020\rH\u00c6\u0003J\t\u0010F\u001a\u00020\u0010H\u00c6\u0003J\t\u0010G\u001a\u00020\rH\u00c6\u0003J\t\u0010H\u001a\u00020\rH\u00c6\u0003J\t\u0010I\u001a\u00020\u0010H\u00c6\u0003J\t\u0010J\u001a\u00020\u0010H\u00c6\u0003J\t\u0010K\u001a\u00020\u0010H\u00c6\u0003J\t\u0010L\u001a\u00020\rH\u00c6\u0003J\t\u0010M\u001a\u00020\rH\u00c6\u0003J\t\u0010N\u001a\u00020\rH\u00c6\u0003J\t\u0010O\u001a\u00020\u0010H\u00c6\u0003J\t\u0010P\u001a\u00020\u0010H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010S\u001a\u00020\u0010H\u00c6\u0003J\t\u0010T\u001a\u00020\u0010H\u00c6\u0003J\t\u0010U\u001a\u00020\rH\u00c6\u0003J\u0093\u0002\u0010V\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0016\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010W\u001a\u00020\r2\u0008\u0010X\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Y\u001a\u00020\u0010H\u00d6\u0001J\t\u0010Z\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010-R\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010-R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00100R\u0011\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00100R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00100R\u0011\u0010\u0016\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010-R\u0011\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010-R\u0011\u0010\u0018\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010-R\u0011\u0010\u0019\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00100R\u0011\u0010\u001a\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00100R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010&R\u0011\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00100R\u0011\u0010\u001e\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00100R\u0011\u0010\u001f\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010-\u00a8\u0006["
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/TaskInfo;",
        "",
        "examTaskId",
        "",
        "topicId",
        "topicName",
        "",
        "examId",
        "examName",
        "creationTime",
        "startTime",
        "endTime",
        "correctWithSelf",
        "",
        "correctOnline",
        "correctOnlineState",
        "",
        "isExempted",
        "isCollect",
        "revisingUrge",
        "answeringUrge",
        "taskState",
        "answerPad",
        "answerSheet",
        "isNoStem",
        "specificTrainingType",
        "size",
        "testPagerId",
        "address",
        "serialNum",
        "examState",
        "isRead",
        "<init>",
        "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)V",
        "getExamTaskId",
        "()J",
        "getTopicId",
        "getTopicName",
        "()Ljava/lang/String;",
        "getExamId",
        "getExamName",
        "getCreationTime",
        "getStartTime",
        "getEndTime",
        "getCorrectWithSelf",
        "()Z",
        "getCorrectOnline",
        "getCorrectOnlineState",
        "()I",
        "getRevisingUrge",
        "getAnsweringUrge",
        "getTaskState",
        "getAnswerPad",
        "getAnswerSheet",
        "getSpecificTrainingType",
        "getSize",
        "getTestPagerId",
        "getAddress",
        "getSerialNum",
        "getExamState",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final address:Ljava/lang/String;

.field private final answerPad:Z

.field private final answerSheet:Z

.field private final answeringUrge:I

.field private final correctOnline:Z

.field private final correctOnlineState:I

.field private final correctWithSelf:Z

.field private final creationTime:Ljava/lang/String;

.field private final endTime:Ljava/lang/String;

.field private final examId:J

.field private final examName:Ljava/lang/String;

.field private final examState:I

.field private final examTaskId:J

.field private final isCollect:Z

.field private final isExempted:Z

.field private final isNoStem:Z

.field private final isRead:Z

.field private final revisingUrge:I

.field private final serialNum:I

.field private final size:I

.field private final specificTrainingType:I

.field private final startTime:Ljava/lang/String;

.field private final taskState:I

.field private final testPagerId:J

.field private final topicId:J

.field private final topicName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)V
    .locals 1

    const-string v0, "topicName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examName"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creationTime"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    .line 3
    iput-wide p3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    .line 4
    iput-object p5, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    .line 5
    iput-wide p6, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    .line 6
    iput-object p8, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    .line 7
    iput-object p9, p0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    .line 8
    iput-object p10, p0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    .line 9
    iput-object p11, p0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    .line 10
    iput-boolean p12, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    .line 11
    iput-boolean p13, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    .line 12
    iput p14, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    move/from16 p1, p15

    .line 13
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    move/from16 p1, p16

    .line 14
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    move/from16 p1, p17

    .line 15
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    move/from16 p1, p18

    .line 16
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    move/from16 p1, p19

    .line 17
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    move/from16 p1, p20

    .line 18
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    move/from16 p1, p21

    .line 19
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    move/from16 p1, p22

    .line 20
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    move/from16 p1, p23

    .line 21
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    move/from16 p1, p24

    .line 22
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    move-wide/from16 p1, p25

    .line 23
    iput-wide p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    move-object/from16 p1, p27

    .line 24
    iput-object p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    move/from16 p1, p28

    .line 25
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    move/from16 p1, p29

    .line 26
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    move/from16 p1, p30

    .line 27
    iput-boolean p1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    const/high16 v0, 0x40000

    and-int v0, p31, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move/from16 v23, v0

    :goto_0
    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v24, p23

    move/from16 v25, p24

    move-wide/from16 v26, p25

    move-object/from16 v28, p27

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    goto :goto_1

    :cond_0
    move/from16 v23, p22

    goto :goto_0

    .line 28
    :goto_1
    invoke-direct/range {v1 .. v31}, Lcom/zykj/evaluation/bean/TaskInfo;-><init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/TaskInfo;JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZILjava/lang/Object;)Lcom/zykj/evaluation/bean/TaskInfo;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p31

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v1, 0x10

    if-eqz v9, :cond_4

    iget-object v9, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v9, p8

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-object v10, v0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v10, p9

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget-object v11, v0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v11, p10

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget-object v12, v0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-boolean v13, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    goto :goto_8

    :cond_8
    move/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-boolean v14, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    goto :goto_9

    :cond_9
    move/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-boolean v2, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    goto :goto_b

    :cond_b
    move/from16 v2, p15

    :goto_b
    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_c

    iget-boolean v3, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    goto :goto_c

    :cond_c
    move/from16 v3, p16

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    goto :goto_d

    :cond_d
    move/from16 v2, p17

    :goto_d
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    goto :goto_e

    :cond_e
    move/from16 v2, p18

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    goto :goto_f

    :cond_f
    move/from16 v1, p19

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p31, v18

    move/from16 p3, v1

    if-eqz v18, :cond_10

    iget-boolean v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p20

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p31, v18

    move/from16 p4, v1

    if-eqz v18, :cond_11

    iget-boolean v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p21

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, p31, v18

    move/from16 p5, v1

    if-eqz v18, :cond_12

    iget-boolean v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p22

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p31, v18

    move/from16 p6, v1

    if-eqz v18, :cond_13

    iget v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    goto :goto_13

    :cond_13
    move/from16 v1, p23

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p31, v18

    move/from16 p7, v1

    if-eqz v18, :cond_14

    iget v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    goto :goto_14

    :cond_14
    move/from16 v1, p24

    :goto_14
    const/high16 v18, 0x200000

    and-int v18, p31, v18

    move/from16 p9, v1

    move/from16 p8, v2

    if-eqz v18, :cond_15

    iget-wide v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    goto :goto_15

    :cond_15
    move-wide/from16 v1, p25

    :goto_15
    const/high16 v18, 0x400000

    and-int v18, p31, v18

    move-wide/from16 p10, v1

    if-eqz v18, :cond_16

    iget-object v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p27

    :goto_16
    const/high16 v2, 0x800000

    and-int v2, p31, v2

    if-eqz v2, :cond_17

    iget v2, v0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    goto :goto_17

    :cond_17
    move/from16 v2, p28

    :goto_17
    const/high16 v18, 0x1000000

    and-int v18, p31, v18

    move-object/from16 p12, v1

    if-eqz v18, :cond_18

    iget v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    goto :goto_18

    :cond_18
    move/from16 v1, p29

    :goto_18
    const/high16 v18, 0x2000000

    and-int v18, p31, v18

    if-eqz v18, :cond_19

    move/from16 p13, v1

    iget-boolean v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    move/from16 p30, p13

    move/from16 p31, v1

    :goto_19
    move/from16 p16, p1

    move/from16 p18, p2

    move/from16 p20, p3

    move/from16 p21, p4

    move/from16 p22, p5

    move/from16 p23, p6

    move/from16 p24, p7

    move/from16 p19, p8

    move/from16 p25, p9

    move-wide/from16 p26, p10

    move-object/from16 p28, p12

    move-object/from16 p1, v0

    move/from16 p29, v2

    move/from16 p17, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-wide/from16 p7, v7

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_1a

    :cond_19
    move/from16 p31, p30

    move/from16 p30, v1

    goto :goto_19

    :goto_1a
    invoke-virtual/range {p1 .. p31}, Lcom/zykj/evaluation/bean/TaskInfo;->copy(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)Lcom/zykj/evaluation/bean/TaskInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    return v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    return-wide v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    return v0
.end method

.method public final component22()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    return-wide v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    return v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    return v0
.end method

.method public final copy(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)Lcom/zykj/evaluation/bean/TaskInfo;
    .locals 32

    const-string v0, "topicName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examName"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creationTime"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/TaskInfo;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move-wide/from16 v26, p25

    move-object/from16 v28, p27

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    invoke-direct/range {v1 .. v31}, Lcom/zykj/evaluation/bean/TaskInfo;-><init>(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZIIIZZZIIJLjava/lang/String;IIZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/TaskInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/TaskInfo;

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    iget-boolean p1, p1, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    if-eq v1, p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final getAddress()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAnswerPad()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getAnswerSheet()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getAnsweringUrge()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCorrectOnline()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCorrectOnlineState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCorrectWithSelf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCreationTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getExamName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExamTaskId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRevisingUrge()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSerialNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSpecificTrainingType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTaskState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTestPagerId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCollect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isExempted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isNoStem()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRead()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examTaskId:J

    iget-wide v3, v0, Lcom/zykj/evaluation/bean/TaskInfo;->topicId:J

    iget-object v5, v0, Lcom/zykj/evaluation/bean/TaskInfo;->topicName:Ljava/lang/String;

    iget-wide v6, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examId:J

    iget-object v8, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examName:Ljava/lang/String;

    iget-object v9, v0, Lcom/zykj/evaluation/bean/TaskInfo;->creationTime:Ljava/lang/String;

    iget-object v10, v0, Lcom/zykj/evaluation/bean/TaskInfo;->startTime:Ljava/lang/String;

    iget-object v11, v0, Lcom/zykj/evaluation/bean/TaskInfo;->endTime:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctWithSelf:Z

    iget-boolean v13, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnline:Z

    iget v14, v0, Lcom/zykj/evaluation/bean/TaskInfo;->correctOnlineState:I

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isExempted:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isCollect:Z

    move/from16 v17, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->revisingUrge:I

    move/from16 v18, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answeringUrge:I

    move/from16 v19, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->taskState:I

    move/from16 v20, v15

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answerPad:Z

    move/from16 v21, v15

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->answerSheet:Z

    move/from16 v22, v15

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isNoStem:Z

    move/from16 v23, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->specificTrainingType:I

    move/from16 v24, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->size:I

    move/from16 v25, v14

    move/from16 v26, v15

    iget-wide v14, v0, Lcom/zykj/evaluation/bean/TaskInfo;->testPagerId:J

    move-wide/from16 v27, v14

    iget-object v14, v0, Lcom/zykj/evaluation/bean/TaskInfo;->address:Ljava/lang/String;

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->serialNum:I

    move/from16 v29, v15

    iget v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->examState:I

    move/from16 v30, v15

    iget-boolean v15, v0, Lcom/zykj/evaluation/bean/TaskInfo;->isRead:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v31, v15

    const-string v15, "TaskInfo(examTaskId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", topicId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", topicName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", examId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", examName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", creationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", correctWithSelf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", correctOnline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", correctOnlineState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isExempted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isCollect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", revisingUrge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", answeringUrge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", taskState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", answerPad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", answerSheet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNoStem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", specificTrainingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", testPagerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v27

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", address="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serialNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", examState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
