.class public final Lcom/zykj/mistake/feature/review/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

.field public final d:I

.field public final e:Lcom/zykj/mistake/feature/review/o;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ILcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;ILcom/zykj/mistake/feature/review/o;IIZZ)V
    .locals 1

    .line 1
    const-string v0, "sessionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scene"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/mistake/feature/review/n;->b:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/mistake/feature/review/n;->d:I

    .line 21
    .line 22
    iput-object p5, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 23
    .line 24
    iput p6, p0, Lcom/zykj/mistake/feature/review/n;->f:I

    .line 25
    .line 26
    iput p7, p0, Lcom/zykj/mistake/feature/review/n;->g:I

    .line 27
    .line 28
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/review/n;->h:Z

    .line 29
    .line 30
    iput-boolean p9, p0, Lcom/zykj/mistake/feature/review/n;->i:Z

    .line 31
    .line 32
    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/review/n;ILcom/zykj/mistake/feature/review/o;IIZZI)Lcom/zykj/mistake/feature/review/n;
    .locals 10

    .line 1
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p0, Lcom/zykj/mistake/feature/review/n;->b:I

    .line 4
    .line 5
    iget-object v3, p0, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 6
    .line 7
    and-int/lit8 v0, p7, 0x8

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget p1, p0, Lcom/zykj/mistake/feature/review/n;->d:I

    .line 12
    .line 13
    :cond_0
    move v4, p1

    .line 14
    and-int/lit8 p1, p7, 0x10

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p2, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 19
    .line 20
    :cond_1
    move-object v5, p2

    .line 21
    and-int/lit8 p1, p7, 0x20

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget p3, p0, Lcom/zykj/mistake/feature/review/n;->f:I

    .line 26
    .line 27
    :cond_2
    move v6, p3

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string p0, "sessionId"

    .line 32
    .line 33
    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p0, "scene"

    .line 37
    .line 38
    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Lcom/zykj/mistake/feature/review/n;

    .line 42
    .line 43
    move v7, p4

    .line 44
    move v8, p5

    .line 45
    move/from16 v9, p6

    .line 46
    .line 47
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/review/n;-><init>(Ljava/lang/String;ILcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;ILcom/zykj/mistake/feature/review/o;IIZZ)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/review/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/review/n;

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->b:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/n;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->d:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/n;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->f:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/n;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->g:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/n;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/n;->h:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/review/n;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/n;->i:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/feature/review/n;->i:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/mistake/feature/review/n;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget v0, p0, Lcom/zykj/mistake/feature/review/n;->d:I

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/review/o;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget v0, p0, Lcom/zykj/mistake/feature/review/n;->f:I

    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, Lcom/zykj/mistake/feature/review/n;->g:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/n;->h:Z

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/n;->i:Z

    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v1, v0

    .line 63
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Session(sessionId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scene="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->c:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextRoundIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", summary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/n;->e:Lcom/zykj/mistake/feature/review/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", roundStartSubmittedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentRoundPracticeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/review/n;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isCurrentRoundCompleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/n;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isAllCompleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/n;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
