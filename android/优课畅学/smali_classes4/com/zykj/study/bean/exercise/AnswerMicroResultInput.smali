.class public final Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final answerEx:Ljava/lang/String;

.field private final correct:Z

.field private final exerciseId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "quizId"
    .end annotation
.end field

.field private final groupId:I

.field private final questionId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "questionId"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "answerEx"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    .line 15
    .line 16
    iput p3, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    .line 17
    .line 18
    iput-object p4, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p5, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    .line 21
    .line 22
    iput-object p6, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;JILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-boolean p5, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    :cond_3
    move v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->copy(JILjava/lang/String;ZLjava/lang/String;)Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JILjava/lang/String;ZLjava/lang/String;)Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;
    .locals 8

    const-string v0, "questionId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerEx"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;-><init>(JILjava/lang/String;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;

    iget-wide v3, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    iget-wide v5, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    iget v3, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnswerEx()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getExerciseId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->exerciseId:J

    iget v2, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->groupId:I

    iget-object v3, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->questionId:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->correct:Z

    iget-object v5, p0, Lcom/zykj/study/bean/exercise/AnswerMicroResultInput;->answerEx:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AnswerMicroResultInput(exerciseId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", questionId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", correct="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", answerEx="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
