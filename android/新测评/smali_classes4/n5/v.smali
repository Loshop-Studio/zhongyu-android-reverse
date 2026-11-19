.class public final Ln5/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:Lcom/zykj/evaluation/bean/UploadData;

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/util/List;

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V
    .locals 1

    .line 1
    const-string v0, "draftUploadData"

    .line 2
    .line 3
    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "answerUploadDataList"

    .line 7
    .line 8
    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "commitTaskReqList"

    .line 12
    .line 13
    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Ln5/v;->a:J

    .line 20
    .line 21
    iput-wide p3, p0, Ln5/v;->b:J

    .line 22
    .line 23
    iput p5, p0, Ln5/v;->c:I

    .line 24
    .line 25
    iput-wide p6, p0, Ln5/v;->d:J

    .line 26
    .line 27
    iput-object p8, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 28
    .line 29
    iput-object p9, p0, Ln5/v;->f:Ljava/util/List;

    .line 30
    .line 31
    iput-boolean p10, p0, Ln5/v;->g:Z

    .line 32
    .line 33
    iput-boolean p11, p0, Ln5/v;->h:Z

    .line 34
    .line 35
    iput-object p12, p0, Ln5/v;->i:Ljava/util/List;

    .line 36
    .line 37
    iput p13, p0, Ln5/v;->j:I

    .line 38
    .line 39
    return-void
.end method

.method public static synthetic b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 1
    iget-wide v1, p0, Ln5/v;->a:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, p0, Ln5/v;->b:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    iget v5, p0, Ln5/v;->c:I

    goto :goto_2

    :cond_2
    move/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, p0, Ln5/v;->d:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p6

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    iget-object v8, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p8

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    iget-object v9, p0, Ln5/v;->f:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p9

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    iget-boolean v10, p0, Ln5/v;->g:Z

    goto :goto_6

    :cond_6
    move/from16 v10, p10

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    iget-boolean v11, p0, Ln5/v;->h:Z

    goto :goto_7

    :cond_7
    move/from16 v11, p11

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    iget-object v12, p0, Ln5/v;->i:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p12

    :goto_8
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    iget v0, p0, Ln5/v;->j:I

    move/from16 p14, v0

    :goto_9
    move-object p1, p0

    move-wide p2, v1

    move-wide/from16 p4, v3

    move/from16 p6, v5

    move-wide/from16 p7, v6

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move-object/from16 p13, v12

    goto :goto_a

    :cond_9
    move/from16 p14, p13

    goto :goto_9

    :goto_a
    invoke-virtual/range {p1 .. p14}, Ln5/v;->a(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)Ln5/v;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)Ln5/v;
    .locals 15

    .line 1
    const-string v0, "draftUploadData"

    .line 2
    .line 3
    move-object/from16 v9, p8

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "answerUploadDataList"

    .line 9
    .line 10
    move-object/from16 v10, p9

    .line 11
    .line 12
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "commitTaskReqList"

    .line 16
    .line 17
    move-object/from16 v13, p12

    .line 18
    .line 19
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ln5/v;

    .line 23
    .line 24
    move-wide/from16 v2, p1

    .line 25
    .line 26
    move-wide/from16 v4, p3

    .line 27
    .line 28
    move/from16 v6, p5

    .line 29
    .line 30
    move-wide/from16 v7, p6

    .line 31
    .line 32
    move/from16 v11, p10

    .line 33
    .line 34
    move/from16 v12, p11

    .line 35
    .line 36
    move/from16 v14, p13

    .line 37
    .line 38
    invoke-direct/range {v1 .. v14}, Ln5/v;-><init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/v;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Ln5/v;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/v;->i:Ljava/util/List;

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
    instance-of v1, p1, Ln5/v;

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
    check-cast p1, Ln5/v;

    .line 12
    .line 13
    iget-wide v3, p0, Ln5/v;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Ln5/v;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-wide v3, p0, Ln5/v;->b:J

    .line 23
    .line 24
    iget-wide v5, p1, Ln5/v;->b:J

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, Ln5/v;->c:I

    .line 32
    .line 33
    iget v3, p1, Ln5/v;->c:I

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-wide v3, p0, Ln5/v;->d:J

    .line 39
    .line 40
    iget-wide v5, p1, Ln5/v;->d:J

    .line 41
    .line 42
    cmp-long v1, v3, v5

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget-object v1, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 48
    .line 49
    iget-object v3, p1, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-object v1, p0, Ln5/v;->f:Ljava/util/List;

    .line 59
    .line 60
    iget-object v3, p1, Ln5/v;->f:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-boolean v1, p0, Ln5/v;->g:Z

    .line 70
    .line 71
    iget-boolean v3, p1, Ln5/v;->g:Z

    .line 72
    .line 73
    if-eq v1, v3, :cond_8

    .line 74
    .line 75
    return v2

    .line 76
    :cond_8
    iget-boolean v1, p0, Ln5/v;->h:Z

    .line 77
    .line 78
    iget-boolean v3, p1, Ln5/v;->h:Z

    .line 79
    .line 80
    if-eq v1, v3, :cond_9

    .line 81
    .line 82
    return v2

    .line 83
    :cond_9
    iget-object v1, p0, Ln5/v;->i:Ljava/util/List;

    .line 84
    .line 85
    iget-object v3, p1, Ln5/v;->i:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget v1, p0, Ln5/v;->j:I

    .line 95
    .line 96
    iget p1, p1, Ln5/v;->j:I

    .line 97
    .line 98
    if-eq v1, p1, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    return v0
