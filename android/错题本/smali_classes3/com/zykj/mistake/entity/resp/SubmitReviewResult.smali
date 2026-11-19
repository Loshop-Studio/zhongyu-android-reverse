.class public final Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u000cH\u00c6\u0003J\t\u0010,\u001a\u00020\u000cH\u00c6\u0003J\t\u0010-\u001a\u00020\u000cH\u00c6\u0003J\t\u0010.\u001a\u00020\u000cH\u00c6\u0003J\t\u0010/\u001a\u00020\u000cH\u00c6\u0003J\t\u00100\u001a\u00020\u000cH\u00c6\u0003J\t\u00101\u001a\u00020\u000cH\u00c6\u0003J\t\u00102\u001a\u00020\u000cH\u00c6\u0003J\t\u00103\u001a\u00020\u0015H\u00c6\u0003J\u009f\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H\u00c6\u0001J\u0013\u00105\u001a\u00020\u000c2\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u0005H\u00d6\u0001J\t\u00108\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001bR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010!R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010!R\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010!R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010!R\u0011\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010!R\u0011\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010!R\u0011\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010!R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/SubmitReviewResult;",
        "",
        "reviewRecordId",
        "",
        "itemId",
        "",
        "beforeStage",
        "afterStage",
        "beforeNextReviewTime",
        "",
        "afterNextReviewTime",
        "isCorrect",
        "",
        "isConsecutiveCorrect",
        "isMasteredBefore",
        "isMasteredAfter",
        "isPromoted",
        "enteredMastered",
        "isCurrentRoundCompleted",
        "isAllCompleted",
        "summary",
        "Lcom/zykj/mistake/entity/resp/ReviewResultSummary;",
        "<init>",
        "(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)V",
        "getReviewRecordId",
        "()J",
        "getItemId",
        "()I",
        "getBeforeStage",
        "getAfterStage",
        "getBeforeNextReviewTime",
        "()Ljava/lang/String;",
        "getAfterNextReviewTime",
        "()Z",
        "getEnteredMastered",
        "getSummary",
        "()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;",
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
.field private final afterNextReviewTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final afterStage:I

.field private final beforeNextReviewTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final beforeStage:I

.field private final enteredMastered:Z

.field private final isAllCompleted:Z

.field private final isConsecutiveCorrect:Z

.field private final isCorrect:Z

.field private final isCurrentRoundCompleted:Z

.field private final isMasteredAfter:Z

.field private final isMasteredBefore:Z

.field private final isPromoted:Z

.field private final itemId:I

.field private final reviewRecordId:J

.field private final summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    const/16 v17, 0x7fff

    const/16 v18, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v18}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;-><init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)V
    .locals 2
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lcom/zykj/mistake/entity/resp/ReviewResultSummary;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p16

    const-string v1, "beforeNextReviewTime"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "afterNextReviewTime"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "summary"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    .line 4
    iput p3, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    .line 5
    iput p4, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    .line 6
    iput p5, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    .line 7
    iput-object p6, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    .line 10
    iput-boolean p9, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    .line 11
    iput-boolean p10, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    .line 12
    iput-boolean p11, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    .line 13
    iput-boolean p12, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    .line 14
    iput-boolean p13, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    .line 17
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    return-void
.end method

