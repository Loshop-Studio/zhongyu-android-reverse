.class public final Lcom/zykj/study/bean/teach/GetQuizDetailBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final choiceOptions:Z

.field private correctAnswers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:J

.field private isSelected:Z

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final qstType:I

.field private final questionId:J

.field private final studentGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/StuQuizBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJIZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/StuQuizBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "studentGroups"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    .line 3
    iput-wide p3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    .line 4
    iput p5, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    .line 5
    iput-boolean p6, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    .line 6
    iput-object p7, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    .line 7
    iput-object p8, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    .line 8
    iput-object p9, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    const/4 p1, 0x2

    if-ne p5, p1, :cond_3

    .line 9
    const-string p2, "A"

    if-eqz p8, :cond_0

    invoke-interface {p8}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 10
    :cond_0
    const-string p3, "B"

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    .line 11
    :cond_1
    iget-object p3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 12
    :cond_2
    invoke-static {p2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    :cond_3
    if-eq p5, p1, :cond_4

    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    .line 13
    :goto_0
    iput-boolean p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->choiceOptions:Z

    return-void
.end method

.method public synthetic constructor <init>(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/n;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const-wide/16 v0, 0x0

    if-eqz p11, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const/4 p5, -0x1

    :cond_2
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_3

    .line 14
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object p7

    :cond_3
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_4

    .line 15
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object p8

    :cond_4
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_5

    .line 16
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object p9

    :cond_5
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 17
    invoke-direct/range {p1 .. p10}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;-><init>(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/GetQuizDetailBean;JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GetQuizDetailBean;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget p5, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    :cond_2
    move v5, p5

    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    move v6, p1

    goto :goto_0

    :cond_3
    move/from16 v6, p6

    :goto_0
    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    move-object v7, p1

    goto :goto_1

    :cond_4
    move-object/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    move-object v8, p1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p10, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    move-object v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_6
    move-object/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->copy(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    return-object v0
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

    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/StuQuizBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/GetQuizDetailBean;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJIZ",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/StuQuizBean;",
            ">;)",
            "Lcom/zykj/study/bean/teach/GetQuizDetailBean;"
        }
    .end annotation

    const-string v0, "studentGroups"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    move-wide v2, p1

    move-wide v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/zykj/study/bean/teach/GetQuizDetailBean;-><init>(JJIZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;

    iget-wide v3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    iget-wide v5, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    iget v3, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChoiceOptions()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->choiceOptions:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCorrectAnswers()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    .line 2
    .line 3
    return-wide v0
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
    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQstType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getStudentGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/StuQuizBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-string v0, "\u603b\u4f53\u5b8c\u6210\u60c5\u51b5"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "\u7b2c"

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, "\u9898"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

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

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setCorrectAnswers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->id:J

    iget-wide v2, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->questionId:J

    iget v4, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->qstType:I

    iget-boolean v5, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->isSelected:Z

    iget-object v6, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->correctAnswers:Ljava/util/List;

    iget-object v7, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->options:Ljava/util/List;

    iget-object v8, p0, Lcom/zykj/study/bean/teach/GetQuizDetailBean;->studentGroups:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "GetQuizDetailBean(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", questionId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", qstType="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", correctAnswers="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", studentGroups="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
