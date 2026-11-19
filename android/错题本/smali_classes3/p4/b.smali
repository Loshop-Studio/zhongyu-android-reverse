.class public final Lp4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:Lcoil3/network/g;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/util/Set;

.field public final p:Ljava/util/List;

.field public final q:I

.field public final r:I

.field public final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIJLcoil3/network/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/util/Set;Ljava/util/List;IILjava/lang/String;)V
    .locals 4

    move-object v0, p10

    move-object/from16 v1, p16

    move-object/from16 v2, p17

    const-string v3, "id"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subject"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "examName"

    invoke-static {p8, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "title"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stemShoot"

    invoke-static {p10, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "collectionIds"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tags"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp4/b;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lp4/b;->b:I

    .line 4
    iput p3, p0, Lp4/b;->c:I

    .line 5
    iput-wide p4, p0, Lp4/b;->d:J

    .line 6
    iput-object p6, p0, Lp4/b;->e:Lcoil3/network/g;

    .line 7
    iput-object p7, p0, Lp4/b;->f:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lp4/b;->g:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lp4/b;->h:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lp4/b;->i:Ljava/lang/String;

    move p1, p11

    .line 11
    iput-boolean p1, p0, Lp4/b;->j:Z

    move/from16 p1, p12

    .line 12
    iput-boolean p1, p0, Lp4/b;->k:Z

    move/from16 p1, p13

    .line 13
    iput-boolean p1, p0, Lp4/b;->l:Z

    move/from16 p1, p14

    .line 14
    iput-boolean p1, p0, Lp4/b;->m:Z

    move/from16 p1, p15

    .line 15
    iput-boolean p1, p0, Lp4/b;->n:Z

    .line 16
    iput-object v1, p0, Lp4/b;->o:Ljava/util/Set;

    .line 17
    iput-object v2, p0, Lp4/b;->p:Ljava/util/List;

    move/from16 p1, p18

    .line 18
    iput p1, p0, Lp4/b;->q:I

    move/from16 p1, p19

    .line 19
    iput p1, p0, Lp4/b;->r:I

    move-object/from16 p1, p20

    .line 20
    iput-object p1, p0, Lp4/b;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lp4/b;

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
    check-cast p1, Lp4/b;

    .line 12
    .line 13
    iget-object v1, p0, Lp4/b;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lp4/b;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Lp4/b;->b:I

    .line 25
    .line 26
    iget v3, p1, Lp4/b;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget v1, p0, Lp4/b;->c:I

    .line 32
    .line 33
    iget v3, p1, Lp4/b;->c:I

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-wide v3, p0, Lp4/b;->d:J

    .line 39
    .line 40
    iget-wide v5, p1, Lp4/b;->d:J

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
    iget-object v1, p0, Lp4/b;->e:Lcoil3/network/g;

    .line 48
    .line 49
    iget-object v3, p1, Lp4/b;->e:Lcoil3/network/g;

    .line 50
    .line 51
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lp4/b;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lp4/b;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lp4/b;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, p1, Lp4/b;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-object v1, p0, Lp4/b;->h:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v3, p1, Lp4/b;->h:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-object v1, p0, Lp4/b;->i:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v3, p1, Lp4/b;->i:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    iget-boolean v1, p0, Lp4/b;->j:Z

    .line 103
    .line 104
    iget-boolean v3, p1, Lp4/b;->j:Z

    .line 105
    .line 106
    if-eq v1, v3, :cond_b

    .line 107
    .line 108
    return v2

    .line 109
    :cond_b
    iget-boolean v1, p0, Lp4/b;->k:Z

    .line 110
    .line 111
    iget-boolean v3, p1, Lp4/b;->k:Z

    .line 112
    .line 113
    if-eq v1, v3, :cond_c

    .line 114
    .line 115
    return v2

    .line 116
    :cond_c
    iget-boolean v1, p0, Lp4/b;->l:Z

    .line 117
    .line 118
    iget-boolean v3, p1, Lp4/b;->l:Z

    .line 119
    .line 120
    if-eq v1, v3, :cond_d

    .line 121
    .line 122
    return v2

    .line 123
    :cond_d
    iget-boolean v1, p0, Lp4/b;->m:Z

    .line 124
    .line 125
    iget-boolean v3, p1, Lp4/b;->m:Z

    .line 126
    .line 127
    if-eq v1, v3, :cond_e

    .line 128
    .line 129
    return v2

    .line 130
    :cond_e
    iget-boolean v1, p0, Lp4/b;->n:Z

    .line 131
    .line 132
    iget-boolean v3, p1, Lp4/b;->n:Z

    .line 133
    .line 134
    if-eq v1, v3, :cond_f

    .line 135
    .line 136
    return v2

    .line 137
    :cond_f
    iget-object v1, p0, Lp4/b;->o:Ljava/util/Set;

    .line 138
    .line 139
    iget-object v3, p1, Lp4/b;->o:Ljava/util/Set;

    .line 140
    .line 141
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_10

    .line 146
    .line 147
    return v2

    .line 148
    :cond_10
    iget-object v1, p0, Lp4/b;->p:Ljava/util/List;

    .line 149
    .line 150
    iget-object v3, p1, Lp4/b;->p:Ljava/util/List;

    .line 151
    .line 152
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-nez v1, :cond_11

    .line 157
    .line 158
    return v2

    .line 159
    :cond_11
    iget v1, p0, Lp4/b;->q:I

    .line 160
    .line 161
    iget v3, p1, Lp4/b;->q:I

    .line 162
    .line 163
    if-eq v1, v3, :cond_12

    .line 164
    .line 165
    return v2

    .line 166
    :cond_12
    iget v1, p0, Lp4/b;->r:I

    .line 167
    .line 168
    iget v3, p1, Lp4/b;->r:I

    .line 169
    .line 170
    if-eq v1, v3, :cond_13

    .line 171
    .line 172
    return v2

    .line 173
    :cond_13
    iget-object v1, p0, Lp4/b;->s:Ljava/lang/String;

    .line 174
    .line 175
    iget-object p1, p1, Lp4/b;->s:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_14

    .line 182
    .line 183
    return v2

    .line 184
    :cond_14
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/b;->a:Ljava/lang/String;

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
    iget v2, p0, Lp4/b;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lp4/b;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lp4/b;->d:J

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lp4/b;->e:Lcoil3/network/g;

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
    iget-object v0, p0, Lp4/b;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lp4/b;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, Lp4/b;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, Lp4/b;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v2, p0, Lp4/b;->j:Z

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, Lp4/b;->k:Z

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, Lp4/b;->l:Z

    .line 73
    .line 74
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean v2, p0, Lp4/b;->m:Z

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, Lp4/b;->n:Z

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, Lp4/b;->o:Ljava/util/Set;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v0

    .line 97
    mul-int/2addr v2, v1

    .line 98
    iget-object v0, p0, Lp4/b;->p:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v0, v2, v1}, Landroidx/collection/a;->h(Ljava/util/List;II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget v2, p0, Lp4/b;->q:I

    .line 105
    .line 106
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget v2, p0, Lp4/b;->r:I

    .line 111
    .line 112
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget-object v1, p0, Lp4/b;->s:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/2addr v1, v0

    .line 123
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MistakeItemUiState(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp4/b;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", bookId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lp4/b;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", itemId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Lp4/b;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", topicId="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, Lp4/b;->d:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", stem="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lp4/b;->e:Lcoil3/network/g;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", subject="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lp4/b;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", examName="

    .line 64
    .line 65
    const-string v2, ", title="

    .line 66
    .line 67
    iget-object v3, p0, Lp4/b;->g:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v4, p0, Lp4/b;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v1, ", stemShoot="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lp4/b;->i:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", isCustomMistake="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-boolean v1, p0, Lp4/b;->j:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", isRelatedQstGroup="

    .line 95
    .line 96
    const-string v2, ", hasStem="

    .line 97
    .line 98
    iget-boolean v3, p0, Lp4/b;->k:Z

    .line 99
    .line 100
    iget-boolean v4, p0, Lp4/b;->l:Z

    .line 101
    .line 102
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 103
    .line 104
    .line 105
    const-string v1, ", isMastered="

    .line 106
    .line 107
    const-string v2, ", isInCurrentCollection="

    .line 108
    .line 109
    iget-boolean v3, p0, Lp4/b;->m:Z

    .line 110
    .line 111
    iget-boolean v4, p0, Lp4/b;->n:Z

    .line 112
    .line 113
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 114
    .line 115
    .line 116
    const-string v1, ", collectionIds="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lp4/b;->o:Ljava/util/Set;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ", tags="

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lp4/b;->p:Ljava/util/List;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ", rightCount="

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget v1, p0, Lp4/b;->q:I

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v1, ", wrongCount="

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget v1, p0, Lp4/b;->r:I

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v1, ", addTime="

    .line 157
    .line 158
    const-string v2, ")"

    .line 159
    .line 160
    iget-object v3, p0, Lp4/b;->s:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v1, v3, v2}, Landroid/support/v4/media/f;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0
.end method
