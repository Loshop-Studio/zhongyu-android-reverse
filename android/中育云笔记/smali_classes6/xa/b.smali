.class public final Lxa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Lcom/zykj/download/DownloadFlag;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)V
    .locals 1

    .line 1
    const-string v0, "downloadUrl"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localPath"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "flag"

    .line 12
    .line 13
    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput p1, p0, Lxa/b;->a:I

    .line 20
    .line 21
    iput-object p2, p0, Lxa/b;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lxa/b;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-wide p4, p0, Lxa/b;->d:J

    .line 26
    .line 27
    iput-wide p6, p0, Lxa/b;->e:J

    .line 28
    .line 29
    iput-object p8, p0, Lxa/b;->f:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p9, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic b(Lxa/b;ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;ILjava/lang/Object;)Lxa/b;
    .locals 0

    .line 1
    and-int/lit8 p11, p10, 0x1

    .line 2
    .line 3
    if-eqz p11, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lxa/b;->a:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x2

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lxa/b;->b:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p11, p10, 0x4

    .line 14
    .line 15
    if-eqz p11, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lxa/b;->c:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p11, p10, 0x8

    .line 20
    .line 21
    if-eqz p11, :cond_3

    .line 22
    .line 23
    iget-wide p4, p0, Lxa/b;->d:J

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p11, p10, 0x10

    .line 26
    .line 27
    if-eqz p11, :cond_4

    .line 28
    .line 29
    iget-wide p6, p0, Lxa/b;->e:J

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p11, p10, 0x20

    .line 32
    .line 33
    if-eqz p11, :cond_5

    .line 34
    .line 35
    iget-object p8, p0, Lxa/b;->f:Ljava/lang/String;

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p10, p10, 0x40

    .line 38
    .line 39
    if-eqz p10, :cond_6

    .line 40
    .line 41
    iget-object p9, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 42
    .line 43
    :cond_6
    move-object p10, p8

    .line 44
    move-object p11, p9

    .line 45
    move-wide p8, p6

    .line 46
    move-wide p6, p4

    .line 47
    move-object p4, p2

    .line 48
    move-object p5, p3

    .line 49
    move-object p2, p0

    .line 50
    move p3, p1

    .line 51
    invoke-virtual/range {p2 .. p11}, Lxa/b;->a(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)Lxa/b;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)Lxa/b;
    .locals 11

    .line 1
    const-string v0, "downloadUrl"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localPath"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "flag"

    .line 12
    .line 13
    move-object/from16 v10, p9

    .line 14
    .line 15
    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lxa/b;

    .line 19
    .line 20
    move v2, p1

    .line 21
    move-object v3, p2

    .line 22
    move-object v4, p3

    .line 23
    move-wide v5, p4

    .line 24
    move-wide/from16 v7, p6

    .line 25
    .line 26
    move-object/from16 v9, p8

    .line 27
    .line 28
    invoke-direct/range {v1 .. v10}, Lxa/b;-><init>(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lcom/zykj/download/DownloadFlag;)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxa/b;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lcom/zykj/download/DownloadFlag;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxa/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lxa/b;

    .line 12
    .line 13
    iget v1, p0, Lxa/b;->a:I

    .line 14
    .line 15
    iget v3, p1, Lxa/b;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lxa/b;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lxa/b;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lxa/b;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lxa/b;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, Lxa/b;->d:J

    .line 43
    .line 44
    iget-wide v5, p1, Lxa/b;->d:J

    .line 45
    .line 46
    cmp-long v1, v3, v5

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-wide v3, p0, Lxa/b;->e:J

    .line 52
    .line 53
    iget-wide v5, p1, Lxa/b;->e:J

    .line 54
    .line 55
    cmp-long v1, v3, v5

    .line 56
    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, Lxa/b;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v3, p1, Lxa/b;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 72
    .line 73
    iget-object p1, p1, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 74
    .line 75
    if-eq v1, p1, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lxa/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lxa/b;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lxa/b;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lxa/b;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lxa/b;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-wide v1, p0, Lxa/b;->d:J

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-wide v1, p0, Lxa/b;->e:J

    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lxa/b;->f:Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_0
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-object v1, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/b;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lxa/b;->e:J

    .line 2
    .line 3
    return-void
.end method

.method public final k(Lcom/zykj/download/DownloadFlag;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 7
    .line 8
    return-void
.end method

.method public final l(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lxa/b;->d:J

    .line 2
    .line 3
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa/b;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "DownloadEntity(id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lxa/b;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", downloadUrl="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lxa/b;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", localPath="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lxa/b;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", totalSize="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-wide v1, p0, Lxa/b;->d:J

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", downloadSize="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-wide v1, p0, Lxa/b;->e:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", verifyCode="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lxa/b;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", flag="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lxa/b;->g:Lcom/zykj/download/DownloadFlag;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/16 v1, 0x29

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method
