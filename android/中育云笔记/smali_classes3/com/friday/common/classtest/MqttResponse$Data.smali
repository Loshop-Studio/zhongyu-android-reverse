.class public final Lcom/friday/common/classtest/MqttResponse$Data;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/classtest/MqttResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Data"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final answerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private canSubmit:Z

.field private final imagePath:Ljava/lang/String;

.field private final options:I

.field private final qstType:I

.field private final questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

.field private final student:Lcom/friday/common/classtest/MqttResponse$Student;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/friday/common/classtest/MqttResponse$QuestionInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "imagePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    .line 4
    iput p3, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    .line 5
    iput-object p4, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    .line 6
    iput-object p5, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    .line 7
    iput-boolean p6, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    .line 8
    iput-object p7, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;ILkotlin/jvm/internal/n;)V
    .locals 8

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    const/4 p6, 0x1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/classtest/MqttResponse$Data;Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;ILjava/lang/Object;)Lcom/friday/common/classtest/MqttResponse$Data;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/friday/common/classtest/MqttResponse$Data;->copy(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    return v0
.end method

.method public final component4()Lcom/friday/common/classtest/MqttResponse$Student;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    return-object v0
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

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    return v0
.end method

.method public final component7()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)Lcom/friday/common/classtest/MqttResponse$Data;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/friday/common/classtest/MqttResponse$Student;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/friday/common/classtest/MqttResponse$QuestionInfo;",
            ")",
            "Lcom/friday/common/classtest/MqttResponse$Data;"
        }
    .end annotation

    const-string v0, "imagePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/classtest/MqttResponse$Data;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/friday/common/classtest/MqttResponse$Data;-><init>(Ljava/lang/String;IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;ZLcom/friday/common/classtest/MqttResponse$QuestionInfo;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/classtest/MqttResponse$Data;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/classtest/MqttResponse$Data;

    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    iget v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    iget v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    iget-object v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    iget-object v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    iget-boolean v3, p1, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    iget-object p1, p1, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnswerList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCanSubmit()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getImagePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOptions()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQstType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStudent()Lcom/friday/common/classtest/MqttResponse$Student;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setCanSubmit(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/friday/common/classtest/MqttResponse$Data;->imagePath:Ljava/lang/String;

    iget v1, p0, Lcom/friday/common/classtest/MqttResponse$Data;->qstType:I

    iget v2, p0, Lcom/friday/common/classtest/MqttResponse$Data;->options:I

    iget-object v3, p0, Lcom/friday/common/classtest/MqttResponse$Data;->student:Lcom/friday/common/classtest/MqttResponse$Student;

    iget-object v4, p0, Lcom/friday/common/classtest/MqttResponse$Data;->answerList:Ljava/util/List;

    iget-boolean v5, p0, Lcom/friday/common/classtest/MqttResponse$Data;->canSubmit:Z

    iget-object v6, p0, Lcom/friday/common/classtest/MqttResponse$Data;->questionInfo:Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Data(imagePath="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", qstType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", student="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", answerList="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", canSubmit="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", questionInfo="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
