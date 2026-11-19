.class public final Lcom/zykj/study/bean/teach/SuperviseGroup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final avg:I

.field private final completed:I

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "groupId"
        }
        value = "id"
    .end annotation
.end field

.field private memberList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;"
        }
    .end annotation
.end field

.field private final members:I

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "groupName"
        }
        value = "name"
    .end annotation
.end field

.field private final progress:Ljava/lang/Integer;

.field private final questionGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "III",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberList"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questionGroups"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    .line 5
    iput p4, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    .line 6
    iput p5, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    .line 7
    iput p6, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    .line 8
    iput-object p7, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/n;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, v0, 0x40

    if-eqz p3, :cond_1

    .line 10
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object p3

    move-object v7, p3

    goto :goto_0

    :cond_1
    move-object/from16 v7, p7

    :goto_0
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_2

    .line 11
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object p3

    move-object v8, p3

    :goto_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v4, p4

    move v5, p5

    move v6, p6

    goto :goto_2

    :cond_2
    move-object/from16 v8, p8

    goto :goto_1

    .line 12
    :goto_2
    invoke-direct/range {v0 .. v8}, Lcom/zykj/study/bean/teach/SuperviseGroup;-><init>(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/SuperviseGroup;ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/SuperviseGroup;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/zykj/study/bean/teach/SuperviseGroup;->copy(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/SuperviseGroup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;)Lcom/zykj/study/bean/teach/SuperviseGroup;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "III",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;)",
            "Lcom/zykj/study/bean/teach/SuperviseGroup;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberList"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questionGroups"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/bean/teach/SuperviseGroup;-><init>(ILjava/lang/String;Ljava/lang/Integer;IIILjava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    iget v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    iget v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    iget v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    iget v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAvg()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCompleted()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    .line 2
    .line 3
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMemberList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMembers()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProgress()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getQuestionGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMemberList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupMember;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->id:I

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->progress:Ljava/lang/Integer;

    iget v3, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->completed:I

    iget v4, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->avg:I

    iget v5, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->members:I

    iget-object v6, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->memberList:Ljava/util/List;

    iget-object v7, p0, Lcom/zykj/study/bean/teach/SuperviseGroup;->questionGroups:Ljava/util/List;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SuperviseGroup(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", completed="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", avg="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", members="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", memberList="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", questionGroups="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
