.class public final Lcom/zykj/study/bean/teach/QuizStatistic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final catalogId:I

.field private final superviseGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final superviseId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "superviseGroups"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    .line 10
    .line 11
    iput p2, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    .line 12
    .line 13
    iput-object p3, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/QuizStatistic;IILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/QuizStatistic;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/bean/teach/QuizStatistic;->copy(IILjava/util/List;)Lcom/zykj/study/bean/teach/QuizStatistic;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/List;)Lcom/zykj/study/bean/teach/QuizStatistic;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;)",
            "Lcom/zykj/study/bean/teach/QuizStatistic;"
        }
    .end annotation

    const-string v0, "superviseGroups"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/teach/QuizStatistic;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/study/bean/teach/QuizStatistic;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/QuizStatistic;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/QuizStatistic;

    iget v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCatalogId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSuperviseGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuperviseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseId:I

    iget v1, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->catalogId:I

    iget-object v2, p0, Lcom/zykj/study/bean/teach/QuizStatistic;->superviseGroups:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "QuizStatistic(superviseId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", superviseGroups="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
