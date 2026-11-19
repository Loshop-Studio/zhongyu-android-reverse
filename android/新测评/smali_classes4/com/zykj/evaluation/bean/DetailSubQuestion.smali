.class public final Lcom/zykj/evaluation/bean/DetailSubQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u0005H\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0014\u00a8\u00065"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "",
        "uuid",
        "",
        "qstType",
        "",
        "score",
        "",
        "originScore",
        "number",
        "options",
        "",
        "type",
        "subQuestions",
        "questionId",
        "",
        "displayNumber",
        "<init>",
        "(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)V",
        "getUuid",
        "()Ljava/lang/String;",
        "getQstType",
        "()I",
        "getScore",
        "()D",
        "getOriginScore",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getNumber",
        "getOptions",
        "()Ljava/util/List;",
        "getType",
        "getSubQuestions",
        "getQuestionId",
        "()J",
        "getDisplayNumber",
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
        "copy",
        "(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)Lcom/zykj/evaluation/bean/DetailSubQuestion;",
        "equals",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final displayNumber:Ljava/lang/String;

.field private final number:I

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final originScore:Ljava/lang/Double;

.field private final qstType:I

.field private final questionId:J

.field private final score:D

.field private final subQuestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
            ">;"
        }
    .end annotation
.end field

.field private final type:I

.field private final uuid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ID",
            "Ljava/lang/Double;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
            ">;J",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    .line 4
    iput-wide p3, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    .line 5
    iput-object p5, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    .line 6
    iput p6, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    .line 7
    iput-object p7, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    .line 8
    iput p8, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    .line 9
    iput-object p9, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    .line 10
    iput-wide p10, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    .line 11
    iput-object p12, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v13, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v13, p10

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v15, v0

    :goto_1
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-wide/from16 v6, p3

    move-object/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    move-object/from16 v12, p9

    goto :goto_2

    :cond_1
    move-object/from16 v15, p12

    goto :goto_1

    .line 12
    :goto_2
    invoke-direct/range {v3 .. v15}, Lcom/zykj/evaluation/bean/DetailSubQuestion;-><init>(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/DetailSubQuestion;Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/DetailSubQuestion;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-wide p3, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p5, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p6, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p7, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p8, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p9, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-wide p10, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    :cond_8
    and-int/lit16 p13, p13, 0x200

    if-eqz p13, :cond_9

    iget-object p12, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    :cond_9
    move-object p14, p12

    move-wide p12, p10

    move p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/zykj/evaluation/bean/DetailSubQuestion;->copy(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)Lcom/zykj/evaluation/bean/DetailSubQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    return v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    return-object v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)Lcom/zykj/evaluation/bean/DetailSubQuestion;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ID",
            "Ljava/lang/Double;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
            ">;J",
            "Ljava/lang/String;",
            ")",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;"
        }
    .end annotation

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    move-object v2, p1

    move/from16 v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/zykj/evaluation/bean/DetailSubQuestion;-><init>(Ljava/lang/String;IDLjava/lang/Double;ILjava/util/List;ILjava/util/List;JLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    iget v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    iget v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    iget v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDisplayNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginScore()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQstType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSubQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/DetailSubQuestion;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->uuid:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->qstType:I

    iget-wide v2, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->score:D

    iget-object v4, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->originScore:Ljava/lang/Double;

    iget v5, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->number:I

    iget-object v6, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->options:Ljava/util/List;

    iget v7, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->type:I

    iget-object v8, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->subQuestions:Ljava/util/List;

    iget-wide v9, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->questionId:J

    iget-object v11, p0, Lcom/zykj/evaluation/bean/DetailSubQuestion;->displayNumber:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "DetailSubQuestion(uuid="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", qstType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", originScore="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", number="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", subQuestions="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", questionId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", displayNumber="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
