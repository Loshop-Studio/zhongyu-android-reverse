.class public final Lcom/zykj/mistake/feature/review/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:I

.field public final n:Z

.field public final o:Ljava/lang/Integer;

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/String;IZLjava/lang/Integer;IIIIZ)V
    .locals 1

    .line 1
    const-string v0, "studentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "summaryText"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "recommendDescription"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "strengtheningDescription"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "consolidatingDescription"

    .line 22
    .line 23
    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "masteredDescription"

    .line 27
    .line 28
    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    .line 39
    .line 40
    iput p4, p0, Lcom/zykj/mistake/feature/review/k;->d:I

    .line 41
    .line 42
    iput-boolean p5, p0, Lcom/zykj/mistake/feature/review/k;->e:Z

    .line 43
    .line 44
    iput-object p6, p0, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    .line 45
    .line 46
    iput p7, p0, Lcom/zykj/mistake/feature/review/k;->g:I

    .line 47
    .line 48
    iput-boolean p8, p0, Lcom/zykj/mistake/feature/review/k;->h:Z

    .line 49
    .line 50
    iput-object p9, p0, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    .line 51
    .line 52
    iput p10, p0, Lcom/zykj/mistake/feature/review/k;->j:I

    .line 53
    .line 54
    iput-boolean p11, p0, Lcom/zykj/mistake/feature/review/k;->k:Z

    .line 55
    .line 56
    iput-object p12, p0, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    .line 57
    .line 58
    iput p13, p0, Lcom/zykj/mistake/feature/review/k;->m:I

    .line 59
    .line 60
    move p1, p14

    .line 61
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/review/k;->n:Z

    .line 62
    .line 63
    move-object/from16 p1, p15

    .line 64
    .line 65
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    .line 66
    .line 67
    move/from16 p1, p16

    .line 68
    .line 69
    iput p1, p0, Lcom/zykj/mistake/feature/review/k;->p:I

    .line 70
    .line 71
    move/from16 p1, p17

    .line 72
    .line 73
    iput p1, p0, Lcom/zykj/mistake/feature/review/k;->q:I

    .line 74
    .line 75
    move/from16 p1, p18

    .line 76
    .line 77
    iput p1, p0, Lcom/zykj/mistake/feature/review/k;->r:I

    .line 78
    .line 79
    move/from16 p1, p19

    .line 80
    .line 81
    iput p1, p0, Lcom/zykj/mistake/feature/review/k;->s:I

    .line 82
    .line 83
    move/from16 p1, p20

    .line 84
    .line 85
    iput-boolean p1, p0, Lcom/zykj/mistake/feature/review/k;->t:Z

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/feature/review/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/feature/review/k;

    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->d:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->e:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/review/k;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->g:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->h:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/review/k;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->j:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->j:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->k:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/review/k;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->m:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->n:Z

    iget-boolean v3, p1, Lcom/zykj/mistake/feature/review/k;->n:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->p:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->p:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->q:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->q:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->r:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->r:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->s:I

    iget v3, p1, Lcom/zykj/mistake/feature/review/k;->s:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->t:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/feature/review/k;->t:Z

    if-eq v1, p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/k;->e:Z

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/k;->h:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/k;->k:Z

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->m:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/review/k;->n:Z

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    .line 89
    .line 90
    if-nez v2, :cond_0

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    :goto_0
    add-int/2addr v0, v2

    .line 99
    mul-int/2addr v0, v1

    .line 100
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->p:I

    .line 101
    .line 102
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->q:I

    .line 107
    .line 108
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->r:I

    .line 113
    .line 114
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget v2, p0, Lcom/zykj/mistake/feature/review/k;->s:I

    .line 119
    .line 120
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->t:Z

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/2addr v1, v0

    .line 131
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", summaryText="

    .line 2
    .line 3
    const-string v1, ", recommendDescription="

    .line 4
    .line 5
    const-string v2, "ReviewHomeData(studentName="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/review/k;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/mistake/feature/review/k;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Landroid/support/v4/media/f;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", recommendPracticeCount="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->d:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", recommendCanPractice="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->e:Z

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", strengtheningDescription="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", strengtheningCount="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->g:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", strengtheningCanPractice="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->h:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", consolidatingDescription="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", consolidatingCount="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->j:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", consolidatingCanPractice="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->k:Z

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", masteredDescription="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->l:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", masteredCount="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->m:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ", masteredCanPractice="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->n:Z

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", recent7AddedMistakeCount="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/zykj/mistake/feature/review/k;->o:Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", recent7PracticeCount="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->p:I

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", recent7PracticeDays="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, ", recent7EnterConsolidatingCount="

    .line 156
    .line 157
    const-string v2, ", recent7EnterMasteredCount="

    .line 158
    .line 159
    iget v3, p0, Lcom/zykj/mistake/feature/review/k;->q:I

    .line 160
    .line 161
    iget v4, p0, Lcom/zykj/mistake/feature/review/k;->r:I

    .line 162
    .line 163
    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget v1, p0, Lcom/zykj/mistake/feature/review/k;->s:I

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", shouldDefaultReviewTab="

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/k;->t:Z

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v1, ")"

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0
.end method
