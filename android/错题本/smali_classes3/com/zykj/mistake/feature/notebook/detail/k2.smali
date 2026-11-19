.class public final Lcom/zykj/mistake/feature/notebook/detail/k2;
.super Lcom/zykj/mistake/feature/notebook/detail/i3;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/util/List;

.field public final l:Ljava/util/List;

.field public final m:I

.field public final n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

.field public final r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;ILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;)V
    .locals 7

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    move-object/from16 v2, p15

    move-object/from16 v3, p16

    move-object/from16 v4, p17

    move-object/from16 v5, p18

    const-string v6, "tags"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "navItems"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "entryMode"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reviewPracticeSessionId"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reviewPracticeRoundId"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reviewPracticeScene"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

    .line 3
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->b:I

    .line 4
    iput-wide p3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->c:J

    .line 5
    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->d:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->e:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->f:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->g:Ljava/lang/String;

    move/from16 p1, p9

    .line 9
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->h:Z

    move/from16 p1, p10

    .line 10
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->i:Z

    move/from16 p1, p11

    .line 11
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->j:Z

    .line 12
    iput-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->k:Ljava/util/List;

    .line 13
    iput-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->l:Ljava/util/List;

    move/from16 p1, p14

    .line 14
    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    .line 15
    iput-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 16
    iput-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->o:Ljava/lang/String;

    .line 17
    iput-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    .line 18
    iput-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    move-object/from16 p1, p19

    .line 19
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/k2;

    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->b:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->c:J

    iget-wide v5, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->h:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->i:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->j:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->k:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->k:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->l:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->l:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    iget v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->o:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->o:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    iget-object v3, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    iget-object p1, p1, Lcom/zykj/mistake/feature/notebook/detail/k2;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

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
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->c:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->d:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_0
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->e:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_1
    add-int/2addr v0, v3

    .line 46
    mul-int/2addr v0, v1

    .line 47
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->f:Ljava/lang/String;

    .line 48
    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    move v3, v2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_2
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->g:Ljava/lang/String;

    .line 60
    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_3
    add-int/2addr v0, v3

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->h:Z

    .line 72
    .line 73
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->i:Z

    .line 78
    .line 79
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->j:Z

    .line 84
    .line 85
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->k:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->l:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    .line 102
    .line 103
    invoke-static {v3, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/2addr v3, v0

    .line 114
    mul-int/2addr v3, v1

    .line 115
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->o:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v3, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0, v1, v3}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    add-int/2addr v3, v0

    .line 134
    mul-int/2addr v3, v1

    .line 135
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 136
    .line 137
    if-nez v0, :cond_4

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    :goto_4
    add-int/2addr v3, v2

    .line 145
    return v3
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
    const-string v2, "Init(bookId="

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->a:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->b:I

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", subject="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", examName="

    .line 31
    .line 32
    const-string v2, ", title="

    .line 33
    .line 34
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->e:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v1, ", stemShoot="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", hasStem="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->h:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", isCustomMistake="

    .line 62
    .line 63
    const-string v2, ", isRelatedQstGroup="

    .line 64
    .line 65
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->i:Z

    .line 66
    .line 67
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->j:Z

    .line 68
    .line 69
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", tags="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", navItems="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->l:Ljava/util/List;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", navIndex="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->m:I

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", entryMode="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->n:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", reviewPracticeSessionId="

    .line 113
    .line 114
    const-string v2, ", reviewPracticeRoundId="

    .line 115
    .line 116
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->o:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->p:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v1, ", reviewPracticeScene="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->q:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", reviewPracticePoolType="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/k2;->r:Lcom/zykj/mistake/feature/review/ReviewContract$PracticePoolType;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ")"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0
.end method
