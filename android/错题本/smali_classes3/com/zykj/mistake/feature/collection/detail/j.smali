.class public final Lcom/zykj/mistake/feature/collection/detail/j;
.super Lcom/zykj/mistake/feature/collection/detail/m;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/ArrayList;

.field public final i:I


# direct methods
.method public constructor <init>(IIJLjava/lang/String;ZZLkotlin/collections/EmptyList;Ljava/util/ArrayList;I)V
    .locals 1

    .line 1
    const-string v0, "stemShoot"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tags"

    .line 7
    .line 8
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 17
    .line 18
    iput-wide p3, p0, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 19
    .line 20
    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 21
    .line 22
    iput-boolean p6, p0, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 23
    .line 24
    iput-boolean p7, p0, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 25
    .line 26
    iput-object p8, p0, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 27
    .line 28
    iput-object p9, p0, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    iput p10, p0, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/zykj/mistake/feature/collection/detail/j;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/collection/detail/j;

    .line 10
    .line 11
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 12
    .line 13
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 19
    .line 20
    iget v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-wide v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 26
    .line 27
    iget-wide v2, p1, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 46
    .line 47
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 53
    .line 54
    iget-boolean v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 55
    .line 56
    if-eq v0, v1, :cond_7

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_7
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 60
    .line 61
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_8
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 82
    .line 83
    iget p1, p1, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 84
    .line 85
    if-eq v0, p1, :cond_a

    .line 86
    .line 87
    :goto_0
    const/4 p1, 0x0

    .line 88
    return p1

    .line 89
    :cond_a
    :goto_1
    const/4 p1, 0x1

    .line 90
    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 17
    .line 18
    const v4, 0xe1781

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3, v0, v4}, Landroidx/collection/a;->B(JII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 32
    .line 33
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 38
    .line 39
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, v2

    .line 69
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", itemId="

    .line 2
    .line 3
    const-string v1, ", topicId="

    .line 4
    .line 5
    const-string v2, "OpenMistakeDetail(bookId="

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/collection/detail/j;->a:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/collection/detail/j;->b:I

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", subject=, examName=, title=, stemShoot="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", hasStem="

    .line 31
    .line 32
    const-string v2, ", isCustomMistake="

    .line 33
    .line 34
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/detail/j;->e:Z

    .line 35
    .line 36
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/collection/detail/j;->f:Z

    .line 37
    .line 38
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 39
    .line 40
    .line 41
    const-string v1, ", isRelatedQstGroup=false, tags="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->g:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", navItems="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->h:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", navIndex="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/j;->i:I

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ")"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method
