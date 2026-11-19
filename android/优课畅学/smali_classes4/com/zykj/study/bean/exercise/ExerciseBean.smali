.class public final Lcom/zykj/study/bean/exercise/ExerciseBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final avg:D

.field private final completed:I

.field private final exerciseId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "quizId"
    .end annotation
.end field

.field private final groupId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "questionGroupId"
        }
        value = "groupId"
    .end annotation
.end field

.field private progress:I

.field private final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;"
        }
    .end annotation
.end field

.field private final score:D

.field private status:Lcom/zykj/study/bean/exercise/ExerciseType;

.field private title:Ljava/lang/String;

.field private final updateTime:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/exercise/ExerciseBean$Creator;

    invoke-direct {v0}, Lcom/zykj/study/bean/exercise/ExerciseBean$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/exercise/ExerciseBean;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/bean/exercise/ExerciseBean;->$stable:I

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;IIDLjava/util/Date;DLjava/util/List;Lcom/zykj/study/bean/exercise/ExerciseType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/lang/String;",
            "IID",
            "Ljava/util/Date;",
            "D",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;",
            "Lcom/zykj/study/bean/exercise/ExerciseType;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "questions"

    .line 2
    .line 3
    invoke-static {p12, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    .line 10
    .line 11
    iput p3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    .line 12
    .line 13
    iput-object p4, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    .line 14
    .line 15
    iput p5, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    .line 16
    .line 17
    iput p6, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    .line 18
    .line 19
    iput-wide p7, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    .line 20
    .line 21
    iput-object p9, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    .line 22
    .line 23
    iput-wide p10, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    .line 24
    .line 25
    iput-object p12, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    .line 26
    .line 27
    iput-object p13, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/ExerciseBean;JILjava/lang/String;IIDLjava/util/Date;DLjava/util/List;Lcom/zykj/study/bean/exercise/ExerciseType;ILjava/lang/Object;)Lcom/zykj/study/bean/exercise/ExerciseBean;
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    iget v5, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    iget v6, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    goto :goto_4

    :cond_4
    move/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    iget-wide v7, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    goto :goto_5

    :cond_5
    move-wide/from16 v7, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    iget-object v9, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    iget-wide v10, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    goto :goto_7

    :cond_7
    move-wide/from16 v10, p10

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    iget-object v12, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p12

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    move-object/from16 p14, v0

    :goto_9
    move-object p1, p0

    move-wide p2, v1

    move/from16 p4, v3

    move-object/from16 p5, v4

    move/from16 p6, v5

    move/from16 p7, v6

    move-wide/from16 p8, v7

    move-object/from16 p10, v9

    move-wide/from16 p11, v10

    move-object/from16 p13, v12

    goto :goto_a

    :cond_9
    move-object/from16 p14, p13

    goto :goto_9

    :goto_a
    invoke-virtual/range {p1 .. p14}, Lcom/zykj/study/bean/exercise/ExerciseBean;->copy(JILjava/lang/String;IIDLjava/util/Date;DLjava/util/List;Lcom/zykj/study/bean/exercise/ExerciseType;)Lcom/zykj/study/bean/exercise/ExerciseBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    return-wide v0
.end method

.method public final component10()Lcom/zykj/study/bean/exercise/ExerciseType;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    return v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    return-wide v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    return-wide v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JILjava/lang/String;IIDLjava/util/Date;DLjava/util/List;Lcom/zykj/study/bean/exercise/ExerciseType;)Lcom/zykj/study/bean/exercise/ExerciseBean;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/lang/String;",
            "IID",
            "Ljava/util/Date;",
            "D",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;",
            "Lcom/zykj/study/bean/exercise/ExerciseType;",
            ")",
            "Lcom/zykj/study/bean/exercise/ExerciseBean;"
        }
    .end annotation

    const-string v0, "questions"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/zykj/study/bean/exercise/ExerciseBean;-><init>(JILjava/lang/String;IIDLjava/util/Date;DLjava/util/List;Lcom/zykj/study/bean/exercise/ExerciseType;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/ExerciseBean;

    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    iget-wide v5, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    iget-wide v5, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    iget-object p1, p1, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAvg()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCompleted()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExerciseId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/exercise/QuestionBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdateTime()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

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

    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final setProgress(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStatus(Lcom/zykj/study/bean/exercise/ExerciseType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    iget v2, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    iget-object v3, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    iget v4, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    iget v5, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    iget-wide v6, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    iget-object v8, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    iget-wide v9, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    iget-object v11, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    iget-object v12, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "ExerciseBean(exerciseId="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", completed="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", avg="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", questions="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->exerciseId:J

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->groupId:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->title:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->progress:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->completed:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->avg:D

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->updateTime:Ljava/util/Date;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 39
    .line 40
    .line 41
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->score:D

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->questions:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 70
    .line 71
    invoke-virtual {v1, p1, p2}, Lcom/zykj/study/bean/exercise/QuestionBean;->writeToParcel(Landroid/os/Parcel;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-object p2, p0, Lcom/zykj/study/bean/exercise/ExerciseBean;->status:Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 76
    .line 77
    if-nez p2, :cond_1

    .line 78
    .line 79
    const/4 p2, 0x0

    .line 80
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    const/4 v0, 0x1

    .line 85
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
