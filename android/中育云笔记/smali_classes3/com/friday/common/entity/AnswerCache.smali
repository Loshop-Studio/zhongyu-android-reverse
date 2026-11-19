.class public final Lcom/friday/common/entity/AnswerCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final dataList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/friday/common/entity/OptionListEntity;",
            ">;"
        }
    .end annotation
.end field

.field private fromServer:Z

.field private final guid:Ljava/lang/String;

.field private hasStopped:Ljava/lang/Boolean;

.field private hasSubmit:Z

.field private homeworkPage:I

.field private isSingle:Z

.field private final isSubjective:Z

.field private options:I

.field private qstCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZIZZ",
            "Ljava/lang/Boolean;",
            "Ljava/util/ArrayList<",
            "Lcom/friday/common/entity/OptionListEntity;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    .line 3
    iput p2, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    .line 4
    iput-boolean p3, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    .line 5
    iput p4, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    .line 6
    iput-boolean p5, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    .line 7
    iput-boolean p6, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    .line 8
    iput-object p7, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    .line 9
    iput-object p8, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    .line 10
    iput-boolean p9, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    .line 11
    iput-object p10, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p6, v0

    :cond_5
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_6

    .line 12
    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    move-object p11, p10

    move p10, p9

    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p11}, Lcom/friday/common/entity/AnswerCache;-><init>(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/AnswerCache;IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;ILjava/lang/Object;)Lcom/friday/common/entity/AnswerCache;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-boolean p3, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-boolean p6, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    :cond_9
    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/friday/common/entity/AnswerCache;->copy(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)Lcom/friday/common/entity/AnswerCache;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    return v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/friday/common/entity/OptionListEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    return v0
.end method

.method public final copy(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)Lcom/friday/common/entity/AnswerCache;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZIZZ",
            "Ljava/lang/Boolean;",
            "Ljava/util/ArrayList<",
            "Lcom/friday/common/entity/OptionListEntity;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/friday/common/entity/AnswerCache;"
        }
    .end annotation

    const-string v0, "dataList"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/entity/AnswerCache;

    move v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/friday/common/entity/AnswerCache;-><init>(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/AnswerCache;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/AnswerCache;

    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    iget v3, p1, Lcom/friday/common/entity/AnswerCache;->options:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    iget v3, p1, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    iget v3, p1, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDataList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/friday/common/entity/OptionListEntity;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFromServer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getGuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasStopped()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasSubmit()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHomeworkPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOptions()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQstCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

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

    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isSingle()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSubjective()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setFromServer(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHasStopped(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setHasSubmit(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHomeworkPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    .line 2
    .line 3
    return-void
.end method

.method public final setOptions(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    .line 2
    .line 3
    return-void
.end method

.method public final setQstCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSingle(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lcom/friday/common/entity/AnswerCache;->options:I

    iget v1, p0, Lcom/friday/common/entity/AnswerCache;->qstCount:I

    iget-boolean v2, p0, Lcom/friday/common/entity/AnswerCache;->isSingle:Z

    iget v3, p0, Lcom/friday/common/entity/AnswerCache;->homeworkPage:I

    iget-boolean v4, p0, Lcom/friday/common/entity/AnswerCache;->fromServer:Z

    iget-boolean v5, p0, Lcom/friday/common/entity/AnswerCache;->hasSubmit:Z

    iget-object v6, p0, Lcom/friday/common/entity/AnswerCache;->hasStopped:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/friday/common/entity/AnswerCache;->dataList:Ljava/util/ArrayList;

    iget-boolean v8, p0, Lcom/friday/common/entity/AnswerCache;->isSubjective:Z

    iget-object v9, p0, Lcom/friday/common/entity/AnswerCache;->guid:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "AnswerCache(options="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", qstCount="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isSingle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", homeworkPage="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fromServer="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hasSubmit="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hasStopped="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dataList="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSubjective="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", guid="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
