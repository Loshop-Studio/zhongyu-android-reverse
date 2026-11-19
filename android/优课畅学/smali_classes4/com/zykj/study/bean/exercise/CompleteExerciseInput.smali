.class public final Lcom/zykj/study/bean/exercise/CompleteExerciseInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final catalogId:I

.field private final courseId:I

.field private final exerciseId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "QuizId"
    .end annotation
.end field

.field private final groupId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/CompleteExerciseInput;IIIJILjava/lang/Object;)Lcom/zykj/study/bean/exercise/CompleteExerciseInput;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    :cond_3
    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->copy(IIIJ)Lcom/zykj/study/bean/exercise/CompleteExerciseInput;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    return-wide v0
.end method

.method public final copy(IIIJ)Lcom/zykj/study/bean/exercise/CompleteExerciseInput;
    .locals 6

    new-instance v0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;-><init>(IIIJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;

    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCatalogId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExerciseId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->courseId:I

    iget v1, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->catalogId:I

    iget v2, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->groupId:I

    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/CompleteExerciseInput;->exerciseId:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CompleteExerciseInput(courseId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
