.class public final Lcom/zykj/mistake/feature/notebook/detail/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

.field public final c:Z

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public final h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

.field public final i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10

    .line 11
    sget-object v8, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;->EMPTY:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    move-object v9, v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    .line 12
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/o0;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;)V
    .locals 1

    const-string v0, "index"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalAnswers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalComments"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revisedAnswers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revisedComments"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revisedState"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    .line 4
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    .line 7
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    .line 8
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    .line 9
    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 10
    iput-object p9, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/2addr v0, v2

    .line 63
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnswerEntryUiState(index="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerDisplayType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCustomMistake="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", originalAnswers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", originalComments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", revisedAnswers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", revisedComments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", originalState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->h:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", revisedState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o0;->i:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerVisualState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
