.class public final Lcom/zykj/study/bean/teach/StatisticsGroupItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final correct:Z

.field private final progress:I

.field private final questionId:Ljava/lang/String;

.field private final status:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 1

    .line 1
    const-string v0, "questionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    .line 10
    .line 11
    iput p2, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    .line 12
    .line 13
    iput p3, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    .line 14
    .line 15
    iput-boolean p4, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/StatisticsGroupItem;Ljava/lang/String;IIZILjava/lang/Object;)Lcom/zykj/study/bean/teach/StatisticsGroupItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->copy(Ljava/lang/String;IIZ)Lcom/zykj/study/bean/teach/StatisticsGroupItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;IIZ)Lcom/zykj/study/bean/teach/StatisticsGroupItem;
    .locals 1

    const-string v0, "questionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/bean/teach/StatisticsGroupItem;-><init>(Ljava/lang/String;IIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    iget v3, p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    iget v3, p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    iget-boolean p1, p1, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->questionId:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->progress:I

    iget v2, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->status:I

    iget-boolean v3, p0, Lcom/zykj/study/bean/teach/StatisticsGroupItem;->correct:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "StatisticsGroupItem(questionId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", correct="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
