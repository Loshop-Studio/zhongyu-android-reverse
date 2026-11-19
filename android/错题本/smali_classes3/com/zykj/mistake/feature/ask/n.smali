.class public final Lcom/zykj/mistake/feature/ask/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/lang/String;IILjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "title"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    .line 17
    .line 18
    iput p3, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 21
    .line 22
    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/ask/n;ILjava/util/ArrayList;I)Lcom/zykj/mistake/feature/ask/n;
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    .line 4
    .line 5
    and-int/lit8 p3, p3, 0x4

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 10
    .line 11
    :cond_0
    move v3, p1

    .line 12
    iget v4, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 13
    .line 14
    const-string p0, "type"

    .line 15
    .line 16
    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p0, "title"

    .line 20
    .line 21
    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/zykj/mistake/feature/ask/n;

    .line 25
    .line 26
    move-object v5, p2

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/ask/n;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;Ljava/lang/String;IILjava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/ask/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/n;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    iget v3, p1, Lcom/zykj/mistake/feature/ask/n;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    iget v3, p1, Lcom/zykj/mistake/feature/ask/n;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, v0

    .line 35
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GroupUiState(type="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->a:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$MaterialType;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", title="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedCount="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", totalCount="

    .line 29
    .line 30
    const-string v2, ", items="

    .line 31
    .line 32
    iget v3, p0, Lcom/zykj/mistake/feature/ask/n;->c:I

    .line 33
    .line 34
    iget v4, p0, Lcom/zykj/mistake/feature/ask/n;->d:I

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/n;->e:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ")"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method
