.class public final Lt9/b;
.super Lt9/a;
.source "SourceFile"


# instance fields
.field public final s:Ljava/util/ArrayList;

.field public final t:Landroid/graphics/RectF;

.field public u:Z


# direct methods
.method public constructor <init>(Lr9/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lt9/a;-><init>(Lr9/b;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lt9/b;->t:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {p0}, Lt9/b;->T()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lt9/b;->S()V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public F(FF)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v2, v1, [F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput p1, v2, v3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput p2, v2, v4

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 19
    .line 20
    .line 21
    aget v5, v2, v3

    .line 22
    .line 23
    aget v2, v2, v4

    .line 24
    .line 25
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v6}, Lq9/b;->H()F

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v6, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 38
    .line 39
    sget-object v7, Ls9/c$d;->c:Ls9/c$d;

    .line 40
    .line 41
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    new-instance v6, Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    int-to-float v8, v1

    .line 58
    div-float v9, v0, v8

    .line 59
    .line 60
    sub-float/2addr v7, v9

    .line 61
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    iget v10, v10, Landroid/graphics/RectF;->top:F

    .line 66
    .line 67
    const/4 v11, 0x5

    .line 68
    int-to-float v11, v11

    .line 69
    mul-float/2addr v11, v0

    .line 70
    div-float/2addr v11, v8

    .line 71
    sub-float/2addr v10, v11

    .line 72
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v11}, Landroid/graphics/RectF;->centerX()F

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    add-float/2addr v11, v9

    .line 81
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iget v9, v9, Landroid/graphics/RectF;->top:F

    .line 86
    .line 87
    const/4 v12, 0x3

    .line 88
    int-to-float v12, v12

    .line 89
    mul-float/2addr v12, v0

    .line 90
    div-float/2addr v12, v8

    .line 91
    sub-float/2addr v9, v12

    .line 92
    invoke-direct {v6, v7, v10, v11, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_0

    .line 100
    .line 101
    sget-object p1, Ls9/b$g;->a:Ls9/b$g;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 104
    .line 105
    .line 106
    return v4

    .line 107
    :cond_0
    iget-object v6, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 108
    .line 109
    sget-object v7, Ls9/c$e;->c:Ls9/c$e;

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_1

    .line 116
    .line 117
    new-instance v6, Landroid/graphics/RectF;

    .line 118
    .line 119
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 124
    .line 125
    int-to-float v1, v1

    .line 126
    div-float/2addr v0, v1

    .line 127
    sub-float/2addr v7, v0

    .line 128
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 133
    .line 134
    sub-float/2addr v1, v0

    .line 135
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    iget v8, v8, Landroid/graphics/RectF;->right:F

    .line 140
    .line 141
    add-float/2addr v8, v0

    .line 142
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 147
    .line 148
    add-float/2addr v9, v0

    .line 149
    invoke-direct {v6, v7, v1, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_1

    .line 157
    .line 158
    sget-object p1, Ls9/b$h;->a:Ls9/b$h;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 161
    .line 162
    .line 163
    return v4

    .line 164
    :cond_1
    invoke-virtual {p0}, Lt9/a;->s()Landroid/graphics/RectF;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0, v5, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_2

    .line 173
    .line 174
    sget-object p1, Ls9/b$b;->a:Ls9/b$b;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 177
    .line 178
    .line 179
    return v4

    .line 180
    :cond_2
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_3

    .line 193
    .line 194
    new-instance p1, Ls9/b$d;

    .line 195
    .line 196
    invoke-direct {p1, v3}, Ls9/b$d;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 200
    .line 201
    .line 202
    return v4

    .line 203
    :cond_3
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, Lt9/a;->I(Ls9/b;)V

    .line 206
    .line 207
    .line 208
    return v3
.end method

.method public H()V
    .locals 1

    .line 1
    invoke-super {p0}, Lt9/a;->H()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lt9/b;->U(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lt9/b;->T()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public R()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lt9/a;->j()Lt9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lt9/d;->b()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget-object v2, p0, Lt9/b;->t:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 18
    .line 19
    add-float/2addr v1, v2

    .line 20
    const/high16 v2, 0x41700000    # 15.0f

    .line 21
    .line 22
    sub-float/2addr v1, v2

    .line 23
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 34
    .line 35
    iget-object v5, p0, Lt9/b;->t:Landroid/graphics/RectF;

    .line 36
    .line 37
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 38
    .line 39
    add-float/2addr v4, v5

    .line 40
    add-float/2addr v4, v2

    .line 41
    invoke-virtual {p0}, Lt9/a;->q()Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5}, Lq9/b;->E()F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    add-float/2addr v2, v5

    .line 56
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final S()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x41c80000    # 25.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 17
    .line 18
    invoke-virtual {v1}, Ls9/c;->a()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 37
    .line 38
    sub-float/2addr v2, v0

    .line 39
    iget-object v0, p0, Lt9/b;->t:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Lq9/b;->E()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sub-float/2addr v3, v2

    .line 50
    const/4 v4, 0x2

    .line 51
    int-to-float v4, v4

    .line 52
    div-float/2addr v3, v4

    .line 53
    const/high16 v5, 0x41b80000    # 23.0f

    .line 54
    .line 55
    add-float/2addr v1, v5

    .line 56
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Lq9/b;->E()F

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    sub-float/2addr v6, v2

    .line 65
    div-float/2addr v6, v4

    .line 66
    add-float/2addr v6, v2

    .line 67
    invoke-virtual {v0, v5, v3, v1, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lt9/b;->u:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 11
    .line 12
    sget-object v1, Ls9/c$d;->c:Ls9/c$d;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object v1, Ls9/c$e;->c:Ls9/c$e;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v1, Ls9/c$a;->c:Ls9/c$a;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final U(Z)V
    .locals 7

    .line 1
    iput-boolean p1, p0, Lt9/b;->u:Z

    .line 2
    .line 3
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    :goto_0
    const/4 v5, -0x1

    .line 13
    if-ge v4, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    add-int/lit8 v4, v4, 0x1

    .line 20
    .line 21
    check-cast v6, Ls9/c;

    .line 22
    .line 23
    instance-of v6, v6, Ls9/c$d;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v5

    .line 32
    :goto_1
    if-eq v3, v5, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v1, Ls9/c$d;->c:Ls9/c$d;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    move v3, v2

    .line 55
    move v4, v3

    .line 56
    :goto_2
    if-ge v4, v1, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    check-cast v6, Ls9/c;

    .line 65
    .line 66
    instance-of v6, v6, Ls9/c$e;

    .line 67
    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    move v3, v5

    .line 75
    :goto_3
    if-eq v3, v5, :cond_6

    .line 76
    .line 77
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_6
    if-nez p1, :cond_7

    .line 83
    .line 84
    iget-object p1, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 85
    .line 86
    sget-object v0, Ls9/c$e;->c:Ls9/c$e;

    .line 87
    .line 88
    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_7
    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/b;->s:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lt9/b;->t:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x42380000    # 46.0f

    .line 8
    .line 9
    add-float/2addr v0, v1

    .line 10
    new-instance v1, Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {p0}, Lt9/a;->d()Lq9/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lq9/b;->E()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, v3, v3, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public w(FF)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lt9/a;->w(FF)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lt9/a;->e()Ls9/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p1, p1, Ls9/b$d;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p1, p2}, Lv9/c;->p(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lt9/a;->l()Lv9/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Lv9/c;->e()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0}, Lt9/a;->r()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-interface {p1, p2, v0, v1}, Lr9/b;->o(Ljava/util/List;J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lt9/a;->n()Lr9/b;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Lr9/b;->l()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lt9/b;->H()V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x1

    .line 61
    return p1
.end method
