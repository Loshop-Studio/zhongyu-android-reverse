.class public final Lcom/zykj/mistake/feature/notebook/detail/k3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:I


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;JLjava/util/List;ZI)V
    .locals 1

    const-string v0, "boardNoteUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pictureNotes"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    .line 3
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    .line 5
    iput-wide p5, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    .line 6
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 7
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    .line 8
    iput p9, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/util/List;ZI)V
    .locals 10

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 9
    const-string p3, ""

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_2

    .line 10
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v7, p1

    goto :goto_0

    :cond_2
    move-object v7, p4

    :goto_0
    and-int/lit8 p1, p6, 0x20

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    move v8, p1

    goto :goto_1

    :cond_3
    move v8, p5

    :goto_1
    const/4 v9, 0x4

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/k3;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/util/List;ZI)V

    return-void
.end method

.method public static a(Lcom/zykj/mistake/feature/notebook/detail/k3;Ljava/lang/String;JLjava/util/List;ZI)Lcom/zykj/mistake/feature/notebook/detail/k3;
    .locals 10

    .line 1
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    .line 2
    .line 3
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    .line 4
    .line 5
    and-int/lit8 v0, p6, 0x4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    move-object v4, p1

    .line 12
    and-int/lit8 p1, p6, 0x8

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    .line 17
    .line 18
    :cond_1
    move-wide v5, p2

    .line 19
    and-int/lit8 p1, p6, 0x10

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 24
    .line 25
    :cond_2
    move-object v7, p4

    .line 26
    and-int/lit8 p1, p6, 0x20

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-boolean p5, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    .line 31
    .line 32
    :cond_3
    move v8, p5

    .line 33
    iget v9, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    .line 34
    .line 35
    const-string p0, "boardNoteUrl"

    .line 36
    .line 37
    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "pictureNotes"

    .line 41
    .line 42
    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 46
    .line 47
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/k3;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/util/List;ZI)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/k3;

    iget-wide v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    iget-wide v2, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    iget-wide v2, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    iget-object v1, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    iget-boolean v1, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    if-eq v0, v1, :cond_7

    goto :goto_0

    :cond_7
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    iget p1, p1, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    if-eq v0, p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v0

    .line 53
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NoteUiState(itemId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", boardNoteUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", boardThumbnailPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", boardThumbnailRefreshKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pictureNotes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canOpenCamera="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxImageCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