.end method

.method public final f()Lcom/zykj/evaluation/bean/UploadData;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/v;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/v;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Ln5/v;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Ln5/v;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    iget v1, p0, Ln5/v;->c:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-wide v1, p0, Ln5/v;->d:J

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
    iget-object v1, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/UploadData;->hashCode()I

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
    iget-object v1, p0, Ln5/v;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-boolean v1, p0, Ln5/v;->g:Z

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-boolean v1, p0, Ln5/v;->h:Z

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-object v1, p0, Ln5/v;->i:Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget v1, p0, Ln5/v;->j:I

    .line 82
    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    return v0
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Ln5/v;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ln5/v;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln5/v;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln5/v;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-wide v0, p0, Ln5/v;->a:J

    .line 2
    .line 3
    iget-wide v2, p0, Ln5/v;->b:J

    .line 4
    .line 5
    iget v4, p0, Ln5/v;->c:I

    .line 6
    .line 7
    iget-wide v5, p0, Ln5/v;->d:J

    .line 8
    .line 9
    iget-object v7, p0, Ln5/v;->e:Lcom/zykj/evaluation/bean/UploadData;

    .line 10
    .line 11
    iget-object v8, p0, Ln5/v;->f:Ljava/util/List;

    .line 12
    .line 13
    iget-boolean v9, p0, Ln5/v;->g:Z

    .line 14
    .line 15
    iget-boolean v10, p0, Ln5/v;->h:Z

    .line 16
    .line 17
    iget-object v11, p0, Ln5/v;->i:Ljava/util/List;

    .line 18
    .line 19
    iget v12, p0, Ln5/v;->j:I

    .line 20
    .line 21
    new-instance v13, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v14, "UploadQuestion(userId="

    .line 27
    .line 28
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v13, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", taskId="

    .line 35
    .line 36
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ", taskState="

    .line 43
    .line 44
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ", questionId="

    .line 51
    .line 52
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ", draftUploadData="

    .line 59
    .line 60
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, ", answerUploadDataList="

    .line 67
    .line 68
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ", isTodo="

    .line 75
    .line 76
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", isGroup="

    .line 83
    .line 84
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", commitTaskReqList="

    .line 91
    .line 92
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", commitState="

    .line 99
    .line 100
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, ")"

    .line 107
    .line 108
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method
