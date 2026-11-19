.class public final Lcom/zykj/study/bean/teach/SuperviseGroupMember;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final avatar:Ljava/lang/String;

.field private final groupId:I

.field private final groupName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "superviseGroupName"
        }
        value = "groupName"
    .end annotation
.end field

.field private final progress:Ljava/lang/Integer;

.field private final score:I

.field private final status:Lcom/zykj/study/bean/exercise/ExerciseType;

.field private final userId:Ljava/lang/String;

.field private final userName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "name"
        }
        value = "userName"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;II)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatar"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    .line 7
    iput-object p6, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 8
    iput p7, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    .line 9
    iput p8, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;IIILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p10, p9, 0x2

    .line 10
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    const/4 p5, 0x0

    :cond_2
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_3

    .line 11
    sget-object p6, Lcom/zykj/study/bean/exercise/ExerciseType;->NOT_STARTED:Lcom/zykj/study/bean/exercise/ExerciseType;

    :cond_3
    move p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p9}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/SuperviseGroupMember;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;IIILjava/lang/Object;)Lcom/zykj/study/bean/teach/SuperviseGroupMember;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget p8, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    :cond_7
    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;II)Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Lcom/zykj/study/bean/exercise/ExerciseType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;II)Lcom/zykj/study/bean/teach/SuperviseGroupMember;
    .locals 10

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatar"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/zykj/study/bean/exercise/ExerciseType;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    iget v3, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    iget p1, p1, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProgress()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userId:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->userName:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupName:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->avatar:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->progress:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    iget v6, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->score:I

    iget v7, p0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->groupId:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SuperviseGroupMember(userId="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", userName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", groupName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", avatar="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
