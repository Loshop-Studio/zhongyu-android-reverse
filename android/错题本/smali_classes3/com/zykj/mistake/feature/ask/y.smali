.class public final Lcom/zykj/mistake/feature/ask/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/zykj/mistake/feature/ask/c0;

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;Z)V
    .locals 1

    .line 1
    const-string v0, "id"

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
    const-string v0, "sourceType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "imageSource"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "webUrl"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p6, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p7, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 42
    .line 43
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 44
    .line 45
    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/ask/y;Ljava/lang/String;ZI)Lcom/zykj/mistake/feature/ask/y;
    .locals 9

    .line 1
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    .line 10
    .line 11
    and-int/lit8 v0, p3, 0x20

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 16
    .line 17
    :cond_0
    move-object v6, p1

    .line 18
    iget-object v7, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 19
    .line 20
    and-int/lit16 p1, p3, 0x80

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-boolean p2, p0, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 25
    .line 26
    :cond_1
    move v8, p2

    .line 27
    const-string p0, "id"

    .line 28
    .line 29
    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string p0, "title"

    .line 33
    .line 34
    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string p0, "sourceType"

    .line 38
    .line 39
    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p0, "imageSource"

    .line 43
    .line 44
    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p0, "webUrl"

    .line 48
    .line 49
    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p0, "previewPath"

    .line 53
    .line 54
    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lcom/zykj/mistake/feature/ask/y;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/ask/y;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/ask/c0;Z)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/ask/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/ask/y;

    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    iget-object v3, p1, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/ask/y;->h:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/feature/ask/y;->h:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/mistake/feature/ask/c0;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    :goto_0
    add-int/2addr v0, v2

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", sourceType="

    .line 4
    .line 5
    const-string v2, "ItemUiState(id="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/y;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/y;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->c:Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$SourceType;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", imageSource="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", webUrl="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", previewPath="

    .line 36
    .line 37
    const-string v2, ", textPayload="

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/mistake/feature/ask/y;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/zykj/mistake/feature/ask/y;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/y;->g:Lcom/zykj/mistake/feature/ask/c0;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", selected="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/ask/y;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ")"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method
