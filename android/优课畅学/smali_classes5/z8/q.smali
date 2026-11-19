.class public Lz8/q;
.super Lz8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8/q$a;,
        Lz8/q$b;
    }
.end annotation


# instance fields
.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public P:F

.field public Q:F

.field public R:J

.field public S:J

.field public T:I

.field public U:I

.field public V:I

.field public W:J

.field public X:[F

.field public Y:[Lz8/q$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz8/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    iput-object v0, p0, Lz8/q;->X:[F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public E([[F)V
    .locals 9

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    aget v3, v2, v1

    .line 8
    .line 9
    iput v3, p0, Lz8/q;->L:F

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget v2, v2, v3

    .line 13
    .line 14
    iput v2, p0, Lz8/q;->M:F

    .line 15
    .line 16
    sub-int/2addr v0, v3

    .line 17
    aget-object v0, p1, v0

    .line 18
    .line 19
    aget v2, v0, v1

    .line 20
    .line 21
    iput v2, p0, Lz8/q;->N:F

    .line 22
    .line 23
    aget v0, v0, v3

    .line 24
    .line 25
    iput v0, p0, Lz8/q;->O:F

    .line 26
    .line 27
    array-length v0, p1

    .line 28
    if-le v0, v3, :cond_3

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    sub-int/2addr v0, v3

    .line 32
    new-array v0, v0, [Lz8/q$a;

    .line 33
    .line 34
    iput-object v0, p0, Lz8/q;->Y:[Lz8/q$a;

    .line 35
    .line 36
    move v0, v1

    .line 37
    :goto_0
    iget-object v2, p0, Lz8/q;->Y:[Lz8/q$a;

    .line 38
    .line 39
    array-length v4, v2

    .line 40
    if-ge v0, v4, :cond_0

    .line 41
    .line 42
    new-instance v4, Lz8/q$a;

    .line 43
    .line 44
    invoke-direct {v4, p0}, Lz8/q$a;-><init>(Lz8/q;)V

    .line 45
    .line 46
    .line 47
    aput-object v4, v2, v0

    .line 48
    .line 49
    iget-object v2, p0, Lz8/q;->Y:[Lz8/q$a;

    .line 50
    .line 51
    aget-object v2, v2, v0

    .line 52
    .line 53
    new-instance v4, Lz8/q$b;

    .line 54
    .line 55
    aget-object v5, p1, v0

    .line 56
    .line 57
    aget v6, v5, v1

    .line 58
    .line 59
    aget v5, v5, v3

    .line 60
    .line 61
    invoke-direct {v4, p0, v6, v5}, Lz8/q$b;-><init>(Lz8/q;FF)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Lz8/q$b;

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    aget-object v6, p1, v0

    .line 69
    .line 70
    aget v7, v6, v1

    .line 71
    .line 72
    aget v6, v6, v3

    .line 73
    .line 74
    invoke-direct {v5, p0, v7, v6}, Lz8/q$b;-><init>(Lz8/q;FF)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4, v5}, Lz8/q$a;->d(Lz8/q$b;Lz8/q$b;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    array-length p1, v2

    .line 82
    const/4 v0, 0x0

    .line 83
    move v3, v1

    .line 84
    :goto_1
    if-ge v3, p1, :cond_1

    .line 85
    .line 86
    aget-object v4, v2, v3

    .line 87
    .line 88
    invoke-virtual {v4}, Lz8/q$a;->b()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    add-float/2addr v0, v4

    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    iget-object p1, p0, Lz8/q;->Y:[Lz8/q$a;

    .line 97
    .line 98
    array-length v2, p1

    .line 99
    const/4 v3, 0x0

    .line 100
    :goto_2
    if-ge v1, v2, :cond_3

    .line 101
    .line 102
    aget-object v4, p1, v1

    .line 103
    .line 104
    invoke-virtual {v4}, Lz8/q$a;->b()F

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    div-float/2addr v5, v0

    .line 109
    iget-wide v6, p0, Lz8/q;->R:J

    .line 110
    .line 111
    long-to-float v6, v6

    .line 112
    mul-float/2addr v5, v6

    .line 113
    float-to-long v5, v5

    .line 114
    iput-wide v5, v4, Lz8/q$a;->c:J

    .line 115
    .line 116
    if-nez v3, :cond_2

    .line 117
    .line 118
    const-wide/16 v7, 0x0

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_2
    iget-wide v7, v3, Lz8/q$a;->e:J

    .line 122
    .line 123
    :goto_3
    iput-wide v7, v4, Lz8/q$a;->d:J

    .line 124
    .line 125
    add-long/2addr v7, v5

    .line 126
    iput-wide v7, v4, Lz8/q$a;->e:J

    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    move-object v3, v4

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    return-void
.end method

.method public F(FFFFJJ)V
    .locals 0

    .line 1
    iput p1, p0, Lz8/q;->L:F

    .line 2
    .line 3
    iput p2, p0, Lz8/q;->M:F

    .line 4
    .line 5
    iput p3, p0, Lz8/q;->N:F

    .line 6
    .line 7
    iput p4, p0, Lz8/q;->O:F

    .line 8
    .line 9
    sub-float/2addr p3, p1

    .line 10
    iput p3, p0, Lz8/q;->P:F

    .line 11
    .line 12
    sub-float/2addr p4, p2

    .line 13
    iput p4, p0, Lz8/q;->Q:F

    .line 14
    .line 15
    iput-wide p5, p0, Lz8/q;->R:J

    .line 16
    .line 17
    iput-wide p7, p0, Lz8/q;->S:J

    .line 18
    .line 19
    return-void
.end method

.method public d()F
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/q;->X:[F

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public g()F
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/q;->X:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public h(Lz8/m;J)[F
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lz8/c;->q()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    invoke-virtual {v0}, Lz8/c;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    sub-long v3, p2, v3

    .line 16
    .line 17
    iget-wide v5, v0, Lz8/q;->W:J

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    cmp-long v1, v5, v7

    .line 22
    .line 23
    if-lez v1, :cond_2

    .line 24
    .line 25
    iget v1, v0, Lz8/q;->V:I

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    cmp-long v9, v3, v5

    .line 30
    .line 31
    if-ltz v9, :cond_1

    .line 32
    .line 33
    iget v1, v0, Lz8/q;->U:I

    .line 34
    .line 35
    iput v1, v0, Lz8/c;->E:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    long-to-float v9, v3

    .line 39
    long-to-float v5, v5

    .line 40
    div-float/2addr v9, v5

    .line 41
    int-to-float v1, v1

    .line 42
    mul-float/2addr v1, v9

    .line 43
    float-to-int v1, v1

    .line 44
    iget v5, v0, Lz8/q;->T:I

    .line 45
    .line 46
    add-int/2addr v5, v1

    .line 47
    iput v5, v0, Lz8/c;->E:I

    .line 48
    .line 49
    :cond_2
    :goto_0
    iget v1, v0, Lz8/q;->L:F

    .line 50
    .line 51
    iget v5, v0, Lz8/q;->M:F

    .line 52
    .line 53
    iget-wide v9, v0, Lz8/q;->S:J

    .line 54
    .line 55
    sub-long v9, v3, v9

    .line 56
    .line 57
    iget-wide v11, v0, Lz8/q;->R:J

    .line 58
    .line 59
    cmp-long v6, v11, v7

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    if-lez v6, :cond_8

    .line 63
    .line 64
    cmp-long v6, v9, v7

    .line 65
    .line 66
    if-ltz v6, :cond_8

    .line 67
    .line 68
    cmp-long v6, v9, v11

    .line 69
    .line 70
    if-gtz v6, :cond_8

    .line 71
    .line 72
    long-to-float v6, v9

    .line 73
    long-to-float v7, v11

    .line 74
    div-float/2addr v6, v7

    .line 75
    iget-object v7, v0, Lz8/q;->Y:[Lz8/q$a;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    array-length v6, v7

    .line 81
    move v11, v13

    .line 82
    :goto_1
    if-ge v11, v6, :cond_4

    .line 83
    .line 84
    aget-object v12, v7, v11

    .line 85
    .line 86
    iget-wide v14, v12, Lz8/q$a;->d:J

    .line 87
    .line 88
    cmp-long v14, v9, v14

    .line 89
    .line 90
    if-ltz v14, :cond_3

    .line 91
    .line 92
    iget-wide v14, v12, Lz8/q$a;->e:J

    .line 93
    .line 94
    cmp-long v14, v9, v14

    .line 95
    .line 96
    if-gez v14, :cond_3

    .line 97
    .line 98
    move-object v2, v12

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    iget-object v1, v12, Lz8/q$a;->b:Lz8/q$b;

    .line 101
    .line 102
    iget v5, v1, Lz8/q$b;->a:F

    .line 103
    .line 104
    iget v1, v1, Lz8/q$b;->b:F

    .line 105
    .line 106
    add-int/lit8 v11, v11, 0x1

    .line 107
    .line 108
    move/from16 v16, v5

    .line 109
    .line 110
    move v5, v1

    .line 111
    move/from16 v1, v16

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    :goto_2
    if-eqz v2, :cond_9

    .line 115
    .line 116
    iget v6, v2, Lz8/q$a;->f:F

    .line 117
    .line 118
    iget v7, v2, Lz8/q$a;->g:F

    .line 119
    .line 120
    iget-wide v9, v2, Lz8/q$a;->d:J

    .line 121
    .line 122
    sub-long/2addr v3, v9

    .line 123
    long-to-float v3, v3

    .line 124
    iget-wide v9, v2, Lz8/q$a;->c:J

    .line 125
    .line 126
    long-to-float v4, v9

    .line 127
    div-float/2addr v3, v4

    .line 128
    iget-object v2, v2, Lz8/q$a;->a:Lz8/q$b;

    .line 129
    .line 130
    iget v4, v2, Lz8/q$b;->a:F

    .line 131
    .line 132
    iget v2, v2, Lz8/q$b;->b:F

    .line 133
    .line 134
    cmpl-float v9, v6, v8

    .line 135
    .line 136
    if-eqz v9, :cond_5

    .line 137
    .line 138
    mul-float/2addr v6, v3

    .line 139
    add-float v1, v4, v6

    .line 140
    .line 141
    :cond_5
    cmpl-float v4, v7, v8

    .line 142
    .line 143
    if-eqz v4, :cond_9

    .line 144
    .line 145
    mul-float/2addr v7, v3

    .line 146
    add-float/2addr v2, v7

    .line 147
    move v5, v2

    .line 148
    goto :goto_3

    .line 149
    :cond_6
    iget v2, v0, Lz8/q;->P:F

    .line 150
    .line 151
    cmpl-float v3, v2, v8

    .line 152
    .line 153
    if-eqz v3, :cond_7

    .line 154
    .line 155
    mul-float/2addr v2, v6

    .line 156
    add-float/2addr v1, v2

    .line 157
    :cond_7
    iget v2, v0, Lz8/q;->Q:F

    .line 158
    .line 159
    cmpl-float v3, v2, v8

    .line 160
    .line 161
    if-eqz v3, :cond_9

    .line 162
    .line 163
    mul-float/2addr v2, v6

    .line 164
    add-float/2addr v5, v2

    .line 165
    goto :goto_3

    .line 166
    :cond_8
    cmp-long v2, v9, v11

    .line 167
    .line 168
    if-lez v2, :cond_9

    .line 169
    .line 170
    iget v1, v0, Lz8/q;->N:F

    .line 171
    .line 172
    iget v5, v0, Lz8/q;->O:F

    .line 173
    .line 174
    :cond_9
    :goto_3
    iget-object v2, v0, Lz8/q;->X:[F

    .line 175
    .line 176
    aput v1, v2, v13

    .line 177
    .line 178
    const/4 v3, 0x1

    .line 179
    aput v5, v2, v3

    .line 180
    .line 181
    iget v4, v0, Lz8/c;->o:F

    .line 182
    .line 183
    add-float/2addr v1, v4

    .line 184
    const/4 v4, 0x2

    .line 185
    aput v1, v2, v4

    .line 186
    .line 187
    iget v1, v0, Lz8/c;->p:F

    .line 188
    .line 189
    add-float/2addr v5, v1

    .line 190
    const/4 v1, 0x3

    .line 191
    aput v5, v2, v1

    .line 192
    .line 193
    invoke-virtual {v0}, Lz8/c;->s()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    xor-int/2addr v1, v3

    .line 198
    invoke-virtual {v0, v1}, Lz8/c;->D(Z)V

    .line 199
    .line 200
    .line 201
    iget-object v1, v0, Lz8/q;->X:[F

    .line 202
    .line 203
    return-object v1
.end method

.method public i()F
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/q;->X:[F

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public l()F
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/q;->X:[F

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    return v0
.end method

.method public y(Lz8/m;FF)V
    .locals 0

    .line 1
    iget-object p2, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    iget-wide p2, p2, Lz8/e;->a:J

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lz8/q;->h(Lz8/m;J)[F

    .line 6
    .line 7
    .line 8
    return-void
.end method
