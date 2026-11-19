.class public final Lcom/zykj/evaluation/bean/TaskCount;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\r\u00a8\u0006\""
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/TaskCount;",
        "",
        "Testing",
        "",
        "WaitExamCorrect",
        "ExamCorrecting",
        "Revising",
        "WaitRevisingCorrect",
        "RevisingCorrecting",
        "End",
        "<init>",
        "(IIIIIII)V",
        "getTesting",
        "()I",
        "getWaitExamCorrect",
        "getExamCorrecting",
        "getRevising",
        "getWaitRevisingCorrect",
        "getRevisingCorrecting",
        "getEnd",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final End:I

.field private final ExamCorrecting:I

.field private final Revising:I

.field private final RevisingCorrecting:I

.field private final Testing:I

.field private final WaitExamCorrect:I

.field private final WaitRevisingCorrect:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    .line 11
    .line 12
    iput p5, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    .line 13
    .line 14
    iput p6, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    .line 15
    .line 16
    iput p7, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/TaskCount;IIIIIIIILjava/lang/Object;)Lcom/zykj/evaluation/bean/TaskCount;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/zykj/evaluation/bean/TaskCount;->copy(IIIIIII)Lcom/zykj/evaluation/bean/TaskCount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/zykj/evaluation/bean/TaskCount;
    .locals 8

    new-instance v0, Lcom/zykj/evaluation/bean/TaskCount;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/zykj/evaluation/bean/TaskCount;-><init>(IIIIIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/TaskCount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/TaskCount;

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    iget v3, p1, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    iget p1, p1, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getEnd()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    .line 2
    .line 3
    return v0
.end method

.method public final getExamCorrecting()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRevising()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRevisingCorrecting()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTesting()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWaitExamCorrect()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWaitRevisingCorrect()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/zykj/evaluation/bean/TaskCount;->Testing:I

    iget v1, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitExamCorrect:I

    iget v2, p0, Lcom/zykj/evaluation/bean/TaskCount;->ExamCorrecting:I

    iget v3, p0, Lcom/zykj/evaluation/bean/TaskCount;->Revising:I

    iget v4, p0, Lcom/zykj/evaluation/bean/TaskCount;->WaitRevisingCorrect:I

    iget v5, p0, Lcom/zykj/evaluation/bean/TaskCount;->RevisingCorrecting:I

    iget v6, p0, Lcom/zykj/evaluation/bean/TaskCount;->End:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "TaskCount(Testing="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", WaitExamCorrect="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ExamCorrecting="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", Revising="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", WaitRevisingCorrect="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", RevisingCorrecting="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", End="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
