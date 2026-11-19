.class public final Lcom/zykj/mistake/feature/collection/detail/i;
.super Lcom/zykj/mistake/feature/collection/detail/m;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;IIZLcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;)V
    .locals 1

    .line 1
    const-string v0, "sourceType"

    .line 2
    .line 3
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput p3, p0, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 14
    .line 15
    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 16
    .line 17
    iput p5, p0, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 18
    .line 19
    iput p6, p0, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 20
    .line 21
    iput-boolean p7, p0, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 22
    .line 23
    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/zykj/mistake/feature/collection/detail/i;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/i;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 34
    .line 35
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 41
    .line 42
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 52
    .line 53
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 59
    .line 60
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 66
    .line 67
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 75
    .line 76
    if-eq v0, p1, :cond_9

    .line 77
    .line 78
    :goto_0
    const/4 p1, 0x0

    .line 79
    return p1

    .line 80
    :cond_9
    :goto_1
    const/4 p1, 0x1

    .line 81
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0x64

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->c(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    const-string v1, ", currentCount="

    .line 4
    .line 5
    const-string v2, "OpenFilterResult(collectionId="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/collection/detail/i;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/detail/i;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", maxCount=100, mistakeListReq="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->d:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", currentCollectionType="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", otherCollectionType="

    .line 36
    .line 37
    const-string v2, ", showCurrentCollectionFilter="

    .line 38
    .line 39
    iget v3, p0, Lcom/zykj/mistake/feature/collection/detail/i;->e:I

    .line 40
    .line 41
    iget v4, p0, Lcom/zykj/mistake/feature/collection/detail/i;->f:I

    .line 42
    .line 43
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->g:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", sourceType="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/i;->h:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
