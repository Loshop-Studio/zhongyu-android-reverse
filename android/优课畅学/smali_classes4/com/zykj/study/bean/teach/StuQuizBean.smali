.class public final Lcom/zykj/study/bean/teach/StuQuizBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final answerForStu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final avgRaw:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg"
    .end annotation
.end field

.field private final completeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final completeNum:I

.field private final groupId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final groupName:Ljava/lang/String;

.field private final totalNum:I

.field private final unCompleteList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "IID",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerForStu"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeList"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unCompleteList"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    .line 5
    iput p4, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    .line 6
    iput-wide p5, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    .line 7
    iput-object p7, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    .line 8
    iput-object p8, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    .line 9
    iput-object p9, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p10, p10, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object p10, p8

    move-object p11, p9

    move-object p9, p7

    move-wide p7, p5

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 10
    invoke-direct/range {p2 .. p11}, Lcom/zykj/study/bean/teach/StuQuizBean;-><init>(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/StuQuizBean;ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/StuQuizBean;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-wide p5, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p7, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p8, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    iget-object p9, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    :cond_7
    move-object p10, p8

    move-object p11, p9

    move-object p9, p7

    move-wide p7, p5

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p11}, Lcom/zykj/study/bean/teach/StuQuizBean;->copy(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/StuQuizBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    return v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    return-wide v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/StuQuizBean;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "IID",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/zykj/study/bean/teach/StuQuizBean;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerForStu"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completeList"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unCompleteList"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/StuQuizBean;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-wide/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lcom/zykj/study/bean/teach/StuQuizBean;-><init>(ILjava/lang/String;IIDLjava/util/Map;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/StuQuizBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/StuQuizBean;

    iget v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    iget v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    iget v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    iget-wide v5, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAnswerForStu()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAvg()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    .line 2
    .line 3
    double-to-int v0, v0

    .line 4
    return v0
.end method

.method public final getAvgRaw()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCompleteList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompleteNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTotalNum()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUnCompleteList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupId:I

    iget-object v1, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->groupName:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeNum:I

    iget v3, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->totalNum:I

    iget-wide v4, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->avgRaw:D

    iget-object v6, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->answerForStu:Ljava/util/Map;

    iget-object v7, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->completeList:Ljava/util/List;

    iget-object v8, p0, Lcom/zykj/study/bean/teach/StuQuizBean;->unCompleteList:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "StuQuizBean(groupId="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", completeNum="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", totalNum="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", avgRaw="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", answerForStu="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", completeList="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unCompleteList="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