.method public synthetic constructor <init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;ILkotlin/jvm/internal/e;)V
    .locals 26

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x10

    .line 18
    const-string v8, ""

    if-eqz v7, :cond_4

    move-object v7, v8

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    and-int/lit16 v4, v0, 0x2000

    if-eqz v4, :cond_d

    const/4 v4, 0x0

    goto :goto_d

    :cond_d
    move/from16 v4, p15

    :goto_d
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_e

    .line 19
    new-instance v0, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    const/16 v16, 0xff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 p10, v16

    move-object/from16 p11, v17

    move/from16 p2, v18

    move/from16 p3, v19

    move/from16 p4, v20

    move/from16 p5, v21

    move/from16 p6, v22

    move/from16 p7, v23

    move/from16 p8, v24

    move/from16 p9, v25

    invoke-direct/range {p1 .. p11}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;-><init>(IIIIIIZZILkotlin/jvm/internal/e;)V

    move-object/from16 p17, v0

    :goto_e
    move-object/from16 p1, p0

    move-wide/from16 p2, v1

    move/from16 p4, v3

    move/from16 p16, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p17, p16

    goto :goto_e

    .line 20
    :goto_f
    invoke-direct/range {p1 .. p17}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;-><init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/resp/SubmitReviewResult;JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;ILjava/lang/Object;)Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-boolean v2, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    move-object/from16 p17, v1

    :goto_e
    move-object/from16 p1, v0

    move/from16 p16, v2

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_f

    :cond_e
    move-object/from16 p17, p16

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p17}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->copy(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    return-wide v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    return v0
.end method

.method public final component15()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    return v0
.end method

.method public final copy(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
    .locals 18
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lcom/zykj/mistake/entity/resp/ReviewResultSummary;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "beforeNextReviewTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "afterNextReviewTime"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summary"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;-><init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    iget-wide v3, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    iget-wide v5, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    iget-object p1, p1, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAfterNextReviewTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAfterStage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBeforeNextReviewTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBeforeStage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    .line 2
    .line 3
    return v0
.end method

.method public final getEnteredMastered()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getItemId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReviewRecordId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSummary()Lcom/zykj/mistake/entity/resp/ReviewResultSummary;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewResultSummary;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    add-int/2addr v1, v0

    .line 95
    return v1
.end method

.method public final isAllCompleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isConsecutiveCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isCurrentRoundCompleted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isMasteredAfter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isMasteredBefore()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isPromoted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->reviewRecordId:J

    .line 4
    .line 5
    iget v3, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->itemId:I

    .line 6
    .line 7
    iget v4, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeStage:I

    .line 8
    .line 9
    iget v5, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterStage:I

    .line 10
    .line 11
    iget-object v6, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->beforeNextReviewTime:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->afterNextReviewTime:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v8, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCorrect:Z

    .line 16
    .line 17
    iget-boolean v9, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isConsecutiveCorrect:Z

    .line 18
    .line 19
    iget-boolean v10, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredBefore:Z

    .line 20
    .line 21
    iget-boolean v11, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isMasteredAfter:Z

    .line 22
    .line 23
    iget-boolean v12, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isPromoted:Z

    .line 24
    .line 25
    iget-boolean v13, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->enteredMastered:Z

    .line 26
    .line 27
    iget-boolean v14, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isCurrentRoundCompleted:Z

    .line 28
    .line 29
    iget-boolean v15, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->isAllCompleted:Z

    .line 30
    .line 31
    move/from16 v16, v14

    .line 32
    .line 33
    iget-object v14, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;->summary:Lcom/zykj/mistake/entity/resp/ReviewResultSummary;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    move-object/from16 v17, v14

    .line 38
    .line 39
    const-string v14, "SubmitReviewResult(reviewRecordId="

    .line 40
    .line 41
    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", itemId="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", beforeStage="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", afterStage="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", beforeNextReviewTime="

    .line 72
    .line 73
    const-string v2, ", afterNextReviewTime="

    .line 74
    .line 75
    invoke-static {v0, v1, v6, v2, v7}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v1, ", isCorrect="

    .line 79
    .line 80
    const-string v2, ", isConsecutiveCorrect="

    .line 81
    .line 82
    invoke-static {v1, v2, v0, v8, v9}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 83
    .line 84
    .line 85
    const-string v1, ", isMasteredBefore="

    .line 86
    .line 87
    const-string v2, ", isMasteredAfter="

    .line 88
    .line 89
    invoke-static {v1, v2, v0, v10, v11}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 90
    .line 91
    .line 92
    const-string v1, ", isPromoted="

    .line 93
    .line 94
    const-string v2, ", enteredMastered="

    .line 95
    .line 96
    invoke-static {v1, v2, v0, v12, v13}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 97
    .line 98
    .line 99
    const-string v1, ", isCurrentRoundCompleted="

    .line 100
    .line 101
    const-string v2, ", isAllCompleted="

    .line 102
    .line 103
    move/from16 v3, v16

    .line 104
    .line 105
    invoke-static {v1, v2, v0, v3, v15}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 106
    .line 107
    .line 108
    const-string v1, ", summary="

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    move-object/from16 v1, v17

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v1, ")"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0
.end method
